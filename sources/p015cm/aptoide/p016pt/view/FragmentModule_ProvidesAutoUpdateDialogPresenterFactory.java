package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateDialogPresenter;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAutoUpdateDialogPresenterFactory */
public final class FragmentModule_ProvidesAutoUpdateDialogPresenterFactory implements C10824b<AutoUpdateDialogPresenter> {
    private final Provider<AutoUpdateManager> autoUpdateManagerProvider;
    private final Provider<CrashReport> crashReporterProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesAutoUpdateDialogPresenterFactory(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<AutoUpdateManager> provider2) {
        this.module = fragmentModule;
        this.crashReporterProvider = provider;
        this.autoUpdateManagerProvider = provider2;
    }

    public static FragmentModule_ProvidesAutoUpdateDialogPresenterFactory create(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<AutoUpdateManager> provider2) {
        return new FragmentModule_ProvidesAutoUpdateDialogPresenterFactory(fragmentModule, provider, provider2);
    }

    public static AutoUpdateDialogPresenter providesAutoUpdateDialogPresenter(FragmentModule fragmentModule, CrashReport crashReport, AutoUpdateManager autoUpdateManager) {
        AutoUpdateDialogPresenter providesAutoUpdateDialogPresenter = fragmentModule.providesAutoUpdateDialogPresenter(crashReport, autoUpdateManager);
        C10825c.m36718a(providesAutoUpdateDialogPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesAutoUpdateDialogPresenter;
    }

    public AutoUpdateDialogPresenter get() {
        return providesAutoUpdateDialogPresenter(this.module, this.crashReporterProvider.get(), this.autoUpdateManagerProvider.get());
    }
}
