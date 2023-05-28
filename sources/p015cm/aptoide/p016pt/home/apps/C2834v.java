package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.home.apps.v */
/* compiled from: lambda */
public final /* synthetic */ class C2834v implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppsManager f5683f;

    /* renamed from: g */
    private final /* synthetic */ RoomUpdate f5684g;

    /* renamed from: h */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f5685h;

    public /* synthetic */ C2834v(AppsManager appsManager, RoomUpdate roomUpdate, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.f5683f = appsManager;
        this.f5684g = roomUpdate;
        this.f5685h = offerResponseStatus;
    }

    public final void call(Object obj) {
        this.f5683f.mo11890a(this.f5684g, this.f5685h, (RoomDownload) obj);
    }
}
