package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    /* renamed from: a */
    public static int m16131a(Parcel parcel) {
        return m16151b(parcel, 20293);
    }

    /* renamed from: b */
    private static void m16152b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: c */
    private static void m16154c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static void m16132a(Parcel parcel, int i) {
        m16154c(parcel, i);
    }

    /* renamed from: a */
    public static void m16146a(Parcel parcel, int i, boolean z) {
        m16152b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    private static int m16151b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: a */
    public static void m16145a(Parcel parcel, int i, short s) {
        m16152b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m16155c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int b = m16151b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m16150a(parcel, parcelable, 0);
                }
            }
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16135a(Parcel parcel, int i, int i2) {
        m16152b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: b */
    public static void m16153b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int b = m16151b(parcel, i);
            parcel.writeStringList(list);
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16141a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m16152b(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16136a(Parcel parcel, int i, long j) {
        m16152b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m16142a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m16152b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16134a(Parcel parcel, int i, float f) {
        m16152b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m16133a(Parcel parcel, int i, double d) {
        m16152b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m16143a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int b = m16151b(parcel, i);
            parcel.writeString(str);
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16138a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int b = m16151b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16140a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int b = m16151b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16137a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int b = m16151b(parcel, i);
            parcel.writeBundle(bundle);
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16147a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int b = m16151b(parcel, i);
            parcel.writeByteArray(bArr);
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16149a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int b = m16151b(parcel, i);
            parcel.writeStringArray(strArr);
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m16144a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int b = m16151b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m16148a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int b = m16151b(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m16150a(parcel, t, i2);
                }
            }
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m16150a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static void m16139a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int b = m16151b(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m16154c(parcel, b);
        } else if (z) {
            m16152b(parcel, i, 0);
        }
    }
}
