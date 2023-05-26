package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.downloadmanager.f1 */
/* compiled from: lambda */
public final /* synthetic */ class C2321f1 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AptoideDownloadManager f5044f;

    /* renamed from: g */
    private final /* synthetic */ AppDownloadStatus f5045g;

    public /* synthetic */ C2321f1(AptoideDownloadManager aptoideDownloadManager, AppDownloadStatus appDownloadStatus) {
        this.f5044f = aptoideDownloadManager;
        this.f5045g = appDownloadStatus;
    }

    public final Object call(Object obj) {
        return this.f5044f.mo10890a(this.f5045g, (RoomDownload) obj);
    }
}
