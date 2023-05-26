package com.airbnb.epoxy;

import com.airbnb.epoxy.C5576c0;

/* renamed from: com.airbnb.epoxy.h */
/* compiled from: ControllerModelList */
class C5594h extends C5576c0 {

    /* renamed from: h */
    private static final C5576c0.C5580d f9873h = new C5595a();

    /* renamed from: com.airbnb.epoxy.h$a */
    /* compiled from: ControllerModelList */
    static class C5595a implements C5576c0.C5580d {
        C5595a() {
        }

        /* renamed from: a */
        public void mo19160a(int i, int i2) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }

        /* renamed from: b */
        public void mo19161b(int i, int i2) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    }

    C5594h(int i) {
        super(i);
        mo19135b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo19222f() {
        mo19128a(f9873h);
        mo19136c();
    }
}
