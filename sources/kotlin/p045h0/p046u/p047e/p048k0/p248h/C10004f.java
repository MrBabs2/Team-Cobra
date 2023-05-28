package kotlin.p045h0.p046u.p047e.p048k0.p248h;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10373r0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;

/* renamed from: kotlin.h0.u.e.k0.h.f */
/* compiled from: MemberComparator */
public class C10004f implements Comparator<C10359m> {

    /* renamed from: f */
    public static final C10004f f27593f = new C10004f();

    private C10004f() {
    }

    /* renamed from: a */
    private static int m33705a(C10359m mVar) {
        if (C9999c.m33691p(mVar)) {
            return 8;
        }
        if (mVar instanceof C10357l) {
            return 7;
        }
        if (mVar instanceof C10352i0) {
            return ((C10352i0) mVar).mo35405b0() == null ? 6 : 5;
        }
        if (mVar instanceof C10382u) {
            return ((C10382u) mVar).mo35405b0() == null ? 4 : 3;
        }
        if (mVar instanceof C10342e) {
            return 2;
        }
        return mVar instanceof C10373r0 ? 1 : 0;
    }

    /* renamed from: b */
    private static Integer m33706b(C10359m mVar, C10359m mVar2) {
        int a = m33705a(mVar2) - m33705a(mVar);
        if (a != 0) {
            return Integer.valueOf(a);
        }
        if (C9999c.m33691p(mVar) && C9999c.m33691p(mVar2)) {
            return 0;
        }
        int a2 = mVar.getName().compareTo(mVar2.getName());
        if (a2 != 0) {
            return Integer.valueOf(a2);
        }
        return null;
    }

    /* renamed from: a */
    public int compare(C10359m mVar, C10359m mVar2) {
        Integer b = m33706b(mVar, mVar2);
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }
}
