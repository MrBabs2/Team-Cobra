package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

public class zzc {
    static {
        zzc.class.getClassLoader();
    }

    private zzc() {
    }

    /* renamed from: a */
    public static boolean m25799a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m25798a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
