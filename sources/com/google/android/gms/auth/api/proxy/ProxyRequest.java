package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdkWithMembers
@SafeParcelable.Class
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13512f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f13513g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final int f13514h;
    @SafeParcelable.Field

    /* renamed from: i */
    public final long f13515i;
    @SafeParcelable.Field

    /* renamed from: j */
    public final byte[] f13516j;
    @SafeParcelable.Field

    /* renamed from: k */
    private Bundle f13517k;

    @KeepForSdkWithMembers
    public static class Builder {
    }

    @SafeParcelable.Constructor
    ProxyRequest(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) Bundle bundle) {
        this.f13512f = i;
        this.f13513g = str;
        this.f13514h = i2;
        this.f13515i = j;
        this.f13516j = bArr;
        this.f13517k = bundle;
    }

    public String toString() {
        String str = this.f13513g;
        int i = this.f13514h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f13513g, false);
        SafeParcelWriter.m16135a(parcel, 2, this.f13514h);
        SafeParcelWriter.m16136a(parcel, 3, this.f13515i);
        SafeParcelWriter.m16147a(parcel, 4, this.f13516j, false);
        SafeParcelWriter.m16137a(parcel, 5, this.f13517k, false);
        SafeParcelWriter.m16135a(parcel, 1000, this.f13512f);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
