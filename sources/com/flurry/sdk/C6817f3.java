package com.flurry.sdk;

/* renamed from: com.flurry.sdk.f3 */
public interface C6817f3 {

    /* renamed from: a */
    public static final C6818a f12725a = new C6818a(C6819b.DO_NOT_DROP, (C7044u6) null);

    /* renamed from: b */
    public static final C6818a f12726b = new C6818a(C6819b.DROP_EVENTS_UNIQUE_NAME_EXCEEDED, (C7044u6) null);

    /* renamed from: c */
    public static final C6818a f12727c = new C6818a(C6819b.DROP_EVENTS_NAME_INVALID, (C7044u6) null);

    /* renamed from: d */
    public static final C6818a f12728d = new C6818a(C6819b.DROP_EVENTS_COUNT_EXCEEDED, (C7044u6) null);

    /* renamed from: e */
    public static final C6818a f12729e = new C6818a(C6819b.DROP_STANDARD_EVENTS_COUNT_EXCEEDED, (C7044u6) null);

    /* renamed from: f */
    public static final C6818a f12730f = new C6818a(C6819b.DROP_TIMED_EVENTS_START_NOT_FOUND, (C7044u6) null);

    /* renamed from: g */
    public static final C6818a f12731g = new C6818a(C6819b.DROP_ERROR_COUNT_EXCEEDED, (C7044u6) null);

    /* renamed from: h */
    public static final C6818a f12732h = new C6818a(C6819b.DROP_ORIGINS_COUNT_EXCEEDED, (C7044u6) null);

    /* renamed from: i */
    public static final C6818a f12733i = new C6818a(C6819b.DROP_SESSION_PROPERTIES_COUNT_EXCEEDED, (C7044u6) null);

    /* renamed from: com.flurry.sdk.f3$a */
    public static class C6818a {

        /* renamed from: a */
        public C6819b f12734a;

        /* renamed from: b */
        public C7044u6 f12735b;

        C6818a(C6819b bVar, C7044u6 u6Var) {
            this.f12734a = bVar;
            this.f12735b = u6Var;
        }
    }

    /* renamed from: com.flurry.sdk.f3$b */
    public enum C6819b {
        DO_NOT_DROP("DoNotDrop"),
        DROP_EVENTS_UNIQUE_NAME_EXCEEDED("Unique Event Name exceeded"),
        DROP_EVENTS_NAME_INVALID("Invalid Event Name"),
        DROP_EVENTS_COUNT_EXCEEDED("Events count exceeded"),
        DROP_STANDARD_EVENTS_COUNT_EXCEEDED("Standard events count exceeded"),
        DROP_TIMED_EVENTS_START_NOT_FOUND("End Timed Event but Start not found"),
        DROP_EVENTS_REASON_UNKNOWN("reason unknown"),
        DROP_ERROR_COUNT_EXCEEDED("Error count exceeded"),
        DROP_ORIGINS_COUNT_EXCEEDED("Origins count exceeded"),
        DROP_SESSION_PROPERTIES_COUNT_EXCEEDED("Session properties count exceeded");
        

        /* renamed from: f */
        public final String f12747f;

        private C6819b(String str) {
            this.f12747f = str;
        }
    }

    static {
        new C6818a(C6819b.DROP_EVENTS_REASON_UNKNOWN, (C7044u6) null);
    }

    /* renamed from: a */
    C6818a mo23575a(C7044u6 u6Var);

    /* renamed from: a */
    void mo23576a();
}
