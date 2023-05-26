package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.p8 */
/* compiled from: lambda */
public final /* synthetic */ class C1743p8 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4314f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f4315g;

    /* renamed from: h */
    private final /* synthetic */ AppModel f4316h;

    public /* synthetic */ C1743p8(AppViewPresenter appViewPresenter, DownloadModel.Action action, AppModel appModel) {
        this.f4314f = appViewPresenter;
        this.f4315g = action;
        this.f4316h = appModel;
    }

    public final Object call(Object obj) {
        return this.f4314f.mo7386b(this.f4315g, this.f4316h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
