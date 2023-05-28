package com.bumptech.glide.p166r;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import com.bumptech.glide.load.p150n.C6097l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.r.k */
/* compiled from: Util */
public final class C6316k {

    /* renamed from: a */
    private static final char[] f11570a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f11571b = new char[64];

    /* renamed from: com.bumptech.glide.r.k$a */
    /* compiled from: Util */
    static /* synthetic */ class C6317a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11572a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11572a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11572a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11572a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11572a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11572a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p166r.C6316k.C6317a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m12985a(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: a */
    public static String m12991a(byte[] bArr) {
        String a;
        synchronized (f11571b) {
            a = m12992a(bArr, f11571b);
        }
        return a;
    }

    /* renamed from: b */
    public static boolean m12999b(int i, int i2) {
        return m13002c(i) && m13002c(i2);
    }

    /* renamed from: c */
    public static boolean m13001c() {
        return !m13003d();
    }

    /* renamed from: c */
    private static boolean m13002c(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: d */
    public static boolean m13003d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static void m12998b() {
        if (!m13003d()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    private static String m12992a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f11570a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static boolean m13000b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m12997b(int i) {
        return m12985a(i, 17);
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m12988a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: a */
    public static int m12986a(int i, int i2, Bitmap.Config config) {
        return i * i2 * m12987a(config);
    }

    /* renamed from: a */
    private static int m12987a(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C6317a.f11572a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: a */
    public static void m12995a() {
        if (!m13001c()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: a */
    public static <T> Queue<T> m12994a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static <T> List<T> m12993a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m12996a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof C6097l) {
            return ((C6097l) obj).mo20400a(obj2);
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static int m12983a(float f) {
        return m12984a(f, 17);
    }

    /* renamed from: a */
    public static int m12984a(float f, int i) {
        return m12985a(Float.floatToIntBits(f), i);
    }

    /* renamed from: a */
    public static int m12989a(Object obj, int i) {
        return m12985a(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: a */
    public static int m12990a(boolean z, int i) {
        return m12985a(z ? 1 : 0, i);
    }
}
