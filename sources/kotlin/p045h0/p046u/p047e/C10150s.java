package kotlin.p045h0.p046u.p047e;

import java.lang.reflect.Field;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10188c;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.C9158g;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p045h0.p046u.p047e.C9200d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9631r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9920e;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9997b;
import kotlin.p045h0.p046u.p047e.p221i0.C9266d;
import kotlin.p045h0.p046u.p047e.p221i0.C9296h;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10350h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10354j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10356k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u0000 >*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004=>?@B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0011J\n\u00104\u001a\u0004\u0018\u00010\u0017H\u0004J\u0013\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u00010\nH\u0002J\u001e\u00107\u001a\u0004\u0018\u00010\n2\b\u00108\u001a\u0004\u0018\u00010\u00172\b\u00109\u001a\u0004\u0018\u00010\nH\u0004J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020\u0007H\u0016R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\r0\r0\u0013X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0013\u0010.\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00102¨\u0006A"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "R", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "_descriptor", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "_javaField", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Ljava/lang/reflect/Field;", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getter", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "isBound", "", "()Z", "isConst", "isLateinit", "isSuspend", "javaField", "getJavaField", "()Ljava/lang/reflect/Field;", "getName", "()Ljava/lang/String;", "getSignature", "computeDelegateField", "equals", "other", "getDelegate", "field", "receiver", "hashCode", "", "toString", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.s */
/* compiled from: KPropertyImpl.kt */
public abstract class C10150s<R> extends C9206e<R> implements C9168l<R> {

    /* renamed from: p */
    private static final Object f27783p = new Object();

    /* renamed from: j */
    private final C10176z.C10178b<Field> f27784j;

    /* renamed from: k */
    private final C10176z.C10177a<C10352i0> f27785k;

    /* renamed from: l */
    private final C9247i f27786l;

    /* renamed from: m */
    private final String f27787m;

    /* renamed from: n */
    private final String f27788n;

    /* renamed from: o */
    private final Object f27789o;

    /* renamed from: kotlin.h0.u.e.s$a */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C10151a<PropertyType, ReturnType> extends C9206e<ReturnType> implements C9157f<ReturnType>, C9168l.C9169a<PropertyType> {
        /* renamed from: d */
        public abstract C10150s<PropertyType> mo33524d();

        /* renamed from: i */
        public C9247i mo33585i() {
            return mo33524d().mo33585i();
        }

        public boolean isSuspend() {
            return mo33587o().isSuspend();
        }

        /* renamed from: j */
        public C9266d<?> mo33586j() {
            return null;
        }

        /* renamed from: o */
        public abstract C10350h0 mo33587o();

        /* renamed from: q */
        public boolean mo33589q() {
            return mo33524d().mo33589q();
        }
    }

    /* renamed from: kotlin.h0.u.e.s$b */
    /* compiled from: KPropertyImpl.kt */
    public static final class C10152b {
        private C10152b() {
        }

        public /* synthetic */ C10152b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004R\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "name", "", "getName", "()Ljava/lang/String;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.s$c */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C10153c<R> extends C10151a<R, R> implements C9168l.C9170b<R> {

        /* renamed from: l */
        static final /* synthetic */ C9168l[] f27790l;

        /* renamed from: j */
        private final C10176z.C10177a f27791j = C10176z.m34125b(new C10155b(this));

        /* renamed from: k */
        private final C10176z.C10178b f27792k = C10176z.m34123a(new C10154a(this));

        /* renamed from: kotlin.h0.u.e.s$c$a */
        /* compiled from: KPropertyImpl.kt */
        static final class C10154a extends C10203k implements C9102a<C9266d<?>> {

            /* renamed from: f */
            final /* synthetic */ C10153c f27793f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10154a(C10153c cVar) {
                super(0);
                this.f27793f = cVar;
            }

            public final C9266d<?> invoke() {
                return C10161t.m34110a(this.f27793f, true);
            }
        }

        /* renamed from: kotlin.h0.u.e.s$c$b */
        /* compiled from: KPropertyImpl.kt */
        static final class C10155b extends C10203k implements C9102a<C10354j0> {

            /* renamed from: f */
            final /* synthetic */ C10153c f27794f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10155b(C10153c cVar) {
                super(0);
                this.f27794f = cVar;
            }

            public final C10354j0 invoke() {
                C10354j0 getter = this.f27794f.mo33524d().mo33587o().getGetter();
                return getter != null ? getter : C9997b.m33642a(this.f27794f.mo33524d().mo33587o(), C10249g.f27910c.mo35429a());
            }
        }

