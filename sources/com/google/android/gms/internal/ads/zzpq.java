package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class zzpq extends zzpv {
    public static final Parcelable.Creator<zzpq> CREATOR = new w20();

    /* renamed from: g */
    private final String f22507g;

    /* renamed from: h */
    private final String f22508h;

    /* renamed from: i */
    private final int f22509i;

    /* renamed from: j */
    private final byte[] f22510j;

    public zzpq(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f22507g = str;
        this.f22508h = null;
        this.f22509i = 3;
        this.f22510j = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpq.class == obj.getClass()) {
            zzpq zzpq = (zzpq) obj;
            return this.f22509i == zzpq.f22509i && zzsy.m25289a((Object) this.f22507g, (Object) zzpq.f22507g) && zzsy.m25289a((Object) this.f22508h, (Object) zzpq.f22508h) && Arrays.equals(this.f22510j, zzpq.f22510j);
        }
    }

    public final int hashCode() {
        int i = (this.f22509i + 527) * 31;
        String str = this.f22507g;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22508h;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f22510j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22507g);
        parcel.writeString(this.f22508h);
        parcel.writeInt(this.f22509i);
        parcel.writeByteArray(this.f22510j);
    }

    zzpq(Parcel parcel) {
        super("APIC");
        this.f22507g = parcel.readString();
        this.f22508h = parcel.readString();
        this.f22509i = parcel.readInt();
        this.f22510j = parcel.createByteArray();
    }
}
