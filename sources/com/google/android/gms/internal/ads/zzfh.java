package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzfh extends zzfk {

    /* renamed from: m */
    private final View f21845m;

    public zzfh(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2, View view) {
        super(zzdy, str, str2, zza, i, 57);
        this.f21845m = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        if (this.f21845m != null) {
            Boolean bool = (Boolean) zzyt.m25670e().mo27163a(zzacu.f17987y1);
            DisplayMetrics displayMetrics = this.f21852f.mo29237a().getResources().getDisplayMetrics();
            zzeg zzeg = new zzeg((String) this.f21856j.invoke((Object) null, new Object[]{this.f21845m, displayMetrics, bool}));
            zzbp.zza.zzf.C12968zza j = zzbp.zza.zzf.m21690j();
            j.mo28366a(zzeg.f21805b.longValue());
            j.mo28367b(zzeg.f21806c.longValue());
            j.mo28368c(zzeg.f21807d.longValue());
            if (bool.booleanValue()) {
                j.mo28369d(zzeg.f21808e.longValue());
            }
            this.f21855i.mo28303a((zzbp.zza.zzf) ((zzdob) j.mo29143t()));
        }
    }
}
