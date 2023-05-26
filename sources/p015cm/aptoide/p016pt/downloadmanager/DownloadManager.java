package p015cm.aptoide.p016pt.downloadmanager;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.downloadmanager.DownloadManager */
public interface DownloadManager {
    C5368e<List<RoomDownload>> getCurrentActiveDownloads();

    C5368e<RoomDownload> getCurrentInProgressDownload();

    C5368e<RoomDownload> getDownloadAsObservable(String str);

    Single<RoomDownload> getDownloadAsSingle(String str);

    C5368e<RoomDownload> getDownloadsByMd5(String str);

    C5368e<List<RoomDownload>> getDownloadsList();

    C5328b invalidateDatabase();

    C5328b pauseAllDownloads();

    C5328b pauseDownload(String str);

    C5328b removeDownload(String str);

    void start();

    C5328b startDownload(RoomDownload roomDownload);

    void stop();
}
