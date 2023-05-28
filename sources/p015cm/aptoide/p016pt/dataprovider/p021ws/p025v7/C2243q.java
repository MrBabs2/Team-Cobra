package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.util.Pair;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.q */
/* compiled from: lambda */
public final /* synthetic */ class C2243q implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ GetStoreWidgets.WSWidget f4946f;

    /* renamed from: g */
    private final /* synthetic */ BaseRequestWithStore.StoreCredentials f4947g;

    public /* synthetic */ C2243q(GetStoreWidgets.WSWidget wSWidget, BaseRequestWithStore.StoreCredentials storeCredentials) {
        this.f4946f = wSWidget;
        this.f4947g = storeCredentials;
    }

    public final void call(Object obj) {
        this.f4946f.setViewObject(new Pair((ListComments) obj, this.f4947g));
    }
}
