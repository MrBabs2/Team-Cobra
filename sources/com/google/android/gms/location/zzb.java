package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzb implements Parcelable.Creator<ActivityRecognitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList<DetectedActivity> arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                arrayList = SafeParcelReader.m16107c(parcel, a, DetectedActivity.CREATOR);
            } else if (a2 == 2) {
                j = SafeParcelReader.m16129y(parcel, a);
            } else if (a2 == 3) {
                j2 = SafeParcelReader.m16129y(parcel, a);
            } else if (a2 == 4) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                bundle = SafeParcelReader.m16110f(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
