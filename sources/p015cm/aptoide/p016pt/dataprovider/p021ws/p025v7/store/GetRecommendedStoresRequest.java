package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetRecommendedStoresRequest */
public class GetRecommendedStoresRequest extends C2185V7<ListStores, EndlessBody> {
    private final String url;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetRecommendedStoresRequest$EndlessBody */
    public static class EndlessBody extends BaseBody implements Endless {
        private int limit = 25;
        private int offset;

        public Integer getLimit() {
            return Integer.valueOf(this.limit);
        }

        public int getOffset() {
            return this.offset;
        }

        public void setOffset(int i) {
            this.offset = i;
        }
    }

    public GetRecommendedStoresRequest(String str, EndlessBody endlessBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(endlessBody, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.url = str;
    }

    public static GetRecommendedStoresRequest ofAction(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetRecommendedStoresRequest(str, new EndlessBody(), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<ListStores> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getRecommendedStore(this.url, (EndlessBody) this.body, z);
    }
}
