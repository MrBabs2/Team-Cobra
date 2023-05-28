package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.m */
/* compiled from: lambda */
public final /* synthetic */ class C1409m implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppViewManager f3892f;

    /* renamed from: g */
    private final /* synthetic */ AppModel f3893g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f3894h;

    /* renamed from: i */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f3895i;

    /* renamed from: j */
    private final /* synthetic */ boolean f3896j;

    /* renamed from: k */
    private final /* synthetic */ DynamicSplitsModel f3897k;

    public /* synthetic */ C1409m(AppViewManager appViewManager, AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, DynamicSplitsModel dynamicSplitsModel) {
        this.f3892f = appViewManager;
        this.f3893g = appModel;
        this.f3894h = action;
        this.f3895i = offerResponseStatus;
        this.f3896j = z;
        this.f3897k = dynamicSplitsModel;
    }

    public final void call(Object obj) {
        this.f3892f.mo6957a(this.f3893g, this.f3894h, this.f3895i, this.f3896j, this.f3897k, (Throwable) obj);
    }
}
