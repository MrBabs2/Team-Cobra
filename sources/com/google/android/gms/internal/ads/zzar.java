package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class zzar {

    /* renamed from: a */
    private final int f18318a;

    /* renamed from: b */
    private final List<zzl> f18319b;

    /* renamed from: c */
    private final int f18320c;

    /* renamed from: d */
    private final InputStream f18321d;

    public zzar(int i, List<zzl> list) {
        this(i, list, -1, (InputStream) null);
    }

    /* renamed from: a */
    public final InputStream mo27573a() {
        return this.f18321d;
    }

    /* renamed from: b */
    public final int mo27574b() {
        return this.f18320c;
    }

    /* renamed from: c */
    public final int mo27575c() {
        return this.f18318a;
    }

    /* renamed from: d */
    public final List<zzl> mo27576d() {
        return Collections.unmodifiableList(this.f18319b);
    }

    public zzar(int i, List<zzl> list, int i2, InputStream inputStream) {
        this.f18318a = i;
        this.f18319b = list;
        this.f18320c = i2;
        this.f18321d = inputStream;
    }
}
