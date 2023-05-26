package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.oa */
/* compiled from: lambda */
public final /* synthetic */ class C1727oa implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4294f;

    /* renamed from: g */
    private final /* synthetic */ AppModel f4295g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f4296h;

    public /* synthetic */ C1727oa(AppViewPresenter appViewPresenter, AppModel appModel, DownloadModel.Action action) {
        this.f4294f = appViewPresenter;
        this.f4295g = appModel;
        this.f4296h = action;
    }

    public final Object call(Object obj) {
        return this.f4294f.mo7419d(this.f4295g, this.f4296h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
