package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;

/* renamed from: kotlin.h0.u.e.k0.i.b.r */
/* compiled from: ErrorReporter */
public interface C11777r {

    /* renamed from: a */
    public static final C11777r f31464a = new C11778a();

    /* renamed from: kotlin.h0.u.e.k0.i.b.r$a */
    /* compiled from: ErrorReporter */
    static class C11778a implements C11777r {
        C11778a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m38797a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo33674a(C10238b bVar) {
            if (bVar == null) {
                m38797a(2);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo33675a(C10342e eVar, List<String> list) {
            if (eVar == null) {
                m38797a(0);
                throw null;
            } else if (list == null) {
                m38797a(1);
                throw null;
            }
        }
    }

    /* renamed from: a */
    void mo33674a(C10238b bVar);

    /* renamed from: a */
    void mo33675a(C10342e eVar, List<String> list);
}
