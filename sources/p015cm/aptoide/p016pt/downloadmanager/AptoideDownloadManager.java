package p015cm.aptoide.p016pt.downloadmanager;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.downloadmanager.AptoideDownloadManager */
public class AptoideDownloadManager implements DownloadManager {
    private static final String TAG = "AptoideDownloadManager";
    private HashMap<String, AppDownloader> appDownloaderMap = new HashMap<>();
    private AppDownloaderProvider appDownloaderProvider;
    private final String cachePath;
    private C5375k dispatchDownloadsSubscription;
    private DownloadAnalytics downloadAnalytics;
    private final DownloadAppMapper downloadAppMapper;
    private DownloadStatusMapper downloadStatusMapper;
    private DownloadsRepository downloadsRepository;
    private FileUtils fileUtils;
    private C5375k moveFilesSubscription;
    private PathProvider pathProvider;

    public AptoideDownloadManager(DownloadsRepository downloadsRepository2, DownloadStatusMapper downloadStatusMapper2, String str, DownloadAppMapper downloadAppMapper2, AppDownloaderProvider appDownloaderProvider2, DownloadAnalytics downloadAnalytics2, FileUtils fileUtils2, PathProvider pathProvider2) {
        this.downloadsRepository = downloadsRepository2;
        this.downloadStatusMapper = downloadStatusMapper2;
        this.cachePath = str;
        this.downloadAppMapper = downloadAppMapper2;
        this.appDownloaderProvider = appDownloaderProvider2;
        this.downloadAnalytics = downloadAnalytics2;
        this.fileUtils = fileUtils2;
        this.pathProvider = pathProvider2;
    }

    /* renamed from: b */
    static /* synthetic */ RoomDownload m5431b(RoomDownload roomDownload, AppDownloader appDownloader) {
        return roomDownload;
    }

    private AppDownloader createAppDownloadManager(RoomDownload roomDownload) {
        return this.appDownloaderProvider.getAppDownloader(this.downloadAppMapper.mapDownload(roomDownload));
    }

    private void dispatchDownloads() {
        this.dispatchDownloadsSubscription = this.downloadsRepository.getInProgressDownloadsList().mo18649a((C5378b<? super Throwable>) C2374x0.f5103f).mo18686f().mo18682e(750, TimeUnit.MILLISECONDS).mo18664b(C2329i0.f5054f).mo18681d(C2375x1.f5104f).mo18687f(new C2367v(this)).mo18656b().mo18649a((C5378b<? super Throwable>) C2359s0.f5088f).mo18686f().mo18664b(C2364u.f5093f).mo18681d(C2318e1.f5041f).mo18694j(C2355r.f5084f).mo18687f(new C2305a0(this)).mo18686f().mo18649a((C5378b<? super Throwable>) C2341m0.f5069f).mo18655a(C2347o0.f5076f, (C5378b<Throwable>) C2372w1.f5101f);
    }

    /* renamed from: f */
    static /* synthetic */ RoomDownload m5439f(List list) {
        return (RoomDownload) list.get(0);
    }

    /* renamed from: g */
    static /* synthetic */ Iterable m5440g(List list) {
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: getAppDownloader */
    public C5368e<AppDownloader> mo10917n(RoomDownload roomDownload) {
        return C5368e.m10257c(this.appDownloaderMap.get(roomDownload.getMd5())).mo18694j(new C2379z(this, roomDownload));
    }

    private int getStateIfFileExists(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() == 5) {
            return 5;
        }
        for (RoomFileToDownload next : roomDownload.getFilesToDownload()) {
            if (!FileUtils.fileExists(next.getFilePath())) {
                Logger instance = Logger.getInstance();
                instance.mo12975d(TAG, "File is missing: " + next.getFileName() + " file path: " + next.getFilePath());
                return 10;
            }
        }
        return 1;
    }

    /* renamed from: h */
    static /* synthetic */ RoomDownload m5441h(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (RoomDownload) list.get(0);
    }

    /* access modifiers changed from: private */
    public C5368e<RoomDownload> handleDownloadProgress(AppDownloader appDownloader) {
        return appDownloader.observeDownloadProgress().mo18687f(new C2315d1(this)).mo18664b(new C2358s(this)).mo18681d(C2338l0.f5065f).mo18664b(new C2308b0(this)).mo18664b(new C2311c0(this)).mo18705q(C2376y.f5105f);
    }

