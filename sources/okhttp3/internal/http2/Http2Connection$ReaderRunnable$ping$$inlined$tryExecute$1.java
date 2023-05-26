package okhttp3.internal.http2;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.internal.http2.Http2Connection;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo16641d2 = {"<anonymous>", "", "run", "okhttp3/internal/Util$execute$1"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: Util.kt */
public final class Http2Connection$ReaderRunnable$ping$$inlined$tryExecute$1 implements Runnable {
    final /* synthetic */ String $name;
    final /* synthetic */ int $payload1$inlined;
    final /* synthetic */ int $payload2$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    public Http2Connection$ReaderRunnable$ping$$inlined$tryExecute$1(String str, Http2Connection.ReaderRunnable readerRunnable, int i, int i2) {
        this.$name = str;
        this.this$0 = readerRunnable;
        this.$payload1$inlined = i;
        this.$payload2$inlined = i2;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        C10202j.m34174a((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.this$0.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
        } finally {
            currentThread.setName(name);
        }
    }
}
