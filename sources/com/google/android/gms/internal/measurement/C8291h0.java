package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.h0 */
final class C8291h0 implements Comparator<zzte> {
    C8291h0() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzte zzte = (zzte) obj;
        zzte zzte2 = (zzte) obj2;
        zztl zztl = (zztl) zzte.iterator();
        zztl zztl2 = (zztl) zzte2.iterator();
        while (zztl.hasNext() && zztl2.hasNext()) {
            int a = C4754e.m7798a(zzte.m26519a(zztl.nextByte()), zzte.m26519a(zztl2.nextByte()));
            if (a != 0) {
                return a;
            }
        }
        return C4754e.m7798a(zzte.size(), zzte2.size());
    }
}
