package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rh */
final class C7917rh<T> implements zzaho<Object> {

    /* renamed from: a */
    private final WeakReference<T> f16756a;

    /* renamed from: b */
    private final String f16757b;

    /* renamed from: c */
    private final zzaho<T> f16758c;

    /* renamed from: d */
    private final /* synthetic */ zzccj f16759d;

    private C7917rh(zzccj zzccj, WeakReference<T> weakReference, String str, zzaho<T> zzaho) {
        this.f16759d = zzccj;
        this.f16756a = weakReference;
        this.f16757b = str;
        this.f16758c = zzaho;
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map<String, String> map) {
        Object obj2 = this.f16756a.get();
        if (obj2 == null) {
            this.f16759d.mo28649b(this.f16757b, this);
        } else {
            this.f16758c.mo25559a(obj2, map);
        }
    }

    /* synthetic */ C7917rh(zzccj zzccj, WeakReference weakReference, String str, zzaho zzaho, C7695lh lhVar) {
        this(zzccj, weakReference, str, zzaho);
    }
}
