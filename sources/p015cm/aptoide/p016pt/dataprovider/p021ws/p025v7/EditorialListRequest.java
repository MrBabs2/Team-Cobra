package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.EditorialListRequest */
public class EditorialListRequest extends C2185V7<EditorialListResponse, Body> {
    private final int limit;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.EditorialListRequest$Body */
    public static class Body extends BaseBody implements Endless {
        private int limit;
        private int offset;

        public Body(int i, int i2) {
            this.limit = i;
            this.offset = i2;
        }

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

    protected EditorialListRequest(Body body, String str, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, int i) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.limit = i;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7.20181019/");
        return sb.toString();
    }

    /* renamed from: of */
    public static EditorialListRequest m5249of(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, int i, int i2) {
        return new EditorialListRequest(new Body(i, i2), getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator, i);
    }

    /* access modifiers changed from: protected */
    public C5368e<EditorialListResponse> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getEditorialList(this.limit, (Body) this.body);
    }
}
