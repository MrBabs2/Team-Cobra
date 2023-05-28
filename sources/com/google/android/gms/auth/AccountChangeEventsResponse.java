package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new zzc();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13416f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final List<AccountChangeEvent> f13417g;

    @SafeParcelable.Constructor
    AccountChangeEventsResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) List<AccountChangeEvent> list) {
        this.f13416f = i;
        Preconditions.m16037a(list);
        this.f13417g = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13416f);
        SafeParcelWriter.m16155c(parcel, 2, this.f13417g, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
