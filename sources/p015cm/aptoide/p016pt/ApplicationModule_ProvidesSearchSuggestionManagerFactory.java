package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionManager;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionRemoteRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSearchSuggestionManagerFactory */
public final class ApplicationModule_ProvidesSearchSuggestionManagerFactory implements C10824b<SearchSuggestionManager> {
    private final ApplicationModule module;
    private final Provider<SearchSuggestionRemoteRepository> remoteRepositoryProvider;

    public ApplicationModule_ProvidesSearchSuggestionManagerFactory(ApplicationModule applicationModule, Provider<SearchSuggestionRemoteRepository> provider) {
        this.module = applicationModule;
        this.remoteRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesSearchSuggestionManagerFactory create(ApplicationModule applicationModule, Provider<SearchSuggestionRemoteRepository> provider) {
        return new ApplicationModule_ProvidesSearchSuggestionManagerFactory(applicationModule, provider);
    }

    public static SearchSuggestionManager providesSearchSuggestionManager(ApplicationModule applicationModule, SearchSuggestionRemoteRepository searchSuggestionRemoteRepository) {
        SearchSuggestionManager providesSearchSuggestionManager = applicationModule.providesSearchSuggestionManager(searchSuggestionRemoteRepository);
        C10825c.m36718a(providesSearchSuggestionManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesSearchSuggestionManager;
    }

    public SearchSuggestionManager get() {
        return providesSearchSuggestionManager(this.module, this.remoteRepositoryProvider.get());
    }
}
