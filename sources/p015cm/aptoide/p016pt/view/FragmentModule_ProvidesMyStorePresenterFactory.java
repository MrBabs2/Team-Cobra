package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresNavigator;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesMyStorePresenterFactory */
public final class FragmentModule_ProvidesMyStorePresenterFactory implements C10824b<MyStoresPresenter> {
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final FragmentModule module;
    private final Provider<MyStoresNavigator> navigatorProvider;

    public FragmentModule_ProvidesMyStorePresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<MyStoresNavigator> provider2) {
        this.module = fragmentModule;
        this.aptoideAccountManagerProvider = provider;
        this.navigatorProvider = provider2;
    }

    public static FragmentModule_ProvidesMyStorePresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<MyStoresNavigator> provider2) {
        return new FragmentModule_ProvidesMyStorePresenterFactory(fragmentModule, provider, provider2);
    }

    public static MyStoresPresenter providesMyStorePresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, MyStoresNavigator myStoresNavigator) {
        MyStoresPresenter providesMyStorePresenter = fragmentModule.providesMyStorePresenter(aptoideAccountManager, myStoresNavigator);
        C10825c.m36718a(providesMyStorePresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesMyStorePresenter;
    }

    public MyStoresPresenter get() {
        return providesMyStorePresenter(this.module, this.aptoideAccountManagerProvider.get(), this.navigatorProvider.get());
    }
}
