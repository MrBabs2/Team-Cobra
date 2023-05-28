package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import okhttp3.internal.http2.Settings;

public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private SafeParcelReader() {
    }

    /* renamed from: A */
    public static short m16094A(Parcel parcel, int i) {
        m16101a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: B */
    public static int m16095B(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE : parcel.readInt();
    }

    /* renamed from: C */
    public static void m16096C(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m16095B(parcel, i));
    }

    /* renamed from: a */
    public static int m16097a(int i) {
        return i & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    /* renamed from: a */
    public static int m16098a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: b */
    public static int m16103b(Parcel parcel) {
        int a = m16098a(parcel);
        int B = m16095B(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m16097a(a) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = B + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    /* renamed from: c */
    public static BigInteger m16106c(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + B);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m16108d(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + B);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m16109e(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + B);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m16110f(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + B);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m16111g(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + B);
        return createByteArray;
    }

    /* renamed from: h */
    public static double[] m16112h(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + B);
        return createDoubleArray;
    }

    /* renamed from: i */
    public static float[] m16113i(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + B);
        return createFloatArray;
    }

    /* renamed from: j */
    public static int[] m16114j(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + B);
        return createIntArray;
    }

    /* renamed from: k */
    public static ArrayList<Integer> m16115k(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + B);
        return arrayList;
    }

    /* renamed from: l */
    public static long[] m16116l(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + B);
        return createLongArray;
    }

    /* renamed from: m */
    public static Parcel m16117m(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, B);
        parcel.setDataPosition(dataPosition + B);
        return obtain;
    }

    /* renamed from: n */
    public static Parcel[] m16118n(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + B);
        return parcelArr;
    }

    /* renamed from: o */
    public static String m16119o(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + B);
        return readString;
    }

    /* renamed from: p */
    public static String[] m16120p(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + B);
        return createStringArray;
    }

    /* renamed from: q */
    public static ArrayList<String> m16121q(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + B);
        return createStringArrayList;
    }

    /* renamed from: r */
    public static void m16122r(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: s */
    public static boolean m16123s(Parcel parcel, int i) {
        m16101a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: t */
    public static double m16124t(Parcel parcel, int i) {
        m16101a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: u */
    public static float m16125u(Parcel parcel, int i) {
        m16101a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: v */
    public static IBinder m16126v(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + B);
        return readStrongBinder;
    }

    /* renamed from: w */
    public static int m16127w(Parcel parcel, int i) {
        m16101a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: x */
    public static Integer m16128x(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        if (B == 0) {
            return null;
        }
        m16102a(parcel, i, B, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: y */
    public static long m16129y(Parcel parcel, int i) {
        m16101a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: z */
    public static Long m16130z(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        if (B == 0) {
            return null;
        }
        m16102a(parcel, i, B, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: a */
    private static void m16101a(Parcel parcel, int i, int i2) {
        int B = m16095B(parcel, i);
        if (B != i2) {
            String hexString = Integer.toHexString(B);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(B);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m16102a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m16107c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + B);
        return createTypedArrayList;
    }

    /* renamed from: a */
    public static BigDecimal m16100a(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + B);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m16105b(Parcel parcel, int i) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + B);
        return bigDecimalArr;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m16099a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + B);
        return t;
    }

    /* renamed from: b */
    public static <T> T[] m16104b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int B = m16095B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + B);
        return createTypedArray;
    }
}
