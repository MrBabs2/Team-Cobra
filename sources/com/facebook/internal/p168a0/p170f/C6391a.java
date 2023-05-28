package com.facebook.internal.p168a0.p170f;

import com.facebook.C4716f;
import com.facebook.internal.p168a0.C6376a;
import com.facebook.internal.p168a0.C6378b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.facebook.internal.a0.f.a */
/* compiled from: CrashShieldHandler */
public class C6391a {

    /* renamed from: a */
    private static final Set<Object> f11756a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private static boolean f11757b = false;

    /* renamed from: a */
    public static void m13257a() {
        f11757b = true;
    }

    /* renamed from: a */
    private static void m13258a(Throwable th) {
    }

    /* renamed from: a */
    public static void m13259a(Throwable th, Object obj) {
        if (f11757b) {
            f11756a.add(obj);
            if (C4716f.m7700i()) {
                C6376a.m13227a(th);
                C6378b.C6380b.m13238a(th, C6378b.C6381c.CrashShield).mo20940c();
            }
            m13258a(th);
        }
    }

    /* renamed from: a */
    public static boolean m13260a(Object obj) {
        return f11756a.contains(obj);
    }
}
