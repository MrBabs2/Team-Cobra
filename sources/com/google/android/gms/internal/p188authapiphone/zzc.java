package com.google.android.gms.internal.p188authapiphone;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzc */
public class zzc {
    static {
        zzc.class.getClassLoader();
    }

    private zzc() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m25776a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
