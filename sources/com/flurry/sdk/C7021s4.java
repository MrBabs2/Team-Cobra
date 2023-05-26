package com.flurry.sdk;

/* renamed from: com.flurry.sdk.s4 */
final class C7021s4 implements C6823f7<C6996r> {
    C7021s4() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23539a(Object obj) {
        C6996r rVar = (C6996r) obj;
        String str = rVar.f13143a;
        String str2 = rVar.f13144b;
        if ((str == null || str.isEmpty()) && (str2 == null || str2.isEmpty())) {
            C6792d1.m14476a(2, "LocaleFrame", "Locale is empty, do not send the frame.");
        } else {
            C6925m2.m14707a().mo23649a(new C7091y3(new C7099z3(str, str2)));
        }
        C6792d1.m14476a(4, "LocaleObserver", "Locale language: " + rVar.f13143a + ". Locale country: " + rVar.f13144b);
    }
}
