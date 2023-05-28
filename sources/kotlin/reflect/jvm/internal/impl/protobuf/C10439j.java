package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j */
/* compiled from: LazyField */
public class C10439j extends C10443k {

    /* renamed from: e */
    private final C10449o f28266e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$b */
    /* compiled from: LazyField */
    static class C10441b<K> implements Map.Entry<K, Object> {

        /* renamed from: f */
        private Map.Entry<K, C10439j> f28267f;

        public K getKey() {
            return this.f28267f.getKey();
        }

        public Object getValue() {
            C10439j value = this.f28267f.getValue();
            if (value == null) {
                return null;
            }
            return value.mo35782b();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C10449o) {
                return this.f28267f.getValue().mo35795c((C10449o) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C10441b(Map.Entry<K, C10439j> entry) {
            this.f28267f = entry;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$c */
    /* compiled from: LazyField */
    static class C10442c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: f */
        private Iterator<Map.Entry<K, Object>> f28268f;

        public C10442c(Iterator<Map.Entry<K, Object>> it) {
            this.f28268f = it;
        }

        public boolean hasNext() {
            return this.f28268f.hasNext();
        }

        public void remove() {
            this.f28268f.remove();
        }

        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f28268f.next();
            return next.getValue() instanceof C10439j ? new C10441b(next) : next;
        }
    }

    /* renamed from: b */
    public C10449o mo35782b() {
        return mo35794b(this.f28266e);
    }

    public boolean equals(Object obj) {
        return mo35782b().equals(obj);
    }

    public int hashCode() {
        return mo35782b().hashCode();
    }

    public String toString() {
        return mo35782b().toString();
    }
}
