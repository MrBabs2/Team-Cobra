package p368r.p369a.p370g.p371s;

/* renamed from: r.a.g.s.b */
/* compiled from: DNSLabel */
public enum C11667b {
    Unknown("", 128),
    Standard("standard label", 0),
    Compressed("compressed label", 192),
    Extended("extended label", 64);
    

    /* renamed from: f */
    private final int f31116f;

    private C11667b(String str, int i) {
        this.f31116f = i;
    }

    /* renamed from: b */
    public static int m38374b(int i) {
        return i & 63;
    }

    /* renamed from: a */
    public int mo38189a() {
        return this.f31116f;
    }

    public String toString() {
        return name() + " index " + mo38189a();
    }

    /* renamed from: a */
    public static C11667b m38373a(int i) {
        int i2 = i & 192;
        for (C11667b bVar : values()) {
            if (bVar.f31116f == i2) {
                return bVar;
            }
        }
        return Unknown;
    }
}
