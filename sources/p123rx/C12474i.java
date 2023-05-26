package p123rx;

import p123rx.p401n.p406e.C12791l;

/* renamed from: rx.i */
/* compiled from: SingleSubscriber */
public abstract class C12474i<T> implements C5375k {

    /* renamed from: f */
    private final C12791l f32232f = new C12791l();

    /* renamed from: a */
    public abstract void mo18573a(T t);

    /* renamed from: b */
    public final void mo40654b(C5375k kVar) {
        this.f32232f.mo40914a(kVar);
    }

    public final boolean isUnsubscribed() {
        return this.f32232f.isUnsubscribed();
    }

    public abstract void onError(Throwable th);

    public final void unsubscribe() {
        this.f32232f.unsubscribe();
    }
}
