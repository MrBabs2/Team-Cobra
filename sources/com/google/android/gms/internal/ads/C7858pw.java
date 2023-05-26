package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.pw */
final class C7858pw {

    /* renamed from: a */
    private static final Class<?> f16612a = m17950d();

    /* renamed from: b */
    private static final C7449ex<?, ?> f16613b = m17925a(false);

    /* renamed from: c */
    private static final C7449ex<?, ?> f16614c = m17925a(true);

    /* renamed from: d */
    private static final C7449ex<?, ?> f16615d = new C7486fx();

    /* renamed from: a */
    public static void m17934a(Class<?> cls) {
        Class<?> cls2;
        if (!zzdob.class.isAssignableFrom(cls) && (cls2 = f16612a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: b */
    public static void m17943b(int i, List<Float> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26624n(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m17947c(int i, List<Long> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26609d(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m17951d(int i, List<Long> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26621k(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m17955e(int i, List<Long> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26620j(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m17958f(int i, List<Long> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26619i(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m17961g(int i, List<Long> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26612e(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m17964h(int i, List<Integer> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26603b(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m17967i(int i, List<Integer> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26617g(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m17970j(int i, List<Integer> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26622l(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m17971k(int i, List<Integer> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26615f(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m17972l(int i, List<Integer> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26618h(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m17973m(int i, List<Integer> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26606c(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m17974n(int i, List<Boolean> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26596a(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m17941b(int i, List<zzdmr> list, C8118wx wxVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26594a(i, list);
        }
    }

    /* renamed from: c */
    static int m17944c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17923a(list) + (size * zzdni.m23835e(i));
    }

    /* renamed from: d */
    static int m17948d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17939b(list) + (size * zzdni.m23835e(i));
    }

    /* renamed from: e */
    static int m17952e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17945c(list) + (size * zzdni.m23835e(i));
    }

    /* renamed from: f */
    static int m17956f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17949d(list) + (size * zzdni.m23835e(i));
    }

    /* renamed from: g */
    static int m17959g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17953e(list) + (size * zzdni.m23835e(i));
    }

    /* renamed from: h */
    static int m17962h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdni.m23851i(i, 0);
    }

    /* renamed from: i */
    static int m17966i(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7857pv) {
            C7857pv pvVar = (C7857pv) list;
            i = 0;
            while (i2 < size) {
                i += zzdni.m23833d(pvVar.mo26441h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdni.m23833d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: j */
    static int m17969j(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7857pv) {
            C7857pv pvVar = (C7857pv) list;
            i = 0;
            while (i2 < size) {
                i += zzdni.m23837e(pvVar.mo26441h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdni.m23837e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m17930a(int i, List<Double> list, C8118wx wxVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26623m(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m17942b(int i, List<?> list, C8118wx wxVar, C7784nw nwVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26595a(i, list, nwVar);
        }
    }

    /* renamed from: h */
    static int m17963h(List<?> list) {
        return list.size();
    }

    /* renamed from: a */
    public static void m17928a(int i, List<String> list, C8118wx wxVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26601b(i, list);
        }
    }

    /* renamed from: c */
    static int m17945c(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            i = 0;
            while (i2 < size) {
                i += zzdni.m23838f(hvVar.mo26053h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdni.m23838f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m17949d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            i = 0;
            while (i2 < size) {
                i += zzdni.m23842g(hvVar.mo26053h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdni.m23842g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m17953e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            i = 0;
            while (i2 < size) {
                i += zzdni.m23846h(hvVar.mo26053h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdni.m23846h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m17957f(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: g */
    static int m17960g(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: b */
    static int m17938b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17969j(list) + (size * zzdni.m23835e(i));
    }

    /* renamed from: a */
    public static void m17929a(int i, List<?> list, C8118wx wxVar, C7784nw nwVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            wxVar.mo26602b(i, list, nwVar);
        }
    }

    /* renamed from: i */
    static int m17965i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdni.m23844g(i, 0);
    }

    /* renamed from: j */
    static int m17968j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdni.m23820b(i, true);
    }

    /* renamed from: a */
    static int m17922a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m17966i(list) + (list.size() * zzdni.m23835e(i));
    }

    /* renamed from: b */
    static int m17939b(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            i = 0;
            while (i2 < size) {
                i += zzdni.m23855k(hvVar.mo26053h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdni.m23855k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C7449ex<?, ?> m17946c() {
        return f16615d;
    }

    /* renamed from: d */
    private static Class<?> m17950d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Class<?> m17954e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static int m17923a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7857pv) {
            C7857pv pvVar = (C7857pv) list;
            i = 0;
            while (i2 < size) {
                i += zzdni.m23841f(pvVar.mo26441h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdni.m23841f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m17936b(int i, List<zzdmr> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zzdni.m23835e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zzdni.m23821b(list.get(i2));
        }
        return e;
    }

    /* renamed from: a */
    static int m17920a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zzdni.m23835e(i) * size;
        if (list instanceof zzdot) {
            zzdot zzdot = (zzdot) list;
            while (i4 < size) {
                Object g = zzdot.mo29155g(i4);
                if (g instanceof zzdmr) {
                    i3 = zzdni.m23821b((zzdmr) g);
                } else {
                    i3 = zzdni.m23823b((String) g);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzdmr) {
                    i2 = zzdni.m23821b((zzdmr) obj);
                } else {
                    i2 = zzdni.m23823b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: b */
    static int m17937b(int i, List<zzdpk> list, C7784nw nwVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzdni.m23828c(i, list.get(i3), nwVar);
        }
        return i2;
    }

    /* renamed from: b */
    public static C7449ex<?, ?> m17940b() {
        return f16614c;
    }

    /* renamed from: a */
    static int m17919a(int i, Object obj, C7784nw nwVar) {
        if (obj instanceof zzdor) {
            return zzdni.m23808a(i, (zzdor) obj);
        }
        return zzdni.m23818b(i, (zzdpk) obj, nwVar);
    }

    /* renamed from: a */
    static int m17921a(int i, List<?> list, C7784nw nwVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zzdni.m23835e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzdor) {
                i2 = zzdni.m23809a((zzdor) obj);
            } else {
                i2 = zzdni.m23810a((zzdpk) obj, nwVar);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: a */
    public static C7449ex<?, ?> m17924a() {
        return f16613b;
    }

    /* renamed from: a */
    private static C7449ex<?, ?> m17925a(boolean z) {
        try {
            Class<?> e = m17954e();
            if (e == null) {
                return null;
            }
            return (C7449ex) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m17935a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    static <T> void m17932a(C8079vv vvVar, T t, T t2, long j) {
        C7596ix.m17211a((Object) t, j, vvVar.mo26703a(C7596ix.m17234f(t, j), C7596ix.m17234f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends zzdnu<FT>> void m17933a(C8115wu<FT> wuVar, T t, T t2) {
        C8226zu<FT> b = wuVar.mo26750b(t2);
        if (!b.mo26891b()) {
            wuVar.mo26751c(t).mo26890a(b);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m17931a(C7449ex<UT, UB> exVar, T t, T t2) {
        exVar.mo25891a((Object) t, exVar.mo25899c(exVar.mo25900d(t), exVar.mo25900d(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m17927a(int i, List<Integer> list, zzdog zzdog, UB ub, C7449ex<UT, UB> exVar) {
        if (zzdog == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzdog.mo25753a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m17926a(i, intValue, ub, exVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzdog.mo25753a(intValue2)) {
                    ub = m17926a(i, intValue2, ub, exVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    static <UT, UB> UB m17926a(int i, int i2, UB ub, C7449ex<UT, UB> exVar) {
        if (ub == null) {
            ub = exVar.mo25884a();
        }
        exVar.mo25887a(ub, i, (long) i2);
        return ub;
    }
}
