package kotlin.p045h0.p046u.p047e;

import java.util.Collection;
import java.util.List;
import kotlin.C10221n;
import kotlin.C10480s;
import kotlin.C4789l;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p045h0.p046u.p047e.C9247i;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11786x;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9401d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0.C9688a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9878f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9880h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9923f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9925g;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p222j0.C9310f;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012 \u000f*\b\u0018\u00010\u000eR\u00020\u00000\u000eR\u00020\u00000\rX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "usageModuleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "getUsageModuleName", "()Ljava/lang/String;", "equals", "", "other", "", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "toString", "Data", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.n */
/* compiled from: KPackageImpl.kt */
public final class C10126n extends C9247i {

    /* renamed from: i */
    private final C10176z.C10178b<C10127a> f27747i;

    /* renamed from: j */
    private final Class<?> f27748j;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R%\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR/\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!¨\u0006#"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "kotlinClass", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "getKotlinClass", "()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "kotlinClass$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "members", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "metadata", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "getMetadata", "()Lkotlin/Triple;", "metadata$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "multifileFacade", "Ljava/lang/Class;", "getMultifileFacade", "()Ljava/lang/Class;", "multifileFacade$delegate", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope$delegate", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.n$a */
    /* compiled from: KPackageImpl.kt */
    private final class C10127a extends C9247i.C9249b {

        /* renamed from: i */
        static final /* synthetic */ C9168l[] f27749i;

        /* renamed from: d */
        private final C10176z.C10177a f27750d = C10176z.m34125b(new C10128a(this));

        /* renamed from: e */
        private final C10176z.C10177a f27751e = C10176z.m34125b(new C10132e(this));

        /* renamed from: f */
        private final C10176z.C10178b f27752f = C10176z.m34123a(new C10131d(this));

        /* renamed from: g */
        private final C10176z.C10178b f27753g = C10176z.m34123a(new C10130c(this));

        /* renamed from: kotlin.h0.u.e.n$a$a */
        /* compiled from: KPackageImpl.kt */
        static final class C10128a extends C10203k implements C9102a<C9310f> {

            /* renamed from: f */
            final /* synthetic */ C10127a f27755f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10128a(C10127a aVar) {
                super(0);
                this.f27755f = aVar;
            }

            public final C9310f invoke() {
                return C9310f.f25877c.mo33670a(C10126n.this.mo33537a());
            }
        }

        /* renamed from: kotlin.h0.u.e.n$a$b */
        /* compiled from: KPackageImpl.kt */
        static final class C10129b extends C10203k implements C9102a<Collection<? extends C9206e<?>>> {

            /* renamed from: f */
            final /* synthetic */ C10127a f27756f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10129b(C10127a aVar) {
                super(0);
                this.f27756f = aVar;
            }

            public final Collection<C9206e<?>> invoke() {
                C10127a aVar = this.f27756f;
                return C10126n.this.mo33615a(aVar.mo35333d(), C9247i.C9251c.DECLARED);
            }
        }

        /* renamed from: kotlin.h0.u.e.n$a$c */
        /* compiled from: KPackageImpl.kt */
        static final class C10130c extends C10203k implements C9102a<C10480s<? extends C9925g, ? extends C9856v, ? extends C9923f>> {

            /* renamed from: f */
            final /* synthetic */ C10127a f27757f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10130c(C10127a aVar) {
                super(0);
                this.f27757f = aVar;
            }

            public final C10480s<C9925g, C9856v, C9923f> invoke() {
                C9688a a;
                C9310f a2 = this.f27757f.m34064e();
                if (a2 == null || (a = a2.mo33661a()) == null) {
                    return null;
                }
                String[] a3 = a.mo34259a();
                String[] g = a.mo34265g();
                if (a3 == null || g == null) {
                    return null;
                }
                C10221n<C9925g, C9856v> c = C9928i.m33162c(a3, g);
                return new C10480s<>(c.mo35389a(), c.mo35390b(), a.mo34262d());
            }
        }

        /* renamed from: kotlin.h0.u.e.n$a$d */
        /* compiled from: KPackageImpl.kt */
        static final class C10131d extends C10203k implements C9102a<Class<?>> {

