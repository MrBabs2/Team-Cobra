package p015cm.aptoide.p016pt.downloadmanager;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.downloadmanager.DownloadsRepository */
public class DownloadsRepository {
    private final DownloadPersistence downloadPersistence;

    public DownloadsRepository(DownloadPersistence downloadPersistence2) {
        this.downloadPersistence = downloadPersistence2;
    }

    public C5368e<List<RoomDownload>> getAllDownloads() {
        return this.downloadPersistence.getAll();
    }

    public C5368e<List<RoomDownload>> getCurrentActiveDownloads() {
        return this.downloadPersistence.getRunningDownloads();
    }

    public C5368e<RoomDownload> getDownloadAsObservable(String str) {
        return this.downloadPersistence.getAsObservable(str);
    }

    public Single<RoomDownload> getDownloadAsSingle(String str) {
        return this.downloadPersistence.getAsSingle(str);
    }

    public C5368e<List<RoomDownload>> getDownloadListByMd5(String str) {
        return this.downloadPersistence.getAsList(str);
    }

    public C5368e<List<RoomDownload>> getDownloadsInProgress() {
        return this.downloadPersistence.getRunningDownloads();
    }

    public C5368e<List<RoomDownload>> getInProgressDownloadsList() {
        return this.downloadPersistence.getRunningDownloads().mo18687f(C2354q1.f5083f);
    }

    public C5368e<List<RoomDownload>> getInQueueDownloads() {
        return this.downloadPersistence.getInQueueSortedDownloads();
    }

    public C5368e<List<RoomDownload>> getOutOfSpaceDownloads() {
        return this.downloadPersistence.getOutOfSpaceDownloads();
    }

    public C5368e<List<RoomDownload>> getWaitingToMoveFilesDownloads() {
        return this.downloadPersistence.getUnmovedFilesDownloads();
    }

    public C5328b remove(String str) {
        return this.downloadPersistence.delete(str);
    }

    public C5328b save(RoomDownload roomDownload) {
        return this.downloadPersistence.save(roomDownload);
    }

    public C5328b remove(String str, int i) {
        return this.downloadPersistence.delete(str, i);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m5480a(RoomDownload roomDownload) {
        return Boolean.valueOf(roomDownload.getOverallDownloadStatus() == 5 || roomDownload.getOverallDownloadStatus() == 4);
    }
}
