package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: f */
    private List<DetectedActivity> f23586f;
    @SafeParcelable.Field

    /* renamed from: g */
    private long f23587g;
    @SafeParcelable.Field

    /* renamed from: h */
    private long f23588h;
    @SafeParcelable.Field

    /* renamed from: i */
    private int f23589i;
    @SafeParcelable.Field

    /* renamed from: j */
    private Bundle f23590j;

    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param(id = 1) List<DetectedActivity> list, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) Bundle bundle) {
        boolean z = true;
        Preconditions.m16044a(list != null && list.size() > 0, (Object) "Must have at least 1 detected activity");
        Preconditions.m16044a((j <= 0 || j2 <= 0) ? false : z, (Object) "Must set times");
        this.f23586f = list;
        this.f23587g = j;
        this.f23588h = j2;
        this.f23589i = i;
        this.f23590j = bundle;
    }

    /* renamed from: a */
    private static boolean m26795a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m26795a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityRecognitionResult.class == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f23587g == activityRecognitionResult.f23587g && this.f23588h == activityRecognitionResult.f23588h && this.f23589i == activityRecognitionResult.f23589i && Objects.m16031a(this.f23586f, activityRecognitionResult.f23586f) && m26795a(this.f23590j, activityRecognitionResult.f23590j);
        }
    }

    public int hashCode() {
        return Objects.m16029a(Long.valueOf(this.f23587g), Long.valueOf(this.f23588h), Integer.valueOf(this.f23589i), this.f23586f, this.f23590j);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f23586f);
        long j = this.f23587g;
        long j2 = this.f23588h;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16155c(parcel, 1, this.f23586f, false);
        SafeParcelWriter.m16136a(parcel, 2, this.f23587g);
        SafeParcelWriter.m16136a(parcel, 3, this.f23588h);
        SafeParcelWriter.m16135a(parcel, 4, this.f23589i);
        SafeParcelWriter.m16137a(parcel, 5, this.f23590j, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
