package kotlin.p262y;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p220g0.C9146c;

/* renamed from: kotlin.y.u */
/* compiled from: ReversedViews.kt */
class C10537u extends C10536t {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final int m35766c(List<?> list, int i) {
        int a = C10529o.m35732a(list);
        if (i >= 0 && a >= i) {
            return C10529o.m35732a(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C9146c(0, C10529o.m35732a(list)) + "].");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final int m35767d(List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C9146c(0, list.size()) + "].");
    }

    /* renamed from: d */
    public static <T> List<T> m35768d(List<T> list) {
        C10202j.m34178b(list, "$this$asReversed");
        return new C10524l0(list);
    }
}
