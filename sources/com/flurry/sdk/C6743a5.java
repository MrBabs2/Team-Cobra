package com.flurry.sdk;

/* renamed from: com.flurry.sdk.a5 */
public final class C6743a5 implements C6823f7<C6845h0> {
    /* renamed from: a */
    public final /* synthetic */ void mo23539a(Object obj) {
        C6845h0 h0Var = (C6845h0) obj;
        C6792d1.m14476a(3, "SessionPropertyObserver", "Log session property frame");
        if (h0Var == null) {
            C6792d1.m14476a(2, "SessionPropertiesFrame", "Session property data is null, do not send the frame.");
            return;
        }
        C6925m2.m14707a().mo23649a(new C6874i4(new C6890j4(C6874i4.m14610a(h0Var))));
    }
}
