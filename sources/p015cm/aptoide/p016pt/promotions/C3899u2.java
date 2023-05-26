package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.promotions.u2 */
/* compiled from: lambda */
public final /* synthetic */ class C3899u2 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RoomDownload f6978f;

    public /* synthetic */ C3899u2(RoomDownload roomDownload) {
        this.f6978f = roomDownload;
    }

    public final Object call(Object obj) {
        RoomDownload roomDownload = this.f6978f;
        PromotionsManager.m6882a(roomDownload, (WalletAdsOfferManager.OfferResponseStatus) obj);
        return roomDownload;
    }
}
