package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.apps.o0 */
/* compiled from: lambda */
public final /* synthetic */ class C2800o0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppsManager f5645f;

    /* renamed from: g */
    private final /* synthetic */ RoomUpdate f5646g;

    /* renamed from: h */
    private final /* synthetic */ String f5647h;

    /* renamed from: i */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f5648i;

    public /* synthetic */ C2800o0(AppsManager appsManager, RoomUpdate roomUpdate, String str, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.f5645f = appsManager;
        this.f5646g = roomUpdate;
        this.f5647h = str;
        this.f5648i = offerResponseStatus;
    }

    public final Object call(Object obj) {
        return this.f5645f.mo11877a(this.f5646g, this.f5647h, this.f5648i, (DynamicSplitsModel) obj);
    }
}
