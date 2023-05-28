package okhttp3.internal.http2;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.internal.http2.Http2Connection;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo16641d2 = {"<anonymous>", "", "run", "okhttp3/internal/Util$execute$1"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: Util.kt */
public final class Http2Connection$ReaderRunnable$settings$$inlined$tryExecute$1 implements Runnable {
    final /* synthetic */ boolean $clearPrevious$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ Settings $settings$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    public Http2Connection$ReaderRunnable$settings$$inlined$tryExecute$1(String str, Http2Connection.ReaderRunnable readerRunnable, boolean z, Settings settings) {
        this.$name = str;
        this.this$0 = readerRunnable;
        this.$clearPrevious$inlined = z;
        this.$settings$inlined = settings;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        C10202j.m34174a((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
        } finally {
            currentThread.setName(name);
        }
    }
}
