package com.google.android.gms.internal.ads;

import java.io.IOException;

final class d30 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ IOException f14809f;

    /* renamed from: g */
    private final /* synthetic */ z20 f14810g;

    d30(z20 z20, IOException iOException) {
        this.f14810g = z20;
        this.f14809f = iOException;
    }

    public final void run() {
        this.f14810g.f17530j.mo28047a(this.f14809f);
    }
}
