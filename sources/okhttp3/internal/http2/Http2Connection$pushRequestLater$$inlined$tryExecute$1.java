package okhttp3.internal.http2;

import java.util.List;
import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo16641d2 = {"<anonymous>", "", "run", "okhttp3/internal/Util$execute$1"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: Util.kt */
public final class Http2Connection$pushRequestLater$$inlined$tryExecute$1 implements Runnable {
    final /* synthetic */ String $name;
    final /* synthetic */ List $requestHeaders$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    public Http2Connection$pushRequestLater$$inlined$tryExecute$1(String str, Http2Connection http2Connection, int i, List list) {
        this.$name = str;
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$requestHeaders$inlined = list;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            java.lang.String r0 = r5.$name
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r2 = "currentThread"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r2)
            java.lang.String r2 = r1.getName()
            r1.setName(r0)
            okhttp3.internal.http2.Http2Connection r0 = r5.this$0     // Catch:{ all -> 0x004a }
            okhttp3.internal.http2.PushObserver r0 = r0.pushObserver     // Catch:{ all -> 0x004a }
            int r3 = r5.$streamId$inlined     // Catch:{ all -> 0x004a }
            java.util.List r4 = r5.$requestHeaders$inlined     // Catch:{ all -> 0x004a }
            boolean r0 = r0.onRequest(r3, r4)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0046
            okhttp3.internal.http2.Http2Connection r0 = r5.this$0     // Catch:{ IOException -> 0x0046 }
            okhttp3.internal.http2.Http2Writer r0 = r0.getWriter()     // Catch:{ IOException -> 0x0046 }
            int r3 = r5.$streamId$inlined     // Catch:{ IOException -> 0x0046 }
            okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0046 }
            r0.rstStream(r3, r4)     // Catch:{ IOException -> 0x0046 }
            okhttp3.internal.http2.Http2Connection r0 = r5.this$0     // Catch:{ IOException -> 0x0046 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0046 }
            okhttp3.internal.http2.Http2Connection r3 = r5.this$0     // Catch:{ all -> 0x0043 }
            java.util.Set r3 = r3.currentPushRequests     // Catch:{ all -> 0x0043 }
            int r4 = r5.$streamId$inlined     // Catch:{ all -> 0x0043 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0043 }
            r3.remove(r4)     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0046 }
            goto L_0x0046
        L_0x0043:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0046 }
            throw r3     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            r1.setName(r2)
            return
        L_0x004a:
            r0 = move-exception
            r1.setName(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$tryExecute$1.run():void");
    }
}
