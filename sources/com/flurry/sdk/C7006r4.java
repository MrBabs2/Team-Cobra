package com.flurry.sdk;

import android.os.Bundle;
import com.flurry.sdk.C6960p;
import java.util.ArrayList;

/* renamed from: com.flurry.sdk.r4 */
final class C7006r4 implements C6823f7<C6960p> {
    C7006r4() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23539a(Object obj) {
        Bundle bundle;
        C6960p pVar = (C6960p) obj;
        if (C6960p.C6961a.APP_ORIENTATION_CHANGE.equals(pVar.f13059a) && (bundle = pVar.f13060b) != null && bundle.containsKey("orientation_name")) {
            int i = bundle.getInt("orientation_name");
            C6821f5.m14523a(i);
            C6792d1.m14476a(5, "LifecycleObserver", pVar.f13059a.name() + " orientation: " + i);
        }
        if (C6960p.C6961a.CREATED.equals(pVar.f13059a)) {
            m14875a(pVar);
        }
    }

    /* renamed from: a */
    private static void m14875a(C6960p pVar) {
        Bundle bundle;
        Bundle bundle2 = pVar.f13060b;
        if (bundle2 != null && (bundle = bundle2.getBundle("launch_options")) != null) {
            C6792d1.m14476a(3, "LifecycleObserver", "Launch Options Bundle is present " + bundle.toString());
            for (String str : bundle.keySet()) {
                if (str != null) {
                    Object obj = bundle.get(str);
                    String obj2 = obj != null ? obj.toString() : "null";
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj2);
                    if (str == null || str.isEmpty()) {
                        C6792d1.m14476a(2, "LaunchOptionsFrame", "Launch option key is empty, do not send the frame.");
                    } else if (arrayList.size() == 0) {
                        C6792d1.m14476a(2, "LaunchOptionsFrame", "Launch option values is empty, do not send the frame.");
                    } else {
                        C6925m2.m14707a().mo23649a(new C7054v5(new C7072w5(str, arrayList)));
                    }
                    C6792d1.m14476a(3, "LifecycleObserver", "Launch options Key: " + str + ". Its value: " + obj2);
                }
            }
        }
    }
}
