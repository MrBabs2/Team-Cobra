package com.flurry.sdk;

import com.flurry.sdk.C6868i2;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.d7 */
public class C6798d7<T> extends C6916l2 {

    /* renamed from: n */
    protected Set<C6823f7<T>> f12667n;

    /* renamed from: com.flurry.sdk.d7$a */
    class C6799a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C6823f7 f12668h;

        C6799a(C6823f7 f7Var) {
            this.f12668h = f7Var;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6798d7.this.f12667n.add(this.f12668h);
        }
    }

    /* renamed from: com.flurry.sdk.d7$b */
    class C6800b extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C6823f7 f12670h;

        C6800b(C6823f7 f7Var) {
            this.f12670h = f7Var;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6798d7.this.f12667n.remove(this.f12670h);
        }
    }

    /* renamed from: com.flurry.sdk.d7$c */
    class C6801c extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ Object f12672h;

        /* renamed from: com.flurry.sdk.d7$c$a */
        class C6802a extends C6816f2 {

            /* renamed from: h */
            final /* synthetic */ C6823f7 f12674h;

            C6802a(C6823f7 f7Var) {
                this.f12674h = f7Var;
            }

            /* renamed from: a */
            public final void mo23531a() {
                this.f12674h.mo23539a(C6801c.this.f12672h);
            }
        }

        C6801c(Object obj) {
            this.f12672h = obj;
        }

        /* renamed from: a */
        public final void mo23531a() {
            for (C6823f7<T> aVar : C6798d7.this.f12667n) {
                Future unused = C6798d7.this.mo23563c(new C6802a(aVar));
            }
        }
    }

    protected C6798d7(String str) {
        super(str, C6868i2.m14604a(C6868i2.C6870b.PROVIDER));
        this.f12667n = null;
        this.f12667n = new HashSet();
    }

    /* renamed from: b */
    public void mo23584b(C6823f7<T> f7Var) {
        mo23563c(new C6800b(f7Var));
    }

    /* renamed from: d */
    public void mo23585d() {
    }

    /* renamed from: a */
    public void mo23582a(C6823f7<T> f7Var) {
        if (f7Var != null) {
            mo23563c(new C6799a(f7Var));
        }
    }

    /* renamed from: a */
    public void mo23583a(T t) {
        mo23563c(new C6801c(t));
    }
}
