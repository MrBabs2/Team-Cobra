package kotlin.p045h0.p046u.p047e.p221i0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10218z;
import kotlin.p045h0.p046u.p047e.p221i0.C9266d;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001e*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\b\u001b\u001c\u001d\u001e\u001f !\"B3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0004R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0001\u0007#$%&'()¨\u0006*"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "member", "returnType", "Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "valueParameterTypes", "", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "getInstanceClass", "()Ljava/lang/Class;", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "getReturnType", "()Ljava/lang/reflect/Type;", "checkObjectInstance", "", "obj", "", "AccessorForHiddenBoundConstructor", "AccessorForHiddenConstructor", "BoundConstructor", "Companion", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.i0.e */
/* compiled from: CallerImpl.kt */
public abstract class C9268e<M extends Member> implements C9266d<M> {

    /* renamed from: e */
    public static final C9272d f25836e = new C9272d((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final List<Type> f25837a;

    /* renamed from: b */
    private final M f25838b;

    /* renamed from: c */
    private final Type f25839c;

    /* renamed from: d */
    private final Class<?> f25840d;

    /* renamed from: kotlin.h0.u.e.i0.e$a */
    /* compiled from: CallerImpl.kt */
    public static final class C9269a extends C9268e<Constructor<?>> implements C9265c {

        /* renamed from: f */
        private final Object f25841f;

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object[]] */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9269a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C10202j.m34178b(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x001f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x0028
            L_0x001f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = kotlin.p262y.C10516j.m35593a(r0, r2, r1)
                if (r0 == 0) goto L_0x0035
            L_0x0028:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f25841f = r9
                return
            L_0x0035:
                kotlin.TypeCastException r8 = new kotlin.TypeCastException
                java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T>"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9269a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C10202j.m34178b(objArr, "args");
            mo33642a(objArr);
            C10218z zVar = new C10218z(3);
            zVar.mo35386a(this.f25841f);
            zVar.mo35388b(objArr);
            zVar.mo35386a((Object) null);
            return ((Constructor) getMember()).newInstance(zVar.mo35387a(new Object[zVar.mo35385a()]));
        }
    }

    /* renamed from: kotlin.h0.u.e.i0.e$b */
    /* compiled from: CallerImpl.kt */
    public static final class C9270b extends C9268e<Constructor<?>> {
        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object[]] */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9270b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C10202j.m34178b(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L_0x001f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x0027
            L_0x001f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = kotlin.p262y.C10516j.m35593a(r0, r2, r1)
                if (r0 == 0) goto L_0x0032
            L_0x0027:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            L_0x0032:
                kotlin.TypeCastException r8 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9270b.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C10202j.m34178b(objArr, "args");
            mo33642a(objArr);
            C10218z zVar = new C10218z(2);
            zVar.mo35388b(objArr);
            zVar.mo35386a((Object) null);
            return ((Constructor) getMember()).newInstance(zVar.mo35387a(new Object[zVar.mo35385a()]));
        }
    }

    /* renamed from: kotlin.h0.u.e.i0.e$c */
    /* compiled from: CallerImpl.kt */
    public static final class C9271c extends C9268e<Constructor<?>> implements C9265c {

        /* renamed from: f */
        private final Object f25842f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9271c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C10202j.m34178b(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f25842f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9271c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C10202j.m34178b(objArr, "args");
            mo33642a(objArr);
            C10218z zVar = new C10218z(2);
            zVar.mo35386a(this.f25842f);
            zVar.mo35388b(objArr);
            return ((Constructor) getMember()).newInstance(zVar.mo35387a(new Object[zVar.mo35385a()]));
        }
    }

    /* renamed from: kotlin.h0.u.e.i0.e$d */
    /* compiled from: CallerImpl.kt */
    public static final class C9272d {
        private C9272d() {
        }

