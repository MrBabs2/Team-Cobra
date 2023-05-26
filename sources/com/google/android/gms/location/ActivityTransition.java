package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f23591f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f23592g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    public static class Builder {
    }

    @SafeParcelable.Constructor
    ActivityTransition(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f23591f = i;
        this.f23592g = i2;
    }

    /* renamed from: a */
    public static void m26796a(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        Preconditions.m16044a(z, (Object) sb.toString());
    }

    /* renamed from: d */
    public int mo30522d() {
        return this.f23591f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f23591f == activityTransition.f23591f && this.f23592g == activityTransition.f23592g;
    }

    public int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f23591f), Integer.valueOf(this.f23592g));
    }

    /* renamed from: o */
    public int mo30525o() {
        return this.f23592g;
    }

    public String toString() {
        int i = this.f23591f;
        int i2 = this.f23592g;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, mo30522d());
        SafeParcelWriter.m16135a(parcel, 2, mo30525o());
        SafeParcelWriter.m16132a(parcel, a);
    }
}
