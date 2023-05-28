package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SimpleSetStoreRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.RequestBodyFactory;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SetStoreImageRequest */
public class SetStoreImageRequest extends C2185V7<BaseV7Response, HashMapNotNull<String, RequestBody>> {
    private final MultipartBody.Part multipartBody;

    private SetStoreImageRequest(HashMapNotNull<String, RequestBody> hashMapNotNull, MultipartBody.Part part, BodyInterceptor<HashMapNotNull<String, RequestBody>> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator) {
        super(hashMapNotNull, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.multipartBody = part;
    }

    private static void addStoreProperties(String str, String str2, RequestBodyFactory requestBodyFactory, ObjectMapper objectMapper, HashMapNotNull<String, RequestBody> hashMapNotNull) {
        try {
            hashMapNotNull.put("store_properties", requestBodyFactory.createBodyPartFromString(objectMapper.writeValueAsString(new SimpleSetStoreRequest.StoreProperties(str, str2))));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_WRITE_V7_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* renamed from: of */
    public static SetStoreImageRequest m5272of(String str, String str2, String str3, String str4, BodyInterceptor<HashMapNotNull<String, RequestBody>> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, RequestBodyFactory requestBodyFactory, ObjectMapper objectMapper, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator) {
        RequestBodyFactory requestBodyFactory2 = requestBodyFactory;
        HashMapNotNull hashMapNotNull = new HashMapNotNull();
        String str5 = str;
        hashMapNotNull.put("store_name", requestBodyFactory2.createBodyPartFromString(str));
        String str6 = str2;
        String str7 = str3;
        addStoreProperties(str2, str3, requestBodyFactory2, objectMapper, hashMapNotNull);
        String str8 = str4;
        return new SetStoreImageRequest(hashMapNotNull, requestBodyFactory2.createBodyPartFromFile("store_avatar", new File(str4)), bodyInterceptor, okHttpClient, factory, sharedPreferences, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.editStore(this.multipartBody, (HashMapNotNull) this.body);
    }
}
