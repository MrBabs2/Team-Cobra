package p015cm.aptoide.p016pt.downloadmanager;

import java.util.ArrayList;
import java.util.HashMap;
import p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus;
import p015cm.aptoide.p016pt.logger.Logger;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.p126m.C5378b;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.downloadmanager.AppDownloadManager */
public class AppDownloadManager implements AppDownloader {
    private static final String TAG = "AppDownloadManager";
    private final DownloadApp app;
    private AppDownloadStatus appDownloadStatus;
    private DownloadAnalytics downloadAnalytics;
    private C12871b<FileDownloadCallback> fileDownloadSubject = C12871b.m41468p();
    private HashMap<String, RetryFileDownloader> fileDownloaderPersistence;
    private RetryFileDownloaderProvider fileDownloaderProvider;
    private C5375k subscribe;

    /* renamed from: cm.aptoide.pt.downloadmanager.AppDownloadManager$1 */
    static /* synthetic */ class C22981 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState */
        static final /* synthetic */ int[] f4994x5e1d6a72;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState[] r0 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4994x5e1d6a72 = r0
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4994x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4994x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4994x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR_NOT_ENOUGH_SPACE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.downloadmanager.AppDownloadManager.C22981.<clinit>():void");
        }
    }

    public AppDownloadManager(RetryFileDownloaderProvider retryFileDownloaderProvider, DownloadApp downloadApp, HashMap<String, RetryFileDownloader> hashMap, DownloadAnalytics downloadAnalytics2) {
        this.fileDownloaderProvider = retryFileDownloaderProvider;
        this.app = downloadApp;
        this.fileDownloaderPersistence = hashMap;
        this.downloadAnalytics = downloadAnalytics2;
        this.appDownloadStatus = new AppDownloadStatus(downloadApp.getMd5(), new ArrayList(), AppDownloadStatus.AppDownloadState.PENDING, downloadApp.getSize());
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m5413b(RetryFileDownloader retryFileDownloader) {
        return Boolean.valueOf(retryFileDownloader != null);
    }

    /* renamed from: c */
    static /* synthetic */ void m5416c(FileDownloadCallback fileDownloadCallback) {
    }

    private void handleCompletedFileDownload(RetryFileDownloader retryFileDownloader) {
        retryFileDownloader.stop();
    }

    private void handleErrorFileDownload() {
        for (RetryFileDownloader stopFailedDownload : this.fileDownloaderPersistence.values()) {
            stopFailedDownload.stopFailedDownload();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleFileDownloadProgress */
    public C5368e<FileDownloadCallback> mo10867a(RetryFileDownloader retryFileDownloader) {
        return retryFileDownloader.observeFileDownloadProgress().mo18664b(new C2340m(this)).mo18664b(new C2343n(this, retryFileDownloader));
    }

    private C5368e<FileDownloadCallback> observeFileDownload() {
        return this.fileDownloadSubject;
    }

    private void setAppDownloadStatus(FileDownloadCallback fileDownloadCallback) {
        this.appDownloadStatus.setFileDownloadCallback(fileDownloadCallback);
    }

    private C5368e<FileDownloadCallback> startFileDownload(DownloadAppFile downloadAppFile, String str) {
        return C5368e.m10257c(this.fileDownloaderProvider.createRetryFileDownloader(downloadAppFile.getDownloadMd5(), downloadAppFile.getMainDownloadPath(), downloadAppFile.getFileType(), downloadAppFile.getPackageName(), downloadAppFile.getVersionCode(), downloadAppFile.getFileName(), C12871b.m41468p(), downloadAppFile.getAlternativeDownloadPath(), str)).mo18664b(new C2307b(this, downloadAppFile)).mo18664b(new C2310c(downloadAppFile)).mo18664b(C2304a.f5024f).mo18687f(new C2349p(this)).mo18649a((C5378b<? super Throwable>) C2372w1.f5101f);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10866a(DownloadAppFile downloadAppFile) {
        return getFileDownloader(downloadAppFile.getMainDownloadPath());
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo10873c(DownloadAppFile downloadAppFile) {
        return startFileDownload(downloadAppFile, this.app.getAttributionId());
    }

    public C5368e<RetryFileDownloader> getFileDownloader(String str) {
        return C5368e.m10257c(this.fileDownloaderPersistence.get(str));
    }

    public C5368e<AppDownloadStatus> observeDownloadProgress() {
        return observeFileDownload().mo18687f(new C2334k(this)).mo18649a((C5378b<? super Throwable>) C2346o.f5075f).mo18694j(new C2322g(this));
    }

    public C5328b pauseAppDownload() {
        return C5368e.m10234a(this.app.getDownloadFiles()).mo18687f(new C2325h(this)).mo18681d(C2313d.f5034f).mo18689g(C2319f.f5042f).mo18696k();
    }

    public C5328b removeAppDownload() {
        return C5368e.m10234a(this.app.getDownloadFiles()).mo18687f(new C2316e(this)).mo18689g(C2331j.f5057f).mo18696k();
    }

    public void startAppDownload() {
        this.subscribe = C5368e.m10234a(this.app.getDownloadFiles()).mo18687f(new C2328i(this)).mo18655a(C2337l.f5064f, (C5378b<Throwable>) C2372w1.f5101f);
    }

    public void stop() {
        C5375k kVar = this.subscribe;
        if (kVar != null && !kVar.isUnsubscribed()) {
            this.subscribe.unsubscribe();
            this.fileDownloadSubject = null;
            this.fileDownloaderPersistence.clear();
            this.fileDownloaderPersistence = null;
        }
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo10871b(DownloadAppFile downloadAppFile) {
        return getFileDownloader(downloadAppFile.getMainDownloadPath());
    }

    /* renamed from: a */
    public /* synthetic */ AppDownloadStatus mo10865a(AppDownloadStatus appDownloadStatus2) {
        return this.appDownloadStatus;
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo10872b(FileDownloadCallback fileDownloadCallback) {
        setAppDownloadStatus(fileDownloadCallback);
        return C5368e.m10257c(this.appDownloadStatus);
    }

    /* renamed from: a */
    public /* synthetic */ void mo10868a(DownloadAppFile downloadAppFile, RetryFileDownloader retryFileDownloader) {
        this.fileDownloaderPersistence.put(downloadAppFile.getMainDownloadPath(), retryFileDownloader);
    }

    /* renamed from: b */
    static /* synthetic */ void m5414b(DownloadAppFile downloadAppFile, RetryFileDownloader retryFileDownloader) {
        Logger instance = Logger.getInstance();
        instance.mo12975d(TAG, "Starting app file download " + downloadAppFile.getFileName());
    }

    /* renamed from: a */
    public /* synthetic */ void mo10869a(FileDownloadCallback fileDownloadCallback) {
        this.fileDownloadSubject.onNext(fileDownloadCallback);
    }

    /* renamed from: a */
    public /* synthetic */ void mo10870a(RetryFileDownloader retryFileDownloader, FileDownloadCallback fileDownloadCallback) {
        if (fileDownloadCallback.getDownloadState() != null) {
            int i = C22981.f4994x5e1d6a72[fileDownloadCallback.getDownloadState().ordinal()];
            if (i == 1) {
                handleCompletedFileDownload(retryFileDownloader);
            } else if (i == 2 || i == 3 || i == 4) {
                handleErrorFileDownload();
                if (fileDownloadCallback.hasError()) {
                    this.downloadAnalytics.onError(this.app.getPackageName(), this.app.getVersionCode(), this.app.getMd5(), fileDownloadCallback.getError());
                }
            }
        }
    }
}
