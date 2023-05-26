package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetFollowers;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetFollowersRequest */
public class GetFollowersRequest extends C2185V7<GetFollowers, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetFollowersRequest$Body */
    public static class Body extends BaseBody implements Endless {
        private int limit = 25;
        private int offset;
        private Long storeId;
        private Long userId;

        public Integer getLimit() {
            return Integer.valueOf(this.limit);
        }

        public int getOffset() {
            return this.offset;
        }

        public Long getStoreId() {
            return this.storeId;
        }

        public Long getUserId() {
            return this.userId;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setStoreId(Long l) {
            this.storeId = l;
        }

        public void setUserId(Long l) {
            this.userId = l;
        }
    }

    protected GetFollowersRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static GetFollowersRequest m5254of(BodyInterceptor<BaseBody> bodyInterceptor, Long l, Long l2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        Body body = new Body();
        body.setUserId(l);
        body.setStoreId(l2);
        return new GetFollowersRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetFollowers> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getTimelineFollowers((Body) this.body, z);
    }
}
