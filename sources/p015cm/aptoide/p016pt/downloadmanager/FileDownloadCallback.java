package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus;

/* renamed from: cm.aptoide.pt.downloadmanager.FileDownloadCallback */
public interface FileDownloadCallback {
    FileDownloadProgressResult getDownloadProgress();

    AppDownloadStatus.AppDownloadState getDownloadState();

    Throwable getError();

    String getMd5();

    boolean hasError();
}
