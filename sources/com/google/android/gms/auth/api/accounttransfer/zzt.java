package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p050l.p066e.C4870b;

@SafeParcelable.Class
public class zzt extends zzaz {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    /* renamed from: m */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f13467m;
    @SafeParcelable.Indicator

    /* renamed from: f */
    private final Set<Integer> f13468f;
    @SafeParcelable.VersionField

    /* renamed from: g */
    private final int f13469g;
    @SafeParcelable.Field

    /* renamed from: h */
    private String f13470h;
    @SafeParcelable.Field

    /* renamed from: i */
    private int f13471i;
    @SafeParcelable.Field

    /* renamed from: j */
    private byte[] f13472j;
    @SafeParcelable.Field

    /* renamed from: k */
    private PendingIntent f13473k;
    @SafeParcelable.Field

    /* renamed from: l */
    private DeviceMetaData f13474l;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f13467m = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.m16206c("accountType", 2));
        f13467m.put("status", FastJsonResponse.Field.m16204b("status", 3));
        f13467m.put("transferBytes", FastJsonResponse.Field.m16201a("transferBytes", 4));
    }

    @SafeParcelable.Constructor
    zzt(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) PendingIntent pendingIntent, @SafeParcelable.Param(id = 6) DeviceMetaData deviceMetaData) {
        this.f13468f = set;
        this.f13469g = i;
        this.f13470h = str;
        this.f13471i = i2;
        this.f13472j = bArr;
        this.f13473k = pendingIntent;
        this.f13474l = deviceMetaData;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo24664a(FastJsonResponse.Field field) {
        int d = field.mo25454d();
        if (d == 1) {
            return Integer.valueOf(this.f13469g);
        }
        if (d == 2) {
            return this.f13470h;
        }
        if (d == 3) {
            return Integer.valueOf(this.f13471i);
        }
        if (d == 4) {
            return this.f13472j;
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
        return this.f13468f.contains(Integer.valueOf(field.mo25454d()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        Set<Integer> set = this.f13468f;
        if (set.contains(1)) {
            SafeParcelWriter.m16135a(parcel, 1, this.f13469g);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m16143a(parcel, 2, this.f13470h, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m16135a(parcel, 3, this.f13471i);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m16147a(parcel, 4, this.f13472j, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.m16140a(parcel, 5, (Parcelable) this.f13473k, i, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.m16140a(parcel, 6, (Parcelable) this.f13474l, i, true);
        }
        SafeParcelWriter.m16132a(parcel, a);
    }

    /* renamed from: a */
    public /* synthetic */ Map mo24665a() {
        return f13467m;
    }

    public zzt() {
        this.f13468f = new C4870b(3);
        this.f13469g = 1;
    }
}
