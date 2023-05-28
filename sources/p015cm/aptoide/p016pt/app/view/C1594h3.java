package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.h3 */
/* compiled from: lambda */
public final /* synthetic */ class C1594h3 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4131f;

    /* renamed from: g */
    private final /* synthetic */ AppModel f4132g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f4133h;

    /* renamed from: i */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f4134i;

    /* renamed from: j */
    private final /* synthetic */ boolean f4135j;

    public /* synthetic */ C1594h3(AppViewPresenter appViewPresenter, AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        this.f4131f = appViewPresenter;
        this.f4132g = appModel;
        this.f4133h = action;
        this.f4134i = offerResponseStatus;
        this.f4135j = z;
    }

    public final Object call(Object obj) {
        return this.f4131f.mo7347a(this.f4132g, this.f4133h, this.f4134i, this.f4135j, (DownloadModel.Action) obj);
    }
}
