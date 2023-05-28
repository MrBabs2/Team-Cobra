package p015cm.aptoide.p016pt.root;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeoutException;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.root.exceptions.RootDeniedException;
import p015cm.aptoide.p016pt.root.execution.Command;
import p015cm.aptoide.p016pt.root.execution.Shell;

/* renamed from: cm.aptoide.pt.root.RootShell */
public class RootShell {
    private static final String TAG = "RootShell";
    public static boolean debugMode = false;
    public static int defaultCommandTimeout = 20000;
    public static boolean handlerEnabled = true;
    public static final String version = "RootShell v1.4.1-aptoide";

    /* renamed from: cm.aptoide.pt.root.RootShell$5 */
    static /* synthetic */ class C39785 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                cm.aptoide.pt.root.RootShell$LogLevel[] r0 = p015cm.aptoide.p016pt.root.RootShell.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel = r0
                cm.aptoide.pt.root.RootShell$LogLevel r1 = p015cm.aptoide.p016pt.root.RootShell.LogLevel.VERBOSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.root.RootShell$LogLevel r1 = p015cm.aptoide.p016pt.root.RootShell.LogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.root.RootShell$LogLevel r1 = p015cm.aptoide.p016pt.root.RootShell.LogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.root.RootShell$LogLevel r1 = p015cm.aptoide.p016pt.root.RootShell.LogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.root.RootShell.C39785.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.root.RootShell$LogLevel */
    public enum LogLevel {
        VERBOSE,
        ERROR,
        DEBUG,
        WARN
    }

    public static void closeAllShells() throws IOException {
        Shell.closeAll();
    }

    public static void closeCustomShell() throws IOException {
        Shell.closeCustomShell();
    }

    public static void closeShell(boolean z) throws IOException {
        if (z) {
            Shell.closeRootShell();
        } else {
            Shell.closeShell();
        }
    }

