package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.g */
/* compiled from: lambda */
public final /* synthetic */ class C1397g implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppViewManager f3872f;

    /* renamed from: g */
    private final /* synthetic */ RoomDownload f3873g;

    /* renamed from: h */
    private final /* synthetic */ WalletApp f3874h;

    public /* synthetic */ C1397g(AppViewManager appViewManager, RoomDownload roomDownload, WalletApp walletApp) {
        this.f3872f = appViewManager;
        this.f3873g = roomDownload;
        this.f3874h = walletApp;
    }

    public final void call(Object obj) {
        this.f3872f.mo6962a(this.f3873g, this.f3874h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
