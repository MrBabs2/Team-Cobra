package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.k0 */
/* compiled from: lambda */
public final /* synthetic */ class C2472k0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RoomDownload f5268f;

    public /* synthetic */ C2472k0(RoomDownload roomDownload) {
        this.f5268f = roomDownload;
    }

    public final Object call(Object obj) {
        RoomDownload roomDownload = this.f5268f;
        EditorialManager.m5516b(roomDownload, (WalletAdsOfferManager.OfferResponseStatus) obj);
        return roomDownload;
    }
}
