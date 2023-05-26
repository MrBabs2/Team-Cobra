package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzd();
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f23593f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f23594g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final long f23595h;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j) {
        DetectedActivity.m26803a(i);
        ActivityTransition.m26796a(i2);
        this.f23593f = i;
        this.f23594g = i2;
        this.f23595h = j;
    }

    /* renamed from: d */
    public int mo30528d() {
        return this.f23593f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f23593f == activityTransitionEvent.f23593f && this.f23594g == activityTransitionEvent.f23594g && this.f23595h == activityTransitionEvent.f23595h;
    }

    public int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f23593f), Integer.valueOf(this.f23594g), Long.valueOf(this.f23595h));
    }

    /* renamed from: o */
    public long mo30531o() {
        return this.f23595h;
    }

    /* renamed from: p */
    public int mo30532p() {
        return this.f23594g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f23593f;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f23594g;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f23595h;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, mo30528d());
        SafeParcelWriter.m16135a(parcel, 2, mo30532p());
        SafeParcelWriter.m16136a(parcel, 3, mo30531o());
        SafeParcelWriter.m16132a(parcel, a);
    }
}
