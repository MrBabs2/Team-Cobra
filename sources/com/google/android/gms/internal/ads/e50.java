package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

final class e50 extends PushbackInputStream {

    /* renamed from: f */
    private final /* synthetic */ b50 f15067f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e50(b50 b50, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f15067f = b50;
    }

    public final synchronized void close() throws IOException {
        this.f15067f.f14554c.m25457a();
        super.close();
    }
}
