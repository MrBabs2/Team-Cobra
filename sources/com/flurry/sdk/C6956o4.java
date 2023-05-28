package com.flurry.sdk;

import p112n.p113d.p114a.C10561a;

/* renamed from: com.flurry.sdk.o4 */
public final class C6956o4 implements C6823f7<C10561a> {
    /* renamed from: a */
    public final /* synthetic */ void mo23539a(Object obj) {
        C10561a aVar = (C10561a) obj;
        if (aVar == null) {
            C6792d1.m14487d("ConsentFrame", "Consent is null, do not send the frame.");
            return;
        }
        C6925m2.m14707a().mo23649a(new C6919l5(new C6930m5(aVar.mo36109b(), aVar.mo36108a())));
    }
}
