package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9340h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.h0.u.e.k0.h.m.h */
/* compiled from: ConstantValueFactory.kt */
public final class C10038h {

    /* renamed from: a */
    public static final C10038h f27626a = new C10038h();

    /* renamed from: kotlin.h0.u.e.k0.h.m.h$a */
    /* compiled from: ConstantValueFactory.kt */
    static final class C10039a extends C10203k implements C9113l<C10393y, C11824b0> {

        /* renamed from: f */
        final /* synthetic */ C11824b0 f27627f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10039a(C11824b0 b0Var) {
            super(1);
            this.f27627f = b0Var;
        }

        /* renamed from: a */
        public final C11824b0 invoke(C10393y yVar) {
            C10202j.m34178b(yVar, "it");
            return this.f27627f;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.m.h$b */
    /* compiled from: ConstantValueFactory.kt */
    static final class C10040b extends C10203k implements C9113l<C10393y, C11901j0> {

        /* renamed from: f */
        final /* synthetic */ C9340h f27628f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10040b(C9340h hVar) {
            super(1);
            this.f27628f = hVar;
        }

        /* renamed from: a */
        public final C11901j0 invoke(C10393y yVar) {
            C10202j.m34178b(yVar, "module");
            C11901j0 a = yVar.mo35561l().mo33697a(this.f27628f);
            C10202j.m34174a((Object) a, "module.builtIns.getPrimi…KotlinType(componentType)");
            return a;
        }
    }

    private C10038h() {
    }

    /* renamed from: a */
    public final C10031b mo35247a(List<? extends C10037g<?>> list, C11824b0 b0Var) {
        C10202j.m34178b(list, DonationsAnalytics.VALUE);
        C10202j.m34178b(b0Var, "type");
        return new C10031b(list, new C10039a(b0Var));
    }

    /* renamed from: a */
    public final C10037g<?> mo35248a(Object obj) {
        if (obj instanceof Byte) {
            return new C10034d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C10064v(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C10047m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C10061s(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C10035e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C10046l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C10041i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C10033c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C10065w((String) obj);
        }
        if (obj instanceof byte[]) {
            return m33821a((List<?>) C10519k.m35617a((byte[]) obj), C9340h.BYTE);
        }
        if (obj instanceof short[]) {
            return m33821a((List<?>) C10519k.m35623a((short[]) obj), C9340h.SHORT);
        }
        if (obj instanceof int[]) {
            return m33821a((List<?>) C10519k.m35641c((int[]) obj), C9340h.INT);
        }
        if (obj instanceof long[]) {
            return m33821a((List<?>) C10519k.m35620a((long[]) obj), C9340h.LONG);
        }
        if (obj instanceof char[]) {
            return m33821a((List<?>) C10519k.m35632b((char[]) obj), C9340h.CHAR);
        }
        if (obj instanceof float[]) {
            return m33821a((List<?>) C10519k.m35619a((float[]) obj), C9340h.FLOAT);
        }
        if (obj instanceof double[]) {
            return m33821a((List<?>) C10519k.m35618a((double[]) obj), C9340h.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return m33821a((List<?>) C10519k.m35624a((boolean[]) obj), C9340h.BOOLEAN);
        }
        if (obj == null) {
            return new C10062t();
        }
        return null;
    }

    /* renamed from: a */
    private final C10031b m33821a(List<?> list, C9340h hVar) {
        List<T> n = C10539w.m35815n(list);
        ArrayList arrayList = new ArrayList();
        for (T a : n) {
            C10037g<?> a2 = mo35248a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new C10031b(arrayList, new C10040b(hVar));
    }
}
