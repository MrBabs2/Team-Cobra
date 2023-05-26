package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.Set;

public final class zzctw implements zzcva<zzctv> {

    /* renamed from: a */
    private final zzbbl f20945a;

    /* renamed from: b */
    private final Context f20946b;

    /* renamed from: c */
    private final Set<String> f20947c;

    public zzctw(zzbbl zzbbl, Context context, Set<String> set) {
        this.f20945a = zzbbl;
        this.f20946b = context;
        this.f20947c = set;
    }

    /* renamed from: a */
    public final zzbbh<zzctv> mo25785a() {
        return this.f20945a.mo27892a(new C7813oo(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzctv mo28792b() throws Exception {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17980w2)).booleanValue() || !zzctv.m22980a(this.f20947c)) {
            return new zzctv((String) null);
        }
        return new zzctv(zzk.zzlv().mo27562a(this.f20946b));
    }
}
