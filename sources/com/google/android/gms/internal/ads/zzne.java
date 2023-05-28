package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

public final class zzne implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzne> CREATOR = new n10();

    /* renamed from: f */
    private final zza[] f22335f;

    /* renamed from: g */
    private int f22336g;

    /* renamed from: h */
    public final int f22337h;

    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new o10();

        /* renamed from: f */
        private int f22338f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final UUID f22339g;

        /* renamed from: h */
        private final String f22340h;

        /* renamed from: i */
        private final byte[] f22341i;

        /* renamed from: j */
        public final boolean f22342j;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zza = (zza) obj;
            return this.f22340h.equals(zza.f22340h) && zzsy.m25289a((Object) this.f22339g, (Object) zza.f22339g) && Arrays.equals(this.f22341i, zza.f22341i);
        }

        public final int hashCode() {
            if (this.f22338f == 0) {
                this.f22338f = (((this.f22339g.hashCode() * 31) + this.f22340h.hashCode()) * 31) + Arrays.hashCode(this.f22341i);
            }
            return this.f22338f;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f22339g.getMostSignificantBits());
            parcel.writeLong(this.f22339g.getLeastSignificantBits());
            parcel.writeString(this.f22340h);
            parcel.writeByteArray(this.f22341i);
            parcel.writeByte(this.f22342j ? (byte) 1 : 0);
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            zzsk.m25214a(uuid);
            this.f22339g = uuid;
            zzsk.m25214a(str);
            this.f22340h = str;
            zzsk.m25214a(bArr);
            this.f22341i = bArr;
            this.f22342j = false;
        }

        zza(Parcel parcel) {
            this.f22339g = new UUID(parcel.readLong(), parcel.readLong());
            this.f22340h = parcel.readString();
            this.f22341i = parcel.createByteArray();
            this.f22342j = parcel.readByte() != 0;
        }
    }

    public zzne(zza... zzaArr) {
        this(true, zzaArr);
    }

    /* renamed from: a */
    public final zza mo29554a(int i) {
        return this.f22335f[i];
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zza zza2 = (zza) obj;
        zza zza3 = (zza) obj2;
        if (zzkt.f22164b.equals(zza2.f22339g)) {
            return zzkt.f22164b.equals(zza3.f22339g) ? 0 : 1;
        }
        return zza2.f22339g.compareTo(zza3.f22339g);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzne.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f22335f, ((zzne) obj).f22335f);
    }

    public final int hashCode() {
        if (this.f22336g == 0) {
            this.f22336g = Arrays.hashCode(this.f22335f);
        }
        return this.f22336g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f22335f, 0);
    }

    private zzne(boolean z, zza... zzaArr) {
        zza[] zzaArr2 = (zza[]) zzaArr.clone();
        Arrays.sort(zzaArr2, this);
        int i = 1;
        while (i < zzaArr2.length) {
            if (!zzaArr2[i - 1].f22339g.equals(zzaArr2[i].f22339g)) {
                i++;
            } else {
                String valueOf = String.valueOf(zzaArr2[i].f22339g);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f22335f = zzaArr2;
        this.f22337h = zzaArr2.length;
    }

    zzne(Parcel parcel) {
        zza[] zzaArr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.f22335f = zzaArr;
        this.f22337h = zzaArr.length;
    }
}
