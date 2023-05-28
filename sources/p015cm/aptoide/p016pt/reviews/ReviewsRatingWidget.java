package p015cm.aptoide.p016pt.reviews;

import android.view.View;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;

/* renamed from: cm.aptoide.pt.reviews.ReviewsRatingWidget */
public class ReviewsRatingWidget extends Widget<ReviewsRatingDisplayable> {
    private RatingBarsLayout ratingBarsLayout;
    private RatingTotalsLayout ratingTotalsLayout;

    public ReviewsRatingWidget(View view) {
        super(view);
    }

    private void setupRating(GetAppMeta.App app) {
        this.ratingTotalsLayout.setup(app.getStats().getGlobalRating());
        this.ratingBarsLayout.setup(app.getStats().getGlobalRating());
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.ratingTotalsLayout = new RatingTotalsLayout(view);
        this.ratingBarsLayout = new RatingBarsLayout(view);
    }

    public void bindView(ReviewsRatingDisplayable reviewsRatingDisplayable, int i) {
        setupRating(reviewsRatingDisplayable.getAppMeta());
    }
}
