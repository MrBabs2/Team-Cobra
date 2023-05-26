package p015cm.aptoide.p016pt.reviews;

import android.view.View;
import android.widget.Spinner;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;

/* renamed from: cm.aptoide.pt.reviews.ReviewsLanguageFilterWidget */
public class ReviewsLanguageFilterWidget extends Widget<ReviewsLanguageFilterDisplayable> {
    private Spinner spinner;

    public ReviewsLanguageFilterWidget(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.spinner = (Spinner) view.findViewById(C1086R.C1088id.comments_filter_language_spinner);
    }

    public void bindView(ReviewsLanguageFilterDisplayable reviewsLanguageFilterDisplayable, int i) {
        reviewsLanguageFilterDisplayable.setup(this.spinner);
    }
}
