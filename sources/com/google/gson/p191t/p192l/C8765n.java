package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8676g;
import com.google.gson.C8679j;
import com.google.gson.C8680k;
import com.google.gson.C8681l;
import com.google.gson.C8682m;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p033s.C4743c;
import com.google.gson.p191t.C8718f;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.gson.t.l.n */
/* compiled from: TypeAdapters */
public final class C8765n {

    /* renamed from: A */
    public static final C8688q<String> f24912A = new C8779g();

    /* renamed from: B */
    public static final C8688q<BigDecimal> f24913B = new C8781h();

    /* renamed from: C */
    public static final C8688q<BigInteger> f24914C = new C8783i();

    /* renamed from: D */
    public static final C8690r f24915D = m28602a(String.class, f24912A);

    /* renamed from: E */
    public static final C8688q<StringBuilder> f24916E;

    /* renamed from: F */
    public static final C8690r f24917F;

    /* renamed from: G */
    public static final C8688q<StringBuffer> f24918G;

    /* renamed from: H */
    public static final C8690r f24919H;

    /* renamed from: I */
    public static final C8688q<URL> f24920I;

    /* renamed from: J */
    public static final C8690r f24921J;

    /* renamed from: K */
    public static final C8688q<URI> f24922K;

    /* renamed from: L */
    public static final C8690r f24923L;

    /* renamed from: M */
    public static final C8688q<InetAddress> f24924M;

    /* renamed from: N */
    public static final C8690r f24925N;

    /* renamed from: O */
    public static final C8688q<UUID> f24926O;

    /* renamed from: P */
    public static final C8690r f24927P;

    /* renamed from: Q */
    public static final C8688q<Currency> f24928Q;

    /* renamed from: R */
    public static final C8690r f24929R;

    /* renamed from: S */
    public static final C8690r f24930S = new C8794r();

    /* renamed from: T */
    public static final C8688q<Calendar> f24931T;

    /* renamed from: U */
    public static final C8690r f24932U;

    /* renamed from: V */
    public static final C8688q<Locale> f24933V;

    /* renamed from: W */
    public static final C8690r f24934W;

    /* renamed from: X */
    public static final C8688q<C8679j> f24935X;

    /* renamed from: Y */
    public static final C8690r f24936Y;

    /* renamed from: Z */
    public static final C8690r f24937Z = new C8800w();

    /* renamed from: a */
    public static final C8688q<Class> f24938a;

    /* renamed from: b */
    public static final C8690r f24939b;

    /* renamed from: c */
    public static final C8688q<BitSet> f24940c;

    /* renamed from: d */
    public static final C8690r f24941d;

    /* renamed from: e */
    public static final C8688q<Boolean> f24942e = new C8772c0();

    /* renamed from: f */
    public static final C8688q<Boolean> f24943f = new C8774d0();

    /* renamed from: g */
    public static final C8690r f24944g = m28603a(Boolean.TYPE, Boolean.class, f24942e);

    /* renamed from: h */
    public static final C8688q<Number> f24945h = new C8776e0();

    /* renamed from: i */
    public static final C8690r f24946i = m28603a(Byte.TYPE, Byte.class, f24945h);

    /* renamed from: j */
    public static final C8688q<Number> f24947j = new C8778f0();

    /* renamed from: k */
    public static final C8690r f24948k = m28603a(Short.TYPE, Short.class, f24947j);

    /* renamed from: l */
    public static final C8688q<Number> f24949l = new C8780g0();

    /* renamed from: m */
    public static final C8690r f24950m = m28603a(Integer.TYPE, Integer.class, f24949l);

    /* renamed from: n */
    public static final C8688q<AtomicInteger> f24951n;

    /* renamed from: o */
    public static final C8690r f24952o;

    /* renamed from: p */
    public static final C8688q<AtomicBoolean> f24953p;

    /* renamed from: q */
    public static final C8690r f24954q;

    /* renamed from: r */
    public static final C8688q<AtomicIntegerArray> f24955r;

    /* renamed from: s */
    public static final C8690r f24956s;

    /* renamed from: t */
    public static final C8688q<Number> f24957t = new C8769b();

