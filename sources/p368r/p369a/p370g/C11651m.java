package p368r.p369a.p370g;

import androidx.recyclerview.widget.RecyclerView;
import java.util.EventListener;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p368r.p369a.C11597c;
import p368r.p369a.C11598d;
import p368r.p369a.C11600e;
import p368r.p369a.C11601f;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.m */
/* compiled from: ListenerStatus */
public class C11651m<T extends EventListener> {

    /* renamed from: a */
    private final T f31073a;

    /* renamed from: b */
    private final boolean f31074b;

    /* renamed from: r.a.g.m$b */
    /* compiled from: ListenerStatus */
    public static class C11653b extends C11651m<C11601f> {

        /* renamed from: d */
        private static C12938b f31077d = C12939c.m41778a(C11653b.class.getName());

        /* renamed from: c */
        private final ConcurrentMap<String, String> f31078c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo38152a(C11597c cVar) {
            if (this.f31078c.putIfAbsent(cVar.mo37850f(), cVar.mo37850f()) == null) {
                ((C11601f) mo38144a()).mo37871b(cVar);
                return;
            }
            C12938b bVar = f31077d;
            bVar.mo41319d("Service Type Added called for a service type already added: " + cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo38153b(C11597c cVar) {
            if (this.f31078c.putIfAbsent(cVar.mo37850f(), cVar.mo37850f()) == null) {
                ((C11601f) mo38144a()).mo37870a(cVar);
                return;
            }
            C12938b bVar = f31077d;
            bVar.mo41319d("Service Sub Type Added called for a service sub type already added: " + cVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(RecyclerView.C0638l.FLAG_MOVED);
            sb.append("[Status for ");
            sb.append(((C11601f) mo38144a()).toString());
            if (this.f31078c.isEmpty()) {
                sb.append(" no type event ");
            } else {
                sb.append(" (");
                for (String str : this.f31078c.keySet()) {
                    sb.append(str + ", ");
                }
                sb.append(") ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public C11651m(T t, boolean z) {
        this.f31073a = t;
        this.f31074b = z;
    }

    /* renamed from: a */
    public T mo38144a() {
        return this.f31073a;
    }

    /* renamed from: b */
    public boolean mo38145b() {
        return this.f31074b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11651m) && mo38144a().equals(((C11651m) obj).mo38144a());
    }

    public int hashCode() {
        return mo38144a().hashCode();
    }

    public String toString() {
        return "[Status for " + mo38144a().toString() + "]";
    }

    /* renamed from: r.a.g.m$a */
    /* compiled from: ListenerStatus */
    public static class C11652a extends C11651m<C11600e> {

        /* renamed from: d */
        private static C12938b f31075d = C12939c.m41778a(C11652a.class.getName());

        /* renamed from: c */
        private final ConcurrentMap<String, C11598d> f31076c = new ConcurrentHashMap(32);

        public C11652a(C11600e eVar, boolean z) {
            super(eVar, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo38149a(C11597c cVar) {
            if (this.f31076c.putIfAbsent(cVar.mo37849e() + "." + cVar.mo37850f(), cVar.mo37847c().clone()) == null) {
                ((C11600e) mo38144a()).serviceAdded(cVar);
                C11598d c = cVar.mo37847c();
                if (c != null && c.mo37868u()) {
                    ((C11600e) mo38144a()).serviceResolved(cVar);
                    return;
                }
                return;
            }
            C12938b bVar = f31075d;
            bVar.mo41310b("Service Added called for a service already added: " + cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo38150b(C11597c cVar) {
            String str = cVar.mo37849e() + "." + cVar.mo37850f();
            ConcurrentMap<String, C11598d> concurrentMap = this.f31076c;
            if (concurrentMap.remove(str, concurrentMap.get(str))) {
                ((C11600e) mo38144a()).serviceRemoved(cVar);
                return;
            }
            f31075d.mo41310b("Service Removed called for a service already removed: " + cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized void mo38151c(C11597c cVar) {
            C11598d c = cVar.mo37847c();
            if (c == null || !c.mo37868u()) {
                f31075d.mo41315c("Service Resolved called for an unresolved event: " + cVar);
            } else {
                String str = cVar.mo37849e() + "." + cVar.mo37850f();
                C11598d dVar = (C11598d) this.f31076c.get(str);
                if (m38301a(c, dVar)) {
                    f31075d.mo41310b("Service Resolved called for a service already resolved: " + cVar);
                } else if (dVar == null) {
                    if (this.f31076c.putIfAbsent(str, c.clone()) == null) {
                        ((C11600e) mo38144a()).serviceResolved(cVar);
                    }
                } else if (this.f31076c.replace(str, dVar, c.clone())) {
                    ((C11600e) mo38144a()).serviceResolved(cVar);
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(RecyclerView.C0638l.FLAG_MOVED);
            sb.append("[Status for ");
            sb.append(((C11600e) mo38144a()).toString());
            if (this.f31076c.isEmpty()) {
                sb.append(" no type event ");
            } else {
                sb.append(" (");
                for (String str : this.f31076c.keySet()) {
                    sb.append(str + ", ");
                }
                sb.append(") ");
            }
            sb.append("]");
            return sb.toString();
        }

        /* renamed from: a */
        private static final boolean m38301a(C11598d dVar, C11598d dVar2) {
            if (dVar == null || dVar2 == null || !dVar.equals(dVar2)) {
                return false;
            }
            byte[] q = dVar.mo37865q();
            byte[] q2 = dVar2.mo37865q();
            if (q.length != q2.length) {
                return false;
            }
            for (int i = 0; i < q.length; i++) {
                if (q[i] != q2[i]) {
                    return false;
                }
            }
            if (!dVar.mo37851a(dVar2)) {
                return false;
            }
            return true;
        }
    }
}
