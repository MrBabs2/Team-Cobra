package p015cm.aptoide.p016pt.autoupdate;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateDialogFragment_MembersInjector */
public final class AutoUpdateDialogFragment_MembersInjector implements C10822a<AutoUpdateDialogFragment> {
    private final Provider<AutoUpdateDialogPresenter> presenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public AutoUpdateDialogFragment_MembersInjector(Provider<ThemeManager> provider, Provider<AutoUpdateDialogPresenter> provider2) {
        this.themeManagerProvider = provider;
        this.presenterProvider = provider2;
    }

    public static C10822a<AutoUpdateDialogFragment> create(Provider<ThemeManager> provider, Provider<AutoUpdateDialogPresenter> provider2) {
        return new AutoUpdateDialogFragment_MembersInjector(provider, provider2);
    }

    public static void injectPresenter(AutoUpdateDialogFragment autoUpdateDialogFragment, AutoUpdateDialogPresenter autoUpdateDialogPresenter) {
        autoUpdateDialogFragment.presenter = autoUpdateDialogPresenter;
    }

    public void injectMembers(AutoUpdateDialogFragment autoUpdateDialogFragment) {
        BaseDialogFragment_MembersInjector.injectThemeManager(autoUpdateDialogFragment, this.themeManagerProvider.get());
        injectPresenter(autoUpdateDialogFragment, this.presenterProvider.get());
    }
}
