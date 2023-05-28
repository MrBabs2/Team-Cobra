package p112n.p312h.p313a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.p315c0.C10741b;
import p112n.p312h.p313a.p318f0.C10767d;

/* renamed from: n.h.a.y */
/* compiled from: LostServiceConnectedHandler */
public class C10805y extends C10753e implements C10799u {

    /* renamed from: b */
    private final ArrayList<C10722a.C10724b> f28872b = new ArrayList<>();

    /* renamed from: a */
    public void mo36491a() {
        C10800v c = C10794q.m36615e().mo36577c();
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.f28872b) {
            this.f28872b.clear();
            ArrayList arrayList = new ArrayList(c.mo36436a());
            for (C10722a.C10724b bVar : (List) this.f28872b.clone()) {
                int t = bVar.mo36427t();
                if (c.mo36438a(t)) {
                    bVar.mo36425r().mo36401g().mo36432a();
                    if (!arrayList.contains(Integer.valueOf(t))) {
                        arrayList.add(Integer.valueOf(t));
                    }
                } else {
                    bVar.mo36426s();
                }
            }
            c.mo36437a((List<Integer>) arrayList);
        }
    }

    /* renamed from: b */
    public void mo36492b() {
        if (mo36493c() == C10741b.C10742a.lost) {
            C10800v c = C10794q.m36615e().mo36577c();
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(C10773h.m36524b().mo36510a()));
            }
            if (C10773h.m36524b().mo36510a() > 0) {
                synchronized (this.f28872b) {
                    C10773h.m36524b().mo36514a((List<C10722a.C10724b>) this.f28872b);
                    Iterator<C10722a.C10724b> it = this.f28872b.iterator();
                    while (it.hasNext()) {
                        it.next().mo36421a();
                    }
                    c.mo36440b();
                }
                C10794q.m36615e().mo36571a();
            }
        } else if (C10773h.m36524b().mo36510a() > 0) {
            C10767d.m36495e(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(C10773h.m36524b().mo36510a()));
        }
    }

    /* renamed from: c */
    public void mo36581c(C10722a.C10724b bVar) {
        if (!this.f28872b.isEmpty()) {
            synchronized (this.f28872b) {
                this.f28872b.remove(bVar);
            }
        }
    }

    /* renamed from: a */
    public boolean mo36579a(C10722a.C10724b bVar) {
        return !this.f28872b.isEmpty() && this.f28872b.contains(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo36580b(p112n.p312h.p313a.C10722a.C10724b r7) {
        /*
            r6 = this;
            n.h.a.q r0 = p112n.p312h.p313a.C10794q.m36615e()
            boolean r0 = r0.mo36578d()
            r1 = 0
            if (r0 != 0) goto L_0x0054
            java.util.ArrayList<n.h.a.a$b> r0 = r6.f28872b
            monitor-enter(r0)
            n.h.a.q r2 = p112n.p312h.p313a.C10794q.m36615e()     // Catch:{ all -> 0x0051 }
            boolean r2 = r2.mo36578d()     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x004f
            boolean r2 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x0051 }
            r3 = 1
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "Waiting for connecting with the downloader service... %d"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0051 }
            n.h.a.a r5 = r7.mo36425r()     // Catch:{ all -> 0x0051 }
            int r5 = r5.getId()     // Catch:{ all -> 0x0051 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0051 }
            r4[r1] = r5     // Catch:{ all -> 0x0051 }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r6, r2, r4)     // Catch:{ all -> 0x0051 }
        L_0x0032:
            n.h.a.m r1 = p112n.p312h.p313a.C10784m.m36573c()     // Catch:{ all -> 0x0051 }
            android.content.Context r2 = p112n.p312h.p313a.p318f0.C10763c.m36479a()     // Catch:{ all -> 0x0051 }
            r1.mo32757a((android.content.Context) r2)     // Catch:{ all -> 0x0051 }
            java.util.ArrayList<n.h.a.a$b> r1 = r6.f28872b     // Catch:{ all -> 0x0051 }
            boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004d
            r7.mo36421a()     // Catch:{ all -> 0x0051 }
            java.util.ArrayList<n.h.a.a$b> r1 = r6.f28872b     // Catch:{ all -> 0x0051 }
            r1.add(r7)     // Catch:{ all -> 0x0051 }
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r3
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            goto L_0x0054
        L_0x0051:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r7
        L_0x0054:
            r6.mo36581c(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p312h.p313a.C10805y.mo36580b(n.h.a.a$b):boolean");
    }
}
