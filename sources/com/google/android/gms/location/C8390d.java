package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.d */
final class C8390d implements Comparator<DetectedActivity> {
    C8390d() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        int compareTo = Integer.valueOf(detectedActivity2.mo30543d()).compareTo(Integer.valueOf(detectedActivity.mo30543d()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.mo30546o()).compareTo(Integer.valueOf(detectedActivity2.mo30546o())) : compareTo;
    }
}
