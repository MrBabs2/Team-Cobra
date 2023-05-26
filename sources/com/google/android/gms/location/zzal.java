package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();
    @SafeParcelable.Field

    /* renamed from: f */
    private final List<String> f23647f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final PendingIntent f23648g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String f23649h;

    @SafeParcelable.Constructor
    zzal(@SafeParcelable.Param(id = 1) List<String> list, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 3) String str) {
        this.f23647f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f23648g = pendingIntent;
        this.f23649h = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16153b(parcel, 1, this.f23647f, false);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f23648g, i, false);
        SafeParcelWriter.m16143a(parcel, 3, this.f23649h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
