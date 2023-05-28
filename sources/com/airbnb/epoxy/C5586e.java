package com.airbnb.epoxy;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p050l.p066e.C4873d;

/* renamed from: com.airbnb.epoxy.e */
/* compiled from: BoundViewHolders */
public class C5586e implements Iterable<C5636u> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4873d<C5636u> f9867f = new C4873d<>();

    /* renamed from: com.airbnb.epoxy.e$b */
    /* compiled from: BoundViewHolders */
    private class C5588b implements Iterator<C5636u> {

        /* renamed from: f */
        private int f9868f;

        private C5588b() {
            this.f9868f = 0;
        }

        public boolean hasNext() {
            return this.f9868f < C5586e.this.f9867f.mo16942c();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C5636u next() {
            if (hasNext()) {
                C4873d a = C5586e.this.f9867f;
                int i = this.f9868f;
                this.f9868f = i + 1;
                return (C5636u) a.mo16943c(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: b */
    public void mo19210b(C5636u uVar) {
        this.f9867f.mo16944c(uVar.getItemId());
    }

    public Iterator<C5636u> iterator() {
        return new C5588b();
    }

    public int size() {
        return this.f9867f.mo16942c();
    }

    /* renamed from: a */
    public void mo19209a(C5636u uVar) {
        this.f9867f.mo16945c(uVar.getItemId(), uVar);
    }
}
