package com.trello.rxlifecycle;

import p123rx.C5368e;
import p123rx.p126m.C5379n;

/* renamed from: com.trello.rxlifecycle.e */
/* compiled from: UntilCorrespondingEventObservableTransformer */
final class C9005e<T, R> implements C4749b<T> {

    /* renamed from: f */
    final C5368e<R> f25493f;

    /* renamed from: g */
    final C5379n<R, R> f25494g;

    public C9005e(C5368e<R> eVar, C5379n<R, R> nVar) {
        this.f25493f = eVar;
        this.f25494g = nVar;
    }

    /* renamed from: a */
    public C5368e<T> call(C5368e<T> eVar) {
        return eVar.mo18683e((C5368e<? extends E>) C9002d.m29567a(this.f25493f, this.f25494g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9005e.class != obj.getClass()) {
            return false;
        }
        C9005e eVar = (C9005e) obj;
        if (!this.f25493f.equals(eVar.f25493f)) {
            return false;
        }
        return this.f25494g.equals(eVar.f25494g);
    }

    public int hashCode() {
        return (this.f25493f.hashCode() * 31) + this.f25494g.hashCode();
    }

    public String toString() {
        return "UntilCorrespondingEventObservableTransformer{sharedLifecycle=" + this.f25493f + ", correspondingEvents=" + this.f25494g + '}';
    }
}
