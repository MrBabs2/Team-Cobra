package p015cm.aptoide.p016pt.downloadmanager;

import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.downloadmanager.AppDownloader */
public interface AppDownloader {
    C5368e<AppDownloadStatus> observeDownloadProgress();

    C5328b pauseAppDownload();

    C5328b removeAppDownload();

    void startAppDownload();

    void stop();
}
