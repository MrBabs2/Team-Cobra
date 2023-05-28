package kotlin.p263z;

import java.util.Comparator;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.z.e */
/* compiled from: Comparisons.kt */
final class C10549e implements Comparator<Comparable<? super Object>> {

    /* renamed from: f */
    public static final C10549e f28394f = new C10549e();

    private C10549e() {
    }

    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        C10202j.m34178b(comparable, "a");
        C10202j.m34178b(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C10550f.f28395f;
    }
}
