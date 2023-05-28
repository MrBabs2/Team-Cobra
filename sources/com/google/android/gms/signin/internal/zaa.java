package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f23691f;
    @SafeParcelable.Field

    /* renamed from: g */
    private int f23692g;
    @SafeParcelable.Field

    /* renamed from: h */
    private Intent f23693h;

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) Intent intent) {
        this.f23691f = i;
        this.f23692g = i2;
        this.f23693h = intent;
    }

    public final Status getStatus() {
        if (this.f23692g == 0) {
            return Status.f13682j;
        }
        return Status.f13686n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23691f);
        SafeParcelWriter.m16135a(parcel, 2, this.f23692g);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) this.f23693h, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zaa() {
        this(0, (Intent) null);
    }

    private zaa(int i, Intent intent) {
        this(2, 0, (Intent) null);
    }
}
