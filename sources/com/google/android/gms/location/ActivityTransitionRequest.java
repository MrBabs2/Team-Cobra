package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzf();

    /* renamed from: i */
    public static final Comparator<ActivityTransition> f23596i = new C8389c();
    @SafeParcelable.Field

    /* renamed from: f */
    private final List<ActivityTransition> f23597f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f23598g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final List<ClientIdentity> f23599h;

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@SafeParcelable.Param(id = 1) List<ActivityTransition> list, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List<ClientIdentity> list2) {
        Preconditions.m16038a(list, (Object) "transitions can't be null");
        Preconditions.m16044a(list.size() > 0, (Object) "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f23596i);
        for (ActivityTransition next : list) {
            Preconditions.m16044a(treeSet.add(next), (Object) String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.f23597f = Collections.unmodifiableList(list);
        this.f23598g = str;
        this.f23599h = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityTransitionRequest.class == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return Objects.m16031a(this.f23597f, activityTransitionRequest.f23597f) && Objects.m16031a(this.f23598g, activityTransitionRequest.f23598g) && Objects.m16031a(this.f23599h, activityTransitionRequest.f23599h);
        }
    }

    public int hashCode() {
        int hashCode = this.f23597f.hashCode() * 31;
        String str = this.f23598g;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f23599h;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f23597f);
        String str = this.f23598g;
        String valueOf2 = String.valueOf(this.f23599h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16155c(parcel, 1, this.f23597f, false);
        SafeParcelWriter.m16143a(parcel, 2, this.f23598g, false);
        SafeParcelWriter.m16155c(parcel, 3, this.f23599h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
