package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.SideEffectFree;

@TargetApi(16)
@zzard
public final class zzbdq extends zzbco implements TextureView.SurfaceTextureListener {

    /* renamed from: A */
    private boolean f8026A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f8027B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f8028C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public float f8029D;

    /* renamed from: E */
    private int f8030E;

    /* renamed from: F */
    private int f8031F;

    /* renamed from: G */
    private final zzgh f8032G = new C8167y8(this);

    /* renamed from: H */
    private final zzhh f8033H = new C8204z8(this);

    /* renamed from: I */
    private final zzgq f8034I = new C7277a9(this);

    /* renamed from: h */
    private float f8035h;

    /* renamed from: i */
    private final zzbdf f8036i;

    /* renamed from: j */
    private final Context f8037j;

    /* renamed from: k */
    private final int f8038k;

    /* renamed from: l */
    private final zzbdg f8039l;

    /* renamed from: m */
    private final boolean f8040m;

    /* renamed from: n */
    private final zzbde f8041n;

    /* renamed from: o */
    private zzbcn f8042o;

    /* renamed from: p */
    private Surface f8043p;

    /* renamed from: q */
    private zzbdk f8044q;

    /* renamed from: r */
    private zzge f8045r;

    /* renamed from: s */
    private zzhd f8046s;

    /* renamed from: t */
    private zzgn f8047t;

    /* renamed from: u */
    private String f8048u;

    /* renamed from: v */
    private boolean f8049v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f8050w = 1;

    /* renamed from: x */
    private zzbdd f8051x;

    /* renamed from: y */
    private boolean f8052y;

    /* renamed from: z */
    private boolean f8053z;

    public zzbdq(Context context, zzbdg zzbdg, zzbdf zzbdf, int i, boolean z, boolean z2, zzbde zzbde) {
        super(context);
        this.f8037j = context;
        this.f8040m = z2;
        this.f8036i = zzbdf;
        this.f8038k = i;
        this.f8039l = zzbdg;
        this.f8052y = z;
        this.f8041n = zzbde;
        setSurfaceTextureListener(this);
        this.f8039l.mo27980a(this);
    }

