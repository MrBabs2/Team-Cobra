package kotlin.p262y;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.s */
/* compiled from: MutableCollectionsJVM.kt */
class C10535s extends C10534r {
    /* renamed from: a */
    public static <T> void m35756a(List<T> list, Comparator<? super T> comparator) {
        C10202j.m34178b(list, "$this$sortWith");
        C10202j.m34178b(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: c */
    public static <T extends Comparable<? super T>> void m35757c(List<T> list) {
        C10202j.m34178b(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
