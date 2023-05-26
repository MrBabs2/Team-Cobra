package p015cm.aptoide.p016pt.app;

import java.util.Collections;
import java.util.List;

/* renamed from: cm.aptoide.pt.app.ReviewRequestResult */
public class ReviewRequestResult {
    private final Error error;
    private final boolean loading;
    private final List<AppReview> reviewList;

    /* renamed from: cm.aptoide.pt.app.ReviewRequestResult$Error */
    public enum Error {
        NETWORK,
        GENERIC
    }

    public ReviewRequestResult(boolean z) {
        this.reviewList = Collections.emptyList();
        this.loading = z;
        this.error = null;
    }

    public Error getError() {
        return this.error;
    }

    public List<AppReview> getReviewList() {
        return this.reviewList;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public ReviewRequestResult(Error error2) {
        this.reviewList = Collections.emptyList();
        this.loading = false;
        this.error = error2;
    }

    public ReviewRequestResult(List<AppReview> list) {
        this.reviewList = list;
        this.loading = false;
        this.error = null;
    }
}
