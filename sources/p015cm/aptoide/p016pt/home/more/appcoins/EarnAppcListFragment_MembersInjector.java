package p015cm.aptoide.p016pt.home.more.appcoins;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListFragment_MembersInjector */
public final class EarnAppcListFragment_MembersInjector implements C10822a<EarnAppcListFragment> {
    private final Provider<EarnAppcListPresenter> presenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public EarnAppcListFragment_MembersInjector(Provider<EarnAppcListPresenter> provider, Provider<ThemeManager> provider2) {
        this.presenterProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static C10822a<EarnAppcListFragment> create(Provider<EarnAppcListPresenter> provider, Provider<ThemeManager> provider2) {
        return new EarnAppcListFragment_MembersInjector(provider, provider2);
    }

    public static void injectPresenter(EarnAppcListFragment earnAppcListFragment, EarnAppcListPresenter earnAppcListPresenter) {
        earnAppcListFragment.presenter = earnAppcListPresenter;
    }

    public static void injectThemeManager(EarnAppcListFragment earnAppcListFragment, ThemeManager themeManager) {
        earnAppcListFragment.themeManager = themeManager;
    }

    public void injectMembers(EarnAppcListFragment earnAppcListFragment) {
        injectPresenter(earnAppcListFragment, this.presenterProvider.get());
        injectThemeManager(earnAppcListFragment, this.themeManagerProvider.get());
    }
}
