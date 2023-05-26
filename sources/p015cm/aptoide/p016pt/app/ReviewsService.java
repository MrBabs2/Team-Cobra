package p015cm.aptoide.p016pt.app;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.app.ReviewRequestResult;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListReviews;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Review;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListReviewsRequest;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5377a;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.app.ReviewsService */
public class ReviewsService {
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private boolean loading;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;

    public ReviewsService(StoreCredentialsProvider storeCredentialsProvider2, BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2) {
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
    }

    /* access modifiers changed from: private */
    /* renamed from: createReviewRequestResultError */
    public ReviewRequestResult mo7082a(Throwable th) {
        if (th instanceof NoNetworkConnectionException) {
            return new ReviewRequestResult(ReviewRequestResult.Error.NETWORK);
        }
        return new ReviewRequestResult(ReviewRequestResult.Error.GENERIC);
    }

    private List<AppReview> map(List<Review> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Review next : list) {
                Review.Stats stats = next.getStats();
                Review.User user = next.getUser();
                arrayList.add(new AppReview(next.getId(), next.getTitle(), next.getBody(), next.getAdded(), next.getModified(), new ReviewStats(stats.getComments(), stats.getLikes(), stats.getPoints(), stats.getRating()), new ReviewComment(next.getComments().getView(), next.getComments().getTotal()), new ReviewUser(user.getId(), user.getAvatar(), user.getName())));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: mapListReviews */
    public C5368e<ReviewRequestResult> mo7083a(ListReviews listReviews) {
        if (listReviews.isOk()) {
            return C5368e.m10257c(new ReviewRequestResult(map(listReviews.getDataList().getList())));
        }
        return C5368e.m10238a((Throwable) new IllegalStateException("Could not obtain request from server."));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7084a() {
        this.loading = true;
    }

    /* renamed from: b */
    public /* synthetic */ void mo7085b() {
        this.loading = false;
    }

    /* renamed from: c */
    public /* synthetic */ void mo7086c() {
        this.loading = false;
    }

    public Single<ReviewRequestResult> loadReviews(String str, String str2, int i, String str3) {
        if (this.loading) {
            return Single.m10119a(new ReviewRequestResult(true));
        }
        return ListReviewsRequest.ofTopReviews(str, str2, i, this.storeCredentialsProvider.get(str), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, str3).observe().mo18663b((C5377a) new C1427u0(this)).mo18680d((C5377a) new C1940w0(this)).mo18673c((C5377a) new C1425t0(this)).mo18687f(new C1942x0(this)).mo18700m().mo18571f(new C1429v0(this));
    }
}
