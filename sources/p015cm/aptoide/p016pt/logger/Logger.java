package p015cm.aptoide.p016pt.logger;

import android.util.Log;

/* renamed from: cm.aptoide.pt.logger.Logger */
public class Logger {
    private static boolean DBG;
    private static Logger instance;

    public static synchronized Logger getInstance() {
        Logger logger;
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger();
            }
            logger = instance;
        }
        return logger;
    }

    public static void setDBG(boolean z) {
        DBG = z;
    }

    /* renamed from: d */
    public void mo12974d(Object obj, String str) {
        mo12975d(obj.getClass().getSimpleName(), str);
    }

    /* renamed from: e */
    public void mo12977e(Object obj, String str) {
        mo12979e(obj.getClass().getName(), str);
    }

    /* renamed from: i */
    public void mo12983i(Object obj, String str) {
        mo12984i(obj.getClass().getSimpleName(), str);
    }

    /* renamed from: v */
    public void mo12985v(String str, String str2) {
        if (DBG && str2 != null) {
            Log.v(str, str2);
        }
    }

    /* renamed from: w */
    public void mo12987w(String str, String str2) {
        if (str2 != null) {
            Log.w(str, str2);
        }
    }

    /* renamed from: w */
    public void mo12988w(String str, String str2, Throwable th) {
        if (str2 != null) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: v */
    public void mo12986v(String str, String str2, Throwable th) {
        if (DBG && str2 != null) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: d */
    public void mo12975d(String str, String str2) {
        if (DBG && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: e */
    public void mo12979e(String str, String str2) {
        if (str2 != null) {
            Log.e(str, str2);
        }
    }

    /* renamed from: i */
    public void mo12984i(String str, String str2) {
        if (DBG && str2 != null) {
            Log.i(str, str2);
        }
    }

    /* renamed from: e */
    public void mo12978e(Object obj, Throwable th) {
        mo12981e(obj.getClass().getName(), th);
    }

    /* renamed from: d */
    public void mo12976d(String str, String str2, Throwable th) {
        if (DBG && str2 != null) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: i */
    public void mo12982i(Class cls, String str) {
        mo12984i(cls.getSimpleName(), str);
    }

    /* renamed from: e */
    public void mo12981e(String str, Throwable th) {
        Log.e(str, "", th);
    }

    /* renamed from: e */
    public void mo12980e(String str, String str2, Throwable th) {
        if (str2 != null) {
            Log.e(str, str2, th);
        }
    }
}
