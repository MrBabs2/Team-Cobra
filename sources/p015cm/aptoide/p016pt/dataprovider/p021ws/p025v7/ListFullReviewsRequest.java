package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListFullReviews;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListFullReviewsRequest */
public class ListFullReviewsRequest extends C2185V7<ListFullReviews, Body> {
    private static final int MAX_COMMENTS = 10;
    private static final int MAX_REVIEWS = 10;
    private String url;

    protected ListFullReviewsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static ListFullReviewsRequest m5262of(long j, int i, int i2, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new ListFullReviewsRequest(new Body(j, i, i2, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), storeCredentials), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static ListFullReviewsRequest ofAction(String str, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        String str2 = str;
        boolean z2 = z;
        BaseRequestWithStore.StoreCredentials storeCredentials2 = storeCredentials;
        return new ListFullReviewsRequest(str.replace("listFullReviews", ""), new Body(z, storeCredentials), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListFullReviewsRequest$Body */
    public static class Body extends BaseBodyWithStore implements Endless {
        private String lang;
        private Integer limit;
        private boolean mature;
        private int offset;
        private Order order;
        private String packageName;
        private boolean refresh;
        private Long reviewId;
        private Sort sort;
        private Long storeId;
        private String storeName;
        private Integer subLimit;

        /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListFullReviewsRequest$Body$Sort */
        public enum Sort {
            latest,
            points
        }

        public Body(boolean z, BaseRequestWithStore.StoreCredentials storeCredentials) {
            super(storeCredentials);
            this.refresh = z;
        }

        public Integer getLimit() {
            return this.limit;
        }

        public int getOffset() {
            return this.offset;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public Body(long j, int i, int i2, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials) {
            super(storeCredentials);
            this.storeId = Long.valueOf(j);
            this.limit = Integer.valueOf(i);
            this.offset = i2;
            this.refresh = z;
        }

        public Body(String str, String str2, int i, int i2, boolean z) {
            this.packageName = str2;
            this.storeName = str;
            this.limit = Integer.valueOf(i);
            this.subLimit = Integer.valueOf(i2);
            this.refresh = z;
        }
    }

    public ListFullReviewsRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        this(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
        this.url = str;
    }

    /* access modifiers changed from: protected */
    public C5368e<ListFullReviews> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        if (TextUtils.isEmpty(this.url)) {
            return interfaces.listFullReviews((Body) this.body, z);
        }
        return interfaces.listFullReviews(this.url, (Body) this.body, z);
    }
}
