package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.internal.Util;
import p413s.C12892a0;
import p413s.C12894b0;
import p413s.C12905f;
import p413s.C12909g;
import p413s.C12910h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo16641d2 = {"okhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1", "Lokio/Source;", "cacheRequestClosed", "", "getCacheRequestClosed", "()Z", "setCacheRequestClosed", "(Z)V", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: CacheInterceptor.kt */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements C12892a0 {
    final /* synthetic */ C12909g $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ C12910h $source;
    private boolean cacheRequestClosed;

    CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(C12910h hVar, CacheRequest cacheRequest, C12909g gVar) {
        this.$source = hVar;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = gVar;
    }

    public void close() throws IOException {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    public final boolean getCacheRequestClosed() {
        return this.cacheRequestClosed;
    }

    public long read(C12905f fVar, long j) throws IOException {
        C10202j.m34178b(fVar, "sink");
        try {
            long read = this.$source.read(fVar, j);
            if (read == -1) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheBody.close();
                }
                return -1;
            }
            fVar.mo41145a(this.$cacheBody.getBuffer(), fVar.size() - read, read);
            this.$cacheBody.mo41171h();
            return read;
        } catch (IOException e) {
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
            }
            throw e;
        }
    }

    public final void setCacheRequestClosed(boolean z) {
        this.cacheRequestClosed = z;
    }

    public C12894b0 timeout() {
        return this.$source.timeout();
    }
}
