package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.home.apps.l */
/* compiled from: lambda */
public final /* synthetic */ class C2783l implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppsManager f5622f;

    /* renamed from: g */
    private final /* synthetic */ RoomDownload f5623g;

    /* renamed from: h */
    private final /* synthetic */ String f5624h;

    public /* synthetic */ C2783l(AppsManager appsManager, RoomDownload roomDownload, String str) {
        this.f5622f = appsManager;
        this.f5623g = roomDownload;
        this.f5624h = str;
    }

    public final void call(Object obj) {
        this.f5622f.mo11889a(this.f5623g, this.f5624h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
