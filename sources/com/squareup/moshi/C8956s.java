package com.squareup.moshi;

import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.p206u.C8973c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.squareup.moshi.s */
/* compiled from: StandardJsonAdapters */
final class C8956s {

    /* renamed from: a */
    public static final C8924f.C8929e f25442a = new C8959c();

    /* renamed from: b */
    static final C8924f<Boolean> f25443b = new C8960d();

    /* renamed from: c */
    static final C8924f<Byte> f25444c = new C8961e();

    /* renamed from: d */
    static final C8924f<Character> f25445d = new C8962f();

    /* renamed from: e */
    static final C8924f<Double> f25446e = new C8963g();

    /* renamed from: f */
    static final C8924f<Float> f25447f = new C8964h();

    /* renamed from: g */
    static final C8924f<Integer> f25448g = new C8965i();

    /* renamed from: h */
    static final C8924f<Long> f25449h = new C8966j();

    /* renamed from: i */
    static final C8924f<Short> f25450i = new C8967k();

    /* renamed from: j */
    static final C8924f<String> f25451j = new C8957a();

    /* renamed from: com.squareup.moshi.s$a */
    /* compiled from: StandardJsonAdapters */
    class C8957a extends C8924f<String> {
        C8957a() {
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, String str) throws IOException {
            oVar.mo32898e(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }

        public String fromJson(C8930i iVar) throws IOException {
            return iVar.mo32882w();
        }
    }

    /* renamed from: com.squareup.moshi.s$b */
    /* compiled from: StandardJsonAdapters */
    static /* synthetic */ class C8958b {

        /* renamed from: a */
        static final /* synthetic */ int[] f25452a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.moshi.i$b[] r0 = com.squareup.moshi.C8930i.C8932b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25452a = r0
                com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25452a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25452a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25452a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25452a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25452a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8956s.C8958b.<clinit>():void");
        }
    }

    /* renamed from: com.squareup.moshi.s$c */
    /* compiled from: StandardJsonAdapters */
    class C8959c implements C8924f.C8929e {
        C8959c() {
        }

        /* renamed from: a */
        public C8924f<?> mo32832a(Type type, Set<? extends Annotation> set, C8952r rVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C8956s.f25443b;
            }
            if (type == Byte.TYPE) {
                return C8956s.f25444c;
            }
            if (type == Character.TYPE) {
                return C8956s.f25445d;
            }
            if (type == Double.TYPE) {
                return C8956s.f25446e;
            }
            if (type == Float.TYPE) {
                return C8956s.f25447f;
            }
            if (type == Integer.TYPE) {
                return C8956s.f25448g;
            }
            if (type == Long.TYPE) {
                return C8956s.f25449h;
            }
            if (type == Short.TYPE) {
                return C8956s.f25450i;
            }
            if (type == Boolean.class) {
                return C8956s.f25443b.nullSafe();
            }
            if (type == Byte.class) {
                return C8956s.f25444c.nullSafe();
            }
            if (type == Character.class) {
                return C8956s.f25445d.nullSafe();
            }
            if (type == Double.class) {
                return C8956s.f25446e.nullSafe();
            }
            if (type == Float.class) {
                return C8956s.f25447f.nullSafe();
            }
            if (type == Integer.class) {
                return C8956s.f25448g.nullSafe();
            }
            if (type == Long.class) {
                return C8956s.f25449h.nullSafe();
            }
            if (type == Short.class) {
                return C8956s.f25450i.nullSafe();
            }
            if (type == String.class) {
                return C8956s.f25451j.nullSafe();
            }
            if (type == Object.class) {
                return new C8969m(rVar).nullSafe();
            }
            Class<?> d = C8970t.m29525d(type);
            C8924f<?> a = C8973c.m29531a(rVar, type, d);
            if (a != null) {
                return a;
            }
            if (d.isEnum()) {
                return new C8968l(d).nullSafe();
            }
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.s$d */
    /* compiled from: StandardJsonAdapters */
    class C8960d extends C8924f<Boolean> {
        C8960d() {
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, Boolean bool) throws IOException {
            oVar.mo32894c(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }

        public Boolean fromJson(C8930i iVar) throws IOException {
            return Boolean.valueOf(iVar.mo32876p());
        }
    }

