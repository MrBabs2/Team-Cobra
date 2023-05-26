package com.google.android.gms.common.stats;

import android.content.ComponentName;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class LoggingConstants {
    static {
        new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    }

    private LoggingConstants() {
    }
}
