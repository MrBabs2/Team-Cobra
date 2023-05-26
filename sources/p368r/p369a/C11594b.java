package p368r.p369a;

import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicReference;
import p368r.p369a.p370g.C11660o;

/* renamed from: r.a.b */
/* compiled from: NetworkTopologyDiscovery */
public interface C11594b {

    /* renamed from: r.a.b$a */
    /* compiled from: NetworkTopologyDiscovery */
    public static final class C11595a {

        /* renamed from: a */
        private static volatile C11594b f30934a;

        /* renamed from: b */
        private static final AtomicReference<C11596a> f30935b = new AtomicReference<>();

        /* renamed from: r.a.b$a$a */
        /* compiled from: NetworkTopologyDiscovery */
        public interface C11596a {
            /* renamed from: a */
            C11594b mo37845a();
        }

        private C11595a() {
        }

        /* renamed from: a */
        public static C11594b m37927a() {
            if (f30934a == null) {
                synchronized (C11595a.class) {
                    if (f30934a == null) {
                        f30934a = m37928b();
                    }
                }
            }
            return f30934a;
        }

        /* renamed from: b */
        protected static C11594b m37928b() {
            C11596a aVar = f30935b.get();
            C11594b a = aVar != null ? aVar.mo37845a() : null;
            return a != null ? a : new C11660o();
        }
    }

    /* renamed from: a */
    InetAddress[] mo37844a();
}
