package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzj;
import java.util.List;

public final class zzn implements Parcelable.Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        zzj zzj = zzm.f23193j;
        List<ClientIdentity> list = zzm.f23192i;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                zzj = (zzj) SafeParcelReader.m16099a(parcel, a, zzj.CREATOR);
            } else if (a2 == 2) {
                list = SafeParcelReader.m16107c(parcel, a, ClientIdentity.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                str = SafeParcelReader.m16119o(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzm(zzj, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
