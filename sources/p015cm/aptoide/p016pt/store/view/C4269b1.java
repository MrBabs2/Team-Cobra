package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;

/* renamed from: cm.aptoide.pt.store.view.b1 */
/* compiled from: lambda */
public final /* synthetic */ class C4269b1 implements SuccessRequestListener {

    /* renamed from: f */
    private final /* synthetic */ PrivateStoreDialog f7356f;

    public /* synthetic */ C4269b1(PrivateStoreDialog privateStoreDialog) {
        this.f7356f = privateStoreDialog;
    }

    public final void call(Object obj) {
        this.f7356f.mo14703a((GetStoreMeta) obj);
    }
}
