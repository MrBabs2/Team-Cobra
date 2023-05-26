package kotlin.p045h0.p046u.p047e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10188c;
import kotlin.jvm.internal.C10199g;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.C9166k;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p045h0.p046u.p047e.C9185b;
import kotlin.p045h0.p046u.p047e.C9188c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10078a;
import kotlin.p045h0.p046u.p047e.p221i0.C9256a;
import kotlin.p045h0.p046u.p047e.p221i0.C9266d;
import kotlin.p045h0.p046u.p047e.p221i0.C9268e;
import kotlin.p045h0.p046u.p047e.p221i0.C9293f;
import kotlin.p045h0.p046u.p047e.p221i0.C9296h;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B)\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0012J&\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304032\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u00106\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0010\u0010:\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0013\u0010;\u001a\u00020)2\b\u0010<\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010=\u001a\u00020\u0014H\u0016J\b\u0010>\u001a\u00020\tH\u0016R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R!\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8VX\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u001cR\u001b\u0010\r\u001a\u00020\u000e8VX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "arity", "", "getArity", "()I", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "getName", "()Ljava/lang/String;", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "member", "createInstanceMethodCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "createJvmStaticInObjectCaller", "createStaticMethodCaller", "equals", "other", "hashCode", "toString", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.j */
/* compiled from: KFunctionImpl.kt */
public final class C9301j extends C9206e<Object> implements C10199g<Object>, C9157f<Object>, C9185b {

    /* renamed from: p */
    static final /* synthetic */ C9168l[] f25860p;

    /* renamed from: j */
    private final C10176z.C10177a f25861j;

    /* renamed from: k */
    private final C10176z.C10178b f25862k;

    /* renamed from: l */
    private final C10176z.C10178b f25863l;

    /* renamed from: m */
    private final C9247i f25864m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final String f25865n;

    /* renamed from: o */
    private final Object f25866o;

    /* renamed from: kotlin.h0.u.e.j$a */
    /* compiled from: KFunctionImpl.kt */
    static final class C9302a extends C10203k implements C9102a<C9266d<? extends Member>> {

        /* renamed from: f */
        final /* synthetic */ C9301j f25867f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9302a(C9301j jVar) {
            super(0);
            this.f25867f = jVar;
        }

