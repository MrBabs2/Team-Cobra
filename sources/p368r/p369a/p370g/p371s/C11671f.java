package p368r.p369a.p370g.p371s;

import okhttp3.internal.http2.Settings;

/* renamed from: r.a.g.s.f */
/* compiled from: DNSResultCode */
public enum C11671f {
    Unknown("Unknown", Settings.DEFAULT_INITIAL_WINDOW_SIZE),
    NoError("No Error", 0),
    FormErr("Format Error", 1),
    ServFail("Server Failure", 2),
    NXDomain("Non-Existent Domain", 3),
    NotImp("Not Implemented", 4),
    Refused("Query Refused", 5),
    YXDomain("Name Exists when it should not", 6),
    YXRRSet("RR Set Exists when it should not", 7),
    NXRRSet("RR Set that should exist does not", 8),
    NotAuth("Server Not Authoritative for zone", 9),
    NotZone("NotZone Name not contained in zone", 10);
    

    /* renamed from: f */
    private final int f31209f;

    private C11671f(String str, int i) {
        this.f31209f = i;
    }

    /* renamed from: a */
    public int mo38198a() {
        return this.f31209f;
    }

    public String toString() {
        return name() + " index " + mo38198a();
    }

    /* renamed from: a */
    public static C11671f m38383a(int i, int i2) {
        int i3 = (i & 15) | ((i2 >> 28) & 255);
        for (C11671f fVar : values()) {
            if (fVar.f31209f == i3) {
                return fVar;
            }
        }
        return Unknown;
    }
}
