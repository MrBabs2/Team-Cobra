package kotlin.p262y;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p220g0.C9146c;

/* renamed from: kotlin.y.o */
/* compiled from: Collections.kt */
class C10529o extends C10527n {
    /* renamed from: a */
    public static final <T> Collection<T> m35735a(T[] tArr) {
        C10202j.m34178b(tArr, "$this$asCollection");
        return new C10508f(tArr, false);
    }

    /* renamed from: b */
    public static <T> List<T> m35741b(T... tArr) {
        C10202j.m34178b(tArr, "elements");
        return tArr.length > 0 ? C10516j.m35587a(tArr) : m35736a();
    }

    /* renamed from: c */
    public static <T> List<T> m35743c(T... tArr) {
        C10202j.m34178b(tArr, "elements");
        return C10519k.m35646d(tArr);
    }

    /* renamed from: d */
    public static <T> List<T> m35745d(T... tArr) {
        C10202j.m34178b(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C10508f(tArr, true));
    }

    /* renamed from: a */
    public static <T> List<T> m35736a() {
        return C10543y.f28392f;
    }

    /* renamed from: b */
    public static <T> List<T> m35739b(T t) {
        return t != null ? C10527n.m35729a(t) : m35736a();
    }

    /* renamed from: c */
    public static void m35744c() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: a */
    public static C9146c m35737a(Collection<?> collection) {
        C10202j.m34178b(collection, "$this$indices");
        return new C9146c(0, collection.size() - 1);
    }

    /* renamed from: b */
    public static <T> List<T> m35740b(List<? extends T> list) {
        C10202j.m34178b(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size == 0) {
            return m35736a();
        }
        if (size != 1) {
            return list;
        }
        return C10527n.m35729a(list.get(0));
    }

    /* renamed from: a */
    public static <T> int m35732a(List<? extends T> list) {
        C10202j.m34178b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: a */
    public static /* synthetic */ int m35734a(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m35733a(list, comparable, i, i2);
    }

    /* renamed from: a */
    public static final <T extends Comparable<? super T>> int m35733a(List<? extends T> list, T t, int i, int i2) {
        C10202j.m34178b(list, "$this$binarySearch");
        m35738a(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = C10546b.m35832a((Comparable) list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    public static void m35742b() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: a */
    private static final void m35738a(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }
}
