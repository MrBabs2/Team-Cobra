package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzpw extends zzpv {
    public static final Parcelable.Creator<zzpw> CREATOR = new y20();

    /* renamed from: g */
    private final String f22515g;

    /* renamed from: h */
    private final String f22516h;

    public zzpw(String str, String str2, String str3) {
        super(str);
        this.f22515g = null;
        this.f22516h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpw.class == obj.getClass()) {
            zzpw zzpw = (zzpw) obj;
            return this.f22514f.equals(zzpw.f22514f) && zzsy.m25289a((Object) this.f22515g, (Object) zzpw.f22515g) && zzsy.m25289a((Object) this.f22516h, (Object) zzpw.f22516h);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f22514f.hashCode() + 527) * 31;
        String str = this.f22515g;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22516h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22514f);
        parcel.writeString(this.f22515g);
        parcel.writeString(this.f22516h);
    }

    zzpw(Parcel parcel) {
        super(parcel.readString());
        this.f22515g = parcel.readString();
        this.f22516h = parcel.readString();
    }
}
