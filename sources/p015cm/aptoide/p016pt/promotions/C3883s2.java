package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.promotions.s2 */
/* compiled from: lambda */
public final /* synthetic */ class C3883s2 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RoomDownload f6959f;

    public /* synthetic */ C3883s2(RoomDownload roomDownload) {
        this.f6959f = roomDownload;
    }

    public final Object call(Object obj) {
        RoomDownload roomDownload = this.f6959f;
        PromotionsManager.m6885b(roomDownload, (WalletAdsOfferManager.OfferResponseStatus) obj);
        return roomDownload;
    }
}
