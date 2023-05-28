package p015cm.aptoide.p016pt.comments;

import android.content.SharedPreferences;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.comments.view.CommentsAdapter;
import p015cm.aptoide.p016pt.comments.view.ConcreteItemCommentAdder;
import p015cm.aptoide.p016pt.comments.view.RateAndReviewCommentDisplayable;
import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListReviews;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Review;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListCommentsRequest;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.comments.ListFullReviewsSuccessRequestListener */
public class ListFullReviewsSuccessRequestListener implements SuccessRequestListener<ListReviews> {
    private final BodyInterceptor<BaseBody> bodyBodyInterceptor;
    private final Converter.Factory converterFactory;
    private final RateAndReviewsFragment fragment;
    private final OkHttpClient httpClient;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;
    private final UserFeedbackAnalytics userFeedbackAnalytics;

    public ListFullReviewsSuccessRequestListener(RateAndReviewsFragment rateAndReviewsFragment, StoreCredentialsProvider storeCredentialsProvider2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, UserFeedbackAnalytics userFeedbackAnalytics2) {
        this.fragment = rateAndReviewsFragment;
        this.httpClient = okHttpClient;
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.bodyBodyInterceptor = bodyInterceptor;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.userFeedbackAnalytics = userFeedbackAnalytics2;
    }

    private void addRateAndReviewDisplayables(List<Review> list, List<Displayable> list2) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        for (Review next : list) {
            list2.add(new RateAndReviewCommentDisplayable(new ReviewWithAppName(this.fragment.getAppName(), next), new ConcreteItemCommentAdder(i3, this.fragment, next), next.getCommentList().getTotal(), this.userFeedbackAnalytics));
            if (next.getId() == this.fragment.getReviewId()) {
                i2 = i3;
            }
            if (!(next.getCommentList() == null || next.getCommentList().getDataList() == null || next.getCommentList().getDataList().getLimit() == null)) {
                this.fragment.createDisplayableComments(next.getCommentList().getDataList().getList(), list2);
                if (next.getCommentList().getDataList().getList().size() > 2) {
                    list2.add(this.fragment.createReadMoreDisplayable(i3, next));
                }
            }
            i3++;
        }
        if (((CommentsAdapter) this.fragment.getAdapter()).getItemCount() != 0) {
            i = i2;
        }
        this.fragment.checkAndRemoveProgressBarDisplayable();
        this.fragment.addDisplayables(list2);
        if (i >= 0) {
            this.fragment.getLayoutManager().scrollToPosition(((CommentsAdapter) this.fragment.getAdapter()).getItemPosition(i));
        }
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7911a(Review review) {
        return ListCommentsRequest.m5261of(review.getComments().getView(), review.getId(), 3, StoreUtils.getStoreCredentials(this.fragment.getStoreName(), this.storeCredentialsProvider), true, this.bodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().mo18662b(Schedulers.m10352io()).mo18694j(new C1958c(review));
    }

    public void call(ListReviews listReviews) {
        List list = listReviews.getDataList().getList();
        C5368e.m10234a(list).mo18687f(new C1959d(this)).mo18698l().mo18644a(C5376a.m10346b()).mo18641a(this.fragment.bindUntilEvent(C9008b.DESTROY_VIEW)).mo18655a(new C1957b(this, list, new LinkedList()), (C5378b<Throwable>) C1956a.f4566f);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7912a(List list, List list2, List list3) {
        addRateAndReviewDisplayables(list, list2);
    }
}
