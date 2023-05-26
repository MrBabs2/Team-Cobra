package p015cm.aptoide.p016pt.root.execution;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;
import p015cm.aptoide.p016pt.root.RootShell;

/* renamed from: cm.aptoide.pt.root.execution.Command */
public class Command {
    String[] command = new String[0];
    protected Context context = null;
    boolean executing = false;
    ExecutionMonitor executionMonitor = null;
    int exitCode = -1;
    boolean finished = false;
    boolean handlerEnabled = true;

    /* renamed from: id */
    int f7066id = 0;
    protected boolean javaCommand = false;
    Handler mHandler = null;
    boolean terminated = false;
    int timeout = RootShell.defaultCommandTimeout;
    public int totalOutput = 0;
    public int totalOutputProcessed = 0;
    protected boolean used = false;

    /* renamed from: cm.aptoide.pt.root.execution.Command$CommandHandler */
    private class CommandHandler extends Handler {
        public static final String ACTION = "action";
        public static final int COMMAND_COMPLETED = 2;
        public static final int COMMAND_OUTPUT = 1;
        public static final int COMMAND_TERMINATED = 3;
        public static final String TEXT = "text";

        private CommandHandler() {
        }

        public final void handleMessage(Message message) {
            int i = message.getData().getInt("action");
            String string = message.getData().getString(TEXT);
            if (i == 1) {
                Command command = Command.this;
                command.commandOutput(command.f7066id, string);
            } else if (i == 2) {
                Command command2 = Command.this;
                command2.commandCompleted(command2.f7066id, command2.exitCode);
            } else if (i == 3) {
                Command command3 = Command.this;
                command3.commandTerminated(command3.f7066id, string);
            }
        }
    }

    /* renamed from: cm.aptoide.pt.root.execution.Command$ExecutionMonitor */
    private class ExecutionMonitor extends Thread {
        private final Command command;

        public ExecutionMonitor(Command command2) {
            this.command = command2;
        }

        public void run() {
            Command command2 = this.command;
            if (command2.timeout > 0) {
                synchronized (command2) {
                    try {
                        RootShell.log("Command " + this.command.f7066id + " is waiting for: " + this.command.timeout);
                        this.command.wait((long) this.command.timeout);
                    } catch (InterruptedException e) {
                        RootShell.log("Exception: " + e);
                    }
                    if (!this.command.isFinished()) {
                        RootShell.log("Timeout Exception has occurred for command: " + this.command.f7066id + ".");
                        Command.this.terminate(RootCommandOnSubscribe.TIMEOUT_EXCEPTION);
                    }
                }
            }
        }
    }

    public Command(int i, String... strArr) {
        this.command = strArr;
        this.f7066id = i;
        createHandler(RootShell.handlerEnabled);
    }

    private void createHandler(boolean z) {
        this.handlerEnabled = z;
        if (Looper.myLooper() == null || !z) {
            RootShell.log("CommandHandler not created");
            return;
        }
        RootShell.log("CommandHandler created");
        this.mHandler = new CommandHandler();
    }

    public void commandCompleted(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public final void commandFinished() {
        if (!this.terminated) {
            synchronized (this) {
                if (this.mHandler == null || !this.handlerEnabled) {
                    commandCompleted(this.f7066id, this.exitCode);
                } else {
                    Message obtainMessage = this.mHandler.obtainMessage();
                    Bundle bundle = new Bundle();
                    bundle.putInt("action", 2);
                    obtainMessage.setData(bundle);
                    this.mHandler.sendMessage(obtainMessage);
                }
                RootShell.log("Command " + this.f7066id + " finished.");
                finishCommand();
            }
        }
    }

    public void commandOutput(int i, String str) {
        RootShell.log("Command", "ID: " + i + ", " + str);
        this.totalOutputProcessed = this.totalOutputProcessed + 1;
    }

    public void commandTerminated(int i, String str) {
    }

    public final void finish() {
        RootShell.log("Command finished at users request!");
        commandFinished();
    }

    /* access modifiers changed from: protected */
    public final void finishCommand() {
        this.executing = false;
        this.finished = true;
        notifyAll();
    }

    public final String getCommand() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.command.length; i++) {
            if (i > 0) {
                sb.append(10);
            }
            sb.append(this.command[i]);
        }
        return sb.toString();
    }

    public final int getExitCode() {
        return this.exitCode;
    }

    public final boolean isExecuting() {
        return this.executing;
    }

    public final boolean isFinished() {
        return this.finished;
    }

    public final boolean isHandlerEnabled() {
        return this.handlerEnabled;
    }

    /* access modifiers changed from: protected */
    public final void output(int i, String str) {
        this.totalOutput++;
        Handler handler = this.mHandler;
        if (handler == null || !this.handlerEnabled) {
            commandOutput(i, str);
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putInt("action", 1);
        bundle.putString(CommandHandler.TEXT, str);
        obtainMessage.setData(bundle);
        this.mHandler.sendMessage(obtainMessage);
    }

    /* access modifiers changed from: protected */
    public final void setExitCode(int i) {
        synchronized (this) {
            this.exitCode = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void startExecution() {
        this.used = true;
        ExecutionMonitor executionMonitor2 = new ExecutionMonitor(this);
        this.executionMonitor = executionMonitor2;
        executionMonitor2.setPriority(1);
        this.executionMonitor.start();
        this.executing = true;
    }

    public final void terminate() {
        RootShell.log("Terminating command at users request!");
        terminated("Terminated at users request!");
    }

    /* access modifiers changed from: protected */
    public final void terminated(String str) {
        synchronized (this) {
            if (this.mHandler == null || !this.handlerEnabled) {
                commandTerminated(this.f7066id, str);
            } else {
                Message obtainMessage = this.mHandler.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putInt("action", 3);
                bundle.putString(CommandHandler.TEXT, str);
                obtainMessage.setData(bundle);
                this.mHandler.sendMessage(obtainMessage);
            }
            RootShell.log("Command " + this.f7066id + " did not finish because it was terminated. Termination reason: " + str);
            setExitCode(-1);
            this.terminated = true;
            finishCommand();
        }
    }

    /* access modifiers changed from: protected */
    public final void terminate(String str) {
        try {
            Shell.closeAll();
            RootShell.log("Terminating all shells.");
            terminated(str);
        } catch (IOException unused) {
        }
    }

    public Command(int i, boolean z, String... strArr) {
        this.command = strArr;
        this.f7066id = i;
        createHandler(z);
    }

    public Command(int i, int i2, String... strArr) {
        this.command = strArr;
        this.f7066id = i;
        this.timeout = i2;
        createHandler(RootShell.handlerEnabled);
    }
}
