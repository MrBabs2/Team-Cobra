package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
@KeepForSdk
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C7237i();

    /* renamed from: f */
    private IBinder f14080f;

    public BinderWrapper() {
        this.f14080f = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f14080f);
    }

    private BinderWrapper(Parcel parcel) {
        this.f14080f = null;
        this.f14080f = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C7237i iVar) {
        this(parcel);
    }
}
