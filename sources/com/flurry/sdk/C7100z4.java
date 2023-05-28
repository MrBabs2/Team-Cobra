package com.flurry.sdk;

import com.flurry.sdk.C6938n2;

/* renamed from: com.flurry.sdk.z4 */
final class C7100z4 implements C6823f7<C6804e> {
    C7100z4() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23539a(Object obj) {
        C6804e eVar = (C6804e) obj;
        if (eVar == null) {
            C6792d1.m14476a(2, "SessionInfoFrame", "Session info data is null, do not send the frame.");
        } else {
            C6934n0.m14722b();
            int i = C6938n2.C6939a.AGENT_REPORT_TYPE_MAIN_DEVICE.f13025f;
            C6933n nVar = eVar.f12679d;
            if (nVar != null && nVar.f13003a) {
                i = C6938n2.C6939a.AGENT_REPORT_TYPE_INSTANT_APP.f13025f;
            }
            C6925m2.m14707a().mo23649a(new C6931m6(new C6944n6(eVar.f12676a, i, eVar.f12677b, eVar.f12678c)));
        }
        C6792d1.m14476a(4, "SessionInfoObserver", "SessionInfoData".concat(String.valueOf(eVar)));
    }
}
