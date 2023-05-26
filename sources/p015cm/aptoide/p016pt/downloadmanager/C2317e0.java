package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.downloadmanager.e0 */
/* compiled from: lambda */
public final /* synthetic */ class C2317e0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AptoideDownloadManager f5038f;

    /* renamed from: g */
    private final /* synthetic */ String f5039g;

    /* renamed from: h */
    private final /* synthetic */ RoomDownload f5040h;

    public /* synthetic */ C2317e0(AptoideDownloadManager aptoideDownloadManager, String str, RoomDownload roomDownload) {
        this.f5038f = aptoideDownloadManager;
        this.f5039g = str;
        this.f5040h = roomDownload;
    }

    public final Object call(Object obj) {
        return this.f5038f.mo10892a(this.f5039g, this.f5040h, (AppDownloader) obj);
    }
}
