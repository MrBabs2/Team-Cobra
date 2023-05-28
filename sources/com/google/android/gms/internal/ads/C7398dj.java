package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.dj */
final class C7398dj implements zzban<zzcxu> {

    /* renamed from: a */
    private final /* synthetic */ zzchl f15016a;

    C7398dj(zzchl zzchl) {
        this.f15016a = zzchl;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17911g3)).booleanValue()) {
            Matcher matcher = zzchl.f20203g.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f15016a.f20208f.mo28706a(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        zzcxu zzcxu = (zzcxu) obj;
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17911g3)).booleanValue()) {
            this.f15016a.f20208f.mo28706a(zzcxu.f21163b.f21158b.f21150e);
            this.f15016a.f20208f.mo28707a(zzcxu.f21163b.f21158b.f21151f);
        }
    }
}
