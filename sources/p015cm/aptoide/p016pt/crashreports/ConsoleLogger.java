package p015cm.aptoide.p016pt.crashreports;

import p015cm.aptoide.analytics.implementation.CrashLogger;
import p015cm.aptoide.p016pt.logger.Logger;

/* renamed from: cm.aptoide.pt.crashreports.ConsoleLogger */
public class ConsoleLogger implements CrashLogger {
    private static final String TAG = "cm.aptoide.pt.crashreports.ConsoleLogger";

    public void log(Throwable th) {
        Logger.getInstance().mo12980e(TAG, "Exception found", th);
    }

    public void log(String str, String str2) {
        Logger instance = Logger.getInstance();
        String str3 = TAG;
        instance.mo12987w(str3, "logString : key: " + str + " , value: " + str2);
    }
}
