package okhttp3.internal.connection;

import kotlin.C4789l;
import okhttp3.internal.p398ws.RealWebSocket;
import p413s.C12909g;
import p413s.C12910h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo16641d2 = {"okhttp3/internal/connection/RealConnection$newWebSocketStreams$1", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "close", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: RealConnection.kt */
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    final /* synthetic */ Exchange $exchange;
    final /* synthetic */ C12909g $sink;
    final /* synthetic */ C12910h $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$newWebSocketStreams$1(Exchange exchange, C12910h hVar, C12909g gVar, boolean z, C12910h hVar2, C12909g gVar2) {
        super(z, hVar2, gVar2);
        this.$exchange = exchange;
        this.$source = hVar;
        this.$sink = gVar;
    }

    public void close() {
        this.$exchange.bodyComplete(-1, true, true, null);
    }
}
