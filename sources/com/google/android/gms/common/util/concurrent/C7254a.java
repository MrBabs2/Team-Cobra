package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.concurrent.a */
final class C7254a implements Runnable {

    /* renamed from: f */
    private final Runnable f14277f;

    /* renamed from: g */
    private final int f14278g;

    public C7254a(Runnable runnable, int i) {
        this.f14277f = runnable;
        this.f14278g = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f14278g);
        this.f14277f.run();
    }
}
