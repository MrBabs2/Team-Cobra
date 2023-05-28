package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f2 */
final class C8283f2 {

    /* renamed from: a */
    private static final Class<?> f23242a = m25962d();

    /* renamed from: b */
    private static final C8351u2<?, ?> f23243b = m25939a(false);

    /* renamed from: c */
    private static final C8351u2<?, ?> f23244c = m25939a(true);

    /* renamed from: d */
    private static final C8351u2<?, ?> f23245d = new C8355v2();

    /* renamed from: a */
    public static void m25946a(Class<?> cls) {
        Class<?> cls2;
        if (!zzuo.class.isAssignableFrom(cls) && (cls2 = f23242a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: b */
    public static void m25955b(int i, List<Float> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30188n(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m25959c(int i, List<Long> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30175d(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m25963d(int i, List<Long> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30185k(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m25967e(int i, List<Long> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30184j(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m25970f(int i, List<Long> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30183i(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m25973g(int i, List<Long> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30178e(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m25976h(int i, List<Integer> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30169b(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m25979i(int i, List<Integer> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30181g(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m25982j(int i, List<Integer> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30186l(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m25983k(int i, List<Integer> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30180f(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m25984l(int i, List<Integer> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30182h(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m25985m(int i, List<Integer> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30172c(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m25986n(int i, List<Boolean> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30161a(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m25953b(int i, List<zzte> list, C8309k3 k3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30159a(i, list);
        }
    }

    /* renamed from: c */
    static int m25956c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25937a(list) + (size * zztv.m26560e(i));
    }

    /* renamed from: d */
    static int m25960d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25951b(list) + (size * zztv.m26560e(i));
    }

    /* renamed from: e */
    static int m25964e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25957c(list) + (size * zztv.m26560e(i));
    }

    /* renamed from: f */
    static int m25968f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25961d(list) + (size * zztv.m26560e(i));
    }

    /* renamed from: g */
    static int m25971g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25965e(list) + (size * zztv.m26560e(i));
    }

    /* renamed from: h */
    static int m25974h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.m26576i(i, 0);
    }

    /* renamed from: i */
    static int m25978i(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8307k1) {
            C8307k1 k1Var = (C8307k1) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m26559d(k1Var.mo30143h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m26559d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: j */
    static int m25981j(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8307k1) {
            C8307k1 k1Var = (C8307k1) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m26562e(k1Var.mo30143h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m26562e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m25942a(int i, List<Double> list, C8309k3 k3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30187m(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m25954b(int i, List<?> list, C8309k3 k3Var, C8273d2 d2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30160a(i, list, d2Var);
        }
    }

    /* renamed from: h */
    static int m25975h(List<?> list) {
        return list.size();
    }

    /* renamed from: a */
    public static void m25940a(int i, List<String> list, C8309k3 k3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30167b(i, list);
        }
    }

    /* renamed from: c */
    static int m25957c(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8267c1) {
            C8267c1 c1Var = (C8267c1) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m26563f(c1Var.mo30074h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m26563f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m25961d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8267c1) {
            C8267c1 c1Var = (C8267c1) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m26567g(c1Var.mo30074h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m26567g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m25965e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8267c1) {
            C8267c1 c1Var = (C8267c1) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m26571h(c1Var.mo30074h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m26571h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m25969f(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: g */
    static int m25972g(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: b */
    static int m25950b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25981j(list) + (size * zztv.m26560e(i));
    }

    /* renamed from: a */
    public static void m25941a(int i, List<?> list, C8309k3 k3Var, C8273d2 d2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k3Var.mo30168b(i, list, d2Var);
        }
    }

    /* renamed from: i */
    static int m25977i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.m26569g(i, 0);
    }

    /* renamed from: j */
    static int m25980j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.m26546b(i, true);
    }

    /* renamed from: a */
    static int m25936a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m25978i(list) + (list.size() * zztv.m26560e(i));
    }

    /* renamed from: b */
    static int m25951b(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8267c1) {
            C8267c1 c1Var = (C8267c1) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m26580k(c1Var.mo30074h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m26580k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C8351u2<?, ?> m25958c() {
        return f23245d;
    }

    /* renamed from: d */
    private static Class<?> m25962d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Class<?> m25966e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static int m25937a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8307k1) {
            C8307k1 k1Var = (C8307k1) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m26566f(k1Var.mo30143h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m26566f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m25948b(int i, List<zzte> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zztv.m26560e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zztv.m26547b(list.get(i2));
        }
        return e;
    }

    /* renamed from: a */
    static int m25934a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zztv.m26560e(i) * size;
        if (list instanceof zzve) {
            zzve zzve = (zzve) list;
            while (i4 < size) {
                Object a = zzve.mo30446a(i4);
                if (a instanceof zzte) {
                    i3 = zztv.m26547b((zzte) a);
                } else {
                    i3 = zztv.m26549b((String) a);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzte) {
                    i2 = zztv.m26547b((zzte) obj);
                } else {
                    i2 = zztv.m26549b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: b */
    static int m25949b(int i, List<zzvv> list, C8273d2 d2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zztv.m26555c(i, list.get(i3), d2Var);
        }
        return i2;
    }

    /* renamed from: b */
    public static C8351u2<?, ?> m25952b() {
        return f23244c;
    }

    /* renamed from: a */
    static int m25933a(int i, Object obj, C8273d2 d2Var) {
        if (obj instanceof zzvc) {
            return zztv.m26534a(i, (zzvc) obj);
        }
        return zztv.m26544b(i, (zzvv) obj, d2Var);
    }

    /* renamed from: a */
    static int m25935a(int i, List<?> list, C8273d2 d2Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zztv.m26560e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzvc) {
                i2 = zztv.m26535a((zzvc) obj);
            } else {
                i2 = zztv.m26536a((zzvv) obj, d2Var);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: a */
    public static C8351u2<?, ?> m25938a() {
        return f23243b;
    }

    /* renamed from: a */
    private static C8351u2<?, ?> m25939a(boolean z) {
        try {
            Class<?> e = m25966e();
            if (e == null) {
                return null;
            }
            return (C8351u2) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m25947a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    static <T> void m25943a(C8330p1 p1Var, T t, T t2, long j) {
        C8367y2.m26298a((Object) t, j, p1Var.mo30221a(C8367y2.m26320f(t, j), C8367y2.m26320f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends zzuh<FT>> void m25944a(C8349u0<FT> u0Var, T t, T t2) {
        C8361x0<FT> a = u0Var.mo30234a((Object) t2);
        if (!a.mo30258b()) {
            u0Var.mo30237b(t).mo30257a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m25945a(C8351u2<UT, UB> u2Var, T t, T t2) {
        u2Var.mo30241a((Object) t, u2Var.mo30243b(u2Var.mo30242b(t), u2Var.mo30242b(t2)));
    }
}
