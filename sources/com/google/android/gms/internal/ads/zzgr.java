package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class zzgr extends zzhp {

    /* renamed from: A */
    private int f21892A;

    /* renamed from: B */
    private boolean f21893B;

    /* renamed from: C */
    private boolean f21894C;

    /* renamed from: D */
    private boolean f21895D;

    /* renamed from: E */
    private boolean f21896E;

    /* renamed from: F */
    private long f21897F;

    /* renamed from: b */
    public final zzga f21898b;

    /* renamed from: c */
    private final zzhz f21899c;

    /* renamed from: d */
    private final boolean f21900d;

    /* renamed from: e */
    private final zzhn f21901e;

    /* renamed from: f */
    private final zzhm f21902f;

    /* renamed from: g */
    private final zzhk f21903g;

    /* renamed from: h */
    private final List<Long> f21904h;

    /* renamed from: i */
    private final MediaCodec.BufferInfo f21905i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final zzgw f21906j;

    /* renamed from: k */
    protected final Handler f21907k;

    /* renamed from: l */
    private zzhj f21908l;

    /* renamed from: m */
    private zzhw f21909m;

    /* renamed from: n */
    private MediaCodec f21910n;

    /* renamed from: o */
    private boolean f21911o;

    /* renamed from: p */
    private ByteBuffer[] f21912p;

    /* renamed from: q */
    private ByteBuffer[] f21913q;

    /* renamed from: r */
    private long f21914r;

    /* renamed from: s */
    private int f21915s;

    /* renamed from: t */
    private int f21916t;

    /* renamed from: u */
    private boolean f21917u;

    /* renamed from: v */
    private boolean f21918v;

    /* renamed from: w */
    private int f21919w;

    /* renamed from: x */
    private int f21920x;

    /* renamed from: y */
    private boolean f21921y;

    /* renamed from: z */
    private int f21922z;

    public zzgr(zzhn zzhn, zzhz zzhz, boolean z, Handler handler, zzgw zzgw) {
        zzkh.m24659b(zzkq.f22154a >= 16);
        this.f21901e = zzhn;
        this.f21899c = null;
        this.f21900d = true;
        this.f21907k = handler;
        this.f21906j = zzgw;
        this.f21898b = new zzga();
        this.f21902f = new zzhm(0);
        this.f21903g = new zzhk();
        this.f21904h = new ArrayList();
        this.f21905i = new MediaCodec.BufferInfo();
        this.f21919w = 0;
        this.f21920x = 0;
    }

    /* renamed from: u */
    private final void m24418u() throws zzgd {
        this.f21914r = -1;
        this.f21915s = -1;
        this.f21916t = -1;
        this.f21896E = true;
        this.f21895D = false;
        this.f21904h.clear();
        if (zzkq.f22154a < 18 || this.f21920x != 0) {
            mo29330s();
            mo29327p();
        } else {
            this.f21910n.flush();
            this.f21921y = false;
        }
        if (this.f21918v && this.f21908l != null) {
            this.f21919w = 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29308a(long j, boolean z) {
        this.f21901e.mo29305e(this.f21922z, j);
        this.f21892A = 0;
        this.f21893B = false;
        this.f21894C = false;
        this.f21895D = false;
        this.f21897F = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29310a(zzhj zzhj, MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo29311a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) throws zzgd;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29322a(MediaCodec mediaCodec, boolean z, zzhj zzhj, zzhj zzhj2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29312a(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo29323b(long j) throws zzgd {
        try {
            if (!this.f21901e.mo29301b(j)) {
                return 0;
            }
            for (int i = 0; i < this.f21901e.mo29304d(); i++) {
                if (mo29312a(this.f21901e.mo29300b(i).f21966a)) {
                    this.f21922z = i;
                    return 1;
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzgd((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo29313d() {
        if (this.f21908l != null && !this.f21895D) {
            if (this.f21892A == 0 && this.f21916t < 0) {
                if (SystemClock.elapsedRealtime() < this.f21914r + 1000) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo29314e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo29315f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo29325j() {
        long b = this.f21901e.mo29299b();
        return (b == -1 || b == -3) ? b : Math.max(b, mo29318m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo29317l() {
        return this.f21894C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public long mo29318m() {
        return this.f21897F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo29319n() {
        this.f21908l = null;
        this.f21909m = null;
        try {
            mo29330s();
            try {
                if (this.f21917u) {
                    this.f21899c.close();
                    this.f21917u = false;
                }
            } finally {
                this.f21901e.mo29302c(this.f21922z);
            }
        } catch (Throwable th) {
            if (this.f21917u) {
                this.f21899c.close();
                this.f21917u = false;
            }
            throw th;
        } finally {
            this.f21901e.mo29302c(this.f21922z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo29326o() {
        this.f21901e.mo29297a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo29327p() throws zzgd {
        MediaCrypto mediaCrypto;
        if (mo29328q()) {
            String str = this.f21908l.f21946a;
            boolean z = false;
            zzhw zzhw = this.f21909m;
            if (zzhw != null) {
                zzhz zzhz = this.f21899c;
                if (zzhz != null) {
                    if (!this.f21917u) {
                        zzhz.mo29361a(zzhw);
                        this.f21917u = true;
                    }
                    int state = this.f21899c.getState();
                    if (state == 0) {
                        throw new zzgd((Throwable) this.f21899c.mo29360a());
                    } else if (state == 3 || state == 4) {
                        mediaCrypto = this.f21899c.mo29363b();
                        z = this.f21899c.mo29362a(str);
                    } else {
                        return;
                    }
                } else {
                    throw new zzgd("Media requires a DrmSessionManager");
                }
            } else {
                mediaCrypto = null;
            }
            try {
                zzgc a = mo29306a(str, z);
                if (a != null) {
                    String str2 = a.f21877a;
                    this.f21911o = a.f21878b;
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        MediaCodec createByCodecName = MediaCodec.createByCodecName(str2);
                        this.f21910n = createByCodecName;
                        mo29309a(createByCodecName, str2, this.f21908l.mo29334a(), mediaCrypto);
                        this.f21910n.start();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        long j = elapsedRealtime2 - elapsedRealtime;
                        if (!(this.f21907k == null || this.f21906j == null)) {
                            this.f21907k.post(new C7524gz(this, str2, elapsedRealtime2, j));
                        }
                        this.f21912p = this.f21910n.getInputBuffers();
                        this.f21913q = this.f21910n.getOutputBuffers();
                        this.f21914r = mo29342c() == 3 ? SystemClock.elapsedRealtime() : -1;
                        this.f21915s = -1;
                        this.f21916t = -1;
                        this.f21896E = true;
                        this.f21898b.f21863a++;
                    } catch (Exception e) {
                        m24416a(new zzgv(this.f21908l, (Throwable) e, str2));
                        throw null;
                    }
                } else {
                    m24416a(new zzgv(this.f21908l, (Throwable) null, -49999));
                    throw null;
                }
            } catch (zzgz e2) {
                m24416a(new zzgv(this.f21908l, (Throwable) e2, -49998));
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo29328q() {
        return this.f21910n == null && this.f21908l != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo29329r() {
        return this.f21910n != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo29330s() {
        if (this.f21910n != null) {
            this.f21914r = -1;
            this.f21915s = -1;
            this.f21916t = -1;
            this.f21895D = false;
            this.f21904h.clear();
            this.f21912p = null;
            this.f21913q = null;
            this.f21918v = false;
            this.f21921y = false;
            this.f21911o = false;
            this.f21919w = 0;
            this.f21920x = 0;
            this.f21898b.f21864b++;
            try {
                this.f21910n.stop();
                try {
                    this.f21910n.release();
                } finally {
                    this.f21910n = null;
                }
            } catch (Throwable th) {
                this.f21910n.release();
                throw th;
            } finally {
                this.f21910n = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo29331t() {
        return this.f21892A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo29324b() {
        return this.f21901e.mo29300b(this.f21922z).f21967b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public zzgc mo29306a(String str, boolean z) throws zzgz {
        return zzgx.m24448a(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29309a(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
    }

    /* renamed from: a */
    private final void m24416a(zzgv zzgv) throws zzgd {
        Handler handler = this.f21907k;
        if (!(handler == null || this.f21906j == null)) {
            handler.post(new C7451ez(this, zzgv));
        }
        throw new zzgd((Throwable) zzgv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29307a(long j) throws zzgd {
        this.f21897F = j;
        this.f21901e.mo29298a(j);
        this.f21892A = 0;
        this.f21893B = false;
        this.f21894C = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29320a(long j, long j2) throws zzgd {
        boolean z;
        int i;
        try {
            this.f21892A = this.f21901e.mo29303c(j) ? this.f21892A == 0 ? 1 : this.f21892A : 0;
            if (this.f21910n != null && this.f21901e.mo29296a(this.f21922z, this.f21897F, this.f21903g, this.f21902f, true) == -5) {
                m24418u();
            }
            if (this.f21908l == null && this.f21901e.mo29296a(this.f21922z, this.f21897F, this.f21903g, this.f21902f, false) == -4) {
                mo29321a(this.f21903g);
            }
            if (this.f21910n == null && mo29328q()) {
                mo29327p();
            }
            if (this.f21910n != null) {
                do {
                    if (!this.f21894C) {
                        if (this.f21916t < 0) {
                            this.f21916t = this.f21910n.dequeueOutputBuffer(this.f21905i, 0);
                        }
                        if (this.f21916t == -2) {
                            mo29310a(this.f21908l, this.f21910n.getOutputFormat());
                            this.f21898b.f21865c++;
                        } else if (this.f21916t == -3) {
                            this.f21913q = this.f21910n.getOutputBuffers();
                            this.f21898b.f21866d++;
                        } else if (this.f21916t >= 0) {
                            if ((this.f21905i.flags & 4) == 0) {
                                long j3 = this.f21905i.presentationTimeUs;
                                int size = this.f21904h.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        i = -1;
                                        break;
                                    } else if (this.f21904h.get(i2).longValue() == j3) {
                                        i = i2;
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                if (mo29311a(j, j2, this.f21910n, this.f21913q[this.f21916t], this.f21905i, this.f21916t, i != -1)) {
                                    if (i != -1) {
                                        this.f21904h.remove(i);
                                    } else {
                                        this.f21897F = this.f21905i.presentationTimeUs;
                                    }
                                    this.f21916t = -1;
                                }
                            } else if (this.f21920x == 2) {
                                mo29330s();
                                mo29327p();
                            } else {
                                this.f21894C = true;
                            }
                        }
                        z = true;
                        continue;
                    }
                    z = false;
                    continue;
                } while (z);
                if (m24417a(true)) {
                    do {
                    } while (m24417a(false));
                }
            }
            this.f21898b.mo29291a();
        } catch (IOException e) {
            throw new zzgd((Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x011a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011b A[SYNTHETIC, Splitter:B:79:0x011b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m24417a(boolean r18) throws java.io.IOException, com.google.android.gms.internal.ads.zzgd {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1.f21893B
            r2 = 0
            if (r0 != 0) goto L_0x0186
            int r0 = r1.f21920x
            r3 = 2
            if (r0 != r3) goto L_0x000e
            goto L_0x0186
        L_0x000e:
            int r0 = r1.f21915s
            if (r0 >= 0) goto L_0x002a
            android.media.MediaCodec r0 = r1.f21910n
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r1.f21915s = r0
            if (r0 >= 0) goto L_0x001f
            return r2
        L_0x001f:
            com.google.android.gms.internal.ads.zzhm r4 = r1.f21902f
            java.nio.ByteBuffer[] r5 = r1.f21912p
            r0 = r5[r0]
            r4.f21962b = r0
            r0.clear()
        L_0x002a:
            int r0 = r1.f21920x
            r4 = -1
            r5 = 1
            if (r0 != r5) goto L_0x0041
            android.media.MediaCodec r6 = r1.f21910n
            int r7 = r1.f21915s
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 4
            r6.queueInputBuffer(r7, r8, r9, r10, r12)
            r1.f21915s = r4
            r1.f21920x = r3
            return r2
        L_0x0041:
            boolean r0 = r1.f21895D
            r6 = -2
            if (r0 == 0) goto L_0x0048
            r0 = -3
            goto L_0x0086
        L_0x0048:
            int r0 = r1.f21919w
            if (r0 != r5) goto L_0x006d
            r0 = 0
        L_0x004d:
            com.google.android.gms.internal.ads.zzhj r7 = r1.f21908l
            java.util.List<byte[]> r7 = r7.f21954i
            int r7 = r7.size()
            if (r0 >= r7) goto L_0x006b
            com.google.android.gms.internal.ads.zzhj r7 = r1.f21908l
            java.util.List<byte[]> r7 = r7.f21954i
            java.lang.Object r7 = r7.get(r0)
            byte[] r7 = (byte[]) r7
            com.google.android.gms.internal.ads.zzhm r8 = r1.f21902f
            java.nio.ByteBuffer r8 = r8.f21962b
            r8.put(r7)
            int r0 = r0 + 1
            goto L_0x004d
        L_0x006b:
            r1.f21919w = r3
        L_0x006d:
            com.google.android.gms.internal.ads.zzhn r7 = r1.f21901e
            int r8 = r1.f21922z
            long r9 = r1.f21897F
            com.google.android.gms.internal.ads.zzhk r11 = r1.f21903g
            com.google.android.gms.internal.ads.zzhm r12 = r1.f21902f
            r13 = 0
            int r0 = r7.mo29296a(r8, r9, r11, r12, r13)
            if (r18 == 0) goto L_0x0086
            int r7 = r1.f21892A
            if (r7 != r5) goto L_0x0086
            if (r0 != r6) goto L_0x0086
            r1.f21892A = r3
        L_0x0086:
            if (r0 != r6) goto L_0x0089
            return r2
        L_0x0089:
            r6 = -5
            if (r0 != r6) goto L_0x0090
            r17.m24418u()
            return r5
        L_0x0090:
            r6 = -4
            if (r0 != r6) goto L_0x00a6
            int r0 = r1.f21919w
            if (r0 != r3) goto L_0x00a0
            com.google.android.gms.internal.ads.zzhm r0 = r1.f21902f
            java.nio.ByteBuffer r0 = r0.f21962b
            r0.clear()
            r1.f21919w = r5
        L_0x00a0:
            com.google.android.gms.internal.ads.zzhk r0 = r1.f21903g
            r1.mo29321a((com.google.android.gms.internal.ads.zzhk) r0)
            return r5
        L_0x00a6:
            if (r0 != r4) goto L_0x00d0
            int r0 = r1.f21919w
            if (r0 != r3) goto L_0x00b5
            com.google.android.gms.internal.ads.zzhm r0 = r1.f21902f
            java.nio.ByteBuffer r0 = r0.f21962b
            r0.clear()
            r1.f21919w = r5
        L_0x00b5:
            r1.f21893B = r5
            android.media.MediaCodec r6 = r1.f21910n     // Catch:{ CryptoException -> 0x00c6 }
            int r7 = r1.f21915s     // Catch:{ CryptoException -> 0x00c6 }
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 4
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x00c6 }
            r1.f21915s = r4     // Catch:{ CryptoException -> 0x00c6 }
            return r2
        L_0x00c6:
            r0 = move-exception
            r1.m24415a((android.media.MediaCodec.CryptoException) r0)
            com.google.android.gms.internal.ads.zzgd r2 = new com.google.android.gms.internal.ads.zzgd
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        L_0x00d0:
            boolean r0 = r1.f21896E
            if (r0 == 0) goto L_0x00ec
            com.google.android.gms.internal.ads.zzhm r0 = r1.f21902f
            boolean r0 = r0.mo29339b()
            if (r0 != 0) goto L_0x00ea
            com.google.android.gms.internal.ads.zzhm r0 = r1.f21902f
            java.nio.ByteBuffer r0 = r0.f21962b
            r0.clear()
            int r0 = r1.f21919w
            if (r0 != r3) goto L_0x00e9
            r1.f21919w = r5
        L_0x00e9:
            return r5
        L_0x00ea:
            r1.f21896E = r2
        L_0x00ec:
            com.google.android.gms.internal.ads.zzhm r0 = r1.f21902f
            boolean r0 = r0.mo29338a()
            boolean r3 = r1.f21917u
            if (r3 == 0) goto L_0x0115
            com.google.android.gms.internal.ads.zzhz r3 = r1.f21899c
            int r3 = r3.getState()
            if (r3 == 0) goto L_0x0109
            r6 = 4
            if (r3 == r6) goto L_0x0115
            if (r0 != 0) goto L_0x0107
            boolean r3 = r1.f21900d
            if (r3 != 0) goto L_0x0115
        L_0x0107:
            r3 = 1
            goto L_0x0116
        L_0x0109:
            com.google.android.gms.internal.ads.zzgd r0 = new com.google.android.gms.internal.ads.zzgd
            com.google.android.gms.internal.ads.zzhz r2 = r1.f21899c
            java.lang.Exception r2 = r2.mo29360a()
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0115:
            r3 = 0
        L_0x0116:
            r1.f21895D = r3
            if (r3 == 0) goto L_0x011b
            return r2
        L_0x011b:
            com.google.android.gms.internal.ads.zzhm r3 = r1.f21902f     // Catch:{ CryptoException -> 0x017c }
            java.nio.ByteBuffer r3 = r3.f21962b     // Catch:{ CryptoException -> 0x017c }
            int r9 = r3.position()     // Catch:{ CryptoException -> 0x017c }
            com.google.android.gms.internal.ads.zzhm r3 = r1.f21902f     // Catch:{ CryptoException -> 0x017c }
            int r3 = r3.f21963c     // Catch:{ CryptoException -> 0x017c }
            int r3 = r9 - r3
            com.google.android.gms.internal.ads.zzhm r6 = r1.f21902f     // Catch:{ CryptoException -> 0x017c }
            long r14 = r6.f21965e     // Catch:{ CryptoException -> 0x017c }
            com.google.android.gms.internal.ads.zzhm r6 = r1.f21902f     // Catch:{ CryptoException -> 0x017c }
            int r6 = r6.f21964d     // Catch:{ CryptoException -> 0x017c }
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0138
            r6 = 1
            goto L_0x0139
        L_0x0138:
            r6 = 0
        L_0x0139:
            if (r6 == 0) goto L_0x0144
            java.util.List<java.lang.Long> r6 = r1.f21904h     // Catch:{ CryptoException -> 0x017c }
            java.lang.Long r7 = java.lang.Long.valueOf(r14)     // Catch:{ CryptoException -> 0x017c }
            r6.add(r7)     // Catch:{ CryptoException -> 0x017c }
        L_0x0144:
            if (r0 == 0) goto L_0x016b
            com.google.android.gms.internal.ads.zzhm r0 = r1.f21902f     // Catch:{ CryptoException -> 0x017c }
            com.google.android.gms.internal.ads.zzgb r0 = r0.f21961a     // Catch:{ CryptoException -> 0x017c }
            android.media.MediaCodec$CryptoInfo r13 = r0.mo29292a()     // Catch:{ CryptoException -> 0x017c }
            if (r3 != 0) goto L_0x0151
            goto L_0x0160
        L_0x0151:
            int[] r0 = r13.numBytesOfClearData     // Catch:{ CryptoException -> 0x017c }
            if (r0 != 0) goto L_0x0159
            int[] r0 = new int[r5]     // Catch:{ CryptoException -> 0x017c }
            r13.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x017c }
        L_0x0159:
            int[] r0 = r13.numBytesOfClearData     // Catch:{ CryptoException -> 0x017c }
            r6 = r0[r2]     // Catch:{ CryptoException -> 0x017c }
            int r6 = r6 + r3
            r0[r2] = r6     // Catch:{ CryptoException -> 0x017c }
        L_0x0160:
            android.media.MediaCodec r10 = r1.f21910n     // Catch:{ CryptoException -> 0x017c }
            int r11 = r1.f21915s     // Catch:{ CryptoException -> 0x017c }
            r12 = 0
            r16 = 0
            r10.queueSecureInputBuffer(r11, r12, r13, r14, r16)     // Catch:{ CryptoException -> 0x017c }
            goto L_0x0175
        L_0x016b:
            android.media.MediaCodec r6 = r1.f21910n     // Catch:{ CryptoException -> 0x017c }
            int r7 = r1.f21915s     // Catch:{ CryptoException -> 0x017c }
            r8 = 0
            r12 = 0
            r10 = r14
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x017c }
        L_0x0175:
            r1.f21915s = r4     // Catch:{ CryptoException -> 0x017c }
            r1.f21921y = r5     // Catch:{ CryptoException -> 0x017c }
            r1.f21919w = r2     // Catch:{ CryptoException -> 0x017c }
            return r5
        L_0x017c:
            r0 = move-exception
            r1.m24415a((android.media.MediaCodec.CryptoException) r0)
            com.google.android.gms.internal.ads.zzgd r2 = new com.google.android.gms.internal.ads.zzgd
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        L_0x0186:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.m24417a(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29321a(zzhk zzhk) throws zzgd {
        zzhj zzhj = this.f21908l;
        zzhj zzhj2 = zzhk.f21959a;
        this.f21908l = zzhj2;
        this.f21909m = zzhk.f21960b;
        MediaCodec mediaCodec = this.f21910n;
        if (mediaCodec != null && mo29322a(mediaCodec, this.f21911o, zzhj, zzhj2)) {
            this.f21918v = true;
            this.f21919w = 1;
        } else if (this.f21921y) {
            this.f21920x = 1;
        } else {
            mo29330s();
            mo29327p();
        }
    }

    /* renamed from: a */
    private final void m24415a(MediaCodec.CryptoException cryptoException) {
        Handler handler = this.f21907k;
        if (handler != null && this.f21906j != null) {
            handler.post(new C7488fz(this, cryptoException));
        }
    }
}
