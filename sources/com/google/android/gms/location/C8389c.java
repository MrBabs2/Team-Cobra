package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.c */
final class C8389c implements Comparator<ActivityTransition> {
    C8389c() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int d = activityTransition.mo30522d();
        int d2 = activityTransition2.mo30522d();
        if (d != d2) {
            return d < d2 ? -1 : 1;
        }
        int o = activityTransition.mo30525o();
        int o2 = activityTransition2.mo30525o();
        if (o == o2) {
            return 0;
        }
        return o < o2 ? -1 : 1;
    }
}
