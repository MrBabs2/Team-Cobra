package com.google.android.gms.internal.ads;

import com.google.ads.mediation.C7111a;
import java.util.Date;
import java.util.HashSet;
import p112n.p277e.p278a.C10567a;
import p112n.p277e.p278a.C10568b;

@zzard
public final class zzaog {
    /* renamed from: a */
    public static int m19721a(C10567a aVar) {
        int i = C8124x2.f17160b[aVar.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    /* renamed from: a */
    public static C7111a m19722a(zzxz zzxz, boolean z) {
        C10568b bVar;
        HashSet hashSet = zzxz.f22985j != null ? new HashSet(zzxz.f22985j) : null;
        Date date = new Date(zzxz.f22982g);
        int i = zzxz.f22984i;
        if (i == 1) {
            bVar = C10568b.MALE;
        } else if (i != 2) {
            bVar = C10568b.UNKNOWN;
        } else {
            bVar = C10568b.FEMALE;
        }
        return new C7111a(date, bVar, hashSet, z, zzxz.f22991p);
    }
}
