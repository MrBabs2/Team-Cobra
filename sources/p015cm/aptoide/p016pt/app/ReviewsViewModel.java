package p015cm.aptoide.p016pt.app;

import java.util.List;
import p015cm.aptoide.p016pt.app.ReviewRequestResult;

/* renamed from: cm.aptoide.pt.app.ReviewsViewModel */
public class ReviewsViewModel {
    private final ReviewRequestResult.Error error;
    private final boolean loading;
    private final List<AppReview> reviewsList;

    public ReviewsViewModel(List<AppReview> list, boolean z, ReviewRequestResult.Error error2) {
        this.reviewsList = list;
        this.loading = z;
        this.error = error2;
    }

    public ReviewRequestResult.Error getError() {
        return this.error;
    }

    public List<AppReview> getReviewsList() {
        return this.reviewsList;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public boolean isLoading() {
        return this.loading;
    }
}
