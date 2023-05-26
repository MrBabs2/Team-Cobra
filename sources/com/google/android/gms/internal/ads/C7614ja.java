package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ja */
final class C7614ja implements zzbdo {

    /* renamed from: a */
    private final /* synthetic */ zzbgl f15741a;

    C7614ja(zzbgl zzbgl) {
        this.f15741a = zzbgl;
    }

    /* renamed from: a */
    public final void mo26130a(String str, String str2) {
        zzbgl zzbgl = this.f15741a;
        String valueOf = String.valueOf(str);
        String unused = zzbgl.f18955k = valueOf.length() != 0 ? "ExoPlayer caching failed. Type: ".concat(valueOf) : new String("ExoPlayer caching failed. Type: ");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(str2).length());
        sb.append("ExoPlayer failed during precache: ");
        sb.append(str);
        sb.append(" Exception: ");
        sb.append(str2);
        zzbad.m20523d(sb.toString());
        this.f15741a.mo28080b();
    }
}
