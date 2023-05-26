package p015cm.aptoide.p016pt.account.view.store;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p015cm.aptoide.p016pt.account.view.exception.InvalidImageException;
import p015cm.aptoide.p016pt.account.view.exception.StoreCreationException;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV7Exception;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.CheckUserCredentialsJson;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.ErrorResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.CheckUserCredentialsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SetStoreImageRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SimpleSetStoreRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.RequestBodyFactory;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.themes.StoreTheme;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C12495m;
import p123rx.p126m.C5379n;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.account.view.store.StoreManager */
public class StoreManager implements p015cm.aptoide.accountmanager.StoreManager {
    private static final String ERROR_API_1 = "API-1";
    private static final String ERROR_CODE_2 = "WOP-2";
    private static final String ERROR_CODE_3 = "WOP-3";
    private final BodyInterceptor<BaseBody> bodyInterceptorV3;
    private final BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody> bodyInterceptorV7;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final BodyInterceptor<HashMapNotNull<String, RequestBody>> multipartBodyInterceptor;
    private final ObjectMapper objectMapper;
    private final RequestBodyFactory requestBodyFactory;
    private final SharedPreferences sharedPreferences;
    private final RoomStoreRepository storeRepository;
    private final TokenInvalidator tokenInvalidator;

    public StoreManager(OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<HashMapNotNull<String, RequestBody>> bodyInterceptor, BodyInterceptor<BaseBody> bodyInterceptor2, BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody> bodyInterceptor3, SharedPreferences sharedPreferences2, TokenInvalidator tokenInvalidator2, RequestBodyFactory requestBodyFactory2, ObjectMapper objectMapper2, RoomStoreRepository roomStoreRepository) {
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.multipartBodyInterceptor = bodyInterceptor;
        this.bodyInterceptorV3 = bodyInterceptor2;
        this.bodyInterceptorV7 = bodyInterceptor3;
        this.sharedPreferences = sharedPreferences2;
        this.tokenInvalidator = tokenInvalidator2;
        this.requestBodyFactory = requestBodyFactory2;
        this.objectMapper = objectMapper2;
        this.storeRepository = roomStoreRepository;
    }

    private C5328b createStore(String str, String str2, String str3, boolean z, String str4) {
        if (TextUtils.isEmpty(str)) {
            return C5328b.m10163b((Throwable) new StoreValidationException(0));
        }
        return CheckUserCredentialsRequest.toCreateStore(this.bodyInterceptorV3, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, str).observe().mo18700m().mo18559a(C1212a0.f3628f).mo18566b(new C1214b0(this, str2, str3, z, str4, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: getOnErrorCompletable */
    public C5328b mo6537a(Throwable th) {
        if ((th instanceof StoreCreationException) || (th instanceof InvalidImageException)) {
            return C5328b.m10163b(th);
        }
        if (!(th instanceof AptoideWsV7Exception)) {
            return C5328b.m10163b(th);
        }
        if (((AptoideWsV7Exception) th).getBaseResponse().getErrors().get(0).getCode().equals(ERROR_API_1)) {
            return C5328b.m10163b((Throwable) new InvalidImageException(Collections.singletonList(InvalidImageException.ImageError.API_ERROR)));
        }
        return C5328b.m10163b((Throwable) new InvalidImageException(Collections.singletonList(InvalidImageException.ImageError.API_ERROR), th.getMessage()));
    }

    private boolean needToUploadMoreStoreData(String str, String str2, boolean z, String str3) {
        return !TextUtils.isEmpty(str) || (z && !TextUtils.isEmpty(str2)) || !str3.equals(StoreTheme.DEFAULT.toString().toLowerCase());
    }

    private C5328b updateStore(String str, String str2, String str3, boolean z, String str4) {
        if (TextUtils.isEmpty(str)) {
            return C5328b.m10163b((Throwable) new StoreValidationException(0));
        }
        if (z && TextUtils.isEmpty(str3)) {
            return C5328b.m10163b((Throwable) new StoreValidationException(1));
        }
        if (z) {
            return updateStoreWithAvatar(str, str2, str4, str3);
        }
        return updateStoreWithoutAvatar(str, str2, str4);
    }

    private C5328b updateStoreWithAvatar(String str, String str2, String str3, String str4) {
        return SetStoreImageRequest.m5272of(str, str3, str2, str4, this.multipartBodyInterceptor, this.httpClient, this.converterFactory, this.requestBodyFactory, this.objectMapper, this.sharedPreferences, this.tokenInvalidator).observe().mo18700m().mo18565b();
    }

    private C5328b updateStoreWithoutAvatar(String str, String str2, String str3) {
        return SimpleSetStoreRequest.m5276of(str, str3, str2, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().mo18696k();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6538a(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (z) {
            return updateStore(str, str2, str3, z2, str4);
        }
        return createStore(str, str2, str3, z2, str4);
    }

    public C5328b createOrUpdate(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        return C5328b.m10166b((C12495m<? extends C5328b>) new C1241z(this, z2, str, str2, str3, z, str4)).mo18603b((C5379n<? super Throwable, ? extends C5328b>) new C1240y(this));
    }

    public C5368e<Boolean> isSubscribed(long j) {
        return this.storeRepository.isSubscribed(j);
    }

    /* renamed from: a */
    static /* synthetic */ Single m4426a(CheckUserCredentialsJson checkUserCredentialsJson) {
        List<ErrorResponse> errors = checkUserCredentialsJson.getErrors();
        if (errors != null && !errors.isEmpty() && errors.get(0).code.equals(ERROR_CODE_2)) {
            return Single.m10120a((Throwable) new StoreCreationException());
        }
        if (errors == null || errors.size() <= 0 || !errors.get(0).code.equals(ERROR_CODE_3)) {
            return Single.m10119a(checkUserCredentialsJson);
        }
        return Single.m10120a((Throwable) new StoreCreationException(errors.get(0).code));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6536a(String str, String str2, boolean z, String str3, String str4, CheckUserCredentialsJson checkUserCredentialsJson) {
        if (needToUploadMoreStoreData(str, str2, z, str3)) {
            return updateStore(str4, str, str2, z, str3);
        }
        return C5328b.m10170f();
    }
}
