package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.f */
/* compiled from: lambda */
public final /* synthetic */ class C4244f implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ ErrorRequestListener f7335f;

    public /* synthetic */ C4244f(ErrorRequestListener errorRequestListener) {
        this.f7335f = errorRequestListener;
    }

    public final void call(Object obj) {
        StoreUtils.m7274a(this.f7335f, (Throwable) obj);
    }
}
