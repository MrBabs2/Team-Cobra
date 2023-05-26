package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p050l.p066e.C4873d;
import p050l.p066e.C4881g;
import p050l.p075h.p083k.C5005e;
import p050l.p075h.p083k.C5006f;

/* renamed from: androidx.recyclerview.widget.t */
/* compiled from: ViewInfoStore */
class C0724t {

    /* renamed from: a */
    final C4881g<RecyclerView.C0629c0, C0725a> f2719a = new C4881g<>();

    /* renamed from: b */
    final C4873d<RecyclerView.C0629c0> f2720b = new C4873d<>();

    /* renamed from: androidx.recyclerview.widget.t$b */
    /* compiled from: ViewInfoStore */
    interface C0726b {
        /* renamed from: a */
        void mo3744a(RecyclerView.C0629c0 c0Var);

        /* renamed from: a */
        void mo3745a(RecyclerView.C0629c0 c0Var, RecyclerView.C0638l.C0641c cVar, RecyclerView.C0638l.C0641c cVar2);

        /* renamed from: b */
        void mo3746b(RecyclerView.C0629c0 c0Var, RecyclerView.C0638l.C0641c cVar, RecyclerView.C0638l.C0641c cVar2);

        /* renamed from: c */
        void mo3747c(RecyclerView.C0629c0 c0Var, RecyclerView.C0638l.C0641c cVar, RecyclerView.C0638l.C0641c cVar2);
    }

    C0724t() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4305a() {
        this.f2719a.clear();
        this.f2720b.mo16940b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4312b(RecyclerView.C0629c0 c0Var) {
        C0725a aVar = this.f2719a.get(c0Var);
        if (aVar == null || (aVar.f2722a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4313c(RecyclerView.C0629c0 c0Var, RecyclerView.C0638l.C0641c cVar) {
        C0725a aVar = this.f2719a.get(c0Var);
        if (aVar == null) {
            aVar = C0725a.m3434b();
            this.f2719a.put(c0Var, aVar);
        }
        aVar.f2723b = cVar;
        aVar.f2722a |= 4;
    }

    /* renamed from: d */
    public void mo4315d(RecyclerView.C0629c0 c0Var) {
        mo4318g(c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public RecyclerView.C0638l.C0641c mo4316e(RecyclerView.C0629c0 c0Var) {
        return m3415a(c0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public RecyclerView.C0638l.C0641c mo4317f(RecyclerView.C0629c0 c0Var) {
        return m3415a(c0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4318g(RecyclerView.C0629c0 c0Var) {
        C0725a aVar = this.f2719a.get(c0Var);
        if (aVar != null) {
            aVar.f2722a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4319h(RecyclerView.C0629c0 c0Var) {
        int c = this.f2720b.mo16942c() - 1;
        while (true) {
            if (c < 0) {
                break;
            } else if (c0Var == this.f2720b.mo16943c(c)) {
                this.f2720b.mo16941b(c);
                break;
            } else {
                c--;
            }
        }
        C0725a remove = this.f2719a.remove(c0Var);
        if (remove != null) {
            C0725a.m3433a(remove);
        }
    }

    /* renamed from: a */
    private RecyclerView.C0638l.C0641c m3415a(RecyclerView.C0629c0 c0Var, int i) {
        C0725a d;
        RecyclerView.C0638l.C0641c cVar;
        int b = this.f2719a.mo17021b((Object) c0Var);
        if (b >= 0 && (d = this.f2719a.mo17028d(b)) != null) {
            int i2 = d.f2722a;
            if ((i2 & i) != 0) {
                d.f2722a = (i ^ -1) & i2;
                if (i == 4) {
                    cVar = d.f2723b;
                } else if (i == 8) {
                    cVar = d.f2724c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((d.f2722a & 12) == 0) {
                    this.f2719a.mo17024c(b);
                    C0725a.m3433a(d);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4311b(RecyclerView.C0629c0 c0Var, RecyclerView.C0638l.C0641c cVar) {
        C0725a aVar = this.f2719a.get(c0Var);
        if (aVar == null) {
            aVar = C0725a.m3434b();
            this.f2719a.put(c0Var, aVar);
        }
        aVar.f2724c = cVar;
        aVar.f2722a |= 8;
    }

    /* renamed from: androidx.recyclerview.widget.t$a */
    /* compiled from: ViewInfoStore */
    static class C0725a {

        /* renamed from: d */
        static C5005e<C0725a> f2721d = new C5006f(20);

        /* renamed from: a */
        int f2722a;

        /* renamed from: b */
        RecyclerView.C0638l.C0641c f2723b;

        /* renamed from: c */
        RecyclerView.C0638l.C0641c f2724c;

        private C0725a() {
        }

        /* renamed from: a */
        static void m3433a(C0725a aVar) {
            aVar.f2722a = 0;
            aVar.f2723b = null;
            aVar.f2724c = null;
            f2721d.mo17457a(aVar);
        }

        /* renamed from: b */
        static C0725a m3434b() {
            C0725a a = f2721d.mo17456a();
            return a == null ? new C0725a() : a;
        }

        /* renamed from: a */
        static void m3432a() {
            do {
            } while (f2721d.mo17456a() != null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4314c(RecyclerView.C0629c0 c0Var) {
        C0725a aVar = this.f2719a.get(c0Var);
        return (aVar == null || (aVar.f2722a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4310b() {
        C0725a.m3432a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4306a(long j, RecyclerView.C0629c0 c0Var) {
        this.f2720b.mo16945c(j, c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4308a(RecyclerView.C0629c0 c0Var, RecyclerView.C0638l.C0641c cVar) {
        C0725a aVar = this.f2719a.get(c0Var);
        if (aVar == null) {
            aVar = C0725a.m3434b();
            this.f2719a.put(c0Var, aVar);
        }
        aVar.f2722a |= 2;
        aVar.f2723b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RecyclerView.C0629c0 mo4304a(long j) {
        return this.f2720b.mo16936a(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4307a(RecyclerView.C0629c0 c0Var) {
        C0725a aVar = this.f2719a.get(c0Var);
        if (aVar == null) {
            aVar = C0725a.m3434b();
            this.f2719a.put(c0Var, aVar);
        }
        aVar.f2722a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4309a(C0726b bVar) {
        for (int size = this.f2719a.size() - 1; size >= 0; size--) {
            RecyclerView.C0629c0 b = this.f2719a.mo17022b(size);
            C0725a c = this.f2719a.mo17024c(size);
            int i = c.f2722a;
            if ((i & 3) == 3) {
                bVar.mo3744a(b);
            } else if ((i & 1) != 0) {
                RecyclerView.C0638l.C0641c cVar = c.f2723b;
                if (cVar == null) {
                    bVar.mo3744a(b);
                } else {
                    bVar.mo3746b(b, cVar, c.f2724c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo3745a(b, c.f2723b, c.f2724c);
            } else if ((i & 12) == 12) {
                bVar.mo3747c(b, c.f2723b, c.f2724c);
            } else if ((i & 4) != 0) {
                bVar.mo3746b(b, c.f2723b, (RecyclerView.C0638l.C0641c) null);
            } else if ((i & 8) != 0) {
                bVar.mo3745a(b, c.f2723b, c.f2724c);
            }
            C0725a.m3433a(c);
        }
    }
}
