package kotlin.p045h0.p046u.p047e.p221i0;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p221i0.C9266d;
import kotlin.p045h0.p046u.p047e.p221i0.C9268e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0016\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J%\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0004¢\u0006\u0002\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000\u0001\u0002\u0018\u0019¨\u0006\u001a"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "unboxMethod", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "member", "getMember", "()Ljava/lang/reflect/Method;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "callMethod", "", "instance", "args", "", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Bound", "Unbound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.i0.i */
/* compiled from: InternalUnderlyingValOfInlineClass.kt */
public abstract class C9297i implements C9266d<Method> {

    /* renamed from: a */
    private final Type f25855a;

    /* renamed from: b */
    private final Method f25856b;

    /* renamed from: c */
    private final List<Type> f25857c;

    /* renamed from: kotlin.h0.u.e.i0.i$a */
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class C9298a extends C9297i implements C9265c {

        /* renamed from: d */
        private final Object f25858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9298a(Method method, Object obj) {
            super(method, C10529o.m35736a(), (DefaultConstructorMarker) null);
            C10202j.m34178b(method, "unboxMethod");
            this.f25858d = obj;
        }

        public Object call(Object[] objArr) {
            C10202j.m34178b(objArr, "args");
            mo33649a(objArr);
            return mo33648a(this.f25858d, objArr);
        }
    }

    /* renamed from: kotlin.h0.u.e.i0.i$b */
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class C9299b extends C9297i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9299b(Method method) {
            super(method, C10527n.m35729a(method.getDeclaringClass()), (DefaultConstructorMarker) null);
            C10202j.m34178b(method, "unboxMethod");
        }

        public Object call(Object[] objArr) {
            Object[] objArr2;
            C10202j.m34178b(objArr, "args");
            mo33649a(objArr);
            Object obj = objArr[0];
            C9268e.C9272d dVar = C9268e.f25836e;
            if (objArr.length <= 1) {
                objArr2 = new Object[0];
            } else {
                objArr2 = C10516j.m35593a(objArr, 1, objArr.length);
                if (objArr2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            return mo33648a(obj, objArr2);
        }
    }

    private C9297i(Method method, List<? extends Type> list) {
        this.f25856b = method;
        this.f25857c = list;
        Class<?> returnType = method.getReturnType();
        C10202j.m34174a((Object) returnType, "unboxMethod.returnType");
        this.f25855a = returnType;
    }

    /* renamed from: a */
    public void mo33649a(Object[] objArr) {
        C10202j.m34178b(objArr, "args");
        C9266d.C9267a.m30053a(this, objArr);
    }

    public final Method getMember() {
        return null;
    }

    public final Type getReturnType() {
        return this.f25855a;
    }

    /* renamed from: a */
    public final List<Type> mo33634a() {
        return this.f25857c;
    }

    public /* synthetic */ C9297i(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo33648a(Object obj, Object[] objArr) {
        C10202j.m34178b(objArr, "args");
        return this.f25856b.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }
}
