package p015cm.aptoide.p016pt.autoupdate;

import android.content.SharedPreferences;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallManager;
import p123rx.C5368e;
import p123rx.Single;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0002J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0015J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180!H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010'\u001a\u00020\u001cR\u000e\u0010\u0012\u001a\u00020\u0013XD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, mo16641d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateManager;", "", "downloadFactory", "Lcm/aptoide/pt/download/DownloadFactory;", "permissionManager", "Lcm/aptoide/pt/actions/PermissionManager;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "downloadAnalytics", "Lcm/aptoide/pt/download/DownloadAnalytics;", "localVersionCode", "", "autoUpdateRepository", "Lcm/aptoide/pt/autoupdate/AutoUpdateRepository;", "localVersionSdk", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/download/DownloadFactory;Lcm/aptoide/pt/actions/PermissionManager;Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/download/DownloadAnalytics;ILcm/aptoide/pt/autoupdate/AutoUpdateRepository;ILandroid/content/SharedPreferences;)V", "AUTO_UPDATE_SHOW", "", "clearAutoUpdateShow", "", "getAutoUpdateModel", "Lrx/Observable;", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "getInstall", "Lcm/aptoide/pt/install/Install;", "hasDownloadPermissions", "", "permissionService", "Lcm/aptoide/pt/actions/PermissionService;", "incrementAutoUpdateShow", "isDownloadComplete", "Lrx/Single;", "loadAutoUpdateModel", "shouldShowAutoUpdateDialog", "shouldUpdate", "autoUpdateModel", "startUpdate", "shouldInstall", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateManager */
/* compiled from: AutoUpdateManager.kt */
public class AutoUpdateManager {
    private final String AUTO_UPDATE_SHOW = "showAutoUpdate";
    private final AutoUpdateRepository autoUpdateRepository;
    /* access modifiers changed from: private */
    public final DownloadAnalytics downloadAnalytics;
    /* access modifiers changed from: private */
    public final DownloadFactory downloadFactory;
    /* access modifiers changed from: private */
    public final InstallManager installManager;
    private final int localVersionCode;
    private final int localVersionSdk;
    private final PermissionManager permissionManager;
    private final SharedPreferences sharedPreferences;

    public AutoUpdateManager(DownloadFactory downloadFactory2, PermissionManager permissionManager2, InstallManager installManager2, DownloadAnalytics downloadAnalytics2, int i, AutoUpdateRepository autoUpdateRepository2, int i2, SharedPreferences sharedPreferences2) {
        C10202j.m34178b(downloadFactory2, "downloadFactory");
        C10202j.m34178b(permissionManager2, "permissionManager");
        C10202j.m34178b(installManager2, "installManager");
        C10202j.m34178b(downloadAnalytics2, "downloadAnalytics");
        C10202j.m34178b(autoUpdateRepository2, "autoUpdateRepository");
        C10202j.m34178b(sharedPreferences2, "sharedPreferences");
        this.downloadFactory = downloadFactory2;
        this.permissionManager = permissionManager2;
        this.installManager = installManager2;
        this.downloadAnalytics = downloadAnalytics2;
        this.localVersionCode = i;
        this.autoUpdateRepository = autoUpdateRepository2;
        this.localVersionSdk = i2;
        this.sharedPreferences = sharedPreferences2;
    }

    private final C5368e<AutoUpdateModel> getAutoUpdateModel() {
        C5368e<AutoUpdateModel> c = this.autoUpdateRepository.loadAutoUpdateModel().mo18567c();
        C10202j.m34174a((Object) c, "autoUpdateRepository.loa…ateModel().toObservable()");
        return c;
    }

    /* access modifiers changed from: private */
    public final C5368e<Install> getInstall() {
        C5368e<R> f = getAutoUpdateModel().mo18687f(new AutoUpdateManager$getInstall$1(this));
        C10202j.m34174a((Object) f, "getAutoUpdateModel().fla…DownloadStarted() }\n    }");
        return f;
    }

    private final Single<AutoUpdateModel> loadAutoUpdateModel() {
        Single<R> a = this.autoUpdateRepository.loadFreshAutoUpdateModel().mo18559a(new AutoUpdateManager$loadAutoUpdateModel$1(this));
        C10202j.m34174a((Object) a, "autoUpdateRepository.loa…utoUpdateModel)\n        }");
        return a;
    }

    public final void clearAutoUpdateShow() {
        this.sharedPreferences.edit().putInt(this.AUTO_UPDATE_SHOW, 0).apply();
    }

    public final C5368e<Boolean> hasDownloadPermissions(PermissionService permissionService) {
        C10202j.m34178b(permissionService, "permissionService");
        C5368e<Boolean> hasDownloadAccess = this.permissionManager.hasDownloadAccess(permissionService);
        C10202j.m34174a((Object) hasDownloadAccess, "permissionManager.hasDow…Access(permissionService)");
        return hasDownloadAccess;
    }

    public final void incrementAutoUpdateShow() {
        this.sharedPreferences.edit().putInt(this.AUTO_UPDATE_SHOW, this.sharedPreferences.getInt(this.AUTO_UPDATE_SHOW, 0) + 1).apply();
    }

    public final Single<Boolean> isDownloadComplete() {
        Single<R> m = loadAutoUpdateModel().mo18567c().mo18692i(new AutoUpdateManager$isDownloadComplete$1(this)).mo18694j(AutoUpdateManager$isDownloadComplete$2.INSTANCE).mo18700m();
        C10202j.m34174a((Object) m, "loadAutoUpdateModel().to…TED }\n        .toSingle()");
        return m;
    }

    public final C5368e<Boolean> shouldShowAutoUpdateDialog() {
        boolean z = false;
        int i = this.sharedPreferences.getInt(this.AUTO_UPDATE_SHOW, 0);
        if (i % 5 == 0 || i == 1) {
            z = true;
        }
        C5368e<Boolean> c = C5368e.m10257c(Boolean.valueOf(z));
        C10202j.m34174a((Object) c, "Observable.just(result % 5 == 0 || result == 1)");
        return c;
    }

    public final C5368e<Boolean> shouldUpdate() {
        C5368e<R> j = loadAutoUpdateModel().mo18567c().mo18694j(AutoUpdateManager$shouldUpdate$1.INSTANCE);
        C10202j.m34174a((Object) j, "loadAutoUpdateModel().to…).map { it.shouldUpdate }");
        return j;
    }

    public final C5368e<Install> startUpdate(boolean z) {
        C5368e<R> f = getAutoUpdateModel().mo18687f(new AutoUpdateManager$startUpdate$1(this, z));
        C10202j.m34174a((Object) f, "getAutoUpdateModel().fla…dThen(getInstall())\n    }");
        return f;
    }

    /* access modifiers changed from: private */
    public final boolean shouldUpdate(AutoUpdateModel autoUpdateModel) {
        return autoUpdateModel.getVersionCode() > this.localVersionCode && this.localVersionSdk >= Integer.parseInt(autoUpdateModel.getMinSdk());
    }
}
