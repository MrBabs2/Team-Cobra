package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.eu */
final class C7446eu implements Comparator<zzdmr> {
    C7446eu() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzdmr zzdmr = (zzdmr) obj;
        zzdmr zzdmr2 = (zzdmr) obj2;
        zzdmy zzdmy = (zzdmy) zzdmr.iterator();
        zzdmy zzdmy2 = (zzdmy) zzdmr2.iterator();
        while (zzdmy.hasNext() && zzdmy2.hasNext()) {
            int a = C4754e.m7798a(zzdmr.m23761a(zzdmy.nextByte()), zzdmr.m23761a(zzdmy2.nextByte()));
            if (a != 0) {
                return a;
            }
        }
        return C4754e.m7798a(zzdmr.size(), zzdmr2.size());
    }
}
