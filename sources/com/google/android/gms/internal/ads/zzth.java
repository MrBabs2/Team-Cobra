package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class zzth extends zzpe {

    /* renamed from: B0 */
    private static final int[] f22690B0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: A0 */
    private int f22691A0;

    /* renamed from: V */
    private final Context f22692V;

    /* renamed from: W */
    private final zztl f22693W;

    /* renamed from: X */
    private final zzto f22694X;

    /* renamed from: Y */
    private final long f22695Y;

    /* renamed from: Z */
    private final int f22696Z;

    /* renamed from: a0 */
    private final boolean f22697a0;

    /* renamed from: b0 */
    private final long[] f22698b0;

    /* renamed from: c0 */
    private zzlh[] f22699c0;

    /* renamed from: d0 */
    private zztj f22700d0;

    /* renamed from: e0 */
    private Surface f22701e0;

    /* renamed from: f0 */
    private Surface f22702f0;

    /* renamed from: g0 */
    private int f22703g0;

    /* renamed from: h0 */
    private boolean f22704h0;

    /* renamed from: i0 */
    private long f22705i0;

    /* renamed from: j0 */
    private long f22706j0;

    /* renamed from: k0 */
    private int f22707k0;

    /* renamed from: l0 */
    private int f22708l0;

    /* renamed from: m0 */
    private int f22709m0;

    /* renamed from: n0 */
    private float f22710n0;

    /* renamed from: o0 */
    private int f22711o0;

    /* renamed from: p0 */
    private int f22712p0;

    /* renamed from: q0 */
    private int f22713q0;

    /* renamed from: r0 */
    private float f22714r0;

    /* renamed from: s0 */
    private int f22715s0;

    /* renamed from: t0 */
    private int f22716t0;

    /* renamed from: u0 */
    private int f22717u0;

    /* renamed from: v0 */
    private float f22718v0;

    /* renamed from: w0 */
    private boolean f22719w0;

    /* renamed from: x0 */
    private int f22720x0;

    /* renamed from: y0 */
    v30 f22721y0;

    /* renamed from: z0 */
    private long f22722z0;

    public zzth(Context context, zzpg zzpg, long j, Handler handler, zztn zztn, int i) {
        this(context, zzpg, 0, (zznj<Object>) null, false, handler, zztn, -1);
    }

    /* renamed from: A */
    private final void m25302A() {
        if (this.f22715s0 != this.f22711o0 || this.f22716t0 != this.f22712p0 || this.f22717u0 != this.f22713q0 || this.f22718v0 != this.f22714r0) {
            this.f22694X.mo29764a(this.f22711o0, this.f22712p0, this.f22713q0, this.f22714r0);
            this.f22715s0 = this.f22711o0;
            this.f22716t0 = this.f22712p0;
            this.f22717u0 = this.f22713q0;
            this.f22718v0 = this.f22714r0;
        }
    }

    /* renamed from: B */
    private final void m25303B() {
        this.f22705i0 = this.f22695Y > 0 ? SystemClock.elapsedRealtime() + this.f22695Y : -9223372036854775807L;
    }

    /* renamed from: C */
    private final void m25304C() {
        MediaCodec x;
        this.f22704h0 = false;
        if (zzsy.f22671a >= 23 && this.f22719w0 && (x = mo29612x()) != null) {
            this.f22721y0 = new v30(this, x);
        }
    }

    /* renamed from: D */
    private final void m25305D() {
        this.f22715s0 = -1;
        this.f22716t0 = -1;
        this.f22718v0 = -1.0f;
        this.f22717u0 = -1;
    }

    /* renamed from: E */
    private final void m25306E() {
        if (this.f22715s0 != -1 || this.f22716t0 != -1) {
            this.f22694X.mo29764a(this.f22711o0, this.f22712p0, this.f22713q0, this.f22714r0);
        }
    }

    /* renamed from: F */
    private final void m25307F() {
        if (this.f22707k0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f22694X.mo29765a(this.f22707k0, elapsedRealtime - this.f22706j0);
            this.f22707k0 = 0;
            this.f22706j0 = elapsedRealtime;
        }
    }

    /* renamed from: c */
    private static int m25314c(zzlh zzlh) {
        int i = zzlh.f22190l;
        if (i != -1) {
            return i;
        }
        return m25308a(zzlh.f22189k, zzlh.f22193o, zzlh.f22194p);
    }

    /* renamed from: c */
    private static boolean m25315c(long j) {
        return j < -30000;
    }

    /* renamed from: d */
    private static int m25316d(zzlh zzlh) {
        int i = zzlh.f22196r;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29525a(zzpg zzpg, zzlh zzlh) throws zzpk {
        boolean z;
        int i;
        int i2;
        String str = zzlh.f22189k;
        int i3 = 0;
        if (!zzsp.m25235c(str)) {
            return 0;
        }
        zzne zzne = zzlh.f22192n;
        if (zzne != null) {
            z = false;
            for (int i4 = 0; i4 < zzne.f22337h; i4++) {
                z |= zzne.mo29554a(i4).f22342j;
            }
        } else {
            z = false;
        }
        zzpd a = zzpg.mo26463a(str, z);
        boolean z2 = true;
        if (a == null) {
            return 1;
        }
        boolean a2 = a.mo29604a(zzlh.f22186h);
        if (a2 && (i = zzlh.f22193o) > 0 && (i2 = zzlh.f22194p) > 0) {
            if (zzsy.f22671a >= 21) {
                a2 = a.mo29603a(i, i2, (double) zzlh.f22195q);
            } else {
                if (i * i2 > zzpi.m25046b()) {
                    z2 = false;
                }
                if (!z2) {
                    int i5 = zzlh.f22193o;
                    int i6 = zzlh.f22194p;
                    String str2 = zzsy.f22675e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
                a2 = z2;
            }
        }
        int i7 = a.f22452b ? 8 : 4;
        if (a.f22453c) {
            i3 = 16;
        }
        return (a2 ? 3 : 2) | i7 | i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29533b(zzlh zzlh) throws zzku {
        super.mo29533b(zzlh);
        this.f22694X.mo29767a(zzlh);
        float f = zzlh.f22197s;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f22710n0 = f;
        this.f22709m0 = m25316d(zzlh);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo29444e() {
        super.mo29444e();
        this.f22707k0 = 0;
        this.f22706j0 = SystemClock.elapsedRealtime();
        this.f22705i0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo29445f() {
        m25307F();
        super.mo29445f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo29446g() {
        this.f22711o0 = -1;
        this.f22712p0 = -1;
        this.f22714r0 = -1.0f;
        this.f22710n0 = -1.0f;
        this.f22722z0 = -9223372036854775807L;
        this.f22691A0 = 0;
        m25305D();
        m25304C();
        this.f22693W.mo29762a();
        this.f22721y0 = null;
        this.f22719w0 = false;
        try {
            super.mo29446g();
        } finally {
            this.f22477T.mo29551a();
            this.f22694X.mo29770b(this.f22477T);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo29611k() {
        try {
            super.mo29611k();
        } finally {
            Surface surface = this.f22702f0;
            if (surface != null) {
                if (this.f22701e0 == surface) {
                    this.f22701e0 = null;
                }
                this.f22702f0.release();
                this.f22702f0 = null;
            }
        }
    }

    /* renamed from: m */
    public final boolean mo29481m() {
        Surface surface;
        if (super.mo29481m() && (this.f22704h0 || (((surface = this.f22702f0) != null && this.f22701e0 == surface) || mo29612x() == null))) {
            this.f22705i0 = -9223372036854775807L;
            return true;
        } else if (this.f22705i0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f22705i0) {
                return true;
            }
            this.f22705i0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo29760z() {
        if (!this.f22704h0) {
            this.f22704h0 = true;
            this.f22694X.mo29766a(this.f22701e0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzth(Context context, zzpg zzpg, long j, zznj<Object> zznj, boolean z, Handler handler, zztn zztn, int i) {
        super(2, zzpg, (zznj<Object>) null, false);
        boolean z2 = false;
        this.f22695Y = 0;
        this.f22696Z = -1;
        this.f22692V = context.getApplicationContext();
        this.f22693W = new zztl(context);
        this.f22694X = new zzto(handler, zztn);
        if (zzsy.f22671a <= 22 && "foster".equals(zzsy.f22672b) && "NVIDIA".equals(zzsy.f22673c)) {
            z2 = true;
        }
        this.f22697a0 = z2;
        this.f22698b0 = new long[10];
        this.f22722z0 = -9223372036854775807L;
        this.f22705i0 = -9223372036854775807L;
        this.f22711o0 = -1;
        this.f22712p0 = -1;
        this.f22714r0 = -1.0f;
        this.f22710n0 = -1.0f;
        this.f22703g0 = 1;
        m25305D();
    }

    /* renamed from: b */
    private final void m25312b(MediaCodec mediaCodec, int i, long j) {
        m25302A();
        zzsx.m25278a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzsx.m25277a();
        this.f22477T.f22328d++;
        this.f22708l0 = 0;
        mo29760z();
    }

    /* renamed from: b */
    private final boolean m25313b(boolean z) {
        if (zzsy.f22671a < 23 || this.f22719w0) {
            return false;
        }
        return !z || zztd.m25300a(this.f22692V);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29439a(boolean z) throws zzku {
        super.mo29439a(z);
        int i = mo29448h().f22211a;
        this.f22720x0 = i;
        this.f22719w0 = i != 0;
        this.f22694X.mo29768a(this.f22477T);
        this.f22693W.mo29763b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29440a(zzlh[] zzlhArr, long j) throws zzku {
        this.f22699c0 = zzlhArr;
        if (this.f22722z0 == -9223372036854775807L) {
            this.f22722z0 = j;
        } else {
            int i = this.f22691A0;
            long[] jArr = this.f22698b0;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.f22691A0 = i + 1;
            }
            this.f22698b0[this.f22691A0 - 1] = j;
        }
        super.mo29440a(zzlhArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29437a(long j, boolean z) throws zzku {
        super.mo29437a(j, z);
        m25304C();
        this.f22708l0 = 0;
        int i = this.f22691A0;
        if (i != 0) {
            this.f22722z0 = this.f22698b0[i - 1];
            this.f22691A0 = 0;
        }
        if (z) {
            m25303B();
        } else {
            this.f22705i0 = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public final void mo29435a(int i, Object obj) throws zzku {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f22702f0;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzpd y = mo29613y();
                    if (y != null && m25313b(y.f22454d)) {
                        surface = zztd.m25299a(this.f22692V, y.f22454d);
                        this.f22702f0 = surface;
                    }
                }
            }
            if (this.f22701e0 != surface) {
                this.f22701e0 = surface;
                int state = getState();
                if (state == 1 || state == 2) {
                    MediaCodec x = mo29612x();
                    if (zzsy.f22671a < 23 || x == null || surface == null) {
                        mo29611k();
                        mo29610j();
                    } else {
                        x.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f22702f0) {
                    m25305D();
                    m25304C();
                    return;
                }
                m25306E();
                m25304C();
                if (state == 2) {
                    m25303B();
                }
            } else if (surface != null && surface != this.f22702f0) {
                m25306E();
                if (this.f22704h0) {
                    this.f22694X.mo29766a(this.f22701e0);
                }
            }
        } else if (i == 4) {
            this.f22703g0 = ((Integer) obj).intValue();
            MediaCodec x2 = mo29612x();
            if (x2 != null) {
                x2.setVideoScalingMode(this.f22703g0);
            }
        } else {
            super.mo29435a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29609a(zzpd zzpd) {
        return this.f22701e0 != null || m25313b(zzpd.f22454d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29529a(zzpd zzpd, MediaCodec mediaCodec, zzlh zzlh, MediaCrypto mediaCrypto) throws zzpk {
        zztj zztj;
        Point point;
        zzpd zzpd2 = zzpd;
        MediaCodec mediaCodec2 = mediaCodec;
        zzlh zzlh2 = zzlh;
        zzlh[] zzlhArr = this.f22699c0;
        int i = zzlh2.f22193o;
        int i2 = zzlh2.f22194p;
        int c = m25314c(zzlh);
        if (zzlhArr.length == 1) {
            zztj = new zztj(i, i2, c);
        } else {
            boolean z = false;
            for (zzlh zzlh3 : zzlhArr) {
                if (m25311a(zzpd2.f22452b, zzlh2, zzlh3)) {
                    z |= zzlh3.f22193o == -1 || zzlh3.f22194p == -1;
                    i = Math.max(i, zzlh3.f22193o);
                    i2 = Math.max(i2, zzlh3.f22194p);
                    c = Math.max(c, m25314c(zzlh3));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzlh2.f22194p > zzlh2.f22193o;
                int i3 = z2 ? zzlh2.f22194p : zzlh2.f22193o;
                int i4 = z2 ? zzlh2.f22193o : zzlh2.f22194p;
                float f = ((float) i4) / ((float) i3);
                int[] iArr = f22690B0;
                int length = iArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    int i6 = length;
                    int i7 = iArr[i5];
                    int[] iArr2 = iArr;
                    int i8 = (int) (((float) i7) * f);
                    if (i7 <= i3 || i8 <= i4) {
                        break;
                    }
                    int i9 = i3;
                    int i10 = i4;
                    if (zzsy.f22671a >= 21) {
                        int i11 = z2 ? i8 : i7;
                        if (!z2) {
                            i7 = i8;
                        }
                        Point a = zzpd2.mo29601a(i11, i7);
                        Point point2 = a;
                        if (zzpd2.mo29603a(a.x, a.y, (double) zzlh2.f22195q)) {
                            point = point2;
                            break;
                        }
                    } else {
                        int a2 = zzsy.m25281a(i7, 16) << 4;
                        int a3 = zzsy.m25281a(i8, 16) << 4;
                        if (a2 * a3 <= zzpi.m25046b()) {
                            int i12 = z2 ? a3 : a2;
                            if (!z2) {
                                a2 = a3;
                            }
                            point = new Point(i12, a2);
                        }
                    }
                    i5++;
                    length = i6;
                    iArr = iArr2;
                    i3 = i9;
                    i4 = i10;
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    c = Math.max(c, m25308a(zzlh2.f22189k, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zztj = new zztj(i, i2, c);
        }
        this.f22700d0 = zztj;
        boolean z3 = this.f22697a0;
        int i13 = this.f22720x0;
        MediaFormat a4 = zzlh.mo29466a();
        a4.setInteger("max-width", zztj.f22723a);
        a4.setInteger("max-height", zztj.f22724b);
        int i14 = zztj.f22725c;
        if (i14 != -1) {
            a4.setInteger("max-input-size", i14);
        }
        if (z3) {
            a4.setInteger("auto-frc", 0);
        }
        if (i13 != 0) {
            a4.setFeatureEnabled("tunneled-playback", true);
            a4.setInteger("audio-session-id", i13);
        }
        if (this.f22701e0 == null) {
            zzsk.m25218b(m25313b(zzpd2.f22454d));
            if (this.f22702f0 == null) {
                this.f22702f0 = zztd.m25299a(this.f22692V, zzpd2.f22454d);
            }
            this.f22701e0 = this.f22702f0;
        }
        mediaCodec2.configure(a4, this.f22701e0, (MediaCrypto) null, 0);
        if (zzsy.f22671a >= 23 && this.f22719w0) {
            this.f22721y0 = new v30(this, mediaCodec2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29530a(String str, long j, long j2) {
        this.f22694X.mo29769a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29607a(zznd zznd) {
        if (zzsy.f22671a < 23 && this.f22719w0) {
            mo29760z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29528a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f22711o0 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f22712p0 = i2;
        this.f22714r0 = this.f22710n0;
        if (zzsy.f22671a >= 21) {
            int i3 = this.f22709m0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f22711o0;
                this.f22711o0 = this.f22712p0;
                this.f22712p0 = i4;
                this.f22714r0 = 1.0f / this.f22714r0;
            }
        } else {
            this.f22713q0 = this.f22709m0;
        }
        mediaCodec.setVideoScalingMode(this.f22703g0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29608a(MediaCodec mediaCodec, boolean z, zzlh zzlh, zzlh zzlh2) {
        if (!m25311a(z, zzlh, zzlh2)) {
            return false;
        }
        int i = zzlh2.f22193o;
        zztj zztj = this.f22700d0;
        return i <= zztj.f22723a && zzlh2.f22194p <= zztj.f22724b && zzlh2.f22190l <= zztj.f22725c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29531a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.f22691A0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.f22698b0;
            if (j4 < jArr[0]) {
                break;
            }
            this.f22722z0 = jArr[0];
            int i5 = i4 - 1;
            this.f22691A0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j5 = j4 - this.f22722z0;
        if (z) {
            m25309a(mediaCodec2, i3, j5);
            return true;
        }
        long j6 = j4 - j;
        if (this.f22701e0 == this.f22702f0) {
            if (!m25315c(j6)) {
                return false;
            }
            m25309a(mediaCodec2, i3, j5);
            return true;
        } else if (!this.f22704h0) {
            if (zzsy.f22671a >= 21) {
                m25310a(mediaCodec, i, j5, System.nanoTime());
            } else {
                m25312b(mediaCodec2, i3, j5);
            }
            return true;
        } else if (getState() != 2) {
            return false;
        } else {
            long elapsedRealtime = j6 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long a = this.f22693W.mo29761a(j4, (elapsedRealtime * 1000) + nanoTime);
            long j7 = (a - nanoTime) / 1000;
            if (m25315c(j7)) {
                zzsx.m25278a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                zzsx.m25277a();
                zznc zznc = this.f22477T;
                zznc.f22330f++;
                this.f22707k0++;
                int i6 = this.f22708l0 + 1;
                this.f22708l0 = i6;
                zznc.f22331g = Math.max(i6, zznc.f22331g);
                if (this.f22707k0 == this.f22696Z) {
                    m25307F();
                }
                return true;
            }
            if (zzsy.f22671a >= 21) {
                if (j7 < 50000) {
                    m25310a(mediaCodec, i, j5, a);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                m25312b(mediaCodec2, i3, j5);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m25309a(MediaCodec mediaCodec, int i, long j) {
        zzsx.m25278a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzsx.m25277a();
        this.f22477T.f22329e++;
    }

    @TargetApi(21)
    /* renamed from: a */
    private final void m25310a(MediaCodec mediaCodec, int i, long j, long j2) {
        m25302A();
        zzsx.m25278a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzsx.m25277a();
        this.f22477T.f22328d++;
        this.f22708l0 = 0;
        mo29760z();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m25308a(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L_0x0086
            if (r9 != r0) goto L_0x0007
            goto L_0x0086
        L_0x0007:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 4
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 0
            goto L_0x0051
        L_0x0050:
            r7 = -1
        L_0x0051:
            if (r7 == 0) goto L_0x007d
            if (r7 == r3) goto L_0x007d
            if (r7 == r6) goto L_0x0061
            if (r7 == r4) goto L_0x007d
            if (r7 == r5) goto L_0x005e
            if (r7 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r8 = r8 * r9
            goto L_0x0080
        L_0x0061:
            java.lang.String r7 = com.google.android.gms.internal.ads.zzsy.f22674d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x006c
            return r0
        L_0x006c:
            r7 = 16
            int r8 = com.google.android.gms.internal.ads.zzsy.m25281a((int) r8, (int) r7)
            int r7 = com.google.android.gms.internal.ads.zzsy.m25281a((int) r9, (int) r7)
            int r8 = r8 * r7
            int r7 = r8 << 4
            int r8 = r7 << 4
            goto L_0x007f
        L_0x007d:
            int r8 = r8 * r9
        L_0x007f:
            r5 = 2
        L_0x0080:
            int r8 = r8 * 3
            int r5 = r5 * 2
            int r8 = r8 / r5
            return r8
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzth.m25308a(java.lang.String, int, int):int");
    }

    /* renamed from: a */
    private static boolean m25311a(boolean z, zzlh zzlh, zzlh zzlh2) {
        if (!zzlh.f22189k.equals(zzlh2.f22189k) || m25316d(zzlh) != m25316d(zzlh2)) {
            return false;
        }
        if (!z) {
            return zzlh.f22193o == zzlh2.f22193o && zzlh.f22194p == zzlh2.f22194p;
        }
        return true;
    }
}
