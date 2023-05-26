package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class zzgn extends zzgr {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final zzgq f21888G;

    /* renamed from: H */
    private final zzhq f21889H;

    /* renamed from: I */
    private int f21890I;

    /* renamed from: J */
    private long f21891J;

    public zzgn(zzhn zzhn, Handler handler, zzgq zzgq) {
        this(zzhn, (zzhz) null, true, handler, zzgq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zzgc mo29306a(String str, boolean z) throws zzgz {
        if (zzkl.m24668c(str)) {
            return new zzgc("OMX.google.raw.decoder", true);
        }
        return super.mo29306a(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo29313d() {
        if (!this.f21889H.mo29357f()) {
            return super.mo29313d() && mo29331t() == 2;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo29314e() {
        super.mo29314e();
        this.f21889H.mo29354c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo29315f() {
        this.f21889H.mo29353b();
        super.mo29315f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo29316k() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo29317l() {
        if (super.mo29317l()) {
            return !this.f21889H.mo29357f() || !this.f21889H.mo29358g();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final long mo29318m() {
        long a = this.f21889H.mo29349a(mo29317l());
        if (a == Long.MIN_VALUE) {
            this.f21891J = Math.max(this.f21891J, super.mo29318m());
        } else {
            this.f21891J = Math.max(this.f21891J, a);
        }
        return this.f21891J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo29319n() {
        this.f21890I = 0;
        try {
            this.f21889H.mo29355d();
        } finally {
            super.mo29319n();
        }
    }

    private zzgn(zzhn zzhn, zzhz zzhz, boolean z, Handler handler, zzgq zzgq) {
        super(zzhn, (zzhz) null, true, handler, zzgq);
        this.f21888G = zzgq;
        this.f21890I = 0;
        this.f21889H = new zzhq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29309a(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        if ("OMX.google.raw.decoder".equals(str)) {
            String string = mediaFormat.getString("mime");
            mediaFormat.setString("mime", "audio/raw");
            mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
            mediaFormat.setString("mime", string);
            return;
        }
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29312a(String str) {
        return zzkl.m24667b(str) && super.mo29312a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29308a(long j, boolean z) {
        super.mo29308a(j, z);
        this.f21891J = Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29310a(zzhj zzhj, MediaFormat mediaFormat) {
        if (zzkl.m24668c(zzhj.f21946a)) {
            this.f21889H.mo29351a(zzhj.mo29334a(), 0);
        } else {
            this.f21889H.mo29351a(mediaFormat, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29307a(long j) throws zzgd {
        super.mo29307a(j);
        this.f21889H.mo29355d();
        this.f21891J = Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29311a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) throws zzgd {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f21898b.f21868f++;
            this.f21889H.mo29356e();
            return true;
        }
        if (!this.f21889H.mo29352a()) {
            try {
                if (this.f21890I != 0) {
                    this.f21889H.mo29347a(this.f21890I);
                } else {
                    this.f21890I = this.f21889H.mo29347a(0);
                }
                if (mo29342c() == 3) {
                    this.f21889H.mo29354c();
                }
            } catch (zzhu e) {
                Handler handler = this.f21907k;
                if (!(handler == null || this.f21888G == null)) {
                    handler.post(new C7377cz(this, e));
                }
                throw new zzgd((Throwable) e);
            }
        }
        try {
            int a = this.f21889H.mo29348a(byteBuffer, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs);
            if ((a & 1) != 0) {
                this.f21891J = Long.MIN_VALUE;
            }
            if ((a & 2) == 0) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f21898b.f21867e++;
            return true;
        } catch (zzhv e2) {
            Handler handler2 = this.f21907k;
            if (!(handler2 == null || this.f21888G == null)) {
                handler2.post(new C7414dz(this, e2));
            }
            throw new zzgd((Throwable) e2);
        }
    }

    /* renamed from: a */
    public final void mo29295a(int i, Object obj) throws zzgd {
        if (i == 1) {
            this.f21889H.mo29350a(((Float) obj).floatValue());
        } else {
            super.mo29295a(i, obj);
        }
    }
}
