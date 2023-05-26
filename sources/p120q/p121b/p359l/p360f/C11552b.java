package p120q.p121b.p359l.p360f;

import java.util.List;
import java.util.Map;
import p120q.p121b.C5311c;
import p120q.p121b.p357j.C11532a;
import p120q.p121b.p359l.C11539a;
import p120q.p121b.p359l.C11544c;
import p120q.p121b.p359l.C11550e;
import p120q.p121b.p359l.p361g.C11565h;
import p120q.p121b.p359l.p361g.C11568k;

/* renamed from: q.b.l.f.b */
/* compiled from: ContextBuilderHelper */
public class C11552b implements C11553c {

    /* renamed from: a */
    private C5311c f30850a;

    public C11552b(C5311c cVar) {
        this.f30850a = cVar;
    }

    /* renamed from: a */
    public void mo37625a(C11544c cVar) {
        C11532a a = this.f30850a.mo18508a();
        List<C11539a> a2 = a.mo37638a();
        if (!a2.isEmpty()) {
            cVar.mo37698a(a2);
        }
        if (a.mo37641c() != null) {
            cVar.mo37701a((C11565h) a.mo37641c());
        }
        if (a.mo37643e() == null) {
            Map<String, String> d = a.mo37642d();
            if (!d.isEmpty()) {
                for (Map.Entry next : d.entrySet()) {
                    cVar.mo37697a((String) next.getKey(), (String) next.getValue());
                }
            }
            Map<String, Object> b = a.mo37640b();
            if (!b.isEmpty()) {
                for (Map.Entry next2 : b.entrySet()) {
                    cVar.mo37696a((String) next2.getKey(), next2.getValue());
                }
                return;
            }
            return;
        }
        m37773a(a.mo37643e());
        throw null;
    }

    /* renamed from: a */
    private C11568k m37773a(C11550e eVar) {
        eVar.mo37717a();
        throw null;
    }
}
