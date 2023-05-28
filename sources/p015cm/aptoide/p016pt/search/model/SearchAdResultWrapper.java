package p015cm.aptoide.p016pt.search.model;

/* renamed from: cm.aptoide.pt.search.model.SearchAdResultWrapper */
public class SearchAdResultWrapper {
    private int position;
    private SearchAdResult searchAdResult;

    public SearchAdResultWrapper(SearchAdResult searchAdResult2, int i) {
        this.searchAdResult = searchAdResult2;
        this.position = i;
    }

    public int getPosition() {
        return this.position;
    }

    public SearchAdResult getSearchAdResult() {
        return this.searchAdResult;
    }
}
