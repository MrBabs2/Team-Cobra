package p015cm.aptoide.p016pt.account;

import android.content.SharedPreferences;
import com.aptoide.authentication.model.CodeAuth;
import com.aptoide.authentication.model.OAuth2;
import com.aptoide.authenticationrx.AptoideAuthenticationRx;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AccountException;
import p015cm.aptoide.accountmanager.AccountFactory;
import p015cm.aptoide.accountmanager.AccountService;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.accountmanager.Store;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV3Exception;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV7Exception;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.BaseV3Response;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.OAuth;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.TermsAndConditionsResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetUserInfo;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetUserMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetUserSettings;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.C2181V3;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.CreateUserRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.GetTermsAndConditionsStatusRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.OAuth2AuthenticationRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.UpdateTermsAndConditionsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ChangeStoreSubscriptionResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetMySubscribedStoresRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetUserInfoRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SetUserMultipartRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SetUserRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SetUserSettings;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.ChangeStoreSubscriptionRequest;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.networking.Authentication;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p050l.p075h.p083k.C5004d;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C12496o;
import p322p.p323a.p324a.p325a.C10832d;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.account.AccountServiceV3 */
public class AccountServiceV3 implements AccountService {
    private final AccountFactory accountFactory;
    private final AptoideAuthenticationRx aptoideAuthentication;
    private final AuthenticationPersistence authenticationPersistence;
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private final BodyInterceptor<BaseBody> bodyInterceptorWebV7;
    private final Converter.Factory converterFactory;
    private final BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> defaultBodyInterceptorV3;
    private final String extraId;
    private final OkHttpClient httpClient;
    private final OkHttpClient longTimeoutHttpClient;
    private final BodyInterceptor<HashMapNotNull<String, RequestBody>> multipartBodyInterceptorV7;
    private final OAuthModeProvider oAuthModeProvider;
    private final ObjectMapper serializer;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;
    private final BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> v3NoAuthorizationBodyInterceptor;

    public AccountServiceV3(AccountFactory accountFactory2, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, Converter.Factory factory, ObjectMapper objectMapper, SharedPreferences sharedPreferences2, String str, TokenInvalidator tokenInvalidator2, AuthenticationPersistence authenticationPersistence2, BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> bodyInterceptor, BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> bodyInterceptor2, BodyInterceptor<HashMapNotNull<String, RequestBody>> bodyInterceptor3, BodyInterceptor<BaseBody> bodyInterceptor4, BodyInterceptor<BaseBody> bodyInterceptor5, OAuthModeProvider oAuthModeProvider2, AptoideAuthenticationRx aptoideAuthenticationRx) {
        this.accountFactory = accountFactory2;
        this.httpClient = okHttpClient;
        this.longTimeoutHttpClient = okHttpClient2;
        this.converterFactory = factory;
        this.serializer = objectMapper;
        this.sharedPreferences = sharedPreferences2;
        this.extraId = str;
        this.tokenInvalidator = tokenInvalidator2;
        this.authenticationPersistence = authenticationPersistence2;
        this.v3NoAuthorizationBodyInterceptor = bodyInterceptor;
        this.defaultBodyInterceptorV3 = bodyInterceptor2;
        this.multipartBodyInterceptorV7 = bodyInterceptor3;
        this.bodyInterceptorWebV7 = bodyInterceptor4;
        this.bodyInterceptorPoolV7 = bodyInterceptor5;
        this.oAuthModeProvider = oAuthModeProvider2;
        this.aptoideAuthentication = aptoideAuthenticationRx;
    }

    /* renamed from: a */
    static /* synthetic */ Iterable m4301a(List list) {
        return list;
    }

    /* renamed from: a */
    static /* synthetic */ Throwable m4302a(Long l) {
        return null;
    }

