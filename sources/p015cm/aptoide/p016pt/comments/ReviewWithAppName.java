package p015cm.aptoide.p016pt.comments;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Review;

/* renamed from: cm.aptoide.pt.comments.ReviewWithAppName */
public final class ReviewWithAppName {
    private final String appName;
    private final Review review;

    public ReviewWithAppName(String str, Review review2) {
        this.appName = str;
        this.review = review2;
    }

    public String getAppName() {
        return this.appName;
    }

    public Review getReview() {
        return this.review;
    }
}
