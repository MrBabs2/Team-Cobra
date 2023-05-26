package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.view.z7 */
/* compiled from: lambda */
public final /* synthetic */ class C1929z7 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4532f;

    /* renamed from: g */
    private final /* synthetic */ AppModel f4533g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f4534h;

    public /* synthetic */ C1929z7(AppViewPresenter appViewPresenter, AppModel appModel, DownloadModel.Action action) {
        this.f4532f = appViewPresenter;
        this.f4533g = appModel;
        this.f4534h = action;
    }

    public final void call(Object obj) {
        this.f4532f.mo7364a(this.f4533g, this.f4534h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
