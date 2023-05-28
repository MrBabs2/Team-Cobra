package p368r.p369a.p370g.p371s;

import okhttp3.internal.http2.Settings;

/* renamed from: r.a.g.s.c */
/* compiled from: DNSOptionCode */
public enum C11668c {
    Unknown("Unknown", Settings.DEFAULT_INITIAL_WINDOW_SIZE),
    LLQ("LLQ", 1),
    UL("UL", 2),
    NSID("NSID", 3),
    Owner("Owner", 4);
    

    /* renamed from: f */
    private final int f31123f;

    private C11668c(String str, int i) {
        this.f31123f = i;
    }

    /* renamed from: a */
    public int mo38191a() {
        return this.f31123f;
    }

    public String toString() {
        return name() + " index " + mo38191a();
    }

    /* renamed from: a */
    public static C11668c m38376a(int i) {
        for (C11668c cVar : values()) {
            if (cVar.f31123f == i) {
                return cVar;
            }
        }
        return Unknown;
    }
}
