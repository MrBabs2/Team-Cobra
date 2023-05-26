package org.parceler.p399h;

import android.os.Parcel;
import java.util.Collection;
import org.parceler.C12426g;

/* renamed from: org.parceler.h.d */
/* compiled from: CollectionParcelConverter */
public abstract class C12430d<T, C extends Collection<T>> implements C12426g<Collection<T>, C> {
    /* renamed from: a */
    public abstract C mo40476a();

    /* renamed from: b */
    public abstract T mo40378b(Parcel parcel);

    /* renamed from: b */
    public abstract void mo40379b(T t, Parcel parcel);

    /* renamed from: a */
    public void mo40475a(Collection<T> collection, Parcel parcel) {
        if (collection == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(collection.size());
        for (T b : collection) {
            mo40379b(b, parcel);
        }
    }

    /* renamed from: a */
    public C m40865a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        C a = mo40476a();
        for (int i = 0; i < readInt; i++) {
            a.add(mo40378b(parcel));
        }
        return a;
    }
}
