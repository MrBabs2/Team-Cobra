package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzvs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvs> CREATOR = new zzvt();
    @SafeParcelable.Field

    /* renamed from: f */
    private ParcelFileDescriptor f22853f;

    public zzvs() {
        this((ParcelFileDescriptor) null);
    }

    /* renamed from: p */
    private final synchronized ParcelFileDescriptor m25446p() {
        return this.f22853f;
    }

    /* renamed from: d */
    public final synchronized boolean mo29845d() {
        return this.f22853f != null;
    }

    /* renamed from: o */
    public final synchronized InputStream mo29846o() {
        if (this.f22853f == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f22853f);
        this.f22853f = null;
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) m25446p(), i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzvs(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f22853f = parcelFileDescriptor;
    }
}
