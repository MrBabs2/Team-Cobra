package p015cm.aptoide.p016pt.editorial;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.EditorialCard;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.editorial.EditorialRequest */
public class EditorialRequest extends C2185V7<EditorialCard, BaseBody> {
    private final String cardId;
    private final String slug;

    public EditorialRequest(BaseBody baseBody, String str, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.cardId = str;
        this.slug = str2;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7.20181019/");
        return sb.toString();
    }

    public static EditorialRequest ofWithCardId(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new EditorialRequest(new BaseBody(), str, "", bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static EditorialRequest ofWithSlug(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new EditorialRequest(new BaseBody(), "", str, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<EditorialCard> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        if (!"".equals(this.slug)) {
            return interfaces.getEditorialFromSlug(this.slug, (BaseBody) this.body, true);
        }
        return interfaces.getEditorialFromCardId(this.cardId, (BaseBody) this.body, true);
    }
}
