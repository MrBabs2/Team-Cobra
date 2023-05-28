package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.apps.o */
/* compiled from: lambda */
public final /* synthetic */ class C2799o implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppsManager f5642f;

    /* renamed from: g */
    private final /* synthetic */ RoomUpdate f5643g;

    /* renamed from: h */
    private final /* synthetic */ String f5644h;

    public /* synthetic */ C2799o(AppsManager appsManager, RoomUpdate roomUpdate, String str) {
        this.f5642f = appsManager;
        this.f5643g = roomUpdate;
        this.f5644h = str;
    }

    public final Object call(Object obj) {
        return this.f5642f.mo11876a(this.f5643g, this.f5644h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