    private static void commandWait(Shell shell, Command command) throws Exception {
        while (!command.isFinished()) {
            log(version, shell.getCommandQueuePositionString(command));
            log(version, "Processed " + command.totalOutputProcessed + " of " + command.totalOutput + " output from command.");
            synchronized (command) {
                try {
                    if (!command.isFinished()) {
                        command.wait(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!command.isExecuting() && !command.isFinished()) {
                if (!shell.isExecuting && !shell.isReading) {
                    log(version, "Waiting for a command to be executed in a shell that is not executing and not reading! \n\n Command: " + command.getCommand());
                    Exception exc = new Exception();
                    exc.setStackTrace(Thread.currentThread().getStackTrace());
                    exc.printStackTrace();
                } else if (!shell.isExecuting || shell.isReading) {
                    log(version, "Waiting for a command to be executed in a shell that is not reading! \n\n Command: " + command.getCommand());
                    Exception exc2 = new Exception();
                    exc2.setStackTrace(Thread.currentThread().getStackTrace());
                    exc2.printStackTrace();
                } else {
                    log(version, "Waiting for a command to be executed in a shell that is executing but not reading! \n\n Command: " + command.getCommand());
                    Exception exc3 = new Exception();
                    exc3.setStackTrace(Thread.currentThread().getStackTrace());
                    exc3.printStackTrace();
                }
            }
        }
    }

    public static boolean exists(String str) {
        return exists(str, false);
    }

    public static List<String> findBinary(String str, boolean z) {
        return findBinary(str, (List<String>) null, z);
    }

    public static Shell getCustomShell(String str, int i) throws IOException, TimeoutException, RootDeniedException {
        return getCustomShell(str, i);
    }

    public static List<String> getPath() {
        return Arrays.asList(System.getenv("PATH").split(":"));
    }

    public static Shell getShell(boolean z, int i, Shell.ShellContext shellContext, int i2) throws IOException, TimeoutException, RootDeniedException {
        if (z) {
            return Shell.startRootShell(i, shellContext, i2);
        }
        return Shell.startShell(i);
    }

    public static boolean isAccessGiven() {
        final HashSet<String> hashSet = new HashSet<>();
        try {
            log("Checking for Root access");
            C39774 r2 = new Command(158, false, new String[]{DeepLinkIntentReceiver.DeepLinksKeys.f3452ID}) {
                public void commandOutput(int i, String str) {
                    if (i == 158) {
                        hashSet.addAll(Arrays.asList(str.split(" ")));
                    }
                    super.commandOutput(i, str);
                }
            };
            Shell.startRootShell().add(r2);
            commandWait(Shell.startRootShell(), r2);
            for (String str : hashSet) {
                log(str);
                if (str.toLowerCase().contains("uid=0")) {
                    log("Access Given");
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Logger.getInstance().mo12981e(TAG, (Throwable) e);
            return false;
        }
    }

    public static boolean isBusyboxAvailable() {
        return findBinary("busybox", true).size() > 0 || findBinary("toybox", true).size() > 0;
    }

    public static boolean isRootAvailable() {
        return findBinary("su", true).size() > 0;
    }

    public static boolean islog() {
        return debugMode;
    }

    public static void log(String str) {
        log((String) null, str, LogLevel.DEBUG, (Exception) null);
    }

    public static boolean exists(String str, boolean z) {
        final ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("ls ");
        sb.append(z ? "-d " : " ");
        String sb2 = sb.toString();
        C39741 r2 = new Command(0, false, new String[]{sb2 + str}) {
            public void commandOutput(int i, String str) {
                RootShell.log(str);
                arrayList.add(str);
                super.commandOutput(i, str);
            }
        };
        try {
            getShell(false).add(r2);
            commandWait(getShell(false), r2);
            for (String trim : arrayList) {
                if (trim.trim().equals(str)) {
                    return true;
                }
            }
            arrayList.clear();
            C39752 r22 = new Command(0, false, new String[]{sb2 + str}) {
                public void commandOutput(int i, String str) {
                    RootShell.log(str);
                    arrayList.add(str);
                    super.commandOutput(i, str);
                }
            };
            try {
                getShell(true).add(r22);
                commandWait(getShell(true), r22);
                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList2.addAll(arrayList);
                for (String trim2 : arrayList2) {
                    if (trim2.trim().equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                if (e instanceof RootDeniedException) {
                    return true;
                }
                log("Exception: " + e);
                return false;
            }
        } catch (Exception e2) {
            log("Exception: " + e2);
            return false;
        }
    }

    public static List<String> findBinary(String str, List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            list = getPath();
        }
        log("Checking for " + str);
        boolean z2 = false;
        try {
            for (String next : list) {
                if (!next.endsWith("/")) {
                    next = next + "/";
                }
                final String str2 = next;
                final String str3 = str;
                final ArrayList arrayList2 = arrayList;
                commandWait(getShell(false), getShell(false).add(new Command(0, false, new String[]{"stat " + str2 + str}) {
                    public void commandOutput(int i, String str) {
                        if (str.contains("File: ") && str.contains(str3)) {
                            arrayList2.add(str2);
                            RootShell.log(str3 + " was found here: " + str2);
                        }
                        RootShell.log(str);
                        super.commandOutput(i, str);
                    }
                }));
                if (arrayList.size() > 0 && z) {
                    break;
                }
            }
            z2 = !arrayList.isEmpty();
        } catch (Exception unused) {
            log(str + " was not found, more information MAY be available with Debugging on.");
        }
        if (!z2) {
            log("Trying second method");
            for (String next2 : list) {
                if (!next2.endsWith("/")) {
                    next2 = next2 + "/";
                }
                if (exists(next2 + str)) {
                    log(str + " was found here: " + next2);
                    arrayList.add(next2);
                    if (arrayList.size() > 0 && z) {
                        break;
                    }
                } else {
                    log(str + " was NOT found here: " + next2);
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public static void log(String str, String str2) {
        log(str, str2, LogLevel.DEBUG, (Exception) null);
    }

    public static Shell getShell(boolean z, int i, Shell.ShellContext shellContext) throws IOException, TimeoutException, RootDeniedException {
        return getShell(z, i, shellContext, 3);
    }

    public static void log(String str, LogLevel logLevel, Exception exc) {
        log((String) null, str, logLevel, exc);
    }

    public static Shell getShell(boolean z, Shell.ShellContext shellContext) throws IOException, TimeoutException, RootDeniedException {
        return getShell(z, 0, shellContext, 3);
    }

    public static void log(String str, String str2, LogLevel logLevel, Exception exc) {
        if (str2 != null && !str2.equals("") && debugMode) {
            if (str == null) {
                str = version;
            }
            int i = C39785.$SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel[logLevel.ordinal()];
            if (i == 1) {
                Log.v(str, str2);
            } else if (i == 2) {
                Log.e(str, str2, exc);
            } else if (i == 3) {
                Log.d(str, str2);
            } else if (i == 4) {
                Log.w(str, str2);
            }
        }
    }

    public static Shell getShell(boolean z, int i) throws IOException, TimeoutException, RootDeniedException {
        return getShell(z, i, Shell.defaultContext, 3);
    }

    public static Shell getShell(boolean z) throws IOException, TimeoutException, RootDeniedException {
        return getShell(z, 0);
    }
}
