package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.PromotionViewModel;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.d1 */
/* compiled from: lambda */
public final /* synthetic */ class C1498d1 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ PromotionViewModel f4009f;

    public /* synthetic */ C1498d1(PromotionViewModel promotionViewModel) {
        this.f4009f = promotionViewModel;
    }

    public final Object call(Object obj) {
        PromotionViewModel promotionViewModel = this.f4009f;
        AppViewPresenter.m4712a(promotionViewModel, (WalletAdsOfferManager.OfferResponseStatus) obj);
        return promotionViewModel;
    }
}
