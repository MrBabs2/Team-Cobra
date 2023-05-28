package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.util.CommentType;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListCommentsRequest */
public class ListCommentsRequest extends C2185V7<ListComments, Body> {
    private static String url;

    private ListCommentsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    private static Body getBody(long j, int i, boolean z, SharedPreferences sharedPreferences) {
        Body body = new Body(i, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), Order.desc);
        if (z) {
            body.setReviewId(Long.valueOf(j));
        } else {
            body.setStoreId(Long.valueOf(j));
        }
        return body;
    }

    /* renamed from: of */
    public static ListCommentsRequest m5261of(String str, long j, int i, BaseRequestWithStore.StoreCredentials storeCredentials, boolean z, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        url = str;
        int i2 = i;
        Body body = new Body(i2, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), Order.desc, storeCredentials.getUsername(), storeCredentials.getPasswordSha1());
        if (z) {
            body.setReviewId(Long.valueOf(j));
        } else {
            body.setStoreId(Long.valueOf(j));
        }
        return new ListCommentsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static ListCommentsRequest ofStoreAction(String str, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        url = str;
        Body body = new Body(z, Order.desc);
        if (storeCredentials != null) {
            body.setStoreUser(storeCredentials.getUsername());
            body.setStorePassSha1(storeCredentials.getPasswordSha1());
            body.setStoreId(storeCredentials.getId());
        }
        return new ListCommentsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static ListCommentsRequest ofTimeline(String str, int i, int i2, boolean z, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        url = str;
        int i3 = i2;
        boolean z2 = z;
        Body body = new Body(i2, z, Order.desc);
        body.setCommentType((CommentType) null);
        int i4 = i;
        body.setOffset(i);
        String str3 = str2;
        body.setTimelineCardId(str2);
        return new ListCommentsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<ListComments> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        if (TextUtils.isEmpty(url)) {
            return interfaces.listComments((Body) this.body, true);
        }
        return interfaces.listComments(url, (Body) this.body, true);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListCommentsRequest$Body */
    public static class Body extends BaseBody implements Endless {
        private String commentType = CommentType.REVIEW.name();
        private Integer limit;
        private int offset;
        private Order order;
        private boolean refresh;
        private Long reviewId;
        private Long storeId;
        @JsonProperty("store_pass_sha1")
        private String storePassSha1;
        @JsonProperty("store_user")
        private String storeUser;
        private long subLimit = 5;
        @JsonProperty("card_uid")
        private String timelineCardId;

        public Body(boolean z, Order order2) {
            this.refresh = z;
            this.order = order2;
        }

        public String getCommentType() {
            return this.commentType;
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

        public Long getReviewId() {
            return this.reviewId;
        }

        public Long getStoreId() {
            return this.storeId;
        }

        public String getStorePassSha1() {
            return this.storePassSha1;
        }

        public String getStoreUser() {
            return this.storeUser;
        }

        public long getSubLimit() {
            return this.subLimit;
        }

        public String getTimelineCardId() {
            return this.timelineCardId;
        }

        public void setCommentType(CommentType commentType2) {
            if (commentType2 == null) {
                this.commentType = null;
            } else {
                this.commentType = commentType2.name();
            }
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setOrder(Order order2) {
            this.order = order2;
        }

        public void setRefresh(boolean z) {
            this.refresh = z;
        }

        public void setReviewId(Long l) {
            this.reviewId = l;
            this.commentType = CommentType.REVIEW.name();
        }

        public void setStoreId(Long l) {
            this.storeId = l;
            this.commentType = CommentType.STORE.name();
        }

        public void setStorePassSha1(String str) {
            this.storePassSha1 = str;
        }

        public void setStoreUser(String str) {
            this.storeUser = str;
        }

        public void setSubLimit(long j) {
            this.subLimit = j;
        }

        public void setTimelineCardId(String str) {
            this.timelineCardId = str;
        }

        public Body(int i, boolean z, Order order2) {
            this.limit = Integer.valueOf(i);
            this.refresh = z;
            this.order = order2;
        }

        public Body(int i, boolean z, Order order2, String str, String str2) {
            this.limit = Integer.valueOf(i);
            this.refresh = z;
            this.order = order2;
            this.storeUser = str;
            this.storePassSha1 = str2;
        }
    }

    /* renamed from: of */
    public static ListCommentsRequest m5259of(long j, int i, int i2, boolean z, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        long j2 = j;
        int i3 = i2;
        boolean z2 = z;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        Body body = getBody(j, i2, z, sharedPreferences2);
        int i4 = i;
        body.setOffset(i);
        return new ListCommentsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences2);
    }

    /* renamed from: of */
    public static ListCommentsRequest m5260of(long j, int i, boolean z, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new ListCommentsRequest(getBody(j, i, z, sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }
}
