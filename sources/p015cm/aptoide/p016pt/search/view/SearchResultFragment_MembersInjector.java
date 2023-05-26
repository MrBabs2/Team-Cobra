package p015cm.aptoide.p016pt.search.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.search.view.SearchResultFragment_MembersInjector */
public final class SearchResultFragment_MembersInjector implements C10822a<SearchResultFragment> {
    private final Provider<SearchResultPresenter> searchResultPresenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public SearchResultFragment_MembersInjector(Provider<SearchResultPresenter> provider, Provider<ThemeManager> provider2) {
        this.searchResultPresenterProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static C10822a<SearchResultFragment> create(Provider<SearchResultPresenter> provider, Provider<ThemeManager> provider2) {
        return new SearchResultFragment_MembersInjector(provider, provider2);
    }

    public static void injectSearchResultPresenter(SearchResultFragment searchResultFragment, SearchResultPresenter searchResultPresenter) {
        searchResultFragment.searchResultPresenter = searchResultPresenter;
    }

    public static void injectThemeManager(SearchResultFragment searchResultFragment, ThemeManager themeManager) {
        searchResultFragment.themeManager = themeManager;
    }

    public void injectMembers(SearchResultFragment searchResultFragment) {
        injectSearchResultPresenter(searchResultFragment, this.searchResultPresenterProvider.get());
        injectThemeManager(searchResultFragment, this.themeManagerProvider.get());
    }
}
