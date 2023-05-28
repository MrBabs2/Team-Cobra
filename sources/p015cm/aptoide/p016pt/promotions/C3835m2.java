package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.promotions.m2 */
/* compiled from: lambda */
public final /* synthetic */ class C3835m2 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ PromotionsManager f6903f;

    /* renamed from: g */
    private final /* synthetic */ RoomDownload f6904g;

    /* renamed from: h */
    private final /* synthetic */ PromotionViewApp f6905h;

    public /* synthetic */ C3835m2(PromotionsManager promotionsManager, RoomDownload roomDownload, PromotionViewApp promotionViewApp) {
        this.f6903f = promotionsManager;
        this.f6904g = roomDownload;
        this.f6905h = promotionViewApp;
    }

    public final void call(Object obj) {
        this.f6903f.mo13737a(this.f6904g, this.f6905h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
