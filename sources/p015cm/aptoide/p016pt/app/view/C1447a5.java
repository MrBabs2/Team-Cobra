package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.app.view.a5 */
/* compiled from: lambda */
public final /* synthetic */ class C1447a5 implements C5377a {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f3945f;

    /* renamed from: g */
    private final /* synthetic */ AppModel f3946g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f3947h;

    /* renamed from: i */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f3948i;

    public /* synthetic */ C1447a5(AppViewPresenter appViewPresenter, AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.f3945f = appViewPresenter;
        this.f3946g = appModel;
        this.f3947h = action;
        this.f3948i = offerResponseStatus;
    }

    public final void call() {
        this.f3945f.mo7413c(this.f3946g, this.f3947h, this.f3948i);
    }
}
