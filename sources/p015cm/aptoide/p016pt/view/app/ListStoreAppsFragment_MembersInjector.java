package p015cm.aptoide.p016pt.view.app;

import javax.inject.Provider;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.app.ListStoreAppsFragment_MembersInjector */
public final class ListStoreAppsFragment_MembersInjector implements C10822a<ListStoreAppsFragment> {
    private final Provider<AppCenter> appCenterProvider;
    private final Provider<ListStoreAppsNavigator> listStoreAppsNavigatorProvider;

    public ListStoreAppsFragment_MembersInjector(Provider<ListStoreAppsNavigator> provider, Provider<AppCenter> provider2) {
        this.listStoreAppsNavigatorProvider = provider;
        this.appCenterProvider = provider2;
    }

    public static C10822a<ListStoreAppsFragment> create(Provider<ListStoreAppsNavigator> provider, Provider<AppCenter> provider2) {
        return new ListStoreAppsFragment_MembersInjector(provider, provider2);
    }

    public static void injectAppCenter(ListStoreAppsFragment listStoreAppsFragment, AppCenter appCenter) {
        listStoreAppsFragment.appCenter = appCenter;
    }

    public static void injectListStoreAppsNavigator(ListStoreAppsFragment listStoreAppsFragment, ListStoreAppsNavigator listStoreAppsNavigator) {
        listStoreAppsFragment.listStoreAppsNavigator = listStoreAppsNavigator;
    }

    public void injectMembers(ListStoreAppsFragment listStoreAppsFragment) {
        injectListStoreAppsNavigator(listStoreAppsFragment, this.listStoreAppsNavigatorProvider.get());
        injectAppCenter(listStoreAppsFragment, this.appCenterProvider.get());
    }
}