        public /* synthetic */ C9272d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.i0.e$e */
    /* compiled from: CallerImpl.kt */
    public static final class C9273e extends C9268e<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9273e(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C10202j.m34178b(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.String r1 = "klass"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0029
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0029
                r4 = r1
                goto L_0x002b
            L_0x0029:
                r0 = 0
                r4 = r0
            L_0x002b:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9273e.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C10202j.m34178b(objArr, "args");
            mo33642a(objArr);
            return ((Constructor) getMember()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "requiresInstance", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.i0.e$f */
    /* compiled from: CallerImpl.kt */
    public static abstract class C9274f extends C9268e<Field> {

        /* renamed from: kotlin.h0.u.e.i0.e$f$a */
        /* compiled from: CallerImpl.kt */
        public static final class C9275a extends C9274f implements C9265c {

            /* renamed from: f */
            private final Object f25843f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9275a(Field field, Object obj) {
                super(field, false, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
                this.f25843f = obj;
            }

            public Object call(Object[] objArr) {
                C10202j.m34178b(objArr, "args");
                mo33642a(objArr);
                return ((Field) getMember()).get(this.f25843f);
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$f$b */
        /* compiled from: CallerImpl.kt */
        public static final class C9276b extends C9274f implements C9265c {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9276b(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$f$c */
        /* compiled from: CallerImpl.kt */
        public static final class C9277c extends C9274f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9277c(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$f$d */
        /* compiled from: CallerImpl.kt */
        public static final class C9278d extends C9274f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9278d(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
            }

            /* renamed from: a */
            public void mo33642a(Object[] objArr) {
                C10202j.m34178b(objArr, "args");
                C9268e.super.mo33642a(objArr);
                mo33641a(C10519k.m35648f(objArr));
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$f$e */
        /* compiled from: CallerImpl.kt */
        public static final class C9279e extends C9274f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9279e(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
            }
        }

        public /* synthetic */ C9274f(Field field, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z);
        }

        public Object call(Object[] objArr) {
            C10202j.m34178b(objArr, "args");
            mo33642a(objArr);
            return ((Field) getMember()).get(mo33643b() != null ? C10519k.m35647e(objArr) : null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C9274f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9274f.<init>(java.lang.reflect.Field, boolean):void");
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "notNull", "", "requiresInstance", "(Ljava/lang/reflect/Field;ZZ)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.i0.e$g */
    /* compiled from: CallerImpl.kt */
    public static abstract class C9280g extends C9268e<Field> {

        /* renamed from: f */
        private final boolean f25844f;

        /* renamed from: kotlin.h0.u.e.i0.e$g$a */
        /* compiled from: CallerImpl.kt */
        public static final class C9281a extends C9280g implements C9265c {

            /* renamed from: g */
            private final Object f25845g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9281a(Field field, boolean z, Object obj) {
                super(field, z, false, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
                this.f25845g = obj;
            }

            public Object call(Object[] objArr) {
                C10202j.m34178b(objArr, "args");
                mo33642a(objArr);
                ((Field) getMember()).set(this.f25845g, C10519k.m35647e(objArr));
                return C10483v.f28357a;
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$g$b */
        /* compiled from: CallerImpl.kt */
        public static final class C9282b extends C9280g implements C9265c {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9282b(Field field, boolean z) {
                super(field, z, false, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
            }

            public Object call(Object[] objArr) {
                C10202j.m34178b(objArr, "args");
                mo33642a(objArr);
                ((Field) getMember()).set((Object) null, C10519k.m35650h(objArr));
                return C10483v.f28357a;
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$g$c */
        /* compiled from: CallerImpl.kt */
        public static final class C9283c extends C9280g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9283c(Field field, boolean z) {
                super(field, z, true, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$g$d */
        /* compiled from: CallerImpl.kt */
        public static final class C9284d extends C9280g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9284d(Field field, boolean z) {
                super(field, z, true, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
            }

            /* renamed from: a */
            public void mo33642a(Object[] objArr) {
                C10202j.m34178b(objArr, "args");
                super.mo33642a(objArr);
                mo33641a(C10519k.m35648f(objArr));
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$g$e */
        /* compiled from: CallerImpl.kt */
        public static final class C9285e extends C9280g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9285e(Field field, boolean z) {
                super(field, z, false, (DefaultConstructorMarker) null);
                C10202j.m34178b(field, "field");
            }
        }

        public /* synthetic */ C9280g(Field field, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z, z2);
        }

        /* renamed from: a */
        public void mo33642a(Object[] objArr) {
            C10202j.m34178b(objArr, "args");
            C9268e.super.mo33642a(objArr);
            if (this.f25844f && C10519k.m35650h(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        public Object call(Object[] objArr) {
            C10202j.m34178b(objArr, "args");
            mo33642a(objArr);
            ((Field) getMember()).set(mo33643b() != null ? C10519k.m35647e(objArr) : null, C10519k.m35650h(objArr));
            return C10483v.f28357a;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C9280g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "Void.TYPE"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r0)
                if (r9 == 0) goto L_0x000e
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r9 = 0
            L_0x000f:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r0 = r7.getGenericType()
                java.lang.String r1 = "field.genericType"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
                r4[r9] = r0
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f25844f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9280g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ%\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0004¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "method", "requiresInstance", "", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "isVoidMethod", "callMethod", "", "instance", "args", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.i0.e$h */
    /* compiled from: CallerImpl.kt */
    public static abstract class C9286h extends C9268e<Method> {

        /* renamed from: f */
        private final boolean f25846f;

        /* renamed from: kotlin.h0.u.e.i0.e$h$a */
        /* compiled from: CallerImpl.kt */
        public static final class C9287a extends C9286h implements C9265c {

            /* renamed from: g */
            private final Object f25847g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9287a(Method method, Object obj) {
                super(method, false, (Type[]) null, 4, (DefaultConstructorMarker) null);
                C10202j.m34178b(method, "method");
                this.f25847g = obj;
            }

            public Object call(Object[] objArr) {
                C10202j.m34178b(objArr, "args");
                mo33642a(objArr);
                return mo33644a(this.f25847g, objArr);
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$h$b */
        /* compiled from: CallerImpl.kt */
        public static final class C9288b extends C9286h implements C9265c {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9288b(Method method) {
                super(method, false, (Type[]) null, 4, (DefaultConstructorMarker) null);
                C10202j.m34178b(method, "method");
            }

            public Object call(Object[] objArr) {
                C10202j.m34178b(objArr, "args");
                mo33642a(objArr);
                return mo33644a((Object) null, objArr);
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$h$c */
        /* compiled from: CallerImpl.kt */
        public static final class C9289c extends C9286h implements C9265c {

            /* renamed from: g */
            private final Object f25848g;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C9289c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.C10202j.m34178b(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L_0x001d
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = kotlin.p262y.C10516j.m35593a(r0, r2, r1)
                    if (r0 == 0) goto L_0x0026
                L_0x001d:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r3, r0, r1)
                    r4.f25848g = r6
                    return
                L_0x0026:
                    kotlin.TypeCastException r5 = new kotlin.TypeCastException
                    java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
                    r5.<init>(r6)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9286h.C9289c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            public Object call(Object[] objArr) {
                C10202j.m34178b(objArr, "args");
                mo33642a(objArr);
                C10218z zVar = new C10218z(2);
                zVar.mo35386a(this.f25848g);
                zVar.mo35388b(objArr);
                return mo33644a((Object) null, zVar.mo35387a(new Object[zVar.mo35385a()]));
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$h$d */
        /* compiled from: CallerImpl.kt */
        public static final class C9290d extends C9286h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9290d(Method method) {
                super(method, false, (Type[]) null, 6, (DefaultConstructorMarker) null);
                C10202j.m34178b(method, "method");
            }

            public Object call(Object[] objArr) {
                Object[] objArr2;
                C10202j.m34178b(objArr, "args");
                mo33642a(objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C10516j.m35593a(objArr, 1, objArr.length);
                    if (objArr2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return mo33644a(obj, objArr2);
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$h$e */
        /* compiled from: CallerImpl.kt */
        public static final class C9291e extends C9286h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9291e(Method method) {
                super(method, true, (Type[]) null, 4, (DefaultConstructorMarker) null);
                C10202j.m34178b(method, "method");
            }

            public Object call(Object[] objArr) {
                Object[] objArr2;
                C10202j.m34178b(objArr, "args");
                mo33642a(objArr);
                mo33641a(C10519k.m35648f(objArr));
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C10516j.m35593a(objArr, 1, objArr.length);
                    if (objArr2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return mo33644a((Object) null, objArr2);
            }
        }

        /* renamed from: kotlin.h0.u.e.i0.e$h$f */
        /* compiled from: CallerImpl.kt */
        public static final class C9292f extends C9286h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9292f(Method method) {
                super(method, false, (Type[]) null, 6, (DefaultConstructorMarker) null);
                C10202j.m34178b(method, "method");
            }

            public Object call(Object[] objArr) {
                C10202j.m34178b(objArr, "args");
                mo33642a(objArr);
                return mo33644a((Object) null, objArr);
            }
        }

        public /* synthetic */ C9286h(Method method, boolean z, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z, typeArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo33644a(Object obj, Object[] objArr) {
            C10202j.m34178b(objArr, "args");
            return this.f25846f ? C10483v.f28357a : ((Method) getMember()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* synthetic */ C9286h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto L_0x000e
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            L_0x000e:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x001b
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r4)
            L_0x001b:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9286h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C9286h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r7, (java.lang.Object) r8)
                r6.f25846f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9286h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C9268e(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f25838b = r1
            r0.f25839c = r2
            r0.f25840d = r3
            if (r3 == 0) goto L_0x002a
            kotlin.jvm.internal.z r1 = new kotlin.jvm.internal.z
            r2 = 2
            r1.<init>(r2)
            r1.mo35386a((java.lang.Object) r3)
            r1.mo35388b(r4)
            int r2 = r1.mo35385a()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.mo35387a((java.lang.Object[]) r2)
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            java.util.List r1 = kotlin.p262y.C10529o.m35741b((T[]) r1)
            if (r1 == 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            java.util.List r1 = kotlin.p262y.C10519k.m35653k(r4)
        L_0x002e:
            r0.f25837a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9268e.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    /* renamed from: a */
    public void mo33642a(Object[] objArr) {
        C10202j.m34178b(objArr, "args");
        C9266d.C9267a.m30053a(this, objArr);
    }

    /* renamed from: b */
    public final Class<?> mo33643b() {
        return this.f25840d;
    }

    public final M getMember() {
        return this.f25838b;
    }

    public final Type getReturnType() {
        return this.f25839c;
    }

    /* renamed from: a */
    public List<Type> mo33634a() {
        return this.f25837a;
    }

    public /* synthetic */ C9268e(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33641a(Object obj) {
        if (obj == null || !this.f25838b.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }
}
