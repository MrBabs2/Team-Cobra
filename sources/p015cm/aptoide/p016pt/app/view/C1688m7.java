package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.m7 */
/* compiled from: lambda */
public final /* synthetic */ class C1688m7 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4248f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f4249g;

    /* renamed from: h */
    private final /* synthetic */ AppModel f4250h;

    /* renamed from: i */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f4251i;

    /* renamed from: j */
    private final /* synthetic */ boolean f4252j;

    public /* synthetic */ C1688m7(AppViewPresenter appViewPresenter, DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        this.f4248f = appViewPresenter;
        this.f4249g = action;
        this.f4250h = appModel;
        this.f4251i = offerResponseStatus;
        this.f4252j = z;
    }

    public final Object call(Object obj) {
        return this.f4248f.mo7340a(this.f4249g, this.f4250h, this.f4251i, this.f4252j, (Void) obj);
    }
}
