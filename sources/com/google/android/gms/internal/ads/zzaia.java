package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

@SafeParcelable.Class
@zzard
public final class zzaia extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaia> CREATOR = new zzaib();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f18125f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String[] f18126g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String[] f18127h;

    @SafeParcelable.Constructor
    zzaia(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) String[] strArr2) {
        this.f18125f = str;
        this.f18126g = strArr;
        this.f18127h = strArr2;
    }

    /* renamed from: a */
    public static zzaia m19260a(zzr zzr) throws zza {
        Map<String, String> a = zzr.mo26761a();
        int size = a.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry next : a.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr2[i] = (String) next.getValue();
            i++;
        }
        return new zzaia(zzr.mo29658e(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f18125f, false);
        SafeParcelWriter.m16149a(parcel, 2, this.f18126g, false);
        SafeParcelWriter.m16149a(parcel, 3, this.f18127h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
