package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.editorial.r0 */
/* compiled from: lambda */
public final /* synthetic */ class C2528r0 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ EditorialManager f5340f;

    /* renamed from: g */
    private final /* synthetic */ RoomDownload f5341g;

    /* renamed from: h */
    private final /* synthetic */ String f5342h;

    /* renamed from: i */
    private final /* synthetic */ long f5343i;

    /* renamed from: j */
    private final /* synthetic */ String f5344j;

    public /* synthetic */ C2528r0(EditorialManager editorialManager, RoomDownload roomDownload, String str, long j, String str2) {
        this.f5340f = editorialManager;
        this.f5341g = roomDownload;
        this.f5342h = str;
        this.f5343i = j;
        this.f5344j = str2;
    }

    public final void call(Object obj) {
        this.f5340f.mo11124a(this.f5341g, this.f5342h, this.f5343i, this.f5344j, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
