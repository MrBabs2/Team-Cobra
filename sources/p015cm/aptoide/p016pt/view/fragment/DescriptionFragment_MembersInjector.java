package p015cm.aptoide.p016pt.view.fragment;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.fragment.DescriptionFragment_MembersInjector */
public final class DescriptionFragment_MembersInjector implements C10822a<DescriptionFragment> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public DescriptionFragment_MembersInjector(Provider<AppBundlesVisibilityManager> provider, Provider<ThemeManager> provider2, Provider<StoreCredentialsProvider> provider3) {
        this.appBundlesVisibilityManagerProvider = provider;
        this.themeManagerProvider = provider2;
        this.storeCredentialsProvider = provider3;
    }

    public static C10822a<DescriptionFragment> create(Provider<AppBundlesVisibilityManager> provider, Provider<ThemeManager> provider2, Provider<StoreCredentialsProvider> provider3) {
        return new DescriptionFragment_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAppBundlesVisibilityManager(DescriptionFragment descriptionFragment, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        descriptionFragment.appBundlesVisibilityManager = appBundlesVisibilityManager;
    }

    public static void injectStoreCredentialsProvider(DescriptionFragment descriptionFragment, StoreCredentialsProvider storeCredentialsProvider2) {
        descriptionFragment.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public static void injectThemeManager(DescriptionFragment descriptionFragment, ThemeManager themeManager) {
        descriptionFragment.themeManager = themeManager;
    }

    public void injectMembers(DescriptionFragment descriptionFragment) {
        injectAppBundlesVisibilityManager(descriptionFragment, this.appBundlesVisibilityManagerProvider.get());
        injectThemeManager(descriptionFragment, this.themeManagerProvider.get());
        injectStoreCredentialsProvider(descriptionFragment, this.storeCredentialsProvider.get());
    }
}
