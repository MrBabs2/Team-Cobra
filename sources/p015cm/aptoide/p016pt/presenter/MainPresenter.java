package p015cm.aptoide.p016pt.presenter;

import android.content.Intent;
import android.content.SharedPreferences;
import com.aptoide.authentication.AuthenticationException;
import java.util.List;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.accountmanager.AptoideCredentials;
import p015cm.aptoide.p016pt.account.AgentPersistence;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateDialogFragment;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateManager;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.AptoideBottomNavigator;
import p015cm.aptoide.p016pt.home.apps.UpdatesManager;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallCompletedNotifier;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.install.installer.RootInstallationRetryHandler;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.notification.ContentPuller;
import p015cm.aptoide.p016pt.notification.NotificationSyncScheduler;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferences;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p015cm.aptoide.p016pt.util.ApkFyManager;
import p015cm.aptoide.p016pt.view.DeepLinkManager;
import p015cm.aptoide.p016pt.view.wizard.WizardFragment;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.presenter.MainPresenter */
public class MainPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final AgentPersistence agentPersistence;
    private final ApkFyManager apkFyManager;
    private final AptoideBottomNavigator aptoideBottomNavigator;
    private final AutoUpdateManager autoUpdateManager;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final BottomNavigationNavigator bottomNavigationNavigator;
    private final ContentPuller contentPuller;
    private final CrashReport crashReport;
    private final DeepLinkManager deepLinkManager;
    private final boolean firstCreated;
    private final FragmentNavigator fragmentNavigator;
    private final InstallCompletedNotifier installCompletedNotifier;
    private final InstallManager installManager;
    private final C5373h ioScheduler;
    private final NotificationSyncScheduler notificationSyncScheduler;
    private final PermissionService permissionService;
    private final RootAvailabilityManager rootAvailabilityManager;
    private final RootInstallationRetryHandler rootInstallationRetryHandler;
    private final SharedPreferences securePreferences;
    private final SharedPreferences sharedPreferences;
    private final UpdatesManager updatesManager;
    private final MainView view;
    private final C5373h viewScheduler;

    public MainPresenter(MainView mainView, InstallManager installManager2, RootInstallationRetryHandler rootInstallationRetryHandler2, CrashReport crashReport2, ApkFyManager apkFyManager2, ContentPuller contentPuller2, NotificationSyncScheduler notificationSyncScheduler2, InstallCompletedNotifier installCompletedNotifier2, SharedPreferences sharedPreferences2, SharedPreferences sharedPreferences3, FragmentNavigator fragmentNavigator2, DeepLinkManager deepLinkManager2, boolean z, AptoideBottomNavigator aptoideBottomNavigator2, C5373h hVar, C5373h hVar2, BottomNavigationNavigator bottomNavigationNavigator2, UpdatesManager updatesManager2, AutoUpdateManager autoUpdateManager2, PermissionService permissionService2, RootAvailabilityManager rootAvailabilityManager2, BottomNavigationMapper bottomNavigationMapper2, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator2, AgentPersistence agentPersistence2) {
        this.view = mainView;
        this.installManager = installManager2;
        this.rootInstallationRetryHandler = rootInstallationRetryHandler2;
        this.crashReport = crashReport2;
        this.apkFyManager = apkFyManager2;
        this.contentPuller = contentPuller2;
        this.notificationSyncScheduler = notificationSyncScheduler2;
        this.installCompletedNotifier = installCompletedNotifier2;
        this.fragmentNavigator = fragmentNavigator2;
        this.deepLinkManager = deepLinkManager2;
        this.firstCreated = z;
        this.sharedPreferences = sharedPreferences2;
        this.securePreferences = sharedPreferences3;
        this.aptoideBottomNavigator = aptoideBottomNavigator2;
        this.viewScheduler = hVar;
        this.ioScheduler = hVar2;
        this.bottomNavigationNavigator = bottomNavigationNavigator2;
        this.updatesManager = updatesManager2;
        this.autoUpdateManager = autoUpdateManager2;
        this.permissionService = permissionService2;
        this.rootAvailabilityManager = rootAvailabilityManager2;
        this.bottomNavigationMapper = bottomNavigationMapper2;
        this.accountManager = aptoideAccountManager;
        this.accountNavigator = accountNavigator2;
        this.agentPersistence = agentPersistence2;
    }

    /* renamed from: a */
    static /* synthetic */ void m6727a(Object obj) {
    }

    /* access modifiers changed from: private */
    /* renamed from: authenticate */
    public C5328b mo13466b(String str) {
        return this.accountManager.login(new AptoideCredentials(this.agentPersistence.getEmail(), str, true, this.agentPersistence.getAgent(), this.agentPersistence.getState())).mo18556a(this.viewScheduler).mo18557a((C5377a) new C3709v3(this)).mo18564b(new C3652k1(this)).mo18564b(new C3692s1(this)).mo18558a((C5378b<Throwable>) new C3618d3(this)).mo18565b();
    }

    /* renamed from: c */
    static /* synthetic */ void m6729c(Integer num) {
    }

    /* renamed from: c */
    static /* synthetic */ void m6730c(String str) {
    }

    /* renamed from: c */
    static /* synthetic */ void m6731c(Void voidR) {
    }

    /* renamed from: d */
    static /* synthetic */ void m6733d(Integer num) {
    }

    private void downloadAutoUpdate() {
        this.view.getLifecycleEvent().mo18681d(C3703u2.f6749f).mo18681d(new C3688r2(this)).mo18644a(this.ioScheduler).mo18687f(new C3647j1(this)).mo18644a(this.viewScheduler).mo18681d(C3600a3.f6646f).mo18692i(new C3659l3(this)).mo18687f(new C3727z1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3677p1.f6723f, (C5378b<Throwable>) new C3628f2(this));
    }

    private void handleAuthentication() {
        this.view.getLifecycleEvent().mo18681d(C3713w2.f6759f).mo18687f(new C3687r1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3653k2.f6699f, (C5378b<Throwable>) C3607b4.f6653f);
    }

    private C5368e<Boolean> handleAutoUpdateDialog() {
        this.autoUpdateManager.incrementAutoUpdateShow();
        return this.autoUpdateManager.shouldShowAutoUpdateDialog().mo18681d(C3718x2.f6764f).mo18664b(new C3714w3(this));
    }

    private C5368e<Install> handleAutoUpdateDownload() {
        return this.autoUpdateManager.hasDownloadPermissions(this.permissionService).mo18681d(C3643i2.f6689f).mo18664b(new C3649j3(this)).mo18644a(this.ioScheduler).mo18687f(new C3668n2(this));
    }

    private void handleErrorResult(Throwable th) {
        this.view.dismissAutoUpdateDialog();
        if (!(th instanceof SecurityException)) {
            this.view.showUnknownErrorMessage();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleFirstSignup */
    public void mo13469b(Boolean bool) {
        if (bool.booleanValue()) {
            this.accountNavigator.navigateToCreateProfileView();
        }
    }

    private Single<Boolean> isAutoUpdateDownloaded() {
        return this.autoUpdateManager.isDownloadComplete();
    }

    /* renamed from: l */
    static /* synthetic */ Boolean m6737l(Boolean bool) {
        return bool;
    }

    /* renamed from: m */
    static /* synthetic */ Boolean m6738m(Boolean bool) {
        return bool;
    }

    /* renamed from: n */
    static /* synthetic */ Boolean m6739n(Boolean bool) {
        return bool;
    }

    private void navigate() {
        Intent intentAfterCreate = this.view.getIntentAfterCreate();
        showHome();
        if (this.deepLinkManager.showDeepLink(intentAfterCreate)) {
            SecurePreferences.setWizardAvailable(false, this.securePreferences);
        } else if (SecurePreferences.isWizardAvailable(this.securePreferences)) {
            showWizard();
            SecurePreferences.setWizardAvailable(false, this.securePreferences);
        }
    }

    /* renamed from: o */
    static /* synthetic */ Boolean m6740o(Boolean bool) {
        return bool;
    }

    /* renamed from: p */
    static /* synthetic */ Boolean m6741p(Boolean bool) {
        return bool;
    }

    /* renamed from: q */
    static /* synthetic */ Boolean m6743q(Boolean bool) {
        return bool;
    }

    /* renamed from: r */
    static /* synthetic */ Boolean m6745r(Boolean bool) {
        return bool;
    }

    private void setupInstallErrorsDisplay() {
        this.view.getLifecycleEvent().mo18681d(C3693s2.f6739f).mo18692i(new C3629f3(this)).mo18681d(C3633g2.f6679f).mo18687f(new C3654k3(this)).mo18674c(C3662m1.f6708f).mo18681d(C3663m2.f6709f).mo18644a(C5376a.m10346b()).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(new C3612c3(this), (C5378b<Throwable>) new C3673o2(this));
        this.view.getLifecycleEvent().mo18681d(C3678p2.f6724f).mo18692i(new C3639h3(this)).mo18681d(C3605b2.f6651f).mo18687f(new C3634g3(this)).mo18681d(C3679p3.f6725f).mo18644a(C5376a.m10346b()).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(new C3707v1(this), (C5378b<Throwable>) new C3657l1(this));
        this.view.getLifecycleEvent().mo18681d(C3722y1.f6768f).mo18692i(new C3606b3(this)).mo18681d(C3599a2.f6645f).mo18687f(new C3708v2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18675c(new C3648j2(this));
        this.view.getLifecycleEvent().mo18681d(C3723y2.f6769f).mo18692i(new C3698t2(this)).mo18681d(C3699t3.f6745f).mo18687f(new C3658l2(this)).mo18689g(new C3697t1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3601a4.f6647f, (C5378b<Throwable>) new C3684q3(this));
    }

    private void setupUpdatesNumber() {
        this.view.getLifecycleEvent().mo18681d(C3642i1.f6688f).mo18687f(new C3617d2(this)).mo18644a(this.viewScheduler).mo18664b(new C3672o1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3638h2.f6684f, (C5378b<Throwable>) C3717x1.f6763f);
    }

    private void shortcutManagement() {
        this.view.getLifecycleEvent().mo18681d(C3728z2.f6774f).mo18669c().mo18655a(new C3689r3(this), (C5378b<Throwable>) new C3674o3(this));
    }

    private void showAutoUpdate() {
        this.fragmentNavigator.navigateToDialogFragment(new AutoUpdateDialogFragment());
    }

    private void showHome() {
        this.bottomNavigationNavigator.navigateToHome();
    }

    private void showWizard() {
        this.fragmentNavigator.navigateTo(WizardFragment.newInstance(), true);
    }

    /* renamed from: t */
    static /* synthetic */ void m6747t(View.LifecycleEvent lifecycleEvent) {
    }

    private void watchInstalls(List<Install> list) {
        for (Install next : list) {
            this.installCompletedNotifier.add(next.getPackageName(), next.getVersionCode(), next.getMd5());
        }
    }

    /* renamed from: z */
    static /* synthetic */ Boolean m6753z(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13461a(Integer num) {
        this.aptoideBottomNavigator.showFragment(num);
    }

    /* renamed from: c */
    public /* synthetic */ void mo13475c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: d */
    public /* synthetic */ void mo13477d(View.LifecycleEvent lifecycleEvent) {
        this.apkFyManager.run();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo13479e(View.LifecycleEvent lifecycleEvent) {
        return this.aptoideBottomNavigator.navigationEvent().mo18644a(this.viewScheduler).mo18664b(new C3683q2(this)).mo18686f();
    }

    /* renamed from: f */
    public /* synthetic */ Boolean mo13482f(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(this.firstCreated);
    }

    /* renamed from: g */
    public /* synthetic */ void mo13486g(View.LifecycleEvent lifecycleEvent) {
        this.notificationSyncScheduler.forceSync();
    }

    /* renamed from: h */
    public /* synthetic */ void mo13489h(View.LifecycleEvent lifecycleEvent) {
        this.contentPuller.start();
    }

    /* renamed from: i */
    public /* synthetic */ void mo13491i(View.LifecycleEvent lifecycleEvent) {
        downloadAutoUpdate();
    }

    /* renamed from: j */
    public /* synthetic */ void mo13493j(View.LifecycleEvent lifecycleEvent) {
        navigate();
    }

    /* renamed from: k */
    public /* synthetic */ Single mo13494k(View.LifecycleEvent lifecycleEvent) {
        return this.rootAvailabilityManager.isRootAvailable();
    }

    /* renamed from: l */
    public /* synthetic */ Single mo13496l(View.LifecycleEvent lifecycleEvent) {
        return this.rootAvailabilityManager.isRootAvailable();
    }

    /* renamed from: m */
    public /* synthetic */ Single mo13497m(View.LifecycleEvent lifecycleEvent) {
        return this.rootAvailabilityManager.isRootAvailable();
    }

    /* renamed from: n */
    public /* synthetic */ Single mo13498n(View.LifecycleEvent lifecycleEvent) {
        return this.rootAvailabilityManager.isRootAvailable();
    }

    /* renamed from: o */
    public /* synthetic */ C5368e mo13499o(View.LifecycleEvent lifecycleEvent) {
        return this.updatesManager.getUpdatesNumber();
    }

    /* renamed from: p */
    public /* synthetic */ void mo13500p(View.LifecycleEvent lifecycleEvent) {
        this.deepLinkManager.freeSubscriptions();
    }

    public void present() {
        this.view.getLifecycleEvent().mo18681d(C3682q1.f6728f).mo18664b(new C3644i3(this)).mo18681d(new C3712w1(this)).mo18664b(new C3669n3(this)).mo18664b(new C3719x3(this)).mo18664b(new C3624e3(this)).mo18644a(this.viewScheduler).mo18664b(new C3611c2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3704u3.f6750f, (C5378b<Throwable>) new C3667n1(this));
        this.view.getLifecycleEvent().mo18681d(C3702u1.f6748f).mo18687f(new C3724y3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3623e2.f6669f, (C5378b<Throwable>) C3694s3.f6740f);
        setupInstallErrorsDisplay();
        shortcutManagement();
        setupUpdatesNumber();
        handleAuthentication();
    }

    /* renamed from: h */
    static /* synthetic */ void m6735h(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: i */
    static /* synthetic */ void m6736i(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13462a(String str) {
        this.accountNavigator.clearBackStackUntilLogin();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo13474c(View.LifecycleEvent lifecycleEvent) {
        return this.view.onAuthenticationIntent().mo18664b(new C3664m3(this)).mo18689g(new C3729z3(this)).mo18686f();
    }

    /* renamed from: f */
    public /* synthetic */ void mo13484f(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: g */
    public /* synthetic */ void mo13487g(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo13492j(Boolean bool) {
        return this.installCompletedNotifier.getWatcher();
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo13495k(Boolean bool) {
        return this.view.getInstallErrorsDismiss();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13459a() {
        this.view.showLoadingView();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13470b(Integer num) {
        this.view.showUpdatesBadge(num.intValue());
    }

    /* renamed from: d */
    public /* synthetic */ void mo13478d(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: f */
    public /* synthetic */ void mo13483f(Boolean bool) {
        this.autoUpdateManager.clearAutoUpdateShow();
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo13485g(Boolean bool) {
        return this.autoUpdateManager.startUpdate(false);
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo13488h(Boolean bool) {
        return this.rootInstallationRetryHandler.retries().mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.PAUSE));
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo13490i(Boolean bool) {
        return this.installManager.getTimedOutInstallations();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13460a(Boolean bool) {
        this.view.hideLoadingView();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13472b(List list) {
        this.view.dismissInstallationError();
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo13476d(Boolean bool) {
        if (bool.booleanValue()) {
            return handleAutoUpdateDialog();
        }
        return handleAutoUpdateDownload();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13463a(Throwable th) {
        this.view.hideLoadingView();
        if (th instanceof AuthenticationException) {
            AuthenticationException authenticationException = (AuthenticationException) th;
            if (authenticationException.getCode() >= 400 && authenticationException.getCode() < 500) {
                this.accountNavigator.navigateToLoginError();
                return;
            }
        }
        this.view.showGenericErrorMessage();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo13467b(Void voidR) {
        return this.installManager.cleanTimedOutInstalls();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo13468b(View.LifecycleEvent lifecycleEvent) {
        return this.autoUpdateManager.shouldUpdate();
    }

    /* renamed from: e */
    public /* synthetic */ void mo13481e(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo13471b(Throwable th) {
        handleErrorResult(th);
        this.crashReport.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ Single mo13473c(Boolean bool) {
        return isAutoUpdateDownloaded();
    }

    /* renamed from: e */
    public /* synthetic */ void mo13480e(Boolean bool) {
        showAutoUpdate();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13465a(List list) {
        watchInstalls(list);
        this.view.showInstallationError(list.size());
    }

    /* renamed from: a */
    public /* synthetic */ void mo13464a(Void voidR) {
        this.view.showInstallationSuccessMessage();
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo13458a(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(ManagerPreferences.isCheckAutoUpdateEnable(this.sharedPreferences));
    }
}
