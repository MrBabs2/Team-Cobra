package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.e0 */
/* compiled from: lambda */
public final /* synthetic */ class C1394e0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewManager f3865f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f3866g;

    /* renamed from: h */
    private final /* synthetic */ long f3867h;

    /* renamed from: i */
    private final /* synthetic */ String f3868i;

    /* renamed from: j */
    private final /* synthetic */ boolean f3869j;

    public /* synthetic */ C1394e0(AppViewManager appViewManager, DownloadModel.Action action, long j, String str, boolean z) {
        this.f3865f = appViewManager;
        this.f3866g = action;
        this.f3867h = j;
        this.f3868i = str;
        this.f3869j = z;
    }

    public final Object call(Object obj) {
        return this.f3865f.mo6947a(this.f3866g, this.f3867h, this.f3868i, this.f3869j, (RoomDownload) obj);
    }
}
