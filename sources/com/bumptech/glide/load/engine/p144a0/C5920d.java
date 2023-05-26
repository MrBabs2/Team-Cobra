package com.bumptech.glide.load.engine.p144a0;

import com.bumptech.glide.load.engine.p144a0.C5913a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.a0.d */
/* compiled from: DiskLruCacheFactory */
public class C5920d implements C5913a.C5914a {

    /* renamed from: a */
    private final long f10809a;

    /* renamed from: b */
    private final C5921a f10810b;

    /* renamed from: com.bumptech.glide.load.engine.a0.d$a */
    /* compiled from: DiskLruCacheFactory */
    public interface C5921a {
        /* renamed from: a */
        File mo20102a();
    }

    public C5920d(C5921a aVar, long j) {
        this.f10809a = j;
        this.f10810b = aVar;
    }

    /* renamed from: a */
    public C5913a mo20096a() {
        File a = this.f10810b.mo20102a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C5922e.m11709a(a, this.f10809a);
        }
        return null;
    }
}
