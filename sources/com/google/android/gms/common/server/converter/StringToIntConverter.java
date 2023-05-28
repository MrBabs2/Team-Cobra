package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zac();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14210f;

    /* renamed from: g */
    private final HashMap<String, Integer> f14211g;

    /* renamed from: h */
    private final SparseArray<String> f14212h;

    @SafeParcelable.Constructor
    StringToIntConverter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zaa> arrayList) {
        this.f14210f = i;
        this.f14211g = new HashMap<>();
        this.f14212h = new SparseArray<>();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaa zaa2 = arrayList.get(i2);
            i2++;
            zaa zaa3 = zaa2;
            mo25437a(zaa3.f14214g, zaa3.f14215h);
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public final StringToIntConverter mo25437a(String str, int i) {
        this.f14211g.put(str, Integer.valueOf(i));
        this.f14212h.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14210f);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f14211g.keySet()) {
            arrayList.add(new zaa(next, this.f14211g.get(next).intValue()));
        }
        SafeParcelWriter.m16155c(parcel, 2, arrayList, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25438a(Object obj) {
        String str = this.f14212h.get(((Integer) obj).intValue());
        return (str != null || !this.f14211g.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    @SafeParcelable.Class
    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new zad();
        @SafeParcelable.VersionField

        /* renamed from: f */
        private final int f14213f;
        @SafeParcelable.Field

        /* renamed from: g */
        final String f14214g;
        @SafeParcelable.Field

        /* renamed from: h */
        final int f14215h;

        @SafeParcelable.Constructor
        zaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
            this.f14213f = i;
            this.f14214g = str;
            this.f14215h = i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = SafeParcelWriter.m16131a(parcel);
            SafeParcelWriter.m16135a(parcel, 1, this.f14213f);
            SafeParcelWriter.m16143a(parcel, 2, this.f14214g, false);
            SafeParcelWriter.m16135a(parcel, 3, this.f14215h);
            SafeParcelWriter.m16132a(parcel, a);
        }

        zaa(String str, int i) {
            this.f14213f = 1;
            this.f14214g = str;
            this.f14215h = i;
        }
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.f14210f = 1;
        this.f14211g = new HashMap<>();
        this.f14212h = new SparseArray<>();
    }
}
