package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdy> CREATOR = new zzdz();
    @SafeParcelable.Field

    /* renamed from: f */
    public final long f23405f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final long f23406g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final boolean f23407h;
    @SafeParcelable.Field

    /* renamed from: i */
    public final String f23408i;
    @SafeParcelable.Field

    /* renamed from: j */
    public final String f23409j;
    @SafeParcelable.Field

    /* renamed from: k */
    public final String f23410k;
    @SafeParcelable.Field

    /* renamed from: l */
    public final Bundle f23411l;

    @SafeParcelable.Constructor
    zzdy(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) Bundle bundle) {
        this.f23405f = j;
        this.f23406g = j2;
        this.f23407h = z;
        this.f23408i = str;
        this.f23409j = str2;
        this.f23410k = str3;
        this.f23411l = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16136a(parcel, 1, this.f23405f);
        SafeParcelWriter.m16136a(parcel, 2, this.f23406g);
        SafeParcelWriter.m16146a(parcel, 3, this.f23407h);
        SafeParcelWriter.m16143a(parcel, 4, this.f23408i, false);
        SafeParcelWriter.m16143a(parcel, 5, this.f23409j, false);
        SafeParcelWriter.m16143a(parcel, 6, this.f23410k, false);
        SafeParcelWriter.m16137a(parcel, 7, this.f23411l, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
