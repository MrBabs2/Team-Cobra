package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.ReviewsManager;
import p015cm.aptoide.p016pt.app.ReviewsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesReviewsManagerFactory */
public final class ApplicationModule_ProvidesReviewsManagerFactory implements C10824b<ReviewsManager> {
    private final ApplicationModule module;
    private final Provider<ReviewsRepository> reviewsRepositoryProvider;

    public ApplicationModule_ProvidesReviewsManagerFactory(ApplicationModule applicationModule, Provider<ReviewsRepository> provider) {
        this.module = applicationModule;
        this.reviewsRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesReviewsManagerFactory create(ApplicationModule applicationModule, Provider<ReviewsRepository> provider) {
        return new ApplicationModule_ProvidesReviewsManagerFactory(applicationModule, provider);
    }

    public static ReviewsManager providesReviewsManager(ApplicationModule applicationModule, ReviewsRepository reviewsRepository) {
        ReviewsManager providesReviewsManager = applicationModule.providesReviewsManager(reviewsRepository);
        C10825c.m36718a(providesReviewsManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesReviewsManager;
    }

    public ReviewsManager get() {
        return providesReviewsManager(this.module, this.reviewsRepositoryProvider.get());
    }
}
