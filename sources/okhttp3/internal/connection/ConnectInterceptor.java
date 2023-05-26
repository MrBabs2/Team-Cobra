package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo16641d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: ConnectInterceptor.kt */
public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor INSTANCE = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        C10202j.m34178b(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request();
        Transmitter transmitter = realInterceptorChain.transmitter();
        return realInterceptorChain.proceed(request, transmitter, transmitter.newExchange$okhttp(chain, !C10202j.m34176a((Object) request.method(), (Object) "GET")));
    }
}
