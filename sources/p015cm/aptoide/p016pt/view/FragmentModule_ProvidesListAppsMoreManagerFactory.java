package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreManager;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesListAppsMoreManagerFactory */
public final class FragmentModule_ProvidesListAppsMoreManagerFactory implements C10824b<ListAppsMoreManager> {
    private final Provider<AdsRepository> adsRepositoryProvider;
    private final Provider<ListAppsMoreRepository> listAppsMoreRepositoryProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesListAppsMoreManagerFactory(FragmentModule fragmentModule, Provider<ListAppsMoreRepository> provider, Provider<AdsRepository> provider2) {
        this.module = fragmentModule;
        this.listAppsMoreRepositoryProvider = provider;
        this.adsRepositoryProvider = provider2;
    }

    public static FragmentModule_ProvidesListAppsMoreManagerFactory create(FragmentModule fragmentModule, Provider<ListAppsMoreRepository> provider, Provider<AdsRepository> provider2) {
        return new FragmentModule_ProvidesListAppsMoreManagerFactory(fragmentModule, provider, provider2);
    }

    public static ListAppsMoreManager providesListAppsMoreManager(FragmentModule fragmentModule, ListAppsMoreRepository listAppsMoreRepository, AdsRepository adsRepository) {
        ListAppsMoreManager providesListAppsMoreManager = fragmentModule.providesListAppsMoreManager(listAppsMoreRepository, adsRepository);
        C10825c.m36718a(providesListAppsMoreManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesListAppsMoreManager;
    }

    public ListAppsMoreManager get() {
        return providesListAppsMoreManager(this.module, this.listAppsMoreRepositoryProvider.get(), this.adsRepositoryProvider.get());
    }
}
