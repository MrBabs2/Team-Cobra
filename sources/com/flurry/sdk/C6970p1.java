package com.flurry.sdk;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: com.flurry.sdk.p1 */
public final class C6970p1 {
    /* renamed from: a */
    public static ActivityManager.MemoryInfo m14806a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo;
    }
}
