package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class zztb implements Parcelable {
    public static final Parcelable.Creator<zztb> CREATOR = new r30();

    /* renamed from: f */
    public final int f22679f;

    /* renamed from: g */
    public final int f22680g;

    /* renamed from: h */
    public final int f22681h;

    /* renamed from: i */
    public final byte[] f22682i;

    /* renamed from: j */
    private int f22683j;

    public zztb(int i, int i2, int i3, byte[] bArr) {
        this.f22679f = i;
        this.f22680g = i2;
        this.f22681h = i3;
        this.f22682i = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zztb.class == obj.getClass()) {
            zztb zztb = (zztb) obj;
            return this.f22679f == zztb.f22679f && this.f22680g == zztb.f22680g && this.f22681h == zztb.f22681h && Arrays.equals(this.f22682i, zztb.f22682i);
        }
    }

    public final int hashCode() {
        if (this.f22683j == 0) {
            this.f22683j = ((((((this.f22679f + 527) * 31) + this.f22680g) * 31) + this.f22681h) * 31) + Arrays.hashCode(this.f22682i);
        }
        return this.f22683j;
    }

    public final String toString() {
        int i = this.f22679f;
        int i2 = this.f22680g;
        int i3 = this.f22681h;
        boolean z = this.f22682i != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22679f);
        parcel.writeInt(this.f22680g);
        parcel.writeInt(this.f22681h);
        parcel.writeInt(this.f22682i != null ? 1 : 0);
        byte[] bArr = this.f22682i;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    zztb(Parcel parcel) {
        this.f22679f = parcel.readInt();
        this.f22680g = parcel.readInt();
        this.f22681h = parcel.readInt();
        this.f22682i = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
