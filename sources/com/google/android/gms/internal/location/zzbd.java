package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbe();

    /* renamed from: m */
    static final List<ClientIdentity> f23167m = Collections.emptyList();
    @SafeParcelable.Field

    /* renamed from: f */
    private LocationRequest f23168f;
    @SafeParcelable.Field

    /* renamed from: g */
    private List<ClientIdentity> f23169g;
    @SafeParcelable.Field

    /* renamed from: h */
    private String f23170h;
    @SafeParcelable.Field

    /* renamed from: i */
    private boolean f23171i;
    @SafeParcelable.Field

    /* renamed from: j */
    private boolean f23172j;
    @SafeParcelable.Field

    /* renamed from: k */
    private boolean f23173k;
    @SafeParcelable.Field

    /* renamed from: l */
    private String f23174l;

    @SafeParcelable.Constructor
    zzbd(@SafeParcelable.Param(id = 1) LocationRequest locationRequest, @SafeParcelable.Param(id = 5) List<ClientIdentity> list, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) String str2) {
        this.f23168f = locationRequest;
        this.f23169g = list;
        this.f23170h = str;
        this.f23171i = z;
        this.f23172j = z2;
        this.f23173k = z3;
        this.f23174l = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return Objects.m16031a(this.f23168f, zzbd.f23168f) && Objects.m16031a(this.f23169g, zzbd.f23169g) && Objects.m16031a(this.f23170h, zzbd.f23170h) && this.f23171i == zzbd.f23171i && this.f23172j == zzbd.f23172j && this.f23173k == zzbd.f23173k && Objects.m16031a(this.f23174l, zzbd.f23174l);
    }

    public final int hashCode() {
        return this.f23168f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23168f);
        if (this.f23170h != null) {
            sb.append(" tag=");
            sb.append(this.f23170h);
        }
        if (this.f23174l != null) {
            sb.append(" moduleId=");
            sb.append(this.f23174l);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f23171i);
        sb.append(" clients=");
        sb.append(this.f23169g);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f23172j);
        if (this.f23173k) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 1, (Parcelable) this.f23168f, i, false);
        SafeParcelWriter.m16155c(parcel, 5, this.f23169g, false);
        SafeParcelWriter.m16143a(parcel, 6, this.f23170h, false);
        SafeParcelWriter.m16146a(parcel, 7, this.f23171i);
        SafeParcelWriter.m16146a(parcel, 8, this.f23172j);
        SafeParcelWriter.m16146a(parcel, 9, this.f23173k);
        SafeParcelWriter.m16143a(parcel, 10, this.f23174l, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
