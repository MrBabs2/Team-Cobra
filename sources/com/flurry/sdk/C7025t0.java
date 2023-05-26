package com.flurry.sdk;

/* renamed from: com.flurry.sdk.t0 */
public final class C7025t0 extends C6962p0 {
    public C7025t0() {
        super("Analytics", "FlurryStreamingUpdateDataSender");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23678a(int i, String str, String str2) {
        if (C6812e7.m14513a().f12706k.f12643q.get()) {
            C6766c2.m14419a(i, str, str2, true);
            return;
        }
        C6971p2.m14808a("last_legacy_http_error_code", i);
        C6971p2.m14810a("last_legacy_http_error_message", str);
        C6971p2.m14810a("last_legacy_http_report_identifier", str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo23684d() {
        return "https://data.flurry.com/aap.do";
    }
}
