package kotlin.p215c0;

import java.lang.annotation.Annotation;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10195d;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9154c;

/* renamed from: kotlin.c0.a */
/* compiled from: JvmClassMapping.kt */
public final class C9100a {
    /* renamed from: a */
    public static final <T> Class<T> m29804a(C9154c<T> cVar) {
        C10202j.m34178b(cVar, "$this$java");
        Class<?> a = ((C10195d) cVar).mo33537a();
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: b */
    public static final <T> Class<T> m29807b(C9154c<T> cVar) {
        C10202j.m34178b(cVar, "$this$javaObjectType");
        Class a = ((C10195d) cVar).mo33537a();
        if (a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            a = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            a = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            a = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            a = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            a = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            a = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            a = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            a = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            a = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (a != null) {
                return a;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (a != null) {
            return a;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    /* renamed from: c */
    public static final <T> Class<T> m29808c(C9154c<T> cVar) {
        C10202j.m34178b(cVar, "$this$javaPrimitiveType");
        Class<?> a = ((C10195d) cVar).mo33537a();
        if (!a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -2056817302:
                        if (name.equals("java.lang.Integer")) {
                            return Integer.TYPE;
                        }
                        break;
                    case -527879800:
                        if (name.equals("java.lang.Float")) {
                            return Float.TYPE;
                        }
                        break;
                    case -515992664:
                        if (name.equals("java.lang.Short")) {
                            return Short.TYPE;
                        }
                        break;
                    case 155276373:
                        if (name.equals("java.lang.Character")) {
                            return Character.TYPE;
                        }
                        break;
                    case 344809556:
                        if (name.equals("java.lang.Boolean")) {
                            return Boolean.TYPE;
                        }
                        break;
                    case 398507100:
                        if (name.equals("java.lang.Byte")) {
                            return Byte.TYPE;
                        }
                        break;
                    case 398795216:
                        if (name.equals("java.lang.Long")) {
                            return Long.TYPE;
                        }
                        break;
                    case 399092968:
                        if (name.equals("java.lang.Void")) {
                            return Void.TYPE;
                        }
                        break;
                    case 761287205:
                        if (name.equals("java.lang.Double")) {
                            return Double.TYPE;
                        }
                        break;
                }
            }
            return null;
        } else if (a != null) {
            return a;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    /* renamed from: a */
    public static final <T> C9154c<T> m29805a(Class<T> cls) {
        C10202j.m34178b(cls, "$this$kotlin");
        return C10216x.m34186a((Class) cls);
    }

    /* renamed from: a */
    public static final <T extends Annotation> C9154c<? extends T> m29806a(T t) {
        C10202j.m34178b(t, "$this$annotationClass");
        Class<? extends Annotation> annotationType = t.annotationType();
        C10202j.m34174a((Object) annotationType, "(this as java.lang.annot…otation).annotationType()");
        C9154c<? extends T> a = m29805a(annotationType);
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
    }
}
