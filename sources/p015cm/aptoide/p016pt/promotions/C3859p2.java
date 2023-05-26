package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.promotions.p2 */
/* compiled from: lambda */
public final /* synthetic */ class C3859p2 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ PromotionsManager f6930f;

    /* renamed from: g */
    private final /* synthetic */ RoomDownload f6931g;

    /* renamed from: h */
    private final /* synthetic */ String f6932h;

    /* renamed from: i */
    private final /* synthetic */ long f6933i;

    public /* synthetic */ C3859p2(PromotionsManager promotionsManager, RoomDownload roomDownload, String str, long j) {
        this.f6930f = promotionsManager;
        this.f6931g = roomDownload;
        this.f6932h = str;
        this.f6933i = j;
    }

    public final void call(Object obj) {
        this.f6930f.mo13738a(this.f6931g, this.f6932h, this.f6933i, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
