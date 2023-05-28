package p015cm.aptoide.p016pt.search.suggestions;

import java.util.List;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.search.suggestions.SearchSuggestionService */
public class SearchSuggestionService {
    private final SearchSuggestionRemoteRepository repository;

    public SearchSuggestionService(SearchSuggestionRemoteRepository searchSuggestionRemoteRepository) {
        this.repository = searchSuggestionRemoteRepository;
    }

    public Single<List<String>> getAppSuggestionsForQuery(String str) {
        return this.repository.getSuggestionForApp(str).mo18569d(C3995a.f7081f);
    }

    public Single<List<String>> getStoreSuggestionsForQuery(String str) {
        return this.repository.getSuggestionForStore(str).mo18569d(C3996b.f7082f);
    }
}
