package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

final class h30 implements zzqj, zzqk {

    /* renamed from: f */
    public final zzqj[] f15341f;

    /* renamed from: g */
    private final IdentityHashMap<zzqw, Integer> f15342g = new IdentityHashMap<>();

    /* renamed from: h */
    private zzqk f15343h;

    /* renamed from: i */
    private int f15344i;

    /* renamed from: j */
    private zzrb f15345j;

    /* renamed from: k */
    private zzqj[] f15346k;

    /* renamed from: l */
    private zzqx f15347l;

    public h30(zzqj... zzqjArr) {
        this.f15341f = zzqjArr;
    }

    /* renamed from: a */
    public final void mo26002a(zzqk zzqk, long j) {
        this.f15343h = zzqk;
        zzqj[] zzqjArr = this.f15341f;
        this.f15344i = zzqjArr.length;
        for (zzqj a : zzqjArr) {
            a.mo26002a(this, j);
        }
    }

    /* renamed from: b */
    public final long mo26005b() {
        long j = Long.MAX_VALUE;
        for (zzqj b : this.f15346k) {
            long b2 = b.mo26005b();
            if (b2 != Long.MIN_VALUE) {
                j = Math.min(j, b2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: c */
    public final void mo26007c(long j) {
        for (zzqj c : this.f15346k) {
            c.mo26007c(j);
        }
    }

    /* renamed from: d */
    public final long mo26008d() {
        long d = this.f15341f[0].mo26008d();
        int i = 1;
        while (true) {
            zzqj[] zzqjArr = this.f15341f;
            if (i >= zzqjArr.length) {
                if (d != -9223372036854775807L) {
                    zzqj[] zzqjArr2 = this.f15346k;
                    int length = zzqjArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        zzqj zzqj = zzqjArr2[i2];
                        if (zzqj == this.f15341f[0] || zzqj.mo26006b(d) == d) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return d;
            } else if (zzqjArr[i].mo26008d() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    /* renamed from: e */
    public final void mo26009e() throws IOException {
        for (zzqj e : this.f15341f) {
            e.mo26009e();
        }
    }

    /* renamed from: f */
    public final zzrb mo26010f() {
        return this.f15345j;
    }

    /* renamed from: b */
    public final long mo26006b(long j) {
        long b = this.f15346k[0].mo26006b(j);
        int i = 1;
        while (true) {
            zzqj[] zzqjArr = this.f15346k;
            if (i >= zzqjArr.length) {
                return b;
            }
            if (zzqjArr[i].mo26006b(b) == b) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    /* renamed from: a */
    public final long mo26000a(zzrm[] zzrmArr, boolean[] zArr, zzqw[] zzqwArr, boolean[] zArr2, long j) {
        int i;
        zzrm[] zzrmArr2 = zzrmArr;
        zzqw[] zzqwArr2 = zzqwArr;
        int[] iArr = new int[zzrmArr2.length];
        int[] iArr2 = new int[zzrmArr2.length];
        for (int i2 = 0; i2 < zzrmArr2.length; i2++) {
            if (zzqwArr2[i2] == null) {
                i = -1;
            } else {
                i = this.f15342g.get(zzqwArr2[i2]).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (zzrmArr2[i2] != null) {
                zzra a = zzrmArr2[i2].mo29679a();
                int i3 = 0;
                while (true) {
                    zzqj[] zzqjArr = this.f15341f;
                    if (i3 >= zzqjArr.length) {
                        break;
                    } else if (zzqjArr[i3].mo26010f().mo29674a(a) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f15342g.clear();
        int length = zzrmArr2.length;
        zzqw[] zzqwArr3 = new zzqw[length];
        zzqw[] zzqwArr4 = new zzqw[zzrmArr2.length];
        zzrm[] zzrmArr3 = new zzrm[zzrmArr2.length];
        ArrayList arrayList = new ArrayList(this.f15341f.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f15341f.length) {
            for (int i5 = 0; i5 < zzrmArr2.length; i5++) {
                zzrm zzrm = null;
                zzqwArr4[i5] = iArr[i5] == i4 ? zzqwArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzrm = zzrmArr2[i5];
                }
                zzrmArr3[i5] = zzrm;
            }
            int i6 = i4;
            zzrm[] zzrmArr4 = zzrmArr3;
            ArrayList arrayList2 = arrayList;
            long a2 = this.f15341f[i4].mo26000a(zzrmArr3, zArr, zzqwArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = a2;
            } else if (a2 != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzrmArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zzsk.m25218b(zzqwArr4[i7] != null);
                    zzqwArr3[i7] = zzqwArr4[i7];
                    this.f15342g.put(zzqwArr4[i7], Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zzqwArr4[i7] != null) {
                        z2 = false;
                    }
                    zzsk.m25218b(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f15341f[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzrmArr3 = zzrmArr4;
            zzqwArr2 = zzqwArr;
        }
        zzqw[] zzqwArr5 = zzqwArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzqwArr3, 0, zzqwArr5, 0, length);
        zzqj[] zzqjArr2 = new zzqj[arrayList3.size()];
        this.f15346k = zzqjArr2;
        arrayList3.toArray(zzqjArr2);
        this.f15347l = new zzpy(this.f15346k);
        return j2;
    }

    /* renamed from: a */
    public final boolean mo26004a(long j) {
        return this.f15347l.mo26004a(j);
    }

    /* renamed from: a */
    public final long mo25999a() {
        return this.f15347l.mo25999a();
    }

    /* renamed from: a */
    public final void mo26001a(zzqj zzqj) {
        int i = this.f15344i - 1;
        this.f15344i = i;
        if (i <= 0) {
            int i2 = 0;
            for (zzqj f : this.f15341f) {
                i2 += f.mo26010f().f22575a;
            }
            zzra[] zzraArr = new zzra[i2];
            int i3 = 0;
            for (zzqj f2 : this.f15341f) {
                zzrb f3 = f2.mo26010f();
                int i4 = f3.f22575a;
                int i5 = 0;
                while (i5 < i4) {
                    zzraArr[i3] = f3.mo29675a(i5);
                    i5++;
                    i3++;
                }
            }
            this.f15345j = new zzrb(zzraArr);
            this.f15343h.mo26001a(this);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo26003a(zzqx zzqx) {
        if (this.f15345j != null) {
            this.f15343h.mo26003a(this);
        }
    }
}
