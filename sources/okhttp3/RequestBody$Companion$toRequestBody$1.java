package okhttp3;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p413s.C12909g;
import p413s.C12911i;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, mo16641d2 = {"okhttp3/RequestBody$Companion$toRequestBody$1", "Lokhttp3/RequestBody;", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: RequestBody.kt */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ C12911i $this_toRequestBody;

    RequestBody$Companion$toRequestBody$1(C12911i iVar, MediaType mediaType) {
        this.$this_toRequestBody = iVar;
        this.$contentType = mediaType;
    }

    public long contentLength() {
        return (long) this.$this_toRequestBody.mo41239s();
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(C12909g gVar) {
        C10202j.m34178b(gVar, "sink");
        gVar.mo41161c(this.$this_toRequestBody);
    }
}
