package p015cm.aptoide.p016pt.install.installer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.downloadmanager.Constants;
import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.Installer;
import p015cm.aptoide.p016pt.install.InstallerAnalytics;
import p015cm.aptoide.p016pt.install.RootCommandTimeoutException;
import p015cm.aptoide.p016pt.install.RootInstallerProvider;
import p015cm.aptoide.p016pt.install.exception.InstallationException;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.packageinstaller.AppInstall;
import p015cm.aptoide.p016pt.packageinstaller.AppInstaller;
import p015cm.aptoide.p016pt.packageinstaller.InstallStatus;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p015cm.aptoide.p016pt.root.RootShell;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.BroadcastRegisterOnSubscribe;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import p123rx.p127s.C12871b;
import p123rx.p128t.C5383b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.install.installer.DefaultInstaller */
public class DefaultInstaller implements Installer {
    public static final String OBB_FOLDER = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/");
    private static final String TAG = DefaultInstaller.class.getSimpleName();
    private final AppInstaller appInstaller;
    private final AppInstallerStatusReceiver appInstallerStatusReceiver;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final Context context;
    private final C5383b dispatchInstallationsSubscription = new C5383b();
    private final FileUtils fileUtils;
    private final C12871b<InstallationCandidate> installCandidateSubject = C12871b.m41468p();
    private final InstallationProvider installationProvider;
    private final InstallerAnalytics installerAnalytics;
    private final int installingStateTimeout;
    private final PackageManager packageManager;
    private final RootAvailabilityManager rootAvailabilityManager;
    private final RootInstallerProvider rootInstallerProvider;
    private final SharedPreferences sharedPreferences;

