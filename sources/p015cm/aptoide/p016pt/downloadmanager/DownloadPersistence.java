package p015cm.aptoide.p016pt.downloadmanager;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.downloadmanager.DownloadPersistence */
public interface DownloadPersistence {
    C5328b delete(String str);

    C5328b delete(String str, int i);

    C5368e<List<RoomDownload>> getAll();

    C5368e<List<RoomDownload>> getAsList(String str);

    C5368e<RoomDownload> getAsObservable(String str);

    Single<RoomDownload> getAsSingle(String str);

    C5368e<List<RoomDownload>> getInQueueSortedDownloads();

    C5368e<List<RoomDownload>> getOutOfSpaceDownloads();

    C5368e<List<RoomDownload>> getRunningDownloads();

    C5368e<List<RoomDownload>> getUnmovedFilesDownloads();

    C5328b save(RoomDownload roomDownload);
}
