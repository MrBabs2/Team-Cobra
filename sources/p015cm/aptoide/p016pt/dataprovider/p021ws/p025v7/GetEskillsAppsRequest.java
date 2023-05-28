package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetEskillsAppsRequest */
public class GetEskillsAppsRequest extends C2185V7<ListApps, BaseBody> {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final String url;

    public GetEskillsAppsRequest(String str, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        super(new BaseBody(), C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
        this.url = str.contains("listApps") ? str.split("listApps/")[1] : str;
    }

    /* access modifiers changed from: protected */
    public C5368e<ListApps> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getEskillsApps(z, this.url, this.appBundlesVisibilityManager.shouldEnableAppBundles());
    }
}
