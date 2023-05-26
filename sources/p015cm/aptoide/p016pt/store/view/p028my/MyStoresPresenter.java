package p015cm.aptoide.p016pt.store.view.p028my;

import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.my.MyStoresPresenter */
public class MyStoresPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final MyStoresNavigator myStoresNavigator;
    private final MyStoresView view;
    private final C5373h viewScheduler;

    public MyStoresPresenter(MyStoresView myStoresView, C5373h hVar, AptoideAccountManager aptoideAccountManager, MyStoresNavigator myStoresNavigator2) {
        this.view = myStoresView;
        this.viewScheduler = hVar;
        this.accountManager = aptoideAccountManager;
        this.myStoresNavigator = myStoresNavigator2;
    }

    /* renamed from: b */
    static /* synthetic */ void m7368b(Integer num) {
    }

    /* renamed from: b */
    static /* synthetic */ void m7369b(String str) {
    }

    /* renamed from: b */
    static /* synthetic */ void m7371b(Void voidR) {
    }

    /* access modifiers changed from: private */
    /* renamed from: getUserAvatar */
    public C5368e<String> mo14788a(Account account) {
        return C5368e.m10257c((account == null || !account.isLoggedIn()) ? null : account.getAvatar());
    }

    private void handleBottomNavigationEvent() {
        this.view.getLifecycleEvent().mo18681d(C4319h.f7418f).mo18687f(new C4329r(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4330s.f7429f, (C5378b<Throwable>) C4328q.f7427f);
    }

    private void handleUserImageClick() {
        this.view.getLifecycleEvent().mo18681d(C4323l.f7422f).mo18687f(new C4332u(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4321j.f7420f, (C5378b<Throwable>) C4325n.f7424f);
    }

    private void loadUserImage() {
        this.view.getLifecycleEvent().mo18681d(C4324m.f7423f).mo18687f(new C4327p(this)).mo18687f(new C4326o(this)).mo18644a(this.viewScheduler).mo18664b(new C4333v(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4322k.f7421f, (C5378b<Throwable>) C4318g.f7417f);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14792a(Void voidR) {
        this.myStoresNavigator.navigateToMyAccount();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo14793b(View.LifecycleEvent lifecycleEvent) {
        return this.view.imageClick().mo18644a(this.viewScheduler).mo18664b(new C4331t(this)).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo14794c(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    public void present() {
        loadUserImage();
        handleBottomNavigationEvent();
        handleUserImageClick();
    }

    /* renamed from: c */
    static /* synthetic */ void m7372c(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14791a(String str) {
        if (str != null) {
            this.view.setUserImage(str);
        } else {
            this.view.setDefaultUserImage();
        }
        this.view.showAvatar();
    }

    /* renamed from: b */
    static /* synthetic */ void m7370b(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14789a(View.LifecycleEvent lifecycleEvent) {
        return this.myStoresNavigator.bottomNavigationEvent().mo18644a(this.viewScheduler).mo18664b(new C4320i(this)).mo18686f();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14790a(Integer num) {
        this.view.scrollToTop();
    }

    /* renamed from: a */
    static /* synthetic */ void m7367a(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }
}
