package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus;
import p015cm.aptoide.p016pt.logger.Logger;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.downloadmanager.RetryFileDownloadManager */
public class RetryFileDownloadManager implements RetryFileDownloader {
    private static final String TAG = "RetryFileDownloadManage";
    private String alternativeDownloadPath;
    private final String attributionId;
    private FileDownloader fileDownloader;
    private FileDownloaderProvider fileDownloaderProvider;
    private final String fileName;
    private final int fileType;
    private final String mainDownloadPath;
    private String md5;
    private final String packageName;
    private boolean retried;
    private C12871b<FileDownloadCallback> retryFileDownloadSubject = C12871b.m41468p();
    private C5375k startDownloadSubscription;
    private final int versionCode;

    public RetryFileDownloadManager(String str, int i, String str2, int i2, String str3, String str4, FileDownloaderProvider fileDownloaderProvider2, String str5, String str6) {
        this.mainDownloadPath = str;
        this.fileType = i;
        this.packageName = str2;
        this.versionCode = i2;
        this.fileName = str3;
        this.md5 = str4;
        this.fileDownloaderProvider = fileDownloaderProvider2;
        this.alternativeDownloadPath = str5;
        this.attributionId = str6;
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m5482c(FileDownloadCallback fileDownloadCallback) {
        return Boolean.valueOf(fileDownloadCallback.getDownloadState() == AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND);
    }

    private C5368e<FileDownloadCallback> handleFileDownloadProgress(FileDownloader fileDownloader2) {
        return fileDownloader2.observeFileDownloadProgress().mo18705q(C2366u1.f5095f).mo18687f(new C2363t1(this)).mo18664b(new C2369v1(this));
    }

    private FileDownloader setupFileDownloader() {
        FileDownloader createFileDownloader = this.fileDownloaderProvider.createFileDownloader(this.md5, this.mainDownloadPath, this.fileType, this.packageName, this.versionCode, this.fileName, C12871b.m41468p(), this.attributionId);
        this.fileDownloader = createFileDownloader;
        return createFileDownloader;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10963a(FileDownloader fileDownloader2) {
        return fileDownloader2.startFileDownload().mo18593a(handleFileDownloadProgress(fileDownloader2));
    }

    /* renamed from: b */
    public /* synthetic */ void mo10964b(FileDownloadCallback fileDownloadCallback) {
        this.retryFileDownloadSubject.onNext(fileDownloadCallback);
    }

    public C5368e<FileDownloadCallback> observeFileDownloadProgress() {
        return this.retryFileDownloadSubject;
    }

    public C5328b pauseDownload() {
        return this.fileDownloader.pauseDownload();
    }

    public C5328b removeDownloadFile() {
        return this.fileDownloader.removeDownloadFile();
    }

    public void startFileDownload() {
        this.startDownloadSubscription = C5368e.m10257c(setupFileDownloader()).mo18687f(new C2360s1(this)).mo18693i();
    }

    public void stop() {
        C5375k kVar = this.startDownloadSubscription;
        if (kVar != null && !kVar.isUnsubscribed()) {
            this.startDownloadSubscription.unsubscribe();
        }
    }

    public void stopFailedDownload() {
        this.fileDownloader.stopFailedDownload();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10962a(FileDownloadCallback fileDownloadCallback) {
        if (fileDownloadCallback.getDownloadState() != AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND || this.retried) {
            return C5368e.m10257c(fileDownloadCallback);
        }
        Logger.getInstance().mo12975d(TAG, "File not found error, restarting the download with the alternative link");
        FileDownloader createFileDownloader = this.fileDownloaderProvider.createFileDownloader(this.md5, this.alternativeDownloadPath, this.fileType, this.packageName, this.versionCode, this.fileName, C12871b.m41468p(), this.attributionId);
        this.retried = true;
        this.fileDownloader = createFileDownloader;
        return createFileDownloader.startFileDownload().mo18593a(handleFileDownloadProgress(createFileDownloader));
    }
}
