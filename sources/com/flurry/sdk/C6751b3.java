package com.flurry.sdk;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.b3 */
final class C6751b3 extends C6767c3 {

    /* renamed from: t */
    protected static C7023s6[] f12564t = {C7023s6.SESSION_INFO, C7023s6.APP_INFO, C7023s6.REPORTED_ID, C7023s6.DEVICE_PROPERTIES, C7023s6.f13174E, C7023s6.REFERRER, C7023s6.LAUNCH_OPTIONS, C7023s6.CONSENT, C7023s6.APP_STATE, C7023s6.NETWORK, C7023s6.LOCALE, C7023s6.TIMEZONE, C7023s6.APP_ORIENTATION, C7023s6.DYNAMIC_SESSION_INFO, C7023s6.LOCATION, C7023s6.USER_ID, C7023s6.BIRTHDATE, C7023s6.GENDER};

    /* renamed from: u */
    protected static C7023s6[] f12565u = {C7023s6.ORIGIN_ATTRIBUTE};
    /* access modifiers changed from: private */

    /* renamed from: r */
    public EnumMap<C7023s6, C7044u6> f12566r = new EnumMap<>(C7023s6.class);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public EnumMap<C7023s6, List<C7044u6>> f12567s = new EnumMap<>(C7023s6.class);

    /* renamed from: com.flurry.sdk.b3$a */
    class C6752a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C7044u6 f12568h;

        C6752a(C7044u6 u6Var) {
            this.f12568h = u6Var;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6751b3.this.mo23558d(this.f12568h);
            C6751b3.m14396a(C6751b3.this, this.f12568h);
            if (C7023s6.FLUSH_FRAME.equals(this.f12568h.mo23538a())) {
                for (Map.Entry value : C6751b3.this.f12566r.entrySet()) {
                    C7044u6 u6Var = (C7044u6) value.getValue();
                    if (u6Var != null) {
                        C6751b3.this.mo23558d(u6Var);
                    }
                }
                for (Map.Entry value2 : C6751b3.this.f12567s.entrySet()) {
                    List list = (List) value2.getValue();
                    if (!(list == null || list.size() == 0)) {
                        for (int i = 0; i < list.size(); i++) {
                            C6751b3.this.mo23558d((C7044u6) list.get(i));
                        }
                    }
                }
            }
        }
    }

    C6751b3(C7079x2 x2Var) {
        super("StickyModule", x2Var);
        for (C7023s6 put : f12564t) {
            this.f12566r.put(put, (Object) null);
        }
        for (C7023s6 put2 : f12565u) {
            this.f12567s.put(put2, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo23533a(C7044u6 u6Var) {
        mo23563c(new C6752a(u6Var));
    }

    /* renamed from: a */
    static /* synthetic */ void m14396a(C6751b3 b3Var, C7044u6 u6Var) {
        C7023s6 a = u6Var.mo23538a();
        List arrayList = new ArrayList();
        if (b3Var.f12566r.containsKey(a)) {
            b3Var.f12566r.put(a, u6Var);
        }
        if (b3Var.f12567s.containsKey(a)) {
            if (b3Var.f12567s.get(a) != null) {
                arrayList = b3Var.f12567s.get(a);
            }
            arrayList.add(u6Var);
            b3Var.f12567s.put(a, arrayList);
        }
    }
}
