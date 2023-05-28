package p015cm.aptoide.p016pt.database.room;

import java.util.List;
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.DownloadDAO */
public interface DownloadDAO {
    C11482n<List<RoomDownload>> getAll();

    C11482n<List<RoomDownload>> getAsList(String str);

    C11482n<RoomDownload> getAsObservable(String str);

    C11496w<RoomDownload> getAsSingle(String str);

    C11482n<List<RoomDownload>> getInQueueSortedDownloads();

    C11482n<List<RoomDownload>> getOutOfSpaceDownloads();

    C11482n<List<RoomDownload>> getRunningDownloads();

    C11482n<List<RoomDownload>> getUnmovedFilesDownloads();

    void insert(RoomDownload roomDownload);

    void insertAll(List<RoomDownload> list);

    void remove(String str);

    void remove(String str, int i);
}
