package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.apps.c0 */
/* compiled from: lambda */
public final /* synthetic */ class C2738c0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppsManager f5571f;

    /* renamed from: g */
    private final /* synthetic */ RoomUpdate f5572g;

    /* renamed from: h */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f5573h;

    public /* synthetic */ C2738c0(AppsManager appsManager, RoomUpdate roomUpdate, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.f5571f = appsManager;
        this.f5572g = roomUpdate;
        this.f5573h = offerResponseStatus;
    }

    public final Object call(Object obj) {
        return this.f5571f.mo11884a(this.f5572g, this.f5573h, (DynamicSplitsModel) obj);
    }
}
