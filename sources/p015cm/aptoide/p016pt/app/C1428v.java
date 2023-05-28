package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.v */
/* compiled from: lambda */
public final /* synthetic */ class C1428v implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewManager f3933f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f3934g;

    /* renamed from: h */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f3935h;

    /* renamed from: i */
    private final /* synthetic */ boolean f3936i;

    /* renamed from: j */
    private final /* synthetic */ AppModel f3937j;

    public /* synthetic */ C1428v(AppViewManager appViewManager, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, AppModel appModel) {
        this.f3933f = appViewManager;
        this.f3934g = action;
        this.f3935h = offerResponseStatus;
        this.f3936i = z;
        this.f3937j = appModel;
    }

    public final Object call(Object obj) {
        return this.f3933f.mo6953a(this.f3934g, this.f3935h, this.f3936i, this.f3937j, (DynamicSplitsModel) obj);
    }
}
