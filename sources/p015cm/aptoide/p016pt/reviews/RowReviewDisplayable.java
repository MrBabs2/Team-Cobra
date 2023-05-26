package p015cm.aptoide.p016pt.reviews;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.FullReview;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.reviews.RowReviewDisplayable */
public class RowReviewDisplayable extends DisplayablePojo<FullReview> {
    private StoreAnalytics storeAnalytics;

    public RowReviewDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    public StoreAnalytics getStoreAnalytics() {
        return this.storeAnalytics;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_row_review;
    }

    public RowReviewDisplayable(FullReview fullReview, StoreAnalytics storeAnalytics2) {
        super(fullReview);
        this.storeAnalytics = storeAnalytics2;
    }
}
