package com.google.android.gms.internal.ads;

import android.content.Context;

@zzard
public final class zzalk {

    /* renamed from: a */
    private final Object f18175a = new Object();

    /* renamed from: b */
    private final Object f18176b = new Object();

    /* renamed from: c */
    private zzalr f18177c;

    /* renamed from: d */
    private zzalr f18178d;

    /* renamed from: a */
    public final zzalr mo27371a(Context context, zzbai zzbai) {
        zzalr zzalr;
        synchronized (this.f18176b) {
            if (this.f18178d == null) {
                this.f18178d = new zzalr(m19381a(context), zzbai, (String) zzyt.m25670e().mo27163a(zzacu.f17877a));
            }
            zzalr = this.f18178d;
        }
        return zzalr;
    }

    /* renamed from: b */
    public final zzalr mo27372b(Context context, zzbai zzbai) {
        zzalr zzalr;
        synchronized (this.f18175a) {
            if (this.f18177c == null) {
                this.f18177c = new zzalr(m19381a(context), zzbai, (String) zzyt.m25670e().mo27163a(zzacu.f17882b));
            }
            zzalr = this.f18177c;
        }
        return zzalr;
    }

    /* renamed from: a */
    private static Context m19381a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
