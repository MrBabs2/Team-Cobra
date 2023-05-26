package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

@SafeParcelable.Class
@SafeParcelable.Reserved
@VisibleForTesting
public final class zzbh extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f23181f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final long f23182g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final short f23183h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final double f23184i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final double f23185j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final float f23186k;
    @SafeParcelable.Field

    /* renamed from: l */
    private final int f23187l;
    @SafeParcelable.Field

    /* renamed from: m */
    private final int f23188m;
    @SafeParcelable.Field

    /* renamed from: n */
    private final int f23189n;

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 3) short s, @SafeParcelable.Param(id = 4) double d, @SafeParcelable.Param(id = 5) double d2, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 8) int i2, @SafeParcelable.Param(id = 9) int i3) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f23183h = s;
                this.f23181f = str;
                this.f23184i = d;
                this.f23185j = d2;
                this.f23186k = f;
                this.f23182g = j;
                this.f23187l = i4;
                this.f23188m = i2;
                this.f23189n = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: d */
    public final String mo30046d() {
        return this.f23181f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.f23186k == zzbh.f23186k && this.f23184i == zzbh.f23184i && this.f23185j == zzbh.f23185j && this.f23183h == zzbh.f23183h;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f23184i);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f23185j);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f23186k)) * 31) + this.f23183h) * 31) + this.f23187l;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f23183h != 1 ? null : "CIRCLE";
        objArr[1] = this.f23181f.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f23187l);
        objArr[3] = Double.valueOf(this.f23184i);
        objArr[4] = Double.valueOf(this.f23185j);
        objArr[5] = Float.valueOf(this.f23186k);
        objArr[6] = Integer.valueOf(this.f23188m / 1000);
        objArr[7] = Integer.valueOf(this.f23189n);
        objArr[8] = Long.valueOf(this.f23182g);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, mo30046d(), false);
        SafeParcelWriter.m16136a(parcel, 2, this.f23182g);
        SafeParcelWriter.m16145a(parcel, 3, this.f23183h);
        SafeParcelWriter.m16133a(parcel, 4, this.f23184i);
        SafeParcelWriter.m16133a(parcel, 5, this.f23185j);
        SafeParcelWriter.m16134a(parcel, 6, this.f23186k);
        SafeParcelWriter.m16135a(parcel, 7, this.f23187l);
        SafeParcelWriter.m16135a(parcel, 8, this.f23188m);
        SafeParcelWriter.m16135a(parcel, 9, this.f23189n);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
