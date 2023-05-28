package okhttp3;

import kotlin.C4789l;
import p413s.C12910h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo16641d2 = {"okhttp3/ResponseBody$Companion$asResponseBody$1", "Lokhttp3/ResponseBody;", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "source", "Lokio/BufferedSource;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: ResponseBody.kt */
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    final /* synthetic */ long $contentLength;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ C12910h $this_asResponseBody;

    ResponseBody$Companion$asResponseBody$1(C12910h hVar, MediaType mediaType, long j) {
        this.$this_asResponseBody = hVar;
        this.$contentType = mediaType;
        this.$contentLength = j;
    }

    public long contentLength() {
        return this.$contentLength;
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public C12910h source() {
        return this.$this_asResponseBody;
    }
}
