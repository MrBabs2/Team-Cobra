package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.apps.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C2759g0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppsManager f5595f;

    /* renamed from: g */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f5596g;

    public /* synthetic */ C2759g0(AppsManager appsManager, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.f5595f = appsManager;
        this.f5596g = offerResponseStatus;
    }

    public final Object call(Object obj) {
        return this.f5595f.mo11883a(this.f5596g, (RoomUpdate) obj);
    }
}
