package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbp;

@SafeParcelable.Class
public final class zzdbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdbd> CREATOR = new zzdbe();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f21318f;
    @SafeParcelable.Field

    /* renamed from: g */
    private zzbp.zza f21319g = null;

    /* renamed from: h */
    private byte[] f21320h;

    @SafeParcelable.Constructor
    zzdbd(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.f21318f = i;
        this.f21320h = bArr;
        m23235o();
    }

    /* renamed from: o */
    private final void m23235o() {
        if (this.f21319g == null && this.f21320h != null) {
            return;
        }
        if (this.f21319g != null && this.f21320h == null) {
            return;
        }
        if (this.f21319g != null && this.f21320h != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f21319g == null && this.f21320h == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: d */
    public final zzbp.zza mo28895d() {
        if (!(this.f21319g != null)) {
            try {
                this.f21319g = zzbp.zza.m21459a(this.f21320h, zzdno.m23986d());
                this.f21320h = null;
            } catch (zzdok e) {
                throw new IllegalStateException(e);
            }
        }
        m23235o();
        return this.f21319g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f21318f);
        byte[] bArr = this.f21320h;
        if (bArr == null) {
            bArr = this.f21319g.mo29065g();
        }
        SafeParcelWriter.m16147a(parcel, 2, bArr, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
