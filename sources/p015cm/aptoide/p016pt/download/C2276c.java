package p015cm.aptoide.p016pt.download;

import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.download.c */
/* compiled from: lambda */
public final /* synthetic */ class C2276c implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ DownloadInstallationProvider f4984f;

    /* renamed from: g */
    private final /* synthetic */ RoomDownload f4985g;

    public /* synthetic */ C2276c(DownloadInstallationProvider downloadInstallationProvider, RoomDownload roomDownload) {
        this.f4984f = downloadInstallationProvider;
        this.f4985g = roomDownload;
    }

    public final Object call(Object obj) {
        return this.f4984f.mo10605a(this.f4985g, (RoomInstalled) obj);
    }
}
