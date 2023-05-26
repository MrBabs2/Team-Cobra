package org.parceler.p399h;

import android.os.Parcel;
import android.util.SparseArray;
import org.parceler.C12418c;

/* renamed from: org.parceler.h.l */
/* compiled from: SparseArrayParcelConverter */
public abstract class C12438l<T> implements C12418c<SparseArray<T>> {
    /* renamed from: b */
    public abstract T mo40419b(Parcel parcel);

    /* renamed from: b */
    public abstract void mo40420b(T t, Parcel parcel);

    /* renamed from: a */
    public void mo40475a(SparseArray<T> sparseArray, Parcel parcel) {
        if (sparseArray == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            parcel.writeInt(sparseArray.keyAt(i));
            mo40420b(sparseArray.valueAt(i), parcel);
        }
    }

    /* renamed from: a */
    public SparseArray<T> m40894a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        SparseArray<T> sparseArray = new SparseArray<>(readInt);
        for (int i = 0; i < readInt; i++) {
            sparseArray.append(parcel.readInt(), mo40419b(parcel));
        }
        return sparseArray;
    }
}