    /* renamed from: com.squareup.moshi.s$e */
    /* compiled from: StandardJsonAdapters */
    class C8961e extends C8924f<Byte> {
        C8961e() {
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, Byte b) throws IOException {
            oVar.mo32896d((long) (b.intValue() & 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }

        public Byte fromJson(C8930i iVar) throws IOException {
            return Byte.valueOf((byte) C8956s.m29504a(iVar, "a byte", -128, 255));
        }
    }

    /* renamed from: com.squareup.moshi.s$f */
    /* compiled from: StandardJsonAdapters */
    class C8962f extends C8924f<Character> {
        C8962f() {
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, Character ch) throws IOException {
            oVar.mo32898e(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }

        public Character fromJson(C8930i iVar) throws IOException {
            String w = iVar.mo32882w();
            if (w.length() <= 1) {
                return Character.valueOf(w.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{"a char", '\"' + w + '\"', iVar.getPath()}));
        }
    }

    /* renamed from: com.squareup.moshi.s$g */
    /* compiled from: StandardJsonAdapters */
    class C8963g extends C8924f<Double> {
        C8963g() {
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, Double d) throws IOException {
            oVar.mo32890a(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }

        public Double fromJson(C8930i iVar) throws IOException {
            return Double.valueOf(iVar.mo32878q());
        }
    }

    /* renamed from: com.squareup.moshi.s$h */
    /* compiled from: StandardJsonAdapters */
    class C8964h extends C8924f<Float> {
        C8964h() {
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, Float f) throws IOException {
            if (f != null) {
                oVar.mo32891a((Number) f);
                return;
            }
            throw null;
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }

        public Float fromJson(C8930i iVar) throws IOException {
            float q = (float) iVar.mo32878q();
            if (iVar.mo32875o() || !Float.isInfinite(q)) {
                return Float.valueOf(q);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + q + " at path " + iVar.getPath());
        }
    }

    /* renamed from: com.squareup.moshi.s$i */
    /* compiled from: StandardJsonAdapters */
    class C8965i extends C8924f<Integer> {
        C8965i() {
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, Integer num) throws IOException {
            oVar.mo32896d((long) num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }

        public Integer fromJson(C8930i iVar) throws IOException {
            return Integer.valueOf(iVar.mo32879t());
        }
    }

    /* renamed from: com.squareup.moshi.s$j */
    /* compiled from: StandardJsonAdapters */
    class C8966j extends C8924f<Long> {
        C8966j() {
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, Long l) throws IOException {
            oVar.mo32896d(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }

        public Long fromJson(C8930i iVar) throws IOException {
            return Long.valueOf(iVar.mo32880u());
        }
    }

    /* renamed from: com.squareup.moshi.s$k */
    /* compiled from: StandardJsonAdapters */
    class C8967k extends C8924f<Short> {
        C8967k() {
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, Short sh) throws IOException {
            oVar.mo32896d((long) sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }

        public Short fromJson(C8930i iVar) throws IOException {
            return Short.valueOf((short) C8956s.m29504a(iVar, "a short", -32768, 32767));
        }
    }

    /* renamed from: com.squareup.moshi.s$l */
    /* compiled from: StandardJsonAdapters */
    static final class C8968l<T extends Enum<T>> extends C8924f<T> {

        /* renamed from: a */
        private final Class<T> f25453a;

        /* renamed from: b */
        private final String[] f25454b;

        /* renamed from: c */
        private final T[] f25455c;

        /* renamed from: d */
        private final C8930i.C8931a f25456d;

        C8968l(Class<T> cls) {
            this.f25453a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.f25455c = tArr;
                this.f25454b = new String[tArr.length];
                for (int i = 0; i < this.f25455c.length; i++) {
                    T t = this.f25455c[i];
                    C4746e eVar = (C4746e) cls.getField(t.name()).getAnnotation(C4746e.class);
                    this.f25454b[i] = eVar != null ? eVar.name() : t.name();
                }
                this.f25456d = C8930i.C8931a.m29357a(this.f25454b);
            } catch (NoSuchFieldException e) {
                AssertionError assertionError = new AssertionError("Missing field in " + cls.getName());
                assertionError.initCause(e);
                throw assertionError;
            }
        }

        /* renamed from: a */
        public void toJson(C8939o oVar, T t) throws IOException {
            oVar.mo32898e(this.f25454b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f25453a.getName() + ")";
        }

        public T fromJson(C8930i iVar) throws IOException {
            int b = iVar.mo32867b(this.f25456d);
            if (b != -1) {
                return this.f25455c[b];
            }
            String path = iVar.getPath();
            String w = iVar.mo32882w();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f25454b) + " but was " + w + " at path " + path);
        }
    }

    /* renamed from: com.squareup.moshi.s$m */
    /* compiled from: StandardJsonAdapters */
    static final class C8969m extends C8924f<Object> {

        /* renamed from: a */
        private final C8952r f25457a;

        /* renamed from: b */
        private final C8924f<List> f25458b;

        /* renamed from: c */
        private final C8924f<Map> f25459c;

        /* renamed from: d */
        private final C8924f<String> f25460d;

        /* renamed from: e */
        private final C8924f<Double> f25461e;

        /* renamed from: f */
        private final C8924f<Boolean> f25462f;

        C8969m(C8952r rVar) {
            this.f25457a = rVar;
            this.f25458b = rVar.mo32968a(List.class);
            this.f25459c = rVar.mo32968a(Map.class);
            this.f25460d = rVar.mo32968a(String.class);
            this.f25461e = rVar.mo32968a(Double.class);
            this.f25462f = rVar.mo32968a(Boolean.class);
        }

        /* renamed from: a */
        private Class<?> m29516a(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        public Object fromJson(C8930i iVar) throws IOException {
            switch (C8958b.f25452a[iVar.peek().ordinal()]) {
                case 1:
                    return this.f25458b.fromJson(iVar);
                case 2:
                    return this.f25459c.fromJson(iVar);
                case 3:
                    return this.f25460d.fromJson(iVar);
                case 4:
                    return this.f25461e.fromJson(iVar);
                case 5:
                    return this.f25462f.fromJson(iVar);
                case 6:
                    return iVar.mo32881v();
                default:
                    throw new IllegalStateException("Expected a value but was " + iVar.peek() + " at path " + iVar.getPath());
            }
        }

        public void toJson(C8939o oVar, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                oVar.mo32893b();
                oVar.mo32901l();
                return;
            }
            this.f25457a.mo32970a(m29516a(cls), C8973c.f25465a).toJson(oVar, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    static int m29504a(C8930i iVar, String str, int i, int i2) throws IOException {
        int t = iVar.mo32879t();
        if (t >= i && t <= i2) {
            return t;
        }
        throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(t), iVar.getPath()}));
    }
}
