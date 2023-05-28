package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.home.GetActionItemRequest */
public class GetActionItemRequest extends C2185V7<ActionItemResponse, Body> {
    private final String url;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.home.GetActionItemRequest$Body */
    public static class Body extends BaseBody {
    }

    public GetActionItemRequest(String str, Body body, SharedPreferences sharedPreferences, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.url = str;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7.20181019/");
        return sb.toString();
    }

    public static GetActionItemRequest ofAction(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetActionItemRequest(str, new Body(), sharedPreferences, bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<ActionItemResponse> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getActionItem(this.url, (Body) this.body, z);
    }
}
