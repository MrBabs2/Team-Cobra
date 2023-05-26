package p015cm.aptoide.p016pt.account.view.store;

import android.net.Uri;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.UriToPathResolver;
import p015cm.aptoide.p016pt.account.view.exception.InvalidImageException;
import p015cm.aptoide.p016pt.account.view.exception.StoreCreationException;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.account.view.store.ManageStorePresenter */
public class ManageStorePresenter implements Presenter {
    private AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final String applicationPackageName;
    private final CrashReport crashReport;
    private final ManageStoreErrorMapper errorMapper;
    private final boolean goBackToHome;
    private final ManageStoreNavigator navigator;
    private final int requestCode;
    private final UriToPathResolver uriToPathResolver;
    private final ManageStoreView view;

    public ManageStorePresenter(ManageStoreView manageStoreView, CrashReport crashReport2, UriToPathResolver uriToPathResolver2, String str, ManageStoreNavigator manageStoreNavigator, boolean z, ManageStoreErrorMapper manageStoreErrorMapper, AptoideAccountManager aptoideAccountManager, int i, AccountAnalytics accountAnalytics2) {
        this.view = manageStoreView;
        this.crashReport = crashReport2;
        this.uriToPathResolver = uriToPathResolver2;
        this.applicationPackageName = str;
        this.navigator = manageStoreNavigator;
        this.goBackToHome = z;
        this.errorMapper = manageStoreErrorMapper;
        this.accountManager = aptoideAccountManager;
        this.requestCode = i;
        this.accountAnalytics = accountAnalytics2;
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m4411c(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m4412d(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: d */
    static /* synthetic */ void m4413d(ManageStoreViewModel manageStoreViewModel) {
    }

    private void handleCancel() {
        this.view.getLifecycleEvent().mo18681d(C1230o.f3652f).mo18687f(new C1227l(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1239x.f3664f, (C5378b<Throwable>) new C1237v(this));
    }

    /* access modifiers changed from: private */
    public C5328b handleSaveClick(ManageStoreViewModel manageStoreViewModel) {
        ManageStoreView manageStoreView = this.view;
        manageStoreView.getClass();
        return C5328b.m10169d(new C1220e0(manageStoreView)).mo18588a(Schedulers.m10352io()).mo18587a(saveData(manageStoreViewModel)).mo18588a(C5376a.m10346b()).mo18589a((C5377a) new C1233r(this, manageStoreViewModel)).mo18589a((C5377a) new C1235t(this)).mo18589a((C5377a) new C1232q(this)).mo18589a((C5377a) new C1226k(this)).mo18603b((C5379n<? super Throwable, ? extends C5328b>) new C1225j(this));
    }

    private void handleSaveData() {
        this.view.getLifecycleEvent().mo18681d(C1224i.f3645f).mo18687f(new C1228m(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18693i();
    }

    private void handleStoreCreationErrors(Throwable th) {
        if (th instanceof InvalidImageException) {
            InvalidImageException invalidImageException = (InvalidImageException) th;
            if (invalidImageException.getImageErrors().contains(InvalidImageException.ImageError.API_ERROR)) {
                this.view.showError(this.errorMapper.getImageError());
            } else {
                this.view.showError(this.errorMapper.getNetworkError(invalidImageException.getErrorCode(), this.applicationPackageName));
            }
        } else if (th instanceof StoreCreationException) {
            StoreCreationException storeCreationException = (StoreCreationException) th;
            if (storeCreationException.hasErrorCode()) {
                this.view.showError(this.errorMapper.getNetworkError(storeCreationException.getErrorCode(), this.applicationPackageName));
            } else {
                this.view.showError(this.errorMapper.getInvalidStoreError());
            }
        } else {
            if (th instanceof StoreValidationException) {
                StoreValidationException storeValidationException = (StoreValidationException) th;
                if (storeValidationException.getErrorCode() == 0) {
                    this.view.showError(this.errorMapper.getInvalidStoreError());
                    return;
                } else if (storeValidationException.getErrorCode() == 1) {
                    this.view.showError(this.errorMapper.getImageError());
                    return;
                }
            }
            this.crashReport.log(th);
            this.view.showError(this.errorMapper.getGenericError());
        }
    }

    private void navigate(boolean z) {
        if (this.goBackToHome) {
            this.navigator.goToHome();
        } else {
            this.navigator.popViewWithResult(this.requestCode, z);
        }
    }

    private C5328b saveData(ManageStoreViewModel manageStoreViewModel) {
        return Single.m10126b(new C1238w(this, manageStoreViewModel)).mo18566b(new C1229n(this, manageStoreViewModel));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6507a(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelClick().mo18664b(new C1231p(this));
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6511b(View.LifecycleEvent lifecycleEvent) {
        C5368e<ManageStoreViewModel> g = this.view.saveDataClick().mo18689g(new C1234s(this));
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        return g.mo18649a((C5378b<? super Throwable>) new C1211a(crashReport2)).mo18686f();
    }

    public void present() {
        handleSaveData();
        handleCancel();
    }

    /* renamed from: c */
    public /* synthetic */ void mo6517c() {
        this.view.showSuccessMessage();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6509a(ManageStoreViewModel manageStoreViewModel) {
        if (this.goBackToHome) {
            this.accountAnalytics.createStore(manageStoreViewModel.hasPicture(), AccountAnalytics.CreateStoreAction.SKIP);
        }
        navigate(false);
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo6516c(Throwable th) {
        return C5328b.m10169d(new C1236u(this, th));
    }

    /* renamed from: c */
    public /* synthetic */ String mo6515c(ManageStoreViewModel manageStoreViewModel) throws Exception {
        return manageStoreViewModel.hasNewAvatar() ? this.uriToPathResolver.getMediaStoragePath(Uri.parse(manageStoreViewModel.getPictureUri())) : "";
    }

    /* renamed from: b */
    public /* synthetic */ void mo6513b(ManageStoreViewModel manageStoreViewModel) {
        if (this.goBackToHome) {
            this.accountAnalytics.createStore(manageStoreViewModel.hasPicture(), AccountAnalytics.CreateStoreAction.CREATE);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo6510a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6508a() {
        navigate(true);
    }

    /* renamed from: b */
    public /* synthetic */ void mo6512b() {
        this.view.dismissWaitProgressBar();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6506a(ManageStoreViewModel manageStoreViewModel, String str) {
        return this.accountManager.createOrUpdate(manageStoreViewModel.getStoreName(), manageStoreViewModel.getStoreDescription(), str, manageStoreViewModel.hasNewAvatar(), manageStoreViewModel.getStoreTheme().getThemeName(), manageStoreViewModel.storeExists());
    }

    /* renamed from: b */
    public /* synthetic */ void mo6514b(Throwable th) {
        this.view.dismissWaitProgressBar();
        handleStoreCreationErrors(th);
    }
}
