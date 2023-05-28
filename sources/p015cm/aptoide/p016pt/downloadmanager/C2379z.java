package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.downloadmanager.z */
/* compiled from: lambda */
public final /* synthetic */ class C2379z implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AptoideDownloadManager f5109f;

    /* renamed from: g */
    private final /* synthetic */ RoomDownload f5110g;

    public /* synthetic */ C2379z(AptoideDownloadManager aptoideDownloadManager, RoomDownload roomDownload) {
        this.f5109f = aptoideDownloadManager;
        this.f5110g = roomDownload;
    }

    public final Object call(Object obj) {
        return this.f5109f.mo10887a(this.f5110g, (AppDownloader) obj);
    }
}
