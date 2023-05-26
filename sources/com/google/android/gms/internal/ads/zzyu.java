package com.google.android.gms.internal.ads;

import java.util.Random;

@zzard
public final class zzyu extends zzzz {

    /* renamed from: f */
    private final Random f23045f = new Random();

    /* renamed from: g */
    private long f23046g;

    /* renamed from: h */
    private final Object f23047h = new Object();

    public zzyu() {
        mo29921p1();
    }

    public final long getValue() {
        return this.f23046g;
    }

    /* renamed from: p1 */
    public final void mo29921p1() {
        synchronized (this.f23047h) {
            int i = 3;
            long j = 0;
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                j = ((long) this.f23045f.nextInt()) + 2147483648L;
                if (j != this.f23046g && j != 0) {
                    break;
                }
            }
            this.f23046g = j;
        }
    }
}
