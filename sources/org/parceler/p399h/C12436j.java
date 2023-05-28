package org.parceler.p399h;

import android.os.Parcel;
import java.util.Map;
import org.parceler.C12426g;

/* renamed from: org.parceler.h.j */
/* compiled from: MapParcelConverter */
public abstract class C12436j<K, V, M extends Map<K, V>> implements C12426g<Map<K, V>, M> {
    /* renamed from: a */
    public abstract M mo40480a();

    /* renamed from: b */
    public abstract K mo40396b(Parcel parcel);

    /* renamed from: b */
    public abstract void mo40397b(K k, Parcel parcel);

    /* renamed from: c */
    public abstract V mo40398c(Parcel parcel);

    /* renamed from: c */
    public abstract void mo40399c(V v, Parcel parcel);

    /* renamed from: a */
    public void mo40475a(Map<K, V> map, Parcel parcel) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            mo40397b(next.getKey(), parcel);
            mo40399c(next.getValue(), parcel);
        }
    }

    /* renamed from: a */
    public M m40882a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        M a = mo40480a();
        for (int i = 0; i < readInt; i++) {
            a.put(mo40396b(parcel), mo40398c(parcel));
        }
        return a;
    }
}
