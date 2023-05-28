package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;

@SafeParcelable.Class
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f23636f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f23637g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String f23638h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final String f23639i;

    @SafeParcelable.Constructor
    PlaceReport(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3) {
        this.f23636f = i;
        this.f23637g = str;
        this.f23638h = str2;
        this.f23639i = str3;
    }

    /* renamed from: d */
    public String mo30579d() {
        return this.f23637g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return Objects.m16031a(this.f23637g, placeReport.f23637g) && Objects.m16031a(this.f23638h, placeReport.f23638h) && Objects.m16031a(this.f23639i, placeReport.f23639i);
    }

    public int hashCode() {
        return Objects.m16029a(this.f23637g, this.f23638h, this.f23639i);
    }

    /* renamed from: o */
    public String mo30582o() {
        return this.f23638h;
    }

    public String toString() {
        Objects.ToStringHelper a = Objects.m16030a((Object) this);
        a.mo25372a("placeId", this.f23637g);
        a.mo25372a(StoreTabGridRecyclerFragment.BundleCons.TAG, this.f23638h);
        if (!"unknown".equals(this.f23639i)) {
            a.mo25372a("source", this.f23639i);
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23636f);
        SafeParcelWriter.m16143a(parcel, 2, mo30579d(), false);
        SafeParcelWriter.m16143a(parcel, 3, mo30582o(), false);
        SafeParcelWriter.m16143a(parcel, 4, this.f23639i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
