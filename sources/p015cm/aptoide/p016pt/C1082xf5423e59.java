package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionRemoteRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSearchSuggestionRemoteRepositoryFactory */
public final class C1082xf5423e59 implements C10824b<SearchSuggestionRemoteRepository> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public C1082xf5423e59(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static C1082xf5423e59 create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new C1082xf5423e59(applicationModule, provider);
    }

    public static SearchSuggestionRemoteRepository providesSearchSuggestionRemoteRepository(ApplicationModule applicationModule, Retrofit retrofit) {
        SearchSuggestionRemoteRepository providesSearchSuggestionRemoteRepository = applicationModule.providesSearchSuggestionRemoteRepository(retrofit);
        C10825c.m36718a(providesSearchSuggestionRemoteRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesSearchSuggestionRemoteRepository;
    }

    public SearchSuggestionRemoteRepository get() {
        return providesSearchSuggestionRemoteRepository(this.module, this.retrofitProvider.get());
    }
}
