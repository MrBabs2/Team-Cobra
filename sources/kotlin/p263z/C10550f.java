package kotlin.p263z;

import java.util.Comparator;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.z.f */
/* compiled from: Comparisons.kt */
final class C10550f implements Comparator<Comparable<? super Object>> {

    /* renamed from: f */
    public static final C10550f f28395f = new C10550f();

    private C10550f() {
    }

    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        C10202j.m34178b(comparable, "a");
        C10202j.m34178b(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C10549e.f28394f;
    }
}
