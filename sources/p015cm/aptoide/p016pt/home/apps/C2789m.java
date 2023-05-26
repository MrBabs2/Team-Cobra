package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.apps.m */
/* compiled from: lambda */
public final /* synthetic */ class C2789m implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RoomDownload f5630f;

    public /* synthetic */ C2789m(RoomDownload roomDownload) {
        this.f5630f = roomDownload;
    }

    public final Object call(Object obj) {
        RoomDownload roomDownload = this.f5630f;
        AppsManager.m6100a(roomDownload, (WalletAdsOfferManager.OfferResponseStatus) obj);
        return roomDownload;
    }
}
