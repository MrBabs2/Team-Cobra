package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zao();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14239f;
    @SafeParcelable.Field

    /* renamed from: g */
    final String f14240g;
    @SafeParcelable.Field

    /* renamed from: h */
    final ArrayList<zam> f14241h;

    @SafeParcelable.Constructor
    zal(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) ArrayList<zam> arrayList) {
        this.f14239f = i;
        this.f14240g = str;
        this.f14241h = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14239f);
        SafeParcelWriter.m16143a(parcel, 2, this.f14240g, false);
        SafeParcelWriter.m16155c(parcel, 3, this.f14241h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f14239f = 1;
        this.f14240g = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String next : map.keySet()) {
                arrayList.add(new zam(next, map.get(next)));
            }
        }
        this.f14241h = arrayList;
    }
}
