package p015cm.aptoide.p016pt.dataprovider.cache;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.logger.Logger;

/* renamed from: cm.aptoide.pt.dataprovider.cache.POSTCacheInterceptor */
public class POSTCacheInterceptor implements Interceptor {
    private final String TAG = POSTCacheInterceptor.class.getSimpleName();
    private final Cache<Request, Response> cache;

    public POSTCacheInterceptor(Cache<Request, Response> cache2) {
        this.cache = cache2;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (!request.method().equalsIgnoreCase("POST")) {
            return chain.proceed(request);
        }
        Headers headers = request.headers();
        if (headers.size() > 0) {
            for (String equalsIgnoreCase : headers.values(WebService.BYPASS_HEADER_KEY)) {
                if (equalsIgnoreCase.equalsIgnoreCase("true")) {
                    return chain.proceed(request);
                }
            }
        }
        if (this.cache.contains(request)) {
            Response response = this.cache.get(request);
            if (response != null) {
                Logger.getInstance().mo12985v(this.TAG, String.format("cache hit '%s'", new Object[]{request.url()}));
                return response;
            }
            Logger.getInstance().mo12985v(this.TAG, String.format("cache hit but with null result '%s'", new Object[]{request.url()}));
        }
        Logger.getInstance().mo12985v(this.TAG, String.format("cache miss '%s'", new Object[]{request.url()}));
        Response proceed = chain.proceed(request);
        if (proceed.isSuccessful()) {
            this.cache.put(request, proceed);
        }
        return proceed;
    }
}
