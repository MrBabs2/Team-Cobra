package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;

/* renamed from: cm.aptoide.pt.store.view.c1 */
/* compiled from: lambda */
public final /* synthetic */ class C4272c1 implements ErrorRequestListener {

    /* renamed from: a */
    private final /* synthetic */ PrivateStoreDialog f7359a;

    public /* synthetic */ C4272c1(PrivateStoreDialog privateStoreDialog) {
        this.f7359a = privateStoreDialog;
    }

    public final void onError(Throwable th) {
        this.f7359a.mo14704a(th);
    }
}
