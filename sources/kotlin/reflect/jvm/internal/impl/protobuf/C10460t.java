package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.reflect.jvm.internal.impl.protobuf.C10424g;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t */
/* compiled from: SmallSortedMap */
class C10460t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f28300f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C10460t<K, V>.C0981c> f28301g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Map<K, V> f28302h;

    /* renamed from: i */
    private boolean f28303i;

    /* renamed from: j */
    private volatile C10460t<K, V>.C4754e f28304j;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$a */
    /* compiled from: SmallSortedMap */
    static class C10461a extends C10460t<FieldDescriptorType, Object> {
        C10461a(int i) {
            super(i, (C10461a) null);
        }

        /* renamed from: d */
        public void mo35838d() {
            if (!mo35835c()) {
                for (int i = 0; i < mo35831a(); i++) {
                    Map.Entry a = mo35833a(i);
                    if (((C10424g.C10426b) a.getKey()).mo35757h()) {
                        a.setValue(Collections.unmodifiableList((List) a.getValue()));
                    }
                }
                for (Map.Entry entry : mo35834b()) {
                    if (((C10424g.C10426b) entry.getKey()).mo35757h()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C10460t.super.mo35838d();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C10460t.super.mo35832a((C10424g.C10426b) obj, obj2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b */
    /* compiled from: SmallSortedMap */
    private static class C10462b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Iterator<Object> f28305a = new C10463a();

        /* renamed from: b */
        private static final Iterable<Object> f28306b = new C10464b();

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$a */
        /* compiled from: SmallSortedMap */
        static class C10463a implements Iterator<Object> {
            C10463a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$b */
        /* compiled from: SmallSortedMap */
        static class C10464b implements Iterable<Object> {
            C10464b() {
            }

            public Iterator<Object> iterator() {
                return C10462b.f28305a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m35467b() {
            return f28306b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$c */
    /* compiled from: SmallSortedMap */
    private class C10465c implements Comparable<C10460t<K, V>.C0981c>, Map.Entry<K, V> {

        /* renamed from: f */
        private final K f28307f;

        /* renamed from: g */
        private V f28308g;

        C10465c(C10460t tVar, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public int compareTo(C10460t<K, V>.C0981c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!m35468a(this.f28307f, entry.getKey()) || !m35468a(this.f28308g, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f28308g;
        }

        public int hashCode() {
            K k = this.f28307f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f28308g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C10460t.this.m35456e();
            V v2 = this.f28308g;
            this.f28308g = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(String.valueOf(this.f28307f));
            String valueOf2 = String.valueOf(String.valueOf(this.f28308g));
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }

        C10465c(K k, V v) {
            this.f28307f = k;
            this.f28308g = v;
        }

        /* renamed from: a */
        private boolean m35468a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        public K getKey() {
            return this.f28307f;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$d */
    /* compiled from: SmallSortedMap */
    private class C10466d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f */
        private int f28310f;

        /* renamed from: g */
        private boolean f28311g;

        /* renamed from: h */
        private Iterator<Map.Entry<K, V>> f28312h;

        private C10466d() {
            this.f28310f = -1;
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m35470a() {
            if (this.f28312h == null) {
                this.f28312h = C10460t.this.f28302h.entrySet().iterator();
            }
            return this.f28312h;
        }

        public boolean hasNext() {
            return this.f28310f + 1 < C10460t.this.f28301g.size() || m35470a().hasNext();
        }

        public void remove() {
            if (this.f28311g) {
                this.f28311g = false;
                C10460t.this.m35456e();
                if (this.f28310f < C10460t.this.f28301g.size()) {
                    C10460t tVar = C10460t.this;
                    int i = this.f28310f;
                    this.f28310f = i - 1;
                    Object unused = tVar.m35454c(i);
                    return;
                }
                m35470a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public Map.Entry<K, V> next() {
            this.f28311g = true;
            int i = this.f28310f + 1;
            this.f28310f = i;
            if (i < C10460t.this.f28301g.size()) {
                return (Map.Entry) C10460t.this.f28301g.get(this.f28310f);
            }
            return (Map.Entry) m35470a().next();
        }

        /* synthetic */ C10466d(C10460t tVar, C10461a aVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$e */
    /* compiled from: SmallSortedMap */
    private class C10467e extends AbstractSet<Map.Entry<K, V>> {
        private C10467e() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C10460t.this.mo35832a((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C10460t.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C10460t.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C10466d(C10460t.this, (C10461a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C10460t.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C10460t.this.size();
        }

        /* synthetic */ C10467e(C10460t tVar, C10461a aVar) {
            this();
        }
    }

    /* synthetic */ C10460t(int i, C10461a aVar) {
        this(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m35456e() {
        if (this.f28303i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private void m35457f() {
        m35456e();
        if (this.f28301g.isEmpty() && !(this.f28301g instanceof ArrayList)) {
            this.f28301g = new ArrayList(this.f28300f);
        }
    }

    /* renamed from: g */
    private SortedMap<K, V> m35458g() {
        m35456e();
        if (this.f28302h.isEmpty() && !(this.f28302h instanceof TreeMap)) {
            this.f28302h = new TreeMap();
        }
        return (SortedMap) this.f28302h;
    }

    public void clear() {
        m35456e();
        if (!this.f28301g.isEmpty()) {
            this.f28301g.clear();
        }
        if (!this.f28302h.isEmpty()) {
            this.f28302h.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m35449a(comparable) >= 0 || this.f28302h.containsKey(comparable);
    }

    /* renamed from: d */
    public void mo35838d() {
        if (!this.f28303i) {
            this.f28302h = this.f28302h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f28302h);
            this.f28303i = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f28304j == null) {
            this.f28304j = new C10467e(this, (C10461a) null);
        }
        return this.f28304j;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m35449a(comparable);
        if (a >= 0) {
            return this.f28301g.get(a).getValue();
        }
        return this.f28302h.get(comparable);
    }

    public V remove(Object obj) {
        m35456e();
        Comparable comparable = (Comparable) obj;
        int a = m35449a(comparable);
        if (a >= 0) {
            return m35454c(a);
        }
        if (this.f28302h.isEmpty()) {
            return null;
        }
        return this.f28302h.remove(comparable);
    }

    public int size() {
        return this.f28301g.size() + this.f28302h.size();
    }

    private C10460t(int i) {
        this.f28300f = i;
        this.f28301g = Collections.emptyList();
        this.f28302h = Collections.emptyMap();
    }

    /* renamed from: b */
    static <FieldDescriptorType extends C10424g.C10426b<FieldDescriptorType>> C10460t<FieldDescriptorType, Object> m35453b(int i) {
        return new C10461a(i);
    }

    /* renamed from: c */
    public boolean mo35835c() {
        return this.f28303i;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public V m35454c(int i) {
        m35456e();
        V value = this.f28301g.remove(i).getValue();
        if (!this.f28302h.isEmpty()) {
            Iterator it = m35458g().entrySet().iterator();
            this.f28301g.add(new C10465c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    public int mo35831a() {
        return this.f28301g.size();
    }

    /* renamed from: b */
    public Iterable<Map.Entry<K, V>> mo35834b() {
        return this.f28302h.isEmpty() ? C10462b.m35467b() : this.f28302h.entrySet();
    }

    /* renamed from: a */
    public Map.Entry<K, V> mo35833a(int i) {
        return this.f28301g.get(i);
    }

    /* renamed from: a */
    public V mo35832a(K k, V v) {
        m35456e();
        int a = m35449a(k);
        if (a >= 0) {
            return this.f28301g.get(a).setValue(v);
        }
        m35457f();
        int i = -(a + 1);
        if (i >= this.f28300f) {
            return m35458g().put(k, v);
        }
        int size = this.f28301g.size();
        int i2 = this.f28300f;
        if (size == i2) {
            C10465c remove = this.f28301g.remove(i2 - 1);
            m35458g().put(remove.getKey(), remove.getValue());
        }
        this.f28301g.add(i, new C10465c(k, v));
        return null;
    }

    /* renamed from: a */
    private int m35449a(K k) {
        int size = this.f28301g.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f28301g.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f28301g.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }
}
