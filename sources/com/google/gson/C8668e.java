package com.google.gson;

import com.google.gson.p191t.C8700c;
import com.google.gson.p191t.C8715d;
import com.google.gson.p191t.C8729j;
import com.google.gson.p191t.p192l.C8737a;
import com.google.gson.p191t.p192l.C8739b;
import com.google.gson.p191t.p192l.C8741c;
import com.google.gson.p191t.p192l.C8743d;
import com.google.gson.p191t.p192l.C8748g;
import com.google.gson.p191t.p192l.C8750h;
import com.google.gson.p191t.p192l.C8753i;
import com.google.gson.p191t.p192l.C8757j;
import com.google.gson.p191t.p192l.C8759k;
import com.google.gson.p191t.p192l.C8765n;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import com.google.gson.stream.C8694c;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.e */
/* compiled from: Gson */
public final class C8668e {

    /* renamed from: k */
    private static final C8805a<?> f24730k = C8805a.get(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C8805a<?>, C8674f<?>>> f24731a;

    /* renamed from: b */
    private final Map<C8805a<?>, C8688q<?>> f24732b;

    /* renamed from: c */
    private final List<C8690r> f24733c;

    /* renamed from: d */
    private final C8700c f24734d;

    /* renamed from: e */
    private final boolean f24735e;

    /* renamed from: f */
    private final boolean f24736f;

    /* renamed from: g */
    private final boolean f24737g;

    /* renamed from: h */
    private final boolean f24738h;

    /* renamed from: i */
    private final boolean f24739i;

    /* renamed from: j */
    private final C8743d f24740j;

    public C8668e() {
        this(C8715d.f24808l, C8661c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C8685p.DEFAULT, Collections.emptyList());
    }

    /* renamed from: a */
    private C8688q<Number> m28296a(boolean z) {
        if (z) {
            return C8765n.f24959v;
        }
        return new C8669a(this);
    }

    /* renamed from: b */
    private C8688q<Number> m28300b(boolean z) {
        if (z) {
            return C8765n.f24958u;
        }
        return new C8670b(this);
    }

    public String toString() {
        return "{serializeNulls:" + this.f24735e + ",factories:" + this.f24733c + ",instanceCreators:" + this.f24734d + "}";
    }

    /* renamed from: com.google.gson.e$a */
    /* compiled from: Gson */
    class C8669a extends C8688q<Number> {
        C8669a(C8668e eVar) {
        }

        /* renamed from: a */
        public Double m28317a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return Double.valueOf(aVar.mo32372t());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo32400p();
                return;
            }
            C8668e.m28297a(number.doubleValue());
            cVar.mo32383a(number);
        }
    }

    /* renamed from: com.google.gson.e$b */
    /* compiled from: Gson */
    class C8670b extends C8688q<Number> {
        C8670b(C8668e eVar) {
        }

        /* renamed from: a */
        public Float m28321a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return Float.valueOf((float) aVar.mo32372t());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo32400p();
                return;
            }
            C8668e.m28297a((double) number.floatValue());
            cVar.mo32383a(number);
        }
    }

    /* renamed from: com.google.gson.e$c */
    /* compiled from: Gson */
    static class C8671c extends C8688q<Number> {
        C8671c() {
        }

        /* renamed from: a */
        public Number m28325a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return Long.valueOf(aVar.mo32375v());
            }
            aVar.mo32377x();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo32400p();
            } else {
                cVar.mo32394e(number.toString());
            }
        }
    }

    /* renamed from: com.google.gson.e$d */
    /* compiled from: Gson */
    static class C8672d extends C8688q<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C8688q f24741a;

        C8672d(C8688q qVar) {
            this.f24741a = qVar;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, AtomicLong atomicLong) throws IOException {
            this.f24741a.mo32316a(cVar, Long.valueOf(atomicLong.get()));
        }

        /* renamed from: a */
        public AtomicLong m28329a(C8691a aVar) throws IOException {
            return new AtomicLong(((Number) this.f24741a.mo32314a(aVar)).longValue());
        }
    }

    /* renamed from: com.google.gson.e$e */
    /* compiled from: Gson */
    static class C8673e extends C8688q<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C8688q f24742a;

        C8673e(C8688q qVar) {
            this.f24742a = qVar;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.mo32381a();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f24742a.mo32316a(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.mo32390d();
        }

        /* renamed from: a */
        public AtomicLongArray m28333a(C8691a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo32359a();
            while (aVar.mo32367m()) {
                arrayList.add(Long.valueOf(((Number) this.f24742a.mo32314a(aVar)).longValue()));
            }
            aVar.mo32365i();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }
    }

    /* renamed from: com.google.gson.e$f */
    /* compiled from: Gson */
    static class C8674f<T> extends C8688q<T> {

        /* renamed from: a */
        private C8688q<T> f24743a;

        C8674f() {
        }

        /* renamed from: a */
        public void mo32321a(C8688q<T> qVar) {
            if (this.f24743a == null) {
                this.f24743a = qVar;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public T mo32314a(C8691a aVar) throws IOException {
            C8688q<T> qVar = this.f24743a;
            if (qVar != null) {
                return qVar.mo32314a(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, T t) throws IOException {
            C8688q<T> qVar = this.f24743a;
            if (qVar != null) {
                qVar.mo32316a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    static void m28297a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: b */
    private static C8688q<AtomicLongArray> m28299b(C8688q<Number> qVar) {
        return new C8673e(qVar).mo32357a();
    }

    C8668e(C8715d dVar, C8667d dVar2, Map<Type, C8675f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C8685p pVar, List<C8690r> list) {
        this.f24731a = new ThreadLocal<>();
        this.f24732b = new ConcurrentHashMap();
        this.f24734d = new C8700c(map);
        this.f24735e = z;
        this.f24737g = z3;
        this.f24736f = z4;
        this.f24738h = z5;
        this.f24739i = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8765n.f24936Y);
        arrayList.add(C8750h.f24880b);
        arrayList.add(dVar);
        arrayList.addAll(list);
        arrayList.add(C8765n.f24915D);
        arrayList.add(C8765n.f24950m);
        arrayList.add(C8765n.f24944g);
        arrayList.add(C8765n.f24946i);
        arrayList.add(C8765n.f24948k);
        C8688q<Number> a = m28294a(pVar);
        arrayList.add(C8765n.m28603a(Long.TYPE, Long.class, a));
        arrayList.add(C8765n.m28603a(Double.TYPE, Double.class, m28296a(z7)));
        arrayList.add(C8765n.m28603a(Float.TYPE, Float.class, m28300b(z7)));
        arrayList.add(C8765n.f24961x);
        arrayList.add(C8765n.f24952o);
        arrayList.add(C8765n.f24954q);
        arrayList.add(C8765n.m28602a(AtomicLong.class, m28295a(a)));
        arrayList.add(C8765n.m28602a(AtomicLongArray.class, m28299b(a)));
        arrayList.add(C8765n.f24956s);
        arrayList.add(C8765n.f24963z);
        arrayList.add(C8765n.f24917F);
        arrayList.add(C8765n.f24919H);
        arrayList.add(C8765n.m28602a(BigDecimal.class, C8765n.f24913B));
        arrayList.add(C8765n.m28602a(BigInteger.class, C8765n.f24914C));
        arrayList.add(C8765n.f24921J);
        arrayList.add(C8765n.f24923L);
        arrayList.add(C8765n.f24927P);
        arrayList.add(C8765n.f24929R);
        arrayList.add(C8765n.f24934W);
        arrayList.add(C8765n.f24925N);
        arrayList.add(C8765n.f24941d);
        arrayList.add(C8741c.f24860c);
        arrayList.add(C8765n.f24932U);
        arrayList.add(C8759k.f24900b);
        arrayList.add(C8757j.f24898b);
        arrayList.add(C8765n.f24930S);
        arrayList.add(C8737a.f24854c);
        arrayList.add(C8765n.f24939b);
        arrayList.add(new C8739b(this.f24734d));
        arrayList.add(new C8748g(this.f24734d, z2));
        C8743d dVar3 = new C8743d(this.f24734d);
        this.f24740j = dVar3;
        arrayList.add(dVar3);
        arrayList.add(C8765n.f24937Z);
        arrayList.add(new C8753i(this.f24734d, dVar2, dVar, this.f24740j));
        this.f24733c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C8688q<Number> m28294a(C8685p pVar) {
        if (pVar == C8685p.DEFAULT) {
            return C8765n.f24957t;
        }
        return new C8671c();
    }

    /* renamed from: a */
    private static C8688q<AtomicLong> m28295a(C8688q<Number> qVar) {
        return new C8672d(qVar).mo32357a();
    }

    /* renamed from: a */
    public <T> C8688q<T> mo32299a(C8805a<T> aVar) {
        C8688q<T> qVar = this.f24732b.get(aVar == null ? f24730k : aVar);
        if (qVar != null) {
            return qVar;
        }
        Map map = this.f24731a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f24731a.set(map);
            z = true;
        }
        C8674f fVar = (C8674f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C8674f fVar2 = new C8674f();
            map.put(aVar, fVar2);
            for (C8690r a : this.f24733c) {
                C8688q<T> a2 = a.mo32358a(this, aVar);
                if (a2 != null) {
                    fVar2.mo32321a(a2);
                    this.f24732b.put(aVar, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f24731a.remove();
            }
        }
    }

    /* renamed from: a */
    public <T> C8688q<T> mo32298a(C8690r rVar, C8805a<T> aVar) {
        if (!this.f24733c.contains(rVar)) {
            rVar = this.f24740j;
        }
        boolean z = false;
        for (C8690r next : this.f24733c) {
            if (z) {
                C8688q<T> a = next.mo32358a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (next == rVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: a */
    public <T> C8688q<T> mo32300a(Class<T> cls) {
        return mo32299a(C8805a.get(cls));
    }

    /* renamed from: a */
    public String mo32307a(Object obj) {
        if (obj == null) {
            return mo32306a((C8679j) C8680k.f24745a);
        }
        return mo32308a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public String mo32308a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo32312a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo32312a(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            mo32311a(obj, type, mo32302a(C8729j.m28505a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo32311a(Object obj, Type type, C8694c cVar) throws JsonIOException {
        C8688q<?> a = mo32299a(C8805a.get(type));
        boolean o = cVar.mo32399o();
        cVar.mo32387b(true);
        boolean m = cVar.mo32398m();
        cVar.mo32385a(this.f24736f);
        boolean l = cVar.mo32397l();
        cVar.mo32388c(this.f24735e);
        try {
            a.mo32316a(cVar, obj);
            cVar.mo32387b(o);
            cVar.mo32385a(m);
            cVar.mo32388c(l);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (Throwable th) {
            cVar.mo32387b(o);
            cVar.mo32385a(m);
            cVar.mo32388c(l);
            throw th;
        }
    }

    /* renamed from: a */
    public String mo32306a(C8679j jVar) {
        StringWriter stringWriter = new StringWriter();
        mo32310a(jVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo32310a(C8679j jVar, Appendable appendable) throws JsonIOException {
        try {
            mo32309a(jVar, mo32302a(C8729j.m28505a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: a */
    public C8694c mo32302a(Writer writer) throws IOException {
        if (this.f24737g) {
            writer.write(")]}'\n");
        }
        C8694c cVar = new C8694c(writer);
        if (this.f24738h) {
            cVar.mo32393d("  ");
        }
        cVar.mo32388c(this.f24735e);
        return cVar;
    }

    /* renamed from: a */
    public C8691a mo32301a(Reader reader) {
        C8691a aVar = new C8691a(reader);
        aVar.mo32360a(this.f24739i);
        return aVar;
    }

    /* renamed from: a */
    public void mo32309a(C8679j jVar, C8694c cVar) throws JsonIOException {
        boolean o = cVar.mo32399o();
        cVar.mo32387b(true);
        boolean m = cVar.mo32398m();
        cVar.mo32385a(this.f24736f);
        boolean l = cVar.mo32397l();
        cVar.mo32388c(this.f24735e);
        try {
            C8729j.m28506a(jVar, cVar);
            cVar.mo32387b(o);
            cVar.mo32385a(m);
            cVar.mo32388c(l);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (Throwable th) {
            cVar.mo32387b(o);
            cVar.mo32385a(m);
            cVar.mo32388c(l);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo32305a(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return mo32304a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> T mo32304a(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        C8691a a = mo32301a(reader);
        T a2 = mo32303a(a, type);
        m28298a((Object) a2, a);
        return a2;
    }

    /* renamed from: a */
    private static void m28298a(Object obj, C8691a aVar) {
        if (obj != null) {
            try {
                if (aVar.peek() != C8693b.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    /* renamed from: a */
    public <T> T mo32303a(C8691a aVar, Type type) throws JsonIOException, JsonSyntaxException {
        boolean o = aVar.mo32368o();
        aVar.mo32360a(true);
        try {
            aVar.peek();
            T a = mo32299a(C8805a.get(type)).mo32314a(aVar);
            aVar.mo32360a(o);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo32360a(o);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (Throwable th) {
            aVar.mo32360a(o);
            throw th;
        }
    }
}
