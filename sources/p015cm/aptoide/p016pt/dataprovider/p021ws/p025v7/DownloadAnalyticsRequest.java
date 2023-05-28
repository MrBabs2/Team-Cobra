package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.analyticsbody.DownloadInstallAnalyticsBaseBody;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.DownloadAnalyticsRequest */
public class DownloadAnalyticsRequest extends C2185V7<BaseV7Response, DownloadInstallAnalyticsBaseBody> {
    private String action;
    private String context;
    private String name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected DownloadAnalyticsRequest(DownloadInstallAnalyticsBaseBody downloadInstallAnalyticsBaseBody, String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(downloadInstallAnalyticsBaseBody, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.action = str;
        this.name = str2;
        this.context = str3;
    }

    /* renamed from: of */
    public static DownloadAnalyticsRequest m5248of(DownloadInstallAnalyticsBaseBody downloadInstallAnalyticsBaseBody, String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new DownloadAnalyticsRequest(downloadInstallAnalyticsBaseBody, str, str2, str3, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.addEvent(this.name, this.action, this.context, (DownloadInstallAnalyticsBaseBody) this.body);
    }
}
