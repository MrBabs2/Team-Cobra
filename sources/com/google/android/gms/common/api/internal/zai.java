package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

public final class zai<O extends Api.ApiOptions> {

    /* renamed from: a */
    private final boolean f13969a = true;

    /* renamed from: b */
    private final int f13970b;

    /* renamed from: c */
    private final Api<O> f13971c;

    /* renamed from: d */
    private final O f13972d;

    private zai(Api<O> api, O o) {
        this.f13971c = api;
        this.f13972d = o;
        this.f13970b = Objects.m16029a(api, o);
    }

    /* renamed from: a */
    public static <O extends Api.ApiOptions> zai<O> m15827a(Api<O> api, O o) {
        return new zai<>(api, o);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zai)) {
            return false;
        }
        zai zai = (zai) obj;
        return !this.f13969a && !zai.f13969a && Objects.m16031a(this.f13971c, zai.f13971c) && Objects.m16031a(this.f13972d, zai.f13972d);
    }

    public final int hashCode() {
        return this.f13970b;
    }

    /* renamed from: a */
    public static <O extends Api.ApiOptions> zai<O> m15826a(Api<O> api) {
        return new zai<>(api);
    }

    /* renamed from: a */
    public final String mo25185a() {
        return this.f13971c.mo24889b();
    }

    private zai(Api<O> api) {
        this.f13971c = api;
        this.f13972d = null;
        this.f13970b = System.identityHashCode(this);
    }
}
