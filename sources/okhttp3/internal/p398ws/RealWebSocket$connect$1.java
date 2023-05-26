package okhttp3.internal.p398ws;

import java.io.Closeable;
import java.io.IOException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.p398ws.RealWebSocket;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo16641d2 = {"okhttp3/internal/ws/RealWebSocket$connect$1", "Lokhttp3/Callback;", "onFailure", "", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: okhttp3.internal.ws.RealWebSocket$connect$1 */
/* compiled from: RealWebSocket.kt */
public final class RealWebSocket$connect$1 implements Callback {
    final /* synthetic */ Request $request;
    final /* synthetic */ RealWebSocket this$0;

    RealWebSocket$connect$1(RealWebSocket realWebSocket, Request request) {
        this.this$0 = realWebSocket;
        this.$request = request;
    }

    public void onFailure(Call call, IOException iOException) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(iOException, "e");
        this.this$0.failWebSocket(iOException, (Response) null);
    }

    public void onResponse(Call call, Response response) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(response, "response");
        Exchange exchange = response.exchange();
        try {
            this.this$0.checkUpgradeSuccess$okhttp(response, exchange);
            if (exchange != null) {
                RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
                try {
                    this.this$0.initReaderAndWriter("OkHttp WebSocket " + this.$request.url().redact(), newWebSocketStreams);
                    this.this$0.getListener$okhttp().onOpen(this.this$0, response);
                    this.this$0.loopReader();
                } catch (Exception e) {
                    this.this$0.failWebSocket(e, (Response) null);
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
        } catch (IOException e2) {
            if (exchange != null) {
                exchange.webSocketUpgradeFailed();
            }
            this.this$0.failWebSocket(e2, response);
            Util.closeQuietly((Closeable) response);
        }
    }
}
