package org.parceler.p399h;

import android.os.Parcel;
import org.parceler.C12418c;

/* renamed from: org.parceler.h.b */
/* compiled from: BooleanArrayParcelConverter */
public class C12428b implements C12418c<boolean[]> {
    /* renamed from: a */
    public void mo40475a(boolean[] zArr, Parcel parcel) {
        if (zArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(zArr.length);
        parcel.writeBooleanArray(zArr);
    }

    /* renamed from: a */
    public boolean[] m40858a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        boolean[] zArr = new boolean[readInt];
        parcel.readBooleanArray(zArr);
        return zArr;
    }
}
