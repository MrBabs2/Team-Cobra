package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class zzcrp implements zzcva<zzcro> {

    /* renamed from: a */
    private final zzcva<zzcvf> f20861a;

    /* renamed from: b */
    private final zzcxv f20862b;

    /* renamed from: c */
    private final Context f20863c;

    /* renamed from: d */
    private final zzawm f20864d;

    public zzcrp(zzcsk<zzcvf> zzcsk, zzcxv zzcxv, Context context, zzawm zzawm) {
        this.f20861a = zzcsk;
        this.f20862b = zzcxv;
        this.f20863c = context;
        this.f20864d = zzawm;
    }

    /* renamed from: a */
    public final zzbbh<zzcro> mo25785a() {
        return zzbar.m20543a(this.f20861a.mo25785a(), new C7923rn(this), zzbbm.f18749b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzcro mo28783a(zzcvf zzcvf) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        int i4;
        int i5;
        DisplayMetrics displayMetrics;
        zzyd zzyd = this.f20862b.f21168e;
        zzyd[] zzydArr = zzyd.f23022l;
        if (zzydArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzyd zzyd2 : zzydArr) {
                if (!zzyd2.f23024n && !z2) {
                    str = zzyd2.f23016f;
                    z2 = true;
                }
                if (zzyd2.f23024n && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzyd.f23016f;
            z = zzyd.f23024n;
        }
        Resources resources = this.f20863c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i6 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.f20864d.mo27743i().mo27772b();
            i2 = i6;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        zzyd[] zzydArr2 = zzyd.f23022l;
        if (zzydArr2 != null) {
            boolean z4 = false;
            for (zzyd zzyd3 : zzydArr2) {
                if (zzyd3.f23024n) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    if (zzyd3.f23020j != -1 || f == 0.0f) {
                        i4 = zzyd3.f23020j;
                    } else {
                        i4 = (int) (((float) zzyd3.f23021k) / f);
                    }
                    sb.append(i4);
                    sb.append("x");
                    if (zzyd3.f23017g == -2) {
                        if (f != 0.0f) {
                            i5 = (int) (((float) zzyd3.f23018h) / f);
                            sb.append(i5);
                        }
                    }
                    i5 = zzyd3.f23017g;
                    sb.append(i5);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzcro(zzyd, str, z, sb.toString(), f, i2, i, str2);
    }
}
