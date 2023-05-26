package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.z */
/* compiled from: lambda */
public final /* synthetic */ class C1945z implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppViewManager f4552f;

    /* renamed from: g */
    private final /* synthetic */ RoomDownload f4553g;

    /* renamed from: h */
    private final /* synthetic */ DownloadModel.Action f4554h;

    /* renamed from: i */
    private final /* synthetic */ long f4555i;

    /* renamed from: j */
    private final /* synthetic */ String f4556j;

    /* renamed from: k */
    private final /* synthetic */ boolean f4557k;

    public /* synthetic */ C1945z(AppViewManager appViewManager, RoomDownload roomDownload, DownloadModel.Action action, long j, String str, boolean z) {
        this.f4552f = appViewManager;
        this.f4553g = roomDownload;
        this.f4554h = action;
        this.f4555i = j;
        this.f4556j = str;
        this.f4557k = z;
    }

    public final void call(Object obj) {
        this.f4552f.mo6961a(this.f4553g, this.f4554h, this.f4555i, this.f4556j, this.f4557k, (WalletAdsOfferManager.OfferResponseStatus) obj);
    }
}
