package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p413s.C12910h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0016J&\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, mo16641d2 = {"okhttp3/internal/http2/PushObserver$Companion$CANCEL$1", "Lokhttp3/internal/http2/PushObserver;", "onData", "", "streamId", "", "source", "Lokio/BufferedSource;", "byteCount", "last", "onHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "onRequest", "requestHeaders", "onReset", "", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: PushObserver.kt */
public final class PushObserver$Companion$CANCEL$1 implements PushObserver {
    PushObserver$Companion$CANCEL$1() {
    }

    public boolean onData(int i, C12910h hVar, int i2, boolean z) throws IOException {
        C10202j.m34178b(hVar, "source");
        hVar.skip((long) i2);
        return true;
    }

    public boolean onHeaders(int i, List<Header> list, boolean z) {
        C10202j.m34178b(list, "responseHeaders");
        return true;
    }

    public boolean onRequest(int i, List<Header> list) {
        C10202j.m34178b(list, "requestHeaders");
        return true;
    }

    public void onReset(int i, ErrorCode errorCode) {
        C10202j.m34178b(errorCode, "errorCode");
    }
}
