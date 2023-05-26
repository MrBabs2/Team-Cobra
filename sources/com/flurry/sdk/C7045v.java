package com.flurry.sdk;

/* renamed from: com.flurry.sdk.v */
public final class C7045v {

    /* renamed from: a */
    public final boolean f13244a;

    /* renamed from: b */
    public final C7046a f13245b;

    /* renamed from: c */
    public final String f13246c;

    /* renamed from: d */
    public final String f13247d;

    /* renamed from: e */
    public final String f13248e;

    /* renamed from: f */
    public final String f13249f;

    /* renamed from: g */
    public final String f13250g;

    /* renamed from: h */
    public final String f13251h;

    /* renamed from: i */
    public final int f13252i;

    /* renamed from: com.flurry.sdk.v$a */
    public enum C7046a {
        NONE_OR_UNKNOWN(0),
        NETWORK_AVAILABLE(1),
        WIFI(2),
        CELL(3);
        

        /* renamed from: f */
        public int f13258f;

        private C7046a(int i) {
            this.f13258f = i;
        }
    }

    C7045v(C7046a aVar, boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f13244a = z;
        this.f13245b = aVar;
        this.f13246c = str;
        this.f13247d = str2;
        this.f13248e = str3;
        this.f13249f = str4;
        this.f13250g = str5;
        this.f13251h = str6;
        this.f13252i = i;
    }
}
