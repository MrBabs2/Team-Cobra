package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.s */
/* compiled from: ViewBoundsCheck */
class C0721s {

    /* renamed from: a */
    final C0723b f2712a;

    /* renamed from: b */
    C0722a f2713b = new C0722a();

    /* renamed from: androidx.recyclerview.widget.s$b */
    /* compiled from: ViewBoundsCheck */
    interface C0723b {
        /* renamed from: a */
        int mo3952a();

        /* renamed from: a */
        int mo3953a(View view);

        /* renamed from: a */
        View mo3954a(int i);

        /* renamed from: b */
        int mo3955b();

        /* renamed from: b */
        int mo3956b(View view);
    }

    C0721s(C0723b bVar) {
        this.f2712a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4297a(int i, int i2, int i3, int i4) {
        int a = this.f2712a.mo3952a();
        int b = this.f2712a.mo3955b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f2712a.mo3954a(i);
            this.f2713b.mo4301a(a, b, this.f2712a.mo3953a(a2), this.f2712a.mo3956b(a2));
            if (i3 != 0) {
                this.f2713b.mo4303b();
                this.f2713b.mo4300a(i3);
                if (this.f2713b.mo4302a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f2713b.mo4303b();
                this.f2713b.mo4300a(i4);
                if (this.f2713b.mo4302a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: androidx.recyclerview.widget.s$a */
    /* compiled from: ViewBoundsCheck */
    static class C0722a {

        /* renamed from: a */
        int f2714a = 0;

        /* renamed from: b */
        int f2715b;

        /* renamed from: c */
        int f2716c;

        /* renamed from: d */
        int f2717d;

        /* renamed from: e */
        int f2718e;

        C0722a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4299a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4301a(int i, int i2, int i3, int i4) {
            this.f2715b = i;
            this.f2716c = i2;
            this.f2717d = i3;
            this.f2718e = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4303b() {
            this.f2714a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4300a(int i) {
            this.f2714a = i | this.f2714a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4302a() {
            int i = this.f2714a;
            if ((i & 7) != 0 && (i & (mo4299a(this.f2717d, this.f2715b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f2714a;
            if ((i2 & 112) != 0 && (i2 & (mo4299a(this.f2717d, this.f2716c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2714a;
            if ((i3 & 1792) != 0 && (i3 & (mo4299a(this.f2718e, this.f2715b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2714a;
            if ((i4 & 28672) == 0 || (i4 & (mo4299a(this.f2718e, this.f2716c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4298a(View view, int i) {
        this.f2713b.mo4301a(this.f2712a.mo3952a(), this.f2712a.mo3955b(), this.f2712a.mo3953a(view), this.f2712a.mo3956b(view));
        if (i == 0) {
            return false;
        }
        this.f2713b.mo4303b();
        this.f2713b.mo4300a(i);
        return this.f2713b.mo4302a();
    }
}
