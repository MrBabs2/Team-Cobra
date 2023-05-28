package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.C4716f;
import com.facebook.internal.p168a0.p170f.C6391a;

/* renamed from: com.facebook.internal.o */
/* compiled from: InstallReferrerUtil */
public class C6454o {

    /* renamed from: com.facebook.internal.o$a */
    /* compiled from: InstallReferrerUtil */
    static class C6455a implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ InstallReferrerClient f11883a;

        /* renamed from: b */
        final /* synthetic */ C6456b f11884b;

        C6455a(InstallReferrerClient installReferrerClient, C6456b bVar) {
            this.f11883a = installReferrerClient;
            this.f11884b = bVar;
        }

        /* renamed from: a */
        public void mo19753a() {
        }

        /* renamed from: a */
        public void mo19754a(int i) {
            if (i == 0) {
                try {
                    String a = this.f11883a.mo19750a().mo19755a();
                    if (a != null && (a.contains("fb") || a.contains("facebook"))) {
                        this.f11884b.mo21008a(a);
                    }
                    C6454o.m13393a();
                } catch (RemoteException unused) {
                }
            } else if (i == 2) {
                C6454o.m13393a();
            }
        }
    }

    /* renamed from: com.facebook.internal.o$b */
    /* compiled from: InstallReferrerUtil */
    public interface C6456b {
        /* renamed from: a */
        void mo21008a(String str);
    }

    private C6454o() {
    }

    /* renamed from: a */
    static /* synthetic */ void m13393a() {
        Class<C6454o> cls = C6454o.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                m13397c();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static void m13395b(C6456b bVar) {
        Class<C6454o> cls = C6454o.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (!m13396b()) {
                    m13394a(bVar);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    private static void m13397c() {
        Class<C6454o> cls = C6454o.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C4716f.m7696e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static void m13394a(C6456b bVar) {
        Class<C6454o> cls = C6454o.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                InstallReferrerClient a = InstallReferrerClient.m11394a(C4716f.m7696e()).mo19752a();
                try {
                    a.mo19751a((InstallReferrerStateListener) new C6455a(a, bVar));
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static boolean m13396b() {
        Class<C6454o> cls = C6454o.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return C4716f.m7696e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }
}
