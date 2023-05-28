package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzps extends zzpv {
    public static final Parcelable.Creator<zzps> CREATOR = new x20();

    /* renamed from: g */
    private final String f22511g;

    /* renamed from: h */
    public final String f22512h;

    /* renamed from: i */
    public final String f22513i;

    public zzps(String str, String str2, String str3) {
        super("COMM");
        this.f22511g = str;
        this.f22512h = str2;
        this.f22513i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzps.class == obj.getClass()) {
            zzps zzps = (zzps) obj;
            return zzsy.m25289a((Object) this.f22512h, (Object) zzps.f22512h) && zzsy.m25289a((Object) this.f22511g, (Object) zzps.f22511g) && zzsy.m25289a((Object) this.f22513i, (Object) zzps.f22513i);
        }
    }

    public final int hashCode() {
        String str = this.f22511g;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f22512h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22513i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22514f);
        parcel.writeString(this.f22511g);
        parcel.writeString(this.f22513i);
    }

    zzps(Parcel parcel) {
        super("COMM");
        this.f22511g = parcel.readString();
        this.f22512h = parcel.readString();
        this.f22513i = parcel.readString();
    }
}
