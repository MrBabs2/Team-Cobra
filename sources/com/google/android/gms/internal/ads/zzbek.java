package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzk;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
@zzard
public final class zzbek extends zzbco implements TextureView.SurfaceTextureListener, zzbfi {

    /* renamed from: A */
    private float f18874A;

    /* renamed from: h */
    private final zzbdf f18875h;

    /* renamed from: i */
    private final zzbdg f18876i;

    /* renamed from: j */
    private final boolean f18877j;

    /* renamed from: k */
    private final zzbde f18878k;

    /* renamed from: l */
    private zzbcn f18879l;

    /* renamed from: m */
    private Surface f18880m;

    /* renamed from: n */
    private zzbfa f18881n;

    /* renamed from: o */
    private String f18882o;

    /* renamed from: p */
    private String[] f18883p;

    /* renamed from: q */
    private boolean f18884q;

    /* renamed from: r */
    private int f18885r = 1;

    /* renamed from: s */
    private zzbdd f18886s;

    /* renamed from: t */
    private final boolean f18887t;

    /* renamed from: u */
    private boolean f18888u;

    /* renamed from: v */
    private boolean f18889v;

    /* renamed from: w */
    private int f18890w;

    /* renamed from: x */
    private int f18891x;

    /* renamed from: y */
    private int f18892y;

    /* renamed from: z */
    private int f18893z;

    public zzbek(Context context, zzbdg zzbdg, zzbdf zzbdf, boolean z, boolean z2, zzbde zzbde) {
        super(context);
        this.f18877j = z2;
        this.f18875h = zzbdf;
        this.f18876i = zzbdg;
        this.f18887t = z;
        this.f18878k = zzbde;
        setSurfaceTextureListener(this);
        this.f18876i.mo27980a(this);
    }

    /* renamed from: a */
    private final void m20713a(Surface surface, boolean z) {
        zzbfa zzbfa = this.f18881n;
        if (zzbfa != null) {
            zzbfa.mo28039a(surface, z);
        } else {
            zzbad.m20523d("Trying to set surface before player is initalized.");
        }
    }

    /* renamed from: l */
    private final boolean m20715l() {
        return this.f18881n != null && !this.f18884q;
    }

    /* renamed from: m */
    private final boolean m20716m() {
        return m20715l() && this.f18885r != 1;
    }

    /* renamed from: n */
    private final void m20717n() {
        if (!this.f18888u) {
            this.f18888u = true;
            zzaxi.f18651h.post(new C7351c9(this));
            mo16504a();
            this.f18876i.mo27981b();
            if (this.f18889v) {
                mo16510c();
            }
        }
    }

    /* renamed from: o */
    private final zzbfa m20718o() {
        return new zzbfa(this.f18875h.getContext(), this.f18878k);
    }

    /* renamed from: p */
    private final String m20719p() {
        return zzk.zzlg().mo27794a(this.f18875h.getContext(), this.f18875h.mo25672b().f18742f);
    }

