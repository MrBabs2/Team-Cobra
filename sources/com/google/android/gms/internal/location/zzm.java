package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();
    @VisibleForTesting

    /* renamed from: i */
    static final List<ClientIdentity> f23192i = Collections.emptyList();

    /* renamed from: j */
    static final zzj f23193j = new zzj();
    @SafeParcelable.Field

    /* renamed from: f */
    private zzj f23194f;
    @SafeParcelable.Field

    /* renamed from: g */
    private List<ClientIdentity> f23195g;
    @SafeParcelable.Field

    /* renamed from: h */
    private String f23196h;

    @SafeParcelable.Constructor
    zzm(@SafeParcelable.Param(id = 1) zzj zzj, @SafeParcelable.Param(id = 2) List<ClientIdentity> list, @SafeParcelable.Param(id = 3) String str) {
        this.f23194f = zzj;
        this.f23195g = list;
        this.f23196h = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return Objects.m16031a(this.f23194f, zzm.f23194f) && Objects.m16031a(this.f23195g, zzm.f23195g) && Objects.m16031a(this.f23196h, zzm.f23196h);
    }

    public final int hashCode() {
        return this.f23194f.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 1, (Parcelable) this.f23194f, i, false);
        SafeParcelWriter.m16155c(parcel, 2, this.f23195g, false);
        SafeParcelWriter.m16143a(parcel, 3, this.f23196h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
