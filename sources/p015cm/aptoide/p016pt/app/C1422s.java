package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.s */
/* compiled from: lambda */
public final /* synthetic */ class C1422s implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppViewManager f3921f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f3922g;

    /* renamed from: h */
    private final /* synthetic */ long f3923h;

    /* renamed from: i */
    private final /* synthetic */ String f3924i;

    /* renamed from: j */
    private final /* synthetic */ String f3925j;

    /* renamed from: k */
    private final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus f3926k;

    /* renamed from: l */
    private final /* synthetic */ boolean f3927l;

    public /* synthetic */ C1422s(AppViewManager appViewManager, DownloadModel.Action action, long j, String str, String str2, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        this.f3921f = appViewManager;
        this.f3922g = action;
        this.f3923h = j;
        this.f3924i = str;
        this.f3925j = str2;
        this.f3926k = offerResponseStatus;
        this.f3927l = z;
    }

    public final void call(Object obj) {
        this.f3921f.mo6958a(this.f3922g, this.f3923h, this.f3924i, this.f3925j, this.f3926k, this.f3927l, (RoomDownload) obj);
    }
}
