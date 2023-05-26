package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzek extends zzfk {

    /* renamed from: m */
    private final Activity f21822m;

    /* renamed from: n */
    private final View f21823n;

    public zzek(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2, View view, Activity activity) {
        super(zzdy, str, str2, zza, i, 62);
        this.f21823n = view;
        this.f21822m = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        if (this.f21823n != null) {
            boolean booleanValue = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17939m1)).booleanValue();
            Object[] objArr = (Object[]) this.f21856j.invoke((Object) null, new Object[]{this.f21823n, this.f21822m, Boolean.valueOf(booleanValue)});
            synchronized (this.f21855i) {
                this.f21855i.mo28297E(((Long) objArr[0]).longValue());
                this.f21855i.mo28298F(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f21855i.mo28319e((String) objArr[2]);
                }
            }
        }
    }
}
