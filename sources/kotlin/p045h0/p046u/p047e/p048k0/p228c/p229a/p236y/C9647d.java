package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9515b;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9526m;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10031b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10042j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10261m;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10262n;

/* renamed from: kotlin.h0.u.e.k0.c.a.y.d */
/* compiled from: JavaAnnotationMapper.kt */
public final class C9647d {

    /* renamed from: a */
    private static final Map<String, EnumSet<C10262n>> f26566a = C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a("PACKAGE", EnumSet.noneOf(C10262n.class)), C10481t.m35502a("TYPE", EnumSet.of(C10262n.CLASS, C10262n.FILE)), C10481t.m35502a("ANNOTATION_TYPE", EnumSet.of(C10262n.ANNOTATION_CLASS)), C10481t.m35502a("TYPE_PARAMETER", EnumSet.of(C10262n.TYPE_PARAMETER)), C10481t.m35502a("FIELD", EnumSet.of(C10262n.FIELD)), C10481t.m35502a("LOCAL_VARIABLE", EnumSet.of(C10262n.LOCAL_VARIABLE)), C10481t.m35502a("PARAMETER", EnumSet.of(C10262n.VALUE_PARAMETER)), C10481t.m35502a("CONSTRUCTOR", EnumSet.of(C10262n.CONSTRUCTOR)), C10481t.m35502a("METHOD", EnumSet.of(C10262n.FUNCTION, C10262n.PROPERTY_GETTER, C10262n.PROPERTY_SETTER)), C10481t.m35502a("TYPE_USE", EnumSet.of(C10262n.TYPE))});

    /* renamed from: b */
    private static final Map<String, C10261m> f26567b = C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a("RUNTIME", C10261m.RUNTIME), C10481t.m35502a("CLASS", C10261m.BINARY), C10481t.m35502a("SOURCE", C10261m.SOURCE)});

    /* renamed from: c */
    public static final C9647d f26568c = new C9647d();

    /* renamed from: kotlin.h0.u.e.k0.c.a.y.d$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C9648a extends C10203k implements C9113l<C10393y, C11824b0> {

        /* renamed from: f */
        public static final C9648a f26569f = new C9648a();

        C9648a() {
            super(1);
        }

        /* renamed from: a */
        public final C11824b0 invoke(C10393y yVar) {
            C11824b0 type;
            C10202j.m34178b(yVar, "module");
            C10386v0 a = C9641a.m31095a(C9646c.f26565j.mo34201c(), yVar.mo35561l().mo33701a(C9333g.f25907k.f25980z));
            if (a != null && (type = a.getType()) != null) {
                return type;
            }
            C11901j0 c = C11958u.m39559c("Error: AnnotationTarget[]");
            C10202j.m34174a((Object) c, "ErrorUtils.createErrorTy…ror: AnnotationTarget[]\")");
            return c;
        }
    }

    private C9647d() {
    }

    /* renamed from: a */
    public final Set<C10262n> mo34202a(String str) {
        EnumSet enumSet = f26566a.get(str);
        return enumSet != null ? enumSet : C10530o0.m35747a();
    }

    /* renamed from: a */
    public final C10037g<?> mo34204a(C9515b bVar) {
        if (!(bVar instanceof C9526m)) {
            bVar = null;
        }
        C9526m mVar = (C9526m) bVar;
        if (mVar == null) {
            return null;
        }
        Map<String, C10261m> map = f26567b;
        C9939f d = mVar.mo34051d();
        C10261m mVar2 = map.get(d != null ? d.mo35021a() : null);
        if (mVar2 == null) {
            return null;
        }
        C9933a a = C9933a.m33260a(C9333g.f25907k.f25919B);
        C10202j.m34174a((Object) a, "ClassId.topLevel(KotlinB…AMES.annotationRetention)");
        C9939f b = C9939f.m33302b(mVar2.name());
        C10202j.m34174a((Object) b, "Name.identifier(retention.name)");
        return new C10042j(a, b);
    }

    /* renamed from: a */
    public final C10037g<?> mo34203a(List<? extends C9515b> list) {
        C10202j.m34178b(list, "arguments");
        ArrayList<C9526m> arrayList = new ArrayList<>();
        for (T next : list) {
            if (next instanceof C9526m) {
                arrayList.add(next);
            }
        }
        ArrayList<C10262n> arrayList2 = new ArrayList<>();
        for (C9526m d : arrayList) {
            C9647d dVar = f26568c;
            C9939f d2 = d.mo34051d();
            boolean unused = C10536t.m35760a(arrayList2, dVar.mo34202a(d2 != null ? d2.mo35021a() : null));
        }
        ArrayList arrayList3 = new ArrayList(C10531p.m35750a(arrayList2, 10));
        for (C10262n name : arrayList2) {
            C9933a a = C9933a.m33260a(C9333g.f25907k.f25918A);
            C10202j.m34174a((Object) a, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
            C9939f b = C9939f.m33302b(name.name());
            C10202j.m34174a((Object) b, "Name.identifier(kotlinTarget.name)");
            arrayList3.add(new C10042j(a, b));
        }
        return new C10031b(arrayList3, C9648a.f26569f);
    }
}
