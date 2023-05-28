package p120q.p121b.p359l.p360f;

import javax.servlet.http.HttpServletRequest;
import p120q.p121b.p359l.C11544c;
import p120q.p121b.p359l.p361g.C11562e;
import p120q.p121b.p359l.p361g.C11565h;
import p120q.p121b.p359l.p361g.C11568k;
import p120q.p121b.p365o.C11586a;

/* renamed from: q.b.l.f.d */
/* compiled from: HttpEventBuilderHelper */
public class C11554d implements C11553c {

    /* renamed from: a */
    private final C11555e f30851a = new C11551a();

    /* renamed from: b */
    private void m37777b(C11544c cVar, HttpServletRequest httpServletRequest) {
        cVar.mo37702a((C11565h) new C11568k((String) null, httpServletRequest.getUserPrincipal() != null ? httpServletRequest.getUserPrincipal().getName() : null, this.f30851a.mo37718a(httpServletRequest), (String) null), false);
    }

    /* renamed from: a */
    public void mo37625a(C11544c cVar) {
        HttpServletRequest a = C11586a.m37894a();
        if (a != null) {
            m37776a(cVar, a);
            m37777b(cVar, a);
        }
    }

    /* renamed from: a */
    private void m37776a(C11544c cVar, HttpServletRequest httpServletRequest) {
        cVar.mo37702a((C11565h) new C11562e(httpServletRequest, this.f30851a), false);
    }
}
