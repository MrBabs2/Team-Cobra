package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import java.util.Map;
import kotlin.C10219k;
import kotlin.C9134f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.j */
/* compiled from: BuiltInAnnotationDescriptor.kt */
public final class C10255j implements C10243c {

    /* renamed from: e */
    static final /* synthetic */ C9168l[] f27914e = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10255j.class), "type", "getType()Lorg/jetbrains/kotlin/types/KotlinType;"))};

    /* renamed from: a */
    private final C9134f f27915a = C10181i.m34135a(C10219k.PUBLICATION, new C10256a(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9333g f27916b;

    /* renamed from: c */
    private final C9934b f27917c;

    /* renamed from: d */
    private final Map<C9939f, C10037g<?>> f27918d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.j$a */
    /* compiled from: BuiltInAnnotationDescriptor.kt */
    static final class C10256a extends C10203k implements C9102a<C11901j0> {

        /* renamed from: f */
        final /* synthetic */ C10255j f27919f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10256a(C10255j jVar) {
            super(0);
            this.f27919f = jVar;
        }

        public final C11901j0 invoke() {
            C10342e a = this.f27919f.f27916b.mo33701a(this.f27919f.mo33922c());
            C10202j.m34174a((Object) a, "builtIns.getBuiltInClassByFqName(fqName)");
            return a.mo35445o();
        }
    }

    public C10255j(C9333g gVar, C9934b bVar, Map<C9939f, ? extends C10037g<?>> map) {
        C10202j.m34178b(gVar, "builtIns");
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(map, "allValueArguments");
        this.f27916b = gVar;
        this.f27917c = bVar;
        this.f27918d = map;
    }

    /* renamed from: c */
    public C9934b mo33922c() {
        return this.f27917c;
    }

    public C11824b0 getType() {
        C9134f fVar = this.f27915a;
        C9168l lVar = f27914e[0];
        return (C11824b0) fVar.getValue();
    }

    /* renamed from: p */
    public C10362n0 mo33925p() {
        C10362n0 n0Var = C10362n0.f28175a;
        C10202j.m34174a((Object) n0Var, "SourceElement.NO_SOURCE");
        return n0Var;
    }

    /* renamed from: a */
    public Map<C9939f, C10037g<?>> mo33921a() {
        return this.f27918d;
    }
}
