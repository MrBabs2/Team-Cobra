package p015cm.aptoide.p016pt.view.wizard;

import androidx.viewpager.widget.ViewPager;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.wizard.WizardPresenter */
public class WizardPresenter implements Presenter, ViewPager.C0804j {
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final CrashReport crashReport;
    private final WizardView view;

    public WizardPresenter(WizardView wizardView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport2, AccountAnalytics accountAnalytics2) {
        this.view = wizardView;
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport2;
        this.accountAnalytics = accountAnalytics2;
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m10517b(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: b */
    static /* synthetic */ void m10518b(Void voidR) {
    }

    private C5328b createViewsAndButtons() {
        return this.accountManager.accountStatus().mo18669c().mo18700m().mo18556a(C5376a.m10346b()).mo18566b(new C5548k(this));
    }

    private C5368e<Void> setupHandlers() {
        return this.view.skipWizardClick().mo18644a(C5376a.m10346b()).mo18664b(new C5544g(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo18919a(Account account) {
        return this.view.createWizardAdapter(account.isLoggedIn());
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.view.handleColorTransitions(i, f, i2);
    }

    public void onPageSelected(int i) {
        if (i == this.view.getCount() - 1) {
            this.accountAnalytics.enterAccountScreen(AccountAnalytics.AccountOrigins.WIZARD);
        }
        this.view.handleSelectedPage(i);
    }

    public void present() {
        this.view.getLifecycleEvent().mo18681d(C5545h.f9812f).mo18687f(new C5547j(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5543f.f9810f, (C5378b<Throwable>) new C5546i(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo18922a(Void voidR) {
        this.view.skipWizard();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo18920a(View.LifecycleEvent lifecycleEvent) {
        return createViewsAndButtons().mo18593a(setupHandlers());
    }

    /* renamed from: a */
    public /* synthetic */ void mo18921a(Throwable th) {
        this.crashReport.log(th);
    }
}
