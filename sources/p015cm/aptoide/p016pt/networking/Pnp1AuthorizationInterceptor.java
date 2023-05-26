package p015cm.aptoide.p016pt.networking;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;

/* renamed from: cm.aptoide.pt.networking.Pnp1AuthorizationInterceptor */
public class Pnp1AuthorizationInterceptor implements Interceptor {
    public static final String ACCESS_TOKEN_KEY = "access_token";
    private final AuthenticationPersistence authenticationPersistence;
    private long timeStamp = 0;
    private final TokenInvalidator tokenInvalidator;

    public Pnp1AuthorizationInterceptor(AuthenticationPersistence authenticationPersistence2, TokenInvalidator tokenInvalidator2) {
        this.authenticationPersistence = authenticationPersistence2;
        this.tokenInvalidator = tokenInvalidator2;
    }

    private synchronized void invalidateToken() {
        if (System.currentTimeMillis() - this.timeStamp > 5000) {
            this.tokenInvalidator.invalidateAccessToken().mo18595a();
            this.timeStamp = System.currentTimeMillis();
        }
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (this.authenticationPersistence.getAuthentication().mo18562a().mo41082a().isAuthenticated()) {
            request = request.newBuilder().url(request.url().newBuilder().addQueryParameter("access_token", this.authenticationPersistence.getAuthentication().mo18562a().mo41082a().getAccessToken()).build()).build();
        }
        Response proceed = chain.proceed(request);
        if (proceed.code() != 401) {
            return proceed;
        }
        invalidateToken();
        return chain.proceed(request.newBuilder().url(request.url().newBuilder().setQueryParameter("access_token", this.authenticationPersistence.getAuthentication().mo18562a().mo41082a().getAccessToken()).build()).build());
    }
}
