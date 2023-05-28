package p015cm.aptoide.p016pt.dataprovider.p021ws.p022v1;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v1.PnpV1WebService */
public abstract class PnpV1WebService<U> extends WebService<Service, U> {
    protected PnpV1WebService(OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences) {
        super(Service.class, okHttpClient, factory, getHost(sharedPreferences));
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_NOTIFICATION_HOST);
        sb.append("/pnp/v1/");
        return sb.toString();
    }
}
