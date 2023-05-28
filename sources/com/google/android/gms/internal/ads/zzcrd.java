package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import java.util.List;

public final class zzcrd implements zzcuz<Bundle> {

    /* renamed from: a */
    private final Context f20835a;

    /* renamed from: b */
    private final zzyd f20836b;

    /* renamed from: c */
    private final List<Parcelable> f20837c;

    public zzcrd(Context context, zzyd zzyd, List<Parcelable> list) {
        this.f20835a = context;
        this.f20836b = zzyd;
        this.f20837c = list;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzk.zzlg();
        bundle.putString("activity", zzaxi.m20303f(this.f20835a));
        Bundle bundle2 = new Bundle();
        bundle2.putInt("width", this.f20836b.f23020j);
        bundle2.putInt("height", this.f20836b.f23017g);
        bundle.putBundle("size", bundle2);
        if (this.f20837c.size() > 0) {
            List<Parcelable> list = this.f20837c;
            bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
        }
    }
}
