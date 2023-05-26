package p015cm.aptoide.p016pt.downloadmanager;

import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.downloadmanager.FileDownloader */
public interface FileDownloader {
    C5368e<FileDownloadCallback> observeFileDownloadProgress();

    C5328b pauseDownload();

    C5328b removeDownloadFile();

    C5328b startFileDownload();

    void stopFailedDownload();
}
