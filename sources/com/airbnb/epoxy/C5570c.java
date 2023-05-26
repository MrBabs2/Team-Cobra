package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.C0688f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.airbnb.epoxy.c */
/* compiled from: AsyncEpoxyDiffer */
class C5570c {

    /* renamed from: a */
    private final Executor f9827a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5575e f9828b;

    /* renamed from: c */
    private final C0688f.C0692d<C5631s<?>> f9829c;

    /* renamed from: d */
    private final C5574d f9830d = new C5574d((C5571a) null);

    /* renamed from: e */
    private volatile List<? extends C5631s<?>> f9831e;

    /* renamed from: f */
    private volatile List<? extends C5631s<?>> f9832f = Collections.emptyList();

    /* renamed from: com.airbnb.epoxy.c$a */
    /* compiled from: AsyncEpoxyDiffer */
    class C5571a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5573c f9833f;

        /* renamed from: g */
        final /* synthetic */ int f9834g;

        /* renamed from: h */
        final /* synthetic */ List f9835h;

        /* renamed from: i */
        final /* synthetic */ List f9836i;

        C5571a(C5573c cVar, int i, List list, List list2) {
            this.f9833f = cVar;
            this.f9834g = i;
            this.f9835h = list;
            this.f9836i = list2;
        }

        public void run() {
            C0688f.C0691c a = C0688f.m3266a(this.f9833f);
            C5570c cVar = C5570c.this;
            int i = this.f9834g;
            List list = this.f9835h;
            cVar.m10543a(i, (List<? extends C5631s<?>>) list, C5601k.m10636a(this.f9836i, list, a));
        }
    }

    /* renamed from: com.airbnb.epoxy.c$b */
    /* compiled from: AsyncEpoxyDiffer */
    class C5572b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ List f9838f;

        /* renamed from: g */
        final /* synthetic */ int f9839g;

        /* renamed from: h */
        final /* synthetic */ C5601k f9840h;

        C5572b(List list, int i, C5601k kVar) {
            this.f9838f = list;
            this.f9839g = i;
            this.f9840h = kVar;
        }

        public void run() {
            boolean a = C5570c.this.m10546a(this.f9838f, this.f9839g);
            if (this.f9840h != null && a) {
                C5570c.this.f9828b.mo19126a(this.f9840h);
            }
        }
    }

    /* renamed from: com.airbnb.epoxy.c$c */
    /* compiled from: AsyncEpoxyDiffer */
    private static class C5573c extends C0688f.C0690b {

        /* renamed from: a */
        final List<? extends C5631s<?>> f9842a;

        /* renamed from: b */
        final List<? extends C5631s<?>> f9843b;

        /* renamed from: c */
        private final C0688f.C0692d<C5631s<?>> f9844c;

        C5573c(List<? extends C5631s<?>> list, List<? extends C5631s<?>> list2, C0688f.C0692d<C5631s<?>> dVar) {
            this.f9842a = list;
            this.f9843b = list2;
            this.f9844c = dVar;
        }

        public boolean areContentsTheSame(int i, int i2) {
            return this.f9844c.mo4204a(this.f9842a.get(i), this.f9843b.get(i2));
        }

        public boolean areItemsTheSame(int i, int i2) {
            return this.f9844c.mo4205b(this.f9842a.get(i), this.f9843b.get(i2));
        }

        public Object getChangePayload(int i, int i2) {
            return this.f9844c.mo4206c(this.f9842a.get(i), this.f9843b.get(i2));
        }

        public int getNewListSize() {
            return this.f9843b.size();
        }

        public int getOldListSize() {
            return this.f9842a.size();
        }
    }

    /* renamed from: com.airbnb.epoxy.c$d */
    /* compiled from: AsyncEpoxyDiffer */
    private static class C5574d {

        /* renamed from: a */
        private volatile int f9845a;

        /* renamed from: b */
        private volatile int f9846b;

        private C5574d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo19122a() {
            boolean b;
            b = mo19124b();
            this.f9846b = this.f9845a;
            return b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo19124b() {
            return this.f9845a > this.f9846b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized int mo19125c() {
            int i;
            i = this.f9845a + 1;
            this.f9845a = i;
            return i;
        }

        /* synthetic */ C5574d(C5571a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo19123a(int i) {
            boolean z;
            z = this.f9845a == i && i > this.f9846b;
            if (z) {
                this.f9846b = i;
            }
            return z;
        }
    }

    /* renamed from: com.airbnb.epoxy.c$e */
    /* compiled from: AsyncEpoxyDiffer */
    interface C5575e {
        /* renamed from: a */
        void mo19126a(C5601k kVar);
    }

    C5570c(Handler handler, C5575e eVar, C0688f.C0692d<C5631s<?>> dVar) {
        this.f9827a = new C5638w(handler);
        this.f9828b = eVar;
        this.f9829c = dVar;
    }

    /* renamed from: b */
    public List<? extends C5631s<?>> mo19117b() {
        return this.f9832f;
    }

    /* renamed from: c */
    public boolean mo19119c() {
        return this.f9830d.mo19124b();
    }

    /* renamed from: b */
    public void mo19118b(List<? extends C5631s<?>> list) {
        int c;
        List<? extends C5631s<?>> list2;
        synchronized (this) {
            c = this.f9830d.mo19125c();
            list2 = this.f9831e;
        }
        if (list == list2) {
            m10543a(c, list, C5601k.m10638c(list2));
        } else if (list == null || list.isEmpty()) {
            m10543a(c, (List<? extends C5631s<?>>) null, (list2 == null || list2.isEmpty()) ? null : C5601k.m10635a(list2));
        } else if (list2 == null || list2.isEmpty()) {
            m10543a(c, list, C5601k.m10637b(list));
        } else {
            this.f9827a.execute(new C5571a(new C5573c(list2, list, this.f9829c), c, list, list2));
        }
    }

    /* renamed from: a */
    public boolean mo19115a() {
        return this.f9830d.mo19122a();
    }

    /* renamed from: a */
    public synchronized boolean mo19116a(List<C5631s<?>> list) {
        boolean a;
        a = mo19115a();
        m10546a(list, this.f9830d.mo19125c());
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10543a(int i, List<? extends C5631s<?>> list, C5601k kVar) {
        C5569b0.f9826h.execute(new C5572b(list, i, kVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized boolean m10546a(List<? extends C5631s<?>> list, int i) {
        if (!this.f9830d.mo19123a(i)) {
            return false;
        }
        this.f9831e = list;
        if (list == null) {
            this.f9832f = Collections.emptyList();
        } else {
            this.f9832f = Collections.unmodifiableList(list);
        }
        return true;
    }
}
