package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public final class zzcro implements zzcuz<Bundle> {

    /* renamed from: a */
    private final zzyd f20853a;

    /* renamed from: b */
    private final String f20854b;

    /* renamed from: c */
    private final boolean f20855c;

    /* renamed from: d */
    private final String f20856d;

    /* renamed from: e */
    private final float f20857e;

    /* renamed from: f */
    private final int f20858f;

    /* renamed from: g */
    private final int f20859g;

    /* renamed from: h */
    private final String f20860h;

    public zzcro(zzyd zzyd, String str, boolean z, String str2, float f, int i, int i2, String str3) {
        Preconditions.m16038a(zzyd, (Object) "the adSize must not be null");
        this.f20853a = zzyd;
        this.f20854b = str;
        this.f20855c = z;
        this.f20856d = str2;
        this.f20857e = f;
        this.f20858f = i;
        this.f20859g = i2;
        this.f20860h = str3;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzcxz.m23106a(bundle, "smart_w", "full", this.f20853a.f23020j == -1);
        zzcxz.m23106a(bundle, "smart_h", "auto", this.f20853a.f23017g == -2);
        zzcxz.m23103a(bundle, "ene", (Boolean) true, this.f20853a.f23025o);
        zzcxz.m23105a(bundle, "format", this.f20854b);
        zzcxz.m23106a(bundle, "fluid", "height", this.f20855c);
        String str = this.f20856d;
        zzcxz.m23106a(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f20857e);
        bundle.putInt("sw", this.f20858f);
        bundle.putInt("sh", this.f20859g);
        String str2 = this.f20860h;
        zzcxz.m23106a(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        zzyd[] zzydArr = this.f20853a.f23022l;
        if (zzydArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f20853a.f23017g);
            bundle2.putInt("width", this.f20853a.f23020j);
            bundle2.putBoolean("is_fluid_height", this.f20853a.f23024n);
            arrayList.add(bundle2);
        } else {
            for (zzyd zzyd : zzydArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzyd.f23024n);
                bundle3.putInt("height", zzyd.f23017g);
                bundle3.putInt("width", zzyd.f23020j);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
