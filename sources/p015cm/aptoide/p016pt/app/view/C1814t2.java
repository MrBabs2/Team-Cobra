package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppViewModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.t2 */
/* compiled from: lambda */
public final /* synthetic */ class C1814t2 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewModel f4401f;

    public /* synthetic */ C1814t2(AppViewModel appViewModel) {
        this.f4401f = appViewModel;
    }

    public final Object call(Object obj) {
        AppViewModel appViewModel = this.f4401f;
        AppViewPresenter.m4706a(appViewModel, (WalletAdsOfferManager.OfferResponseStatus) obj);
        return appViewModel;
    }
}
