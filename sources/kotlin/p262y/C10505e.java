package kotlin.p262y;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b'\u0018\u0000 \u000b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, mo16641d2 = {"Lkotlin/collections/AbstractSet;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "equals", "", "other", "", "hashCode", "", "Companion", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.y.e */
/* compiled from: AbstractSet.kt */
public abstract class C10505e<E> extends C10486a<E> implements Set<E>, C10190a {

    /* renamed from: f */
    public static final C10506a f28382f = new C10506a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.y.e$a */
    /* compiled from: AbstractSet.kt */
    public static final class C10506a {
        private C10506a() {
        }

        /* renamed from: a */
        public final int mo36001a(Collection<?> collection) {
            C10202j.m34178b(collection, "c");
            Iterator<?> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i += next != null ? next.hashCode() : 0;
            }
            return i;
        }

        public /* synthetic */ C10506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo36002a(Set<?> set, Set<?> set2) {
            C10202j.m34178b(set, "c");
            C10202j.m34178b(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }
    }

    protected C10505e() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return f28382f.mo36002a(this, (Set) obj);
    }

    public int hashCode() {
        return f28382f.mo36001a(this);
    }
}
