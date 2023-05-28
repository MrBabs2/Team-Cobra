package com.flurry.sdk;

import android.util.Base64;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.flurry.sdk.q4 */
final class C6991q4 implements C6823f7<C6913l> {
    C6991q4() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23539a(Object obj) {
        C6913l lVar = (C6913l) obj;
        boolean z = lVar.f12958b;
        Map<C6922m, String> a = lVar.mo23643a();
        if (a == null || a.size() == 0) {
            C6792d1.m14476a(2, "ReportedIDFrame", "Reported ids is empty, do not send the frame.");
        } else {
            C6925m2.m14707a().mo23649a(new C6876i6(new C6892j6(a, z)));
        }
        Map<C6922m, String> a2 = lVar.mo23643a();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : a2.entrySet()) {
            if (((C6922m) next.getKey()).equals(C6922m.AndroidInstallationId)) {
                hashMap.put(((C6922m) next.getKey()).name(), C6766c2.m14417a(Base64.decode((String) next.getValue(), 2)).toUpperCase(Locale.getDefault()));
            } else {
                hashMap.put(((C6922m) next.getKey()).name(), next.getValue());
            }
        }
        C6826g0.m14532b();
        C6826g0.m14533b("Reported Ids", hashMap);
        C6792d1.m14476a(4, "IdObserver", "IdProvider" + lVar.mo23643a());
    }
}
