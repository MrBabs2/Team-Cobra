package p015cm.aptoide.p016pt.repository.request;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.ListStoresRequest;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.repository.request.ListStoresRequestFactory */
class ListStoresRequestFactory {
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;

    public ListStoresRequestFactory(BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2) {
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
    }

    public ListStoresRequest newListStoresRequest(int i, int i2) {
        return ListStoresRequest.ofTopStores(i, i2, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences);
    }

    public ListStoresRequest newListStoresRequest(String str) {
        return ListStoresRequest.ofAction(str, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences);
    }
}
