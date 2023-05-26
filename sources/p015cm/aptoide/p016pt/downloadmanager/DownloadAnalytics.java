package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.database.room.RoomDownload;

/* renamed from: cm.aptoide.pt.downloadmanager.DownloadAnalytics */
public interface DownloadAnalytics {
    void onDownloadComplete(String str, String str2, int i);

    void onError(String str, int i, String str2, Throwable th);

    void startProgress(RoomDownload roomDownload);
}
