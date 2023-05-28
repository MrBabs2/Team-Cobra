package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11781t;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11738f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9878f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9923f;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10080c;
import kotlin.reflect.jvm.internal.impl.descriptors.C10365o0;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;

/* renamed from: kotlin.h0.u.e.k0.c.b.i */
/* compiled from: JvmPackagePartSource.kt */
public final class C9712i implements C11738f {

    /* renamed from: b */
    private final C10080c f26692b;

    /* renamed from: c */
    private final C10080c f26693c;

    /* renamed from: d */
    private final C9724o f26694d;

    public C9712i(C10080c cVar, C10080c cVar2, C9856v vVar, C9875c cVar3, C11781t<C9923f> tVar, boolean z, C9724o oVar) {
        C10202j.m34178b(cVar, "className");
        C10202j.m34178b(vVar, "packageProto");
        C10202j.m34178b(cVar3, "nameResolver");
        this.f26692b = cVar;
        this.f26693c = cVar2;
        this.f26694d = oVar;
        C10427h.C10435g<C9856v, Integer> gVar = C9890a.f27295l;
        C10202j.m34174a((Object) gVar, "JvmProtoBuf.packageModuleName");
        Integer num = (Integer) C9878f.m32873a(vVar, gVar);
        if (num != null) {
            String string = cVar3.getString(num.intValue());
        }
    }

    /* renamed from: a */
    public C10365o0 mo33654a() {
        C10365o0 o0Var = C10365o0.f28176a;
        C10202j.m34174a((Object) o0Var, "SourceFile.NO_SOURCE_FILE");
        return o0Var;
    }

    /* renamed from: c */
    public String mo34295c() {
        return "Class '" + mo34296d().mo34983a().mo34994a() + '\'';
    }

    /* renamed from: d */
    public final C9933a mo34296d() {
        return new C9933a(this.f26692b.mo35283c(), mo34299g());
    }

    /* renamed from: e */
    public final C10080c mo34297e() {
        return this.f26693c;
    }

    /* renamed from: f */
    public final C9724o mo34298f() {
        return this.f26694d;
    }

    /* renamed from: g */
    public final C9939f mo34299g() {
        String b = this.f26692b.mo35282b();
        C10202j.m34174a((Object) b, "className.internalName");
        C9939f b2 = C9939f.m33302b(C12131w.m40092b(b, '/', (String) null, 2, (Object) null));
        C10202j.m34174a((Object) b2, "Name.identifier(classNam….substringAfterLast('/'))");
        return b2;
    }

    public String toString() {
        return C9712i.class.getSimpleName() + ": " + this.f26692b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9712i(kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o r10, kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v r11, kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c r12, kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11781t<kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9923f> r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = "kotlinClass"
            kotlin.jvm.internal.C10202j.m34178b(r10, r0)
            java.lang.String r0 = "packageProto"
            kotlin.jvm.internal.C10202j.m34178b(r11, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C10202j.m34178b(r12, r0)
            kotlin.h0.u.e.k0.e.a r0 = r10.mo33665d()
            kotlin.h0.u.e.k0.h.p.c r2 = kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10080c.m33922a((kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a) r0)
            java.lang.String r0 = "JvmClassName.byClassId(kotlinClass.classId)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r0)
            kotlin.h0.u.e.k0.c.b.a0.a r0 = r10.mo33661a()
            java.lang.String r0 = r0.mo34263e()
            r1 = 0
            if (r0 == 0) goto L_0x0036
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x002f
            r3 = 1
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x0036
            kotlin.h0.u.e.k0.h.p.c r1 = kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10080c.m33921a((java.lang.String) r0)
        L_0x0036:
            r3 = r1
            r1 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9712i.<init>(kotlin.h0.u.e.k0.c.b.o, kotlin.h0.u.e.k0.d.v, kotlin.h0.u.e.k0.d.x0.c, kotlin.h0.u.e.k0.i.b.t, boolean):void");
    }
}
