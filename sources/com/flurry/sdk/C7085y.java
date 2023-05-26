package com.flurry.sdk;

/* renamed from: com.flurry.sdk.y */
public final class C7085y extends C6798d7<C7074x> {

    /* renamed from: o */
    public String f13349o;

    /* renamed from: p */
    public boolean f13350p = false;

    /* renamed from: q */
    private C6852h7 f13351q;

    /* renamed from: r */
    protected C6823f7<C6877i7> f13352r;

    /* renamed from: com.flurry.sdk.y$a */
    class C7086a implements C6823f7<C6877i7> {
        C7086a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            C7085y yVar = C7085y.this;
            yVar.mo23583a(new C7074x(yVar.f13349o, C7085y.this.f13350p));
        }
    }

    /* renamed from: com.flurry.sdk.y$b */
    class C7087b extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C6823f7 f13354h;

        /* renamed from: i */
        final /* synthetic */ C7074x f13355i;

        C7087b(C7085y yVar, C6823f7 f7Var, C7074x xVar) {
            this.f13354h = f7Var;
            this.f13355i = xVar;
        }

        /* renamed from: a */
        public final void mo23531a() {
            this.f13354h.mo23539a(this.f13355i);
        }
    }

    public C7085y(C6852h7 h7Var) {
        super("NotificationProvider");
        C7086a aVar = new C7086a();
        this.f13352r = aVar;
        this.f13351q = h7Var;
        h7Var.mo23582a(aVar);
    }

    /* renamed from: a */
    public final void mo23582a(C6823f7<C7074x> f7Var) {
        super.mo23582a(f7Var);
        mo23563c(new C7087b(this, f7Var, new C7074x(this.f13349o, this.f13350p)));
    }
}
