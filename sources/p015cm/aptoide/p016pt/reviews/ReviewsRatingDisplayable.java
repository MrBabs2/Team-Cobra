package p015cm.aptoide.p016pt.reviews;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.reviews.ReviewsRatingDisplayable */
public class ReviewsRatingDisplayable extends Displayable {
    private GetAppMeta.App appMeta;

    public ReviewsRatingDisplayable() {
    }

    public GetAppMeta.App getAppMeta() {
        return this.appMeta;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getViewLayout() {
        return C1086R.layout.reviews_rating_displayable;
    }

    public ReviewsRatingDisplayable(GetAppMeta.App app) {
        this.appMeta = app;
    }
}
