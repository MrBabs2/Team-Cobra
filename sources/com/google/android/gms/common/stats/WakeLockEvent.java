package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14248f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final long f14249g;
    @SafeParcelable.Field

    /* renamed from: h */
    private int f14250h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final String f14251i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final String f14252j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final String f14253k;
    @SafeParcelable.Field

    /* renamed from: l */
    private final int f14254l;
    @SafeParcelable.Field

    /* renamed from: m */
    private final List<String> f14255m;
    @SafeParcelable.Field

    /* renamed from: n */
    private final String f14256n;
    @SafeParcelable.Field

    /* renamed from: o */
    private final long f14257o;
    @SafeParcelable.Field

    /* renamed from: p */
    private int f14258p;
    @SafeParcelable.Field

    /* renamed from: q */
    private final String f14259q;
    @SafeParcelable.Field

    /* renamed from: r */
    private final float f14260r;
    @SafeParcelable.Field

    /* renamed from: s */
    private final long f14261s;
    @SafeParcelable.Field

    /* renamed from: t */
    private final boolean f14262t;

    /* renamed from: u */
    private long f14263u = -1;

    @SafeParcelable.Constructor
    WakeLockEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 14) int i4, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f, @SafeParcelable.Param(id = 16) long j3, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
        this.f14248f = i;
        this.f14249g = j;
        this.f14250h = i2;
        this.f14251i = str;
        this.f14252j = str3;
        this.f14253k = str5;
        this.f14254l = i3;
        this.f14255m = list;
        this.f14256n = str2;
        this.f14257o = j2;
        this.f14258p = i4;
        this.f14259q = str4;
        this.f14260r = f;
        this.f14261s = j3;
        this.f14262t = z;
    }

    /* renamed from: d */
    public final int mo25489d() {
        return this.f14250h;
    }

    /* renamed from: o */
    public final long mo25490o() {
        return this.f14249g;
    }

    /* renamed from: p */
    public final long mo25491p() {
        return this.f14263u;
    }

    /* renamed from: q */
    public final String mo25492q() {
        String str;
        String str2 = this.f14251i;
        int i = this.f14254l;
        List<String> list = this.f14255m;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f14258p;
        String str4 = this.f14252j;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f14259q;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f14260r;
        String str6 = this.f14253k;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f14262t;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(str).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str3).length());
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14248f);
        SafeParcelWriter.m16136a(parcel, 2, mo25490o());
        SafeParcelWriter.m16143a(parcel, 4, this.f14251i, false);
        SafeParcelWriter.m16135a(parcel, 5, this.f14254l);
        SafeParcelWriter.m16153b(parcel, 6, this.f14255m, false);
        SafeParcelWriter.m16136a(parcel, 8, this.f14257o);
        SafeParcelWriter.m16143a(parcel, 10, this.f14252j, false);
        SafeParcelWriter.m16135a(parcel, 11, mo25489d());
        SafeParcelWriter.m16143a(parcel, 12, this.f14256n, false);
        SafeParcelWriter.m16143a(parcel, 13, this.f14259q, false);
        SafeParcelWriter.m16135a(parcel, 14, this.f14258p);
        SafeParcelWriter.m16134a(parcel, 15, this.f14260r);
        SafeParcelWriter.m16136a(parcel, 16, this.f14261s);
        SafeParcelWriter.m16143a(parcel, 17, this.f14253k, false);
        SafeParcelWriter.m16146a(parcel, 18, this.f14262t);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
