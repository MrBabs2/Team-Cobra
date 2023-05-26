package com.flurry.sdk;

import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.i0 */
public final class C6860i0 extends C6798d7<C6845h0> {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C6933n f12831o;

    /* renamed from: p */
    private C6784d0 f12832p;

    /* renamed from: q */
    private C6946o f12833q;

    /* renamed from: r */
    private C6823f7<C6759c0> f12834r = new C6861a();

    /* renamed from: s */
    private C6823f7<C6933n> f12835s = new C6863b();

    /* renamed from: com.flurry.sdk.i0$a */
    class C6861a implements C6823f7<C6759c0> {

        /* renamed from: com.flurry.sdk.i0$a$a */
        class C6862a extends C6816f2 {

            /* renamed from: h */
            final /* synthetic */ C6759c0 f12837h;

            C6862a(C6759c0 c0Var) {
                this.f12837h = c0Var;
            }

            /* renamed from: a */
            public final void mo23531a() throws Exception {
                C6845h0 h0Var;
                if (this.f12837h.f12590e.equals(C6805e0.SESSION_START)) {
                    h0Var = new C6845h0(true, C6860i0.this.f12831o);
                } else {
                    h0Var = new C6845h0(false, C6860i0.this.f12831o);
                }
                C6860i0.this.mo23583a(h0Var);
            }
        }

        C6861a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            Future unused = C6860i0.this.mo23563c(new C6862a((C6759c0) obj));
        }
    }

    /* renamed from: com.flurry.sdk.i0$b */
    class C6863b implements C6823f7<C6933n> {

        /* renamed from: com.flurry.sdk.i0$b$a */
        class C6864a extends C6816f2 {

            /* renamed from: h */
            final /* synthetic */ C6933n f12840h;

            C6864a(C6933n nVar) {
                this.f12840h = nVar;
            }

            /* renamed from: a */
            public final void mo23531a() throws Exception {
                C6792d1.m14476a(3, "SessionPropertyProvider", "Receive instant app data");
                C6933n unused = C6860i0.this.f12831o = this.f12840h;
            }
        }

        C6863b() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            Future unused = C6860i0.this.mo23563c(new C6864a((C6933n) obj));
        }
    }

    public C6860i0(C6784d0 d0Var, C6946o oVar) {
        super("SessionPropertyProvider");
        this.f12832p = d0Var;
        d0Var.mo23582a(this.f12834r);
        this.f12833q = oVar;
        oVar.mo23582a(this.f12835s);
    }
}