        public final C9266d<Member> invoke() {
            Object obj;
            C9266d dVar;
            C9188c a = C9205d0.f25736b.mo33580a(this.f25867f.mo33587o());
            if (a instanceof C9188c.C9195d) {
                if (this.f25867f.mo33588p()) {
                    Class<?> a2 = this.f25867f.mo33585i().mo33537a();
                    List<C9166k> parameters = this.f25867f.getParameters();
                    ArrayList arrayList = new ArrayList(C10531p.m35750a(parameters, 10));
                    for (C9166k name : parameters) {
                        String name2 = name.getName();
                        if (name2 != null) {
                            arrayList.add(name2);
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                    return new C9256a(a2, arrayList, C9256a.C9257a.POSITIONAL_CALL, C9256a.C9258b.KOTLIN, (List) null, 16, (DefaultConstructorMarker) null);
                }
                obj = this.f25867f.mo33585i().mo33613a(((C9188c.C9195d) a).mo33558b());
            } else if (a instanceof C9188c.C9196e) {
                C9188c.C9196e eVar = (C9188c.C9196e) a;
                obj = this.f25867f.mo33585i().mo33618b(eVar.mo33560c(), eVar.mo33559b());
            } else if (a instanceof C9188c.C9194c) {
                obj = ((C9188c.C9194c) a).mo33557b();
            } else if (a instanceof C9188c.C9192b) {
                obj = ((C9188c.C9192b) a).mo33555b();
            } else if (a instanceof C9188c.C9189a) {
                List<Method> b = ((C9188c.C9189a) a).mo33552b();
                Class<?> a3 = this.f25867f.mo33585i().mo33537a();
                ArrayList arrayList2 = new ArrayList(C10531p.m35750a(b, 10));
                for (Method method : b) {
                    C10202j.m34174a((Object) method, "it");
                    arrayList2.add(method.getName());
                }
                return new C9256a(a3, arrayList2, C9256a.C9257a.POSITIONAL_CALL, C9256a.C9258b.JAVA, b);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (obj instanceof Constructor) {
                C9301j jVar = this.f25867f;
                dVar = jVar.m30083a((Constructor<?>) (Constructor) obj, jVar.mo33587o());
            } else if (obj instanceof Method) {
                Method method2 = (Method) obj;
                if (!Modifier.isStatic(method2.getModifiers())) {
                    dVar = this.f25867f.m30081a(method2);
                } else if (this.f25867f.mo33587o().getAnnotations().mo33885a(C9244g0.m30002a()) != null) {
                    dVar = this.f25867f.m30085b(method2);
                } else {
                    dVar = this.f25867f.m30087c(method2);
                }
            } else {
                throw new C10174x("Could not compute caller for function: " + this.f25867f.mo33587o() + " (member = " + obj + ')');
            }
            return C9296h.m30072a(dVar, this.f25867f.mo33587o(), false, 2, (Object) null);
        }
    }

    /* renamed from: kotlin.h0.u.e.j$b */
    /* compiled from: KFunctionImpl.kt */
    static final class C9303b extends C10203k implements C9102a<C9266d<? extends Member>> {

        /* renamed from: f */
        final /* synthetic */ C9301j f25868f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9303b(C9301j jVar) {
            super(0);
            this.f25868f = jVar;
        }

        public final C9266d<Member> invoke() {
            Object obj;
            C9266d dVar;
            C9188c a = C9205d0.f25736b.mo33580a(this.f25868f.mo33587o());
            if (a instanceof C9188c.C9196e) {
                C9247i i = this.f25868f.mo33585i();
                C9188c.C9196e eVar = (C9188c.C9196e) a;
                String c = eVar.mo33560c();
                String b = eVar.mo33559b();
                Member member = this.f25868f.mo33584f().getMember();
                if (member != null) {
                    obj = i.mo33614a(c, b, !Modifier.isStatic(member.getModifiers()));
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            } else if (a instanceof C9188c.C9195d) {
                if (this.f25868f.mo33588p()) {
                    Class<?> a2 = this.f25868f.mo33585i().mo33537a();
                    List<C9166k> parameters = this.f25868f.getParameters();
                    ArrayList arrayList = new ArrayList(C10531p.m35750a(parameters, 10));
                    for (C9166k name : parameters) {
                        String name2 = name.getName();
                        if (name2 != null) {
                            arrayList.add(name2);
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                    return new C9256a(a2, arrayList, C9256a.C9257a.CALL_BY_NAME, C9256a.C9258b.KOTLIN, (List) null, 16, (DefaultConstructorMarker) null);
                }
                obj = this.f25868f.mo33585i().mo33617b(((C9188c.C9195d) a).mo33558b());
            } else if (a instanceof C9188c.C9189a) {
                List<Method> b2 = ((C9188c.C9189a) a).mo33552b();
                Class<?> a3 = this.f25868f.mo33585i().mo33537a();
                ArrayList arrayList2 = new ArrayList(C10531p.m35750a(b2, 10));
                for (Method method : b2) {
                    C10202j.m34174a((Object) method, "it");
                    arrayList2.add(method.getName());
                }
                return new C9256a(a3, arrayList2, C9256a.C9257a.CALL_BY_NAME, C9256a.C9258b.JAVA, b2);
            } else {
                obj = null;
            }
            if (obj instanceof Constructor) {
                C9301j jVar = this.f25868f;
                dVar = jVar.m30083a((Constructor<?>) (Constructor) obj, jVar.mo33587o());
            } else if (obj instanceof Method) {
                if (this.f25868f.mo33587o().getAnnotations().mo33885a(C9244g0.m30002a()) != null) {
                    C10359m b3 = this.f25868f.mo33587o().mo33762b();
                    if (b3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    } else if (!((C10342e) b3).mo33779v()) {
                        dVar = this.f25868f.m30085b((Method) obj);
                    }
                }
                dVar = this.f25868f.m30087c((Method) obj);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                return C9296h.m30071a(dVar, this.f25868f.mo33587o(), true);
            }
            return null;
        }
    }

    /* renamed from: kotlin.h0.u.e.j$c */
    /* compiled from: KFunctionImpl.kt */
    static final class C9304c extends C10203k implements C9102a<C10382u> {

        /* renamed from: f */
        final /* synthetic */ C9301j f25869f;

        /* renamed from: g */
        final /* synthetic */ String f25870g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9304c(C9301j jVar, String str) {
            super(0);
            this.f25869f = jVar;
            this.f25870g = str;
        }

        public final C10382u invoke() {
            return this.f25869f.mo33585i().mo33616a(this.f25870g, this.f25869f.f25865n);
        }
    }

    static {
        Class<C9301j> cls = C9301j.class;
        f25860p = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C9301j(C9247i iVar, String str, String str2, C10382u uVar, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, str, str2, uVar, (i & 16) != 0 ? C10188c.NO_RECEIVER : obj);
    }

    /* renamed from: r */
    private final Object m30089r() {
        return C9296h.m30069a(this.f25866o, (C10238b) mo33587o());
    }

    public boolean equals(Object obj) {
        C9301j b = C9244g0.m30005b(obj);
        if (b == null || !C10202j.m34176a((Object) mo33585i(), (Object) b.mo33585i()) || !C10202j.m34176a((Object) getName(), (Object) b.getName()) || !C10202j.m34176a((Object) this.f25865n, (Object) b.f25865n) || !C10202j.m34176a(this.f25866o, b.f25866o)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C9266d<?> mo33584f() {
        return (C9266d) this.f25862k.mo35360a(this, f25860p[1]);
    }

    public int getArity() {
        return C9293f.m30062a(mo33584f());
    }

    public String getName() {
        String a = mo33587o().getName().mo35021a();
        C10202j.m34174a((Object) a, "descriptor.name.asString()");
        return a;
    }

    public int hashCode() {
        return (((mo33585i().hashCode() * 31) + getName().hashCode()) * 31) + this.f25865n.hashCode();
    }

    /* renamed from: i */
    public C9247i mo33585i() {
        return this.f25864m;
    }

    public Object invoke() {
        return C9185b.C9186a.m29890a(this);
    }

    public boolean isSuspend() {
        return mo33587o().isSuspend();
    }

    /* renamed from: j */
    public C9266d<?> mo33586j() {
        return (C9266d) this.f25863l.mo35360a(this, f25860p[2]);
    }

    /* renamed from: o */
    public C10382u m30095o() {
        return (C10382u) this.f25861j.mo35360a(this, f25860p[0]);
    }

    /* renamed from: q */
    public boolean mo33589q() {
        return !C10202j.m34176a(this.f25866o, C10188c.NO_RECEIVER);
    }

    public String toString() {
        return C9197c0.f25721b.mo33565a(mo33587o());
    }

    private C9301j(C9247i iVar, String str, String str2, C10382u uVar, Object obj) {
        this.f25864m = iVar;
        this.f25865n = str2;
        this.f25866o = obj;
        this.f25861j = C10176z.m34122a(uVar, new C9304c(this, str));
        this.f25862k = C10176z.m34123a(new C9302a(this));
        this.f25863l = C10176z.m34123a(new C9303b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C9268e.C9286h m30085b(Method method) {
        return mo33589q() ? new C9268e.C9286h.C9288b(method) : new C9268e.C9286h.C9291e(method);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C9268e.C9286h m30087c(Method method) {
        return mo33589q() ? new C9268e.C9286h.C9289c(method, m30089r()) : new C9268e.C9286h.C9292f(method);
    }

    public Object invoke(Object obj) {
        return C9185b.C9186a.m29891a(this, obj);
    }

    public Object invoke(Object obj, Object obj2) {
        return C9185b.C9186a.m29892a(this, obj, obj2);
    }

    /* renamed from: a */
    public Object mo33471a(Object obj, Object obj2, Object obj3) {
        return C9185b.C9186a.m29893a(this, obj, obj2, obj3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C9268e.C9286h m30081a(Method method) {
        return mo33589q() ? new C9268e.C9286h.C9287a(method, m30089r()) : new C9268e.C9286h.C9290d(method);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9301j(C9247i iVar, String str, String str2, Object obj) {
        this(iVar, str, str2, (C10382u) null, obj);
        C10202j.m34178b(iVar, "container");
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, RoomInstalled.SIGNATURE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C9268e<Constructor<?>> m30083a(Constructor<?> constructor, C10382u uVar) {
        if (C10078a.m33914a((C10238b) uVar)) {
            if (mo33589q()) {
                return new C9268e.C9269a(constructor, m30089r());
            }
            return new C9268e.C9270b(constructor);
        } else if (mo33589q()) {
            return new C9268e.C9271c(constructor, m30089r());
        } else {
            return new C9268e.C9273e(constructor);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9301j(kotlin.p045h0.p046u.p047e.C9247i r10, kotlin.reflect.jvm.internal.impl.descriptors.C10382u r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C10202j.m34178b(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C10202j.m34178b(r11, r0)
            kotlin.h0.u.e.k0.e.f r0 = r11.getName()
            java.lang.String r3 = r0.mo35021a()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r0)
            kotlin.h0.u.e.d0 r0 = kotlin.p045h0.p046u.p047e.C9205d0.f25736b
            kotlin.h0.u.e.c r0 = r0.mo33580a((kotlin.reflect.jvm.internal.impl.descriptors.C10382u) r11)
            java.lang.String r4 = r0.mo33551a()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C9301j.<init>(kotlin.h0.u.e.i, kotlin.reflect.jvm.internal.impl.descriptors.u):void");
    }
}
