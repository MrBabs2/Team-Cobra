package okhttp3.internal.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10193d;
import okhttp3.internal.cache.DiskLruCache;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u0002J\r\u0010\u0013\u001a\u00060\u0002R\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R'\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012 \u0006*\b\u0018\u00010\u0005R\u00020\u00030\u0005R\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0016"}, mo16641d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "getDelegate", "()Ljava/util/Iterator;", "nextSnapshot", "getNextSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "setNextSnapshot", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;)V", "removeSnapshot", "getRemoveSnapshot", "setRemoveSnapshot", "hasNext", "", "next", "remove", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, C10193d {
    private final Iterator<DiskLruCache.Entry> delegate;
    private DiskLruCache.Snapshot nextSnapshot;
    private DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ DiskLruCache this$0;

    DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        Iterator<DiskLruCache.Entry> it = new ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        C10202j.m34174a((Object) it, "ArrayList(lruEntries.values).iterator()");
        this.delegate = it;
    }

    public final Iterator<DiskLruCache.Entry> getDelegate() {
        return this.delegate;
    }

    public final DiskLruCache.Snapshot getNextSnapshot() {
        return this.nextSnapshot;
    }

    public final DiskLruCache.Snapshot getRemoveSnapshot() {
        return this.removeSnapshot;
    }

    public boolean hasNext() {
        if (this.nextSnapshot != null) {
            return true;
        }
        synchronized (this.this$0) {
            if (this.this$0.getClosed$okhttp()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                if (next != null) {
                    if (next.getReadable$okhttp()) {
                        DiskLruCache.Snapshot snapshot$okhttp = next.snapshot$okhttp();
                        if (snapshot$okhttp != null) {
                            this.nextSnapshot = snapshot$okhttp;
                            return true;
                        }
                    }
                }
            }
            C10483v vVar = C10483v.f28357a;
            return false;
        }
    }

    public void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot != null) {
            try {
                this.this$0.remove(snapshot.key());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }

    public final void setNextSnapshot(DiskLruCache.Snapshot snapshot) {
        this.nextSnapshot = snapshot;
    }

    public final void setRemoveSnapshot(DiskLruCache.Snapshot snapshot) {
        this.removeSnapshot = snapshot;
    }

    public DiskLruCache.Snapshot next() {
        if (hasNext()) {
            DiskLruCache.Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            if (snapshot != null) {
                return snapshot;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new NoSuchElementException();
    }
}