    /* renamed from: q */
    private final void m20720q() {
        String str;
        if (this.f18881n == null && (str = this.f18882o) != null && this.f18880m != null) {
            if (str.startsWith("cache:")) {
                zzbft d = this.f18875h.mo25681d(this.f18882o);
                if (d instanceof zzbgp) {
                    this.f18881n = ((zzbgp) d).mo28099c();
                } else if (d instanceof zzbgo) {
                    zzbgo zzbgo = (zzbgo) d;
                    String p = m20719p();
                    ByteBuffer c = zzbgo.mo28096c();
                    boolean e = zzbgo.mo28098e();
                    String d2 = zzbgo.mo28097d();
                    if (d2 == null) {
                        zzbad.m20523d("Stream cache URL is null.");
                        return;
                    }
                    zzbfa o = m20718o();
                    this.f18881n = o;
                    o.mo28056a(new Uri[]{Uri.parse(d2)}, p, c, e);
                } else {
                    String valueOf = String.valueOf(this.f18882o);
                    zzbad.m20523d(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.f18881n = m20718o();
                String p2 = m20719p();
                Uri[] uriArr = new Uri[this.f18883p.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.f18883p;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.f18881n.mo28055a(uriArr, p2);
            }
            this.f18881n.mo28040a((zzbfi) this);
            m20713a(this.f18880m, false);
            int o2 = this.f18881n.mo28062d().mo26395o();
            this.f18885r = o2;
            if (o2 == 3) {
                m20717n();
            }
        }
    }

    /* renamed from: r */
    private final void m20721r() {
        m20714c(this.f18890w, this.f18891x);
    }

    /* renamed from: s */
    private final void m20722s() {
        zzbfa zzbfa = this.f18881n;
        if (zzbfa != null) {
            zzbfa.mo28060b(true);
        }
    }

    /* renamed from: t */
    private final void m20723t() {
        zzbfa zzbfa = this.f18881n;
        if (zzbfa != null) {
            zzbfa.mo28060b(false);
        }
    }

    /* renamed from: b */
    public final void mo16508b() {
        if (m20716m()) {
            if (this.f18878k.f18827a) {
                m20723t();
            }
            this.f18881n.mo28062d().mo26386a(false);
            this.f18876i.mo27984d();
            this.f8025g.mo27989c();
            zzaxi.f18651h.post(new C7498g9(this));
        }
    }

    /* renamed from: c */
    public final void mo16510c() {
        if (m20716m()) {
            if (this.f18878k.f18827a) {
                m20722s();
            }
            this.f18881n.mo28062d().mo26386a(true);
            this.f18876i.mo27983c();
            this.f8025g.mo27988b();
            this.f8024f.mo27965a();
            zzaxi.f18651h.post(new C7462f9(this));
            return;
        }
        this.f18889v = true;
    }

    /* renamed from: d */
    public final void mo16512d() {
        if (m20715l()) {
            this.f18881n.mo28062d().stop();
            if (this.f18881n != null) {
                m20713a((Surface) null, true);
                zzbfa zzbfa = this.f18881n;
                if (zzbfa != null) {
                    zzbfa.mo28040a((zzbfi) null);
                    this.f18881n.mo28061c();
                    this.f18881n = null;
                }
                this.f18885r = 1;
                this.f18884q = false;
                this.f18888u = false;
                this.f18889v = false;
            }
        }
        this.f18876i.mo27984d();
        this.f8025g.mo27989c();
        this.f18876i.mo27979a();
    }

    /* renamed from: e */
    public final String mo16514e() {
        String str = this.f18887t ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    /* renamed from: f */
    public final void mo16516f(int i) {
        zzbfa zzbfa = this.f18881n;
        if (zzbfa != null) {
            zzbfa.mo28063e().mo28026b(i);
        }
    }

    /* renamed from: g */
    public final void mo16517g(int i) {
        zzbfa zzbfa = this.f18881n;
        if (zzbfa != null) {
            zzbfa.mo28035a(i);
        }
    }

    public final int getCurrentPosition() {
        if (m20716m()) {
            return (int) this.f18881n.mo28062d().mo26391c();
        }
        return 0;
    }

    public final int getDuration() {
        if (m20716m()) {
            return (int) this.f18881n.mo28062d().mo26393e();
        }
        return 0;
    }

    public final int getVideoHeight() {
        return this.f18891x;
    }

    public final int getVideoWidth() {
        return this.f18890w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo28010h(int i) {
        zzbcn zzbcn = this.f18879l;
        if (zzbcn != null) {
            zzbcn.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo28011i() {
        zzbcn zzbcn = this.f18879l;
        if (zzbcn != null) {
            zzbcn.mo27933g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo28012j() {
        zzbcn zzbcn = this.f18879l;
        if (zzbcn != null) {
            zzbcn.mo27932f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo28013k() {
        zzbcn zzbcn = this.f18879l;
        if (zzbcn != null) {
            zzbcn.mo27927a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[LOOP:0: B:30:0x007a->B:35:0x0095, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredWidth()
            int r12 = r10.getMeasuredHeight()
            float r0 = r10.f18874A
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzbdd r2 = r10.f18886s
            if (r2 != 0) goto L_0x002a
            float r2 = (float) r11
            float r3 = (float) r12
            float r3 = r2 / r3
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            float r2 = r2 / r0
            int r12 = (int) r2
        L_0x0020:
            float r0 = r10.f18874A
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x002a
            float r11 = (float) r12
            float r11 = r11 * r0
            int r11 = (int) r11
        L_0x002a:
            r10.setMeasuredDimension(r11, r12)
            com.google.android.gms.internal.ads.zzbdd r0 = r10.f18886s
            if (r0 == 0) goto L_0x0034
            r0.mo27971a((int) r11, (int) r12)
        L_0x0034:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00a2
            int r0 = r10.f18892y
            if (r0 <= 0) goto L_0x0040
            if (r0 != r11) goto L_0x0046
        L_0x0040:
            int r0 = r10.f18893z
            if (r0 <= 0) goto L_0x009e
            if (r0 == r12) goto L_0x009e
        L_0x0046:
            boolean r0 = r10.f18877j
            if (r0 == 0) goto L_0x009e
            boolean r0 = r10.m20715l()
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzbfa r0 = r10.f18881n
            com.google.android.gms.internal.ads.zzkv r0 = r0.mo28062d()
            long r2 = r0.mo26391c()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x009e
            boolean r2 = r0.mo26392d()
            if (r2 == 0) goto L_0x0067
            goto L_0x009e
        L_0x0067:
            r2 = 1
            r10.m20712a((float) r1, (boolean) r2)
            r0.mo26386a((boolean) r2)
            long r1 = r0.mo26391c()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzk.zzln()
            long r3 = r3.mo25498b()
        L_0x007a:
            boolean r5 = r10.m20715l()
            if (r5 == 0) goto L_0x0097
            long r5 = r0.mo26391c()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0097
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzk.zzln()
            long r5 = r5.mo25498b()
            long r5 = r5 - r3
            r7 = 250(0xfa, double:1.235E-321)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x007a
        L_0x0097:
            r1 = 0
            r0.mo26386a((boolean) r1)
            r10.mo16504a()
        L_0x009e:
            r10.f18892y = r11
            r10.f18893z = r12
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbek.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f18887t) {
            zzbdd zzbdd = new zzbdd(getContext());
            this.f18886s = zzbdd;
            zzbdd.mo27972a(surfaceTexture, i, i2);
            this.f18886s.start();
            SurfaceTexture c = this.f18886s.mo27974c();
            if (c != null) {
                surfaceTexture = c;
            } else {
                this.f18886s.mo27973b();
                this.f18886s = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f18880m = surface;
        if (this.f18881n == null) {
            m20720q();
        } else {
            m20713a(surface, true);
            if (!this.f18878k.f18827a) {
                m20722s();
            }
        }
        if (this.f18890w == 0 || this.f18891x == 0) {
            m20714c(i, i2);
        } else {
            m20721r();
        }
        zzaxi.f18651h.post(new C7535h9(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo16508b();
        zzbdd zzbdd = this.f18886s;
        if (zzbdd != null) {
            zzbdd.mo27973b();
            this.f18886s = null;
        }
        if (this.f18881n != null) {
            m20723t();
            Surface surface = this.f18880m;
            if (surface != null) {
                surface.release();
            }
            this.f18880m = null;
            m20713a((Surface) null, true);
        }
        zzaxi.f18651h.post(new C7613j9(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzbdd zzbdd = this.f18886s;
        if (zzbdd != null) {
            zzbdd.mo27971a(i, i2);
        }
        zzaxi.f18651h.post(new C7572i9(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f18876i.mo27982b(this);
        this.f8024f.mo27966a(surfaceTexture, this.f18879l);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        zzawz.m20167e(sb.toString());
        zzaxi.f18651h.post(new C7650k9(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.f18882o = str;
            this.f18883p = new String[]{str};
            m20720q();
        }
    }

    /* renamed from: e */
    public final void mo16515e(int i) {
        zzbfa zzbfa = this.f18881n;
        if (zzbfa != null) {
            zzbfa.mo28063e().mo28021a(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo28008g() {
        zzbcn zzbcn = this.f18879l;
        if (zzbcn != null) {
            zzbcn.mo27934h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo28009h() {
        zzbcn zzbcn = this.f18879l;
        if (zzbcn != null) {
            zzbcn.mo27935i();
        }
    }

    /* renamed from: a */
    private final void m20712a(float f, boolean z) {
        zzbfa zzbfa = this.f18881n;
        if (zzbfa != null) {
            zzbfa.mo28034a(f, z);
        } else {
            zzbad.m20523d("Trying to set volume before player is initalized.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo28007f() {
        zzbcn zzbcn = this.f18879l;
        if (zzbcn != null) {
            zzbcn.mo27931e();
        }
    }

    /* renamed from: a */
    public final void mo16504a() {
        m20712a(this.f8025g.mo27985a(), false);
    }

    /* renamed from: a */
    public final void mo16506a(zzbcn zzbcn) {
        this.f18879l = zzbcn;
    }

    /* renamed from: b */
    public final void mo16509b(int i) {
        if (m20716m()) {
            this.f18881n.mo28062d().mo26382a((long) i);
        }
    }

    /* renamed from: a */
    public final void mo16507a(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.f18882o = str;
            this.f18883p = (String[]) Arrays.copyOf(strArr, strArr.length);
            m20720q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28006b(boolean z, long j) {
        this.f18875h.mo25670a(z, j);
    }

    /* renamed from: c */
    public final void mo16511c(int i) {
        zzbfa zzbfa = this.f18881n;
        if (zzbfa != null) {
            zzbfa.mo28063e().mo28028c(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28005b(int i, int i2) {
        zzbcn zzbcn = this.f18879l;
        if (zzbcn != null) {
            zzbcn.mo27928a(i, i2);
        }
    }

    /* renamed from: c */
    private final void m20714c(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.f18874A != f) {
            this.f18874A = f;
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo16505a(float f, float f2) {
        zzbdd zzbdd = this.f18886s;
        if (zzbdd != null) {
            zzbdd.mo27970a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo28004a(boolean z, long j) {
        if (this.f18875h != null) {
            zzbbm.f18748a.execute(new C7687l9(this, z, j));
        }
    }

    /* renamed from: d */
    public final void mo16513d(int i) {
        zzbfa zzbfa = this.f18881n;
        if (zzbfa != null) {
            zzbfa.mo28063e().mo28030d(i);
        }
    }

    /* renamed from: a */
    public final void mo28000a(int i) {
        if (this.f18885r != i) {
            this.f18885r = i;
            if (i == 3) {
                m20717n();
            } else if (i == 4) {
                if (this.f18878k.f18827a) {
                    m20723t();
                }
                this.f18876i.mo27984d();
                this.f8025g.mo27989c();
                zzaxi.f18651h.post(new C7388d9(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo28001a(int i, int i2) {
        this.f18890w = i;
        this.f18891x = i2;
        m20721r();
    }

    /* renamed from: a */
    public final void mo28003a(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        zzbad.m20523d(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.f18884q = true;
        if (this.f18878k.f18827a) {
            m20723t();
        }
        zzaxi.f18651h.post(new C7425e9(this, sb2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28002a(String str) {
        zzbcn zzbcn = this.f18879l;
        if (zzbcn != null) {
            zzbcn.mo27929a("ExoPlayerAdapter error", str);
        }
    }
}
