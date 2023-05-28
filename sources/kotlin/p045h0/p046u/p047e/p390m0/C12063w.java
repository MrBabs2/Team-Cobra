package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9536v;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "()V", "reflectType", "Ljava/lang/reflect/Type;", "getReflectType", "()Ljava/lang/reflect/Type;", "equals", "", "other", "", "hashCode", "", "toString", "", "Factory", "descriptors.runtime"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.m0.w */
/* compiled from: ReflectJavaType.kt */
public abstract class C12063w implements C9536v {

    /* renamed from: a */
    public static final C12064a f31817a = new C12064a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.h0.u.e.m0.w$a */
    /* compiled from: ReflectJavaType.kt */
    public static final class C12064a {
        private C12064a() {
        }

        /* renamed from: a */
        public final C12063w mo38696a(Type type) {
            C12063w wVar;
            C10202j.m34178b(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C12062v(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                wVar = new C12040i(type);
            } else if (type instanceof WildcardType) {
                wVar = new C12067z((WildcardType) type);
            } else {
                wVar = new C12051l(type);
            }
            return wVar;
        }

        public /* synthetic */ C12064a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract Type mo38672J();

    public boolean equals(Object obj) {
        return (obj instanceof C12063w) && C10202j.m34176a((Object) mo38672J(), (Object) ((C12063w) obj).mo38672J());
    }

    public int hashCode() {
        return mo38672J().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + mo38672J();
    }
}
