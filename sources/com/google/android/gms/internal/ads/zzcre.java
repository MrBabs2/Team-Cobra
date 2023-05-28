package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

public final class zzcre implements zzcva<zzcrd> {

    /* renamed from: a */
    private final zzbbl f20838a;

    /* renamed from: b */
    private final Context f20839b;

    /* renamed from: c */
    private final zzcxv f20840c;

    /* renamed from: d */
    private final View f20841d;

    public zzcre(zzbbl zzbbl, Context context, zzcxv zzcxv, ViewGroup viewGroup) {
        this.f20838a = zzbbl;
        this.f20839b = context;
        this.f20840c = zzcxv;
        this.f20841d = viewGroup;
    }

    /* renamed from: a */
    public final zzbbh<zzcrd> mo25785a() {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17898e0)).booleanValue()) {
            return zzbar.m20538a((Throwable) new Exception("Ad Key signal disabled."));
        }
        return this.f20838a.mo27892a(new C7812on(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcrd mo28782b() throws Exception {
        Context context = this.f20839b;
        zzyd zzyd = this.f20840c.f21168e;
        ArrayList arrayList = new ArrayList();
        View view = this.f20841d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int i = -1;
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzcrd(context, zzyd, arrayList);
    }
}
