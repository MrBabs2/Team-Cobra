package p015cm.aptoide.p016pt.home.more.apps;

import javax.inject.Provider;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsMoreFragment_MembersInjector */
public final class ListAppsMoreFragment_MembersInjector implements C10822a<ListAppsMoreFragment> {
    private final Provider<ListAppsMorePresenter> presenterProvider;

    public ListAppsMoreFragment_MembersInjector(Provider<ListAppsMorePresenter> provider) {
        this.presenterProvider = provider;
    }

    public static C10822a<ListAppsMoreFragment> create(Provider<ListAppsMorePresenter> provider) {
        return new ListAppsMoreFragment_MembersInjector(provider);
    }

    public static void injectPresenter(ListAppsMoreFragment listAppsMoreFragment, ListAppsMorePresenter listAppsMorePresenter) {
        listAppsMoreFragment.presenter = listAppsMorePresenter;
    }

    public void injectMembers(ListAppsMoreFragment listAppsMoreFragment) {
        injectPresenter(listAppsMoreFragment, this.presenterProvider.get());
    }
}
