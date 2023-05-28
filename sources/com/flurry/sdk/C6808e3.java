package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.sdk.C6817f3;
import com.flurry.sdk.C7051v3;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.flurry.sdk.e3 */
public final class C6808e3 implements C6817f3 {

    /* renamed from: j */
    private final Set<Integer> f12685j = new HashSet();

    /* renamed from: k */
    private final Set<Integer> f12686k = new HashSet();

    /* renamed from: l */
    private final Set<String> f12687l = new HashSet();

    /* renamed from: m */
    private final Set<Integer> f12688m = new HashSet();

    /* renamed from: n */
    private final Set<Integer> f12689n = new HashSet();

    /* renamed from: a */
    public final C6817f3.C6818a mo23575a(C7044u6 u6Var) {
        if (u6Var.mo23538a().equals(C7023s6.FLUSH_FRAME)) {
            return new C6817f3.C6818a(C6817f3.C6819b.DO_NOT_DROP, new C7070w3(new C7081x3(this.f12685j.size(), this.f12686k.isEmpty())));
        }
        if (!u6Var.mo23538a().equals(C7023s6.ANALYTICS_EVENT)) {
            return C6817f3.f12725a;
        }
        C7051v3 v3Var = (C7051v3) u6Var.mo23714f();
        String str = v3Var.f13267b;
        int i = v3Var.f13268c;
        this.f12685j.add(Integer.valueOf(i));
        if (v3Var.f13269d != C7051v3.C7052a.CUSTOM) {
            if (this.f12689n.size() < 1000 || m14506a(v3Var)) {
                this.f12689n.add(Integer.valueOf(i));
                return C6817f3.f12725a;
            }
            this.f12686k.add(Integer.valueOf(i));
            return C6817f3.f12729e;
        } else if (TextUtils.isEmpty(str)) {
            this.f12686k.add(Integer.valueOf(i));
            return C6817f3.f12727c;
        } else if (m14506a(v3Var) && !this.f12688m.contains(Integer.valueOf(i))) {
            this.f12686k.add(Integer.valueOf(i));
            return C6817f3.f12730f;
        } else if (this.f12688m.size() >= 1000 && !m14506a(v3Var)) {
            this.f12686k.add(Integer.valueOf(i));
            return C6817f3.f12728d;
        } else if (this.f12687l.contains(str) || this.f12687l.size() < 500) {
            this.f12687l.add(str);
            this.f12688m.add(Integer.valueOf(i));
            return C6817f3.f12725a;
        } else {
            this.f12686k.add(Integer.valueOf(i));
            return C6817f3.f12726b;
        }
    }

    /* renamed from: a */
    public final void mo23576a() {
        this.f12685j.clear();
        this.f12686k.clear();
        this.f12687l.clear();
        this.f12688m.clear();
        this.f12689n.clear();
    }

    /* renamed from: a */
    private static boolean m14506a(C7051v3 v3Var) {
        return v3Var.f13272g && !v3Var.f13273h;
    }
}
