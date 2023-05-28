package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.downloadmanager.w */
/* compiled from: lambda */
public final /* synthetic */ class C2370w implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RoomDownload f5099f;

    public /* synthetic */ C2370w(RoomDownload roomDownload) {
        this.f5099f = roomDownload;
    }

    public final Object call(Object obj) {
        RoomDownload roomDownload = this.f5099f;
        AptoideDownloadManager.m5431b(roomDownload, (AppDownloader) obj);
        return roomDownload;
    }
}
