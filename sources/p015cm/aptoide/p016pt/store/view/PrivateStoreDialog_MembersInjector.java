package p015cm.aptoide.p016pt.store.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.store.view.PrivateStoreDialog_MembersInjector */
public final class PrivateStoreDialog_MembersInjector implements C10822a<PrivateStoreDialog> {
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public PrivateStoreDialog_MembersInjector(Provider<ThemeManager> provider, Provider<StoreUtilsProxy> provider2) {
        this.themeManagerProvider = provider;
        this.storeUtilsProxyProvider = provider2;
    }

    public static C10822a<PrivateStoreDialog> create(Provider<ThemeManager> provider, Provider<StoreUtilsProxy> provider2) {
        return new PrivateStoreDialog_MembersInjector(provider, provider2);
    }

    public static void injectStoreUtilsProxy(PrivateStoreDialog privateStoreDialog, StoreUtilsProxy storeUtilsProxy) {
        privateStoreDialog.storeUtilsProxy = storeUtilsProxy;
    }

    public void injectMembers(PrivateStoreDialog privateStoreDialog) {
        BaseDialogFragment_MembersInjector.injectThemeManager(privateStoreDialog, this.themeManagerProvider.get());
        injectStoreUtilsProxy(privateStoreDialog, this.storeUtilsProxyProvider.get());
    }
}
