package com.flurry.sdk;

import com.flurry.sdk.C7079x2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.a3 */
final class C6738a3 extends C6767c3 {

    /* renamed from: r */
    protected List<C6888j3> f12541r;

    /* renamed from: s */
    protected C6873i3 f12542s = new C6740b();

    /* renamed from: com.flurry.sdk.a3$a */
    class C6739a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C7044u6 f12543h;

        C6739a(C7044u6 u6Var) {
            this.f12543h = u6Var;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6738a3.m14375a(C6738a3.this, this.f12543h);
            C6738a3.this.mo23558d(this.f12543h);
        }
    }

    /* renamed from: com.flurry.sdk.a3$b */
    class C6740b implements C6873i3 {
        C6740b() {
        }

        /* renamed from: a */
        public final void mo23535a(C7044u6 u6Var) {
            C6738a3.this.mo23556c(u6Var);
        }

        /* renamed from: b */
        public final void mo23537b(C7044u6 u6Var) {
            C6738a3.this.mo23558d(u6Var);
        }

        /* renamed from: a */
        public final void mo23536a(Runnable runnable) {
            Future unused = C6738a3.this.mo23563c(runnable);
        }
    }

    /* renamed from: com.flurry.sdk.a3$c */
    class C6741c extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C7044u6 f12546h;

        C6741c(C7044u6 u6Var) {
            this.f12546h = u6Var;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6738a3.m14375a(C6738a3.this, this.f12546h);
        }
    }

    C6738a3(C7079x2 x2Var) {
        super("PolicyModule", x2Var);
        ArrayList arrayList = new ArrayList();
        this.f12541r = arrayList;
        arrayList.add(new C6904k3(this.f12542s));
    }

    /* renamed from: b */
    public final C7079x2.C7080a mo23534b(C7044u6 u6Var) {
        mo23563c(new C6741c(u6Var));
        return super.mo23534b(u6Var);
    }

    /* renamed from: a */
    public final void mo23533a(C7044u6 u6Var) {
        mo23563c(new C6739a(u6Var));
    }

    /* renamed from: a */
    static /* synthetic */ void m14375a(C6738a3 a3Var, C7044u6 u6Var) {
        for (C6888j3 a : a3Var.f12541r) {
            a.mo23628a(u6Var);
        }
    }
}
