package p015cm.aptoide.p016pt.account.view.user;

import android.net.Uri;
import android.text.TextUtils;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.UriToPathResolver;
import p015cm.aptoide.p016pt.account.view.user.ManageUserFragment;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.ThrowableToStringMapper;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.view.user.ManageUserPresenter */
public class ManageUserPresenter implements Presenter {
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final CrashReport crashReport;
    private final ThrowableToStringMapper errorMapper;
    private final boolean isEditProfile;
    private final boolean isFirstTime;
    private final ManageUserNavigator navigator;
    private final boolean showPrivacyConfigs;
    private final UriToPathResolver uriToPathResolver;
    private final ManageUserView view;

    public ManageUserPresenter(ManageUserView manageUserView, CrashReport crashReport2, AptoideAccountManager aptoideAccountManager, ThrowableToStringMapper throwableToStringMapper, ManageUserNavigator manageUserNavigator, boolean z, UriToPathResolver uriToPathResolver2, boolean z2, boolean z3, AccountAnalytics accountAnalytics2) {
        this.view = manageUserView;
        this.crashReport = crashReport2;
        this.accountManager = aptoideAccountManager;
        this.errorMapper = throwableToStringMapper;
        this.navigator = manageUserNavigator;
        this.isEditProfile = z;
        this.uriToPathResolver = uriToPathResolver2;
        this.showPrivacyConfigs = z2;
        this.isFirstTime = z3;
        this.accountAnalytics = accountAnalytics2;
    }

    /* renamed from: b */
    static /* synthetic */ void m4437b(Void voidR) {
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m4438e(ManageUserFragment.ViewModel viewModel) {
        return Boolean.valueOf(viewModel != null);
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m4440f(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: g */
    static /* synthetic */ Boolean m4441g(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    private void handleCancelClick() {
        this.view.getLifecycleEvent().mo18681d(C1280l.f3715f).mo18687f(new C1296r(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1306w.f3743f, (C5378b<Throwable>) new C1302u(this));
    }

    private void handleSaveDataClick() {
        this.view.getLifecycleEvent().mo18681d(C1286n.f3723f).mo18687f(new C1312z(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18693i();
    }

    /* access modifiers changed from: private */
    /* renamed from: handleSaveUserDataError */
    public C5328b mo6589c(Throwable th) {
        C5328b bVar;
        String map = this.errorMapper.map(th);
        if ((th instanceof SocketTimeoutException) || (th instanceof TimeoutException)) {
            bVar = this.view.showErrorMessage(map).mo18589a((C5377a) new C1304v(this));
        } else {
            bVar = this.view.showErrorMessage(map);
        }
        return C5328b.m10169d(new C1283m(this)).mo18587a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: navigateAway */
    public void mo6593d() {
        if (this.isEditProfile) {
            this.navigator.goBack();
        } else if (this.showPrivacyConfigs) {
            this.navigator.toProfileStepOne();
        } else {
            this.navigator.goToHome();
        }
    }

    private void onViewCreatedLoadUserData() {
        this.view.getLifecycleEvent().mo18681d(C1308x.f3745f).mo18681d(new C1294q(this)).mo18692i(new C1268h(this)).mo18694j(new C1265g(this)).mo18681d(C1300t.f3737f).mo18644a(C5376a.m10346b()).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(new C1262f(this), (C5378b<Throwable>) new C1248a0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: saveUserData */
    public C5328b mo6584b(ManageUserFragment.ViewModel viewModel) {
        return updateUserAccount(viewModel).mo18588a(C5376a.m10346b()).mo18589a((C5377a) new C1310y(this)).mo18589a((C5377a) new C1274j(this, viewModel)).mo18589a((C5377a) new C1292p(this)).mo18603b((C5379n<? super Throwable, ? extends C5328b>) new C1289o(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: sendAnalytics */
    public void mo6594d(ManageUserFragment.ViewModel viewModel) {
        if (!this.isEditProfile) {
            this.accountAnalytics.createdUserProfile(!TextUtils.isEmpty(viewModel.getPictureUri()));
        }
    }

    private C5328b updateUserAccount(ManageUserFragment.ViewModel viewModel) {
        if (this.isEditProfile) {
            if (!viewModel.hasNewPicture()) {
                return this.accountManager.updateAccount(viewModel.getName());
            }
            return this.accountManager.updateAccount(viewModel.getName(), this.uriToPathResolver.getMediaStoragePath(Uri.parse(viewModel.getPictureUri())));
        } else if (!viewModel.hasNewPicture()) {
            return this.accountManager.updateAccount(viewModel.getName());
        } else {
            return this.accountManager.updateAccount(viewModel.getName(), this.uriToPathResolver.getMediaStoragePath(Uri.parse(viewModel.getPictureUri())));
        }
    }

    /* renamed from: a */
    public /* synthetic */ ManageUserFragment.ViewModel mo6578a(Account account) {
        if (this.isEditProfile) {
            return new ManageUserFragment.ViewModel(account.getNickname(), account.getAvatar());
        }
        return null;
    }

    /* renamed from: b */
    public /* synthetic */ void mo6587b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ Boolean mo6588c(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(this.isFirstTime);
    }

    /* renamed from: d */
    public /* synthetic */ Single mo6592d(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus().mo18669c().mo18700m();
    }

    public void present() {
        handleSaveDataClick();
        handleCancelClick();
        onViewCreatedLoadUserData();
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m4439e(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6585b(View.LifecycleEvent lifecycleEvent) {
        return this.view.saveUserDataButtonClick().mo18664b(new C1277k(this)).mo18689g(new C1298s(this)).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ void mo6591c(ManageUserFragment.ViewModel viewModel) {
        this.view.loadImageStateless(viewModel.getPictureUri());
        this.view.setUserName(viewModel.getName());
    }

    /* renamed from: a */
    public /* synthetic */ void mo6581a(ManageUserFragment.ViewModel viewModel) {
        this.view.showProgressDialog();
    }

    /* renamed from: c */
    public /* synthetic */ void mo6590c() {
        this.view.hideProgressDialog();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6579a(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelButtonClick().mo18664b(new C1271i(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6583a(Void voidR) {
        this.navigator.goBack();
    }

    /* renamed from: b */
    public /* synthetic */ void mo6586b() {
        this.view.hideProgressDialog();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6582a(Throwable th) {
        this.crashReport.log(th);
    }
}
