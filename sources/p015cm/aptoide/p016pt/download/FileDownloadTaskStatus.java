package p015cm.aptoide.p016pt.download;

import p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloadCallback;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloadProgressResult;

/* renamed from: cm.aptoide.pt.download.FileDownloadTaskStatus */
public class FileDownloadTaskStatus implements FileDownloadCallback {
    private AppDownloadStatus.AppDownloadState appDownloadState;
    private FileDownloadProgressResult downloadProgress;
    private Throwable error;
    private String md5;

    public FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState appDownloadState2, FileDownloadProgressResult fileDownloadProgressResult, String str) {
        this.appDownloadState = appDownloadState2;
        this.downloadProgress = fileDownloadProgressResult;
        this.md5 = str;
        this.error = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FileDownloadTaskStatus.class != obj.getClass()) {
            return false;
        }
        return this.md5.equals(((FileDownloadTaskStatus) obj).getMd5());
    }

    public FileDownloadProgressResult getDownloadProgress() {
        return this.downloadProgress;
    }

    public AppDownloadStatus.AppDownloadState getDownloadState() {
        return this.appDownloadState;
    }

    public Throwable getError() {
        return this.error;
    }

    public String getMd5() {
        return this.md5;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState appDownloadState2, String str, Throwable th) {
        this.appDownloadState = appDownloadState2;
        this.md5 = str;
        this.error = th;
        this.downloadProgress = new FileDownloadProgressResult(0, 0);
    }
}
