package p015cm.aptoide.p016pt.search.model;

import java.util.List;
import p015cm.aptoide.aptoideviews.filters.Filter;
import p015cm.aptoide.p016pt.search.view.SearchResultView;

/* renamed from: cm.aptoide.pt.search.model.SearchViewModel */
public class SearchViewModel implements SearchResultView.Model {
    List<Filter> filters;
    boolean loadedAds;
    boolean loadedResults;
    boolean onlyTrustedApps;
    SearchQueryModel searchQueryModel;
    String storeName;
    private String storeTheme;

    public SearchViewModel() {
        this.loadedAds = false;
        this.loadedResults = false;
    }

    public List<Filter> getFilters() {
        return this.filters;
    }

    public SearchQueryModel getSearchQueryModel() {
        return this.searchQueryModel;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreTheme() {
        return this.storeTheme;
    }

    public boolean hasLoadedAds() {
        return this.loadedAds;
    }

    public boolean hasLoadedResults() {
        return this.loadedResults;
    }

    public void setFilters(List<Filter> list) {
        this.filters = list;
    }

    public void setLoadedResults(boolean z) {
        this.loadedResults = z;
    }

    public SearchViewModel(SearchQueryModel searchQueryModel2, String str, boolean z, String str2) {
        this.loadedAds = false;
        this.loadedResults = false;
        this.searchQueryModel = searchQueryModel2;
        this.storeName = str;
        this.onlyTrustedApps = z;
        this.storeTheme = str2;
    }

    public SearchViewModel(SearchQueryModel searchQueryModel2, boolean z) {
        this(searchQueryModel2, (String) null, z, "");
    }

    public SearchViewModel(SearchQueryModel searchQueryModel2, String str, String str2) {
        this(searchQueryModel2, str, true, str2);
    }
}
