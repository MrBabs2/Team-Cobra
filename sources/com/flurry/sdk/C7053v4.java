package com.flurry.sdk;

import java.util.Collections;

/* renamed from: com.flurry.sdk.v4 */
final class C7053v4 implements C6823f7<C7074x> {

    /* renamed from: a */
    private String f13286a;

    C7053v4() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23539a(Object obj) {
        C7074x xVar = (C7074x) obj;
        String str = xVar.f13338a;
        boolean z = xVar.f13339b;
        if (str != null && !str.equals(this.f13286a) && z) {
            C6826g0.m14532b();
            C6826g0.m14533b("Log Notification Frame", Collections.emptyMap());
            this.f13286a = str;
            C6925m2.m14707a().mo23649a(new C7101z5(new C6744a6(str, z)));
        }
    }
}
