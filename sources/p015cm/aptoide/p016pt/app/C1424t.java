package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.t */
/* compiled from: lambda */
public final /* synthetic */ class C1424t implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RoomDownload f3929f;

    public /* synthetic */ C1424t(RoomDownload roomDownload) {
        this.f3929f = roomDownload;
    }

    public final Object call(Object obj) {
        RoomDownload roomDownload = this.f3929f;
        AppViewManager.m4558b(roomDownload, (WalletAdsOfferManager.OfferResponseStatus) obj);
        return roomDownload;
    }
}
