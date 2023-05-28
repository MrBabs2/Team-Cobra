package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;

/* renamed from: cm.aptoide.pt.store.view.q */
/* compiled from: lambda */
public final /* synthetic */ class C4347q implements ErrorRequestListener {

    /* renamed from: a */
    private final /* synthetic */ AddStoreDialog f7451a;

    public /* synthetic */ C4347q(AddStoreDialog addStoreDialog) {
        this.f7451a = addStoreDialog;
    }

    public final void onError(Throwable th) {
        this.f7451a.mo14607a(th);
    }
}
