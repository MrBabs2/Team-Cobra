package com.facebook.p032t.p176q;

import android.app.Activity;
import com.facebook.C4716f;
import com.facebook.internal.C6372a;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;

/* renamed from: com.facebook.t.q.a */
/* compiled from: MetadataIndexer */
public final class C6603a {

    /* renamed from: a */
    private static final String f12265a = "com.facebook.t.q.a";

    /* renamed from: b */
    private static Boolean f12266b = false;

    /* renamed from: com.facebook.t.q.a$a */
    /* compiled from: MetadataIndexer */
    static class C6604a implements Runnable {
        C6604a() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    if (!C6372a.m13218g(C4716f.m7696e())) {
                        C6603a.m14028a();
                        C6603a.m14027a((Boolean) true);
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14028a() {
        Class<C6603a> cls = C6603a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                m14031c();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static void m14030b() {
        Class<C6603a> cls = C6603a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C4716f.m7704m().execute(new C6604a());
            } catch (Exception e) {
                C6476x.m13507a(f12265a, e);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    private static void m14031c() {
        String g;
        Class<C6603a> cls = C6603a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C6446m a = C6448n.m13378a(C4716f.m7697f(), false);
                if (a != null && (g = a.mo20994g()) != null) {
                    C6606c.m14038a(g);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m14027a(Boolean bool) {
        Class<C6603a> cls = C6603a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            f12266b = bool;
            return bool;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    public static void m14029a(Activity activity) {
        Class<C6603a> cls = C6603a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (!f12266b.booleanValue()) {
                    return;
                }
                if (!C6606c.m14041e().isEmpty()) {
                    C6607d.m14047a(activity);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }
}
