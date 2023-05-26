package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.TimelineStats;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetTimelineStatsRequest */
public class GetTimelineStatsRequest extends C2185V7<TimelineStats, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetTimelineStatsRequest$Body */
    public static class Body extends BaseBody {
        private Long userId;

        public Body(Long l) {
            this.userId = l;
        }

        public Long getUserId() {
            return this.userId;
        }

        public void setUserId(Long l) {
            this.userId = l;
        }
    }

    protected GetTimelineStatsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static GetTimelineStatsRequest m5256of(BodyInterceptor<BaseBody> bodyInterceptor, Long l, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetTimelineStatsRequest(new Body(l), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<TimelineStats> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getTimelineStats((Body) this.body, z);
    }
}
