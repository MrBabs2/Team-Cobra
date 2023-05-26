package p015cm.aptoide.p016pt.search.view;

import java.util.List;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.search.model.Suggestion;
import p015cm.aptoide.p016pt.search.suggestions.SearchQueryEvent;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.search.view.SearchSuggestionsView */
public interface SearchSuggestionsView extends View {
    void collapseSearchBar(boolean z);

    void focusInSearchBar();

    String getCurrentQuery();

    C5368e<SearchQueryEvent> onQueryTextChanged();

    void setSuggestionsList(List<String> list);

    void setTrendingCursor(List<String> list);

    void setTrendingList(List<Suggestion> list);
}
