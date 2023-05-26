package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.downloadmanager.Constants;

@SafeParcelable.Class
public class zzr extends zzaz {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* renamed from: l */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f13460l;
    @SafeParcelable.Indicator

    /* renamed from: f */
    private final Set<Integer> f13461f;
    @SafeParcelable.VersionField

    /* renamed from: g */
    private final int f13462g;
    @SafeParcelable.Field

    /* renamed from: h */
    private zzt f13463h;
    @SafeParcelable.Field

    /* renamed from: i */
    private String f13464i;
    @SafeParcelable.Field

    /* renamed from: j */
    private String f13465j;
    @SafeParcelable.Field

    /* renamed from: k */
    private String f13466k;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f13460l = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.m16202a("authenticatorInfo", 2, zzt.class));
        f13460l.put(RoomInstalled.SIGNATURE, FastJsonResponse.Field.m16206c(RoomInstalled.SIGNATURE, 3));
        f13460l.put(Constants.PACKAGE, FastJsonResponse.Field.m16206c(Constants.PACKAGE, 4));
    }

    public zzr() {
        this.f13461f = new HashSet(3);
        this.f13462g = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo24664a(FastJsonResponse.Field field) {
        int d = field.mo25454d();
        if (d == 1) {
            return Integer.valueOf(this.f13462g);
        }
        if (d == 2) {
            return this.f13463h;
        }
        if (d == 3) {
            return this.f13464i;
        }
        if (d == 4) {
            return this.f13465j;
        }
        int d2 = field.mo25454d();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(d2);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo24666b(FastJsonResponse.Field field) {
        return this.f13461f.contains(Integer.valueOf(field.mo25454d()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        Set<Integer> set = this.f13461f;
        if (set.contains(1)) {
            SafeParcelWriter.m16135a(parcel, 1, this.f13462g);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f13463h, i, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m16143a(parcel, 3, this.f13464i, true);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m16143a(parcel, 4, this.f13465j, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.m16143a(parcel, 5, this.f13466k, true);
        }
        SafeParcelWriter.m16132a(parcel, a);
    }

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzt zzt, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3) {
        this.f13461f = set;
        this.f13462g = i;
        this.f13463h = zzt;
        this.f13464i = str;
        this.f13465j = str2;
        this.f13466k = str3;
    }

    /* renamed from: a */
    public /* synthetic */ Map mo24665a() {
        return f13460l;
    }
}
