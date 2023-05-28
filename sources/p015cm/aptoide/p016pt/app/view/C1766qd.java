package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.qd */
/* compiled from: lambda */
public final /* synthetic */ class C1766qd implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4341f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f4342g;

    /* renamed from: h */
    private final /* synthetic */ AppModel f4343h;

    public /* synthetic */ C1766qd(AppViewPresenter appViewPresenter, DownloadModel.Action action, AppModel appModel) {
        this.f4341f = appViewPresenter;
        this.f4342g = action;
        this.f4343h = appModel;
    }

    public final Object call(Object obj) {
        return this.f4341f.mo7407c(this.f4342g, this.f4343h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
