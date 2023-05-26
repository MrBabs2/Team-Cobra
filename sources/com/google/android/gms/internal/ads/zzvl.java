package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzvl implements Comparator<zzuz> {
    public zzvl(zzvk zzvk) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzuz zzuz = (zzuz) obj;
        zzuz zzuz2 = (zzuz) obj2;
        if (zzuz.mo29824b() < zzuz2.mo29824b()) {
            return -1;
        }
        if (zzuz.mo29824b() > zzuz2.mo29824b()) {
            return 1;
        }
        if (zzuz.mo29823a() < zzuz2.mo29823a()) {
            return -1;
        }
        if (zzuz.mo29823a() > zzuz2.mo29823a()) {
            return 1;
        }
        float d = (zzuz.mo29826d() - zzuz.mo29824b()) * (zzuz.mo29825c() - zzuz.mo29823a());
        float d2 = (zzuz2.mo29826d() - zzuz2.mo29824b()) * (zzuz2.mo29825c() - zzuz2.mo29823a());
        if (d > d2) {
            return -1;
        }
        if (d < d2) {
            return 1;
        }
        return 0;
    }
}
