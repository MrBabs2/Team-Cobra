package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.ad */
/* compiled from: lambda */
public final /* synthetic */ class C1455ad implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f3957f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f3958g;

    /* renamed from: h */
    private final /* synthetic */ AppModel f3959h;

    public /* synthetic */ C1455ad(AppViewPresenter appViewPresenter, DownloadModel.Action action, AppModel appModel) {
        this.f3957f = appViewPresenter;
        this.f3958g = action;
        this.f3959h = appModel;
    }

    public final Object call(Object obj) {
        return this.f3957f.mo7338a(this.f3958g, this.f3959h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