        static {
            Class<C10153c> cls = C10153c.class;
            f27790l = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: f */
        public C9266d<?> mo33584f() {
            return (C9266d) this.f27792k.mo35360a(this, f27790l[1]);
        }

        public String getName() {
            return "<get-" + mo33524d().getName() + '>';
        }

        /* renamed from: o */
        public C10354j0 m34104o() {
            return (C10354j0) this.f27791j.mo35360a(this, f27790l[0]);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u001f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00078VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8VX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "name", "", "getName", "()Ljava/lang/String;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.s$d */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C10156d<R> extends C10151a<R, C10483v> implements C9158g.C9159a<R> {

        /* renamed from: l */
        static final /* synthetic */ C9168l[] f27795l;

        /* renamed from: j */
        private final C10176z.C10177a f27796j = C10176z.m34125b(new C10158b(this));

        /* renamed from: k */
        private final C10176z.C10178b f27797k = C10176z.m34123a(new C10157a(this));

        /* renamed from: kotlin.h0.u.e.s$d$a */
        /* compiled from: KPropertyImpl.kt */
        static final class C10157a extends C10203k implements C9102a<C9266d<?>> {

            /* renamed from: f */
            final /* synthetic */ C10156d f27798f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10157a(C10156d dVar) {
                super(0);
                this.f27798f = dVar;
            }

            public final C9266d<?> invoke() {
                return C10161t.m34110a(this.f27798f, false);
            }
        }

        /* renamed from: kotlin.h0.u.e.s$d$b */
        /* compiled from: KPropertyImpl.kt */
        static final class C10158b extends C10203k implements C9102a<C10356k0> {

            /* renamed from: f */
            final /* synthetic */ C10156d f27799f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10158b(C10156d dVar) {
                super(0);
                this.f27799f = dVar;
            }

            public final C10356k0 invoke() {
                C10356k0 setter = this.f27799f.mo33524d().mo33587o().getSetter();
                return setter != null ? setter : C9997b.m33645a(this.f27799f.mo33524d().mo33587o(), C10249g.f27910c.mo35429a(), C10249g.f27910c.mo35429a());
            }
        }

        static {
            Class<C10156d> cls = C10156d.class;
            f27795l = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: f */
        public C9266d<?> mo33584f() {
            return (C9266d) this.f27797k.mo35360a(this, f27795l[1]);
        }

        public String getName() {
            return "<set-" + mo33524d().getName() + '>';
        }

        /* renamed from: o */
        public C10356k0 m34108o() {
            return (C10356k0) this.f27796j.mo35360a(this, f27795l[0]);
        }
    }

    /* renamed from: kotlin.h0.u.e.s$e */
    /* compiled from: KPropertyImpl.kt */
    static final class C10159e extends C10203k implements C9102a<C10352i0> {

        /* renamed from: f */
        final /* synthetic */ C10150s f27800f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10159e(C10150s sVar) {
            super(0);
            this.f27800f = sVar;
        }

        public final C10352i0 invoke() {
            return this.f27800f.mo33585i().mo33619c(this.f27800f.getName(), this.f27800f.mo35347u());
        }
    }

    /* renamed from: kotlin.h0.u.e.s$f */
    /* compiled from: KPropertyImpl.kt */
    static final class C10160f extends C10203k implements C9102a<Field> {

        /* renamed from: f */
        final /* synthetic */ C10150s f27801f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10160f(C10150s sVar) {
            super(0);
            this.f27801f = sVar;
        }

        public final Field invoke() {
            Class<?> cls;
            C9200d a = C9205d0.f25736b.mo33581a(this.f27801f.mo33587o());
            if (a instanceof C9200d.C9203c) {
                C9200d.C9203c cVar = (C9200d.C9203c) a;
                C10352i0 b = cVar.mo33573b();
                C9920e.C9921a a2 = C9928i.m33155a(C9928i.f27389b, cVar.mo33575d(), cVar.mo33574c(), cVar.mo33577f(), false, 8, (Object) null);
                if (a2 == null) {
                    return null;
                }
                if (C9631r.m31051a(b) || C9928i.m33159a(cVar.mo33575d())) {
                    cls = this.f27801f.mo33585i().mo33537a().getEnclosingClass();
                } else {
                    C10359m b2 = b.mo33762b();
                    if (b2 instanceof C10342e) {
                        cls = C9244g0.m29996a((C10342e) b2);
                    } else {
                        cls = this.f27801f.mo33585i().mo33537a();
                    }
                }
                if (cls == null) {
                    return null;
                }
                try {
                    return cls.getDeclaredField(a2.mo34926c());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            } else if (a instanceof C9200d.C9201a) {
                return ((C9200d.C9201a) a).mo33570b();
            } else {
                if ((a instanceof C9200d.C9202b) || (a instanceof C9200d.C9204d)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        new C10152b((DefaultConstructorMarker) null);
    }

    private C10150s(C9247i iVar, String str, String str2, C10352i0 i0Var, Object obj) {
        this.f27786l = iVar;
        this.f27787m = str;
        this.f27788n = str2;
        this.f27789o = obj;
        C10176z.C10178b<Field> a = C10176z.m34123a(new C10160f(this));
        C10202j.m34174a((Object) a, "ReflectProperties.lazy {…y -> null\n        }\n    }");
        this.f27784j = a;
        C10176z.C10177a<C10352i0> a2 = C10176z.m34122a(i0Var, new C10159e(this));
        C10202j.m34174a((Object) a2, "ReflectProperties.lazySo…or(name, signature)\n    }");
        this.f27785k = a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo35340a(Field field, Object obj) {
        try {
            if (obj == f27783p) {
                if (mo33587o().mo35405b0() == null) {
                    throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() " + "is not going to work, use getDelegate() instead");
                }
            }
            if (field != null) {
                return field.get(obj);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    public boolean equals(Object obj) {
        C10150s<?> c = C9244g0.m30006c(obj);
        if (c == null || !C10202j.m34176a((Object) mo33585i(), (Object) c.mo33585i()) || !C10202j.m34176a((Object) getName(), (Object) c.getName()) || !C10202j.m34176a((Object) this.f27788n, (Object) c.f27788n) || !C10202j.m34176a(this.f27789o, c.f27789o)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C9266d<?> mo33584f() {
        return getGetter().mo33584f();
    }

    public abstract C10153c<R> getGetter();

    public String getName() {
        return this.f27787m;
    }

    public int hashCode() {
        return (((mo33585i().hashCode() * 31) + getName().hashCode()) * 31) + this.f27788n.hashCode();
    }

    /* renamed from: i */
    public C9247i mo33585i() {
        return this.f27786l;
    }

    public boolean isConst() {
        return mo33587o().isConst();
    }

    public boolean isLateinit() {
        return mo33587o().mo35488g0();
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: j */
    public C9266d<?> mo33586j() {
        return getGetter().mo33586j();
    }

    /* renamed from: q */
    public boolean mo33589q() {
        return !C10202j.m34176a(this.f27789o, C10188c.NO_RECEIVER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Field mo35343r() {
        if (mo33587o().mo35575H()) {
            return mo35345t();
        }
        return null;
    }

    /* renamed from: s */
    public final Object mo35344s() {
        return C9296h.m30069a(this.f27789o, (C10238b) mo33587o());
    }

    /* renamed from: t */
    public final Field mo35345t() {
        return this.f27784j.mo35358a();
    }

    public String toString() {
        return C9197c0.f25721b.mo33563a(mo33587o());
    }

    /* renamed from: u */
    public final String mo35347u() {
        return this.f27788n;
    }

    /* renamed from: o */
    public C10352i0 m34090o() {
        C10352i0 a = this.f27785k.mo35358a();
        C10202j.m34174a((Object) a, "_descriptor()");
        return a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10150s(C9247i iVar, String str, String str2, Object obj) {
        this(iVar, str, str2, (C10352i0) null, obj);
        C10202j.m34178b(iVar, "container");
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, RoomInstalled.SIGNATURE);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10150s(kotlin.p045h0.p046u.p047e.C9247i r8, kotlin.reflect.jvm.internal.impl.descriptors.C10352i0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C10202j.m34178b(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C10202j.m34178b(r9, r0)
            kotlin.h0.u.e.k0.e.f r0 = r9.getName()
            java.lang.String r3 = r0.mo35021a()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r0)
            kotlin.h0.u.e.d0 r0 = kotlin.p045h0.p046u.p047e.C9205d0.f25736b
            kotlin.h0.u.e.d r0 = r0.mo33581a((kotlin.reflect.jvm.internal.impl.descriptors.C10352i0) r9)
            java.lang.String r4 = r0.mo33569a()
            java.lang.Object r6 = kotlin.jvm.internal.C10188c.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C10150s.<init>(kotlin.h0.u.e.i, kotlin.reflect.jvm.internal.impl.descriptors.i0):void");
    }
}
