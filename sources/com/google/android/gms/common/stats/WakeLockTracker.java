package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class WakeLockTracker {
    static {
        new WakeLockTracker();
    }
}
