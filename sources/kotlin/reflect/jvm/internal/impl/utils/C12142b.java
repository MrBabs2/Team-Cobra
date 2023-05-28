package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.reflect.jvm.internal.impl.utils.b */
/* compiled from: DFS */
public class C12142b {

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$a */
    /* compiled from: DFS */
    static class C12143a extends C12144b<N, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C9113l f31904a;

        /* renamed from: b */
        final /* synthetic */ boolean[] f31905b;

        C12143a(C9113l lVar, boolean[] zArr) {
            this.f31904a = lVar;
            this.f31905b = zArr;
        }

        /* renamed from: b */
        public boolean mo33841b(N n) {
            if (((Boolean) this.f31904a.invoke(n)).booleanValue()) {
                this.f31905b[0] = true;
            }
            return !this.f31905b[0];
        }

        /* renamed from: a */
        public Boolean m40143a() {
            return Boolean.valueOf(this.f31905b[0]);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$b */
    /* compiled from: DFS */
    public static abstract class C12144b<N, R> implements C12146d<N, R> {
        /* renamed from: a */
        public void mo35275a(N n) {
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$c */
    /* compiled from: DFS */
    public interface C12145c<N> {
        /* renamed from: a */
        Iterable<? extends N> mo33837a(N n);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$d */
    /* compiled from: DFS */
    public interface C12146d<N, R> {
        /* renamed from: a */
        R mo33839a();

        /* renamed from: a */
        void mo35275a(N n);

        /* renamed from: b */
        boolean mo33841b(N n);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$e */
    /* compiled from: DFS */
    public interface C12147e<N> {
        /* renamed from: a */
        boolean mo38755a(N n);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$f */
    /* compiled from: DFS */
    public static class C12148f<N> implements C12147e<N> {

        /* renamed from: a */
        private final Set<N> f31906a;

        public C12148f() {
            this(new HashSet());
        }

        /* renamed from: a */
        private static /* synthetic */ void m40151a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"}));
        }

        /* renamed from: a */
        public boolean mo38755a(N n) {
            return this.f31906a.add(n);
        }

        public C12148f(Set<N> set) {
            if (set != null) {
                this.f31906a = set;
            } else {
                m40151a(0);
                throw null;
            }
        }
    }

    /* renamed from: a */
    public static <N, R> R m40139a(Collection<N> collection, C12145c<N> cVar, C12147e<N> eVar, C12146d<N, R> dVar) {
        if (collection == null) {
            m40140a(0);
            throw null;
        } else if (cVar == null) {
            m40140a(1);
            throw null;
        } else if (eVar == null) {
            m40140a(2);
            throw null;
        } else if (dVar != null) {
            for (N a : collection) {
                m40141a(a, cVar, eVar, dVar);
            }
            return dVar.mo33839a();
        } else {
            m40140a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m40140a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: a */
    public static <N, R> R m40138a(Collection<N> collection, C12145c<N> cVar, C12146d<N, R> dVar) {
        if (collection == null) {
            m40140a(4);
            throw null;
        } else if (cVar == null) {
            m40140a(5);
            throw null;
        } else if (dVar != null) {
            return m40139a(collection, cVar, new C12148f(), dVar);
        } else {
            m40140a(6);
            throw null;
        }
    }

    /* renamed from: a */
    public static <N> Boolean m40137a(Collection<N> collection, C12145c<N> cVar, C9113l<N, Boolean> lVar) {
        if (collection == null) {
            m40140a(7);
            throw null;
        } else if (cVar == null) {
            m40140a(8);
            throw null;
        } else if (lVar != null) {
            return (Boolean) m40138a(collection, cVar, new C12143a(lVar, new boolean[1]));
        } else {
            m40140a(9);
            throw null;
        }
    }

    /* renamed from: a */
    public static <N> void m40141a(N n, C12145c<N> cVar, C12147e<N> eVar, C12146d<N, ?> dVar) {
        if (n == null) {
            m40140a(22);
            throw null;
        } else if (cVar == null) {
            m40140a(23);
            throw null;
        } else if (eVar == null) {
            m40140a(24);
            throw null;
        } else if (dVar == null) {
            m40140a(25);
            throw null;
        } else if (eVar.mo38755a(n) && dVar.mo33841b(n)) {
            for (Object a : cVar.mo33837a(n)) {
                m40141a(a, cVar, eVar, dVar);
            }
            dVar.mo35275a(n);
        }
    }
}
