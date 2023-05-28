package com.bumptech.glide.p166r;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.r.g */
/* compiled from: LruCache */
public class C6312g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f11563a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private long f11564b;

    /* renamed from: c */
    private long f11565c;

    public C6312g(long j) {
        this.f11564b = j;
    }

    /* renamed from: a */
    public synchronized Y mo20756a(T t) {
        return this.f11563a.get(t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20108a(T t, Y y) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo20109b(Y y) {
        return 1;
    }

    /* renamed from: b */
    public synchronized long mo20759b() {
        return this.f11564b;
    }

    /* renamed from: c */
    public synchronized Y mo20761c(T t) {
        Y remove;
        remove = this.f11563a.remove(t);
        if (remove != null) {
            this.f11565c -= (long) mo20109b(remove);
        }
        return remove;
    }

    /* renamed from: a */
    public void mo20757a() {
        mo20758a(0);
    }

    /* renamed from: b */
    public synchronized Y mo20760b(T t, Y y) {
        long b = (long) mo20109b(y);
        if (b >= this.f11564b) {
            mo20108a(t, y);
            return null;
        }
        if (y != null) {
            this.f11565c += b;
        }
        Y put = this.f11563a.put(t, y);
        if (put != null) {
            this.f11565c -= (long) mo20109b(put);
            if (!put.equals(y)) {
                mo20108a(t, put);
            }
        }
        m12966c();
        return put;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo20758a(long j) {
        while (this.f11565c > j) {
            Iterator<Map.Entry<T, Y>> it = this.f11563a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f11565c -= (long) mo20109b(value);
            Object key = next.getKey();
            it.remove();
            mo20108a(key, value);
        }
    }

    /* renamed from: c */
    private void m12966c() {
        mo20758a(this.f11564b);
    }
}
