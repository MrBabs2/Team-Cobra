package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.n0 */
/* compiled from: lambda */
public final /* synthetic */ class C2496n0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RoomDownload f5295f;

    public /* synthetic */ C2496n0(RoomDownload roomDownload) {
        this.f5295f = roomDownload;
    }

    public final Object call(Object obj) {
        RoomDownload roomDownload = this.f5295f;
        EditorialManager.m5515a(roomDownload, (WalletAdsOfferManager.OfferResponseStatus) obj);
        return roomDownload;
    }
}
