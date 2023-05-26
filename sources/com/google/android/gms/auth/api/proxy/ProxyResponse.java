package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdkWithMembers
@SafeParcelable.Class
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new zzb();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13518f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final int f13519g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final PendingIntent f13520h;
    @SafeParcelable.Field

    /* renamed from: i */
    public final int f13521i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final Bundle f13522j;
    @SafeParcelable.Field

    /* renamed from: k */
    public final byte[] f13523k;

    @SafeParcelable.Constructor
    ProxyResponse(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) Bundle bundle, @SafeParcelable.Param(id = 5) byte[] bArr) {
        this.f13518f = i;
        this.f13519g = i2;
        this.f13521i = i3;
        this.f13522j = bundle;
        this.f13523k = bArr;
        this.f13520h = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13519g);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f13520h, i, false);
        SafeParcelWriter.m16135a(parcel, 3, this.f13521i);
        SafeParcelWriter.m16137a(parcel, 4, this.f13522j, false);
        SafeParcelWriter.m16147a(parcel, 5, this.f13523k, false);
        SafeParcelWriter.m16135a(parcel, 1000, this.f13518f);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
