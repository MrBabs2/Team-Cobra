package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzg implements Parcelable.Creator<ActivityTransitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        ArrayList<ActivityTransitionEvent> arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            if (SafeParcelReader.m16097a(a) != 1) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                arrayList = SafeParcelReader.m16107c(parcel, a, ActivityTransitionEvent.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new ActivityTransitionResult(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
