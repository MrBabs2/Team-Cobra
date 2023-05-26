package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzg();
    @SafeParcelable.Field

    /* renamed from: f */
    private final List<ActivityTransitionEvent> f23600f;

    @SafeParcelable.Constructor
    public ActivityTransitionResult(@SafeParcelable.Param(id = 1) List<ActivityTransitionEvent> list) {
        Preconditions.m16038a(list, (Object) "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                Preconditions.m16043a(list.get(i).mo30531o() >= list.get(i + -1).mo30531o());
            }
        }
        this.f23600f = Collections.unmodifiableList(list);
    }

    /* renamed from: d */
    public List<ActivityTransitionEvent> mo30539d() {
        return this.f23600f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityTransitionResult.class != obj.getClass()) {
            return false;
        }
        return this.f23600f.equals(((ActivityTransitionResult) obj).f23600f);
    }

    public int hashCode() {
        return this.f23600f.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16155c(parcel, 1, mo30539d(), false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
