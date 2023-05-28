package p015cm.aptoide.p016pt.app;

import p123rx.Single;

/* renamed from: cm.aptoide.pt.app.ReviewsManager */
public class ReviewsManager {
    private final ReviewsRepository reviewsRepository;

    public ReviewsManager(ReviewsRepository reviewsRepository2) {
        this.reviewsRepository = reviewsRepository2;
    }

    public Single<ReviewRequestResult> loadReviews(String str, String str2, int i, String str3) {
        return this.reviewsRepository.loadReviews(str, str2, i, str3);
    }
}
