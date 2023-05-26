package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dw */
final class C7411dw<T> implements C7784nw<T> {

    /* renamed from: a */
    private final zzdpk f15031a;

    /* renamed from: b */
    private final C7449ex<?, ?> f15032b;

    /* renamed from: c */
    private final boolean f15033c;

    /* renamed from: d */
    private final C8115wu<?> f15034d;

    private C7411dw(C7449ex<?, ?> exVar, C8115wu<?> wuVar, zzdpk zzdpk) {
        this.f15032b = exVar;
        this.f15033c = wuVar.mo26749a(zzdpk);
        this.f15034d = wuVar;
        this.f15031a = zzdpk;
    }

    /* renamed from: a */
    static <T> C7411dw<T> m16844a(C7449ex<?, ?> exVar, C8115wu<?> wuVar, zzdpk zzdpk) {
        return new C7411dw<>(exVar, wuVar, zzdpk);
    }

    /* renamed from: b */
    public final boolean mo25750b(T t, T t2) {
        if (!this.f15032b.mo25900d(t).equals(this.f15032b.mo25900d(t2))) {
            return false;
        }
        if (this.f15033c) {
            return this.f15034d.mo26750b(t).equals(this.f15034d.mo26750b(t2));
        }
        return true;
    }

    /* renamed from: c */
    public final int mo25751c(T t) {
        C7449ex<?, ?> exVar = this.f15032b;
        int f = exVar.mo25902f(exVar.mo25900d(t)) + 0;
        return this.f15033c ? f + this.f15034d.mo26750b(t).mo26899h() : f;
    }

    /* renamed from: d */
    public final boolean mo25752d(T t) {
        return this.f15034d.mo26750b(t).mo26894d();
    }

    /* renamed from: a */
    public final T mo25744a() {
        return this.f15031a.mo29130c().mo29137D();
    }

    /* renamed from: a */
    public final int mo25742a(T t) {
        int hashCode = this.f15032b.mo25900d(t).hashCode();
        return this.f15033c ? (hashCode * 53) + this.f15034d.mo26750b(t).hashCode() : hashCode;
    }

    /* renamed from: a */
    public final void mo25747a(T t, T t2) {
        C7858pw.m17931a(this.f15032b, t, t2);
        if (this.f15033c) {
            C7858pw.m17933a(this.f15034d, t, t2);
        }
    }

    /* renamed from: b */
    public final void mo25749b(T t) {
        this.f15032b.mo25885a((Object) t);
        this.f15034d.mo26748a((Object) t);
    }

