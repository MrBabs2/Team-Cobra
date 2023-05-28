package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;

public class zzc {
    static {
        zzc.class.getClassLoader();
    }

    private zzc() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m25872a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m25873a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m25874a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
