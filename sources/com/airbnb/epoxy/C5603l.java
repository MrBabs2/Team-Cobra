package com.airbnb.epoxy;

import java.util.List;

/* renamed from: com.airbnb.epoxy.l */
/* compiled from: EpoxyAdapter */
public abstract class C5603l extends C5583d {

    /* renamed from: k */
    private final C5639x f9882k = new C5639x();

    /* renamed from: l */
    protected final List<C5631s<?>> f9883l = new C5576c0();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5631s<?> mo19186a(int i) {
        C5631s<?> sVar = this.f9883l.get(i);
        return sVar.isShown() ? sVar : this.f9882k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C5631s<?>> mo19200c() {
        return this.f9883l;
    }
}