    /* renamed from: u */
    public static final C8688q<Number> f24958u = new C8771c();

    /* renamed from: v */
    public static final C8688q<Number> f24959v = new C8773d();

    /* renamed from: w */
    public static final C8688q<Number> f24960w;

    /* renamed from: x */
    public static final C8690r f24961x;

    /* renamed from: y */
    public static final C8688q<Character> f24962y = new C8777f();

    /* renamed from: z */
    public static final C8690r f24963z = m28603a(Character.TYPE, Character.class, f24962y);

    /* renamed from: com.google.gson.t.l.n$a0 */
    /* compiled from: TypeAdapters */
    static class C8767a0 implements C8690r {

        /* renamed from: f */
        final /* synthetic */ Class f24964f;

        /* renamed from: g */
        final /* synthetic */ C8688q f24965g;

        /* renamed from: com.google.gson.t.l.n$a0$a */
        /* compiled from: TypeAdapters */
        class C8768a extends C8688q<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f24966a;

            C8768a(Class cls) {
                this.f24966a = cls;
            }

            /* renamed from: a */
            public void mo32316a(C8694c cVar, T1 t1) throws IOException {
                C8767a0.this.f24965g.mo32316a(cVar, t1);
            }

            /* renamed from: a */
            public T1 mo32314a(C8691a aVar) throws IOException {
                T1 a = C8767a0.this.f24965g.mo32314a(aVar);
                if (a == null || this.f24966a.isInstance(a)) {
                    return a;
                }
                throw new JsonSyntaxException("Expected a " + this.f24966a.getName() + " but was " + a.getClass().getName());
            }
        }

        C8767a0(Class cls, C8688q qVar) {
            this.f24964f = cls;
            this.f24965g = qVar;
        }

