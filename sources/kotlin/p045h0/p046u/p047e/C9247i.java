package kotlin.p045h0.p046u.p047e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10195d;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.p045h0.p046u.p047e.p222j0.C9316k;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p392j0.C12106h;
import kotlin.p392j0.C12113j;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10313l;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\b\b \u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0018\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u0012\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020(H&J\"\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u00042\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0004J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u001a\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u00102\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00103\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(H\u0002J=\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:J8\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J(\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\t2\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t01H\u0002J=\u0010<\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006@"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "createProperty", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "", "returnType", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "tryGetConstructor", "tryGetMethod", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.i */
/* compiled from: KDeclarationContainerImpl.kt */
public abstract class C9247i implements C10195d {

    /* renamed from: f */
    private static final Class<?> f25794f = Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C12113j f25795g = new C12113j("<v#(\\d+)>");

    /* renamed from: h */
    public static final C9248a f25796h = new C9248a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.h0.u.e.i$a */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class C9248a {
        private C9248a() {
        }

        /* renamed from: a */
        public final C12113j mo33621a() {
            return C9247i.f25795g;
        }

        public /* synthetic */ C9248a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "getModuleData", "()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.i$b */
    /* compiled from: KDeclarationContainerImpl.kt */
    public abstract class C9249b {

        /* renamed from: c */
        static final /* synthetic */ C9168l[] f25797c = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C9249b.class), "moduleData", "getModuleData()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;"))};

        /* renamed from: a */
        private final C10176z.C10177a f25798a = C10176z.m34125b(new C9250a(this));

        /* renamed from: kotlin.h0.u.e.i$b$a */
        /* compiled from: KDeclarationContainerImpl.kt */
        static final class C9250a extends C10203k implements C9102a<C9316k> {

            /* renamed from: f */
            final /* synthetic */ C9249b f25800f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9250a(C9249b bVar) {
                super(0);
                this.f25800f = bVar;
            }

            public final C9316k invoke() {
                return C10175y.m34121a(C9247i.this.mo33537a());
            }
        }

        public C9249b() {
        }

        /* renamed from: a */
        public final C9316k mo33622a() {
            return (C9316k) this.f25798a.mo35360a(this, f25797c[0]);
        }
    }

    /* renamed from: kotlin.h0.u.e.i$c */
    /* compiled from: KDeclarationContainerImpl.kt */
    protected enum C9251c {
        DECLARED,
        INHERITED;

        /* renamed from: a */
        public final boolean mo33623a(C10238b bVar) {
            C10202j.m34178b(bVar, "member");
            C10238b.C10239a g = bVar.mo35423g();
            C10202j.m34174a((Object) g, "member.kind");
            return g.mo35424a() == (this == DECLARED);
        }
    }

    /* renamed from: kotlin.h0.u.e.i$d */
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class C9252d extends C10203k implements C9113l<C10382u, String> {

        /* renamed from: f */
        public static final C9252d f25804f = new C9252d();

        C9252d() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C10382u uVar) {
            C10202j.m34178b(uVar, "descriptor");
            return C9949c.f27454b.mo35037a((C10359m) uVar) + " | " + C9205d0.f25736b.mo33580a(uVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.i$e */
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class C9253e extends C10203k implements C9113l<C10352i0, String> {

        /* renamed from: f */
        public static final C9253e f25805f = new C9253e();

        C9253e() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C10352i0 i0Var) {
            C10202j.m34178b(i0Var, "descriptor");
            return C9949c.f27454b.mo35037a((C10359m) i0Var) + " | " + C9205d0.f25736b.mo33581a(i0Var);
        }
    }

    /* renamed from: kotlin.h0.u.e.i$f */
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class C9254f<T> implements Comparator<C10237a1> {

        /* renamed from: f */
        public static final C9254f f25806f = new C9254f();

        C9254f() {
        }

        /* renamed from: a */
        public final int compare(C10237a1 a1Var, C10237a1 a1Var2) {
            Integer a = C10397z0.m35085a(a1Var, a1Var2);
            if (a != null) {
                return a.intValue();
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[LOOP:0: B:6:0x0029->B:21:0x005d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method m30015b(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.length     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r9, r1)     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r8, r1)     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.String r2 = "result"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r2)     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.Class r2 = r1.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0060 }
            boolean r2 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r2, (java.lang.Object) r10)     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r2 == 0) goto L_0x001d
            r0 = r1
            goto L_0x0060
        L_0x001d:
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.String r1 = "declaredMethods"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r7, (java.lang.String) r1)     // Catch:{ NoSuchMethodException -> 0x0060 }
            int r1 = r7.length     // Catch:{ NoSuchMethodException -> 0x0060 }
            r2 = 0
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x0060
            r4 = r7[r3]     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.String r5 = "method"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r4, (java.lang.String) r5)     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.String r5 = r4.getName()     // Catch:{ NoSuchMethodException -> 0x0060 }
            boolean r5 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r5, (java.lang.Object) r8)     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r5 == 0) goto L_0x0058
            java.lang.Class r5 = r4.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0060 }
            boolean r5 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r5, (java.lang.Object) r10)     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r5 == 0) goto L_0x0058
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r5 == 0) goto L_0x0054
            boolean r5 = java.util.Arrays.equals(r5, r9)     // Catch:{ NoSuchMethodException -> 0x0060 }
            if (r5 == 0) goto L_0x0058
            r5 = 1
            goto L_0x0059
        L_0x0054:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ NoSuchMethodException -> 0x0060 }
            throw r0
        L_0x0058:
            r5 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x005d
            r0 = r4
            goto L_0x0060
        L_0x005d:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C9247i.m30015b(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class):java.lang.reflect.Method");
    }

    /* renamed from: d */
    private final Class<?> m30017d(String str) {
        return m30008a(str, C12131w.m40060a((CharSequence) str, ')', 0, false, 6, (Object) null) + 1, str.length());
    }

    /* renamed from: a */
    public abstract Collection<C10382u> mo33538a(C9939f fVar);

    /* renamed from: a */
    public abstract C10352i0 mo33539a(int i);

    /* renamed from: b */
    public abstract Collection<C10352i0> mo33540b(C9939f fVar);

    /* renamed from: c */
    public final C10352i0 mo33619c(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        C10202j.m34178b(str4, "name");
        C10202j.m34178b(str5, RoomInstalled.SIGNATURE);
        C12106h a = f25795g.mo38743a(str5);
        boolean z = true;
        if (a != null) {
            String str6 = a.mo38732a().mo38734a().mo38733b().get(1);
            C10352i0 a2 = mo33539a(Integer.parseInt(str6));
            if (a2 != null) {
                return a2;
            }
            throw new C10174x("Local property #" + str6 + " not found in " + mo33537a());
        }
        C9939f b = C9939f.m33302b(str);
        C10202j.m34174a((Object) b, "Name.identifier(name)");
        Collection<C10352i0> b2 = mo33540b(b);
        ArrayList arrayList = new ArrayList();
        for (T next : b2) {
            if (C10202j.m34176a((Object) C9205d0.f25736b.mo33581a((C10352i0) next).mo33569a(), (Object) str5)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            throw new C10174x("Property '" + str4 + "' (JVM signature: " + str5 + ") not resolved in " + this);
        } else if (arrayList.size() == 1) {
            return (C10352i0) C10539w.m35809i(arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next2 : arrayList) {
                C10237a1 visibility = ((C10352i0) next2).getVisibility();
                Object obj = linkedHashMap.get(visibility);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(visibility, obj);
                }
                ((List) obj).add(next2);
            }
            Collection values = C10515i0.m35585a(linkedHashMap, C9254f.f25806f).values();
            C10202j.m34174a((Object) values, "properties\n             …                }).values");
            List list = (List) C10539w.m35804g(values);
            if (list.size() == 1) {
                C10202j.m34174a((Object) list, "mostVisibleProperties");
                return (C10352i0) C10539w.m35799e(list);
            }
            C9939f b3 = C9939f.m33302b(str);
            C10202j.m34174a((Object) b3, "Name.identifier(name)");
            String a3 = C10539w.m35773a(mo33540b(b3), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C9253e.f25805f, 30, (Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append("Property '");
            sb.append(str4);
            sb.append("' (JVM signature: ");
            sb.append(str5);
            sb.append(") not resolved in ");
            sb.append(this);
            sb.append(':');
            if (a3.length() != 0) {
                z = false;
            }
            if (z) {
                str3 = " no members found";
            } else {
                str3 = 10 + a3;
            }
            sb.append(str3);
            throw new C10174x(sb.toString());
        }
    }

    /* renamed from: d */
    public abstract Collection<C10357l> mo33541d();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Class<?> mo33620f() {
        Class<?> f = C12029b.m39752f(mo33537a());
        return f != null ? f : mo33537a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.p045h0.p046u.p047e.C9206e<?>> mo33615a(kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h r8, kotlin.p045h0.p046u.p047e.C9247i.C9251c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C10202j.m34178b(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.C10202j.m34178b(r9, r0)
            kotlin.h0.u.e.i$g r0 = new kotlin.h0.u.e.i$g
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10101j.C10102a.m34010a(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x001e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C10359m) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10238b
            if (r4 == 0) goto L_0x004e
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C10238b) r4
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r6 = kotlin.reflect.jvm.internal.impl.descriptors.C10397z0.f28195h
            boolean r5 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r5, (java.lang.Object) r6)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x004e
            boolean r4 = r9.mo33623a(r4)
            if (r4 == 0) goto L_0x004e
            kotlin.v r4 = kotlin.C10483v.f28357a
            java.lang.Object r3 = r3.mo35440a(r0, r4)
            kotlin.h0.u.e.e r3 = (kotlin.p045h0.p046u.p047e.C9206e) r3
            goto L_0x004f
        L_0x004e:
            r3 = r1
        L_0x004f:
            if (r3 == 0) goto L_0x001e
            r2.add(r3)
            goto L_0x001e
        L_0x0055:
            java.util.List r8 = kotlin.p262y.C10539w.m35815n(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C9247i.mo33615a(kotlin.h0.u.e.k0.h.q.h, kotlin.h0.u.e.i$c):java.util.Collection");
    }

    /* renamed from: kotlin.h0.u.e.i$g */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class C9255g extends C10313l<C9206e<?>, C10483v> {

        /* renamed from: a */
        final /* synthetic */ C9247i f25807a;

        C9255g(C9247i iVar) {
            this.f25807a = iVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo33629a(C10357l lVar, Object obj) {
            mo33632a(lVar, (C10483v) obj);
            throw null;
        }

        /* renamed from: a */
        public C9206e<?> mo33628a(C10352i0 i0Var, C10483v vVar) {
            C10202j.m34178b(i0Var, "descriptor");
            C10202j.m34178b(vVar, "data");
            return this.f25807a.m30013a(i0Var);
        }

        /* renamed from: a */
        public C9206e<?> mo33630a(C10382u uVar, C10483v vVar) {
            C10202j.m34178b(uVar, "descriptor");
            C10202j.m34178b(vVar, "data");
            return new C9301j(this.f25807a, uVar);
        }

        /* renamed from: a */
        public C9206e<?> mo33632a(C10357l lVar, C10483v vVar) {
            C10202j.m34178b(lVar, "descriptor");
            C10202j.m34178b(vVar, "data");
            throw new IllegalStateException("No constructors should appear in this scope: " + lVar);
        }
    }

    /* renamed from: b */
    public final Method mo33618b(String str, String str2) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, "desc");
        if (C10202j.m34176a((Object) str, (Object) "<init>")) {
            return null;
        }
        return m30010a(mo33620f(), str, (List<? extends Class<?>>) m30016c(str2), m30017d(str2));
    }

    /* renamed from: b */
    public final Constructor<?> mo33617b(String str) {
        C10202j.m34178b(str, "desc");
        Class<?> a = mo33537a();
        ArrayList arrayList = new ArrayList();
        m30014a((List<Class<?>>) arrayList, str, true);
        return m30009a(a, (List<? extends Class<?>>) arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10150s<?> m30013a(C10352i0 i0Var) {
        int i = 0;
        int i2 = i0Var.mo35403X() != null ? 1 : 0;
        if (i0Var.mo35405b0() != null) {
            i = 1;
        }
        int i3 = i2 + i;
        if (i0Var.mo35484Z()) {
            if (i3 == 0) {
                return new C9321k(this, i0Var);
            }
            if (i3 == 1) {
                return new C10120l(this, i0Var);
            }
            if (i3 == 2) {
                return new C10123m(this, i0Var);
            }
        } else if (i3 == 0) {
            return new C10138p(this, i0Var);
        } else {
            if (i3 == 1) {
                return new C10142q(this, i0Var);
            }
            if (i3 == 2) {
                return new C10146r(this, i0Var);
            }
        }
        throw new C10174x("Unsupported property: " + i0Var);
    }

    /* renamed from: a */
    public final C10382u mo33616a(String str, String str2) {
        Iterable iterable;
        String str3;
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, RoomInstalled.SIGNATURE);
        if (C10202j.m34176a((Object) str, (Object) "<init>")) {
            iterable = C10539w.m35815n(mo33541d());
        } else {
            C9939f b = C9939f.m33302b(str);
            C10202j.m34174a((Object) b, "Name.identifier(name)");
            iterable = mo33538a(b);
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable2) {
            if (C10202j.m34176a((Object) C9205d0.f25736b.mo33580a((C10382u) next).mo33551a(), (Object) str2)) {
                arrayList.add(next);
            }
        }
        boolean z = true;
        if (arrayList.size() == 1) {
            return (C10382u) C10539w.m35809i(arrayList);
        }
        String a = C10539w.m35773a(iterable2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C9252d.f25804f, 30, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        if (a.length() != 0) {
            z = false;
        }
        if (z) {
            str3 = " no members found";
        } else {
            str3 = 10 + a;
        }
        sb.append(str3);
        throw new C10174x(sb.toString());
    }

    /* renamed from: c */
    private final List<Class<?>> m30016c(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (C12131w.m40082a((CharSequence) "VZCBSIFJD", charAt, false, 2, (Object) null)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = C12131w.m40060a((CharSequence) str, ';', i2, false, 4, (Object) null) + 1;
            } else {
                throw new C10174x("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(m30008a(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: a */
    private final Method m30011a(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        Method a;
        Method b = m30015b(cls, str, clsArr, cls2);
        if (b != null) {
            return b;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (a = m30011a((Class<?>) superclass, str, clsArr, cls2)) != null) {
            return a;
        }
        for (Class cls3 : cls.getInterfaces()) {
            C10202j.m34174a((Object) cls3, "superInterface");
            Method a2 = m30011a((Class<?>) cls3, str, clsArr, cls2);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Method mo33614a(String str, String str2, boolean z) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, "desc");
        if (C10202j.m34176a((Object) str, (Object) "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo33537a());
        }
        m30014a((List<Class<?>>) arrayList, str2, false);
        Class<?> f = mo33620f();
        return m30010a(f, str + "$default", (List<? extends Class<?>>) arrayList, m30017d(str2));
    }

    /* renamed from: a */
    public final Constructor<?> mo33613a(String str) {
        C10202j.m34178b(str, "desc");
        return m30009a(mo33537a(), (List<? extends Class<?>>) m30016c(str));
    }

    /* renamed from: a */
    private final void m30014a(List<Class<?>> list, String str, boolean z) {
        List<Class<?>> c = m30016c(str);
        list.addAll(c);
        int size = ((c.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            C10202j.m34174a((Object) cls, "Integer.TYPE");
            list.add(cls);
        }
        Class cls2 = z ? f25794f : Object.class;
        C10202j.m34174a(cls2, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(cls2);
    }

    /* renamed from: a */
    private final Class<?> m30008a(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader e = C12029b.m39751e(mo33537a());
            int i3 = i + 1;
            int i4 = i2 - 1;
            if (str != null) {
                String substring = str.substring(i3, i4);
                C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Class<?> loadClass = e.loadClass(C12130v.m40043a(substring, '/', '.', false, 4, (Object) null));
                C10202j.m34174a((Object) loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
                return loadClass;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                Class<?> cls = Void.TYPE;
                C10202j.m34174a((Object) cls, "Void.TYPE");
                return cls;
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return C12029b.m39746a(m30008a(str, i + 1, i2));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        throw new C10174x("Unknown type prefix in the method signature: " + str);
                }
            }
        }
    }

    /* renamed from: a */
    private final Method m30010a(Class<?> cls, String str, List<? extends Class<?>> list, Class<?> cls2) {
        Object[] array = list.toArray(new Class[0]);
        if (array != null) {
            Method a = m30011a(cls, str, (Class<?>[]) (Class[]) array, cls2);
            if (a != null) {
                return a;
            }
            if (!cls.isInterface()) {
                return null;
            }
            Class<Object> cls3 = Object.class;
            Object[] array2 = list.toArray(new Class[0]);
            if (array2 != null) {
                Method a2 = m30011a((Class<?>) cls3, str, (Class<?>[]) (Class[]) array2, cls2);
                if (a2 != null) {
                    return a2;
                }
                return null;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    private final Constructor<?> m30009a(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
