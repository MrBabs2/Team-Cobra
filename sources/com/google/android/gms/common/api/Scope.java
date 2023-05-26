package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13680f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f13681g;

    @SafeParcelable.Constructor
    Scope(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        Preconditions.m16039a(str, (Object) "scopeUri must not be null or empty");
        this.f13680f = i;
        this.f13681g = str;
    }

    @KeepForSdk
    /* renamed from: d */
    public final String mo24975d() {
        return this.f13681g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f13681g.equals(((Scope) obj).f13681g);
    }

    public final int hashCode() {
        return this.f13681g.hashCode();
    }

    public final String toString() {
        return this.f13681g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13680f);
        SafeParcelWriter.m16143a(parcel, 2, mo24975d(), false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
