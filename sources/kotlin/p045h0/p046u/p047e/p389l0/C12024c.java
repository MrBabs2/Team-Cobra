package kotlin.p045h0.p046u.p047e.p389l0;

/* renamed from: kotlin.h0.u.e.l0.c */
/* compiled from: IntTree */
final class C12024c<V> {

    /* renamed from: f */
    static final C12024c<Object> f31772f = new C12024c<>();

    /* renamed from: a */
    private final long f31773a;

    /* renamed from: b */
    private final V f31774b;

    /* renamed from: c */
    private final C12024c<V> f31775c;

    /* renamed from: d */
    private final C12024c<V> f31776d;

    /* renamed from: e */
    private final int f31777e;

    private C12024c() {
        this.f31777e = 0;
        this.f31773a = 0;
        this.f31774b = null;
        this.f31775c = null;
        this.f31776d = null;
    }

    /* renamed from: b */
    private C12024c<V> m39735b(long j) {
        if (this.f31777e == 0 || j == this.f31773a) {
            return this;
        }
        return new C12024c(j, this.f31774b, this.f31775c, this.f31776d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public V mo38653a(long j) {
        if (this.f31777e == 0) {
            return null;
        }
        long j2 = this.f31773a;
        if (j < j2) {
            return this.f31775c.mo38653a(j - j2);
        }
        if (j > j2) {
            return this.f31776d.mo38653a(j - j2);
        }
        return this.f31774b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12024c<V> mo38654a(long j, V v) {
        if (this.f31777e == 0) {
            return new C12024c(j, v, this, this);
        }
        long j2 = this.f31773a;
        if (j < j2) {
            return m39734a(this.f31775c.mo38654a(j - j2, v), this.f31776d);
        }
        if (j > j2) {
            return m39734a(this.f31775c, this.f31776d.mo38654a(j - j2, v));
        }
        if (v == this.f31774b) {
            return this;
        }
        return new C12024c(j, v, this.f31775c, this.f31776d);
    }

    private C12024c(long j, V v, C12024c<V> cVar, C12024c<V> cVar2) {
        this.f31773a = j;
        this.f31774b = v;
        this.f31775c = cVar;
        this.f31776d = cVar2;
        this.f31777e = cVar.f31777e + 1 + cVar2.f31777e;
    }

    /* renamed from: a */
    private C12024c<V> m39734a(C12024c<V> cVar, C12024c<V> cVar2) {
        if (cVar == this.f31775c && cVar2 == this.f31776d) {
            return this;
        }
        return m39733a(this.f31773a, this.f31774b, cVar, cVar2);
    }

    /* renamed from: a */
    private static <V> C12024c<V> m39733a(long j, V v, C12024c<V> cVar, C12024c<V> cVar2) {
        C12024c<V> cVar3 = cVar;
        int i = cVar3.f31777e;
        int i2 = cVar2.f31777e;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                C12024c<V> cVar4 = cVar3.f31775c;
                C12024c<V> cVar5 = cVar3.f31776d;
                if (cVar5.f31777e < cVar4.f31777e * 2) {
                    long j2 = cVar3.f31773a;
                    return new C12024c(j2 + j, cVar3.f31774b, cVar4, new C12024c(-j2, v, cVar5.m39735b(cVar5.f31773a + j2), cVar2));
                }
                C12024c<V> cVar6 = cVar5.f31775c;
                C12024c<V> cVar7 = cVar5.f31776d;
                long j3 = cVar5.f31773a;
                long j4 = cVar3.f31773a + j3 + j;
                V v2 = cVar5.f31774b;
                V v3 = v2;
                C12024c cVar8 = new C12024c(-j3, cVar3.f31774b, cVar4, cVar6.m39735b(cVar6.f31773a + j3));
                long j5 = cVar3.f31773a;
                long j6 = cVar5.f31773a;
                return new C12024c(j4, v3, cVar8, new C12024c((-j5) - j6, v, cVar7.m39735b(cVar7.f31773a + j6 + j5), cVar2));
            }
            C12024c<V> cVar9 = cVar2;
            if (i2 >= i * 5) {
                C12024c<V> cVar10 = cVar9.f31775c;
                C12024c<V> cVar11 = cVar9.f31776d;
                if (cVar10.f31777e < cVar11.f31777e * 2) {
                    long j7 = cVar9.f31773a;
                    return new C12024c(j7 + j, cVar9.f31774b, new C12024c(-j7, v, cVar, cVar10.m39735b(cVar10.f31773a + j7)), cVar11);
                }
                C12024c<V> cVar12 = cVar10.f31775c;
                C12024c<V> cVar13 = cVar10.f31776d;
                long j8 = cVar10.f31773a;
                long j9 = cVar9.f31773a;
                V v4 = cVar10.f31774b;
                long j10 = j8 + j9 + j;
                C12024c cVar14 = new C12024c((-j9) - j8, v, cVar, cVar12.m39735b(cVar12.f31773a + j8 + j9));
                long j11 = cVar10.f31773a;
                return new C12024c(j10, v4, cVar14, new C12024c(-j11, cVar9.f31774b, cVar13.m39735b(cVar13.f31773a + j11), cVar11));
            }
        }
        return new C12024c(j, v, cVar, cVar2);
    }
}
