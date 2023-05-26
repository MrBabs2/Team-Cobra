package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzlh implements Parcelable {
    public static final Parcelable.Creator<zzlh> CREATOR = new u00();

    /* renamed from: A */
    private final int f22178A;

    /* renamed from: B */
    public final long f22179B;

    /* renamed from: C */
    public final int f22180C;

    /* renamed from: D */
    public final String f22181D;

    /* renamed from: E */
    private final int f22182E;

    /* renamed from: F */
    private int f22183F;

    /* renamed from: f */
    private final String f22184f;

    /* renamed from: g */
    public final int f22185g;

    /* renamed from: h */
    public final String f22186h;

    /* renamed from: i */
    private final zzpo f22187i;

    /* renamed from: j */
    private final String f22188j;

    /* renamed from: k */
    public final String f22189k;

    /* renamed from: l */
    public final int f22190l;

    /* renamed from: m */
    public final List<byte[]> f22191m;

    /* renamed from: n */
    public final zzne f22192n;

    /* renamed from: o */
    public final int f22193o;

    /* renamed from: p */
    public final int f22194p;

    /* renamed from: q */
    public final float f22195q;

    /* renamed from: r */
    public final int f22196r;

    /* renamed from: s */
    public final float f22197s;

    /* renamed from: t */
    private final int f22198t;

    /* renamed from: u */
    private final byte[] f22199u;

    /* renamed from: v */
    private final zztb f22200v;

    /* renamed from: w */
    public final int f22201w;

    /* renamed from: x */
    public final int f22202x;

    /* renamed from: y */
    public final int f22203y;

    /* renamed from: z */
    private final int f22204z;

    private zzlh(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zztb zztb, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zzne zzne, zzpo zzpo) {
        this.f22184f = str;
        this.f22188j = str2;
        this.f22189k = str3;
        this.f22186h = str4;
        this.f22185g = i;
        this.f22190l = i2;
        this.f22193o = i3;
        this.f22194p = i4;
        this.f22195q = f;
        this.f22196r = i5;
        this.f22197s = f2;
        this.f22199u = bArr;
        this.f22198t = i6;
        this.f22200v = zztb;
        this.f22201w = i7;
        this.f22202x = i8;
        this.f22203y = i9;
        this.f22204z = i10;
        this.f22178A = i11;
        this.f22180C = i12;
        this.f22181D = str5;
        this.f22182E = i13;
        this.f22179B = j;
        this.f22191m = list == null ? Collections.emptyList() : list;
        this.f22192n = zzne;
        this.f22187i = zzpo;
    }

    /* renamed from: a */
    public static zzlh m24749a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zztb zztb, zzne zzne) {
        return new zzlh(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zztb, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, zzne, (zzpo) null);
    }

    /* renamed from: b */
    public final int mo29471b() {
        int i;
        int i2 = this.f22193o;
        if (i2 == -1 || (i = this.f22194p) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlh.class == obj.getClass()) {
            zzlh zzlh = (zzlh) obj;
            if (this.f22185g == zzlh.f22185g && this.f22190l == zzlh.f22190l && this.f22193o == zzlh.f22193o && this.f22194p == zzlh.f22194p && this.f22195q == zzlh.f22195q && this.f22196r == zzlh.f22196r && this.f22197s == zzlh.f22197s && this.f22198t == zzlh.f22198t && this.f22201w == zzlh.f22201w && this.f22202x == zzlh.f22202x && this.f22203y == zzlh.f22203y && this.f22204z == zzlh.f22204z && this.f22178A == zzlh.f22178A && this.f22179B == zzlh.f22179B && this.f22180C == zzlh.f22180C && zzsy.m25289a((Object) this.f22184f, (Object) zzlh.f22184f) && zzsy.m25289a((Object) this.f22181D, (Object) zzlh.f22181D) && this.f22182E == zzlh.f22182E && zzsy.m25289a((Object) this.f22188j, (Object) zzlh.f22188j) && zzsy.m25289a((Object) this.f22189k, (Object) zzlh.f22189k) && zzsy.m25289a((Object) this.f22186h, (Object) zzlh.f22186h) && zzsy.m25289a((Object) this.f22192n, (Object) zzlh.f22192n) && zzsy.m25289a((Object) this.f22187i, (Object) zzlh.f22187i) && zzsy.m25289a((Object) this.f22200v, (Object) zzlh.f22200v) && Arrays.equals(this.f22199u, zzlh.f22199u) && this.f22191m.size() == zzlh.f22191m.size()) {
                for (int i = 0; i < this.f22191m.size(); i++) {
                    if (!Arrays.equals(this.f22191m.get(i), zzlh.f22191m.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f22183F == 0) {
            String str = this.f22184f;
            int i = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f22188j;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f22189k;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f22186h;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f22185g) * 31) + this.f22193o) * 31) + this.f22194p) * 31) + this.f22201w) * 31) + this.f22202x) * 31;
            String str5 = this.f22181D;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f22182E) * 31;
            zzne zzne = this.f22192n;
            int hashCode6 = (hashCode5 + (zzne == null ? 0 : zzne.hashCode())) * 31;
            zzpo zzpo = this.f22187i;
            if (zzpo != null) {
                i = zzpo.hashCode();
            }
            this.f22183F = hashCode6 + i;
        }
        return this.f22183F;
    }

    public final String toString() {
        String str = this.f22184f;
        String str2 = this.f22188j;
        String str3 = this.f22189k;
        int i = this.f22185g;
        String str4 = this.f22181D;
        int i2 = this.f22193o;
        int i3 = this.f22194p;
        float f = this.f22195q;
        int i4 = this.f22201w;
        int i5 = this.f22202x;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22184f);
        parcel.writeString(this.f22188j);
        parcel.writeString(this.f22189k);
        parcel.writeString(this.f22186h);
        parcel.writeInt(this.f22185g);
        parcel.writeInt(this.f22190l);
        parcel.writeInt(this.f22193o);
        parcel.writeInt(this.f22194p);
        parcel.writeFloat(this.f22195q);
        parcel.writeInt(this.f22196r);
        parcel.writeFloat(this.f22197s);
        parcel.writeInt(this.f22199u != null ? 1 : 0);
        byte[] bArr = this.f22199u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f22198t);
        parcel.writeParcelable(this.f22200v, i);
        parcel.writeInt(this.f22201w);
        parcel.writeInt(this.f22202x);
        parcel.writeInt(this.f22203y);
        parcel.writeInt(this.f22204z);
        parcel.writeInt(this.f22178A);
        parcel.writeInt(this.f22180C);
        parcel.writeString(this.f22181D);
        parcel.writeInt(this.f22182E);
        parcel.writeLong(this.f22179B);
        int size = this.f22191m.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f22191m.get(i2));
        }
        parcel.writeParcelable(this.f22192n, 0);
        parcel.writeParcelable(this.f22187i, 0);
    }

    /* renamed from: a */
    public static zzlh m24751a(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zzne zzne, int i5, String str4) {
        return m24750a(str, str2, (String) null, -1, -1, i3, i4, -1, (List<byte[]>) null, zzne, 0, str4);
    }

    /* renamed from: a */
    public static zzlh m24750a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zzne zzne, int i6, String str4) {
        return new zzlh(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zztb) null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zzne, (zzpo) null);
    }

    /* renamed from: a */
    public static zzlh m24753a(String str, String str2, String str3, int i, int i2, String str4, zzne zzne) {
        return m24752a(str, str2, (String) null, -1, i2, str4, -1, zzne, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static zzlh m24752a(String str, String str2, String str3, int i, int i2, String str4, int i3, zzne zzne, long j, List<byte[]> list) {
        return new zzlh(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zztb) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzne, (zzpo) null);
    }

    /* renamed from: a */
    public static zzlh m24755a(String str, String str2, String str3, int i, List<byte[]> list, String str4, zzne zzne) {
        return new zzlh(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zztb) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzne, (zzpo) null);
    }

    /* renamed from: a */
    public static zzlh m24754a(String str, String str2, String str3, int i, zzne zzne) {
        return new zzlh(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zztb) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzne) null, (zzpo) null);
    }

    /* renamed from: a */
    public final zzlh mo29467a(int i) {
        String str = this.f22184f;
        return new zzlh(str, this.f22188j, this.f22189k, this.f22186h, this.f22185g, i, this.f22193o, this.f22194p, this.f22195q, this.f22196r, this.f22197s, this.f22199u, this.f22198t, this.f22200v, this.f22201w, this.f22202x, this.f22203y, this.f22204z, this.f22178A, this.f22180C, this.f22181D, this.f22182E, this.f22179B, this.f22191m, this.f22192n, this.f22187i);
    }

    /* renamed from: a */
    public final zzlh mo29469a(long j) {
        return new zzlh(this.f22184f, this.f22188j, this.f22189k, this.f22186h, this.f22185g, this.f22190l, this.f22193o, this.f22194p, this.f22195q, this.f22196r, this.f22197s, this.f22199u, this.f22198t, this.f22200v, this.f22201w, this.f22202x, this.f22203y, this.f22204z, this.f22178A, this.f22180C, this.f22181D, this.f22182E, j, this.f22191m, this.f22192n, this.f22187i);
    }

    /* renamed from: a */
    public final zzlh mo29468a(int i, int i2) {
        String str = this.f22184f;
        return new zzlh(str, this.f22188j, this.f22189k, this.f22186h, this.f22185g, this.f22190l, this.f22193o, this.f22194p, this.f22195q, this.f22196r, this.f22197s, this.f22199u, this.f22198t, this.f22200v, this.f22201w, this.f22202x, this.f22203y, i, i2, this.f22180C, this.f22181D, this.f22182E, this.f22179B, this.f22191m, this.f22192n, this.f22187i);
    }

    /* renamed from: a */
    public final zzlh mo29470a(zzpo zzpo) {
        String str = this.f22184f;
        return new zzlh(str, this.f22188j, this.f22189k, this.f22186h, this.f22185g, this.f22190l, this.f22193o, this.f22194p, this.f22195q, this.f22196r, this.f22197s, this.f22199u, this.f22198t, this.f22200v, this.f22201w, this.f22202x, this.f22203y, this.f22204z, this.f22178A, this.f22180C, this.f22181D, this.f22182E, this.f22179B, this.f22191m, this.f22192n, zzpo);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: a */
    public final MediaFormat mo29466a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f22189k);
        String str = this.f22181D;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m24756a(mediaFormat, "max-input-size", this.f22190l);
        m24756a(mediaFormat, "width", this.f22193o);
        m24756a(mediaFormat, "height", this.f22194p);
        float f = this.f22195q;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m24756a(mediaFormat, "rotation-degrees", this.f22196r);
        m24756a(mediaFormat, "channel-count", this.f22201w);
        m24756a(mediaFormat, "sample-rate", this.f22202x);
        m24756a(mediaFormat, "encoder-delay", this.f22204z);
        m24756a(mediaFormat, "encoder-padding", this.f22178A);
        for (int i = 0; i < this.f22191m.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f22191m.get(i)));
        }
        zztb zztb = this.f22200v;
        if (zztb != null) {
            m24756a(mediaFormat, "color-transfer", zztb.f22681h);
            m24756a(mediaFormat, "color-standard", zztb.f22679f);
            m24756a(mediaFormat, "color-range", zztb.f22680g);
            byte[] bArr = zztb.f22682i;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    zzlh(Parcel parcel) {
        this.f22184f = parcel.readString();
        this.f22188j = parcel.readString();
        this.f22189k = parcel.readString();
        this.f22186h = parcel.readString();
        this.f22185g = parcel.readInt();
        this.f22190l = parcel.readInt();
        this.f22193o = parcel.readInt();
        this.f22194p = parcel.readInt();
        this.f22195q = parcel.readFloat();
        this.f22196r = parcel.readInt();
        this.f22197s = parcel.readFloat();
        this.f22199u = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f22198t = parcel.readInt();
        this.f22200v = (zztb) parcel.readParcelable(zztb.class.getClassLoader());
        this.f22201w = parcel.readInt();
        this.f22202x = parcel.readInt();
        this.f22203y = parcel.readInt();
        this.f22204z = parcel.readInt();
        this.f22178A = parcel.readInt();
        this.f22180C = parcel.readInt();
        this.f22181D = parcel.readString();
        this.f22182E = parcel.readInt();
        this.f22179B = parcel.readLong();
        int readInt = parcel.readInt();
        this.f22191m = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f22191m.add(parcel.createByteArray());
        }
        this.f22192n = (zzne) parcel.readParcelable(zzne.class.getClassLoader());
        this.f22187i = (zzpo) parcel.readParcelable(zzpo.class.getClassLoader());
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m24756a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
