package okhttp3.internal.connection;

import kotlin.C4789l;
import p413s.C12899d;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\u0004"}, mo16641d2 = {"okhttp3/internal/connection/Transmitter$timeout$1", "Lokio/AsyncTimeout;", "timedOut", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Transmitter.kt */
public final class Transmitter$timeout$1 extends C12899d {
    final /* synthetic */ Transmitter this$0;

    Transmitter$timeout$1(Transmitter transmitter) {
        this.this$0 = transmitter;
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
        this.this$0.cancel();
    }
}
