package com.flurry.sdk;

/* renamed from: com.flurry.sdk.j3 */
public interface C6888j3 {

    /* renamed from: com.flurry.sdk.j3$a */
    public enum C6889a {
        DO_NOT_FLUSH("DO_NOT_FLUSH"),
        REASON_STICKY_SET_COMPLETE("Sticky set is complete"),
        REASON_APP_STATE_CHANGE("App State has changed"),
        REASON_SESSION_FINALIZE("Session Finalized"),
        REASON_APP_CRASH("App crashed"),
        REASON_FORCE_FLUSH("Force to Flush"),
        REASON_STARTUP("App Started"),
        REASON_PUSH_TOKEN_REFRESH("Push Token Refreshed"),
        REASON_DATA_DELETION("Delete Data");
        

        /* renamed from: f */
        public final String f12890f;

        private C6889a(String str) {
            this.f12890f = str;
        }
    }

    /* renamed from: a */
    void mo23628a(C7044u6 u6Var);
}
