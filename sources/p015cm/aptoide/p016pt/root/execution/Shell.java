package p015cm.aptoide.p016pt.root.execution;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.root.RootShell;
import p015cm.aptoide.p016pt.root.exceptions.RootDeniedException;

/* renamed from: cm.aptoide.pt.root.execution.Shell */
public class Shell {
    private static Shell customShell = null;
    public static ShellContext defaultContext = ShellContext.NORMAL;
    private static Shell rootShell = null;
    private static Shell shell = null;
    private static String[] suVersion = {null, null};
    private static final String token = "F*D^W@#FGF";
    /* access modifiers changed from: private */
    public boolean close = false;
    /* access modifiers changed from: private */
    public final List<Command> commands = new ArrayList();
    /* access modifiers changed from: private */
    public String error = "";
    /* access modifiers changed from: private */
    public final BufferedReader errorStream;
    private Runnable input = new Runnable() {
        public void run() {
            while (true) {
                try {
                    synchronized (Shell.this.commands) {
                        while (!Shell.this.close && Shell.this.write >= Shell.this.commands.size()) {
                            Shell.this.isExecuting = false;
                            Shell.this.commands.wait();
                        }
                    }
                    if (Shell.this.write >= Shell.this.maxCommands) {
                        while (Shell.this.read != Shell.this.write) {
                            RootShell.log("Waiting for read and write to catch up before cleanup.");
                        }
                        Shell.this.cleanCommands();
                    }
                    if (Shell.this.write < Shell.this.commands.size()) {
                        Shell.this.isExecuting = true;
                        Command command = (Command) Shell.this.commands.get(Shell.this.write);
                        command.startExecution();
                        RootShell.log("Executing: " + command.getCommand() + " with context: " + Shell.this.shellContext);
                        Shell.this.outputStream.write(command.getCommand());
                        Shell.this.outputStream.flush();
                        Shell.this.outputStream.write("\necho F*D^W@#FGF " + Shell.this.totalExecuted + " $?\n");
                        Shell.this.outputStream.flush();
                        Shell.access$208(Shell.this);
                        Shell.access$808(Shell.this);
                    } else if (Shell.this.close) {
                        Shell.this.isExecuting = false;
                        Shell.this.outputStream.write("\nexit 0\n");
                        Shell.this.outputStream.flush();
                        RootShell.log("Closing shell");
                        int unused = Shell.this.write = 0;
                        Shell shell = Shell.this;
                        shell.closeQuietly((Writer) shell.outputStream);
                        return;
                    }
                } catch (IOException | InterruptedException e) {
                    try {
                        RootShell.log(e.getMessage(), RootShell.LogLevel.ERROR, e);
                        return;
                    } finally {
                        int unused2 = Shell.this.write = 0;
                        Shell shell2 = Shell.this;
                        shell2.closeQuietly((Writer) shell2.outputStream);
                    }
                }
            }
            while (true) {
            }
        }
    };
    /* access modifiers changed from: private */
    public final BufferedReader inputStream;
    private boolean isCleaning = false;
    public boolean isClosed = false;
    public boolean isExecuting = false;
    public boolean isReading = false;
    private Boolean isSELinuxEnforcing = null;
    /* access modifiers changed from: private */
    public int maxCommands = 5000;
    private Runnable output = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            p015cm.aptoide.p016pt.root.execution.Shell.access$1200(r9.this$0).waitFor();
            p015cm.aptoide.p016pt.root.execution.Shell.access$1200(r9.this$0).destroy();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
            if (p015cm.aptoide.p016pt.root.execution.Shell.access$400(r9.this$0) < p015cm.aptoide.p016pt.root.execution.Shell.access$000(r9.this$0).size()) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
            if (r1 == null) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
            r1 = (p015cm.aptoide.p016pt.root.execution.Command) p015cm.aptoide.p016pt.root.execution.Shell.access$000(r9.this$0).get(p015cm.aptoide.p016pt.root.execution.Shell.access$400(r9.this$0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
            if (r1.totalOutput < r1.totalOutputProcessed) goto L_0x0099;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
            r1.terminated("All output not processed!");
            r1.terminated("Did you forget the super.commandOutput call or are you waiting on the command object?");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
            r1.terminated("Unexpected Termination.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
            p015cm.aptoide.p016pt.root.execution.Shell.access$408(r9.this$0);
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
            p015cm.aptoide.p016pt.root.execution.Shell.access$402(r9.this$0, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0121, code lost:
            r9.this$0.processErrors(r1);
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x012b, code lost:
            if (r1.totalOutput <= r1.totalOutputProcessed) goto L_0x0165;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
            if (r4 != 0) goto L_0x0151;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x012f, code lost:
            r4 = r4 + 1;
            p015cm.aptoide.p016pt.root.RootShell.log("Waiting for output to be processed. " + r1.totalOutputProcessed + " Of " + r1.totalOutput);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
            wait(2000);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0157, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x015c, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            p015cm.aptoide.p016pt.root.RootShell.log(r5.getMessage());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0119 */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0121 A[EDGE_INSN: B:81:0x0121->B:51:0x0121 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0002 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                r0 = 0
            L_0x0001:
                r1 = r0
            L_0x0002:
                r2 = 1
                r3 = 0
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                boolean r4 = r4.close     // Catch:{ IOException -> 0x017e }
                if (r4 == 0) goto L_0x002a
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                java.io.BufferedReader r4 = r4.inputStream     // Catch:{ IOException -> 0x017e }
                boolean r4 = r4.ready()     // Catch:{ IOException -> 0x017e }
                if (r4 != 0) goto L_0x002a
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                int r4 = r4.read     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Shell r5 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                java.util.List r5 = r5.commands     // Catch:{ IOException -> 0x017e }
                int r5 = r5.size()     // Catch:{ IOException -> 0x017e }
                if (r4 >= r5) goto L_0x005b
            L_0x002a:
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                r4.isReading = r3     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                java.io.BufferedReader r4 = r4.inputStream     // Catch:{ IOException -> 0x017e }
                java.lang.String r4 = r4.readLine()     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Shell r5 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                r5.isReading = r2     // Catch:{ IOException -> 0x017e }
                if (r4 != 0) goto L_0x003f
                goto L_0x005b
            L_0x003f:
                if (r1 != 0) goto L_0x00c9
                cm.aptoide.pt.root.execution.Shell r5 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                int r5 = r5.read     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Shell r6 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                java.util.List r6 = r6.commands     // Catch:{ IOException -> 0x017e }
                int r6 = r6.size()     // Catch:{ IOException -> 0x017e }
                if (r5 < r6) goto L_0x00b7
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                boolean r4 = r4.close     // Catch:{ IOException -> 0x017e }
                if (r4 == 0) goto L_0x0002
            L_0x005b:
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ Exception -> 0x006d }
                java.lang.Process r4 = r4.proc     // Catch:{ Exception -> 0x006d }
                r4.waitFor()     // Catch:{ Exception -> 0x006d }
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ Exception -> 0x006d }
                java.lang.Process r4 = r4.proc     // Catch:{ Exception -> 0x006d }
                r4.destroy()     // Catch:{ Exception -> 0x006d }
            L_0x006d:
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                int r4 = r4.read     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Shell r5 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                java.util.List r5 = r5.commands     // Catch:{ IOException -> 0x017e }
                int r5 = r5.size()     // Catch:{ IOException -> 0x017e }
                if (r4 >= r5) goto L_0x00b0
                if (r1 != 0) goto L_0x0093
                cm.aptoide.pt.root.execution.Shell r1 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                java.util.List r1 = r1.commands     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                int r4 = r4.read     // Catch:{ IOException -> 0x017e }
                java.lang.Object r1 = r1.get(r4)     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Command r1 = (p015cm.aptoide.p016pt.root.execution.Command) r1     // Catch:{ IOException -> 0x017e }
            L_0x0093:
                int r4 = r1.totalOutput     // Catch:{ IOException -> 0x017e }
                int r5 = r1.totalOutputProcessed     // Catch:{ IOException -> 0x017e }
                if (r4 >= r5) goto L_0x00a4
                java.lang.String r4 = "All output not processed!"
                r1.terminated(r4)     // Catch:{ IOException -> 0x017e }
                java.lang.String r4 = "Did you forget the super.commandOutput call or are you waiting on the command object?"
                r1.terminated(r4)     // Catch:{ IOException -> 0x017e }
                goto L_0x00a9
            L_0x00a4:
                java.lang.String r4 = "Unexpected Termination."
                r1.terminated(r4)     // Catch:{ IOException -> 0x017e }
            L_0x00a9:
                cm.aptoide.pt.root.execution.Shell r1 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                p015cm.aptoide.p016pt.root.execution.Shell.access$408(r1)     // Catch:{ IOException -> 0x017e }
                r1 = r0
                goto L_0x006d
            L_0x00b0:
                cm.aptoide.pt.root.execution.Shell r0 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                int unused = r0.read = r3     // Catch:{ IOException -> 0x017e }
                goto L_0x0188
            L_0x00b7:
                cm.aptoide.pt.root.execution.Shell r1 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                java.util.List r1 = r1.commands     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Shell r5 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                int r5 = r5.read     // Catch:{ IOException -> 0x017e }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Command r1 = (p015cm.aptoide.p016pt.root.execution.Command) r1     // Catch:{ IOException -> 0x017e }
            L_0x00c9:
                java.lang.String r5 = "F*D^W@#FGF"
                int r5 = r4.indexOf(r5)     // Catch:{ IOException -> 0x017e }
                r6 = -1
                if (r5 != r6) goto L_0x00d8
                int r7 = r1.f7066id     // Catch:{ IOException -> 0x017e }
                r1.output(r7, r4)     // Catch:{ IOException -> 0x017e }
                goto L_0x00f7
            L_0x00d8:
                if (r5 <= 0) goto L_0x00f7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017e }
                r7.<init>()     // Catch:{ IOException -> 0x017e }
                java.lang.String r8 = "Found token, line: "
                r7.append(r8)     // Catch:{ IOException -> 0x017e }
                r7.append(r4)     // Catch:{ IOException -> 0x017e }
                java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x017e }
                p015cm.aptoide.p016pt.root.RootShell.log(r7)     // Catch:{ IOException -> 0x017e }
                int r7 = r1.f7066id     // Catch:{ IOException -> 0x017e }
                java.lang.String r8 = r4.substring(r3, r5)     // Catch:{ IOException -> 0x017e }
                r1.output(r7, r8)     // Catch:{ IOException -> 0x017e }
            L_0x00f7:
                if (r5 < 0) goto L_0x0002
                java.lang.String r4 = r4.substring(r5)     // Catch:{ IOException -> 0x017e }
                java.lang.String r5 = " "
                java.lang.String[] r4 = r4.split(r5)     // Catch:{ IOException -> 0x017e }
                int r5 = r4.length     // Catch:{ IOException -> 0x017e }
                r7 = 2
                if (r5 < r7) goto L_0x0002
                r5 = r4[r2]     // Catch:{ IOException -> 0x017e }
                if (r5 == 0) goto L_0x0002
                r5 = r4[r2]     // Catch:{ NumberFormatException -> 0x0112 }
                int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0112 }
                goto L_0x0113
            L_0x0112:
                r5 = 0
            L_0x0113:
                r4 = r4[r7]     // Catch:{ NumberFormatException -> 0x0119 }
                int r6 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0119 }
            L_0x0119:
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                int r4 = r4.totalRead     // Catch:{ IOException -> 0x017e }
                if (r5 != r4) goto L_0x0002
                cm.aptoide.pt.root.execution.Shell r4 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                r4.processErrors(r1)     // Catch:{ IOException -> 0x017e }
                r4 = 0
            L_0x0127:
                int r5 = r1.totalOutput     // Catch:{ IOException -> 0x017e }
                int r7 = r1.totalOutputProcessed     // Catch:{ IOException -> 0x017e }
                if (r5 <= r7) goto L_0x0165
                if (r4 != 0) goto L_0x0151
                int r4 = r4 + 1
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017e }
                r5.<init>()     // Catch:{ IOException -> 0x017e }
                java.lang.String r7 = "Waiting for output to be processed. "
                r5.append(r7)     // Catch:{ IOException -> 0x017e }
                int r7 = r1.totalOutputProcessed     // Catch:{ IOException -> 0x017e }
                r5.append(r7)     // Catch:{ IOException -> 0x017e }
                java.lang.String r7 = " Of "
                r5.append(r7)     // Catch:{ IOException -> 0x017e }
                int r7 = r1.totalOutput     // Catch:{ IOException -> 0x017e }
                r5.append(r7)     // Catch:{ IOException -> 0x017e }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x017e }
                p015cm.aptoide.p016pt.root.RootShell.log(r5)     // Catch:{ IOException -> 0x017e }
            L_0x0151:
                monitor-enter(r9)     // Catch:{ Exception -> 0x015c }
                r7 = 2000(0x7d0, double:9.88E-321)
                r9.wait(r7)     // Catch:{ all -> 0x0159 }
                monitor-exit(r9)     // Catch:{ all -> 0x0159 }
                goto L_0x0127
            L_0x0159:
                r5 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x0159 }
                throw r5     // Catch:{ Exception -> 0x015c }
            L_0x015c:
                r5 = move-exception
                java.lang.String r5 = r5.getMessage()     // Catch:{ IOException -> 0x017e }
                p015cm.aptoide.p016pt.root.RootShell.log(r5)     // Catch:{ IOException -> 0x017e }
                goto L_0x0127
            L_0x0165:
                java.lang.String r4 = "Read all output"
                p015cm.aptoide.p016pt.root.RootShell.log(r4)     // Catch:{ IOException -> 0x017e }
                r1.setExitCode(r6)     // Catch:{ IOException -> 0x017e }
                r1.commandFinished()     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Shell r1 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                p015cm.aptoide.p016pt.root.execution.Shell.access$408(r1)     // Catch:{ IOException -> 0x017e }
                cm.aptoide.pt.root.execution.Shell r1 = p015cm.aptoide.p016pt.root.execution.Shell.this     // Catch:{ IOException -> 0x017e }
                p015cm.aptoide.p016pt.root.execution.Shell.access$1108(r1)     // Catch:{ IOException -> 0x017e }
                goto L_0x0001
            L_0x017c:
                r0 = move-exception
                goto L_0x01af
            L_0x017e:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x017c }
                cm.aptoide.pt.root.RootShell$LogLevel r4 = p015cm.aptoide.p016pt.root.RootShell.LogLevel.ERROR     // Catch:{ all -> 0x017c }
                p015cm.aptoide.p016pt.root.RootShell.log(r1, r4, r0)     // Catch:{ all -> 0x017c }
            L_0x0188:
                cm.aptoide.pt.root.execution.Shell r0 = p015cm.aptoide.p016pt.root.execution.Shell.this
                java.io.OutputStreamWriter r1 = r0.outputStream
                r0.closeQuietly((java.io.Writer) r1)
                cm.aptoide.pt.root.execution.Shell r0 = p015cm.aptoide.p016pt.root.execution.Shell.this
                java.io.BufferedReader r1 = r0.errorStream
                r0.closeQuietly((java.io.Reader) r1)
                cm.aptoide.pt.root.execution.Shell r0 = p015cm.aptoide.p016pt.root.execution.Shell.this
                java.io.BufferedReader r1 = r0.inputStream
                r0.closeQuietly((java.io.Reader) r1)
                java.lang.String r0 = "Shell destroyed"
                p015cm.aptoide.p016pt.root.RootShell.log(r0)
                cm.aptoide.pt.root.execution.Shell r0 = p015cm.aptoide.p016pt.root.execution.Shell.this
                r0.isClosed = r2
                r0.isReading = r3
                return
            L_0x01af:
                cm.aptoide.pt.root.execution.Shell r1 = p015cm.aptoide.p016pt.root.execution.Shell.this
                java.io.OutputStreamWriter r4 = r1.outputStream
                r1.closeQuietly((java.io.Writer) r4)
                cm.aptoide.pt.root.execution.Shell r1 = p015cm.aptoide.p016pt.root.execution.Shell.this
                java.io.BufferedReader r4 = r1.errorStream
                r1.closeQuietly((java.io.Reader) r4)
                cm.aptoide.pt.root.execution.Shell r1 = p015cm.aptoide.p016pt.root.execution.Shell.this
                java.io.BufferedReader r4 = r1.inputStream
                r1.closeQuietly((java.io.Reader) r4)
                java.lang.String r1 = "Shell destroyed"
                p015cm.aptoide.p016pt.root.RootShell.log(r1)
                cm.aptoide.pt.root.execution.Shell r1 = p015cm.aptoide.p016pt.root.execution.Shell.this
                r1.isClosed = r2
                r1.isReading = r3
                goto L_0x01d7
            L_0x01d6:
                throw r0
            L_0x01d7:
                goto L_0x01d6
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.root.execution.Shell.C39842.run():void");
        }
    };
    /* access modifiers changed from: private */
    public final OutputStreamWriter outputStream;
    /* access modifiers changed from: private */
    public final Process proc;
    /* access modifiers changed from: private */
    public int read = 0;
    /* access modifiers changed from: private */
    public ShellContext shellContext = ShellContext.NORMAL;
    private int shellTimeout = 25000;
    private ShellType shellType = null;
    /* access modifiers changed from: private */
    public int totalExecuted = 0;
    /* access modifiers changed from: private */
    public int totalRead = 0;
    /* access modifiers changed from: private */
    public int write = 0;

    /* renamed from: cm.aptoide.pt.root.execution.Shell$ShellContext */
    public enum ShellContext {
        NORMAL("normal"),
        SHELL("u:r:shell:s0"),
        SYSTEM_SERVER("u:r:system_server:s0"),
        SYSTEM_APP("u:r:system_app:s0"),
        PLATFORM_APP("u:r:platform_app:s0"),
        UNTRUSTED_APP("u:r:untrusted_app:s0"),
        RECOVERY("u:r:recovery:s0");
        
        private String value;

        private ShellContext(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    /* renamed from: cm.aptoide.pt.root.execution.Shell$ShellType */
    public enum ShellType {
        NORMAL,
        ROOT,
        CUSTOM
    }

    /* renamed from: cm.aptoide.pt.root.execution.Shell$Worker */
    protected static class Worker extends Thread {
        public int exit;
        public Shell shell;

        private void setShellOom() {
            Field field;
            try {
                Class<?> cls = this.shell.proc.getClass();
                try {
                    field = cls.getDeclaredField("pid");
                } catch (NoSuchFieldException unused) {
                    field = cls.getDeclaredField(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
                }
                field.setAccessible(true);
                int intValue = ((Integer) field.get(this.shell.proc)).intValue();
                OutputStreamWriter access$700 = this.shell.outputStream;
                access$700.write("(echo -17 > /proc/" + intValue + "/oom_adj) &> /dev/null\n");
                this.shell.outputStream.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
                this.shell.outputStream.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run() {
            try {
                this.shell.outputStream.write("echo Started\n");
                this.shell.outputStream.flush();
                while (true) {
                    String readLine = this.shell.inputStream.readLine();
                    if (readLine == null) {
                        throw new EOFException();
                    } else if (!"".equals(readLine)) {
                        if ("Started".equals(readLine)) {
                            this.exit = 1;
                            setShellOom();
                            return;
                        }
                        String unused = this.shell.error = "unknown error occurred.";
                    }
                }
            } catch (IOException e) {
                this.exit = -42;
                if (e.getMessage() != null) {
                    String unused2 = this.shell.error = e.getMessage();
                } else {
                    String unused3 = this.shell.error = "RootAccess denied?.";
                }
            }
        }

        private Worker(Shell shell2) {
            this.exit = -911;
            this.shell = shell2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|31|32|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x019e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x01ba */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x01ba=Splitter:B:32:0x01ba, B:27:0x019e=Splitter:B:27:0x019e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Shell(java.lang.String r5, p015cm.aptoide.p016pt.root.execution.Shell.ShellType r6, p015cm.aptoide.p016pt.root.execution.Shell.ShellContext r7, int r8) throws java.io.IOException, java.util.concurrent.TimeoutException, p015cm.aptoide.p016pt.root.exceptions.RootDeniedException {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.commands = r0
            r0 = 0
            r4.isExecuting = r0
            r4.isReading = r0
            r4.isClosed = r0
            r1 = 25000(0x61a8, float:3.5032E-41)
            r4.shellTimeout = r1
            r1 = 0
            r4.shellType = r1
            cm.aptoide.pt.root.execution.Shell$ShellContext r2 = p015cm.aptoide.p016pt.root.execution.Shell.ShellContext.NORMAL
            r4.shellContext = r2
            java.lang.String r2 = ""
            r4.error = r2
            r4.close = r0
            r4.isSELinuxEnforcing = r1
            r2 = 5000(0x1388, float:7.006E-42)
            r4.maxCommands = r2
            r4.read = r0
            r4.write = r0
            r4.totalExecuted = r0
            r4.totalRead = r0
            r4.isCleaning = r0
            cm.aptoide.pt.root.execution.Shell$1 r2 = new cm.aptoide.pt.root.execution.Shell$1
            r2.<init>()
            r4.input = r2
            cm.aptoide.pt.root.execution.Shell$2 r2 = new cm.aptoide.pt.root.execution.Shell$2
            r2.<init>()
            r4.output = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Starting shell: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            p015cm.aptoide.p016pt.root.RootShell.log(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Context: "
            r2.append(r3)
            java.lang.String r3 = r7.getValue()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            p015cm.aptoide.p016pt.root.RootShell.log(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Timeout: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            p015cm.aptoide.p016pt.root.RootShell.log(r2)
            r4.shellType = r6
            if (r8 <= 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            int r8 = r4.shellTimeout
        L_0x0087:
            r4.shellTimeout = r8
            r4.shellContext = r7
            cm.aptoide.pt.root.execution.Shell$ShellContext r6 = p015cm.aptoide.p016pt.root.execution.Shell.ShellContext.NORMAL
            if (r7 != r6) goto L_0x009b
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            java.lang.Process r5 = r6.exec(r5)
            r4.proc = r5
            goto L_0x012c
        L_0x009b:
            java.lang.String r6 = r4.getSuVersion(r0)
            r7 = 1
            java.lang.String r7 = r4.getSuVersion(r7)
            boolean r8 = r4.isSELinuxEnforcing()
            if (r8 == 0) goto L_0x00dd
            if (r6 == 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00dd
            java.lang.String r8 = "SUPERSU"
            boolean r8 = r6.endsWith(r8)
            if (r8 == 0) goto L_0x00dd
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            int r8 = r8.intValue()
            r0 = 190(0xbe, float:2.66E-43)
            if (r8 < r0) goto L_0x00dd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " --context "
            r6.append(r5)
            cm.aptoide.pt.root.execution.Shell$ShellContext r5 = r4.shellContext
            java.lang.String r5 = r5.getValue()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x0122
        L_0x00dd:
            java.lang.String r8 = "Su binary --context switch not supported!"
            p015cm.aptoide.p016pt.root.RootShell.log(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Su binary display version: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            p015cm.aptoide.p016pt.root.RootShell.log(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Su binary internal version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            p015cm.aptoide.p016pt.root.RootShell.log(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "SELinuxEnforcing: "
            r6.append(r7)
            boolean r7 = r4.isSELinuxEnforcing()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            p015cm.aptoide.p016pt.root.RootShell.log(r6)
        L_0x0122:
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            java.lang.Process r5 = r6.exec(r5)
            r4.proc = r5
        L_0x012c:
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r6 = new java.io.InputStreamReader
            java.lang.Process r7 = r4.proc
            java.io.InputStream r7 = r7.getInputStream()
            java.lang.String r8 = "UTF-8"
            r6.<init>(r7, r8)
            r5.<init>(r6)
            r4.inputStream = r5
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r6 = new java.io.InputStreamReader
            java.lang.Process r7 = r4.proc
            java.io.InputStream r7 = r7.getErrorStream()
            r6.<init>(r7, r8)
            r5.<init>(r6)
            r4.errorStream = r5
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter
            java.lang.Process r6 = r4.proc
            java.io.OutputStream r6 = r6.getOutputStream()
            r5.<init>(r6, r8)
            r4.outputStream = r5
            cm.aptoide.pt.root.execution.Shell$Worker r5 = new cm.aptoide.pt.root.execution.Shell$Worker
            r5.<init>()
            r5.start()
            int r6 = r4.shellTimeout     // Catch:{ InterruptedException -> 0x01d1 }
            long r6 = (long) r6     // Catch:{ InterruptedException -> 0x01d1 }
            r5.join(r6)     // Catch:{ InterruptedException -> 0x01d1 }
            int r6 = r5.exit     // Catch:{ InterruptedException -> 0x01d1 }
            r7 = -911(0xfffffffffffffc71, float:NaN)
            if (r6 == r7) goto L_0x01b5
            int r6 = r5.exit     // Catch:{ InterruptedException -> 0x01d1 }
            r7 = -42
            if (r6 == r7) goto L_0x0199
            java.lang.Thread r6 = new java.lang.Thread     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.Runnable r7 = r4.input     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.String r8 = "Shell Input"
            r6.<init>(r7, r8)     // Catch:{ InterruptedException -> 0x01d1 }
            r7 = 5
            r6.setPriority(r7)     // Catch:{ InterruptedException -> 0x01d1 }
            r6.start()     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.Thread r6 = new java.lang.Thread     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.Runnable r8 = r4.output     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.String r0 = "Shell Output"
            r6.<init>(r8, r0)     // Catch:{ InterruptedException -> 0x01d1 }
            r6.setPriority(r7)     // Catch:{ InterruptedException -> 0x01d1 }
            r6.start()     // Catch:{ InterruptedException -> 0x01d1 }
            return
        L_0x0199:
            java.lang.Process r6 = r4.proc     // Catch:{ Exception -> 0x019e }
            r6.destroy()     // Catch:{ Exception -> 0x019e }
        L_0x019e:
            java.io.BufferedReader r6 = r4.inputStream     // Catch:{ InterruptedException -> 0x01d1 }
            r4.closeQuietly((java.io.Reader) r6)     // Catch:{ InterruptedException -> 0x01d1 }
            java.io.BufferedReader r6 = r4.errorStream     // Catch:{ InterruptedException -> 0x01d1 }
            r4.closeQuietly((java.io.Reader) r6)     // Catch:{ InterruptedException -> 0x01d1 }
            java.io.OutputStreamWriter r6 = r4.outputStream     // Catch:{ InterruptedException -> 0x01d1 }
            r4.closeQuietly((java.io.Writer) r6)     // Catch:{ InterruptedException -> 0x01d1 }
            cm.aptoide.pt.root.exceptions.RootDeniedException r6 = new cm.aptoide.pt.root.exceptions.RootDeniedException     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.String r7 = "Root Access Denied"
            r6.<init>(r7)     // Catch:{ InterruptedException -> 0x01d1 }
            throw r6     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x01b5:
            java.lang.Process r6 = r4.proc     // Catch:{ Exception -> 0x01ba }
            r6.destroy()     // Catch:{ Exception -> 0x01ba }
        L_0x01ba:
            java.io.BufferedReader r6 = r4.inputStream     // Catch:{ InterruptedException -> 0x01d1 }
            r4.closeQuietly((java.io.Reader) r6)     // Catch:{ InterruptedException -> 0x01d1 }
            java.io.BufferedReader r6 = r4.errorStream     // Catch:{ InterruptedException -> 0x01d1 }
            r4.closeQuietly((java.io.Reader) r6)     // Catch:{ InterruptedException -> 0x01d1 }
            java.io.OutputStreamWriter r6 = r4.outputStream     // Catch:{ InterruptedException -> 0x01d1 }
            r4.closeQuietly((java.io.Writer) r6)     // Catch:{ InterruptedException -> 0x01d1 }
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x01d1 }
            java.lang.String r7 = r4.error     // Catch:{ InterruptedException -> 0x01d1 }
            r6.<init>(r7)     // Catch:{ InterruptedException -> 0x01d1 }
            throw r6     // Catch:{ InterruptedException -> 0x01d1 }
        L_0x01d1:
            r5.interrupt()
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            java.util.concurrent.TimeoutException r5 = new java.util.concurrent.TimeoutException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.root.execution.Shell.<init>(java.lang.String, cm.aptoide.pt.root.execution.Shell$ShellType, cm.aptoide.pt.root.execution.Shell$ShellContext, int):void");
    }

    static /* synthetic */ int access$1108(Shell shell2) {
        int i = shell2.totalRead;
        shell2.totalRead = i + 1;
        return i;
    }

    static /* synthetic */ int access$208(Shell shell2) {
        int i = shell2.write;
        shell2.write = i + 1;
        return i;
    }

    static /* synthetic */ int access$408(Shell shell2) {
        int i = shell2.read;
        shell2.read = i + 1;
        return i;
    }

    static /* synthetic */ int access$808(Shell shell2) {
        int i = shell2.totalExecuted;
        shell2.totalExecuted = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public void cleanCommands() {
        this.isCleaning = true;
        int i = this.maxCommands;
        int abs = Math.abs(i - (i / 4));
        RootShell.log("Cleaning up: " + abs);
        for (int i2 = 0; i2 < abs; i2++) {
            this.commands.remove(0);
        }
        this.read = this.commands.size() - 1;
        this.write = this.commands.size() - 1;
        this.isCleaning = false;
    }

    public static void closeAll() throws IOException {
        RootShell.log("Request to close all shells!");
        closeShell();
        closeRootShell();
        closeCustomShell();
    }

    public static void closeCustomShell() throws IOException {
        RootShell.log("Request to close custom shell!");
        Shell shell2 = customShell;
        if (shell2 != null) {
            shell2.close();
        }
    }

    /* access modifiers changed from: private */
    public void closeQuietly(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void closeRootShell() throws IOException {
        RootShell.log("Request to close root shell!");
        Shell shell2 = rootShell;
        if (shell2 != null) {
            shell2.close();
        }
    }

    public static void closeShell() throws IOException {
        RootShell.log("Request to close normal shell!");
        Shell shell2 = shell;
        if (shell2 != null) {
            shell2.close();
        }
    }

    public static Shell getOpenShell() {
        Shell shell2 = customShell;
        if (shell2 != null) {
            return shell2;
        }
        Shell shell3 = rootShell;
        if (shell3 != null) {
            return shell3;
        }
        return shell;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:16|17|(1:19)|20|21|22|23|(3:24|(2:27|(2:29|(1:55)(2:56|53))(3:31|32|(1:54)(2:57|53)))(0)|35)|34|35|36) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c A[Catch:{ IOException -> 0x006f, InterruptedException -> 0x0069 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String getSuVersion(boolean r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L_0x0005
            r0 = 0
            goto L_0x0006
        L_0x0005:
            r0 = 1
        L_0x0006:
            java.lang.String[] r1 = suVersion     // Catch:{ all -> 0x007b }
            r1 = r1[r0]     // Catch:{ all -> 0x007b }
            if (r1 != 0) goto L_0x0075
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x006f, InterruptedException -> 0x0069 }
            if (r8 == 0) goto L_0x0016
            java.lang.String r3 = "su -V"
            goto L_0x0018
        L_0x0016:
            java.lang.String r3 = "su -v"
        L_0x0018:
            java.lang.Process r2 = r2.exec(r3, r1)     // Catch:{ IOException -> 0x006f, InterruptedException -> 0x0069 }
            r2.waitFor()     // Catch:{ IOException -> 0x006f, InterruptedException -> 0x0069 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x007b }
            r3.<init>()     // Catch:{ all -> 0x007b }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x007b }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x007b }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ all -> 0x007b }
            r5.<init>(r6)     // Catch:{ all -> 0x007b }
            r4.<init>(r5)     // Catch:{ all -> 0x007b }
        L_0x0032:
            java.lang.String r5 = r4.readLine()     // Catch:{ IOException -> 0x003c }
            if (r5 == 0) goto L_0x003c
            r3.add(r5)     // Catch:{ IOException -> 0x003c }
            goto L_0x0032
        L_0x003c:
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            r2.destroy()     // Catch:{ all -> 0x007b }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x007b }
        L_0x0046:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x007b }
            if (r8 != 0) goto L_0x005d
            java.lang.String r4 = "."
            boolean r4 = r3.contains(r4)     // Catch:{ all -> 0x007b }
            if (r4 == 0) goto L_0x0046
            goto L_0x0063
        L_0x005d:
            int r4 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0046 }
            if (r4 <= 0) goto L_0x0046
        L_0x0063:
            r1 = r3
        L_0x0064:
            java.lang.String[] r8 = suVersion     // Catch:{ all -> 0x007b }
            r8[r0] = r1     // Catch:{ all -> 0x007b }
            goto L_0x0075
        L_0x0069:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x007b }
            monitor-exit(r7)
            return r1
        L_0x006f:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x007b }
            monitor-exit(r7)
            return r1
        L_0x0075:
            java.lang.String[] r8 = suVersion     // Catch:{ all -> 0x007b }
            r8 = r8[r0]     // Catch:{ all -> 0x007b }
            monitor-exit(r7)
            return r8
        L_0x007b:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x007f
        L_0x007e:
            throw r8
        L_0x007f:
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.root.execution.Shell.getSuVersion(boolean):java.lang.String");
    }

    public static boolean isAnyShellOpen() {
        return (shell == null && rootShell == null && customShell == null) ? false : true;
    }

    public static boolean isCustomShellOpen() {
        return customShell == null;
    }

    public static boolean isRootShellOpen() {
        return rootShell == null;
    }

    public static boolean isShellOpen() {
        return shell == null;
    }

    public static Command runCommand(Command command) throws IOException, TimeoutException {
        return startShell().add(command);
    }

    public static Command runRootCommand(Command command) throws IOException, TimeoutException, RootDeniedException {
        return startRootShell().add(command);
    }

    public static Shell startCustomShell(String str) throws IOException, TimeoutException, RootDeniedException {
        return startCustomShell(str, 0);
    }

    public static Shell startRootShell() throws IOException, TimeoutException, RootDeniedException {
        return startRootShell(0, 3);
    }

    public static Shell startShell() throws IOException, TimeoutException {
        return startShell(0);
    }

    public Command add(Command command) throws IOException {
        if (this.close) {
            throw new IllegalStateException("Unable to add commands to a closed shell");
        } else if (!command.used) {
            do {
            } while (this.isCleaning);
            this.commands.add(command);
            notifyThreads();
            return command;
        } else {
            throw new IllegalStateException("This command has already been executed. (Don't re-use command instances.)");
        }
    }

    public void close() throws IOException {
        RootShell.log("Request to close shell!");
        int i = 0;
        while (this.isExecuting) {
            RootShell.log("Waiting on shell to finish executing before closing...");
            i++;
            if (i > 10000) {
                break;
            }
        }
        synchronized (this.commands) {
            this.close = true;
            notifyThreads();
        }
        RootShell.log("Shell Closed!");
        if (this == rootShell) {
            rootShell = null;
        } else if (this == shell) {
            shell = null;
        } else if (this == customShell) {
            customShell = null;
        }
    }

    public int getCommandQueuePosition(Command command) {
        return this.commands.indexOf(command);
    }

    public String getCommandQueuePositionString(Command command) {
        return "Command is in position " + getCommandQueuePosition(command) + " currently executing command at position " + this.write + " and the number of commands is " + this.commands.size();
    }

    public synchronized boolean isSELinuxEnforcing() {
        FileInputStream fileInputStream;
        if (this.isSELinuxEnforcing == null) {
            boolean z = null;
            if (Build.VERSION.SDK_INT >= 17) {
                boolean z2 = true;
                if (new File("/sys/fs/selinux/enforce").exists()) {
                    try {
                        fileInputStream = new FileInputStream("/sys/fs/selinux/enforce");
                        z = Boolean.valueOf(fileInputStream.read() == 49);
                        fileInputStream.close();
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                }
                if (z == null) {
                    if (Build.VERSION.SDK_INT < 19) {
                        z2 = false;
                    }
                    z = Boolean.valueOf(z2);
                }
            }
            if (z == null) {
                z = false;
            }
            this.isSELinuxEnforcing = z;
        }
        return this.isSELinuxEnforcing.booleanValue();
    }

    /* access modifiers changed from: protected */
    public void notifyThreads() {
        new Thread() {
            public void run() {
                synchronized (Shell.this.commands) {
                    Shell.this.commands.notifyAll();
                }
            }
        }.start();
    }

    public void processErrors(Command command) {
        while (this.errorStream.ready() && command != null) {
            try {
                String readLine = this.errorStream.readLine();
                if (readLine != null) {
                    command.output(command.f7066id, readLine);
                } else {
                    return;
                }
            } catch (Exception e) {
                RootShell.log(e.getMessage(), RootShell.LogLevel.ERROR, e);
                return;
            }
        }
    }

    public Shell switchRootShellContext(ShellContext shellContext2) throws IOException, TimeoutException, RootDeniedException {
        if (this.shellType == ShellType.ROOT) {
            try {
                closeRootShell();
            } catch (Exception unused) {
                RootShell.log("Problem closing shell while trying to switch context...");
            }
            return startRootShell(this.shellTimeout, shellContext2, 0);
        }
        RootShell.log("Can only switch context on a root shell!");
        return this;
    }

    public final void useCWD(Context context) throws IOException, TimeoutException, RootDeniedException {
        add(new Command(-1, false, "cd " + context.getApplicationInfo().dataDir));
    }

    /* access modifiers changed from: private */
    public void closeQuietly(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (Exception unused) {
            }
        }
    }

    public static Shell startCustomShell(String str, int i) throws IOException, TimeoutException, RootDeniedException {
        if (customShell == null) {
            RootShell.log("Starting Custom Shell!");
            customShell = new Shell(str, ShellType.CUSTOM, ShellContext.NORMAL, i);
        } else {
            RootShell.log("Using Existing Custom Shell!");
        }
        return customShell;
    }

    public static Shell startRootShell(int i) throws IOException, TimeoutException, RootDeniedException {
        return startRootShell(i, 3);
    }

    public static Shell startShell(int i) throws IOException, TimeoutException {
        try {
            if (shell == null) {
                RootShell.log("Starting Shell!");
                shell = new Shell("/system/bin/sh", ShellType.NORMAL, ShellContext.NORMAL, i);
            } else {
                RootShell.log("Using Existing Shell!");
            }
            return shell;
        } catch (RootDeniedException unused) {
            throw new IOException();
        }
    }

    public static Shell startRootShell(int i, int i2) throws IOException, TimeoutException, RootDeniedException {
        return startRootShell(i, defaultContext, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r1 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p015cm.aptoide.p016pt.root.execution.Shell startRootShell(int r4, p015cm.aptoide.p016pt.root.execution.Shell.ShellContext r5, int r6) throws java.io.IOException, java.util.concurrent.TimeoutException, p015cm.aptoide.p016pt.root.exceptions.RootDeniedException {
        /*
            cm.aptoide.pt.root.execution.Shell r0 = rootShell
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "Starting Root Shell!"
            p015cm.aptoide.p016pt.root.RootShell.log(r0)
            java.lang.String r0 = "su"
            r1 = 0
        L_0x000c:
            cm.aptoide.pt.root.execution.Shell r2 = rootShell
            if (r2 != 0) goto L_0x0096
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            r2.<init>()     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            java.lang.String r3 = "Trying to open Root Shell, attempt #"
            r2.append(r3)     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            r2.append(r1)     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            p015cm.aptoide.p016pt.root.RootShell.log(r2)     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            cm.aptoide.pt.root.execution.Shell r2 = new cm.aptoide.pt.root.execution.Shell     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            cm.aptoide.pt.root.execution.Shell$ShellType r3 = p015cm.aptoide.p016pt.root.execution.Shell.ShellType.ROOT     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            r2.<init>(r0, r3, r5, r4)     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            rootShell = r2     // Catch:{ IOException -> 0x003c, RootDeniedException -> 0x003a, TimeoutException -> 0x002e }
            goto L_0x000c
        L_0x002e:
            r2 = move-exception
            int r3 = r1 + 1
            if (r1 >= r6) goto L_0x0034
            goto L_0x0041
        L_0x0034:
            java.lang.String r4 = "TimeoutException, could not start shell"
            p015cm.aptoide.p016pt.root.RootShell.log(r4)
            throw r2
        L_0x003a:
            r4 = move-exception
            throw r4
        L_0x003c:
            r2 = move-exception
            int r3 = r1 + 1
            if (r1 >= r6) goto L_0x0043
        L_0x0041:
            r1 = r3
            goto L_0x000c
        L_0x0043:
            java.lang.String r4 = "IOException, could not start shell"
            p015cm.aptoide.p016pt.root.RootShell.log(r4)
            throw r2
        L_0x0049:
            cm.aptoide.pt.root.execution.Shell$ShellContext r4 = r0.shellContext
            if (r4 == r5) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            r4.<init>()     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            java.lang.String r0 = "Context is different than open shell, switching context... "
            r4.append(r0)     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            cm.aptoide.pt.root.execution.Shell r0 = rootShell     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            cm.aptoide.pt.root.execution.Shell$ShellContext r0 = r0.shellContext     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            r4.append(r0)     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            java.lang.String r0 = " VS "
            r4.append(r0)     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            r4.append(r5)     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            p015cm.aptoide.p016pt.root.RootShell.log(r4)     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            cm.aptoide.pt.root.execution.Shell r4 = rootShell     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            r4.switchRootShellContext(r5)     // Catch:{ IOException -> 0x0087, RootDeniedException -> 0x007d, TimeoutException -> 0x0073 }
            goto L_0x0096
        L_0x0073:
            r4 = move-exception
            if (r6 <= 0) goto L_0x0077
            goto L_0x0096
        L_0x0077:
            java.lang.String r5 = "TimeoutException, could not switch context!"
            p015cm.aptoide.p016pt.root.RootShell.log(r5)
            throw r4
        L_0x007d:
            r4 = move-exception
            if (r6 <= 0) goto L_0x0081
            goto L_0x0096
        L_0x0081:
            java.lang.String r5 = "RootDeniedException, could not switch context!"
            p015cm.aptoide.p016pt.root.RootShell.log(r5)
            throw r4
        L_0x0087:
            r4 = move-exception
            if (r6 <= 0) goto L_0x008b
            goto L_0x0096
        L_0x008b:
            java.lang.String r5 = "IOException, could not switch context!"
            p015cm.aptoide.p016pt.root.RootShell.log(r5)
            throw r4
        L_0x0091:
            java.lang.String r4 = "Using Existing Root Shell!"
            p015cm.aptoide.p016pt.root.RootShell.log(r4)
        L_0x0096:
            cm.aptoide.pt.root.execution.Shell r4 = rootShell
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.root.execution.Shell.startRootShell(int, cm.aptoide.pt.root.execution.Shell$ShellContext, int):cm.aptoide.pt.root.execution.Shell");
    }
}
