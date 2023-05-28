package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.n */
/* compiled from: lambda */
public final /* synthetic */ class C1412n implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewManager f3903f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f3904g;

    /* renamed from: h */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f3905h;

    /* renamed from: i */
    private final /* synthetic */ boolean f3906i;

    public /* synthetic */ C1412n(AppViewManager appViewManager, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        this.f3903f = appViewManager;
        this.f3904g = action;
        this.f3905h = offerResponseStatus;
        this.f3906i = z;
    }

    public final Object call(Object obj) {
        return this.f3903f.mo6952a(this.f3904g, this.f3905h, this.f3906i, (AppModel) obj);
    }
}
