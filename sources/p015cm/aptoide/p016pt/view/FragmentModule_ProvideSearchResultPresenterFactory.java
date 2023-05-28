package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.download.view.DownloadViewActionPresenter;
import p015cm.aptoide.p016pt.search.SearchManager;
import p015cm.aptoide.p016pt.search.SearchNavigator;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionManager;
import p015cm.aptoide.p016pt.search.suggestions.TrendingManager;
import p015cm.aptoide.p016pt.search.view.SearchResultPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideSearchResultPresenterFactory */
public final class FragmentModule_ProvideSearchResultPresenterFactory implements C10824b<SearchResultPresenter> {
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<DownloadViewActionPresenter> downloadViewActionPresenterProvider;
    private final FragmentModule module;
    private final Provider<SearchAnalytics> searchAnalyticsProvider;
    private final Provider<SearchManager> searchManagerProvider;
    private final Provider<SearchNavigator> searchNavigatorProvider;
    private final Provider<SearchSuggestionManager> searchSuggestionManagerProvider;
    private final Provider<TrendingManager> trendingManagerProvider;

    public FragmentModule_ProvideSearchResultPresenterFactory(FragmentModule fragmentModule, Provider<SearchAnalytics> provider, Provider<SearchNavigator> provider2, Provider<SearchManager> provider3, Provider<TrendingManager> provider4, Provider<SearchSuggestionManager> provider5, Provider<BottomNavigationMapper> provider6, Provider<DownloadViewActionPresenter> provider7) {
        this.module = fragmentModule;
        this.searchAnalyticsProvider = provider;
        this.searchNavigatorProvider = provider2;
        this.searchManagerProvider = provider3;
        this.trendingManagerProvider = provider4;
        this.searchSuggestionManagerProvider = provider5;
        this.bottomNavigationMapperProvider = provider6;
        this.downloadViewActionPresenterProvider = provider7;
    }

    public static FragmentModule_ProvideSearchResultPresenterFactory create(FragmentModule fragmentModule, Provider<SearchAnalytics> provider, Provider<SearchNavigator> provider2, Provider<SearchManager> provider3, Provider<TrendingManager> provider4, Provider<SearchSuggestionManager> provider5, Provider<BottomNavigationMapper> provider6, Provider<DownloadViewActionPresenter> provider7) {
        return new FragmentModule_ProvideSearchResultPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static SearchResultPresenter provideSearchResultPresenter(FragmentModule fragmentModule, SearchAnalytics searchAnalytics, SearchNavigator searchNavigator, SearchManager searchManager, TrendingManager trendingManager, SearchSuggestionManager searchSuggestionManager, BottomNavigationMapper bottomNavigationMapper, DownloadViewActionPresenter downloadViewActionPresenter) {
        SearchResultPresenter provideSearchResultPresenter = fragmentModule.provideSearchResultPresenter(searchAnalytics, searchNavigator, searchManager, trendingManager, searchSuggestionManager, bottomNavigationMapper, downloadViewActionPresenter);
        C10825c.m36718a(provideSearchResultPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return provideSearchResultPresenter;
    }

    public SearchResultPresenter get() {
        return provideSearchResultPresenter(this.module, this.searchAnalyticsProvider.get(), this.searchNavigatorProvider.get(), this.searchManagerProvider.get(), this.trendingManagerProvider.get(), this.searchSuggestionManagerProvider.get(), this.bottomNavigationMapperProvider.get(), this.downloadViewActionPresenterProvider.get());
    }
}
