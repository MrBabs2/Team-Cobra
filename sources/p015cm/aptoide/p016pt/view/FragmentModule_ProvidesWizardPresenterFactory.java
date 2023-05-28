package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.view.wizard.WizardPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesWizardPresenterFactory */
public final class FragmentModule_ProvidesWizardPresenterFactory implements C10824b<WizardPresenter> {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesWizardPresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<CrashReport> provider2, Provider<AccountAnalytics> provider3) {
        this.module = fragmentModule;
        this.aptoideAccountManagerProvider = provider;
        this.crashReportProvider = provider2;
        this.accountAnalyticsProvider = provider3;
    }

    public static FragmentModule_ProvidesWizardPresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<CrashReport> provider2, Provider<AccountAnalytics> provider3) {
        return new FragmentModule_ProvidesWizardPresenterFactory(fragmentModule, provider, provider2, provider3);
    }

    public static WizardPresenter providesWizardPresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, AccountAnalytics accountAnalytics) {
        WizardPresenter providesWizardPresenter = fragmentModule.providesWizardPresenter(aptoideAccountManager, crashReport, accountAnalytics);
        C10825c.m36718a(providesWizardPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesWizardPresenter;
    }

    public WizardPresenter get() {
        return providesWizardPresenter(this.module, this.aptoideAccountManagerProvider.get(), this.crashReportProvider.get(), this.accountAnalyticsProvider.get());
    }
}
