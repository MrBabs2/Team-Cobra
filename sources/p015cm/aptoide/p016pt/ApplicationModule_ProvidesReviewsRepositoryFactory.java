package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.ReviewsRepository;
import p015cm.aptoide.p016pt.app.ReviewsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesReviewsRepositoryFactory */
public final class ApplicationModule_ProvidesReviewsRepositoryFactory implements C10824b<ReviewsRepository> {
    private final ApplicationModule module;
    private final Provider<ReviewsService> reviewsServiceProvider;

    public ApplicationModule_ProvidesReviewsRepositoryFactory(ApplicationModule applicationModule, Provider<ReviewsService> provider) {
        this.module = applicationModule;
        this.reviewsServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesReviewsRepositoryFactory create(ApplicationModule applicationModule, Provider<ReviewsService> provider) {
        return new ApplicationModule_ProvidesReviewsRepositoryFactory(applicationModule, provider);
    }

    public static ReviewsRepository providesReviewsRepository(ApplicationModule applicationModule, ReviewsService reviewsService) {
        ReviewsRepository providesReviewsRepository = applicationModule.providesReviewsRepository(reviewsService);
        C10825c.m36718a(providesReviewsRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesReviewsRepository;
    }

    public ReviewsRepository get() {
        return providesReviewsRepository(this.module, this.reviewsServiceProvider.get());
    }
}
