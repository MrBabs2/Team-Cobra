package kotlin.p045h0.p046u.p047e.p048k0.p386l;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C11986c;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p392j0.C12113j;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;

/* renamed from: kotlin.h0.u.e.k0.l.d */
/* compiled from: modifierChecks.kt */
public final class C11990d {

    /* renamed from: a */
    private final C9939f f31694a;

    /* renamed from: b */
    private final C12113j f31695b;

    /* renamed from: c */
    private final Collection<C9939f> f31696c;

    /* renamed from: d */
    private final C9113l<C10382u, String> f31697d;

    /* renamed from: e */
    private final C11984b[] f31698e;

    /* renamed from: kotlin.h0.u.e.k0.l.d$a */
    /* compiled from: modifierChecks.kt */
    static final class C11991a extends C10203k implements C9113l {

        /* renamed from: f */
        public static final C11991a f31699f = new C11991a();

        C11991a() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C10382u uVar) {
            C10202j.m34178b(uVar, "$receiver");
            return null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.d$b */
    /* compiled from: modifierChecks.kt */
    static final class C11992b extends C10203k implements C9113l {

        /* renamed from: f */
        public static final C11992b f31700f = new C11992b();

        C11992b() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C10382u uVar) {
            C10202j.m34178b(uVar, "$receiver");
            return null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.d$c */
    /* compiled from: modifierChecks.kt */
    static final class C11993c extends C10203k implements C9113l {

        /* renamed from: f */
        public static final C11993c f31701f = new C11993c();

        C11993c() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C10382u uVar) {
            C10202j.m34178b(uVar, "$receiver");
            return null;
        }
    }

    private C11990d(C9939f fVar, C12113j jVar, Collection<C9939f> collection, C9113l<? super C10382u, String> lVar, C11984b... bVarArr) {
        this.f31694a = fVar;
        this.f31695b = jVar;
        this.f31696c = collection;
        this.f31697d = lVar;
        this.f31698e = bVarArr;
    }

    /* renamed from: a */
    public final C11986c mo38630a(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        for (C11984b a : this.f31698e) {
            String a2 = a.mo38626a(uVar);
            if (a2 != null) {
                return new C11986c.C11988b(a2);
            }
        }
        String invoke = this.f31697d.invoke(uVar);
        if (invoke != null) {
            return new C11986c.C11988b(invoke);
        }
        return C11986c.C11989c.f31693b;
    }

    /* renamed from: b */
    public final boolean mo38631b(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        if (this.f31694a != null && (!C10202j.m34176a((Object) uVar.getName(), (Object) this.f31694a))) {
            return false;
        }
        if (this.f31695b != null) {
            String a = uVar.getName().mo35021a();
            C10202j.m34174a((Object) a, "functionDescriptor.name.asString()");
            if (!this.f31695b.mo38744b(a)) {
                return false;
            }
        }
        Collection<C9939f> collection = this.f31696c;
        return collection == null || collection.contains(uVar.getName());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11990d(C9939f fVar, C11984b[] bVarArr, C9113l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, bVarArr, (C9113l<? super C10382u, String>) (i & 4) != 0 ? C11991a.f31699f : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11990d(C9939f fVar, C11984b[] bVarArr, C9113l<? super C10382u, String> lVar) {
        this(fVar, (C12113j) null, (Collection<C9939f>) null, lVar, (C11984b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVarArr, "checks");
        C10202j.m34178b(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11990d(C12113j jVar, C11984b[] bVarArr, C9113l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, bVarArr, (C9113l<? super C10382u, String>) (i & 4) != 0 ? C11992b.f31700f : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11990d(C12113j jVar, C11984b[] bVarArr, C9113l<? super C10382u, String> lVar) {
        this((C9939f) null, jVar, (Collection<C9939f>) null, lVar, (C11984b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        C10202j.m34178b(jVar, "regex");
        C10202j.m34178b(bVarArr, "checks");
        C10202j.m34178b(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11990d(Collection collection, C11984b[] bVarArr, C9113l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<C9939f>) collection, bVarArr, (C9113l<? super C10382u, String>) (i & 4) != 0 ? C11993c.f31701f : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11990d(Collection<C9939f> collection, C11984b[] bVarArr, C9113l<? super C10382u, String> lVar) {
        this((C9939f) null, (C12113j) null, collection, lVar, (C11984b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        C10202j.m34178b(collection, "nameList");
        C10202j.m34178b(bVarArr, "checks");
        C10202j.m34178b(lVar, "additionalChecks");
    }
}
