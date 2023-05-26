package com.facebook.internal.p168a0;

import com.facebook.C4716f;
import com.facebook.internal.C6437k;
import com.facebook.internal.p168a0.p169e.C6388a;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.internal.p168a0.p171g.C6393b;
import com.facebook.internal.p168a0.p172h.C6397a;

/* renamed from: com.facebook.internal.a0.c */
/* compiled from: InstrumentManager */
public class C6382c {

    /* renamed from: com.facebook.internal.a0.c$a */
    /* compiled from: InstrumentManager */
    static class C6383a implements C6437k.C6440c {
        C6383a() {
        }

        /* renamed from: a */
        public void mo15773a(boolean z) {
            if (z) {
                C6388a.m13254a();
                if (C6437k.m13342d(C6437k.C6441d.CrashShield)) {
                    C6376a.m13226a();
                    C6391a.m13257a();
                }
                if (C6437k.m13342d(C6437k.C6441d.ThreadCheck)) {
                    C6397a.m13271a();
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.a0.c$b */
    /* compiled from: InstrumentManager */
    static class C6384b implements C6437k.C6440c {
        C6384b() {
        }

        /* renamed from: a */
        public void mo15773a(boolean z) {
            if (z) {
                C6393b.m13266a();
            }
        }
    }

    /* renamed from: a */
    public static void m13241a() {
        if (C4716f.m7700i()) {
            C6437k.m13338a(C6437k.C6441d.CrashReport, new C6383a());
            C6437k.m13338a(C6437k.C6441d.ErrorReport, new C6384b());
        }
    }
}
