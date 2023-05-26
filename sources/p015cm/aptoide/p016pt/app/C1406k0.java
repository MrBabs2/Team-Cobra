package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.k0 */
/* compiled from: lambda */
public final /* synthetic */ class C1406k0 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppViewManager f3888f;

    /* renamed from: g */
    private final /* synthetic */ DownloadModel.Action f3889g;

    public /* synthetic */ C1406k0(AppViewManager appViewManager, DownloadModel.Action action) {
        this.f3888f = appViewManager;
        this.f3889g = action;
    }

    public final void call(Object obj) {
        this.f3888f.mo6959a(this.f3889g, (RoomDownload) obj);
    }
}
