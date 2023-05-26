package p015cm.aptoide.p016pt.search.model;

/* renamed from: cm.aptoide.pt.search.model.SearchAppResultWrapper */
public class SearchAppResultWrapper {
    private int position;
    private String query;
    private SearchAppResult searchAppResult;

    public SearchAppResultWrapper() {
    }

    public int getPosition() {
        return this.position;
    }

    public String getQuery() {
        return this.query;
    }

    public SearchAppResult getSearchAppResult() {
        return this.searchAppResult;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public SearchAppResultWrapper(String str, SearchAppResult searchAppResult2, int i) {
        this.query = str;
        this.searchAppResult = searchAppResult2;
        this.position = i;
    }
}
