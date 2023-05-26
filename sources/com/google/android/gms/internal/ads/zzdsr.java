package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class zzdsr implements zzbd {

    /* renamed from: m */
    private static zzdtc f21717m = zzdtc.m24221a(zzdsr.class);

    /* renamed from: f */
    private String f21718f;

    /* renamed from: g */
    boolean f21719g;

    /* renamed from: h */
    private boolean f21720h;

    /* renamed from: i */
    private ByteBuffer f21721i;

    /* renamed from: j */
    private long f21722j;

    /* renamed from: k */
    private long f21723k = -1;

    /* renamed from: l */
    private zzdsw f21724l;

    protected zzdsr(String str) {
        this.f21718f = str;
        this.f21720h = true;
        this.f21719g = true;
    }

    /* renamed from: b */
    private final synchronized void mo29213b() {
        if (!this.f21720h) {
            try {
                zzdtc zzdtc = f21717m;
                String valueOf = String.valueOf(this.f21718f);
                zzdtc.mo29219a(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.f21721i = this.f21724l.mo26731a(this.f21722j, this.f21723k);
                this.f21720h = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo27967a(zzbe zzbe) {
    }

    /* renamed from: a */
    public final void mo27968a(zzdsw zzdsw, ByteBuffer byteBuffer, long j, zzba zzba) throws IOException {
        this.f21722j = zzdsw.position();
        byteBuffer.remaining();
        this.f21723k = j;
        this.f21724l = zzdsw;
        zzdsw.mo26733f(zzdsw.position() + j);
        this.f21720h = false;
        this.f21719g = false;
        mo29211a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26104a(ByteBuffer byteBuffer);

    public final String getType() {
        return this.f21718f;
    }

    /* renamed from: a */
    public final synchronized void mo29211a() {
        mo29213b();
        zzdtc zzdtc = f21717m;
        String valueOf = String.valueOf(this.f21718f);
        zzdtc.mo29219a(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.f21721i != null) {
            ByteBuffer byteBuffer = this.f21721i;
            this.f21719g = true;
            byteBuffer.rewind();
            mo26104a(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.f21721i = null;
        }
    }
}
