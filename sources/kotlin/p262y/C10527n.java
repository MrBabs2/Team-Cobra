package kotlin.p262y;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.n */
/* compiled from: CollectionsJVM.kt */
class C10527n {
    /* renamed from: a */
    public static <T> List<T> m35729a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C10202j.m34174a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m35730a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        C10202j.m34178b(tArr, "$this$copyToArrayOfAny");
        if (z && C10202j.m34176a((Object) tArr.getClass(), (Object) cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C10202j.m34174a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