    /* renamed from: cm.aptoide.pt.install.installer.DefaultInstaller$1 */
    static /* synthetic */ class C32911 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.packageinstaller.InstallStatus$Status[] r0 = p015cm.aptoide.p016pt.packageinstaller.InstallStatus.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status = r0
                cm.aptoide.pt.packageinstaller.InstallStatus$Status r1 = p015cm.aptoide.p016pt.packageinstaller.InstallStatus.Status.INSTALLING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.packageinstaller.InstallStatus$Status r1 = p015cm.aptoide.p016pt.packageinstaller.InstallStatus.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.packageinstaller.InstallStatus$Status r1 = p015cm.aptoide.p016pt.packageinstaller.InstallStatus.Status.WAITING_INSTALL_FEEDBACK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.packageinstaller.InstallStatus$Status r1 = p015cm.aptoide.p016pt.packageinstaller.InstallStatus.Status.FAIL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.packageinstaller.InstallStatus$Status r1 = p015cm.aptoide.p016pt.packageinstaller.InstallStatus.Status.CANCELED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.packageinstaller.InstallStatus$Status r1 = p015cm.aptoide.p016pt.packageinstaller.InstallStatus.Status.UNKNOWN_ERROR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.install.installer.DefaultInstaller.C32911.<clinit>():void");
        }
    }

    public DefaultInstaller(PackageManager packageManager2, InstallationProvider installationProvider2, AppInstaller appInstaller2, FileUtils fileUtils2, boolean z, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2, int i, RootAvailabilityManager rootAvailabilityManager2, SharedPreferences sharedPreferences2, InstallerAnalytics installerAnalytics2, int i2, AppInstallerStatusReceiver appInstallerStatusReceiver2, RootInstallerProvider rootInstallerProvider2, Context context2) {
        this.packageManager = packageManager2;
        this.installationProvider = installationProvider2;
        this.appInstaller = appInstaller2;
        this.fileUtils = fileUtils2;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
        this.installerAnalytics = installerAnalytics2;
        this.appInstallerStatusReceiver = appInstallerStatusReceiver2;
        this.rootInstallerProvider = rootInstallerProvider2;
        RootShell.debugMode = z;
        RootShell.defaultCommandTimeout = i;
        this.rootAvailabilityManager = rootAvailabilityManager2;
        this.sharedPreferences = sharedPreferences2;
        this.installingStateTimeout = i2;
        this.context = context2;
    }

    /* renamed from: a */
    static /* synthetic */ Installation m6460a(Installation installation, RoomInstalled roomInstalled) {
        return installation;
    }

    /* renamed from: a */
    static /* synthetic */ Installation m6461a(Installation installation, Object obj) {
        return installation;
    }

    /* renamed from: a */
    static /* synthetic */ Installation m6462a(Installation installation, Void voidR) {
        return installation;
    }

    /* renamed from: a */
    static /* synthetic */ Void m6467a(Intent intent) {
        return null;
    }

    /* renamed from: b */
    static /* synthetic */ Installation m6470b(Installation installation, Object obj) {
        return installation;
    }

    /* renamed from: b */
    static /* synthetic */ Installation m6471b(Installation installation, Void voidR) {
        return installation;
    }

    /* renamed from: c */
    static /* synthetic */ Installation m6474c(Installation installation, Object obj) {
        return installation;
    }

    /* renamed from: c */
    static /* synthetic */ void m6475c(Installation installation) {
    }

    /* renamed from: d */
    static /* synthetic */ void m6477d(Installation installation) {
    }

    private C5368e<Installation> defaultInstall(Context context2, Installation installation, boolean z) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme(Constants.PACKAGE);
        return C5368e.m10254b(handleInstallationResult(intentFilter, installation, z), (C5368e<Installation>) C5368e.m10240a(new C3309h0(this, installation, z, context2))).mo18662b(Schedulers.computation()).mo18694j(new C3316l(installation));
    }

    private C5368e<Installation> handleInstallationResult(IntentFilter intentFilter, Installation installation, boolean z) {
        return C5368e.m10254b(waitPackageIntent(this.context, intentFilter, installation.getPackageName()).mo18635a((long) this.installingStateTimeout, TimeUnit.MILLISECONDS, C5368e.m10240a(new C3301d0(this, installation, z))), (C5368e<Void>) this.appInstallerStatusReceiver.getInstallerInstallStatus().mo18664b(new C3297b0(this, installation)).mo18681d(new C3332t(installation)).mo18656b().mo18664b(new C3311i0(this, installation, z))).mo18694j(new C3300d(installation));
    }

    private boolean isDeviceMIUI() {
        return AptoideUtils.isDeviceMIUI();
    }

    private boolean isInstalled(String str, int i) {
        try {
            PackageInfo packageInfo = this.packageManager.getPackageInfo(str, 0);
            if (packageInfo == null || packageInfo.versionCode != i) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            CrashReport.getInstance().log(e);
            return false;
        }
    }

    private boolean isSystem(Context context2) {
        try {
            if ((this.packageManager.getApplicationInfo(context2.getPackageName(), 0).flags & 1) == 1) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new AssertionError("Aptoide application not found by package manager.");
        }
    }

    private AppInstall map(Installation installation) {
        AppInstall.InstallBuilder baseApk = AppInstall.builder().setPackageName(installation.getPackageName()).setBaseApk(installation.getFile());
        for (RoomFileToDownload next : installation.getFiles()) {
            if (3 == next.getFileType()) {
                baseApk.addApkSplit(new File(next.getFilePath()));
            }
        }
        return baseApk.build();
    }

    private C5328b moveInstallationFiles(Installation installation) {
        String str = OBB_FOLDER + installation.getPackageName() + "/";
        this.fileUtils.deleteDir(new File(str));
        boolean z = false;
        for (RoomFileToDownload next : installation.getFiles()) {
            if (next.getFileType() == 1 && FileUtils.fileExists(next.getFilePath()) && !next.getPath().equals(str)) {
                this.fileUtils.copyFile(next.getPath(), str, next.getFileName());
                next.setPath(str);
                z = true;
            }
        }
        if (z) {
            return installation.saveFileChanges();
        }
        return C5328b.m10170f();
    }

    /* access modifiers changed from: private */
    public void removeInstallationFiles(Installation installation) {
        for (RoomFileToDownload next : installation.getFiles()) {
            if (next.getFileType() != 1) {
                FileUtils.removeFile(next.getFilePath());
                Logger instance = Logger.getInstance();
                String str = TAG;
                instance.mo12975d(str, "removing the file " + next.getFilePath() + " " + next.getFileName());
            }
        }
    }

    private C5368e<Installation> rootInstall(Installation installation) {
        if (ManagerPreferences.allowRootInstallation(this.sharedPreferences)) {
            return C5368e.m10241a(this.rootInstallerProvider.provideRootInstaller(installation)).mo18662b(Schedulers.computation()).mo18694j(new C3336w(installation)).mo18660b(updateInstallation(installation, 1, 3)).mo18697k(new C3298c(this, installation));
        }
        return C5368e.m10238a((Throwable) new InstallationException("User doesn't allow root installation"));
    }

    private void sendErrorEvent(String str, int i, Exception exc) {
        this.installerAnalytics.logInstallErrorEvent(str, i, exc);
    }

    private C5368e<Installation> startDefaultInstallation(Context context2, Installation installation, boolean z) {
        return defaultInstall(context2, installation, z).mo18687f(C3330s.f6281f);
    }

    private void startInstallIntent(Context context2, File file) {
        Uri uri;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT > 23) {
            uri = FileProvider.m1898a(context2, "cm.aptoide.pt.provider", file);
        } else {
            uri = Uri.fromFile(file);
        }
        Logger.getInstance().mo12985v(TAG, uri.toString());
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.setFlags(268435459);
        context2.startActivity(intent);
    }

    private C5368e<Installation> startInstallation(Context context2, Installation installation, boolean z) {
        return systemInstall(context2, installation).mo18697k(new C3335v(this, installation)).mo18697k(new C3315k0(this, context2, installation, z)).mo18649a((C5378b<? super Throwable>) new C3302e(this, installation)).mo18687f(C3295a0.f6226f);
    }

    private void startUninstallIntent(Context context2, String str, Uri uri) throws InstallationException {
        try {
            this.packageManager.getPackageInfo(str, 0);
            Intent intent = new Intent("android.intent.action.DELETE", uri);
            intent.setFlags(268435456);
            context2.startActivity(intent);
        } catch (PackageManager.NameNotFoundException e) {
            CrashReport.getInstance().log(e);
            throw new InstallationException((Throwable) e);
        }
    }

    private C5368e<Installation> systemInstall(Context context2, Installation installation) {
        if (!isSystem(context2)) {
            return C5368e.m10238a(new Throwable());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return defaultInstall(context2, installation, true);
        }
        return C5368e.m10241a(new SystemInstallOnSubscribe(context2, this.packageManager, Uri.fromFile(installation.getFile()))).mo18662b(Schedulers.computation()).mo18694j(new C3334u(installation)).mo18660b(updateInstallation(installation, 2, 3));
    }

    private Installation updateInstallation(Installation installation, int i, int i2) {
        installation.setType(i);
        installation.setStatus(i2);
        return installation;
    }

    private C5368e<Void> waitPackageIntent(Context context2, IntentFilter intentFilter, String str) {
        return C5368e.m10241a(new BroadcastRegisterOnSubscribe(context2, intentFilter, (String) null, (Handler) null)).mo18684e(new C3310i(str)).mo18694j(C3303e0.f6241f);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12836a(InstallationCandidate installationCandidate) {
        return moveInstallationFiles(installationCandidate.getInstallation()).mo18593a(C5368e.m10257c(installationCandidate));
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo12845b(InstallationCandidate installationCandidate) {
        return C5368e.m10257c(Boolean.valueOf(isInstalled(installationCandidate.getInstallation().getPackageName(), installationCandidate.getInstallation().getVersionCode()))).mo18699l(C3304f.f6242f).mo18669c().mo18687f(new C3314k(this, installationCandidate));
    }

    public synchronized void dispatchInstallations() {
        this.dispatchInstallationsSubscription.mo18721a(this.installCandidateSubject.mo18687f(new C3305f0(this)).mo18687f(new C3328r(this)).mo18649a((C5378b<? super Throwable>) C3308h.f6246f).mo18686f().mo18655a(C3307g0.f6245f, (C5378b<Throwable>) C3331s0.f6282f));
        this.dispatchInstallationsSubscription.mo18721a(this.installCandidateSubject.mo18694j(C3333t0.f6284f).mo18687f(new C3318m(this)).mo18664b(new C3296b(this)).mo18649a((C5378b<? super Throwable>) C3317l0.f6267f).mo18686f().mo18655a(C3306g.f6244f, (C5378b<Throwable>) C3331s0.f6282f));
    }

    public C5328b downgrade(String str, boolean z, boolean z2) {
        return this.installationProvider.getInstallation(str).mo18669c().mo18689g(new C3294a(this)).mo18696k().mo18587a(install(str, z, z2));
    }

    public PackageManager getPackageManager() {
        return this.packageManager;
    }

    public C5368e<InstallationState> getState(String str, int i) {
        return this.aptoideInstalledAppsRepository.getAsList(str, i).mo18694j(new C3320n(str, i)).mo18664b(C3337x.f6289f).mo18656b();
    }

    public C5328b install(String str, boolean z, boolean z2) {
        return this.rootAvailabilityManager.isRootAvailable().mo18564b(new C3322o(this)).mo18568c(new C3312j(this, str)).mo18644a(Schedulers.computation()).mo18664b(new C3339z(this, z, z2)).mo18669c().mo18700m().mo18565b();
    }

    public void stopDispatching() {
        this.dispatchInstallationsSubscription.mo18720a();
        if (!this.dispatchInstallationsSubscription.isUnsubscribed()) {
            this.dispatchInstallationsSubscription.unsubscribe();
        }
    }

    public C5328b uninstall(String str) {
        Uri fromParts = Uri.fromParts(Constants.PACKAGE, str, (String) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme(Constants.PACKAGE);
        return C5368e.m10240a(new C3299c0(this, str, fromParts)).mo18687f(new C3313j0(this, intentFilter, str)).mo18696k();
    }

    public C5328b update(String str, boolean z, boolean z2) {
        return install(str, z, z2);
    }

    /* renamed from: c */
    public /* synthetic */ void mo12846c(Installation installation, Throwable th) {
        String packageName = installation.getPackageName();
        int versionCode = installation.getVersionCode();
        sendErrorEvent(packageName, versionCode, new InstallationException("Installation with root failed for " + installation.getPackageName() + ". Error message: " + th.getMessage()));
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m6466a(Throwable th) {
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12837a(InstallationCandidate installationCandidate, Boolean bool) {
        Installation installation = installationCandidate.getInstallation();
        if (bool.booleanValue()) {
            installation.setStatus(4);
            return installation.save().mo18610e().mo18694j(new C3326q(installation));
        } else if (installationCandidate.getForceDefaultInstall()) {
            return startDefaultInstallation(this.context, installation, false);
        } else {
            return startInstallation(this.context, installation, installationCandidate.getShouldSetPackageInstaller());
        }
    }

    private int map(InstallStatus installStatus) {
        int i = C32911.$SwitchMap$cm$aptoide$pt$packageinstaller$InstallStatus$Status[installStatus.getStatus().ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 1 : 6;
        }
        return 4;
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo12843b(Installation installation) {
        return uninstall(installation.getPackageName());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo12844b(Installation installation, Throwable th) {
        return rootInstall(installation);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12834a(Installation installation) {
        return this.aptoideInstalledAppsRepository.get(installation.getPackageName(), installation.getVersionCode()).mo18681d(C3324p.f6275f).mo18694j(new C3338y(installation));
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m6464a(RoomInstalled roomInstalled) {
        return Boolean.valueOf(roomInstalled.getStatus() == 4);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12841a(Boolean bool) {
        this.installerAnalytics.installationType(ManagerPreferences.allowRootInstallation(this.sharedPreferences), bool.booleanValue());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12838a(String str, Boolean bool) {
        return this.installationProvider.getInstallation(str).mo18669c();
    }

    /* renamed from: a */
    public /* synthetic */ void mo12842a(boolean z, boolean z2, Installation installation) {
        installation.setStatus(3);
        installation.setType(-1);
        this.installCandidateSubject.onNext(new InstallationCandidate(installation, z, z2));
    }

    /* renamed from: a */
    public /* synthetic */ Void mo12831a(String str, Uri uri) throws Exception {
        startUninstallIntent(this.context, str, uri);
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12833a(IntentFilter intentFilter, String str, Void voidR) {
        return waitPackageIntent(this.context, intentFilter, str);
    }

    /* renamed from: a */
    static /* synthetic */ InstallationState m6463a(String str, int i, RoomInstalled roomInstalled) {
        if (roomInstalled != null) {
            return new InstallationState(roomInstalled.getPackageName(), roomInstalled.getVersionCode(), roomInstalled.getVersionName(), roomInstalled.getStatus(), roomInstalled.getType(), roomInstalled.getName(), roomInstalled.getIcon(), roomInstalled.getAppSize().longValue());
        }
        return new InstallationState(str, i, 1, -1);
    }

    /* renamed from: a */
    static /* synthetic */ void m6469a(InstallationState installationState) {
        Logger instance = Logger.getInstance();
        instance.mo12975d("AptoideDownloadManager", "creating an installation state " + installationState.getPackageName() + " state is: " + installationState.getStatus());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12832a(Context context2, Installation installation, boolean z, Throwable th) {
        return defaultInstall(context2, installation, z);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12835a(Installation installation, Throwable th) {
        if (th instanceof RootCommandTimeoutException) {
            return updateInstallation(installation, 1, 5).save().mo18610e();
        }
        return C5368e.m10238a(th);
    }

    /* renamed from: a */
    public /* synthetic */ Void mo12830a(Installation installation, boolean z, Context context2) throws Exception {
        AppInstall map = map(installation);
        if (z) {
            this.appInstaller.install(map);
            return null;
        }
        updateInstallation(installation, z ? 3 : 0, 3);
        startInstallIntent(context2, installation.getFile());
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ Void mo12829a(Installation installation, boolean z) throws Exception {
        int i = 3;
        if (installation.getStatus() != 3) {
            return null;
        }
        if (!z) {
            i = 0;
        }
        updateInstallation(installation, i, 1);
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12839a(Installation installation, InstallStatus installStatus) {
        if (InstallStatus.Status.CANCELED.equals(installStatus.getStatus())) {
            this.installerAnalytics.logInstallCancelEvent(installation.getPackageName(), installation.getVersionCode());
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo12840a(Installation installation, boolean z, InstallStatus installStatus) {
        Logger instance = Logger.getInstance();
        instance.mo12975d("Installer", "status: " + installStatus.getStatus().name() + " " + installation.getPackageName());
        int i = 0;
        updateInstallation(installation, z ? 3 : 0, map(installStatus));
        if (installStatus.getStatus().equals(InstallStatus.Status.FAIL) && isDeviceMIUI()) {
            this.installerAnalytics.sendMiuiInstallResultEvent(InstallStatus.Status.FAIL);
            startInstallIntent(this.context, installation.getFile());
            if (z) {
                i = 3;
            }
            updateInstallation(installation, i, 3);
        } else if (installStatus.getStatus().equals(InstallStatus.Status.SUCCESS) && isDeviceMIUI()) {
            this.installerAnalytics.sendMiuiInstallResultEvent(InstallStatus.Status.SUCCESS);
        }
    }
}
