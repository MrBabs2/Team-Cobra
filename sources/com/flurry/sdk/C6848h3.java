package com.flurry.sdk;

import com.flurry.sdk.C6817f3;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.flurry.sdk.h3 */
public final class C6848h3 implements C6817f3 {

    /* renamed from: j */
    protected static final Set<String> f12816j = new HashSet();

    /* renamed from: a */
    public final C6817f3.C6818a mo23575a(C7044u6 u6Var) {
        if (!u6Var.mo23538a().equals(C7023s6.SESSION_PROPERTIES_PARAMS)) {
            return C6817f3.f12725a;
        }
        String str = ((C6849h4) u6Var.mo23714f()).f12817b;
        if (f12816j.size() < 10 || f12816j.contains(str)) {
            f12816j.add(str);
            return C6817f3.f12725a;
        }
        C6792d1.m14488e("SessionPropertiesParamsDropRule", "MaxSessionPropertiesParams exceeded: 10");
        return C6817f3.f12733i;
    }

    /* renamed from: a */
    public final void mo23576a() {
        f12816j.clear();
    }
}
