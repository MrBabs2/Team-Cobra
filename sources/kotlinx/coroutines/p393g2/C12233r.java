package kotlinx.coroutines.p393g2;

/* renamed from: kotlinx.coroutines.g2.r */
/* compiled from: SystemProps.common.kt */
final /* synthetic */ class C12233r {
    /* renamed from: a */
    public static final boolean m40331a(String str, boolean z) {
        String a = C12231p.m40323a(str);
        return a != null ? Boolean.parseBoolean(a) : z;
    }

    /* renamed from: a */
    public static /* synthetic */ int m40328a(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C12231p.m40319a(str, i, i2, i3);
    }

    /* renamed from: a */
    public static final int m40327a(String str, int i, int i2, int i3) {
        return (int) C12231p.m40321a(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: a */
    public static /* synthetic */ long m40330a(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C12231p.m40321a(str, j, j4, j3);
    }

    /* renamed from: a */
    public static final long m40329a(String str, long j, long j2, long j3) {
        String a = C12231p.m40323a(str);
        if (a == null) {
            return j;
        }
        Long d = C12129u.m40039d(a);
        if (d != null) {
            long longValue = d.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + a + '\'').toString());
    }
}