    /* renamed from: a */
    public final void mo25746a(T t, C8118wx wxVar) throws IOException {
        Iterator<Map.Entry<?, Object>> e = this.f15034d.mo26750b(t).mo26895e();
        while (e.hasNext()) {
            Map.Entry next = e.next();
            zzdnu zzdnu = (zzdnu) next.getKey();
            if (zzdnu.mo29124k() != zzdrn.MESSAGE || zzdnu.mo29125n() || zzdnu.mo29126u()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C7635jv) {
                wxVar.mo26591a(zzdnu.mo29122c(), (Object) ((C7635jv) next).mo26143a().mo29149a());
            } else {
                wxVar.mo26591a(zzdnu.mo29122c(), next.getValue());
            }
        }
        C7449ex<?, ?> exVar = this.f15032b;
        exVar.mo25896b(exVar.mo25900d(t), wxVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.gms.internal.ads.zzdob$zzd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25748a(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.C7335bu r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzdob r0 = (com.google.android.gms.internal.ads.zzdob) r0
            com.google.android.gms.internal.ads.zzdqu r1 = r0.zzhhd
            com.google.android.gms.internal.ads.zzdqu r2 = com.google.android.gms.internal.ads.zzdqu.m24095d()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.ads.zzdqu r1 = com.google.android.gms.internal.ads.zzdqu.m24096e()
            r0.zzhhd = r1
        L_0x0011:
            com.google.android.gms.internal.ads.zzdob$zzc r10 = (com.google.android.gms.internal.ads.zzdob.zzc) r10
            com.google.android.gms.internal.ads.zu<java.lang.Object> r0 = r10.zzhhj
            boolean r0 = r0.mo26892c()
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.zu<java.lang.Object> r0 = r10.zzhhj
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.zu r0 = (com.google.android.gms.internal.ads.C8226zu) r0
            r10.zzhhj = r0
        L_0x0025:
            com.google.android.gms.internal.ads.zu<java.lang.Object> r10 = r10.zzhhj
            r10 = 0
            r0 = r10
        L_0x0029:
            if (r12 >= r13) goto L_0x00b5
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r11, r12, r14)
            int r2 = r14.f14659a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0062
            r12 = r2 & 7
            if (r12 != r3) goto L_0x005d
            com.google.android.gms.internal.ads.wu<?> r12 = r9.f15034d
            com.google.android.gms.internal.ads.zzdno r0 = r14.f14662d
            com.google.android.gms.internal.ads.zzdpk r3 = r9.f15031a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo26744a(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzdob$zzd r0 = (com.google.android.gms.internal.ads.zzdob.zzd) r0
            if (r0 != 0) goto L_0x0054
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.C7298au.m16494a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.zzdqu) r6, (com.google.android.gms.internal.ads.C7335bu) r7)
            goto L_0x0029
        L_0x0054:
            com.google.android.gms.internal.ads.C7595iw.m17197a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x005d:
            int r12 = com.google.android.gms.internal.ads.C7298au.m16492a((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.ads.C7335bu) r14)
            goto L_0x0029
        L_0x0062:
            r12 = 0
            r2 = r10
        L_0x0064:
            if (r4 >= r13) goto L_0x00aa
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r11, r4, r14)
            int r5 = r14.f14659a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x008c
            r8 = 3
            if (r6 == r8) goto L_0x0076
            goto L_0x00a1
        L_0x0076:
            if (r0 != 0) goto L_0x0083
            if (r7 != r3) goto L_0x00a1
            int r4 = com.google.android.gms.internal.ads.C7298au.m16508e(r11, r4, r14)
            java.lang.Object r2 = r14.f14661c
            com.google.android.gms.internal.ads.zzdmr r2 = (com.google.android.gms.internal.ads.zzdmr) r2
            goto L_0x0064
        L_0x0083:
            com.google.android.gms.internal.ads.C7595iw.m17197a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x008c:
            if (r7 != 0) goto L_0x00a1
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r11, r4, r14)
            int r12 = r14.f14659a
            com.google.android.gms.internal.ads.wu<?> r0 = r9.f15034d
            com.google.android.gms.internal.ads.zzdno r5 = r14.f14662d
            com.google.android.gms.internal.ads.zzdpk r6 = r9.f15031a
            java.lang.Object r0 = r0.mo26744a(r5, r6, r12)
            com.google.android.gms.internal.ads.zzdob$zzd r0 = (com.google.android.gms.internal.ads.zzdob.zzd) r0
            goto L_0x0064
        L_0x00a1:
            r6 = 12
            if (r5 == r6) goto L_0x00aa
            int r4 = com.google.android.gms.internal.ads.C7298au.m16492a((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.ads.C7335bu) r14)
            goto L_0x0064
        L_0x00aa:
            if (r2 == 0) goto L_0x00b2
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.mo29175a((int) r12, (java.lang.Object) r2)
        L_0x00b2:
            r12 = r4
            goto L_0x0029
        L_0x00b5:
            if (r12 != r13) goto L_0x00b8
            return
        L_0x00b8:
            com.google.android.gms.internal.ads.zzdok r10 = com.google.android.gms.internal.ads.zzdok.m24053g()
            goto L_0x00be
        L_0x00bd:
            throw r10
        L_0x00be:
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7411dw.mo25748a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.bu):void");
    }

    /* renamed from: a */
    public final void mo25745a(T t, C7747mw mwVar, zzdno zzdno) throws IOException {
        boolean z;
        C7449ex<?, ?> exVar = this.f15032b;
        C8115wu<?> wuVar = this.f15034d;
        Object e = exVar.mo25901e(t);
        C8226zu<?> c = wuVar.mo26751c(t);
        do {
            try {
                if (mwVar.mo26276h() == Integer.MAX_VALUE) {
                    exVar.mo25897b((Object) t, e);
                    return;
                }
                int tag = mwVar.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzdmr zzdmr = null;
                    while (mwVar.mo26276h() != Integer.MAX_VALUE) {
                        int tag2 = mwVar.getTag();
                        if (tag2 == 16) {
                            i = mwVar.mo26286m();
                            obj = wuVar.mo26744a(zzdno, this.f15031a, i);
                        } else if (tag2 == 26) {
                            if (obj == null) {
                                zzdmr = mwVar.mo26284l();
                            } else {
                                wuVar.mo26745a(mwVar, obj, zzdno, c);
                                throw null;
                            }
                        } else if (!mwVar.mo26283k()) {
                            break;
                        }
                    }
                    if (mwVar.getTag() == 12) {
                        if (zzdmr != null) {
                            if (obj == null) {
                                exVar.mo25888a(e, i, zzdmr);
                            } else {
                                wuVar.mo26747a(zzdmr, obj, zzdno, c);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw zzdok.m24051e();
                    }
                } else if ((tag & 7) == 2) {
                    Object a = wuVar.mo26744a(zzdno, this.f15031a, tag >>> 3);
                    if (a == null) {
                        z = exVar.mo25893a(e, mwVar);
                        continue;
                    } else {
                        wuVar.mo26745a(mwVar, a, zzdno, c);
                        throw null;
                    }
                } else {
                    z = mwVar.mo26283k();
                    continue;
                }
            } finally {
                exVar.mo25897b((Object) t, e);
            }
        } while (z);
    }
}
