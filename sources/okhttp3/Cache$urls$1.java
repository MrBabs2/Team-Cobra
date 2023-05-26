package okhttp3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10193d;
import okhttp3.internal.cache.DiskLruCache;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0013\u001a\u00020\u0004H\u0002J\t\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\f\u0012\b\u0012\u00060\nR\u00020\u000b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo16641d2 = {"okhttp3/Cache$urls$1", "", "", "canRemove", "", "getCanRemove", "()Z", "setCanRemove", "(Z)V", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "getDelegate", "()Ljava/util/Iterator;", "nextUrl", "getNextUrl", "()Ljava/lang/String;", "setNextUrl", "(Ljava/lang/String;)V", "hasNext", "next", "remove", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Cache.kt */
public final class Cache$urls$1 implements Iterator<String>, C10193d {
    private boolean canRemove;
    private final Iterator<DiskLruCache.Snapshot> delegate;
    private String nextUrl;
    final /* synthetic */ Cache this$0;

    Cache$urls$1(Cache cache) {
        this.this$0 = cache;
        this.delegate = cache.getCache$okhttp().snapshots();
    }

    public final boolean getCanRemove() {
        return this.canRemove;
    }

    public final Iterator<DiskLruCache.Snapshot> getDelegate() {
        return this.delegate;
    }

    public final String getNextUrl() {
        return this.nextUrl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.p257io.C10182a.m34136a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r5 = this;
            java.lang.String r0 = r5.nextUrl
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            r5.canRemove = r0
        L_0x0009:
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L_0x0038
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate     // Catch:{ IOException -> 0x0036 }
            java.lang.Object r2 = r2.next()     // Catch:{ IOException -> 0x0036 }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ IOException -> 0x0036 }
            r3 = 0
            r4 = r2
            okhttp3.internal.cache.DiskLruCache$Snapshot r4 = (okhttp3.internal.cache.DiskLruCache.Snapshot) r4     // Catch:{ all -> 0x002f }
            s.a0 r4 = r4.getSource(r0)     // Catch:{ all -> 0x002f }
            s.h r4 = p413s.C12919p.m41675a((p413s.C12892a0) r4)     // Catch:{ all -> 0x002f }
            java.lang.String r4 = r4.mo41184n()     // Catch:{ all -> 0x002f }
            r5.nextUrl = r4     // Catch:{ all -> 0x002f }
            kotlin.p257io.C10182a.m34136a(r2, r3)     // Catch:{ IOException -> 0x0036 }
            return r1
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            kotlin.p257io.C10182a.m34136a(r2, r3)     // Catch:{ IOException -> 0x0036 }
            throw r4     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            goto L_0x0009
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache$urls$1.hasNext():boolean");
    }

    public void remove() {
        if (this.canRemove) {
            this.delegate.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }

    public final void setCanRemove(boolean z) {
        this.canRemove = z;
    }

    public final void setNextUrl(String str) {
        this.nextUrl = str;
    }

    public String next() {
        if (hasNext()) {
            String str = this.nextUrl;
            if (str != null) {
                this.nextUrl = null;
                this.canRemove = true;
                return str;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new NoSuchElementException();
    }
}
