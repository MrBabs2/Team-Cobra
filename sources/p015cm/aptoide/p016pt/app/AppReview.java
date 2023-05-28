package p015cm.aptoide.p016pt.app;

import java.util.Date;

/* renamed from: cm.aptoide.pt.app.AppReview */
public class AppReview {
    private final Date added;
    private final String body;

    /* renamed from: id */
    private final long f3850id;
    private final Date modified;
    private final ReviewComment reviewComment;
    private final ReviewStats reviewStats;
    private final ReviewUser reviewUser;
    private final String title;

    public AppReview(long j, String str, String str2, Date date, Date date2, ReviewStats reviewStats2, ReviewComment reviewComment2, ReviewUser reviewUser2) {
        this.f3850id = j;
        this.title = str;
        this.body = str2;
        this.added = date;
        this.modified = date2;
        this.reviewStats = reviewStats2;
        this.reviewComment = reviewComment2;
        this.reviewUser = reviewUser2;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getBody() {
        return this.body;
    }

    public long getId() {
        return this.f3850id;
    }

    public Date getModified() {
        return this.modified;
    }

    public ReviewComment getReviewComment() {
        return this.reviewComment;
    }

    public ReviewStats getReviewStats() {
        return this.reviewStats;
    }

    public ReviewUser getReviewUser() {
        return this.reviewUser;
    }

    public String getTitle() {
        return this.title;
    }
}
