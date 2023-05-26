package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10029a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10031b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10042j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10065w;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.f */
/* compiled from: annotationUtil.kt */
public final class C10247f {

    /* renamed from: a */
    private static final C9939f f27904a;

    /* renamed from: b */
    private static final C9939f f27905b;

    /* renamed from: c */
    private static final C9939f f27906c;

    /* renamed from: d */
    private static final C9939f f27907d;

    /* renamed from: e */
    private static final C9939f f27908e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.f$a */
    /* compiled from: annotationUtil.kt */
    static final class C10248a extends C10203k implements C9113l<C10393y, C11901j0> {

        /* renamed from: f */
        final /* synthetic */ C9333g f27909f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10248a(C9333g gVar) {
            super(1);
            this.f27909f = gVar;
        }

        /* renamed from: a */
        public final C11901j0 invoke(C10393y yVar) {
            C10202j.m34178b(yVar, "module");
            C11901j0 a = yVar.mo35561l().mo33698a(C11838f1.INVARIANT, (C11824b0) this.f27909f.mo33693C());
            C10202j.m34174a((Object) a, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return a;
        }
    }

    static {
        C9939f b = C9939f.m33302b("message");
        C10202j.m34174a((Object) b, "Name.identifier(\"message\")");
        f27904a = b;
        C9939f b2 = C9939f.m33302b("replaceWith");
        C10202j.m34174a((Object) b2, "Name.identifier(\"replaceWith\")");
        f27905b = b2;
        C9939f b3 = C9939f.m33302b("level");
        C10202j.m34174a((Object) b3, "Name.identifier(\"level\")");
        f27906c = b3;
        C9939f b4 = C9939f.m33302b("expression");
        C10202j.m34174a((Object) b4, "Name.identifier(\"expression\")");
        f27907d = b4;
        C9939f b5 = C9939f.m33302b("imports");
        C10202j.m34174a((Object) b5, "Name.identifier(\"imports\")");
        f27908e = b5;
    }

    /* renamed from: a */
    public static /* synthetic */ C10243c m34280a(C9333g gVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return m34279a(gVar, str, str2, str3);
    }

    /* renamed from: a */
    public static final C10243c m34279a(C9333g gVar, String str, String str2, String str3) {
        C10202j.m34178b(gVar, "$this$createDeprecatedAnnotation");
        C10202j.m34178b(str, "message");
        C10202j.m34178b(str2, "replaceWith");
        C10202j.m34178b(str3, "level");
        C9934b bVar = C9333g.f25907k.f25976v;
        C10202j.m34174a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.replaceWith");
        C10255j jVar = new C10255j(gVar, bVar, C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a(f27907d, new C10065w(str2)), C10481t.m35502a(f27908e, new C10031b(C10529o.m35736a(), new C10248a(gVar)))}));
        C9934b bVar2 = C9333g.f25907k.f25974t;
        C10202j.m34174a((Object) bVar2, "KotlinBuiltIns.FQ_NAMES.deprecated");
        C9939f fVar = f27906c;
        C9933a a = C9933a.m33260a(C9333g.f25907k.f25975u);
        C10202j.m34174a((Object) a, "ClassId.topLevel(KotlinB…Q_NAMES.deprecationLevel)");
        C9939f b = C9939f.m33302b(str3);
        C10202j.m34174a((Object) b, "Name.identifier(level)");
        return new C10255j(gVar, bVar2, C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a(f27904a, new C10065w(str)), C10481t.m35502a(f27905b, new C10029a(jVar)), C10481t.m35502a(fVar, new C10042j(a, b))}));
    }
}
