package com.flurry.sdk;

import com.flurry.sdk.C6817f3;

/* renamed from: com.flurry.sdk.d3 */
public final class C6794d3 implements C6817f3 {

    /* renamed from: j */
    private int f12664j = 0;

    /* renamed from: a */
    public final C6817f3.C6818a mo23575a(C7044u6 u6Var) {
        if (u6Var.mo23538a().equals(C7023s6.FLUSH_FRAME)) {
            return new C6817f3.C6818a(C6817f3.C6819b.DO_NOT_DROP, new C6773c4(new C6795d4(this.f12664j)));
        }
        if (!u6Var.mo23538a().equals(C7023s6.ANALYTICS_ERROR)) {
            return C6817f3.f12725a;
        }
        if (C6978p7.UNCAUGHT_EXCEPTION_ID.f13116f.equals(((C7028t3) u6Var.mo23714f()).f13217c)) {
            return C6817f3.f12725a;
        }
        int i = this.f12664j;
        this.f12664j = i + 1;
        if (i >= 50) {
            return C6817f3.f12731g;
        }
        return C6817f3.f12725a;
    }

    /* renamed from: a */
    public final void mo23576a() {
        this.f12664j = 0;
    }
}
