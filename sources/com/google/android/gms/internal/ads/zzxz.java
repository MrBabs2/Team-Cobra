package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@zzard
public final class zzxz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxz> CREATOR = new zzyb();
    @SafeParcelable.Field

    /* renamed from: f */
    public final int f22981f;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: g */
    public final long f22982g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final Bundle f22983h;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: i */
    public final int f22984i;
    @SafeParcelable.Field

    /* renamed from: j */
    public final List<String> f22985j;
    @SafeParcelable.Field

    /* renamed from: k */
    public final boolean f22986k;
    @SafeParcelable.Field

    /* renamed from: l */
    public final int f22987l;
    @SafeParcelable.Field

    /* renamed from: m */
    public final boolean f22988m;
    @SafeParcelable.Field

    /* renamed from: n */
    public final String f22989n;
    @SafeParcelable.Field

    /* renamed from: o */
    public final zzaca f22990o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final Location f22991p;
    @SafeParcelable.Field

    /* renamed from: q */
    public final String f22992q;
    @SafeParcelable.Field

    /* renamed from: r */
    public final Bundle f22993r;
    @SafeParcelable.Field

    /* renamed from: s */
    public final Bundle f22994s;
    @SafeParcelable.Field

    /* renamed from: t */
    public final List<String> f22995t;
    @SafeParcelable.Field

    /* renamed from: u */
    public final String f22996u;
    @SafeParcelable.Field

    /* renamed from: v */
    public final String f22997v;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: w */
    public final boolean f22998w;
    @SafeParcelable.Field

    /* renamed from: x */
    public final zzxt f22999x;
    @SafeParcelable.Field

    /* renamed from: y */
    public final int f23000y;
    @SafeParcelable.Field

    /* renamed from: z */
    public final String f23001z;

    @SafeParcelable.Constructor
    public zzxz(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) Bundle bundle, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) int i3, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) String str, @SafeParcelable.Param(id = 10) zzaca zzaca, @SafeParcelable.Param(id = 11) Location location, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 13) Bundle bundle2, @SafeParcelable.Param(id = 14) Bundle bundle3, @SafeParcelable.Param(id = 15) List<String> list2, @SafeParcelable.Param(id = 16) String str3, @SafeParcelable.Param(id = 17) String str4, @SafeParcelable.Param(id = 18) boolean z3, @SafeParcelable.Param(id = 19) zzxt zzxt, @SafeParcelable.Param(id = 20) int i4, @SafeParcelable.Param(id = 21) String str5) {
        this.f22981f = i;
        this.f22982g = j;
        this.f22983h = bundle == null ? new Bundle() : bundle;
        this.f22984i = i2;
        this.f22985j = list;
        this.f22986k = z;
        this.f22987l = i3;
        this.f22988m = z2;
        this.f22989n = str;
        this.f22990o = zzaca;
        this.f22991p = location;
        this.f22992q = str2;
        this.f22993r = bundle2 == null ? new Bundle() : bundle2;
        this.f22994s = bundle3;
        this.f22995t = list2;
        this.f22996u = str3;
        this.f22997v = str4;
        this.f22998w = z3;
        this.f22999x = zzxt;
        this.f23000y = i4;
        this.f23001z = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxz)) {
            return false;
        }
        zzxz zzxz = (zzxz) obj;
        if (this.f22981f != zzxz.f22981f || this.f22982g != zzxz.f22982g || !Objects.m16031a(this.f22983h, zzxz.f22983h) || this.f22984i != zzxz.f22984i || !Objects.m16031a(this.f22985j, zzxz.f22985j) || this.f22986k != zzxz.f22986k || this.f22987l != zzxz.f22987l || this.f22988m != zzxz.f22988m || !Objects.m16031a(this.f22989n, zzxz.f22989n) || !Objects.m16031a(this.f22990o, zzxz.f22990o) || !Objects.m16031a(this.f22991p, zzxz.f22991p) || !Objects.m16031a(this.f22992q, zzxz.f22992q) || !Objects.m16031a(this.f22993r, zzxz.f22993r) || !Objects.m16031a(this.f22994s, zzxz.f22994s) || !Objects.m16031a(this.f22995t, zzxz.f22995t) || !Objects.m16031a(this.f22996u, zzxz.f22996u) || !Objects.m16031a(this.f22997v, zzxz.f22997v) || this.f22998w != zzxz.f22998w || this.f23000y != zzxz.f23000y || !Objects.m16031a(this.f23001z, zzxz.f23001z)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f22981f), Long.valueOf(this.f22982g), this.f22983h, Integer.valueOf(this.f22984i), this.f22985j, Boolean.valueOf(this.f22986k), Integer.valueOf(this.f22987l), Boolean.valueOf(this.f22988m), this.f22989n, this.f22990o, this.f22991p, this.f22992q, this.f22993r, this.f22994s, this.f22995t, this.f22996u, this.f22997v, Boolean.valueOf(this.f22998w), Integer.valueOf(this.f23000y), this.f23001z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f22981f);
        SafeParcelWriter.m16136a(parcel, 2, this.f22982g);
        SafeParcelWriter.m16137a(parcel, 3, this.f22983h, false);
        SafeParcelWriter.m16135a(parcel, 4, this.f22984i);
        SafeParcelWriter.m16153b(parcel, 5, this.f22985j, false);
        SafeParcelWriter.m16146a(parcel, 6, this.f22986k);
        SafeParcelWriter.m16135a(parcel, 7, this.f22987l);
        SafeParcelWriter.m16146a(parcel, 8, this.f22988m);
        SafeParcelWriter.m16143a(parcel, 9, this.f22989n, false);
        SafeParcelWriter.m16140a(parcel, 10, (Parcelable) this.f22990o, i, false);
        SafeParcelWriter.m16140a(parcel, 11, (Parcelable) this.f22991p, i, false);
        SafeParcelWriter.m16143a(parcel, 12, this.f22992q, false);
        SafeParcelWriter.m16137a(parcel, 13, this.f22993r, false);
        SafeParcelWriter.m16137a(parcel, 14, this.f22994s, false);
        SafeParcelWriter.m16153b(parcel, 15, this.f22995t, false);
        SafeParcelWriter.m16143a(parcel, 16, this.f22996u, false);
        SafeParcelWriter.m16143a(parcel, 17, this.f22997v, false);
        SafeParcelWriter.m16146a(parcel, 18, this.f22998w);
        SafeParcelWriter.m16140a(parcel, 19, (Parcelable) this.f22999x, i, false);
        SafeParcelWriter.m16135a(parcel, 20, this.f23000y);
        SafeParcelWriter.m16143a(parcel, 21, this.f23001z, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
