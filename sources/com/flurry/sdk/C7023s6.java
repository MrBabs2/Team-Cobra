package com.flurry.sdk;

/* renamed from: com.flurry.sdk.s6 */
public enum C7023s6 {
    UNKNOWN(0),
    FLUSH_FRAME(1),
    FRAME_COUNTER(2),
    SESSION_ID(128),
    APP_STATE(132),
    APP_INFO(133),
    ANALYTICS_EVENT(134),
    ANALYTICS_ERROR(137),
    DEVICE_PROPERTIES(139),
    REPORTED_ID(140),
    SESSION_INFO(141),
    SERVER_COOKIES(142),
    DYNAMIC_SESSION_INFO(143),
    REFERRER(145),
    USER_ID(146),
    SESSION_ORIGIN(147),
    LOCALE(148),
    NETWORK(149),
    LOCATION(150),
    PAGE_VIEW(152),
    SESSION_PROPERTIES(153),
    LAUNCH_OPTIONS(155),
    APP_ORIENTATION(156),
    SESSION_PROPERTIES_PARAMS(157),
    f13174E(158),
    ORIGIN_ATTRIBUTE(160),
    TIMEZONE(162),
    VARIANT_IDS(163),
    REPORTING(164),
    PREVIOUS_SUCCESSFUL_REPORT(166),
    NUM_ERRORS(167),
    GENDER(168),
    BIRTHDATE(169),
    EVENTS_SUMMARY(170),
    USER_PROPERTY(171),
    CONSENT(172),
    CCPA_OPTOUT(174),
    CCPA_DELETION(175),
    EOF(190);
    

    /* renamed from: f */
    public final int f13210f;

    private C7023s6(int i) {
        this.f13210f = i;
    }

    /* renamed from: a */
    public static C7023s6 m14900a(int i) {
        for (C7023s6 s6Var : values()) {
            if (i == s6Var.f13210f) {
                return s6Var;
            }
        }
        return UNKNOWN;
    }
}