    /* renamed from: b */
    static /* synthetic */ Single m4310b(Throwable th) {
        if (th instanceof AptoideWsV3Exception) {
            return Single.m10120a((Throwable) new AccountException((AptoideWsV3Exception) th));
        }
        return Single.m10120a(th);
    }

    /* renamed from: b */
    static /* synthetic */ C5368e m4312b(C5368e eVar) {
        return eVar;
    }

    /* renamed from: c */
    static /* synthetic */ Single m4313c(Throwable th) {
        if (th instanceof AptoideWsV3Exception) {
            return Single.m10120a((Throwable) new AccountException((AptoideWsV3Exception) th));
        }
        return Single.m10120a(th);
    }

    private C5328b changeSubscription(String str, String str2, String str3, ChangeStoreSubscriptionResponse.StoreSubscriptionState storeSubscriptionState) {
        return ChangeStoreSubscriptionRequest.m5360of(str, storeSubscriptionState, str2, str3, this.bodyInterceptorPoolV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().mo18700m().mo18565b();
    }

    /* renamed from: d */
    static /* synthetic */ C5328b m4315d(BaseV7Response baseV7Response) {
        if (baseV7Response.isOk()) {
            return C5328b.m10170f();
        }
        return C5328b.m10163b((Throwable) new Exception(C2185V7.getErrorMessage(baseV7Response)));
    }

    private String getRemoteOrLocalEmail(String str, GetUserMeta.Data data) {
        return (data.getIdentity().getEmail() == null || data.getIdentity().getEmail().isEmpty()) ? str : data.getIdentity().getEmail();
    }

    private Single<GetUserInfo> getServerAccount() {
        return GetUserInfoRequest.m5257of(this.httpClient, this.converterFactory, this.bodyInterceptorWebV7, this.tokenInvalidator).observe(true, false).mo18700m().mo18559a(C1123h.f3548f).mo18572g(new C1326y(this));
    }

    private Single<List<Store>> getSubscribedStores() {
        return new GetMySubscribedStoresRequest(this.bodyInterceptorPoolV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().mo18694j(C1121g.f3541f).mo18691h(C1137o.f3563f).mo18694j(new C1141q(this)).mo18698l().mo18700m();
    }

    private Single<TermsAndConditionsResponse> getTermsAndConditionsForAccount() {
        return GetTermsAndConditionsStatusRequest.m5240of(this.defaultBodyInterceptorV3, this.converterFactory, this.httpClient, this.tokenInvalidator, this.sharedPreferences).observe(true).mo18700m();
    }

    /* access modifiers changed from: private */
    /* renamed from: mapServerAccountToAccount */
    public Account mo6225a(GetUserInfo getUserInfo, List<Store> list, TermsAndConditionsResponse termsAndConditionsResponse, String str) {
        GetUserMeta.Data data = getUserInfo.getNodes().getMeta().getData();
        GetUserSettings.Data data2 = getUserInfo.getNodes().getSettings().getData();
        return this.accountFactory.createAccount(data.getAccess(), list, String.valueOf(data.getId()), getRemoteOrLocalEmail(str, data), data.getName(), data.getAvatar(), mo6226a(data.getStore()), data2.isMature(), data2.getAccess().isConfirmed(), termsAndConditionsResponse.isOk() && termsAndConditionsResponse.isPrivacy(), termsAndConditionsResponse.isOk() && termsAndConditionsResponse.isTos());
    }

    /* access modifiers changed from: private */
    /* renamed from: mapToStore */
    public Store mo6226a(p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store store) {
        long j;
        String str;
        if (store == null) {
            return Store.emptyStore();
        }
        if (store.getStats() == null) {
            j = 0;
        } else {
            j = store.getStats().getDownloads();
        }
        long j2 = j;
        String avatar = store.getAvatar();
        long id = store.getId();
        String name = store.getName();
        if (store.getAppearance() == null) {
            str = "DEFAULT";
        } else {
            str = store.getAppearance().getTheme();
        }
        return new Store(j2, avatar, id, name, str, (String) null, (String) null, p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store.PUBLIC_ACCESS.equalsIgnoreCase(store.getAccess()));
    }

    private C5368e<Throwable> retryOnTicket(C5368e<? extends Throwable> eVar) {
        return eVar.mo18643a((C5368e<? extends T2>) C5368e.m10231a(2, 4), (C12496o<? super Object, ? super T2, ? extends R>) C1139p.f3565f).mo18687f(C1149u.f3576f);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6230a(String str, String str2, OAuth2 oAuth2) {
        return this.authenticationPersistence.createAuthentication(str, str2, oAuth2.getData().getRefreshToken(), oAuth2.getData().getAccessToken(), AptoideAccountManager.APTOIDE_SIGN_UP_TYPE).mo18583a(this.authenticationPersistence.getAuthentication().mo18559a(new C1115d(this, oAuth2)));
    }

    public Single<Account> createAccount(String str, String str2, String str3) {
        return OAuth2AuthenticationRequest.m5242of(str, str2, str3, this.v3NoAuthorizationBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.extraId, this.oAuthModeProvider.getAuthMode(str3)).observe().mo18700m().mo18559a(new C1325x(this, str, str2, str3)).mo18570e(C1145s.f3572f);
    }

    public Single<C5004d<Account, Boolean>> getAccount(String str, String str2, String str3, String str4) {
        return C10832d.m36727a(this.aptoideAuthentication.authenticate(str2, str3, str4)).mo18559a(new C1113c(this, str, str2)).mo18570e(C1327z.f3768f);
    }

    public C5328b removeAccount() {
        return this.authenticationPersistence.removeAuthentication();
    }

    public Single<CodeAuth> sendMagicLink(String str) {
        return C10832d.m36727a(this.aptoideAuthentication.sendMagicLink(str));
    }

    public C5328b subscribeStore(String str, String str2, String str3) {
        return changeSubscription(str, str2, str3, ChangeStoreSubscriptionResponse.StoreSubscriptionState.SUBSCRIBED);
    }

    public C5328b unsubscribeStore(String str, String str2, String str3) {
        return changeSubscription(str, str2, str3, ChangeStoreSubscriptionResponse.StoreSubscriptionState.UNSUBSCRIBED);
    }

    public C5328b updateAccount(String str, String str2) {
        return SetUserMultipartRequest.m5273of(str, str2, this.multipartBodyInterceptorV7, this.longTimeoutHttpClient, this.converterFactory, this.serializer, this.tokenInvalidator).observe(true, false).mo18700m().mo18566b(C1147t.f3574f);
    }

    public C5328b updateAccountUsername(String str) {
        return SetUserRequest.ofWithName(str, this.bodyInterceptorPoolV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, false).mo18700m().mo18566b(C1125i.f3550f);
    }

    public C5328b updateTermsAndConditions() {
        return UpdateTermsAndConditionsRequest.m5244of(this.defaultBodyInterceptorV3, this.converterFactory, this.httpClient, this.tokenInvalidator, this.sharedPreferences).observe(true).mo18700m().mo18566b(C1119f.f3538f);
    }

    public Single<Account> getAccount(String str) {
        return Single.m10123a(getServerAccount(), getSubscribedStores(), getTermsAndConditionsForAccount(), new C1127j(this, str));
    }

    /* renamed from: b */
    static /* synthetic */ C5328b m4311b(BaseV7Response baseV7Response) {
        if (baseV7Response.isOk()) {
            return C5328b.m10170f();
        }
        return C5328b.m10163b((Throwable) new Exception(C2185V7.getErrorMessage(baseV7Response)));
    }

    /* renamed from: c */
    static /* synthetic */ C5328b m4314c(BaseV7Response baseV7Response) {
        if (baseV7Response.isOk()) {
            return C5328b.m10170f();
        }
        return C5328b.m10163b((Throwable) new Exception(C2185V7.getErrorMessage(baseV7Response)));
    }

    public C5328b updateAccount(String str) {
        return SetUserRequest.m5274of(str, this.bodyInterceptorPoolV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, false).mo18700m().mo18566b(C1143r.f3569f);
    }

    public Single<Account> createAccount(String str, String str2) {
        return CreateUserRequest.m5239of(str.toLowerCase(), str2, this.v3NoAuthorizationBodyInterceptor, this.httpClient, this.tokenInvalidator, this.sharedPreferences, this.extraId).observe(true).mo18700m().mo18559a(new C1111b(this, str, str2)).mo18570e(C1131l.f3557f);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6228a(OAuth2 oAuth2, Authentication authentication) {
        return getAccount(authentication.getEmail()).mo18569d(new C1117e(oAuth2));
    }

    public C5328b updateAccount(boolean z) {
        return SetUserSettings.m5275of(z, this.httpClient, this.converterFactory, this.bodyInterceptorPoolV7, this.tokenInvalidator).observe(true, false).mo18700m().mo18566b(C1151v.f3578f);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6231a(String str, String str2, String str3, OAuth oAuth) {
        if (oAuth.hasErrors()) {
            return Single.m10120a((Throwable) new AccountException(oAuth));
        }
        return this.authenticationPersistence.createAuthentication(str, str2, oAuth.getRefreshToken(), oAuth.getAccessToken(), str3).mo18583a(this.authenticationPersistence.getAuthentication().mo18559a(new C1129k(this)));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6227a(Authentication authentication) {
        return getAccount(authentication.getEmail());
    }

    /* renamed from: a */
    static /* synthetic */ Single m4306a(Throwable th) {
        if (th instanceof AptoideWsV3Exception) {
            return Single.m10120a((Throwable) new AccountException((AptoideWsV3Exception) th));
        }
        return Single.m10120a(th);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6229a(String str, String str2, BaseV3Response baseV3Response) {
        if (baseV3Response.hasErrors()) {
            return Single.m10120a((Throwable) new AccountException(baseV3Response.getErrors()));
        }
        return getAccount(str, str2, "", "").mo18569d(C1133m.f3559f);
    }

    /* renamed from: a */
    static /* synthetic */ Account m4300a(C5004d dVar) {
        return (Account) dVar.f8862a;
    }

    /* renamed from: a */
    static /* synthetic */ C5328b m4307a(BaseV3Response baseV3Response) {
        if (baseV3Response.isOk()) {
            return C5328b.m10170f();
        }
        return C5328b.m10163b((Throwable) new Exception(C2181V3.getErrorMessage(baseV3Response)));
    }

    /* renamed from: a */
    static /* synthetic */ C5328b m4308a(BaseV7Response baseV7Response) {
        if (baseV7Response.isOk()) {
            return C5328b.m10170f();
        }
        return C5328b.m10163b((Throwable) new Exception(C2185V7.getErrorMessage(baseV7Response)));
    }

    /* renamed from: a */
    static /* synthetic */ C5368e m4309a(Throwable th, Integer num) {
        try {
            List<BaseV7Response.Error> errors = ((AptoideWsV7Exception) th).getBaseResponse().getErrors();
            if (errors != null && !errors.isEmpty() && errors.get(0).getCode().equalsIgnoreCase("user-1")) {
                return C5368e.m10260f((long) Math.pow(5.0d, (double) num.intValue()), TimeUnit.SECONDS).mo18694j(C1324w.f3762f);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return C5368e.m10238a(th);
    }

    /* renamed from: a */
    static /* synthetic */ Single m4305a(GetUserInfo getUserInfo) {
        if (getUserInfo.isOk()) {
            return Single.m10119a(getUserInfo);
        }
        return Single.m10120a((Throwable) new Exception(C2185V7.getErrorMessage(getUserInfo)));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6232a(C5368e eVar) {
        return retryOnTicket(eVar).mo18664b(C1135n.f3561f);
    }
}
