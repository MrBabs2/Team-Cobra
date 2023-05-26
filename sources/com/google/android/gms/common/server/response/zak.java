package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zan();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14236f;

    /* renamed from: g */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f14237g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String f14238h;

    @SafeParcelable.Constructor
    zak(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zal> arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.f14236f = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList.get(i2);
            String str2 = zal.f14240g;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.f14241h.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.f14241h.get(i3);
                hashMap2.put(zam.f14243g, zam.f14244h);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f14237g = hashMap;
        Preconditions.m16037a(str);
        this.f14238h = str;
        mo25468d();
    }

    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo25467a(String str) {
        return this.f14237g.get(str);
    }

    /* renamed from: d */
    public final void mo25468d() {
        for (String str : this.f14237g.keySet()) {
            Map map = this.f14237g.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo25453a(this);
            }
        }
    }

    /* renamed from: o */
    public final String mo25469o() {
        return this.f14238h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.f14237g.keySet()) {
            sb.append(next);
            sb.append(":\n");
            Map map = this.f14237g.get(next);
            for (String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14236f);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f14237g.keySet()) {
            arrayList.add(new zal(next, this.f14237g.get(next)));
        }
        SafeParcelWriter.m16155c(parcel, 2, arrayList, false);
        SafeParcelWriter.m16143a(parcel, 3, this.f14238h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
