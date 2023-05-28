package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppModel;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.view.p6 */
/* compiled from: lambda */
public final /* synthetic */ class C1741p6 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4311f;

    /* renamed from: g */
    private final /* synthetic */ AppModel f4312g;

    public /* synthetic */ C1741p6(AppViewPresenter appViewPresenter, AppModel appModel) {
        this.f4311f = appViewPresenter;
        this.f4312g = appModel;
    }

    public final void call(Object obj) {
        this.f4311f.mo7363a(this.f4312g, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
