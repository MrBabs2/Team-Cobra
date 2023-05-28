package p015cm.aptoide.p016pt.networking;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AccountException;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV3Exception;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.OAuth;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.OAuth2AuthenticationRequest;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p126m.C5379n;
import p123rx.p127s.C12871b;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.networking.RefreshTokenInvalidator */
public class RefreshTokenInvalidator implements TokenInvalidator {
    private final int MAX_REFRESH_TOKEN_RETRIES = 3;
    private final AuthenticationPersistence authenticationPersistence;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final String extraId;
    private final OkHttpClient httpClient;
    private final C12871b<Void> logoutSubject;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;

    public RefreshTokenInvalidator(BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences2, String str, TokenInvalidator tokenInvalidator2, AuthenticationPersistence authenticationPersistence2, C12871b<Void> bVar) {
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences2;
        this.extraId = str;
        this.tokenInvalidator = tokenInvalidator2;
        this.authenticationPersistence = authenticationPersistence2;
        this.logoutSubject = bVar;
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13068a(Authentication authentication) {
        return OAuth2AuthenticationRequest.m5241of(authentication.getRefreshToken(), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.extraId).observe().mo18700m().mo18566b(new C3450t(this));
    }

    public C12871b<Void> getLogoutSubject() {
        return this.logoutSubject;
    }

    public C5328b invalidateAccessToken() {
        return this.authenticationPersistence.getAuthentication().mo18566b(new C3451u(this)).mo18608c((C5379n<? super C5368e<? extends Throwable>, ? extends C5368e<?>>) new C3448r(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13067a(OAuth oAuth) {
        if (!oAuth.hasErrors()) {
            return this.authenticationPersistence.updateAuthentication(oAuth.getAccessToken());
        }
        return C5328b.m10163b((Throwable) new AccountException(oAuth));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13070a(C5368e eVar) {
        return eVar.mo18643a(C5368e.m10231a(1, 3), new C3449s(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13069a(Throwable th, Integer num) {
        if (num.intValue() < 3) {
            if (th instanceof AptoideWsV3Exception) {
                return null;
            }
        } else if (th instanceof AptoideWsV3Exception) {
            this.logoutSubject.onNext(null);
            return C5328b.m10170f();
        }
        this.logoutSubject.onNext(null);
        return C5328b.m10163b(th);
    }
}
