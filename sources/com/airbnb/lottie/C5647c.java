package com.airbnb.lottie;

import android.util.Log;
import androidx.core.p004os.C0420a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.airbnb.lottie.c */
/* compiled from: L */
public class C5647c {

    /* renamed from: a */
    public static boolean f9956a = false;

    /* renamed from: b */
    private static final Set<String> f9957b = new HashSet();

    /* renamed from: c */
    private static boolean f9958c = false;

    /* renamed from: d */
    private static String[] f9959d;

    /* renamed from: e */
    private static long[] f9960e;

    /* renamed from: f */
    private static int f9961f = 0;

    /* renamed from: g */
    private static int f9962g = 0;

    /* renamed from: a */
    public static void m10753a(String str) {
        if (f9958c) {
            int i = f9961f;
            if (i == 20) {
                f9962g++;
                return;
            }
            f9959d[i] = str;
            f9960e[i] = System.nanoTime();
            C0420a.m2042a(str);
            f9961f++;
        }
    }

    /* renamed from: b */
    public static void m10754b(String str) {
        if (f9956a) {
            Log.d("LOTTIE", str);
        }
    }

    /* renamed from: c */
    public static float m10755c(String str) {
        int i = f9962g;
        if (i > 0) {
            f9962g = i - 1;
            return 0.0f;
        } else if (!f9958c) {
            return 0.0f;
        } else {
            int i2 = f9961f - 1;
            f9961f = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f9959d[i2])) {
                C0420a.m2041a();
                return ((float) (System.nanoTime() - f9960e[f9961f])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f9959d[f9961f] + ".");
            }
        }
    }

    /* renamed from: d */
    public static void m10756d(String str) {
        if (!f9957b.contains(str)) {
            Log.w("LOTTIE", str);
            f9957b.add(str);
        }
    }
}
