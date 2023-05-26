package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class zzpo implements Parcelable {
    public static final Parcelable.Creator<zzpo> CREATOR = new v20();

    /* renamed from: f */
    private final zza[] f22506f;

    public interface zza extends Parcelable {
    }

    public zzpo(List<? extends zza> list) {
        zza[] zzaArr = new zza[list.size()];
        this.f22506f = zzaArr;
        list.toArray(zzaArr);
    }

    /* renamed from: a */
    public final int mo29616a() {
        return this.f22506f.length;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzpo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f22506f, ((zzpo) obj).f22506f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22506f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22506f.length);
        for (zza writeParcelable : this.f22506f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    /* renamed from: a */
    public final zza mo29617a(int i) {
        return this.f22506f[i];
    }

    zzpo(Parcel parcel) {
        this.f22506f = new zza[parcel.readInt()];
        int i = 0;
        while (true) {
            zza[] zzaArr = this.f22506f;
            if (i < zzaArr.length) {
                zzaArr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
