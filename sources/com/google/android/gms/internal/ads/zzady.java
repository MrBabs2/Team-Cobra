package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzady extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzady> CREATOR = new zzadz();
    @SafeParcelable.Field

    /* renamed from: f */
    public final int f18042f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final boolean f18043g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final int f18044h;
    @SafeParcelable.Field

    /* renamed from: i */
    public final boolean f18045i;
    @SafeParcelable.Field

    /* renamed from: j */
    public final int f18046j;
    @SafeParcelable.Field

    /* renamed from: k */
    public final zzacd f18047k;
    @SafeParcelable.Field

    /* renamed from: l */
    public final boolean f18048l;
    @SafeParcelable.Field

    /* renamed from: m */
    public final int f18049m;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzady(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzacd(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzkr(), 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f18042f);
        SafeParcelWriter.m16146a(parcel, 2, this.f18043g);
        SafeParcelWriter.m16135a(parcel, 3, this.f18044h);
        SafeParcelWriter.m16146a(parcel, 4, this.f18045i);
        SafeParcelWriter.m16135a(parcel, 5, this.f18046j);
        SafeParcelWriter.m16140a(parcel, 6, (Parcelable) this.f18047k, i, false);
        SafeParcelWriter.m16146a(parcel, 7, this.f18048l);
        SafeParcelWriter.m16135a(parcel, 8, this.f18049m);
        SafeParcelWriter.m16132a(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzady(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) zzacd zzacd, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) int i4) {
        this.f18042f = i;
        this.f18043g = z;
        this.f18044h = i2;
        this.f18045i = z2;
        this.f18046j = i3;
        this.f18047k = zzacd;
        this.f18048l = z3;
        this.f18049m = i4;
    }
}
