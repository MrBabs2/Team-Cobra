package com.google.android.gms.internal.safetynet;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class zzc {
    static {
        zzc.class.getClassLoader();
    }

    private zzc() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m26768a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m26769a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static boolean m26770a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
