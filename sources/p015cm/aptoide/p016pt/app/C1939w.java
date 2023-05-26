package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.w */
/* compiled from: lambda */
public final /* synthetic */ class C1939w implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RoomDownload f4544f;

    public /* synthetic */ C1939w(RoomDownload roomDownload) {
        this.f4544f = roomDownload;
    }

    public final Object call(Object obj) {
        RoomDownload roomDownload = this.f4544f;
        AppViewManager.m4553a(roomDownload, (WalletAdsOfferManager.OfferResponseStatus) obj);
        return roomDownload;
    }
}
