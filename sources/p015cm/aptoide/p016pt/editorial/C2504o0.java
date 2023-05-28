package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.editorial.o0 */
/* compiled from: lambda */
public final /* synthetic */ class C2504o0 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ EditorialManager f5306f;

    /* renamed from: g */
    private final /* synthetic */ RoomDownload f5307g;

    /* renamed from: h */
    private final /* synthetic */ EditorialDownloadEvent f5308h;

    public /* synthetic */ C2504o0(EditorialManager editorialManager, RoomDownload roomDownload, EditorialDownloadEvent editorialDownloadEvent) {
        this.f5306f = editorialManager;
        this.f5307g = roomDownload;
        this.f5308h = editorialDownloadEvent;
    }

    public final void call(Object obj) {
        this.f5306f.mo11123a(this.f5307g, this.f5308h, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
