package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListReviews;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListReviewsRequest */
public class ListReviewsRequest extends C2185V7<ListReviews, Body> {
    private static final int MAX_COMMENTS = 10;
    private static final int MAX_REVIEWS = 10;

    private ListReviewsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static ListReviewsRequest m5265of(String str, String str2, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str3) {
        return m5264of(str, str2, 10, 10, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, str3);
    }

    public static ListReviewsRequest ofTopReviews(String str, String str2, int i, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str3) {
        return m5264of(str, str2, i, 0, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, str3);
    }

    /* renamed from: of */
    public static ListReviewsRequest m5263of(String str, String str2, int i, int i2, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return m5264of(str, str2, i, i2, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, (String) null);
    }

    /* access modifiers changed from: protected */
    public C5368e<ListReviews> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.listReviews((Body) this.body, true);
    }

    /* renamed from: of */
    public static ListReviewsRequest m5264of(String str, String str2, int i, int i2, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str3) {
        return new ListReviewsRequest(new Body(str, str2, i, i2, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), storeCredentials, str3), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListReviewsRequest$Body */
    public static class Body extends BaseBodyWithStore implements Endless {
        private String lang;
        private String languagesFilterSort;
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

        /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListReviewsRequest$Body$Sort */
        public enum Sort {
            latest,
            points
        }

        public Body(long j, int i, int i2, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials) {
            super(storeCredentials);
            this.storeId = Long.valueOf(j);
            this.limit = Integer.valueOf(i);
            this.subLimit = Integer.valueOf(i2);
            this.refresh = z;
        }

        public String getLang() {
            return this.lang;
        }

        public String getLanguagesFilterSort() {
            return this.languagesFilterSort;
        }

        public Integer getLimit() {
            return this.limit;
        }

        public int getOffset() {
            return this.offset;
        }

        public Order getOrder() {
            return this.order;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public Long getReviewId() {
            return this.reviewId;
        }

        public Sort getSort() {
            return this.sort;
        }

        public Long getStoreId() {
            return this.storeId;
        }

        public String getStoreName() {
            return this.storeName;
        }

        public Integer getSubLimit() {
            return this.subLimit;
        }

        public boolean isMature() {
            return this.mature;
        }

        public void setLang(String str) {
            this.lang = str;
        }

        public void setLanguagesFilterSort(String str) {
            this.languagesFilterSort = str;
        }

        public void setLimit(Integer num) {
            this.limit = num;
        }

        public void setMature(boolean z) {
            this.mature = z;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setOrder(Order order2) {
            this.order = order2;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setRefresh(boolean z) {
            this.refresh = z;
        }

        public void setReviewId(Long l) {
            this.reviewId = l;
        }

        public void setSort(Sort sort2) {
            this.sort = sort2;
        }

        public void setStoreId(Long l) {
            this.storeId = l;
        }

        public void setStoreName(String str) {
            this.storeName = str;
        }

        public void setSubLimit(Integer num) {
            this.subLimit = num;
        }

        public Body(String str, String str2, int i, int i2, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials, String str3) {
            super(storeCredentials);
            this.packageName = str2;
            this.storeName = str;
            this.limit = Integer.valueOf(i);
            this.subLimit = Integer.valueOf(i2);
            this.refresh = z;
            this.languagesFilterSort = str3;
        }
    }
}
