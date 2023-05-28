package p015cm.aptoide.p016pt.reviews;

import p015cm.aptoide.p016pt.reviews.LanguageFilterHelper;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;

/* renamed from: cm.aptoide.pt.reviews.g */
/* compiled from: lambda */
public final /* synthetic */ class C3966g implements EndlessRecyclerOnScrollListener.OnEndlessFinish {

    /* renamed from: a */
    private final /* synthetic */ RateAndReviewsFragment f7057a;

    /* renamed from: b */
    private final /* synthetic */ LanguageFilterHelper.LanguageFilter f7058b;

    public /* synthetic */ C3966g(RateAndReviewsFragment rateAndReviewsFragment, LanguageFilterHelper.LanguageFilter languageFilter) {
        this.f7057a = rateAndReviewsFragment;
        this.f7058b = languageFilter;
    }

    public final void onEndlessFinish(EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener) {
        this.f7057a.mo14018a(this.f7058b, endlessRecyclerOnScrollListener);
    }
}
