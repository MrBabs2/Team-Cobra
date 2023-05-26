package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {

    /* renamed from: g */
    private final Parcelable.Creator<T> f14035g;

    @KeepForSdk
    public T get(int i) {
        DataHolder dataHolder = this.f14024f;
        byte[] b = dataHolder.mo25228b("data", i, dataHolder.mo25227a(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(b, 0, b.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.f14035g.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}
