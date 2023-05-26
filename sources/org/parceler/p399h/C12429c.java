package org.parceler.p399h;

import android.os.Parcel;
import org.parceler.C12418c;

/* renamed from: org.parceler.h.c */
/* compiled from: CharArrayParcelConverter */
public class C12429c implements C12418c<char[]> {
    /* renamed from: a */
    public void mo40475a(char[] cArr, Parcel parcel) {
        if (cArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(cArr.length);
        parcel.writeCharArray(cArr);
    }

    /* renamed from: a */
    public char[] m40862a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        char[] cArr = new char[readInt];
        parcel.readCharArray(cArr);
        return cArr;
    }
}