    /* renamed from: i */
    static /* synthetic */ Iterable m5442i(List list) {
        return list;
    }

    private boolean isFileMissingFromCompletedDownload(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() == 1 && getStateIfFileExists(roomDownload) == 10) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    static /* synthetic */ Iterable m5444k(List list) {
        return list;
    }

    /* renamed from: m */
    static /* synthetic */ Iterable m5446m(List list) {
        return list;
    }

    private void moveFilesFromCompletedDownloads() {
        this.moveFilesSubscription = this.downloadsRepository.getWaitingToMoveFilesDownloads().mo18681d(C2320f0.f5043f).mo18691h(C2344n0.f5073f).mo18689g(new C2350p0(this)).mo18686f().mo18655a(C2314d0.f5035f, (C5378b<Throwable>) C2372w1.f5101f);
    }

    /* renamed from: q */
    static /* synthetic */ void m5447q(RoomDownload roomDownload) {
    }

    /* renamed from: r */
    static /* synthetic */ Boolean m5448r(RoomDownload roomDownload) {
        return Boolean.valueOf(roomDownload.getOverallDownloadStatus() == 5);
    }

    private void removeAppDownloader(String str) {
        AppDownloader appDownloader = this.appDownloaderMap.get(str);
        Logger instance = Logger.getInstance();
        instance.mo12975d(TAG, "removing download manager from app : " + str);
        if (appDownloader != null) {
            appDownloader.stop();
            Logger instance2 = Logger.getInstance();
            instance2.mo12975d(TAG, "removed download manager from app " + str);
            this.appDownloaderMap.remove(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: removeDownloadFiles */
    public void mo10918o(RoomDownload roomDownload) {
        for (RoomFileToDownload next : roomDownload.getFilesToDownload()) {
            FileUtils.removeFile(next.getFilePath());
            FileUtils.removeFile(this.cachePath + next.getFileName() + ".temp");
        }
    }

    /* renamed from: s */
    static /* synthetic */ Boolean m5449s(RoomDownload roomDownload) {
        boolean z = true;
        if (roomDownload.getOverallDownloadStatus() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: u */
    static /* synthetic */ Boolean m5451u(RoomDownload roomDownload) {
        return Boolean.valueOf(roomDownload.getOverallDownloadStatus() == 14);
    }

    private C5328b updateDownload(RoomDownload roomDownload, AppDownloadStatus appDownloadStatus) {
        roomDownload.setOverallProgress(appDownloadStatus.getOverallProgress());
        roomDownload.setOverallDownloadStatus(this.downloadStatusMapper.mapAppDownloadStatus(appDownloadStatus.getDownloadStatus()));
        roomDownload.setDownloadError(this.downloadStatusMapper.mapDownloadError(appDownloadStatus.getDownloadStatus()));
        for (RoomFileToDownload next : roomDownload.getFilesToDownload()) {
            next.setStatus(this.downloadStatusMapper.mapAppDownloadStatus(appDownloadStatus.getFileDownloadStatus(next.getMd5())));
            next.setProgress(appDownloadStatus.getFileDownloadProgress(next.getMd5()));
        }
        if (appDownloadStatus.getDownloadStatus().equals(AppDownloadStatus.AppDownloadState.ERROR_MD5_DOES_NOT_MATCH)) {
            mo10918o(roomDownload);
        }
        return this.downloadsRepository.save(roomDownload);
    }

    /* renamed from: v */
    static /* synthetic */ Boolean m5452v(RoomDownload roomDownload) {
        return Boolean.valueOf(roomDownload.getOverallDownloadStatus() == 14);
    }

    /* renamed from: w */
    static /* synthetic */ void m5453w(RoomDownload roomDownload) {
    }

    /* renamed from: x */
    static /* synthetic */ void m5454x(RoomDownload roomDownload) {
        roomDownload.setOverallDownloadStatus(13);
        roomDownload.setTimeStamp(System.currentTimeMillis());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo10896b(RoomDownload roomDownload) {
        if (roomDownload == null || isFileMissingFromCompletedDownload(roomDownload)) {
            return C5368e.m10238a((Throwable) new DownloadNotFoundException());
        }
        return C5368e.m10257c(roomDownload);
    }

    /* renamed from: c */
    public /* synthetic */ Single mo10898c(RoomDownload roomDownload) {
        if (roomDownload == null || isFileMissingFromCompletedDownload(roomDownload)) {
            return Single.m10120a((Throwable) new DownloadNotFoundException());
        }
        return Single.m10119a(roomDownload);
    }

    /* renamed from: d */
    public /* synthetic */ Boolean mo10899d(RoomDownload roomDownload) {
        return Boolean.valueOf(roomDownload != null && !isFileMissingFromCompletedDownload(roomDownload));
    }

    /* renamed from: g */
    public /* synthetic */ void mo10902g(RoomDownload roomDownload) {
        removeAppDownloader(roomDownload.getMd5());
    }

    public C5368e<List<RoomDownload>> getCurrentActiveDownloads() {
        return this.downloadsRepository.getCurrentActiveDownloads();
    }

    public C5368e<RoomDownload> getCurrentInProgressDownload() {
        return getDownloadsList().mo18691h(C2351p1.f5080f).mo18681d(C2345n1.f5074f);
    }

    public C5368e<RoomDownload> getDownloadAsObservable(String str) {
        return this.downloadsRepository.getDownloadAsObservable(str).mo18687f(new C2352q(this)).mo18705q(C2362t0.f5091f);
    }

    public Single<RoomDownload> getDownloadAsSingle(String str) {
        return this.downloadsRepository.getDownloadAsSingle(str).mo18559a(new C2335k0(this));
    }

    public C5368e<RoomDownload> getDownloadsByMd5(String str) {
        return this.downloadsRepository.getDownloadListByMd5(str).mo18687f(new C2368v0(this)).mo18694j(C2324g1.f5048f).mo18656b().mo18664b(C2348o1.f5077f);
    }

    public C5368e<List<RoomDownload>> getDownloadsList() {
        return this.downloadsRepository.getAllDownloads();
    }

    /* renamed from: i */
    public /* synthetic */ C5328b mo10910i(RoomDownload roomDownload) {
        return this.downloadsRepository.remove(roomDownload.getMd5());
    }

    public C5328b invalidateDatabase() {
        return getDownloadsList().mo18669c().mo18691h(C2312c1.f5033f).mo18681d(new C2371w0(this)).mo18689g(new C2373x(this)).mo18698l().mo18696k();
    }

    /* renamed from: k */
    public /* synthetic */ C5328b mo10913k(RoomDownload roomDownload) {
        return moveCompletedDownloadFiles(roomDownload).mo18603b((C5379n<? super Throwable, ? extends C5328b>) new C2377y0(this, roomDownload));
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo10915m(RoomDownload roomDownload) {
        roomDownload.setOverallDownloadStatus(6);
        return this.downloadsRepository.save(roomDownload).mo18593a(C5368e.m10257c(roomDownload));
    }

    public C5328b moveCompletedDownloadFiles(RoomDownload roomDownload) {
        return C5328b.m10169d(new C2327h1(this, roomDownload)).mo18587a(this.downloadsRepository.save(roomDownload));
    }

    /* renamed from: p */
    public /* synthetic */ void mo10919p(RoomDownload roomDownload) {
        this.appDownloaderMap.put(roomDownload.getMd5(), createAppDownloadManager(roomDownload));
    }

    public C5328b pauseAllDownloads() {
        return this.downloadsRepository.getDownloadsInProgress().mo18681d(C2356r0.f5085f).mo18691h(C2309b1.f5030f).mo18687f(new C2380z0(this)).mo18696k();
    }

    public C5328b pauseDownload(String str) {
        return this.downloadsRepository.getDownloadAsObservable(str).mo18669c().mo18649a((C5378b<? super Throwable>) C2323g0.f5047f).mo18687f(new C2306a1(this)).mo18687f(new C2333j1(this)).mo18689g(C2365u0.f5094f).mo18696k();
    }

    public C5328b removeDownload(String str) {
        return this.downloadsRepository.getDownloadAsObservable(str).mo18669c().mo18687f(new C2336k1(this, str)).mo18664b(new C2342m1(this)).mo18696k();
    }

    public synchronized void start() {
        dispatchDownloads();
        moveFilesFromCompletedDownloads();
    }

    public C5328b startDownload(RoomDownload roomDownload) {
        return C5328b.m10169d(new C2326h0(roomDownload)).mo18587a(this.downloadsRepository.save(roomDownload)).mo18589a((C5377a) new C2330i1(this, roomDownload));
    }

    public void stop() {
        if (!this.dispatchDownloadsSubscription.isUnsubscribed()) {
            this.dispatchDownloadsSubscription.unsubscribe();
        }
        if (!this.moveFilesSubscription.isUnsubscribed()) {
            this.moveFilesSubscription.unsubscribe();
        }
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10891a(String str, RoomDownload roomDownload) {
        return mo10917n(roomDownload).mo18687f(new C2317e0(this, str, roomDownload));
    }

    /* renamed from: e */
    public /* synthetic */ void mo10900e(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() == 5) {
            this.downloadAnalytics.startProgress(roomDownload);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void mo10901f(RoomDownload roomDownload) {
        this.downloadAnalytics.onDownloadComplete(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode());
    }

    /* renamed from: j */
    public /* synthetic */ void mo10912j(RoomDownload roomDownload) {
        for (RoomFileToDownload next : roomDownload.getFilesToDownload()) {
            String filePathFromFileType = this.pathProvider.getFilePathFromFileType(next);
            if (!FileUtils.fileExists(this.pathProvider.getFilePathFromFileType(next) + next.getFileName())) {
                Logger instance = Logger.getInstance();
                instance.mo12975d(TAG, "trying to move file : " + next.getFileName() + " " + next.getPackageName());
                this.fileUtils.copyFile(next.getPath(), filePathFromFileType, next.getFileName());
                next.setPath(filePathFromFileType);
            } else {
                next.setPath(filePathFromFileType);
                Logger instance2 = Logger.getInstance();
                instance2.mo12975d(TAG, "tried moving file: " + next.getFileName() + " " + next.getPackageName() + " but it was already moved. The path that we were trying to move to was " + next.getFilePath());
            }
        }
        roomDownload.setOverallDownloadStatus(1);
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo10914l(RoomDownload roomDownload) {
        return mo10917n(roomDownload).mo18689g(C2332j0.f5058f).mo18694j(new C2370w(roomDownload));
    }

    /* renamed from: d */
    static /* synthetic */ void m5437d(List list) {
        Logger instance = Logger.getInstance();
        instance.mo12975d(TAG, "Queued downloads " + list.size());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10892a(String str, RoomDownload roomDownload, AppDownloader appDownloader) {
        return appDownloader.removeAppDownload().mo18587a(this.downloadsRepository.remove(str)).mo18593a(C5368e.m10257c(roomDownload));
    }

    /* renamed from: h */
    public /* synthetic */ Boolean mo10909h(RoomDownload roomDownload) {
        return Boolean.valueOf(getStateIfFileExists(roomDownload) == 10);
    }

    /* renamed from: c */
    static /* synthetic */ void m5435c(List list) {
        Logger instance = Logger.getInstance();
        instance.mo12975d(TAG, "Downloads in Progress " + list.size());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo10897b(List list) {
        return C5368e.m10234a(list).mo18681d(new C2353q0(this)).mo18698l();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10893a(List list) {
        return this.downloadsRepository.getInQueueDownloads().mo18669c();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10888a(RoomDownload roomDownload) {
        return mo10917n(roomDownload).mo18649a((C5378b<? super Throwable>) new C2339l1(this, roomDownload)).mo18664b(C2378y1.f5108f).mo18687f(new C2361t(this));
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo10895b(RoomDownload roomDownload, Throwable th) {
        th.printStackTrace();
        roomDownload.setDownloadError(1);
        roomDownload.setOverallDownloadStatus(9);
        return this.downloadsRepository.save(roomDownload);
    }

    /* renamed from: a */
    public /* synthetic */ void mo10894a(RoomDownload roomDownload, Throwable th) {
        mo10918o(roomDownload);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10889a(AppDownloadStatus appDownloadStatus) {
        return this.downloadsRepository.getDownloadAsObservable(appDownloadStatus.getMd5()).mo18669c().mo18687f(new C2321f1(this, appDownloadStatus));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10890a(AppDownloadStatus appDownloadStatus, RoomDownload roomDownload) {
        return updateDownload(roomDownload, appDownloadStatus).mo18593a(C5368e.m10257c(roomDownload));
    }

    /* renamed from: a */
    public /* synthetic */ AppDownloader mo10887a(RoomDownload roomDownload, AppDownloader appDownloader) {
        return appDownloader == null ? createAppDownloadManager(roomDownload) : appDownloader;
    }
}
