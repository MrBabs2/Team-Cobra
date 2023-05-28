package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetRecommendedRequest */
public class GetRecommendedRequest extends C2185V7<ListApps, Body> {
    public GetRecommendedRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_CACHE_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public C5368e<ListApps> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getRecommended(z ? "no-cache" : null, getQueryStringMapper().map((Body) this.body));
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetRecommendedRequest$Body */
    public static class Body extends BaseBody implements Endless {
        private Integer limit;
        private int offset;
        private String packageName;
        private String section;

        public Body(int i, String str) {
            this.limit = Integer.valueOf(i);
            this.packageName = str;
        }

        public Integer getLimit() {
            return this.limit;
        }

        public int getOffset() {
            return this.offset;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getSection() {
            return this.section;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setSection(String str) {
            this.section = str;
        }

        public Body(int i, String str, String str2) {
            this.limit = Integer.valueOf(i);
            this.packageName = str;
            this.section = str2;
        }
    }
}
