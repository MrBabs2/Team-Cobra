package p015cm.aptoide.p016pt.search.model;

import p015cm.aptoide.p016pt.search.view.SearchResultView;

/* renamed from: cm.aptoide.pt.search.model.SearchResultCount */
public class SearchResultCount {
    private int resultCount;
    private SearchResultView.Model searchResultViewModel;

    public SearchResultCount(int i, SearchResultView.Model model) {
        this.resultCount = i;
        this.searchResultViewModel = model;
    }

    public int getResultCount() {
        return this.resultCount;
    }

    public SearchResultView.Model getSearchResultViewModel() {
        return this.searchResultViewModel;
    }

    public void setResultCount(int i) {
        this.resultCount = i;
    }

    public void setSearchResultViewModel(SearchResultView.Model model) {
        this.searchResultViewModel = model;
    }
}
