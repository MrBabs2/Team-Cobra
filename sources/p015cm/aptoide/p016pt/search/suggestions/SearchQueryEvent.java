package p015cm.aptoide.p016pt.search.suggestions;

/* renamed from: cm.aptoide.pt.search.suggestions.SearchQueryEvent */
public class SearchQueryEvent {
    private final boolean isSubmitted;
    private final boolean isSuggestion;
    private final int position;
    private final String query;

    public SearchQueryEvent(String str, boolean z) {
        this(str, 0, z, false);
    }

    public int getPosition() {
        return this.position;
    }

    public String getQuery() {
        return this.query;
    }

    public boolean hasQuery() {
        String str = this.query;
        return str != null && !str.isEmpty();
    }

    public boolean isSubmitted() {
        return this.isSubmitted;
    }

    public boolean isSuggestion() {
        return this.isSuggestion;
    }

    public SearchQueryEvent(String str, int i, boolean z, boolean z2) {
        this.query = str;
        this.position = i;
        this.isSubmitted = z;
        this.isSuggestion = z2;
    }
}
