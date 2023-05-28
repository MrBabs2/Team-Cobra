package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ju */
final class C7634ju {

    /* renamed from: a */
    private final zzdni f15775a;

    /* renamed from: b */
    private final byte[] f15776b;

    private C7634ju(int i) {
        byte[] bArr = new byte[i];
        this.f15776b = bArr;
        this.f15775a = zzdni.m23812a(bArr);
    }

    /* renamed from: a */
    public final zzdmr mo26141a() {
        this.f15775a.mo29105c();
        return new C7745mu(this.f15776b);
    }

    /* renamed from: b */
    public final zzdni mo26142b() {
        return this.f15775a;
    }

    /* synthetic */ C7634ju(int i, C7409du duVar) {
        this(i);
    }
}
