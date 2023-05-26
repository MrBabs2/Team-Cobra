package p015cm.aptoide.p016pt.app;

import p123rx.Single;

/* renamed from: cm.aptoide.pt.app.ReviewsRepository */
public class ReviewsRepository {
    private final ReviewsService reviewsService;

    public ReviewsRepository(ReviewsService reviewsService2) {
        this.reviewsService = reviewsService2;
    }

    public Single<ReviewRequestResult> loadReviews(String str, String str2, int i, String str3) {
        return this.reviewsService.loadReviews(str, str2, i, str3);
    }
}
