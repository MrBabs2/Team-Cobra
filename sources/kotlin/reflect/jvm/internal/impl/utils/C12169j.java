package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10186b;
import kotlin.jvm.internal.C10187b0;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10193d;

/* renamed from: kotlin.reflect.jvm.internal.impl.utils.j */
/* compiled from: SmartSet.kt */
public final class C12169j<T> extends AbstractSet<T> {

    /* renamed from: h */
    public static final C12171b f31935h = new C12171b((DefaultConstructorMarker) null);

    /* renamed from: f */
    private Object f31936f;

    /* renamed from: g */
    private int f31937g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.j$a */
    /* compiled from: SmartSet.kt */
    private static final class C12170a<T> implements Iterator<T>, C10193d {

        /* renamed from: f */
        private final Iterator<T> f31938f;

        public C12170a(T[] tArr) {
            C10202j.m34178b(tArr, "array");
            this.f31938f = C10186b.m34138a(tArr);
        }

        public boolean hasNext() {
            return this.f31938f.hasNext();
        }

        public T next() {
            return this.f31938f.next();
        }

        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.j$b */
    /* compiled from: SmartSet.kt */
    public static final class C12171b {
        private C12171b() {
        }

        /* renamed from: a */
        public final <T> C12169j<T> mo38799a() {
            return new C12169j<>((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C12171b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T> C12169j<T> mo38800a(Collection<? extends T> collection) {
            C10202j.m34178b(collection, "set");
            C12169j<T> jVar = new C12169j<>((DefaultConstructorMarker) null);
            jVar.addAll(collection);
            return jVar;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.j$c */
    /* compiled from: SmartSet.kt */
    private static final class C12172c<T> implements Iterator<T>, C10193d {

        /* renamed from: f */
        private boolean f31939f = true;

        /* renamed from: g */
        private final T f31940g;

        public C12172c(T t) {
            this.f31940g = t;
        }

        public boolean hasNext() {
            return this.f31939f;
        }

        public T next() {
            if (this.f31939f) {
                this.f31939f = false;
                return this.f31940g;
            }
            throw new NoSuchElementException();
        }

        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private C12169j() {
    }

    /* renamed from: b */
    public static final <T> C12169j<T> m40181b() {
        return f31935h.mo38799a();
    }

    /* renamed from: a */
    public int mo38789a() {
        return this.f31937g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(T r5) {
        /*
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r4.f31936f = r5
            goto L_0x007b
        L_0x000b:
            int r0 = r4.size()
            r2 = 0
            if (r0 != r1) goto L_0x0027
            java.lang.Object r0 = r4.f31936f
            boolean r0 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r0, (java.lang.Object) r5)
            if (r0 == 0) goto L_0x001b
            return r2
        L_0x001b:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r4.f31936f
            r0[r2] = r3
            r0[r1] = r5
            r4.f31936f = r0
            goto L_0x007b
        L_0x0027:
            int r0 = r4.size()
            r3 = 5
            if (r0 >= r3) goto L_0x006c
            java.lang.Object r0 = r4.f31936f
            if (r0 == 0) goto L_0x0064
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = kotlin.p262y.C10519k.m35626a((T[]) r0, r5)
            if (r3 == 0) goto L_0x003b
            return r2
        L_0x003b:
            int r2 = r4.size()
            r3 = 4
            if (r2 != r3) goto L_0x004f
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.util.LinkedHashSet r0 = kotlin.p262y.C10530o0.m35746a((T[]) r0)
            r0.add(r5)
            goto L_0x0061
        L_0x004f:
            int r2 = r4.size()
            int r2 = r2 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "java.util.Arrays.copyOf(this, newSize)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r5
        L_0x0061:
            r4.f31936f = r0
            goto L_0x007b
        L_0x0064:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r5.<init>(r0)
            throw r5
        L_0x006c:
            java.lang.Object r0 = r4.f31936f
            if (r0 == 0) goto L_0x0084
            java.util.Set r0 = kotlin.jvm.internal.C10187b0.m34148d(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L_0x007b
            return r2
        L_0x007b:
            int r5 = r4.size()
            int r5 = r5 + r1
            r4.mo38793h(r5)
            return r1
        L_0x0084:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T>"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.utils.C12169j.add(java.lang.Object):boolean");
    }

    public void clear() {
        this.f31936f = null;
        mo38793h(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C10202j.m34176a(this.f31936f, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f31936f;
            if (obj2 != null) {
                return C10519k.m35626a((T[]) (Object[]) obj2, obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj3 = this.f31936f;
        if (obj3 != null) {
            return ((Set) obj3).contains(obj);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }

    /* renamed from: h */
    public void mo38793h(int i) {
        this.f31937g = i;
    }

    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new C12172c(this.f31936f);
        }
        if (size() < 5) {
            Object obj = this.f31936f;
            if (obj != null) {
                return new C12170a((Object[]) obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj2 = this.f31936f;
        if (obj2 != null) {
            return C10187b0.m34148d(obj2).iterator();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
    }

    public final /* bridge */ int size() {
        return mo38789a();
    }

    public /* synthetic */ C12169j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
