package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@zzard
public final class zzarx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarx> CREATOR = new zzary();
    @SafeParcelable.Field

    /* renamed from: f */
    public final Bundle f18438f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final zzbai f18439g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final ApplicationInfo f18440h;
    @SafeParcelable.Field

    /* renamed from: i */
    public final String f18441i;
    @SafeParcelable.Field

    /* renamed from: j */
    public final List<String> f18442j;
    @SafeParcelable.Field

    /* renamed from: k */
    public final PackageInfo f18443k;
    @SafeParcelable.Field

    /* renamed from: l */
    public final String f18444l;
    @SafeParcelable.Field

    /* renamed from: m */
    public final boolean f18445m;
    @SafeParcelable.Field

    /* renamed from: n */
    public final String f18446n;

    @SafeParcelable.Constructor
    public zzarx(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) zzbai zzbai, @SafeParcelable.Param(id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) PackageInfo packageInfo, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str3) {
        this.f18438f = bundle;
        this.f18439g = zzbai;
        this.f18441i = str;
        this.f18440h = applicationInfo;
        this.f18442j = list;
        this.f18443k = packageInfo;
        this.f18444l = str2;
        this.f18445m = z;
        this.f18446n = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16137a(parcel, 1, this.f18438f, false);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f18439g, i, false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) this.f18440h, i, false);
        SafeParcelWriter.m16143a(parcel, 4, this.f18441i, false);
        SafeParcelWriter.m16153b(parcel, 5, this.f18442j, false);
        SafeParcelWriter.m16140a(parcel, 6, (Parcelable) this.f18443k, i, false);
        SafeParcelWriter.m16143a(parcel, 7, this.f18444l, false);
        SafeParcelWriter.m16146a(parcel, 8, this.f18445m);
        SafeParcelWriter.m16143a(parcel, 9, this.f18446n, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
