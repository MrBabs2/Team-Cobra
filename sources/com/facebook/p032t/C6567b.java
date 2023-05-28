package com.facebook.p032t;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C4716f;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p181u.C6650b;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.t.b */
/* compiled from: AnalyticsUserIDStore */
class C6567b {

    /* renamed from: a */
    private static final String f12191a = "b";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static ReentrantReadWriteLock f12192b = new ReentrantReadWriteLock();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f12193c;

    /* renamed from: d */
    private static volatile boolean f12194d = false;

    /* renamed from: com.facebook.t.b$a */
    /* compiled from: AnalyticsUserIDStore */
    static class C6568a implements Runnable {
        C6568a() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6567b.m13929e();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.b$b */
    /* compiled from: AnalyticsUserIDStore */
    static class C6569b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f12195f;

        C6569b(String str) {
            this.f12195f = str;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6567b.f12192b.writeLock().lock();
                    String unused = C6567b.f12193c = this.f12195f;
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4716f.m7696e()).edit();
                    edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", C6567b.f12193c);
                    edit.apply();
                    C6567b.f12192b.writeLock().unlock();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: d */
    public static String m13928d() {
        if (!f12194d) {
            Log.w(f12191a, "initStore should have been called before calling setUserID");
            m13929e();
        }
        f12192b.readLock().lock();
        try {
            return f12193c;
        } finally {
            f12192b.readLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m13929e() {
        if (!f12194d) {
            f12192b.writeLock().lock();
            try {
                if (!f12194d) {
                    f12193c = PreferenceManager.getDefaultSharedPreferences(C4716f.m7696e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String) null);
                    f12194d = true;
                    f12192b.writeLock().unlock();
                }
            } finally {
                f12192b.writeLock().unlock();
            }
        }
    }

    /* renamed from: f */
    public static void m13930f() {
        if (!f12194d) {
            C6596m.m13995b().execute(new C6568a());
        }
    }

    /* renamed from: b */
    public static void m13926b(String str) {
        C6650b.m14185b();
        if (!f12194d) {
            Log.w(f12191a, "initStore should have been called before calling setUserID");
            m13929e();
        }
        C6596m.m13995b().execute(new C6569b(str));
    }
}
