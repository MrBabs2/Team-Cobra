package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.download.view.DownloadStatusManager;
import p015cm.aptoide.p016pt.search.SearchManager;
import p015cm.aptoide.p016pt.search.SearchRepository;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesSearchManagerFactory */
public final class FragmentModule_ProvidesSearchManagerFactory implements C10824b<SearchManager> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AppCenter> appCenterProvider;
    private final Provider<DownloadStatusManager> downloadStatusManagerProvider;
    private final FragmentModule module;
    private final Provider<SearchRepository> searchRepositoryProvider;

    public FragmentModule_ProvidesSearchManagerFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<SearchRepository> provider2, Provider<DownloadStatusManager> provider3, Provider<AppCenter> provider4) {
        this.module = fragmentModule;
        this.accountManagerProvider = provider;
        this.searchRepositoryProvider = provider2;
        this.downloadStatusManagerProvider = provider3;
        this.appCenterProvider = provider4;
    }

    public static FragmentModule_ProvidesSearchManagerFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<SearchRepository> provider2, Provider<DownloadStatusManager> provider3, Provider<AppCenter> provider4) {
        return new FragmentModule_ProvidesSearchManagerFactory(fragmentModule, provider, provider2, provider3, provider4);
    }

    public static SearchManager providesSearchManager(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, SearchRepository searchRepository, DownloadStatusManager downloadStatusManager, AppCenter appCenter) {
        SearchManager providesSearchManager = fragmentModule.providesSearchManager(aptoideAccountManager, searchRepository, downloadStatusManager, appCenter);
        C10825c.m36718a(providesSearchManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesSearchManager;
    }

    public SearchManager get() {
        return providesSearchManager(this.module, this.accountManagerProvider.get(), this.searchRepositoryProvider.get(), this.downloadStatusManagerProvider.get(), this.appCenterProvider.get());
    }
}
