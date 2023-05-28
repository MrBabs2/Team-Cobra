package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.search.suggestions.TrendingManager;
import p015cm.aptoide.p016pt.search.suggestions.TrendingService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesTrendingManagerFactory */
public final class ApplicationModule_ProvidesTrendingManagerFactory implements C10824b<TrendingManager> {
    private final ApplicationModule module;
    private final Provider<TrendingService> trendingServiceProvider;

    public ApplicationModule_ProvidesTrendingManagerFactory(ApplicationModule applicationModule, Provider<TrendingService> provider) {
        this.module = applicationModule;
        this.trendingServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesTrendingManagerFactory create(ApplicationModule applicationModule, Provider<TrendingService> provider) {
        return new ApplicationModule_ProvidesTrendingManagerFactory(applicationModule, provider);
    }

    public static TrendingManager providesTrendingManager(ApplicationModule applicationModule, TrendingService trendingService) {
        TrendingManager providesTrendingManager = applicationModule.providesTrendingManager(trendingService);
        C10825c.m36718a(providesTrendingManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesTrendingManager;
    }

    public TrendingManager get() {
        return providesTrendingManager(this.module, this.trendingServiceProvider.get());
    }
}
