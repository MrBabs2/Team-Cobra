package okhttp3.internal.http2;

import java.util.List;
import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo16641d2 = {"<anonymous>", "", "run", "okhttp3/internal/Util$execute$1"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: Util.kt */
public final class Http2Connection$pushHeadersLater$$inlined$tryExecute$1 implements Runnable {
    final /* synthetic */ boolean $inFinished$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ List $requestHeaders$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    public Http2Connection$pushHeadersLater$$inlined$tryExecute$1(String str, Http2Connection http2Connection, int i, List list, boolean z) {
        this.$name = str;
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$requestHeaders$inlined = list;
        this.$inFinished$inlined = z;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = r6.$name
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r2 = "currentThread"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r2)
            java.lang.String r2 = r1.getName()
            r1.setName(r0)
            okhttp3.internal.http2.Http2Connection r0 = r6.this$0     // Catch:{ all -> 0x0052 }
            okhttp3.internal.http2.PushObserver r0 = r0.pushObserver     // Catch:{ all -> 0x0052 }
            int r3 = r6.$streamId$inlined     // Catch:{ all -> 0x0052 }
            java.util.List r4 = r6.$requestHeaders$inlined     // Catch:{ all -> 0x0052 }
            boolean r5 = r6.$inFinished$inlined     // Catch:{ all -> 0x0052 }
            boolean r0 = r0.onHeaders(r3, r4, r5)     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0031
            okhttp3.internal.http2.Http2Connection r3 = r6.this$0     // Catch:{ IOException -> 0x004e }
            okhttp3.internal.http2.Http2Writer r3 = r3.getWriter()     // Catch:{ IOException -> 0x004e }
            int r4 = r6.$streamId$inlined     // Catch:{ IOException -> 0x004e }
            okhttp3.internal.http2.ErrorCode r5 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x004e }
            r3.rstStream(r4, r5)     // Catch:{ IOException -> 0x004e }
        L_0x0031:
            if (r0 != 0) goto L_0x0037
            boolean r0 = r6.$inFinished$inlined     // Catch:{ IOException -> 0x004e }
            if (r0 == 0) goto L_0x004e
        L_0x0037:
            okhttp3.internal.http2.Http2Connection r0 = r6.this$0     // Catch:{ IOException -> 0x004e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x004e }
            okhttp3.internal.http2.Http2Connection r3 = r6.this$0     // Catch:{ all -> 0x004b }
            java.util.Set r3 = r3.currentPushRequests     // Catch:{ all -> 0x004b }
            int r4 = r6.$streamId$inlined     // Catch:{ all -> 0x004b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x004b }
            r3.remove(r4)     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x004e }
            goto L_0x004e
        L_0x004b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x004e }
            throw r3     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            r1.setName(r2)
            return
        L_0x0052:
            r0 = move-exception
            r1.setName(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$tryExecute$1.run():void");
    }
}
