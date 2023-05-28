package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.d6 */
/* compiled from: lambda */
public final /* synthetic */ class C1503d6 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4014f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f4015g;

    /* renamed from: h */
    private final /* synthetic */ AppModel f4016h;

    /* renamed from: i */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f4017i;

    /* renamed from: j */
    private final /* synthetic */ boolean f4018j;

    public /* synthetic */ C1503d6(AppViewPresenter appViewPresenter, DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        this.f4014f = appViewPresenter;
        this.f4015g = action;
        this.f4016h = appModel;
        this.f4017i = offerResponseStatus;
        this.f4018j = z;
    }

    public final Object call(Object obj) {
        return this.f4014f.mo7339a(this.f4015g, this.f4016h, this.f4017i, this.f4018j, (Boolean) obj);
    }
}
