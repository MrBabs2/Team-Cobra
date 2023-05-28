package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import p050l.p066e.C4870b;

public class zaae extends zal {

    /* renamed from: k */
    private final C4870b<zai<?>> f13864k;

    /* renamed from: l */
    private GoogleApiManager f13865l;

    /* renamed from: i */
    private final void m15621i() {
        if (!this.f13864k.isEmpty()) {
            this.f13865l.mo25029a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25148a(ConnectionResult connectionResult, int i) {
        this.f13865l.mo25026a(connectionResult, i);
    }

    /* renamed from: c */
    public void mo25071c() {
        super.mo25071c();
        m15621i();
    }

    /* renamed from: d */
    public void mo25072d() {
        super.mo25072d();
        m15621i();
    }

    /* renamed from: e */
    public void mo25073e() {
        super.mo25073e();
        this.f13865l.mo25031b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo25149f() {
        this.f13865l.mo25033c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C4870b<zai<?>> mo25150h() {
        return this.f13864k;
    }
}
