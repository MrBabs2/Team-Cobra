package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SetUserRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.RequestBodyFactory;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SetUserMultipartRequest */
public class SetUserMultipartRequest extends C2185V7<BaseV7Response, HashMapNotNull<String, RequestBody>> {
    private final MultipartBody.Part multipartBody;

    private SetUserMultipartRequest(MultipartBody.Part part, HashMapNotNull<String, RequestBody> hashMapNotNull, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super(hashMapNotNull, getHost(), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.multipartBody = part;
    }

    public static String getHost() {
        return "https://ws75-primary.aptoide.com/api/7/";
    }

    /* renamed from: of */
    public static SetUserMultipartRequest m5273of(String str, String str2, BodyInterceptor<HashMapNotNull<String, RequestBody>> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, ObjectMapper objectMapper, TokenInvalidator tokenInvalidator) {
        RequestBodyFactory requestBodyFactory = new RequestBodyFactory();
        HashMapNotNull hashMapNotNull = new HashMapNotNull();
        try {
            hashMapNotNull.put("user_properties", requestBodyFactory.createBodyPartFromString(objectMapper.writeValueAsString(new SetUserRequest.UserProperties(str))));
            return new SetUserMultipartRequest(requestBodyFactory.createBodyPartFromFile("user_avatar", new File(str2)), hashMapNotNull, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.editUser(this.multipartBody, (HashMapNotNull) this.body);
    }
}
