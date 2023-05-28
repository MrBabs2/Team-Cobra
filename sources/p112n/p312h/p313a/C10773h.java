package p112n.p312h.p313a;

import com.liulishuo.filedownloader.message.C8890c;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.p318f0.C10767d;

/* renamed from: n.h.a.h */
/* compiled from: FileDownloadList */
public class C10773h {

    /* renamed from: a */
    private final ArrayList<C10722a.C10724b> f28839a;

    /* renamed from: n.h.a.h$b */
    /* compiled from: FileDownloadList */
    private static final class C10775b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10773h f28840a = new C10773h();
    }

    /* renamed from: b */
    public static C10773h m36524b() {
        return C10775b.f28840a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo36510a() {
        return this.f28839a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C10722a.C10724b> mo36519c(int i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f28839a) {
            Iterator<C10722a.C10724b> it = this.f28839a.iterator();
            while (it.hasNext()) {
                C10722a.C10724b next = it.next();
                if (next.mo36422a(i) && !next.mo36419D()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<C10722a.C10724b> mo36521d(int i) {
        byte status;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f28839a) {
            Iterator<C10722a.C10724b> it = this.f28839a.iterator();
            while (it.hasNext()) {
                C10722a.C10724b next = it.next();
                if (next.mo36422a(i) && !next.mo36419D() && (status = next.mo36425r().getStatus()) != 0 && status != 10) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    private C10773h() {
        this.f28839a = new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo36511a(int i) {
        int i2;
        synchronized (this.f28839a) {
            Iterator<C10722a.C10724b> it = this.f28839a.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (it.next().mo36422a(i)) {
                    i2++;
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public C10722a.C10724b mo36517b(int i) {
        synchronized (this.f28839a) {
            Iterator<C10722a.C10724b> it = this.f28839a.iterator();
            while (it.hasNext()) {
                C10722a.C10724b next = it.next();
                if (next.mo36422a(i)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C10722a.C10724b> mo36513a(C10776i iVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f28839a) {
            Iterator<C10722a.C10724b> it = this.f28839a.iterator();
            while (it.hasNext()) {
                C10722a.C10724b next = it.next();
                if (next.mo36423a(iVar)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36518b(C10722a.C10724b bVar) {
        if (!bVar.mo36430x()) {
            synchronized (this.f28839a) {
                if (this.f28839a.contains(bVar)) {
                    C10767d.m36495e(this, "already has %s", bVar);
                } else {
                    bVar.mo36420F();
                    this.f28839a.add(bVar);
                    if (C10767d.f28826a) {
                        C10767d.m36494d(this, "add list in all %s %d %d", bVar, Byte.valueOf(bVar.mo36425r().getStatus()), Integer.valueOf(this.f28839a.size()));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo36520c(C10722a.C10724b bVar) {
        return this.f28839a.isEmpty() || !this.f28839a.contains(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C10722a.C10724b> mo36512a(int i, C10776i iVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f28839a) {
            Iterator<C10722a.C10724b> it = this.f28839a.iterator();
            while (it.hasNext()) {
                C10722a.C10724b next = it.next();
                if (next.mo36425r().mo36415w() == iVar && !next.mo36425r().mo36408j()) {
                    next.mo36424b(i);
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36514a(List<C10722a.C10724b> list) {
        synchronized (this.f28839a) {
            Iterator<C10722a.C10724b> it = this.f28839a.iterator();
            while (it.hasNext()) {
                C10722a.C10724b next = it.next();
                if (!list.contains(next)) {
                    list.add(next);
                }
            }
            this.f28839a.clear();
        }
    }

    /* renamed from: a */
    public boolean mo36516a(C10722a.C10724b bVar, MessageSnapshot messageSnapshot) {
        boolean remove;
        byte n = messageSnapshot.mo32695n();
        synchronized (this.f28839a) {
            remove = this.f28839a.remove(bVar);
        }
        if (C10767d.f28826a && this.f28839a.size() == 0) {
            C10767d.m36494d(this, "remove %s left %d %d", bVar, Byte.valueOf(n), Integer.valueOf(this.f28839a.size()));
        }
        if (remove) {
            C10797s e = bVar.mo36428u().mo36477e();
            if (n == -4) {
                e.mo36538f(messageSnapshot);
            } else if (n == -3) {
                e.mo36540h(C8890c.m29141a(messageSnapshot));
            } else if (n == -2) {
                e.mo36531b(messageSnapshot);
            } else if (n == -1) {
                e.mo36533c(messageSnapshot);
            }
        } else {
            C10767d.m36492b(this, "remove error, not exist: %s %d", bVar, Byte.valueOf(n));
        }
        return remove;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36515a(C10722a.C10724b bVar) {
        if (!bVar.mo36425r().mo36408j()) {
            bVar.mo36429v();
        }
        if (bVar.mo36428u().mo36477e().mo36532b()) {
            mo36518b(bVar);
        }
    }
}
