package kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9327b;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10268b;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10302h;

/* renamed from: kotlin.h0.u.e.k0.a.o.d */
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class C9369d implements C10268b {

    /* renamed from: d */
    static final /* synthetic */ C9168l[] f26068d = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C9369d.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C9934b f26069e = C9333g.f25902f;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C9939f f26070f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C9933a f26071g;

    /* renamed from: h */
    public static final C9371b f26072h = new C9371b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C11814f f26073a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10393y f26074b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9113l<C10393y, C10359m> f26075c;

    /* renamed from: kotlin.h0.u.e.k0.a.o.d$a */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    static final class C9370a extends C10203k implements C9113l<C10393y, C9327b> {

        /* renamed from: f */
        public static final C9370a f26076f = new C9370a();

        C9370a() {
            super(1);
        }

        /* renamed from: a */
        public final C9327b invoke(C10393y yVar) {
            C10202j.m34178b(yVar, "module");
            C9934b c = C9369d.f26069e;
            C10202j.m34174a((Object) c, "KOTLIN_FQ_NAME");
            List<C10240b0> D = yVar.mo35554a(c).mo35539D();
            ArrayList arrayList = new ArrayList();
            for (T next : D) {
                if (next instanceof C9327b) {
                    arrayList.add(next);
                }
            }
            return (C9327b) C10539w.m35799e(arrayList);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.a.o.d$b */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class C9371b {
        private C9371b() {
        }

        /* renamed from: a */
        public final C9933a mo33821a() {
            return C9369d.f26071g;
        }

        public /* synthetic */ C9371b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.a.o.d$c */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    static final class C9372c extends C10203k implements C9102a<C10302h> {

        /* renamed from: f */
        final /* synthetic */ C9369d f26077f;

        /* renamed from: g */
        final /* synthetic */ C11817i f26078g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9372c(C9369d dVar, C11817i iVar) {
            super(0);
            this.f26077f = dVar;
            this.f26078g = iVar;
        }

        public final C10302h invoke() {
            C10302h hVar = new C10302h((C10359m) this.f26077f.f26075c.invoke(this.f26077f.f26074b), C9369d.f26070f, C10388w.ABSTRACT, C10345f.INTERFACE, C10527n.m35729a(this.f26077f.f26074b.mo35561l().mo33707c()), C10362n0.f28175a, false, this.f26078g);
            hVar.mo35477a(new C9363a(this.f26078g, hVar), C10530o0.m35747a(), (C10273d) null);
            return hVar;
        }
    }

    static {
        C9939f f = C9333g.f25907k.f25948c.mo35014f();
        C10202j.m34174a((Object) f, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
        f26070f = f;
        C9933a a = C9933a.m33260a(C9333g.f25907k.f25948c.mo35016h());
        C10202j.m34174a((Object) a, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
        f26071g = a;
    }

    public C9369d(C11817i iVar, C10393y yVar, C9113l<? super C10393y, ? extends C10359m> lVar) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(yVar, "moduleDescriptor");
        C10202j.m34178b(lVar, "computeContainingDeclaration");
        this.f26074b = yVar;
        this.f26075c = lVar;
        this.f26073a = iVar.mo38401a(new C9372c(this, iVar));
    }

    /* renamed from: d */
    private final C10302h m30383d() {
        return (C10302h) C11816h.m38876a(this.f26073a, (Object) this, (C9168l<?>) f26068d[0]);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9369d(C11817i iVar, C10393y yVar, C9113l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, yVar, (i & 4) != 0 ? C9370a.f26076f : lVar);
    }

    /* renamed from: a */
    public boolean mo33748a(C9934b bVar, C9939f fVar) {
        C10202j.m34178b(bVar, "packageFqName");
        C10202j.m34178b(fVar, "name");
        return C10202j.m34176a((Object) fVar, (Object) f26070f) && C10202j.m34176a((Object) bVar, (Object) f26069e);
    }

    /* renamed from: a */
    public C10342e mo33747a(C9933a aVar) {
        C10202j.m34178b(aVar, "classId");
        if (C10202j.m34176a((Object) aVar, (Object) f26071g)) {
            return m30383d();
        }
        return null;
    }

    /* renamed from: a */
    public Collection<C10342e> mo33746a(C9934b bVar) {
        C10202j.m34178b(bVar, "packageFqName");
        if (C10202j.m34176a((Object) bVar, (Object) f26069e)) {
            return C10528n0.m35731a(m30383d());
        }
        return C10530o0.m35747a();
    }
}