        /* renamed from: a */
        public <T2> C8688q<T2> mo32358a(C8668e eVar, C8805a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (!this.f24964f.isAssignableFrom(rawType)) {
                return null;
            }
            return new C8768a(rawType);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f24964f.getName() + ",adapter=" + this.f24965g + "]";
        }
    }

    /* renamed from: com.google.gson.t.l.n$b0 */
    /* compiled from: TypeAdapters */
    static /* synthetic */ class C8770b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f24968a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.b[] r0 = com.google.gson.stream.C8693b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24968a = r0
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f24968a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p191t.p192l.C8765n.C8770b0.<clinit>():void");
        }
    }

    /* renamed from: com.google.gson.t.l.n$k */
    /* compiled from: TypeAdapters */
    static class C8787k extends C8688q<Class> {
        C8787k() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo32316a(C8694c cVar, Object obj) throws IOException {
            mo32511a(cVar, (Class) obj);
            throw null;
        }

        /* renamed from: a */
        public void mo32511a(C8694c cVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }

        /* renamed from: a */
        public Class mo32314a(C8691a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.t.l.n$r */
    /* compiled from: TypeAdapters */
    static class C8794r implements C8690r {
        C8794r() {
        }

        /* renamed from: a */
        public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            return new C8795a(this, eVar.mo32300a(Date.class));
        }

        /* renamed from: com.google.gson.t.l.n$r$a */
        /* compiled from: TypeAdapters */
        class C8795a extends C8688q<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ C8688q f24971a;

            C8795a(C8794r rVar, C8688q qVar) {
                this.f24971a = qVar;
            }

            /* renamed from: a */
            public Timestamp m28711a(C8691a aVar) throws IOException {
                Date date = (Date) this.f24971a.mo32314a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: a */
            public void mo32316a(C8694c cVar, Timestamp timestamp) throws IOException {
                this.f24971a.mo32316a(cVar, timestamp);
            }
        }
    }

    /* renamed from: com.google.gson.t.l.n$w */
    /* compiled from: TypeAdapters */
    static class C8800w implements C8690r {
        C8800w() {
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [com.google.gson.u.a, com.google.gson.u.a<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> com.google.gson.C8688q<T> mo32358a(com.google.gson.C8668e r1, com.google.gson.p194u.C8805a<T> r2) {
            /*
                r0 = this;
                java.lang.Class r1 = r2.getRawType()
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L_0x0021
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                if (r1 != r2) goto L_0x0011
                goto L_0x0021
            L_0x0011:
                boolean r2 = r1.isEnum()
                if (r2 != 0) goto L_0x001b
                java.lang.Class r1 = r1.getSuperclass()
            L_0x001b:
                com.google.gson.t.l.n$j0 r2 = new com.google.gson.t.l.n$j0
                r2.<init>(r1)
                return r2
            L_0x0021:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p191t.p192l.C8765n.C8800w.mo32358a(com.google.gson.e, com.google.gson.u.a):com.google.gson.q");
        }
    }

    /* renamed from: com.google.gson.t.l.n$x */
    /* compiled from: TypeAdapters */
    static class C8801x implements C8690r {

        /* renamed from: f */
        final /* synthetic */ Class f24972f;

        /* renamed from: g */
        final /* synthetic */ C8688q f24973g;

        C8801x(Class cls, C8688q qVar) {
            this.f24972f = cls;
            this.f24973g = qVar;
        }

        /* renamed from: a */
        public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
            if (aVar.getRawType() == this.f24972f) {
                return this.f24973g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f24972f.getName() + ",adapter=" + this.f24973g + "]";
        }
    }

    /* renamed from: com.google.gson.t.l.n$y */
    /* compiled from: TypeAdapters */
    static class C8802y implements C8690r {

        /* renamed from: f */
        final /* synthetic */ Class f24974f;

        /* renamed from: g */
        final /* synthetic */ Class f24975g;

        /* renamed from: h */
        final /* synthetic */ C8688q f24976h;

        C8802y(Class cls, Class cls2, C8688q qVar) {
            this.f24974f = cls;
            this.f24975g = cls2;
            this.f24976h = qVar;
        }

        /* renamed from: a */
        public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f24974f || rawType == this.f24975g) {
                return this.f24976h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f24975g.getName() + "+" + this.f24974f.getName() + ",adapter=" + this.f24976h + "]";
        }
    }

    /* renamed from: com.google.gson.t.l.n$z */
    /* compiled from: TypeAdapters */
    static class C8803z implements C8690r {

        /* renamed from: f */
        final /* synthetic */ Class f24977f;

        /* renamed from: g */
        final /* synthetic */ Class f24978g;

        /* renamed from: h */
        final /* synthetic */ C8688q f24979h;

        C8803z(Class cls, Class cls2, C8688q qVar) {
            this.f24977f = cls;
            this.f24978g = cls2;
            this.f24979h = qVar;
        }

        /* renamed from: a */
        public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f24977f || rawType == this.f24978g) {
                return this.f24979h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f24977f.getName() + "+" + this.f24978g.getName() + ",adapter=" + this.f24979h + "]";
        }
    }

    static {
        C8688q<Class> a = new C8787k().mo32357a();
        f24938a = a;
        f24939b = m28602a(Class.class, a);
        C8688q<BitSet> a2 = new C8799v().mo32357a();
        f24940c = a2;
        f24941d = m28602a(BitSet.class, a2);
        C8688q<AtomicInteger> a3 = new C8782h0().mo32357a();
        f24951n = a3;
        f24952o = m28602a(AtomicInteger.class, a3);
        C8688q<AtomicBoolean> a4 = new C8784i0().mo32357a();
        f24953p = a4;
        f24954q = m28602a(AtomicBoolean.class, a4);
        C8688q<AtomicIntegerArray> a5 = new C8766a().mo32357a();
        f24955r = a5;
        f24956s = m28602a(AtomicIntegerArray.class, a5);
        C8775e eVar = new C8775e();
        f24960w = eVar;
        f24961x = m28602a(Number.class, eVar);
        C8785j jVar = new C8785j();
        f24916E = jVar;
        f24917F = m28602a(StringBuilder.class, jVar);
        C8788l lVar = new C8788l();
        f24918G = lVar;
        f24919H = m28602a(StringBuffer.class, lVar);
        C8789m mVar = new C8789m();
        f24920I = mVar;
        f24921J = m28602a(URL.class, mVar);
        C8790n nVar = new C8790n();
        f24922K = nVar;
        f24923L = m28602a(URI.class, nVar);
        C8791o oVar = new C8791o();
        f24924M = oVar;
        f24925N = m28604b(InetAddress.class, oVar);
        C8792p pVar = new C8792p();
        f24926O = pVar;
        f24927P = m28602a(UUID.class, pVar);
        C8688q<Currency> a6 = new C8793q().mo32357a();
        f24928Q = a6;
        f24929R = m28602a(Currency.class, a6);
        C8796s sVar = new C8796s();
        f24931T = sVar;
        f24932U = m28605b(Calendar.class, GregorianCalendar.class, sVar);
        C8797t tVar = new C8797t();
        f24933V = tVar;
        f24934W = m28602a(Locale.class, tVar);
        C8798u uVar = new C8798u();
        f24935X = uVar;
        f24936Y = m28604b(C8679j.class, uVar);
    }

    /* renamed from: a */
    public static <TT> C8690r m28602a(Class<TT> cls, C8688q<TT> qVar) {
        return new C8801x(cls, qVar);
    }

    /* renamed from: b */
    public static <TT> C8690r m28605b(Class<TT> cls, Class<? extends TT> cls2, C8688q<? super TT> qVar) {
        return new C8803z(cls, cls2, qVar);
    }

    /* renamed from: com.google.gson.t.l.n$a */
    /* compiled from: TypeAdapters */
    static class C8766a extends C8688q<AtomicIntegerArray> {
        C8766a() {
        }

        /* renamed from: a */
        public AtomicIntegerArray m28607a(C8691a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo32359a();
            while (aVar.mo32367m()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.mo32374u()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
            aVar.mo32365i();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.mo32381a();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.mo32391d((long) atomicIntegerArray.get(i));
            }
            cVar.mo32390d();
        }
    }

    /* renamed from: com.google.gson.t.l.n$b */
    /* compiled from: TypeAdapters */
    static class C8769b extends C8688q<Number> {
        C8769b() {
        }

        /* renamed from: a */
        public Number m28614a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo32375v());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            cVar.mo32383a(number);
        }
    }

    /* renamed from: com.google.gson.t.l.n$c */
    /* compiled from: TypeAdapters */
    static class C8771c extends C8688q<Number> {
        C8771c() {
        }

        /* renamed from: a */
        public Number m28618a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return Float.valueOf((float) aVar.mo32372t());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            cVar.mo32383a(number);
        }
    }

    /* renamed from: com.google.gson.t.l.n$c0 */
    /* compiled from: TypeAdapters */
    static class C8772c0 extends C8688q<Boolean> {
        C8772c0() {
        }

        /* renamed from: a */
        public Boolean m28622a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            } else if (aVar.peek() == C8693b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.mo32378y()));
            } else {
                return Boolean.valueOf(aVar.mo32371q());
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Boolean bool) throws IOException {
            cVar.mo32382a(bool);
        }
    }

    /* renamed from: com.google.gson.t.l.n$d */
    /* compiled from: TypeAdapters */
    static class C8773d extends C8688q<Number> {
        C8773d() {
        }

        /* renamed from: a */
        public Number m28626a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return Double.valueOf(aVar.mo32372t());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            cVar.mo32383a(number);
        }
    }

    /* renamed from: com.google.gson.t.l.n$d0 */
    /* compiled from: TypeAdapters */
    static class C8774d0 extends C8688q<Boolean> {
        C8774d0() {
        }

        /* renamed from: a */
        public Boolean m28630a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return Boolean.valueOf(aVar.mo32378y());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Boolean bool) throws IOException {
            cVar.mo32394e(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: com.google.gson.t.l.n$e */
    /* compiled from: TypeAdapters */
    static class C8775e extends C8688q<Number> {
        C8775e() {
        }

        /* renamed from: a */
        public Number m28634a(C8691a aVar) throws IOException {
            C8693b peek = aVar.peek();
            int i = C8770b0.f24968a[peek.ordinal()];
            if (i == 1 || i == 3) {
                return new C8718f(aVar.mo32378y());
            }
            if (i == 4) {
                aVar.mo32377x();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + peek);
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            cVar.mo32383a(number);
        }
    }

    /* renamed from: com.google.gson.t.l.n$e0 */
    /* compiled from: TypeAdapters */
    static class C8776e0 extends C8688q<Number> {
        C8776e0() {
        }

        /* renamed from: a */
        public Number m28638a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo32374u());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            cVar.mo32383a(number);
        }
    }

    /* renamed from: com.google.gson.t.l.n$f */
    /* compiled from: TypeAdapters */
    static class C8777f extends C8688q<Character> {
        C8777f() {
        }

        /* renamed from: a */
        public Character m28642a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            String y = aVar.mo32378y();
            if (y.length() == 1) {
                return Character.valueOf(y.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + y);
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Character ch) throws IOException {
            cVar.mo32394e(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.google.gson.t.l.n$f0 */
    /* compiled from: TypeAdapters */
    static class C8778f0 extends C8688q<Number> {
        C8778f0() {
        }

        /* renamed from: a */
        public Number m28646a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo32374u());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            cVar.mo32383a(number);
        }
    }

    /* renamed from: com.google.gson.t.l.n$g */
    /* compiled from: TypeAdapters */
    static class C8779g extends C8688q<String> {
        C8779g() {
        }

        /* renamed from: a */
        public String m28650a(C8691a aVar) throws IOException {
            C8693b peek = aVar.peek();
            if (peek == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            } else if (peek == C8693b.BOOLEAN) {
                return Boolean.toString(aVar.mo32371q());
            } else {
                return aVar.mo32378y();
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, String str) throws IOException {
            cVar.mo32394e(str);
        }
    }

    /* renamed from: com.google.gson.t.l.n$g0 */
    /* compiled from: TypeAdapters */
    static class C8780g0 extends C8688q<Number> {
        C8780g0() {
        }

        /* renamed from: a */
        public Number m28654a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo32374u());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            cVar.mo32383a(number);
        }
    }

    /* renamed from: com.google.gson.t.l.n$h */
    /* compiled from: TypeAdapters */
    static class C8781h extends C8688q<BigDecimal> {
        C8781h() {
        }

        /* renamed from: a */
        public BigDecimal m28658a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo32378y());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.mo32383a((Number) bigDecimal);
        }
    }

    /* renamed from: com.google.gson.t.l.n$h0 */
    /* compiled from: TypeAdapters */
    static class C8782h0 extends C8688q<AtomicInteger> {
        C8782h0() {
        }

        /* renamed from: a */
        public AtomicInteger m28662a(C8691a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.mo32374u());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.mo32391d((long) atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.t.l.n$i */
    /* compiled from: TypeAdapters */
    static class C8783i extends C8688q<BigInteger> {
        C8783i() {
        }

        /* renamed from: a */
        public BigInteger m28666a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            try {
                return new BigInteger(aVar.mo32378y());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, BigInteger bigInteger) throws IOException {
            cVar.mo32383a((Number) bigInteger);
        }
    }

    /* renamed from: com.google.gson.t.l.n$i0 */
    /* compiled from: TypeAdapters */
    static class C8784i0 extends C8688q<AtomicBoolean> {
        C8784i0() {
        }

        /* renamed from: a */
        public AtomicBoolean m28670a(C8691a aVar) throws IOException {
            return new AtomicBoolean(aVar.mo32371q());
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.mo32392d(atomicBoolean.get());
        }
    }

    /* renamed from: com.google.gson.t.l.n$j */
    /* compiled from: TypeAdapters */
    static class C8785j extends C8688q<StringBuilder> {
        C8785j() {
        }

        /* renamed from: a */
        public StringBuilder m28674a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return new StringBuilder(aVar.mo32378y());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, StringBuilder sb) throws IOException {
            cVar.mo32394e(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: com.google.gson.t.l.n$j0 */
    /* compiled from: TypeAdapters */
    private static final class C8786j0<T extends Enum<T>> extends C8688q<T> {

        /* renamed from: a */
        private final Map<String, T> f24969a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f24970b = new HashMap();

        public C8786j0(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C4743c cVar = (C4743c) cls.getField(name).getAnnotation(C4743c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f24969a.put(put, enumR);
                        }
                    }
                    this.f24969a.put(name, enumR);
                    this.f24970b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public T m28678a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return (Enum) this.f24969a.get(aVar.mo32378y());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, T t) throws IOException {
            cVar.mo32394e(t == null ? null : this.f24970b.get(t));
        }
    }

    /* renamed from: com.google.gson.t.l.n$l */
    /* compiled from: TypeAdapters */
    static class C8788l extends C8688q<StringBuffer> {
        C8788l() {
        }

        /* renamed from: a */
        public StringBuffer m28686a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return new StringBuffer(aVar.mo32378y());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.mo32394e(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.google.gson.t.l.n$m */
    /* compiled from: TypeAdapters */
    static class C8789m extends C8688q<URL> {
        C8789m() {
        }

        /* renamed from: a */
        public URL m28690a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            String y = aVar.mo32378y();
            if ("null".equals(y)) {
                return null;
            }
            return new URL(y);
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, URL url) throws IOException {
            cVar.mo32394e(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.t.l.n$n */
    /* compiled from: TypeAdapters */
    static class C8790n extends C8688q<URI> {
        C8790n() {
        }

        /* renamed from: a */
        public URI m28694a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            try {
                String y = aVar.mo32378y();
                if ("null".equals(y)) {
                    return null;
                }
                return new URI(y);
            } catch (URISyntaxException e) {
                throw new JsonIOException((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, URI uri) throws IOException {
            cVar.mo32394e(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.google.gson.t.l.n$o */
    /* compiled from: TypeAdapters */
    static class C8791o extends C8688q<InetAddress> {
        C8791o() {
        }

        /* renamed from: a */
        public InetAddress m28698a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return InetAddress.getByName(aVar.mo32378y());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, InetAddress inetAddress) throws IOException {
            cVar.mo32394e(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.google.gson.t.l.n$p */
    /* compiled from: TypeAdapters */
    static class C8792p extends C8688q<UUID> {
        C8792p() {
        }

        /* renamed from: a */
        public UUID m28702a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return UUID.fromString(aVar.mo32378y());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, UUID uuid) throws IOException {
            cVar.mo32394e(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.google.gson.t.l.n$q */
    /* compiled from: TypeAdapters */
    static class C8793q extends C8688q<Currency> {
        C8793q() {
        }

        /* renamed from: a */
        public Currency m28706a(C8691a aVar) throws IOException {
            return Currency.getInstance(aVar.mo32378y());
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Currency currency) throws IOException {
            cVar.mo32394e(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.t.l.n$s */
    /* compiled from: TypeAdapters */
    static class C8796s extends C8688q<Calendar> {
        C8796s() {
        }

        /* renamed from: a */
        public Calendar m28715a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            aVar.mo32361b();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.peek() != C8693b.END_OBJECT) {
                String w = aVar.mo32376w();
                int u = aVar.mo32374u();
                if ("year".equals(w)) {
                    i = u;
                } else if ("month".equals(w)) {
                    i2 = u;
                } else if ("dayOfMonth".equals(w)) {
                    i3 = u;
                } else if ("hourOfDay".equals(w)) {
                    i4 = u;
                } else if ("minute".equals(w)) {
                    i5 = u;
                } else if ("second".equals(w)) {
                    i6 = u;
                }
            }
            aVar.mo32366l();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.mo32400p();
                return;
            }
            cVar.mo32386b();
            cVar.mo32384a("year");
            cVar.mo32391d((long) calendar.get(1));
            cVar.mo32384a("month");
            cVar.mo32391d((long) calendar.get(2));
            cVar.mo32384a("dayOfMonth");
            cVar.mo32391d((long) calendar.get(5));
            cVar.mo32384a("hourOfDay");
            cVar.mo32391d((long) calendar.get(11));
            cVar.mo32384a("minute");
            cVar.mo32391d((long) calendar.get(12));
            cVar.mo32384a("second");
            cVar.mo32391d((long) calendar.get(13));
            cVar.mo32396i();
        }
    }

    /* renamed from: com.google.gson.t.l.n$t */
    /* compiled from: TypeAdapters */
    static class C8797t extends C8688q<Locale> {
        C8797t() {
        }

        /* renamed from: a */
        public Locale m28719a(C8691a aVar) throws IOException {
            String str = null;
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo32378y(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Locale locale) throws IOException {
            cVar.mo32394e(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.google.gson.t.l.n$u */
    /* compiled from: TypeAdapters */
    static class C8798u extends C8688q<C8679j> {
        C8798u() {
        }

        /* renamed from: a */
        public C8679j m28723a(C8691a aVar) throws IOException {
            switch (C8770b0.f24968a[aVar.peek().ordinal()]) {
                case 1:
                    return new C8682m((Number) new C8718f(aVar.mo32378y()));
                case 2:
                    return new C8682m(Boolean.valueOf(aVar.mo32371q()));
                case 3:
                    return new C8682m(aVar.mo32378y());
                case 4:
                    aVar.mo32377x();
                    return C8680k.f24745a;
                case 5:
                    C8676g gVar = new C8676g();
                    aVar.mo32359a();
                    while (aVar.mo32367m()) {
                        gVar.mo32323a(m28723a(aVar));
                    }
                    aVar.mo32365i();
                    return gVar;
                case 6:
                    C8681l lVar = new C8681l();
                    aVar.mo32361b();
                    while (aVar.mo32367m()) {
                        lVar.mo32338a(aVar.mo32376w(), m28723a(aVar));
                    }
                    aVar.mo32366l();
                    return lVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, C8679j jVar) throws IOException {
            if (jVar == null || jVar.mo32332f()) {
                cVar.mo32400p();
            } else if (jVar.mo32334h()) {
                C8682m c = jVar.mo32330c();
                if (c.mo32353x()) {
                    cVar.mo32383a(c.mo32350t());
                } else if (c.mo32352v()) {
                    cVar.mo32392d(c.mo32345j());
                } else {
                    cVar.mo32394e(c.mo32351u());
                }
            } else if (jVar.mo32331d()) {
                cVar.mo32381a();
                Iterator<C8679j> it = jVar.mo32328a().iterator();
                while (it.hasNext()) {
                    mo32316a(cVar, it.next());
                }
                cVar.mo32390d();
            } else if (jVar.mo32333g()) {
                cVar.mo32386b();
                for (Map.Entry next : jVar.mo32329b().mo32341j()) {
                    cVar.mo32384a((String) next.getKey());
                    mo32316a(cVar, (C8679j) next.getValue());
                }
                cVar.mo32396i();
            } else {
                throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
            }
        }
    }

    /* renamed from: com.google.gson.t.l.n$v */
    /* compiled from: TypeAdapters */
    static class C8799v extends C8688q<BitSet> {
        C8799v() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.mo32374u() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet m28727a(com.google.gson.stream.C8691a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo32359a()
                com.google.gson.stream.b r1 = r8.peek()
                r2 = 0
                r3 = 0
            L_0x000e:
                com.google.gson.stream.b r4 = com.google.gson.stream.C8693b.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = com.google.gson.p191t.p192l.C8765n.C8770b0.f24968a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.mo32378y()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0047:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.mo32371q()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.mo32374u()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                com.google.gson.stream.b r1 = r8.peek()
                goto L_0x000e
            L_0x0075:
                r8.mo32365i()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p191t.p192l.C8765n.C8799v.m28727a(com.google.gson.stream.a):java.util.BitSet");
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, BitSet bitSet) throws IOException {
            cVar.mo32381a();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                cVar.mo32391d(bitSet.get(i) ? 1 : 0);
            }
            cVar.mo32390d();
        }
    }

    /* renamed from: a */
    public static <TT> C8690r m28603a(Class<TT> cls, Class<TT> cls2, C8688q<? super TT> qVar) {
        return new C8802y(cls, cls2, qVar);
    }

    /* renamed from: b */
    public static <T1> C8690r m28604b(Class<T1> cls, C8688q<T1> qVar) {
        return new C8767a0(cls, qVar);
    }
}
