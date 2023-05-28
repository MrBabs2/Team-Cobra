package com.squareup.moshi.p206u;

import com.squareup.moshi.C4748h;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.C8970t;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: com.squareup.moshi.u.c */
/* compiled from: Util */
public final class C8973c {

    /* renamed from: a */
    public static final Set<Annotation> f25465a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f25466b = new Type[0];

    /* renamed from: c */
    private static final Class<? extends Annotation> f25467c;

    /* renamed from: com.squareup.moshi.u.c$a */
    /* compiled from: Util */
    public static final class C8974a implements GenericArrayType {

        /* renamed from: f */
        private final Type f25468f;

        public C8974a(Type type) {
            this.f25468f = C8973c.m29535a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C8970t.m29521a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f25468f;
        }

        public int hashCode() {
            return this.f25468f.hashCode();
        }

        public String toString() {
            return C8973c.m29547d(this.f25468f) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: com.squareup.moshi.u.c$b */
    /* compiled from: Util */
    public static final class C8975b implements ParameterizedType {

        /* renamed from: f */
        private final Type f25469f;

        /* renamed from: g */
        private final Type f25470g;

        /* renamed from: h */
        public final Type[] f25471h;

        public C8975b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C8970t.m29525d(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C8973c.m29535a(type);
            }
            this.f25469f = type3;
            this.f25470g = C8973c.m29535a(type2);
            this.f25471h = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f25471h;
                if (i >= typeArr2.length) {
                    return;
                }
                if (typeArr2[i] != null) {
                    C8973c.m29544b(typeArr2[i]);
                    Type[] typeArr3 = this.f25471h;
                    typeArr3[i] = C8973c.m29535a(typeArr3[i]);
                    i++;
                } else {
                    throw null;
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C8970t.m29521a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f25471h.clone();
        }

        public Type getOwnerType() {
            return this.f25469f;
        }

        public Type getRawType() {
            return this.f25470g;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f25471h) ^ this.f25470g.hashCode()) ^ C8973c.m29528a((Object) this.f25469f);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f25471h.length + 1) * 30);
            sb.append(C8973c.m29547d(this.f25470g));
            if (this.f25471h.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C8973c.m29547d(this.f25471h[0]));
            for (int i = 1; i < this.f25471h.length; i++) {
                sb.append(", ");
                sb.append(C8973c.m29547d(this.f25471h[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.squareup.moshi.u.c$c */
    /* compiled from: Util */
    public static final class C8976c implements WildcardType {

        /* renamed from: f */
        private final Type f25472f;

        /* renamed from: g */
        private final Type f25473g;

        public C8976c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    C8973c.m29544b(typeArr2[0]);
                    if (typeArr[0] == cls) {
                        this.f25473g = C8973c.m29535a(typeArr2[0]);
                        this.f25472f = cls;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw null;
            } else if (typeArr[0] != null) {
                C8973c.m29544b(typeArr[0]);
                this.f25473g = null;
                this.f25472f = C8973c.m29535a(typeArr[0]);
            } else {
                throw null;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C8970t.m29521a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f25473g;
            if (type == null) {
                return C8973c.f25466b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f25472f};
        }

        public int hashCode() {
            Type type = this.f25473g;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f25472f.hashCode() + 31);
        }

        public String toString() {
            if (this.f25473g != null) {
                return "? super " + C8973c.m29547d(this.f25473g);
            } else if (this.f25472f == Object.class) {
                return "?";
            } else {
                return "? extends " + C8973c.m29547d(this.f25472f);
            }
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("kotlin.l");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f25467c = cls;
        try {
            Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
        } catch (ClassNotFoundException unused2) {
        }
    }

    /* renamed from: a */
    public static Set<? extends Annotation> m29540a(AnnotatedElement annotatedElement) {
        return m29541a(annotatedElement.getAnnotations());
    }

    /* renamed from: b */
    public static boolean m29545b(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* renamed from: c */
    public static Type m29546c(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    static String m29547d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    public static Set<? extends Annotation> m29541a(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C4748h.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f25465a;
    }

    /* renamed from: a */
    public static RuntimeException m29533a(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* renamed from: b */
    static void m29544b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* renamed from: b */
    public static JsonDataException m29543b(String str, String str2, C8930i iVar) {
        String str3;
        String path = iVar.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Non-null value '%s' was null at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Non-null value '%s' (JSON name '%s') was null at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }

    /* renamed from: a */
    public static Type m29535a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C8974a(m29535a((Type) cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C8975b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C8975b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type instanceof C8974a) {
                return type;
            }
            return new C8974a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof C8976c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new C8976c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: a */
    public static Type m29537a(Type type, Class<?> cls, Type type2) {
        return m29538a(type, cls, type2, new LinkedHashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m29538a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = m29539a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.TypeVariable<?>) r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m29538a(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = com.squareup.moshi.C8970t.m29522b(r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m29538a(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = com.squareup.moshi.C8970t.m29522b(r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m29538a(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m29538a(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008c
            com.squareup.moshi.u.c$b r8 = new com.squareup.moshi.u.c$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x008c:
            return r10
        L_0x008d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m29538a(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.C8970t.m29527f(r8)
            return r8
        L_0x00ad:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m29538a(r8, r9, r0, r11)     // Catch:{ all -> 0x00c0 }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.C8970t.m29526e(r8)
            return r8
        L_0x00bf:
            return r10
        L_0x00c0:
            r8 = move-exception
            goto L_0x00c3
        L_0x00c2:
            throw r8
        L_0x00c3:
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.p206u.C8973c.m29538a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: a */
    static Type m29539a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a = m29532a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m29536a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m29529a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    public static Type m29536a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m29536a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m29536a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    static int m29528a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    static int m29529a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    static Class<?> m29532a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: a */
    public static String m29534a(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        m29533a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for " + r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for " + r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for " + r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00db, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for " + r9, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0061 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077 A[ExcHandler: InvocationTargetException (r7v5 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c A[ExcHandler: InstantiationException (r7v4 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094 A[ExcHandler: IllegalAccessException (r7v3 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4 A[ExcHandler: ClassNotFoundException (r7v1 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0061=Splitter:B:16:0x0061, B:12:0x0045=Splitter:B:12:0x0045} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.moshi.C8924f<?> m29531a(com.squareup.moshi.C8952r r7, java.lang.reflect.Type r8, java.lang.Class<?> r9) {
        /*
            java.lang.Class<com.squareup.moshi.r> r0 = com.squareup.moshi.C8952r.class
            java.lang.Class<com.squareup.moshi.g> r1 = com.squareup.moshi.C4747g.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            com.squareup.moshi.g r1 = (com.squareup.moshi.C4747g) r1
            r2 = 0
            if (r1 == 0) goto L_0x00dc
            boolean r1 = r1.generateAdapter()
            if (r1 != 0) goto L_0x0015
            goto L_0x00dc
        L_0x0015:
            java.lang.String r1 = r9.getName()
            java.lang.String r1 = com.squareup.moshi.C8970t.m29517a((java.lang.String) r1)
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r4 = 1
            java.lang.Class r1 = java.lang.Class.forName(r1, r4, r3)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            boolean r3 = r8 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r5 = 0
            if (r3 == 0) goto L_0x0054
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Type[] r8 = r8.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3 = 2
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r6[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r6[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3[r4] = r8     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            goto L_0x0069
        L_0x0045:
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r7[r5] = r0     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3[r5] = r8     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            goto L_0x0069
        L_0x0054:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r8[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r8)     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            goto L_0x0069
        L_0x0061:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
        L_0x0069:
            r0.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object r7 = r0.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            com.squareup.moshi.f r7 = (com.squareup.moshi.C8924f) r7     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            com.squareup.moshi.f r7 = r7.nullSafe()     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            return r7
        L_0x0077:
            r7 = move-exception
            m29533a((java.lang.reflect.InvocationTargetException) r7)
            throw r2
        L_0x007c:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to instantiate the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9, r7)
            throw r8
        L_0x0094:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9, r7)
            throw r8
        L_0x00ac:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9, r7)
            throw r8
        L_0x00c4:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter class for "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9, r7)
            throw r8
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.p206u.C8973c.m29531a(com.squareup.moshi.r, java.lang.reflect.Type, java.lang.Class):com.squareup.moshi.f");
    }

    /* renamed from: a */
    public static boolean m29542a(Class<?> cls) {
        Class<? extends Annotation> cls2 = f25467c;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* renamed from: a */
    public static JsonDataException m29530a(String str, String str2, C8930i iVar) {
        String str3;
        String path = iVar.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Required value '%s' missing at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Required value '%s' (JSON name '%s') missing at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }
}
