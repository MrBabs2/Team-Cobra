package com.flurry.sdk;

import com.flurry.sdk.C6817f3;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.flurry.sdk.g3 */
public final class C6832g3 implements C6817f3 {

    /* renamed from: j */
    private static final Set<String> f12784j = new HashSet();

    /* renamed from: a */
    public final C6817f3.C6818a mo23575a(C7044u6 u6Var) {
        if (!u6Var.mo23538a().equals(C7023s6.ORIGIN_ATTRIBUTE)) {
            return C6817f3.f12725a;
        }
        String str = ((C6776c6) u6Var.mo23714f()).f12614b;
        if (f12784j.size() < 10 || f12784j.contains(str)) {
            f12784j.add(str);
            return C6817f3.f12725a;
        }
        C6792d1.m14488e("OriginAttributeDropRule", "MaxOrigins exceeded: " + f12784j.size());
        return C6817f3.f12732h;
    }

    /* renamed from: a */
    public final void mo23576a() {
    }
}
