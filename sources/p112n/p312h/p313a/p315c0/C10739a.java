package p112n.p312h.p313a.p315c0;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import junit.framework.Assert;
import p112n.p312h.p313a.p318f0.C10761b;
import p112n.p312h.p313a.p318f0.C10767d;

/* renamed from: n.h.a.c0.a */
/* compiled from: DownloadEventPoolImpl */
public class C10739a {

    /* renamed from: a */
    private final Executor f28796a = C10761b.m36477a(10, "EventPool");

    /* renamed from: b */
    private final HashMap<String, LinkedList<C10744d>> f28797b = new HashMap<>();

    /* renamed from: n.h.a.c0.a$a */
    /* compiled from: DownloadEventPoolImpl */
    class C10740a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C10743c f28798f;

        C10740a(C10743c cVar) {
            this.f28798f = cVar;
        }

        public void run() {
            C10739a.this.mo36462b(this.f28798f);
        }
    }

    /* renamed from: a */
    public boolean mo36461a(String str, C10744d dVar) {
        boolean add;
        if (C10767d.f28826a) {
            C10767d.m36494d(this, "setListener %s", str);
        }
        Assert.assertNotNull("EventPoolImpl.add", dVar);
        LinkedList linkedList = this.f28797b.get(str);
        if (linkedList == null) {
            synchronized (str.intern()) {
                linkedList = this.f28797b.get(str);
                if (linkedList == null) {
                    HashMap<String, LinkedList<C10744d>> hashMap = this.f28797b;
                    LinkedList linkedList2 = new LinkedList();
                    hashMap.put(str, linkedList2);
                    linkedList = linkedList2;
                }
            }
        }
        synchronized (str.intern()) {
            add = linkedList.add(dVar);
        }
        return add;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo36462b(p112n.p312h.p313a.p315c0.C10743c r6) {
        /*
            r5 = this;
            boolean r0 = p112n.p312h.p313a.p318f0.C10767d.f28826a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0013
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = r6.mo36465a()
            r0[r1] = r3
            java.lang.String r3 = "publish %s"
            p112n.p312h.p313a.p318f0.C10767d.m36494d(r5, r3, r0)
        L_0x0013:
            java.lang.String r0 = "EventPoolImpl.publish"
            junit.framework.Assert.assertNotNull(r0, r6)
            java.lang.String r0 = r6.mo36465a()
            java.util.HashMap<java.lang.String, java.util.LinkedList<n.h.a.c0.d>> r3 = r5.f28797b
            java.lang.Object r3 = r3.get(r0)
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            if (r3 != 0) goto L_0x0049
            java.lang.String r4 = r0.intern()
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, java.util.LinkedList<n.h.a.c0.d>> r3 = r5.f28797b     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0046 }
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch:{ all -> 0x0046 }
            if (r3 != 0) goto L_0x0044
            boolean r6 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x0042
            java.lang.String r6 = "No listener for this event %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            r2[r1] = r0     // Catch:{ all -> 0x0046 }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r5, r6, r2)     // Catch:{ all -> 0x0046 }
        L_0x0042:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return r1
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            goto L_0x0049
        L_0x0046:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r6
        L_0x0049:
            r5.m36393a((java.util.LinkedList<p112n.p312h.p313a.p315c0.C10744d>) r3, (p112n.p312h.p313a.p315c0.C10743c) r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p312h.p313a.p315c0.C10739a.mo36462b(n.h.a.c0.c):boolean");
    }

    /* renamed from: a */
    public void mo36460a(C10743c cVar) {
        if (C10767d.f28826a) {
            C10767d.m36494d(this, "asyncPublishInNewThread %s", cVar.mo36465a());
        }
        Assert.assertNotNull("EventPoolImpl.asyncPublish event", cVar);
        this.f28796a.execute(new C10740a(cVar));
    }

    /* renamed from: a */
    private void m36393a(LinkedList<C10744d> linkedList, C10743c cVar) {
        Object[] array = linkedList.toArray();
        int length = array.length;
        int i = 0;
        while (i < length && !((C10744d) array[i]).mo36466a(cVar)) {
            i++;
        }
        Runnable runnable = cVar.f28805a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
