package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class zzhd extends zzgr {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final zzhh f21930G;

    /* renamed from: H */
    private final long f21931H;

    /* renamed from: I */
    private final int f21932I;

    /* renamed from: J */
    private final int f21933J;

    /* renamed from: K */
    private Surface f21934K;

    /* renamed from: L */
    private boolean f21935L;

    /* renamed from: M */
    private boolean f21936M;

    /* renamed from: N */
    private long f21937N;

    /* renamed from: O */
    private long f21938O;

    /* renamed from: P */
    private int f21939P;

    /* renamed from: Q */
    private int f21940Q;

    /* renamed from: R */
    private int f21941R;

    /* renamed from: S */
    private float f21942S;

    /* renamed from: T */
    private int f21943T;

    /* renamed from: U */
    private int f21944U;

    /* renamed from: V */
    private float f21945V;

    public zzhd(zzhn zzhn, int i, long j, Handler handler, zzhh zzhh, int i2) {
        this(zzhn, (zzhz) null, true, 1, 0, (zzhi) null, handler, zzhh, -1);
    }

    /* renamed from: u */
    private final void m24455u() {
        if (this.f21907k != null && this.f21930G != null) {
            if (this.f21943T != this.f21940Q || this.f21944U != this.f21941R || this.f21945V != this.f21942S) {
                int i = this.f21940Q;
                int i2 = this.f21941R;
                float f = this.f21942S;
                this.f21907k.post(new C7713lz(this, i, i2, f));
                this.f21943T = i;
                this.f21944U = i2;
                this.f21945V = f;
            }
        }
    }

    /* renamed from: v */
    private final void m24456v() {
        Handler handler = this.f21907k;
        if (handler != null && this.f21930G != null && !this.f21935L) {
            handler.post(new C7750mz(this, this.f21934K));
            this.f21935L = true;
        }
    }

    /* renamed from: w */
    private final void m24457w() {
        if (this.f21907k != null && this.f21930G != null && this.f21939P != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f21907k.post(new C7787nz(this, this.f21939P, elapsedRealtime - this.f21938O));
            this.f21939P = 0;
            this.f21938O = elapsedRealtime;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29312a(String str) {
        return zzkl.m24666a(str).equals("video") && super.mo29312a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo29313d() {
        if (super.mo29313d() && (this.f21936M || !mo29329r() || mo29331t() == 2)) {
            this.f21937N = -1;
            return true;
        } else if (this.f21937N == -1) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() * 1000 < this.f21937N) {
                return true;
            }
            this.f21937N = -1;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo29314e() {
        super.mo29314e();
        this.f21939P = 0;
        this.f21938O = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo29315f() {
        this.f21937N = -1;
        m24457w();
        super.mo29315f();
    }

    /* renamed from: n */
    public final void mo29319n() {
        this.f21940Q = -1;
        this.f21941R = -1;
        this.f21942S = -1.0f;
        this.f21943T = -1;
        this.f21944U = -1;
        this.f21945V = -1.0f;
        super.mo29319n();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f21934K;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29328q() {
        /*
            r1 = this;
            boolean r0 = super.mo29328q()
            if (r0 == 0) goto L_0x0012
            android.view.Surface r0 = r1.f21934K
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhd.mo29328q():boolean");
    }

    private zzhd(zzhn zzhn, zzhz zzhz, boolean z, int i, long j, zzhi zzhi, Handler handler, zzhh zzhh, int i2) {
        super(zzhn, (zzhz) null, true, handler, zzhh);
        this.f21932I = 1;
        this.f21931H = 0;
        this.f21930G = zzhh;
        this.f21933J = -1;
        this.f21937N = -1;
        this.f21940Q = -1;
        this.f21941R = -1;
        this.f21942S = -1.0f;
        this.f21943T = -1;
        this.f21944U = -1;
        this.f21945V = -1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29308a(long j, boolean z) {
        super.mo29308a(j, z);
        this.f21936M = false;
        if (z && this.f21931H > 0) {
            this.f21937N = (SystemClock.elapsedRealtime() * 1000) + this.f21931H;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29307a(long j) throws zzgd {
        super.mo29307a(j);
        this.f21936M = false;
        this.f21937N = -1;
    }

    /* renamed from: a */
    public final void mo29295a(int i, Object obj) throws zzgd {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.f21934K != surface) {
                this.f21934K = surface;
                this.f21935L = false;
                int c = mo29342c();
                if (c == 2 || c == 3) {
                    mo29330s();
                    mo29327p();
                    return;
                }
                return;
            }
            return;
        }
        super.mo29295a(i, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29309a(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, this.f21934K, mediaCrypto, 0);
        mediaCodec.setVideoScalingMode(this.f21932I);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29321a(zzhk zzhk) throws zzgd {
        super.mo29321a(zzhk);
        float f = zzhk.f21959a.f21951f;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f21942S = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29310a(zzhj zzhj, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f21940Q = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f21941R = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29322a(MediaCodec mediaCodec, boolean z, zzhj zzhj, zzhj zzhj2) {
        if (!zzhj2.f21946a.equals(zzhj.f21946a)) {
            return false;
        }
        if (!z) {
            return zzhj.f21949d == zzhj2.f21949d && zzhj.f21950e == zzhj2.f21950e;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29311a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) {
        if (z) {
            zzkp.m24684a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            zzkp.m24683a();
            this.f21898b.f21868f++;
            return true;
        }
        long elapsedRealtime = (bufferInfo.presentationTimeUs - j) - ((SystemClock.elapsedRealtime() * 1000) - j2);
        long nanoTime = System.nanoTime() + (elapsedRealtime * 1000);
        if (elapsedRealtime < -30000) {
            zzkp.m24684a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            zzkp.m24683a();
            this.f21898b.f21869g++;
            int i2 = this.f21939P + 1;
            this.f21939P = i2;
            if (i2 == this.f21933J) {
                m24457w();
            }
            return true;
        } else if (!this.f21936M) {
            m24454a(mediaCodec, i);
            return true;
        } else if (mo29342c() != 3) {
            return false;
        } else {
            if (zzkq.f22154a >= 21) {
                if (elapsedRealtime < 50000) {
                    m24455u();
                    zzkp.m24684a("releaseOutputBufferTimed");
                    mediaCodec.releaseOutputBuffer(i, nanoTime);
                    zzkp.m24683a();
                    this.f21898b.f21867e++;
                    this.f21936M = true;
                    m24456v();
                    return true;
                }
            } else if (elapsedRealtime < 30000) {
                if (elapsedRealtime > 11000) {
                    try {
                        Thread.sleep((elapsedRealtime - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                m24454a(mediaCodec, i);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m24454a(MediaCodec mediaCodec, int i) {
        m24455u();
        zzkp.m24684a("renderVideoBufferImmediate");
        mediaCodec.releaseOutputBuffer(i, true);
        zzkp.m24683a();
        this.f21898b.f21867e++;
        this.f21936M = true;
        m24456v();
    }
}
