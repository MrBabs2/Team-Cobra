package com.liulishuo.filedownloader.services;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p112n.p312h.p313a.p318f0.C10761b;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10768e;

/* renamed from: com.liulishuo.filedownloader.services.j */
/* compiled from: FileDownloadThreadPool */
class C8908j {

    /* renamed from: a */
    private SparseArray<C8907i> f25316a = new SparseArray<>();

    /* renamed from: b */
    private ThreadPoolExecutor f25317b;

    /* renamed from: c */
    private int f25318c;

    /* renamed from: d */
    private int f25319d = 0;

    C8908j(int i) {
        this.f25317b = C10761b.m36477a(i, "Network");
        this.f25318c = i;
    }

    /* renamed from: a */
    public void mo32827a(C8907i iVar) {
        iVar.mo32823g();
        synchronized (this) {
            this.f25316a.put(iVar.mo32818b(), iVar);
        }
        this.f25317b.execute(iVar);
        int i = this.f25319d;
        if (i >= 600) {
            m29303c();
            this.f25319d = 0;
            return;
        }
        this.f25319d = i + 1;
    }

    /* renamed from: b */
    public boolean mo32829b(int i) {
        C8907i iVar = this.f25316a.get(i);
        return iVar != null && iVar.mo32821e();
    }

    /* renamed from: c */
    public synchronized boolean mo32830c(int i) {
        if (mo32825a() > 0) {
            C10767d.m36495e(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int a = C10768e.m36496a(i);
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.f25318c), Integer.valueOf(a));
        }
        List<Runnable> shutdownNow = this.f25317b.shutdownNow();
        this.f25317b = C10761b.m36477a(a, "Network");
        if (shutdownNow.size() > 0) {
            C10767d.m36495e(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(shutdownNow.size()));
        }
        this.f25318c = a;
        return true;
    }

    /* renamed from: b */
    public synchronized List<Integer> mo32828b() {
        ArrayList arrayList;
        m29303c();
        arrayList = new ArrayList();
        for (int i = 0; i < this.f25316a.size(); i++) {
            arrayList.add(Integer.valueOf(this.f25316a.get(this.f25316a.keyAt(i)).mo32818b()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo32826a(int i) {
        m29303c();
        synchronized (this) {
            C8907i iVar = this.f25316a.get(i);
            if (iVar != null) {
                iVar.mo32817a();
                boolean remove = this.f25317b.remove(iVar);
                if (C10767d.f28826a) {
                    C10767d.m36490a(this, "successful cancel %d %B", Integer.valueOf(i), Boolean.valueOf(remove));
                }
            }
            this.f25316a.remove(i);
        }
    }

    /* renamed from: c */
    private synchronized void m29303c() {
        SparseArray<C8907i> sparseArray = new SparseArray<>();
        for (int i = 0; i < this.f25316a.size(); i++) {
            int keyAt = this.f25316a.keyAt(i);
            C8907i iVar = this.f25316a.get(keyAt);
            if (iVar.mo32821e()) {
                sparseArray.put(keyAt, iVar);
            }
        }
        this.f25316a = sparseArray;
    }

    /* renamed from: a */
    public synchronized int mo32825a() {
        m29303c();
        return this.f25316a.size();
    }
}
