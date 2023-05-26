package kotlin.p220g0;

import kotlin.jvm.internal.C10202j;
import kotlin.p220g0.C9143a;

/* renamed from: kotlin.g0.f */
/* compiled from: _Ranges.kt */
class C9150f extends C9149e {
    /* renamed from: a */
    public static int m29847a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public static long m29849a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: a */
    public static C9143a m29850a(C9143a aVar, int i) {
        C10202j.m34178b(aVar, "$this$step");
        C9149e.m29846a(i > 0, Integer.valueOf(i));
        C9143a.C9144a aVar2 = C9143a.f25680i;
        int first = aVar.getFirst();
        int last = aVar.getLast();
        if (aVar.mo33483a() <= 0) {
            i = -i;
        }
        return aVar2.mo33491a(first, last, i);
    }

    /* renamed from: b */
    public static int m29851b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: b */
    public static long m29852b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: c */
    public static C9143a m29853c(int i, int i2) {
        return C9143a.f25680i.mo33491a(i, i2, -1);
    }

    /* renamed from: d */
    public static C9146c m29854d(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C9146c.f25689k.mo33497a();
        }
        return new C9146c(i, i2 - 1);
    }

    /* renamed from: a */
    public static int m29848a(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }
}
