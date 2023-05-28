package com.trello.rxlifecycle;

import p123rx.C5368e;

/* renamed from: com.trello.rxlifecycle.f */
/* compiled from: UntilEventObservableTransformer */
final class C9006f<T, R> implements C4749b<T> {

    /* renamed from: f */
    final C5368e<R> f25495f;

    /* renamed from: g */
    final R f25496g;

    public C9006f(C5368e<R> eVar, R r) {
        this.f25495f = eVar;
        this.f25496g = r;
    }

    /* renamed from: a */
    public C5368e<T> call(C5368e<T> eVar) {
        return eVar.mo18683e((C5368e<? extends E>) C9002d.m29566a(this.f25495f, this.f25496g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9006f.class != obj.getClass()) {
            return false;
        }
        C9006f fVar = (C9006f) obj;
        if (!this.f25495f.equals(fVar.f25495f)) {
            return false;
        }
        return this.f25496g.equals(fVar.f25496g);
    }

    public int hashCode() {
        return (this.f25495f.hashCode() * 31) + this.f25496g.hashCode();
    }

    public String toString() {
        return "UntilEventObservableTransformer{lifecycle=" + this.f25495f + ", event=" + this.f25496g + '}';
    }
}
