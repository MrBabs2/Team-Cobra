package p015cm.aptoide.p016pt.install;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.downloadmanager.DownloadNotFoundException;
import p015cm.aptoide.p016pt.downloadmanager.DownloadsRepository;
import p015cm.aptoide.p016pt.file.FileManager;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.installer.InstallCandidate;
import p015cm.aptoide.p016pt.install.installer.InstallationState;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.preferences.managed.ManagedKeys;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferences;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;
import p123rx.p127s.C12871b;
import p123rx.p128t.C5383b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.install.InstallManager */
public class InstallManager {
    private static final String TAG = "InstallManager";
    private final AptoideDownloadManager aptoideDownloadManager;
    private final AptoideInstallManager aptoideInstallManager;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final Context context;
    private final C5383b dispatchInstallationsSubscription = new C5383b();
    private final DownloadsRepository downloadRepository;
    private final FileManager fileManager;
    private final ForegroundManager foregroundManager;
    private final InstallAppSizeValidator installAppSizeValidator;
    private final C12871b<InstallCandidate> installCandidateSubject = C12871b.m41468p();
    private final Installer installer;
    private final PackageInstallerManager packageInstallerManager;
    private final RootAvailabilityManager rootAvailabilityManager;
    private final SharedPreferences securePreferences;
    private final SharedPreferences sharedPreferences;

    public InstallManager(Context context2, AptoideDownloadManager aptoideDownloadManager2, Installer installer2, RootAvailabilityManager rootAvailabilityManager2, SharedPreferences sharedPreferences2, SharedPreferences sharedPreferences3, DownloadsRepository downloadsRepository, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2, PackageInstallerManager packageInstallerManager2, ForegroundManager foregroundManager2, AptoideInstallManager aptoideInstallManager2, InstallAppSizeValidator installAppSizeValidator2, FileManager fileManager2) {
        this.aptoideDownloadManager = aptoideDownloadManager2;
        this.installer = installer2;
        this.context = context2;
        this.rootAvailabilityManager = rootAvailabilityManager2;
        this.downloadRepository = downloadsRepository;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
        this.sharedPreferences = sharedPreferences2;
        this.securePreferences = sharedPreferences3;
        this.packageInstallerManager = packageInstallerManager2;
        this.foregroundManager = foregroundManager2;
        this.aptoideInstallManager = aptoideInstallManager2;
        this.installAppSizeValidator = installAppSizeValidator2;
        this.fileManager = fileManager2;
    }

    /* renamed from: a */
    static /* synthetic */ RoomDownload m6377a(RoomDownload roomDownload, Long l) {
        return roomDownload;
    }

