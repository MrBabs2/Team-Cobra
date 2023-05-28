package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    /* renamed from: k */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f13447k;
    @SafeParcelable.Indicator

    /* renamed from: f */
    private final Set<Integer> f13448f;
    @SafeParcelable.VersionField

    /* renamed from: g */
    private final int f13449g;
    @SafeParcelable.Field

    /* renamed from: h */
    private ArrayList<zzr> f13450h;
    @SafeParcelable.Field

    /* renamed from: i */
    private int f13451i;
    @SafeParcelable.Field

    /* renamed from: j */
    private zzo f13452j;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f13447k = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.m16205b("authenticatorData", 2, zzr.class));
        f13447k.put("progress", FastJsonResponse.Field.m16202a("progress", 4, zzo.class));
    }

    @SafeParcelable.Constructor
    zzl(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zzr> arrayList, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) zzo zzo) {
        this.f13448f = set;
        this.f13449g = i;
        this.f13450h = arrayList;
        this.f13451i = i2;
        this.f13452j = zzo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo24664a(FastJsonResponse.Field field) {
        int d = field.mo25454d();
        if (d == 1) {
            return Integer.valueOf(this.f13449g);
        }
        if (d == 2) {
            return this.f13450h;
        }
        if (d == 4) {
            return this.f13452j;
        }
        int d2 = field.mo25454d();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(d2);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo24666b(FastJsonResponse.Field field) {
        return this.f13448f.contains(Integer.valueOf(field.mo25454d()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        Set<Integer> set = this.f13448f;
        if (set.contains(1)) {
            SafeParcelWriter.m16135a(parcel, 1, this.f13449g);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m16155c(parcel, 2, this.f13450h, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m16135a(parcel, 3, this.f13451i);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m16140a(parcel, 4, (Parcelable) this.f13452j, i, true);
        }
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zzl() {
        this.f13448f = new HashSet(1);
        this.f13449g = 1;
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo24665a() {
        return f13447k;
    }
}