    @SideEffectFree
    /* renamed from: a */
    private final void m7758a(Surface surface, boolean z) {
        zzhd zzhd;
        zzge zzge = this.f8045r;
        if (zzge == null || (zzhd = this.f8046s) == null) {
            zzbad.m20523d("Trying to set surface before player and renderers are initalized.");
        } else if (z) {
            zzge.mo26844a(zzhd, 1, surface);
        } else {
            zzge.mo26849b(zzhd, 1, surface);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m7763b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(str2).length());
        sb.append("Error received: ");
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        zzbad.m20523d(sb.toString());
        this.f8049v = true;
        if (this.f8041n.f18827a) {
            m7775r();
        }
        zzaxi.f18651h.post(new C7945s8(this, str, str2));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m7769l() {
        zzawz.m20167e("Video ended.");
        if (this.f8041n.f18827a) {
            m7775r();
        }
        this.f8039l.mo27984d();
        this.f8025g.mo27989c();
        zzaxi.f18651h.post(new C7908r8(this));
    }

    @EnsuresNonNullIf(expression = {"mPlayer"}, result = true)
    /* renamed from: m */
    private final boolean m7770m() {
        return this.f8045r != null && !this.f8049v;
    }

    @EnsuresNonNullIf(expression = {"mPlayer"}, result = true)
    /* renamed from: n */
    private final boolean m7771n() {
        return m7770m() && this.f8050w != 1;
    }

    /* JADX WARNING: type inference failed for: r0v32, types: [com.google.android.gms.internal.ads.zzgl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7772o() {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzge r0 = r14.f8045r
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = r14.f8048u
            if (r0 == 0) goto L_0x0218
            android.view.Surface r1 = r14.f8043p
            if (r1 == 0) goto L_0x0218
            java.lang.String r1 = "cache:"
            boolean r0 = r0.startsWith(r1)
            java.lang.String r1 = "AdExoPlayerHelper Error"
            java.lang.String r2 = "video/webm"
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x012c
            com.google.android.gms.internal.ads.zzbdf r0 = r14.f8036i
            java.lang.String r5 = r14.f8048u
            com.google.android.gms.internal.ads.zzbft r0 = r0.mo25681d(r5)
            if (r0 == 0) goto L_0x003d
            boolean r5 = r0 instanceof com.google.android.gms.internal.ads.zzbgl
            if (r5 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.zzbgl r0 = (com.google.android.gms.internal.ads.zzbgl) r0
            r0.mo28094d()
            com.google.android.gms.internal.ads.zzbdk r4 = r0.mo28095e()
            com.google.android.gms.internal.ads.zzgh r0 = r14.f8032G
            com.google.android.gms.internal.ads.zzhh r1 = r14.f8033H
            com.google.android.gms.internal.ads.zzgq r2 = r14.f8034I
            r4.mo27993a((com.google.android.gms.internal.ads.zzgh) r0, (com.google.android.gms.internal.ads.zzhh) r1, (com.google.android.gms.internal.ads.zzgq) r2)
            goto L_0x01ca
        L_0x003d:
            boolean r5 = r0 instanceof com.google.android.gms.internal.ads.zzbgg
            if (r5 == 0) goto L_0x010e
            com.google.android.gms.internal.ads.zzbgg r0 = (com.google.android.gms.internal.ads.zzbgg) r0
            java.nio.ByteBuffer r5 = r0.mo28088c()
            java.lang.String r6 = r0.mo28089d()
            boolean r0 = r0.mo28090e()
            com.google.android.gms.internal.ads.zzbdk r7 = new com.google.android.gms.internal.ads.zzbdk
            r7.<init>()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.zzjg r2 = new com.google.android.gms.internal.ads.zzjg
            r2.<init>()
            goto L_0x0065
        L_0x0060:
            com.google.android.gms.internal.ads.zziv r2 = new com.google.android.gms.internal.ads.zziv
            r2.<init>()
        L_0x0065:
            r11 = r2
            if (r0 == 0) goto L_0x008c
            int r0 = r5.limit()
            if (r0 <= 0) goto L_0x008c
            int r0 = r5.limit()
            byte[] r0 = new byte[r0]
            r5.get(r0)
            com.google.android.gms.internal.ads.zzjo r10 = new com.google.android.gms.internal.ads.zzjo
            r10.<init>(r0)
            com.google.android.gms.internal.ads.zzig r0 = new com.google.android.gms.internal.ads.zzig
            android.net.Uri r9 = android.net.Uri.parse(r6)
            r12 = 2
            com.google.android.gms.internal.ads.zzbde r2 = r14.f8041n
            int r13 = r2.f18829c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00f7
        L_0x008c:
            com.google.android.gms.internal.ads.zzaxi r0 = com.google.android.gms.ads.internal.zzk.zzlg()
            com.google.android.gms.internal.ads.zzbdf r2 = r14.f8036i
            android.content.Context r2 = r2.getContext()
            com.google.android.gms.internal.ads.zzbdf r4 = r14.f8036i
            com.google.android.gms.internal.ads.zzbai r4 = r4.mo25672b()
            java.lang.String r4 = r4.f18742f
            java.lang.String r0 = r0.mo27794a((android.content.Context) r2, (java.lang.String) r4)
            com.google.android.gms.internal.ads.zzjt r2 = new com.google.android.gms.internal.ads.zzjt
            com.google.android.gms.internal.ads.zzbdf r4 = r14.f8036i
            android.content.Context r4 = r4.getContext()
            r2.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17859V1
            com.google.android.gms.internal.ads.zzacr r4 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r0 = r4.mo27163a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00cc
            com.google.android.gms.internal.ads.zzbeh r0 = new com.google.android.gms.internal.ads.zzbeh
            android.content.Context r4 = r14.f8037j
            com.google.android.gms.internal.ads.m8 r8 = new com.google.android.gms.internal.ads.m8
            r8.<init>(r14)
            r0.<init>(r4, r2, r8)
            r2 = r0
        L_0x00cc:
            int r0 = r5.limit()
            if (r0 <= 0) goto L_0x00e7
            int r0 = r5.limit()
            byte[] r4 = new byte[r0]
            r5.get(r4)
            com.google.android.gms.internal.ads.zzjo r5 = new com.google.android.gms.internal.ads.zzjo
            r5.<init>(r4)
            com.google.android.gms.internal.ads.b9 r4 = new com.google.android.gms.internal.ads.b9
            r4.<init>(r5, r0, r2)
            r10 = r4
            goto L_0x00e8
        L_0x00e7:
            r10 = r2
        L_0x00e8:
            com.google.android.gms.internal.ads.zzig r0 = new com.google.android.gms.internal.ads.zzig
            android.net.Uri r9 = android.net.Uri.parse(r6)
            r12 = 2
            com.google.android.gms.internal.ads.zzbde r2 = r14.f8041n
            int r13 = r2.f18829c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00f7:
            com.google.android.gms.internal.ads.zzgh r2 = r14.f8032G
            com.google.android.gms.internal.ads.zzhh r4 = r14.f8033H
            com.google.android.gms.internal.ads.zzgq r5 = r14.f8034I
            r7.mo27993a((com.google.android.gms.internal.ads.zzgh) r2, (com.google.android.gms.internal.ads.zzhh) r4, (com.google.android.gms.internal.ads.zzgq) r5)
            boolean r0 = r7.mo27994a((com.google.android.gms.internal.ads.zzhn) r0)
            if (r0 != 0) goto L_0x010b
            java.lang.String r0 = "Prepare from ByteBuffer failed."
            r14.m7763b((java.lang.String) r1, (java.lang.String) r0)
        L_0x010b:
            r4 = r7
            goto L_0x01ca
        L_0x010e:
            java.lang.String r0 = "Source is MD5 but not found in cache. Source: "
            java.lang.String r1 = r14.f8048u
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0121
            java.lang.String r0 = r0.concat(r1)
            goto L_0x0127
        L_0x0121:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x0127:
            com.google.android.gms.internal.ads.zzbad.m20523d(r0)
            goto L_0x01ca
        L_0x012c:
            int r0 = r14.f8038k
            r5 = 2
            r6 = 1
            if (r0 != r6) goto L_0x0145
            com.google.android.gms.internal.ads.zzgl r0 = new com.google.android.gms.internal.ads.zzgl
            com.google.android.gms.internal.ads.zzbdf r2 = r14.f8036i
            android.content.Context r2 = r2.getContext()
            java.lang.String r6 = r14.f8048u
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r0.<init>(r2, r6, r4, r5)
            goto L_0x01b1
        L_0x0145:
            if (r0 != r5) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r6 = 0
        L_0x0149:
            com.google.android.gms.common.internal.Preconditions.m16043a((boolean) r6)
            com.google.android.gms.internal.ads.zzaxi r0 = com.google.android.gms.ads.internal.zzk.zzlg()
            com.google.android.gms.internal.ads.zzbdf r5 = r14.f8036i
            android.content.Context r5 = r5.getContext()
            com.google.android.gms.internal.ads.zzbdf r6 = r14.f8036i
            com.google.android.gms.internal.ads.zzbai r6 = r6.mo25672b()
            java.lang.String r6 = r6.f18742f
            java.lang.String r0 = r0.mo27794a((android.content.Context) r5, (java.lang.String) r6)
            com.google.android.gms.internal.ads.zzjt r5 = new com.google.android.gms.internal.ads.zzjt
            com.google.android.gms.internal.ads.zzbdf r6 = r14.f8036i
            android.content.Context r6 = r6.getContext()
            r5.<init>(r6, r0)
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17859V1
            com.google.android.gms.internal.ads.zzacr r6 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r0 = r6.mo27163a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x018d
            com.google.android.gms.internal.ads.zzbeh r0 = new com.google.android.gms.internal.ads.zzbeh
            android.content.Context r6 = r14.f8037j
            com.google.android.gms.internal.ads.l8 r7 = new com.google.android.gms.internal.ads.l8
            r7.<init>(r14)
            r0.<init>(r6, r5, r7)
            r10 = r0
            goto L_0x018e
        L_0x018d:
            r10 = r5
        L_0x018e:
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L_0x019a
            com.google.android.gms.internal.ads.zzjg r0 = new com.google.android.gms.internal.ads.zzjg
            r0.<init>()
            goto L_0x019f
        L_0x019a:
            com.google.android.gms.internal.ads.zziv r0 = new com.google.android.gms.internal.ads.zziv
            r0.<init>()
        L_0x019f:
            r11 = r0
            com.google.android.gms.internal.ads.zzig r0 = new com.google.android.gms.internal.ads.zzig
            java.lang.String r2 = r14.f8048u
            android.net.Uri r9 = android.net.Uri.parse(r2)
            r12 = 2
            com.google.android.gms.internal.ads.zzbde r2 = r14.f8041n
            int r13 = r2.f18829c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x01b1:
            com.google.android.gms.internal.ads.zzbdk r4 = new com.google.android.gms.internal.ads.zzbdk
            r4.<init>()
            com.google.android.gms.internal.ads.zzgh r2 = r14.f8032G
            com.google.android.gms.internal.ads.zzhh r5 = r14.f8033H
            com.google.android.gms.internal.ads.zzgq r6 = r14.f8034I
            r4.mo27993a((com.google.android.gms.internal.ads.zzgh) r2, (com.google.android.gms.internal.ads.zzhh) r5, (com.google.android.gms.internal.ads.zzgq) r6)
            boolean r0 = r4.mo27994a((com.google.android.gms.internal.ads.zzhn) r0)
            if (r0 != 0) goto L_0x01ca
            java.lang.String r0 = "Prepare failed."
            r14.m7763b((java.lang.String) r1, (java.lang.String) r0)
        L_0x01ca:
            r14.f8044q = r4
            if (r4 != 0) goto L_0x01eb
            java.lang.String r0 = "AdExoPlayerHelper is null. Source: "
            java.lang.String r1 = r14.f8048u
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x01e1
            java.lang.String r0 = r0.concat(r1)
            goto L_0x01e7
        L_0x01e1:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x01e7:
            com.google.android.gms.internal.ads.zzbad.m20523d(r0)
            return
        L_0x01eb:
            com.google.android.gms.internal.ads.zzge r0 = r4.mo27996c()
            r14.f8045r = r0
            com.google.android.gms.internal.ads.zzbdk r0 = r14.f8044q
            com.google.android.gms.internal.ads.zzhd r0 = r0.mo27997d()
            r14.f8046s = r0
            com.google.android.gms.internal.ads.zzbdk r0 = r14.f8044q
            com.google.android.gms.internal.ads.zzgn r0 = r0.mo27998e()
            r14.f8047t = r0
            com.google.android.gms.internal.ads.zzge r0 = r14.f8045r
            if (r0 == 0) goto L_0x0218
            android.view.Surface r0 = r14.f8043p
            r14.m7758a((android.view.Surface) r0, (boolean) r3)
            com.google.android.gms.internal.ads.zzge r0 = r14.f8045r
            int r0 = r0.mo26853o()
            r14.f8050w = r0
            r1 = 4
            if (r0 != r1) goto L_0x0218
            r14.m7773p()
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdq.m7772o():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m7773p() {
        if (!this.f8053z) {
            this.f8053z = true;
            zzawz.m20167e("Video is ready.");
            zzaxi.f18651h.post(new C7871q8(this));
            mo16504a();
            this.f8039l.mo27981b();
            if (this.f8026A) {
                mo16510c();
            }
        }
    }

    /* renamed from: q */
    private final void m7774q() {
        zzge zzge = this.f8045r;
        if (zzge != null) {
            zzge.mo26841a(0, true);
        }
    }

    /* renamed from: r */
    private final void m7775r() {
        zzge zzge = this.f8045r;
        if (zzge != null) {
            zzge.mo26841a(0, false);
        }
    }

    /* renamed from: c */
    public final void mo16510c() {
        if (m7771n()) {
            if (this.f8041n.f18827a) {
                m7774q();
            }
            this.f8045r.mo26846a(true);
            this.f8039l.mo27983c();
            this.f8025g.mo27988b();
            this.f8024f.mo27965a();
            zzaxi.f18651h.post(new C7982t8(this));
            return;
        }
        this.f8026A = true;
    }

    /* renamed from: d */
    public final void mo16512d() {
        if (m7770m()) {
            this.f8045r.stop();
            if (this.f8045r != null) {
                m7758a((Surface) null, true);
                zzbdk zzbdk = this.f8044q;
                if (zzbdk != null) {
                    zzbdk.mo27995b();
                    this.f8044q = null;
                }
                this.f8045r = null;
                this.f8046s = null;
                this.f8047t = null;
                this.f8050w = 1;
                this.f8049v = false;
                this.f8053z = false;
                this.f8026A = false;
            }
        }
        this.f8039l.mo27984d();
        this.f8025g.mo27989c();
        this.f8039l.mo27979a();
    }

    /* renamed from: e */
    public final String mo16514e() {
        String str;
        int i = this.f8038k;
        if (i == 1) {
            str = "/Framework";
        } else if (i == 2) {
            StringBuilder sb = new StringBuilder("null".length() + 12);
            sb.append("/Extractor(");
            sb.append((String) null);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "/Unknown";
        }
        String str2 = this.f8052y ? " spherical" : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + str2.length());
        sb2.append("ExoPlayer/1");
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo16527f() {
        zzbcn zzbcn = this.f8042o;
        if (zzbcn != null) {
            zzbcn.mo27931e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo16528g() {
        zzbcn zzbcn = this.f8042o;
        if (zzbcn != null) {
            zzbcn.mo27934h();
        }
    }

    public final int getCurrentPosition() {
        if (m7771n()) {
            return (int) this.f8045r.mo26850c();
        }
        return 0;
    }

    public final int getDuration() {
        if (m7771n()) {
            return (int) this.f8045r.mo26852e();
        }
        return 0;
    }

    public final int getVideoHeight() {
        return this.f8028C;
    }

    public final int getVideoWidth() {
        return this.f8027B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo16530h(int i) {
        zzbcn zzbcn = this.f8042o;
        if (zzbcn != null) {
            zzbcn.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo16531i() {
        zzbcn zzbcn = this.f8042o;
        if (zzbcn != null) {
            zzbcn.mo27933g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo16532j() {
        zzbcn zzbcn = this.f8042o;
        if (zzbcn != null) {
            zzbcn.mo27932f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo16533k() {
        zzbcn zzbcn = this.f8042o;
        if (zzbcn != null) {
            zzbcn.mo27927a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[LOOP:0: B:30:0x0084->B:35:0x00a1, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            int r10 = r9.getMeasuredWidth()
            int r11 = r9.getMeasuredHeight()
            float r0 = r9.f8035h
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzbdd r2 = r9.f8051x
            if (r2 != 0) goto L_0x0033
            float r2 = (float) r10
            float r3 = (float) r11
            float r4 = r2 / r3
            float r4 = r0 / r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0029
            float r2 = r2 / r0
            int r11 = (int) r2
            goto L_0x0033
        L_0x0029:
            r2 = -1138501878(0xffffffffbc23d70a, float:-0.01)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0033
            float r3 = r3 * r0
            int r10 = (int) r3
        L_0x0033:
            r9.setMeasuredDimension(r10, r11)
            com.google.android.gms.internal.ads.zzbdd r0 = r9.f8051x
            if (r0 == 0) goto L_0x003d
            r0.mo27971a((int) r10, (int) r11)
        L_0x003d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00b6
            int r0 = r9.f8030E
            if (r0 <= 0) goto L_0x0049
            if (r0 != r10) goto L_0x004f
        L_0x0049:
            int r0 = r9.f8031F
            if (r0 <= 0) goto L_0x00b2
            if (r0 == r11) goto L_0x00b2
        L_0x004f:
            boolean r0 = r9.f8040m
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r9.m7770m()
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzge r0 = r9.f8045r
            long r2 = r0.mo26850c()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzge r0 = r9.f8045r
            boolean r0 = r0.mo26851d()
            if (r0 != 0) goto L_0x00b2
            r0 = 1
            r9.m7756a((float) r1, (boolean) r0)
            com.google.android.gms.internal.ads.zzge r1 = r9.f8045r
            r1.mo26846a((boolean) r0)
            com.google.android.gms.internal.ads.zzge r0 = r9.f8045r
            long r0 = r0.mo26850c()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzk.zzln()
            long r2 = r2.mo25498b()
        L_0x0084:
            boolean r4 = r9.m7770m()
            if (r4 == 0) goto L_0x00a3
            com.google.android.gms.internal.ads.zzge r4 = r9.f8045r
            long r4 = r4.mo26850c()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00a3
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzk.zzln()
            long r4 = r4.mo25498b()
            long r4 = r4 - r2
            r6 = 250(0xfa, double:1.235E-321)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0084
        L_0x00a3:
            boolean r0 = r9.m7770m()
            if (r0 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzge r0 = r9.f8045r
            r1 = 0
            r0.mo26846a((boolean) r1)
        L_0x00af:
            r9.mo16504a()
        L_0x00b2:
            r9.f8030E = r10
            r9.f8031F = r11
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdq.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3;
        if (this.f8052y) {
            zzbdd zzbdd = new zzbdd(getContext());
            this.f8051x = zzbdd;
            zzbdd.mo27972a(surfaceTexture, i, i2);
            this.f8051x.start();
            SurfaceTexture c = this.f8051x.mo27974c();
            if (c != null) {
                surfaceTexture = c;
            } else {
                this.f8051x.mo27973b();
                this.f8051x = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f8043p = surface;
        if (this.f8045r == null) {
            m7772o();
        } else {
            m7758a(surface, true);
            if (!this.f8041n.f18827a) {
                m7774q();
            }
        }
        float f = 1.0f;
        int i4 = this.f8027B;
        if (!(i4 == 0 || (i3 = this.f8028C) == 0)) {
            f = this.f8029D;
            i = i4;
            i2 = i3;
        }
        m7757a(i, i2, f);
        zzaxi.f18651h.post(new C8056v8(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzawz.m20167e("Surface destroyed");
        mo16508b();
        zzbdd zzbdd = this.f8051x;
        if (zzbdd != null) {
            zzbdd.mo27973b();
            this.f8051x = null;
        }
        if (this.f8045r != null) {
            m7775r();
            Surface surface = this.f8043p;
            if (surface != null) {
                surface.release();
            }
            this.f8043p = null;
            m7758a((Surface) null, true);
        }
        zzaxi.f18651h.post(new C8130x8(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzbdd zzbdd = this.f8051x;
        if (zzbdd != null) {
            zzbdd.mo27971a(i, i2);
        }
        zzaxi.f18651h.post(new C8093w8(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f8039l.mo27982b(this);
        this.f8024f.mo27966a(surfaceTexture, this.f8042o);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView1 window visibility changed to ");
        sb.append(i);
        zzawz.m20167e(sb.toString());
        zzaxi.f18651h.post(new C7760n8(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.f8048u = str;
            m7772o();
            return;
        }
        zzbad.m20523d("Path is null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo16529h() {
        zzbcn zzbcn = this.f8042o;
        if (zzbcn != null) {
            zzbcn.mo27935i();
        }
    }

    @SideEffectFree
    /* renamed from: a */
    private final void m7756a(float f, boolean z) {
        zzgn zzgn;
        zzge zzge = this.f8045r;
        if (zzge == null || (zzgn = this.f8047t) == null) {
            zzbad.m20523d("Trying to set volume before player and renderers are initalized.");
        } else if (z) {
            zzge.mo26844a(zzgn, 1, Float.valueOf(f));
        } else {
            zzge.mo26849b(zzgn, 1, Float.valueOf(f));
        }
    }

    /* renamed from: b */
    public final void mo16508b() {
        if (m7771n()) {
            if (this.f8041n.f18827a) {
                m7775r();
            }
            this.f8045r.mo26846a(false);
            this.f8039l.mo27984d();
            this.f8025g.mo27989c();
            zzaxi.f18651h.post(new C8019u8(this));
        }
    }

    /* renamed from: a */
    public final void mo16504a() {
        m7756a(this.f8025g.mo27985a(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo16526c(boolean z, long j) {
        this.f8036i.mo25670a(z, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7757a(int i, int i2, float f) {
        float f2 = i2 == 0 ? 1.0f : (((float) i) * f) / ((float) i2);
        if (this.f8035h != f2) {
            this.f8035h = f2;
            requestLayout();
        }
    }

    /* renamed from: b */
    public final void mo16509b(int i) {
        if (m7771n()) {
            this.f8045r.mo26842a((long) i);
        }
    }

    /* renamed from: a */
    public final void mo16506a(zzbcn zzbcn) {
        this.f8042o = zzbcn;
    }

    /* renamed from: a */
    public final void mo16505a(float f, float f2) {
        zzbdd zzbdd = this.f8051x;
        if (zzbdd != null) {
            zzbdd.mo27970a(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo16524b(int i, int i2) {
        zzbcn zzbcn = this.f8042o;
        if (zzbcn != null) {
            zzbcn.mo27928a(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo16523a(String str, String str2) {
        zzbcn zzbcn = this.f8042o;
        if (zzbcn != null) {
            zzbcn.mo27929a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo16525b(boolean z, long j) {
        this.f8036i.mo25670a(z, j);
    }
}