    /* renamed from: a */
    static /* synthetic */ String m6381a(String str, RoomDownload roomDownload) {
        return str;
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m6387b(Throwable th) {
        return false;
    }

    /* renamed from: b */
    static /* synthetic */ Iterable m6388b(List list) {
        return list;
    }

    private RoomInstalled convertDownloadToInstalled(RoomDownload roomDownload) {
        RoomInstalled roomInstalled = new RoomInstalled();
        roomInstalled.setPackageAndVersionCode(roomDownload.getPackageName() + roomDownload.getVersionCode());
        roomInstalled.setVersionCode(roomDownload.getVersionCode());
        roomInstalled.setVersionName(roomDownload.getVersionName());
        roomInstalled.setAppSize(Long.valueOf(roomDownload.getSize()));
        roomInstalled.setStatus(2);
        roomInstalled.setType(-1);
        roomInstalled.setPackageName(roomDownload.getPackageName());
        return roomInstalled;
    }

    /* access modifiers changed from: private */
    /* renamed from: createDownloadAndRetry */
    public C5368e<Throwable> mo12744a(C5368e<? extends Throwable> eVar, RoomDownload roomDownload) {
        return eVar.mo18687f((C5379n<? super Object, ? extends C5368e<? extends R>>) new C3349l0(this, roomDownload));
    }

    /* access modifiers changed from: private */
    /* renamed from: createInstall */
    public Install mo12736a(RoomDownload roomDownload, InstallationState installationState, String str, String str2, int i, Install.InstallationType installationType) {
        return new Install(mapInstallation(roomDownload), mapInstallationStatus(roomDownload, installationState), installationType, mapIndeterminateState(roomDownload, installationState), getSpeed(roomDownload), str, str2, i, getVersionName(roomDownload, installationState), getAppName(roomDownload, installationState), getAppIcon(roomDownload, installationState), getDownloadSize(roomDownload, installationState));
    }

    /* access modifiers changed from: private */
    public synchronized List<Install> createInstallList(List<RoomDownload> list, List<RoomInstalled> list2, List<RoomInstalled> list3) {
        ArrayList arrayList;
        InstallationState installationState;
        Install.InstallationType installationType;
        Install.InstallationType installationType2;
        InstallationState installationState2;
        synchronized (this) {
            arrayList = new ArrayList();
            for (RoomDownload next : list) {
                boolean isAppInstalling = isAppInstalling(list3, next.getPackageName(), next.getVersionCode());
                int i = 1;
                if (isAppInstalling) {
                    i = 3;
                }
                InstallationState installationState3 = new InstallationState(next.getPackageName(), next.getVersionCode(), i, -1, next.getSize());
                Install.InstallationType installationType3 = Install.InstallationType.INSTALL;
                Iterator<RoomInstalled> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        installationState = installationState3;
                        installationType = installationType3;
                        break;
                    }
                    RoomInstalled next2 = it.next();
                    if (next.getPackageName().equals(next2.getPackageName())) {
                        if (next.getVersionCode() == next2.getVersionCode()) {
                            if (!isAppInstalling) {
                                i = next2.getStatus();
                            }
                            installationState2 = new InstallationState(next2.getPackageName(), next2.getVersionCode(), next2.getVersionName(), i, next2.getType(), next2.getName(), next2.getIcon(), next.getSize());
                            installationType2 = Install.InstallationType.INSTALLED;
                        } else {
                            installationState2 = new InstallationState(next2.getPackageName(), next2.getVersionCode(), i, -1, next.getSize());
                            if (next2.getVersionCode() > next.getVersionCode()) {
                                installationType2 = Install.InstallationType.DOWNGRADE;
                            } else {
                                installationType2 = Install.InstallationType.UPDATE;
                            }
                        }
                        installationType = installationType2;
                        installationState = installationState2;
                    }
                }
                arrayList.add(mo12736a(next, installationState, next.getMd5(), next.getPackageName(), next.getVersionCode(), installationType));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: defaultInstall */
    public C5328b mo12757e(RoomDownload roomDownload) {
        return install(roomDownload, true, false, true);
    }

    private void dispatchInstallationCandidates() {
        this.dispatchInstallationsSubscription.mo18721a(this.installCandidateSubject.mo18687f(new C3365p0(this)).mo18649a((C5378b<? super Throwable>) C3267d3.f6195f).mo18686f().mo18655a(C3405w1.f6371f, (C5378b<Throwable>) C3267d3.f6195f));
    }

    /* renamed from: g */
    static /* synthetic */ Iterable m6396g(List list) {
        return list;
    }

    private String getAppIcon(RoomDownload roomDownload, InstallationState installationState) {
        if (roomDownload != null) {
            return roomDownload.getIcon();
        }
        return installationState.getIcon();
    }

    private String getAppName(RoomDownload roomDownload, InstallationState installationState) {
        if (roomDownload != null) {
            return roomDownload.getAppName();
        }
        return installationState.getName();
    }

    private long getDownloadSize(RoomDownload roomDownload, InstallationState installationState) {
        if (roomDownload != null) {
            return roomDownload.getSize();
        }
        return installationState.getAppSize();
    }

    private C5368e<Install.InstallationType> getInstallationType(String str, int i) {
        return this.aptoideInstalledAppsRepository.getInstalled(str).mo18694j(new C3250a1(i)).mo18664b(C3370q1.f6340f);
    }

    private int getSpeed(RoomDownload roomDownload) {
        if (roomDownload != null) {
            return roomDownload.getDownloadSpeed();
        }
        return 0;
    }

    private String getVersionName(RoomDownload roomDownload, InstallationState installationState) {
        if (roomDownload != null) {
            return roomDownload.getVersionName();
        }
        return installationState.getVersionName();
    }

    /* renamed from: h */
    static /* synthetic */ Iterable m6397h(List list) {
        return list;
    }

    /* renamed from: i */
    static /* synthetic */ Boolean m6398i(RoomDownload roomDownload) {
        return Boolean.valueOf(roomDownload != null);
    }

    private C5328b initInstallationProgress(RoomDownload roomDownload) {
        return this.aptoideInstalledAppsRepository.save(convertDownloadToInstalled(roomDownload));
    }

    private boolean isAppInstalling(List<RoomInstalled> list, String str, int i) {
        for (RoomInstalled next : list) {
            if (str.equals(next.getPackageName()) && i == next.getVersionCode()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    static /* synthetic */ Boolean m6400j(RoomDownload roomDownload) {
        boolean z = true;
        if (roomDownload.getOverallDownloadStatus() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: j */
    static /* synthetic */ Iterable m6401j(List list) {
        return list;
    }

    /* renamed from: k */
    static /* synthetic */ C5368e m6402k(List list) {
        if (list.isEmpty()) {
            return C5368e.m10257c(Boolean.FALSE);
        }
        return C5368e.m10257c(Boolean.TRUE);
    }

    /* renamed from: k */
    static /* synthetic */ void m6403k(RoomDownload roomDownload) {
    }

    /* renamed from: m */
    static /* synthetic */ Boolean m6405m(RoomDownload roomDownload) {
        return Boolean.valueOf(roomDownload != null);
    }

    private boolean mapIndeterminate(RoomDownload roomDownload) {
        if (roomDownload == null) {
            return false;
        }
        switch (roomDownload.getOverallDownloadStatus()) {
            case 13:
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }

    private boolean mapIndeterminateState(RoomDownload roomDownload, InstallationState installationState) {
        return mapIndeterminate(roomDownload) || mapInstallIndeterminate(installationState.getStatus(), installationState.getType(), roomDownload);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r4 != 0) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r5.getOverallDownloadStatus() == 1) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean mapInstallIndeterminate(int r3, int r4, p015cm.aptoide.p016pt.database.room.RoomDownload r5) {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            switch(r3) {
                case 1: goto L_0x0013;
                case 2: goto L_0x000a;
                case 3: goto L_0x0006;
                case 4: goto L_0x0013;
                case 5: goto L_0x0006;
                case 6: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0013
        L_0x0006:
            if (r4 == 0) goto L_0x0013
        L_0x0008:
            r1 = 1
            goto L_0x0013
        L_0x000a:
            if (r5 == 0) goto L_0x0013
            int r3 = r5.getOverallDownloadStatus()
            if (r3 != r0) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r5 == 0) goto L_0x001c
            int r3 = r5.getOverallDownloadStatus()
            if (r3 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.install.InstallManager.mapInstallIndeterminate(int, int, cm.aptoide.pt.database.room.RoomDownload):boolean");
    }

    private int mapInstallation(RoomDownload roomDownload) {
        if (roomDownload != null) {
            int overallProgress = roomDownload.getOverallProgress();
            Logger instance = Logger.getInstance();
            instance.mo12975d(TAG, " download is not null " + overallProgress + " state " + roomDownload.getOverallDownloadStatus());
            return overallProgress;
        }
        Logger.getInstance().mo12975d(TAG, " download is null");
        return 0;
    }

    private Install.InstallationStatus mapInstallationStatus(RoomDownload roomDownload, InstallationState installationState) {
        if (installationState.getStatus() == 4) {
            return Install.InstallationStatus.INSTALLED;
        }
        if (installationState.getStatus() == 3 && installationState.getType() != 0) {
            return Install.InstallationStatus.INSTALLING;
        }
        if (installationState.getStatus() == 6) {
            return Install.InstallationStatus.UNINSTALLED;
        }
        if (installationState.getStatus() == 2 && roomDownload != null && roomDownload.getOverallDownloadStatus() == 1) {
            return Install.InstallationStatus.DOWNLOADING;
        }
        if (installationState.getStatus() == 5) {
            return Install.InstallationStatus.INSTALLATION_TIMEOUT;
        }
        return mo12751b(roomDownload);
    }

    private C5328b sendBackgroundInstallFinishedBroadcast(RoomDownload roomDownload) {
        return C5328b.m10169d(new C3404w0(this, roomDownload));
    }

    private C5368e<String> startBackgroundInstallation(String str, boolean z, boolean z2, boolean z3) {
        return this.aptoideDownloadManager.getDownloadAsSingle(str).mo18558a((C5378b<Throwable>) C3267d3.f6195f).mo18567c().mo18664b(new C3345k0(this, z3, str, z, z2)).mo18689g(new C3408x0(this)).mo18694j(new C3415z(str));
    }

    private C5328b startDownload(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() != 1) {
            return this.aptoideDownloadManager.startDownload(roomDownload);
        }
        Logger.getInstance().mo12975d(TAG, "Saving an already completed download to trigger the download installation");
        return this.downloadRepository.save(roomDownload);
    }

    private C5328b stopForegroundAndInstall(String str, int i, boolean z, boolean z2) {
        Logger instance = Logger.getInstance();
        instance.mo12975d(TAG, "going to pop install from: " + str + "and download action: " + i);
        if (i == 0) {
            return this.installer.install(str, z, z2);
        }
        if (i == 1) {
            return this.installer.update(str, z, z2);
        }
        if (i == 2) {
            return this.installer.downgrade(str, z, z2);
        }
        return C5328b.m10163b((Throwable) new IllegalArgumentException("Invalid download action " + i));
    }

    private C5328b updateDownloadAction(RoomDownload roomDownload, RoomDownload roomDownload2) {
        if (roomDownload2.getAction() == roomDownload.getAction()) {
            return C5328b.m10170f();
        }
        roomDownload2.setAction(roomDownload.getAction());
        return this.downloadRepository.save(roomDownload2);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12747a(InstallCandidate installCandidate) {
        return this.aptoideDownloadManager.getDownloadAsObservable(installCandidate.getMd5()).mo18699l((C5379n) null).mo18681d(C3274f0.f6203f).mo18704p(C3386s1.f6353f).mo18689g(new C3409x1(this, installCandidate));
    }

    /* renamed from: c */
    public /* synthetic */ void mo12753c(RoomDownload roomDownload) {
        this.aptoideInstallManager.addAptoideInstallCandidate(roomDownload.getPackageName());
    }

    public C5328b cancelInstall(String str, String str2, int i) {
        return pauseInstall(str).mo18587a(this.aptoideInstalledAppsRepository.remove(str2, i)).mo18587a(this.aptoideDownloadManager.removeDownload(str)).mo18590a((C5378b<? super Throwable>) C3254b0.f6181f);
    }

    public C5328b cleanTimedOutInstalls() {
        return getTimedOutInstallations().mo18669c().mo18687f(new C3394u1(this)).mo18698l().mo18696k();
    }

    /* renamed from: f */
    public /* synthetic */ void mo12758f(RoomDownload roomDownload) {
        this.context.sendBroadcast(new Intent(DownloadService.ACTION_INSTALL_FINISHED).putExtra(DownloadService.EXTRA_INSTALLATION_MD5, roomDownload.getMd5()));
    }

    public C5368e<List<RoomInstalled>> fetchInstalled() {
        return this.aptoideInstalledAppsRepository.getAllInstalledSorted().mo18669c().mo18691h(C3354m1.f6319f).mo18681d(C3342j1.f6297f).mo18698l();
    }

    public C5368e<List<RoomInstalled>> fetchInstalledExceptSystem() {
        return this.aptoideInstalledAppsRepository.getInstalledAppsFilterSystem();
    }

    public Single<Install> filterInstalled(Install install) {
        return this.aptoideInstalledAppsRepository.isInstalled(install.getPackageName(), install.getVersionCode()).mo18559a(new C3390t1(install));
    }

    /* renamed from: g */
    public /* synthetic */ C5328b mo12762g(RoomDownload roomDownload) {
        return initInstallationProgress(roomDownload).mo18587a(startDownload(roomDownload));
    }

    public C5368e<Install> getCurrentInstallation() {
        return this.aptoideDownloadManager.getCurrentInProgressDownload().mo18681d(C3284h0.f6214f).mo18644a(Schedulers.m10352io()).mo18674c(C3362o1.f6331f).mo18687f(new C3413y1(this));
    }

    public Single<RoomDownload> getDownload(String str) {
        return this.downloadRepository.getDownloadAsSingle(str);
    }

    public C5368e<List<String>> getDownloadOutOfSpaceMd5List() {
        return this.downloadRepository.getOutOfSpaceDownloads().mo18681d(C3288i0.f6219f).mo18687f(C3393u0.f6360f);
    }

    public C5368e<Install.InstallationStatus> getDownloadState(String str) {
        return this.aptoideDownloadManager.getDownloadAsObservable(str).mo18669c().mo18694j(new C3373r0(this));
    }

    public C5368e<Install> getInstall(String str, String str2, int i) {
        return C5368e.m10246a(this.aptoideDownloadManager.getDownloadsByMd5(str), this.installer.getState(str2, i), getInstallationType(str2, i), new C3361o0(this, str, str2, i)).mo18664b(C3279g0.f6208f);
    }

    public C5368e<List<Install>> getInstallations() {
        return C5368e.m10246a(this.aptoideDownloadManager.getDownloadsList(), this.aptoideInstalledAppsRepository.getAllInstalled(), this.aptoideInstalledAppsRepository.getAllInstalling(), new C3397v0(this)).mo18656b();
    }

    public Single<Long> getInstalledAppSize(String str) {
        return this.aptoideInstalledAppsRepository.getInstalled(str).mo18669c().mo18700m().mo18569d(C3398v1.f6365f);
    }

    public C5368e<List<Install>> getTimedOutInstallations() {
        return getInstallations().mo18687f(C3259c0.f6186f);
    }

    public C5368e<String> handleNotEnoughSpaceForDownload(RoomDownload roomDownload, boolean z, boolean z2, boolean z3) {
        return this.fileManager.deleteCache(false).mo18669c().mo18700m().mo18568c(new C3353m0(this, roomDownload, z, z2, z3));
    }

    public Single<Boolean> hasNextDownload() {
        return this.aptoideDownloadManager.getCurrentActiveDownloads().mo18669c().mo18694j(C3289i1.f6220f).mo18700m();
    }

    /* renamed from: install */
    public C5328b mo12771h(RoomDownload roomDownload) {
        return install(roomDownload, this.sharedPreferences.getBoolean(ManagedKeys.ENFORCE_NATIVE_INSTALLER_KEY, false), false, true);
    }

    public C5368e<Boolean> isInstalled(String str) {
        return this.aptoideInstalledAppsRepository.isInstalled(str).mo18669c();
    }

    /* renamed from: mapDownloadState */
    public Install.InstallationStatus mo12751b(RoomDownload roomDownload) {
        Install.InstallationStatus installationStatus;
        Install.InstallationStatus installationStatus2 = Install.InstallationStatus.UNINSTALLED;
        if (roomDownload != null) {
            switch (roomDownload.getOverallDownloadStatus()) {
                case 0:
                    installationStatus = Install.InstallationStatus.INITIAL_STATE;
                    break;
                case 1:
                case 10:
                case 12:
                    installationStatus = Install.InstallationStatus.UNINSTALLED;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 11:
                case 14:
                case 15:
                    installationStatus = Install.InstallationStatus.DOWNLOADING;
                    break;
                case 6:
                    installationStatus = Install.InstallationStatus.PAUSED;
                    break;
                case 9:
                    int downloadError = roomDownload.getDownloadError();
                    if (downloadError == 1) {
                        return Install.InstallationStatus.GENERIC_ERROR;
                    }
                    if (downloadError != 2) {
                        return installationStatus2;
                    }
                    return Install.InstallationStatus.NOT_ENOUGH_SPACE_ERROR;
                case 13:
                    installationStatus = Install.InstallationStatus.IN_QUEUE;
                    break;
                default:
                    return installationStatus2;
            }
            return installationStatus;
        }
        Logger.getInstance().mo12975d(TAG, "mapping a null Download state");
        return installationStatus2;
    }

    public C5328b onAppInstalled(RoomInstalled roomInstalled) {
        return this.aptoideInstalledAppsRepository.getAsList(roomInstalled.getPackageName()).mo18669c().mo18691h(new C3255b1(roomInstalled)).mo18689g(new C3269e0(this, roomInstalled)).mo18696k();
    }

    public C5328b onAppRemoved(String str) {
        return this.aptoideInstalledAppsRepository.getAsList(str).mo18669c().mo18691h(C3416z0.f6385f).mo18689g(new C3411y(this, str)).mo18696k();
    }

    public C5328b onUpdateConfirmed(RoomInstalled roomInstalled) {
        return onAppInstalled(roomInstalled);
    }

    public C5328b pauseInstall(String str) {
        return this.aptoideDownloadManager.pauseDownload(str);
    }

    public C5328b retryTimedOutInstallations() {
        return getTimedOutInstallations().mo18669c().mo18691h(C3374r1.f6345f).mo18692i(new C3285h1(this)).mo18689g(new C3275f1(this)).mo18696k();
    }

    public void rootInstallAllowed(boolean z) {
        SecurePreferences.setRootDialogShowed(true, this.securePreferences);
        ManagerPreferences.setAllowRootInstallation(z, this.sharedPreferences);
    }

    public boolean showWarning() {
        return this.rootAvailabilityManager.isRootAvailable().mo18562a().mo41082a().booleanValue() && !SecurePreferences.isRootDialogShowed(this.securePreferences) && !ManagerPreferences.allowRootInstallation(this.securePreferences);
    }

    public C5328b splitInstall(RoomDownload roomDownload) {
        boolean z = this.sharedPreferences.getBoolean(ManagedKeys.ENFORCE_NATIVE_INSTALLER_KEY, false);
        return install(roomDownload, z, !z, true);
    }

    public void start() {
        this.aptoideDownloadManager.start();
        dispatchInstallationCandidates();
        this.installer.dispatchInstallations();
    }

    public C5368e<Boolean> startInstalls(List<RoomDownload> list) {
        return C5368e.m10234a(list).mo18643a(C5368e.m10232a(0, 1, TimeUnit.SECONDS), C3264d0.f6192f).mo18689g(new C3350l1(this)).mo18698l().mo18694j(C3265d1.f6193f).mo18699l(C3366p1.f6336f);
    }

    public void stop() {
        this.aptoideDownloadManager.stop();
        this.installer.stopDispatching();
    }

    public C5328b uninstallApp(String str) {
        return this.installer.uninstall(str);
    }

    public boolean wasAppEverInstalled(String str) {
        return ((Boolean) this.aptoideInstalledAppsRepository.getInstallationsHistory().mo18669c().mo18691h(C3358n1.f6324f).mo18681d(new C3412y0(str)).mo18698l().mo18687f(C3346k1.f6306f).mo18695j().mo41034a()).booleanValue();
    }

    /* renamed from: i */
    static /* synthetic */ Boolean m6399i(List list) {
        return true;
    }

    /* renamed from: b */
    public /* synthetic */ Single mo12752b(Install install) {
        return getDownload(install.getMd5());
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m6395f(List list) {
        return Boolean.valueOf(list != null && !list.isEmpty());
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo12756d(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() != 9) {
            return C5368e.m10257c(roomDownload);
        }
        roomDownload.setOverallDownloadStatus(0);
        return this.downloadRepository.save(roomDownload).mo18593a(C5368e.m10257c(roomDownload));
    }

    public C5328b install(RoomDownload roomDownload, boolean z) {
        return install(roomDownload, this.sharedPreferences.getBoolean(ManagedKeys.ENFORCE_NATIVE_INSTALLER_KEY, false), false, z);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo12739a(InstallCandidate installCandidate, RoomDownload roomDownload) {
        return stopForegroundAndInstall(roomDownload.getMd5(), roomDownload.getAction(), installCandidate.getForceDefaultInstall(), installCandidate.getShouldSetPackageInstaller()).mo18587a(sendBackgroundInstallFinishedBroadcast(roomDownload));
    }

    private C5328b install(RoomDownload roomDownload, boolean z, boolean z2, boolean z3) {
        return this.aptoideDownloadManager.getDownloadAsSingle(roomDownload.getMd5()).mo18558a((C5378b<Throwable>) C3267d3.f6195f).mo18567c().mo18687f(new C3280g1(this, roomDownload)).mo18701m(new C3260c1(this, roomDownload)).mo18664b(new C3369q0(this)).mo18687f(new C3270e1(this)).mo18687f(new C3385s0(this, z, z2, z3, roomDownload)).mo18696k();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12741a(RoomDownload roomDownload) {
        return getInstall(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12742a(RoomDownload roomDownload, RoomDownload roomDownload2) {
        return updateDownloadAction(roomDownload, roomDownload2).mo18593a(C5368e.m10257c(roomDownload2));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12749a(boolean z, boolean z2, boolean z3, RoomDownload roomDownload, RoomDownload roomDownload2) {
        boolean z4 = false;
        if (!this.installAppSizeValidator.hasEnoughSpaceToInstallApp(roomDownload2)) {
            if (this.packageInstallerManager.shouldSetInstallerPackageName() || z2) {
                z4 = true;
            }
            return handleNotEnoughSpaceForDownload(roomDownload2, z, z4, z3);
        }
        String md5 = roomDownload.getMd5();
        if (this.packageInstallerManager.shouldSetInstallerPackageName() || z2) {
            z4 = true;
        }
        return startBackgroundInstallation(md5, z, z4, z3);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12745a(RoomDownload roomDownload, boolean z, boolean z2, boolean z3, Long l) {
        if (roomDownload.getSize() < this.installAppSizeValidator.getAvailableSpace()) {
            return startBackgroundInstallation(roomDownload.getMd5(), z, z2, z3);
        }
        roomDownload.setOverallDownloadStatus(9);
        roomDownload.setDownloadError(2);
        return this.downloadRepository.save(roomDownload).mo18593a(C5368e.m10257c(roomDownload.getMd5()));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12743a(RoomDownload roomDownload, Throwable th) {
        if (!(th instanceof DownloadNotFoundException)) {
            return C5368e.m10238a(th);
        }
        Logger.getInstance().mo12975d(TAG, "saved the newly created download because the other one was null");
        return this.downloadRepository.save(roomDownload).mo18593a(C5368e.m10257c(th));
    }

    /* renamed from: a */
    public /* synthetic */ void mo12750a(boolean z, String str, boolean z2, boolean z3, RoomDownload roomDownload) {
        if (z) {
            this.installCandidateSubject.onNext(new InstallCandidate(str, z2, z3));
            this.foregroundManager.startDownloadService();
        }
    }

    /* renamed from: a */
    static /* synthetic */ Iterable m6380a(RoomInstalled roomInstalled, List list) {
        if (list.isEmpty()) {
            list.add(roomInstalled);
        }
        return list;
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo12738a(RoomInstalled roomInstalled, RoomInstalled roomInstalled2) {
        if (roomInstalled2.getVersionCode() != roomInstalled.getVersionCode()) {
            return this.aptoideInstalledAppsRepository.remove(roomInstalled2.getPackageName(), roomInstalled2.getVersionCode());
        }
        roomInstalled.setType(roomInstalled2.getType());
        roomInstalled.setStatus(4);
        return this.aptoideInstalledAppsRepository.save(roomInstalled).mo18587a(this.downloadRepository.remove(roomInstalled.getPackageName(), roomInstalled.getVersionCode()));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo12740a(String str, RoomInstalled roomInstalled) {
        return this.aptoideInstalledAppsRepository.remove(str, roomInstalled.getVersionCode());
    }

    /* renamed from: a */
    static /* synthetic */ Install.InstallationType m6378a(int i, RoomInstalled roomInstalled) {
        if (roomInstalled == null) {
            return Install.InstallationType.INSTALL;
        }
        if (roomInstalled.getVersionCode() == i) {
            return Install.InstallationType.INSTALLED;
        }
        if (roomInstalled.getVersionCode() > i) {
            return Install.InstallationType.DOWNGRADE;
        }
        return Install.InstallationType.UPDATE;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12748a(List list) {
        return C5368e.m10234a(list).mo18687f(new C3341j0(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12746a(Install install) {
        return this.aptoideInstalledAppsRepository.get(install.getPackageName(), install.getVersionCode()).mo18669c().mo18689g(new C3249a0(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo12737a(RoomInstalled roomInstalled) {
        roomInstalled.setStatus(1);
        return this.aptoideInstalledAppsRepository.save(roomInstalled);
    }

    /* renamed from: a */
    static /* synthetic */ Single m6383a(Install install, Boolean bool) {
        if (bool.booleanValue()) {
            return Single.m10119a(null);
        }
        return Single.m10119a(install);
    }
}