            /* renamed from: f */
            final /* synthetic */ C10127a f27758f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10131d(C10127a aVar) {
                super(0);
                this.f27758f = aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
                r0 = r0.mo33661a();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Class<?> invoke() {
                /*
                    r8 = this;
                    kotlin.h0.u.e.n$a r0 = r8.f27758f
                    kotlin.h0.u.e.j0.f r0 = r0.m34064e()
                    r1 = 0
                    if (r0 == 0) goto L_0x0015
                    kotlin.h0.u.e.k0.c.b.a0.a r0 = r0.mo33661a()
                    if (r0 == 0) goto L_0x0015
                    java.lang.String r0 = r0.mo34263e()
                    r2 = r0
                    goto L_0x0016
                L_0x0015:
                    r2 = r1
                L_0x0016:
                    if (r2 == 0) goto L_0x003e
                    int r0 = r2.length()
                    if (r0 <= 0) goto L_0x0020
                    r0 = 1
                    goto L_0x0021
                L_0x0020:
                    r0 = 0
                L_0x0021:
                    if (r0 == 0) goto L_0x003e
                    kotlin.h0.u.e.n$a r0 = r8.f27758f
                    kotlin.h0.u.e.n r0 = kotlin.p045h0.p046u.p047e.C10126n.this
                    java.lang.Class r0 = r0.mo33537a()
                    java.lang.ClassLoader r0 = r0.getClassLoader()
                    r3 = 47
                    r4 = 46
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    java.lang.String r1 = kotlin.p392j0.C12130v.m40043a((java.lang.String) r2, (char) r3, (char) r4, (boolean) r5, (int) r6, (java.lang.Object) r7)
                    java.lang.Class r1 = r0.loadClass(r1)
                L_0x003e:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C10126n.C10127a.C10131d.invoke():java.lang.Class");
            }
        }

        /* renamed from: kotlin.h0.u.e.n$a$e */
        /* compiled from: KPackageImpl.kt */
        static final class C10132e extends C10203k implements C9102a<C10096h> {

            /* renamed from: f */
            final /* synthetic */ C10127a f27759f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10132e(C10127a aVar) {
                super(0);
                this.f27759f = aVar;
            }

            public final C10096h invoke() {
                C9310f a = this.f27759f.m34064e();
                if (a != null) {
                    return this.f27759f.mo33622a().mo33678c().mo33653a(a);
                }
                return C10096h.C10099b.f27722b;
            }
        }

        static {
            Class<C10127a> cls = C10127a.class;
            f27749i = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kotlinClass", "getKotlinClass()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "metadata", "getMetadata()Lkotlin/Triple;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public C10127a() {
            super();
            C10176z.m34125b(new C10129b(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final C9310f m34064e() {
            return (C9310f) this.f27750d.mo35360a(this, f27749i[0]);
        }

        /* renamed from: b */
        public final C10480s<C9925g, C9856v, C9923f> mo35331b() {
            return (C10480s) this.f27753g.mo35360a(this, f27749i[3]);
        }

        /* renamed from: c */
        public final Class<?> mo35332c() {
            return (Class) this.f27752f.mo35360a(this, f27749i[2]);
        }

        /* renamed from: d */
        public final C10096h mo35333d() {
            return (C10096h) this.f27751e.mo35360a(this, f27749i[1]);
        }
    }

    /* renamed from: kotlin.h0.u.e.n$b */
    /* compiled from: KPackageImpl.kt */
    static final class C10133b extends C10203k implements C9102a<C10127a> {

        /* renamed from: f */
        final /* synthetic */ C10126n f27760f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10133b(C10126n nVar) {
            super(0);
            this.f27760f = nVar;
        }

        public final C10127a invoke() {
            return new C10127a();
        }
    }

    /* renamed from: kotlin.h0.u.e.n$c */
    /* compiled from: KPackageImpl.kt */
    static final /* synthetic */ class C10134c extends C10200h implements C9117p<C11786x, C9930z, C10352i0> {

        /* renamed from: g */
        public static final C10134c f27761g = new C10134c();

        C10134c() {
            super(2);
        }

        /* renamed from: a */
        public final C10352i0 invoke(C11786x xVar, C9930z zVar) {
            C10202j.m34178b(xVar, "p1");
            C10202j.m34178b(zVar, "p2");
            return xVar.mo38393a(zVar);
        }

        public final String getName() {
            return "loadProperty";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C11786x.class);
        }

        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public C10126n(Class<?> cls, String str) {
        C10202j.m34178b(cls, "jClass");
        this.f27748j = cls;
        C10176z.C10178b<C10127a> a = C10176z.m34123a(new C10133b(this));
        C10202j.m34174a((Object) a, "ReflectProperties.lazy { Data() }");
        this.f27747i = a;
    }

    /* renamed from: j */
    private final C10096h m34056j() {
        return this.f27747i.mo35358a().mo35333d();
    }

    /* renamed from: a */
    public Class<?> mo33537a() {
        return this.f27748j;
    }

    /* renamed from: b */
    public Collection<C10352i0> mo33540b(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        return m34056j().mo33918c(fVar, C9401d.FROM_REFLECTION);
    }

    /* renamed from: d */
    public Collection<C10357l> mo33541d() {
        return C10529o.m35736a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10126n) && C10202j.m34176a((Object) mo33537a(), (Object) ((C10126n) obj).mo33537a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Class<?> mo33620f() {
        Class<?> c = this.f27747i.mo35358a().mo35332c();
        return c != null ? c : mo33537a();
    }

    public int hashCode() {
        return mo33537a().hashCode();
    }

    public String toString() {
        return "file class " + C12029b.m39748b(mo33537a()).mo34983a();
    }

    /* renamed from: a */
    public Collection<C10382u> mo33538a(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        return m34056j().mo33913a(fVar, C9401d.FROM_REFLECTION);
    }

    /* renamed from: a */
    public C10352i0 mo33539a(int i) {
        C10480s<C9925g, C9856v, C9923f> b = this.f27747i.mo35358a().mo35331b();
        if (b == null) {
            return null;
        }
        C9925g a = b.mo35887a();
        C9856v b2 = b.mo35888b();
        C9923f c = b.mo35889c();
        C10427h.C10435g<C9856v, List<C9930z>> gVar = C9890a.f27296m;
        C10202j.m34174a((Object) gVar, "JvmProtoBuf.packageLocalVariable");
        C9930z zVar = (C9930z) C9878f.m32874a(b2, gVar, i);
        if (zVar == null) {
            return null;
        }
        Class<?> a2 = mo33537a();
        C9821n0 r = b2.mo34806r();
        C10202j.m34174a((Object) r, "packageProto.typeTable");
        return (C10352i0) C9244g0.m30003a(a2, zVar, a, new C9880h(r), c, C10134c.f27761g);
    }
}
