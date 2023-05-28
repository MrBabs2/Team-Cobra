package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.zzg;
import java.util.HashMap;
import java.util.Map;

public final class zzcyk {

    /* renamed from: a */
    private final Map<String, zzcym> f21204a = new HashMap();

    /* renamed from: b */
    private final Context f21205b;

    /* renamed from: c */
    private final zzawm f21206c;

    /* renamed from: d */
    private final zzbai f21207d;

    /* renamed from: e */
    private final zzdh f21208e;

    public zzcyk(Context context, zzbai zzbai, zzawm zzawm) {
        this.f21205b = context;
        this.f21207d = zzbai;
        this.f21206c = zzawm;
        this.f21208e = new zzdh(new zzg(context, zzbai));
    }

    /* renamed from: b */
    private final zzcym m23121b(String str) {
        zzasq b = zzasq.m19917b(this.f21205b);
        try {
            b.mo27619a(str);
            zzaxc zzaxc = new zzaxc();
            zzaxc.mo27793a(this.f21205b, str, false);
            zzaxf zzaxf = new zzaxf(this.f21206c.mo27743i(), zzaxc);
            return new zzcym(b, zzaxf, new zzawu(zzazt.m20480c(), zzaxf), new zzdh(new zzg(this.f21205b, this.f21207d)));
        } catch (PackageManager.NameNotFoundException unused) {
            return m23120a();
        }
    }

    /* renamed from: a */
    public final zzcym mo28839a(String str) {
        if (str == null) {
            return m23120a();
        }
        if (this.f21204a.containsKey(str)) {
            return this.f21204a.get(str);
        }
        zzcym b = m23121b(str);
        this.f21204a.put(str, b);
        return b;
    }

    /* renamed from: a */
    private final zzcym m23120a() {
        return new zzcym(this.f21205b, this.f21206c.mo27743i(), this.f21206c.mo27745k(), this.f21208e);
    }
}
