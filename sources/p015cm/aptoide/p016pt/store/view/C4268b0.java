package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;

/* renamed from: cm.aptoide.pt.store.view.b0 */
/* compiled from: lambda */
public final /* synthetic */ class C4268b0 implements ErrorRequestListener {

    /* renamed from: a */
    private final /* synthetic */ GetStoreEndlessFragment f7355a;

    public /* synthetic */ C4268b0(GetStoreEndlessFragment getStoreEndlessFragment) {
        this.f7355a = getStoreEndlessFragment;
    }

    public final void onError(Throwable th) {
        this.f7355a.finishLoading(th);
    }
}
