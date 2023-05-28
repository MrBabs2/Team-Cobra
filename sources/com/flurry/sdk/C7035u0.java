package com.flurry.sdk;

import android.text.TextUtils;

/* renamed from: com.flurry.sdk.u0 */
public final class C7035u0 extends C6962p0 {
    public C7035u0() {
        super("Streaming", "FlurryStreamingWithFramesDataSender");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23678a(int i, String str, String str2) {
        if (C6812e7.m14513a().f12706k.f12643q.get()) {
            C6766c2.m14419a(i, str, str2, true);
            return;
        }
        C6971p2.m14808a("last_streaming_http_error_code", i);
        C6971p2.m14810a("last_streaming_http_error_message", str);
        C6971p2.m14810a("last_streaming_http_report_identifier", str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo23684d() {
        String b = C6815f1.m14517b();
        if (TextUtils.isEmpty(b)) {
            return "https://data.flurry.com/v1/flr.do";
        }
        return b + "/v1/flr.do";
    }
}
