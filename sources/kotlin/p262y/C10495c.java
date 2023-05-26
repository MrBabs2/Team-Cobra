package kotlin.p262y;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u0000 )*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001)B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0018\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0016J#\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002J\u001c\u0010&\u001a\u00020'2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\bR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, mo16641d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "()V", "_keys", "", "_values", "", "keys", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "values", "getValues", "()Ljava/util/Collection;", "containsEntry", "", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "isEmpty", "toString", "", "o", "Companion", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.y.c */
/* compiled from: AbstractMap.kt */
public abstract class C10495c<K, V> implements Map<K, V>, C10190a {

    /* renamed from: f */
    private volatile Set<? extends K> f28372f;

    /* renamed from: g */
    private volatile Collection<? extends V> f28373g;

    /* renamed from: kotlin.y.c$a */
    /* compiled from: AbstractMap.kt */
    public static final class C10496a {
        private C10496a() {
        }

        public /* synthetic */ C10496a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, mo16641d2 = {"kotlin/collections/AbstractMap$keys$1", "Lkotlin/collections/AbstractSet;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: kotlin.y.c$b */
    /* compiled from: AbstractMap.kt */
    public static final class C10497b extends C10505e<K> {

        /* renamed from: g */
        final /* synthetic */ C10495c f28374g;

        /* renamed from: kotlin.y.c$b$a */
        /* compiled from: AbstractMap.kt */
        public static final class C10498a implements Iterator<K>, C10190a {

            /* renamed from: f */
            final /* synthetic */ Iterator f28375f;

            C10498a(Iterator it) {
                this.f28375f = it;
            }

            public boolean hasNext() {
                return this.f28375f.hasNext();
            }

            public K next() {
                return ((Map.Entry) this.f28375f.next()).getKey();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        C10497b(C10495c cVar) {
            this.f28374g = cVar;
        }

        /* renamed from: a */
        public int mo35897a() {
            return this.f28374g.size();
        }

        public boolean contains(Object obj) {
            return this.f28374g.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C10498a(this.f28374g.entrySet().iterator());
        }
    }

    /* renamed from: kotlin.y.c$c */
    /* compiled from: AbstractMap.kt */
    static final class C10499c extends C10203k implements C9113l<Map.Entry<? extends K, ? extends V>, String> {

        /* renamed from: f */
        final /* synthetic */ C10495c f28376f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10499c(C10495c cVar) {
            super(1);
            this.f28376f = cVar;
        }

        /* renamed from: a */
        public final String invoke(Map.Entry<? extends K, ? extends V> entry) {
            C10202j.m34178b(entry, "it");
            return this.f28376f.m35521b(entry);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, mo16641d2 = {"kotlin/collections/AbstractMap$values$1", "Lkotlin/collections/AbstractCollection;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: kotlin.y.c$d */
    /* compiled from: AbstractMap.kt */
    public static final class C10500d extends C10486a<V> {

        /* renamed from: f */
        final /* synthetic */ C10495c f28377f;

        /* renamed from: kotlin.y.c$d$a */
        /* compiled from: AbstractMap.kt */
        public static final class C10501a implements Iterator<V>, C10190a {

            /* renamed from: f */
            final /* synthetic */ Iterator f28378f;

            C10501a(Iterator it) {
                this.f28378f = it;
            }

            public boolean hasNext() {
                return this.f28378f.hasNext();
            }

            public V next() {
                return ((Map.Entry) this.f28378f.next()).getValue();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        C10500d(C10495c cVar) {
            this.f28377f = cVar;
        }

        /* renamed from: a */
        public int mo35897a() {
            return this.f28377f.size();
        }

        public boolean contains(Object obj) {
            return this.f28377f.containsValue(obj);
        }

        public Iterator<V> iterator() {
            return new C10501a(this.f28377f.entrySet().iterator());
        }
    }

    static {
        new C10496a((DefaultConstructorMarker) null);
    }

    protected C10495c() {
    }

    /* renamed from: a */
    public abstract Set mo33030a();

    /* renamed from: b */
    public Set<K> mo35966b() {
        if (this.f28372f == null) {
            this.f28372f = new C10497b(this);
        }
        Set<? extends K> set = this.f28372f;
        if (set != null) {
            return set;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: c */
    public int mo35967c() {
        return entrySet().size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract boolean containsKey(Object obj);

    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (C10202j.m34176a(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public Collection<V> mo35970d() {
        if (this.f28373g == null) {
            this.f28373g = new C10500d(this);
        }
        Collection<? extends V> collection = this.f28373g;
        if (collection != null) {
            return collection;
        }
        C10202j.m34172a();
        throw null;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo33030a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry a : entrySet) {
            if (!mo35965a(a)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ Set<K> keySet() {
        return mo35966b();
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo35967c();
    }

    public String toString() {
        return C10539w.m35773a(entrySet(), ", ", "{", "}", 0, (CharSequence) null, new C10499c(this), 24, (Object) null);
    }

    public final /* bridge */ Collection<V> values() {
        return mo35970d();
    }

    /* renamed from: a */
    public final boolean mo35965a(Map.Entry<?, ?> entry) {
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj = get(key);
        if (!C10202j.m34176a((Object) value, obj)) {
            return false;
        }
        if (obj != null || containsKey(key)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m35521b(Map.Entry<? extends K, ? extends V> entry) {
        return m35520b((Object) entry.getKey()) + "=" + m35520b((Object) entry.getValue());
    }

    /* renamed from: b */
    private final String m35520b(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }
}
