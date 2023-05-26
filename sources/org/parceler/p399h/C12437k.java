package org.parceler.p399h;

import android.os.Parcel;
import org.parceler.C12418c;

/* renamed from: org.parceler.h.k */
/* compiled from: NullableParcelConverter */
public abstract class C12437k<T> implements C12418c<T> {
    /* renamed from: a */
    public void mo40475a(T t, Parcel parcel) {
        if (t == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        mo40364b(t, parcel);
    }

    /* renamed from: b */
    public abstract T mo40363b(Parcel parcel);

    /* renamed from: b */
    public abstract void mo40364b(T t, Parcel parcel);

    /* renamed from: a */
    public T mo40474a(Parcel parcel) {
        if (parcel.readInt() == -1) {
            return null;
        }
        return mo40363b(parcel);
    }
}
