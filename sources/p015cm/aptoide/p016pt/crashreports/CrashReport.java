package p015cm.aptoide.p016pt.crashreports;

import android.util.Log;
import java.util.ArrayList;
import p015cm.aptoide.analytics.implementation.CrashLogger;

/* renamed from: cm.aptoide.pt.crashreports.CrashReport */
public class CrashReport implements CrashLogger {
    private static final String TAG = "cm.aptoide.pt.crashreports.CrashReport";
    private static CrashReport singleton = new CrashReport();
    private ArrayList<CrashLogger> crashLoggers = new ArrayList<>();

    private CrashReport() {
    }

    public static CrashReport getInstance() {
        return singleton;
    }

    private boolean isInitialized() {
        ArrayList<CrashLogger> arrayList = this.crashLoggers;
        return arrayList != null && !arrayList.isEmpty();
    }

    public CrashReport addLogger(CrashLogger crashLogger) {
        this.crashLoggers.add(crashLogger);
        return this;
    }

    public CrashLogger getLogger(Class<? extends CrashLogger> cls) {
        if (!isInitialized()) {
            Log.e(TAG, "not initialized");
            return null;
        }
        for (int i = 0; i < this.crashLoggers.size(); i++) {
            if (cls.isAssignableFrom(this.crashLoggers.get(i).getClass())) {
                return this.crashLoggers.get(i);
            }
        }
        return null;
    }

    public void log(Throwable th) {
        if (!isInitialized()) {
            Log.e(TAG, "not initialized");
            return;
        }
        for (int i = 0; i < this.crashLoggers.size(); i++) {
            this.crashLoggers.get(i).log(th);
        }
    }

    public void log(String str, String str2) {
        if (!isInitialized()) {
            Log.e(TAG, "not initialized");
            return;
        }
        for (int i = 0; i < this.crashLoggers.size(); i++) {
            this.crashLoggers.get(i).log(str, str2);
        }
    }
}
