package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class zzms extends zzpe implements zzso {
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final zzma f22291V;

    /* renamed from: W */
    private final zzmh f22292W;

    /* renamed from: X */
    private boolean f22293X;

    /* renamed from: Y */
    private boolean f22294Y;

    /* renamed from: Z */
    private MediaFormat f22295Z;

    /* renamed from: a0 */
    private int f22296a0;

    /* renamed from: b0 */
    private int f22297b0;

    /* renamed from: c0 */
    private long f22298c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public boolean f22299d0;

    public zzms(zzpg zzpg) {
        this(zzpg, (zznj<Object>) null, true);
    }

    /* renamed from: a */
    protected static void m24864a(int i, long j, long j2) {
    }

    /* renamed from: b */
    protected static void m24867b(int i) {
    }

    /* renamed from: z */
    protected static void m24868z() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29525a(zzpg zzpg, zzlh zzlh) throws zzpk {
        int i;
        int i2;
        String str = zzlh.f22189k;
        boolean z = false;
        if (!zzsp.m25234b(str)) {
            return 0;
        }
        int i3 = zzsy.f22671a >= 21 ? 16 : 0;
        int i4 = 3;
        if (m24866a(str) && zzpg.mo26462a() != null) {
            return i3 | 4 | 3;
        }
        zzpd a = zzpg.mo26463a(str, false);
        if (a == null) {
            return 1;
        }
        if (zzsy.f22671a < 21 || (((i = zzlh.f22202x) == -1 || a.mo29602a(i)) && ((i2 = zzlh.f22201w) == -1 || a.mo29606b(i2)))) {
            z = true;
        }
        if (!z) {
            i4 = 2;
        }
        return i3 | 4 | i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29533b(zzlh zzlh) throws zzku {
        super.mo29533b(zzlh);
        this.f22291V.mo29503a(zzlh);
        this.f22296a0 = "audio/raw".equals(zzlh.f22189k) ? zzlh.f22203y : 2;
        this.f22297b0 = zzlh.f22201w;
    }

    /* renamed from: c */
    public final zzln mo29534c() {
        return this.f22292W.mo29523i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo29444e() {
        super.mo29444e();
        this.f22292W.mo29515b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo29445f() {
        this.f22292W.mo29509a();
        super.mo29445f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo29446g() {
        try {
            this.f22292W.mo29517c();
            try {
                super.mo29446g();
            } finally {
                this.f22477T.mo29551a();
                this.f22291V.mo29506b(this.f22477T);
            }
        } catch (Throwable th) {
            super.mo29446g();
            throw th;
        } finally {
            this.f22477T.mo29551a();
            this.f22291V.mo29506b(this.f22477T);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo29535l() throws zzku {
        try {
            this.f22292W.mo29522h();
        } catch (zzmp e) {
            throw zzku.m24722a(e, mo29443d());
        }
    }

    /* renamed from: m */
    public final boolean mo29481m() {
        return this.f22292W.mo29521g() || super.mo29481m();
    }

    /* renamed from: n */
    public final boolean mo29482n() {
        return super.mo29482n() && this.f22292W.mo29519e();
    }

    /* renamed from: q */
    public final zzso mo29452q() {
        return this;
    }

    private zzms(zzpg zzpg, zznj<Object> zznj, boolean z) {
        this(zzpg, (zznj<Object>) null, true, (Handler) null, (zzlz) null);
    }

    private zzms(zzpg zzpg, zznj<Object> zznj, boolean z, Handler handler, zzlz zzlz) {
        this(zzpg, (zznj<Object>) null, true, (Handler) null, (zzlz) null, (zzlw) null, new zzlx[0]);
    }

    private zzms(zzpg zzpg, zznj<Object> zznj, boolean z, Handler handler, zzlz zzlz, zzlw zzlw, zzlx... zzlxArr) {
        super(1, zzpg, zznj, z);
        this.f22292W = new zzmh((zzlw) null, zzlxArr, new i10(this));
        this.f22291V = new zzma((Handler) null, (zzlz) null);
    }

    /* renamed from: b */
    public final long mo29532b() {
        long a = this.f22292W.mo29507a(mo29482n());
        if (a != Long.MIN_VALUE) {
            if (!this.f22299d0) {
                a = Math.max(this.f22298c0, a);
            }
            this.f22298c0 = a;
            this.f22299d0 = false;
        }
        return this.f22298c0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zzpd mo29527a(zzpg zzpg, zzlh zzlh, boolean z) throws zzpk {
        zzpd a;
        if (!m24866a(zzlh.f22189k) || (a = zzpg.mo26462a()) == null) {
            this.f22293X = false;
            return super.mo29527a(zzpg, zzlh, z);
        }
        this.f22293X = true;
        return a;
    }

    /* renamed from: a */
    private final boolean m24866a(String str) {
        return this.f22292W.mo29513a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29529a(zzpd zzpd, MediaCodec mediaCodec, zzlh zzlh, MediaCrypto mediaCrypto) {
        this.f22294Y = zzsy.f22671a < 24 && "OMX.SEC.aac.dec".equals(zzpd.f22451a) && "samsung".equals(zzsy.f22673c) && (zzsy.f22672b.startsWith("zeroflte") || zzsy.f22672b.startsWith("herolte") || zzsy.f22672b.startsWith("heroqlte"));
        if (this.f22293X) {
            MediaFormat a = zzlh.mo29466a();
            this.f22295Z = a;
            a.setString("mime", "audio/raw");
            mediaCodec.configure(this.f22295Z, (Surface) null, (MediaCrypto) null, 0);
            this.f22295Z.setString("mime", zzlh.f22189k);
            return;
        }
        mediaCodec.configure(zzlh.mo29466a(), (Surface) null, (MediaCrypto) null, 0);
        this.f22295Z = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29530a(String str, long j, long j2) {
        this.f22291V.mo29505a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29528a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzku {
        int[] iArr;
        int i;
        boolean z = this.f22295Z != null;
        String string = z ? this.f22295Z.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.f22295Z;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f22294Y || integer != 6 || (i = this.f22297b0) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.f22297b0; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.f22292W.mo29512a(string, integer, integer2, this.f22296a0, 0, iArr);
        } catch (zzml e) {
            throw zzku.m24722a(e, mo29443d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29439a(boolean z) throws zzku {
        super.mo29439a(z);
        this.f22291V.mo29504a(this.f22477T);
        int i = mo29448h().f22211a;
        if (i != 0) {
            this.f22292W.mo29516b(i);
        } else {
            this.f22292W.mo29524j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29437a(long j, boolean z) throws zzku {
        super.mo29437a(j, z);
        this.f22292W.mo29518d();
        this.f22298c0 = j;
        this.f22299d0 = true;
    }

    /* renamed from: a */
    public final zzln mo29526a(zzln zzln) {
        return this.f22292W.mo29508a(zzln);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29531a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzku {
        if (this.f22293X && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f22477T.f22329e++;
            this.f22292W.mo29520f();
            return true;
        } else {
            try {
                if (!this.f22292W.mo29514a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f22477T.f22328d++;
                return true;
            } catch (zzmm | zzmp e) {
                throw zzku.m24722a(e, mo29443d());
            }
        }
    }

    /* renamed from: a */
    public final void mo29435a(int i, Object obj) throws zzku {
        if (i == 2) {
            this.f22292W.mo29510a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.mo29435a(i, obj);
        } else {
            this.f22292W.mo29511a(((Integer) obj).intValue());
        }
    }
}
