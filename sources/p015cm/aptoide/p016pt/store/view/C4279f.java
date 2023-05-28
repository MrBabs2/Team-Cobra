package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;

/* renamed from: cm.aptoide.pt.store.view.f */
/* compiled from: lambda */
public final /* synthetic */ class C4279f implements SuccessRequestListener {

    /* renamed from: f */
    private final /* synthetic */ AddStoreDialog f7367f;

    public /* synthetic */ C4279f(AddStoreDialog addStoreDialog) {
        this.f7367f = addStoreDialog;
    }

    public final void call(Object obj) {
        this.f7367f.mo14604a((GetStoreMeta) obj);
    }
}
