package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzi();

    /* renamed from: h */
    private static final int[] f23601h = {0, 1, 2, 3, 7, 8, 16, 17};
    @SafeParcelable.Field

    /* renamed from: f */
    private int f23602f;
    @SafeParcelable.Field

    /* renamed from: g */
    private int f23603g;

    static {
        new C8390d();
    }

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f23602f = i;
        this.f23603g = i2;
    }

    /* renamed from: a */
    public static void m26803a(int i) {
        boolean z = false;
        for (int i2 : f23601h) {
            if (i2 == i) {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(81);
            sb.append(i);
            sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            Log.w("DetectedActivity", sb.toString());
        }
    }

    /* renamed from: d */
    public int mo30543d() {
        return this.f23603g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DetectedActivity.class == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            return this.f23602f == detectedActivity.f23602f && this.f23603g == detectedActivity.f23603g;
        }
    }

    public int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f23602f), Integer.valueOf(this.f23603g));
    }

    /* renamed from: o */
    public int mo30546o() {
        int i = this.f23602f;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    public String toString() {
        String str;
        int o = mo30546o();
        if (o == 0) {
            str = "IN_VEHICLE";
        } else if (o == 1) {
            str = "ON_BICYCLE";
        } else if (o == 2) {
            str = "ON_FOOT";
        } else if (o == 3) {
            str = "STILL";
        } else if (o == 4) {
            str = "UNKNOWN";
        } else if (o == 5) {
            str = "TILTING";
        } else if (o == 7) {
            str = "WALKING";
        } else if (o != 8) {
            switch (o) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(o);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i = this.f23603g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23602f);
        SafeParcelWriter.m16135a(parcel, 2, this.f23603g);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
