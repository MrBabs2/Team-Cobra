package p015cm.aptoide.p016pt.view;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsConfiguration;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreManager;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMorePresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesListAppsMorePresenterFactory */
public final class FragmentModule_ProvidesListAppsMorePresenterFactory implements C10824b<ListAppsMorePresenter> {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<ListAppsConfiguration> listAppsConfigurationProvider;
    private final Provider<ListAppsMoreManager> listAppsMoreManagerProvider;
    private final FragmentModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public FragmentModule_ProvidesListAppsMorePresenterFactory(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<AppNavigator> provider2, Provider<SharedPreferences> provider3, Provider<ListAppsConfiguration> provider4, Provider<ListAppsMoreManager> provider5) {
        this.module = fragmentModule;
        this.crashReportProvider = provider;
        this.appNavigatorProvider = provider2;
        this.sharedPreferencesProvider = provider3;
        this.listAppsConfigurationProvider = provider4;
        this.listAppsMoreManagerProvider = provider5;
    }

    public static FragmentModule_ProvidesListAppsMorePresenterFactory create(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<AppNavigator> provider2, Provider<SharedPreferences> provider3, Provider<ListAppsConfiguration> provider4, Provider<ListAppsMoreManager> provider5) {
        return new FragmentModule_ProvidesListAppsMorePresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ListAppsMorePresenter providesListAppsMorePresenter(FragmentModule fragmentModule, CrashReport crashReport, AppNavigator appNavigator, SharedPreferences sharedPreferences, ListAppsConfiguration listAppsConfiguration, ListAppsMoreManager listAppsMoreManager) {
        ListAppsMorePresenter providesListAppsMorePresenter = fragmentModule.providesListAppsMorePresenter(crashReport, appNavigator, sharedPreferences, listAppsConfiguration, listAppsMoreManager);
        C10825c.m36718a(providesListAppsMorePresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesListAppsMorePresenter;
    }

    public ListAppsMorePresenter get() {
        return providesListAppsMorePresenter(this.module, this.crashReportProvider.get(), this.appNavigatorProvider.get(), this.sharedPreferencesProvider.get(), this.listAppsConfigurationProvider.get(), this.listAppsMoreManagerProvider.get());
    }
}
