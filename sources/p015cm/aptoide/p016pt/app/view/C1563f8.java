package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.app.view.f8 */
/* compiled from: lambda */
public final /* synthetic */ class C1563f8 implements C5377a {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4087f;

    /* renamed from: g */
    private final /* synthetic */ AppModel f4088g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f4089h;

    /* renamed from: i */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f4090i;

    public /* synthetic */ C1563f8(AppViewPresenter appViewPresenter, AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.f4087f = appViewPresenter;
        this.f4088g = appModel;
        this.f4089h = action;
        this.f4090i = offerResponseStatus;
    }

    public final void call() {
        this.f4087f.mo7395b(this.f4088g, this.f4089h, this.f4090i);
    }
}
