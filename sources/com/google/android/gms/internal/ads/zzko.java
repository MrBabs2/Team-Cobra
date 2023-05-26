package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Process;

public final class zzko extends HandlerThread {

    /* renamed from: f */
    private final int f22153f = -16;

    public zzko(String str, int i) {
        super(str);
    }

    public final void run() {
        Process.setThreadPriority(this.f22153f);
        super.run();
    }
}
