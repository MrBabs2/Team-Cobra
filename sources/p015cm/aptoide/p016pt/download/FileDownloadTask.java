package p015cm.aptoide.p016pt.download;

import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloadCallback;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloadProgressResult;
import p015cm.aptoide.p016pt.logger.Logger;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.C10772g;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.download.FileDownloadTask */
public class FileDownloadTask extends C10772g {
    private static final int FILE_NOT_FOUND_HTTP_ERROR = 404;
    private final String TAG = "FileDownloader";
    private final String attributionId;
    private final C12871b<FileDownloadCallback> downloadStatus;
    private final String fileName;
    private final String md5;
    private final Md5Comparator md5Comparator;
    private final boolean shouldConfirmMd5;

    public FileDownloadTask(C12871b<FileDownloadCallback> bVar, String str, Md5Comparator md5Comparator2, String str2, String str3, boolean z) {
        this.downloadStatus = bVar;
        this.md5 = str;
        this.md5Comparator = md5Comparator2;
        this.fileName = str2;
        this.attributionId = str3;
        this.shouldConfirmMd5 = z;
    }

    private boolean isMd5Approved(String str, String str2, boolean z) {
        if (z) {
            return this.md5Comparator.compareMd5(str, str2);
        }
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void mo10619a(C10722a aVar) {
        FileDownloadTaskStatus fileDownloadTaskStatus;
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.VERIFYING_FILE_INTEGRITY, new FileDownloadProgressResult(aVar.mo36414q(), aVar.mo36414q()), this.md5));
        if (this.attributionId != null || isMd5Approved(this.md5, this.fileName, this.shouldConfirmMd5)) {
            FileDownloadTaskStatus fileDownloadTaskStatus2 = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.COMPLETED, new FileDownloadProgressResult(aVar.mo36414q(), aVar.mo36414q()), this.md5);
            Logger.getInstance().mo12975d("FileDownloader", " Download completed");
            fileDownloadTaskStatus = fileDownloadTaskStatus2;
        } else {
            Logger.getInstance().mo12975d("FileDownloader", " Download error in md5");
            fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR_MD5_DOES_NOT_MATCH, this.md5, (Throwable) new Md5DownloadComparisonException("md5 does not match"));
        }
        this.downloadStatus.onNext(fileDownloadTaskStatus);
    }

    /* access modifiers changed from: protected */
    public void completed(C10722a aVar) {
        new Thread(new C2282i(this, aVar)).start();
    }

    /* access modifiers changed from: protected */
    public void error(C10722a aVar, Throwable th) {
        FileDownloadTaskStatus fileDownloadTaskStatus;
        if (th != null) {
            th.printStackTrace();
            if ((th instanceof FileDownloadHttpException) && ((FileDownloadHttpException) th).mo32693a() == FILE_NOT_FOUND_HTTP_ERROR) {
                Logger instance = Logger.getInstance();
                instance.mo12975d("FileDownloader", "File not found error on app: " + this.md5);
                fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND, this.md5, th);
            } else if (th instanceof FileDownloadOutOfSpaceException) {
                Logger instance2 = Logger.getInstance();
                instance2.mo12975d("FileDownloader", "Out of space error for the app: " + this.md5);
                fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR_NOT_ENOUGH_SPACE, this.md5, th);
            } else {
                Logger instance3 = Logger.getInstance();
                instance3.mo12975d("FileDownloader", "Generic error on app: " + this.md5);
                fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR, this.md5, th);
            }
        } else {
            Logger instance4 = Logger.getInstance();
            instance4.mo12975d("FileDownloader", "Unknown error on app: " + this.md5);
            fileDownloadTaskStatus = new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.ERROR, this.md5, (Throwable) new GeneralDownloadErrorException("Empty download error"));
        }
        this.downloadStatus.onNext(fileDownloadTaskStatus);
    }

    public C5368e<FileDownloadCallback> onDownloadStateChanged() {
        return this.downloadStatus;
    }

    /* access modifiers changed from: protected */
    public void paused(C10722a aVar, long j, long j2) {
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.PAUSED, new FileDownloadProgressResult(j, j2), this.md5));
    }

    /* access modifiers changed from: protected */
    public void pending(C10722a aVar, long j, long j2) {
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.PENDING, new FileDownloadProgressResult(j, j2), this.md5));
    }

    /* access modifiers changed from: protected */
    public void progress(C10722a aVar, long j, long j2) {
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.PROGRESS, new FileDownloadProgressResult(j, j2), this.md5));
    }

    /* access modifiers changed from: protected */
    public void warn(C10722a aVar) {
        this.downloadStatus.onNext(new FileDownloadTaskStatus(AppDownloadStatus.AppDownloadState.WARN, this.md5, (Throwable) null));
    }
}
