package p015cm.aptoide.p016pt.store.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.store.view.AddStoreDialog_MembersInjector */
public final class AddStoreDialog_MembersInjector implements C10822a<AddStoreDialog> {
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public AddStoreDialog_MembersInjector(Provider<ThemeManager> provider, Provider<StoreCredentialsProvider> provider2, Provider<StoreUtilsProxy> provider3) {
        this.themeManagerProvider = provider;
        this.storeCredentialsProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
    }

    public static C10822a<AddStoreDialog> create(Provider<ThemeManager> provider, Provider<StoreCredentialsProvider> provider2, Provider<StoreUtilsProxy> provider3) {
        return new AddStoreDialog_MembersInjector(provider, provider2, provider3);
    }

    public static void injectStoreCredentialsProvider(AddStoreDialog addStoreDialog, StoreCredentialsProvider storeCredentialsProvider2) {
        addStoreDialog.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public static void injectStoreUtilsProxy(AddStoreDialog addStoreDialog, StoreUtilsProxy storeUtilsProxy) {
        addStoreDialog.storeUtilsProxy = storeUtilsProxy;
    }

    public void injectMembers(AddStoreDialog addStoreDialog) {
        BaseDialogFragment_MembersInjector.injectThemeManager(addStoreDialog, this.themeManagerProvider.get());
        injectStoreCredentialsProvider(addStoreDialog, this.storeCredentialsProvider.get());
        injectStoreUtilsProxy(addStoreDialog, this.storeUtilsProxyProvider.get());
    }
}
