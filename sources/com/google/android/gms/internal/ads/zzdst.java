package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class zzdst extends zzdsr implements zzbd {

    /* renamed from: n */
    private int f21727n;

    protected zzdst(String str) {
        super(str);
    }

    /* renamed from: b */
    public final int mo29213b() {
        if (!this.f21719g) {
            mo29211a();
        }
        return this.f21727n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo29214b(ByteBuffer byteBuffer) {
        this.f21727n = zzbc.m20573a(byteBuffer.get());
        zzbc.m20575b(byteBuffer);
        zzbc.m20573a(byteBuffer.get());
        return 4;
    }
}
