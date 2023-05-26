package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetFollowers;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetFollowersRequest;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetFollowingRequest */
public class GetFollowingRequest extends C2185V7<GetFollowers, GetFollowersRequest.Body> {
    protected GetFollowingRequest(GetFollowersRequest.Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static GetFollowingRequest m5255of(BodyInterceptor<BaseBody> bodyInterceptor, Long l, Long l2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        GetFollowersRequest.Body body = new GetFollowersRequest.Body();
        body.setUserId(l);
        body.setStoreId(l2);
        return new GetFollowingRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetFollowers> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getTimelineGetFollowing((GetFollowersRequest.Body) this.body, z);
    }
}
