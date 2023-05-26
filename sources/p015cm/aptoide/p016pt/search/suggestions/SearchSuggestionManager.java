package p015cm.aptoide.p016pt.search.suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p123rx.C5373h;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.search.suggestions.SearchSuggestionManager */
public class SearchSuggestionManager {
    private final C5373h ioScheduler;
    private final SearchSuggestionService service;
    private final int timeout;
    private final TimeUnit timeoutTimeUnit;

    public SearchSuggestionManager(SearchSuggestionService searchSuggestionService, C5373h hVar) {
        this.service = searchSuggestionService;
        this.ioScheduler = hVar;
        this.timeout = 10;
        this.timeoutTimeUnit = TimeUnit.SECONDS;
    }

    public Single<List<String>> getSuggestionsForApp(String str) {
        return this.service.getAppSuggestionsForQuery(str).mo18553a((long) this.timeout, this.timeoutTimeUnit).mo18563b(this.ioScheduler);
    }

    public Single<List<String>> getSuggestionsForStore(String str) {
        return this.service.getStoreSuggestionsForQuery(str).mo18553a((long) this.timeout, this.timeoutTimeUnit).mo18563b(this.ioScheduler);
    }

    public SearchSuggestionManager(SearchSuggestionService searchSuggestionService, int i, TimeUnit timeUnit, C5373h hVar) {
        this.service = searchSuggestionService;
        this.ioScheduler = hVar;
        this.timeout = i;
        this.timeoutTimeUnit = timeUnit;
    }
}
