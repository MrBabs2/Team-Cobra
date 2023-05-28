package p015cm.aptoide.p016pt.repository.request;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListFullReviewsRequest;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.repository.request.ListFullReviewsRequestFactory */
class ListFullReviewsRequestFactory {
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;

    public ListFullReviewsRequestFactory(BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2) {
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
    }

    public ListFullReviewsRequest newListFullReviews(String str, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials) {
        return ListFullReviewsRequest.ofAction(str, z, storeCredentials, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences);
    }
}
