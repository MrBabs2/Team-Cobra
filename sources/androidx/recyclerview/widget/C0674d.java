package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.d */
/* compiled from: ChildHelper */
class C0674d {

    /* renamed from: a */
    final C0676b f2577a;

    /* renamed from: b */
    final C0675a f2578b = new C0675a();

    /* renamed from: c */
    final List<View> f2579c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* compiled from: ChildHelper */
    interface C0676b {
        /* renamed from: a */
        int mo3748a();

        /* renamed from: a */
        View mo3749a(int i);

        /* renamed from: a */
        void mo3750a(View view);

        /* renamed from: a */
        void mo3751a(View view, int i);

        /* renamed from: a */
        void mo3752a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        int mo3753b(View view);

        /* renamed from: b */
        void mo3754b();

        /* renamed from: b */
        void mo3755b(int i);

        /* renamed from: c */
        RecyclerView.C0629c0 mo3756c(View view);

        /* renamed from: c */
        void mo3757c(int i);

        /* renamed from: d */
        void mo3758d(View view);
    }

    C0674d(C0676b bVar) {
        this.f2577a = bVar;
    }

    /* renamed from: f */
    private int m3227f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f2577a.mo3748a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f2578b.mo4169b(i2));
            if (b == 0) {
                while (this.f2578b.mo4170c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: g */
    private void m3228g(View view) {
        this.f2579c.add(view);
        this.f2577a.mo3750a(view);
    }

    /* renamed from: h */
    private boolean m3229h(View view) {
        if (!this.f2579c.remove(view)) {
            return false;
        }
        this.f2577a.mo3758d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4153a(View view, boolean z) {
        mo4152a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo4156b(int i) {
        int size = this.f2579c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2579c.get(i2);
            RecyclerView.C0629c0 c = this.f2577a.mo3756c(view);
            if (c.getLayoutPosition() == i && !c.isInvalid() && !c.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo4157c(int i) {
        return this.f2577a.mo3749a(m3227f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4161d(View view) {
        int b = this.f2577a.mo3753b(view);
        if (b >= 0) {
            if (this.f2578b.mo4171d(b)) {
                m3229h(view);
            }
            this.f2577a.mo3757c(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4162e(int i) {
        int f = m3227f(i);
        View a = this.f2577a.mo3749a(f);
        if (a != null) {
            if (this.f2578b.mo4171d(f)) {
                m3229h(a);
            }
            this.f2577a.mo3757c(f);
        }
    }

    public String toString() {
        return this.f2578b.toString() + ", hidden list:" + this.f2579c.size();
    }

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* compiled from: ChildHelper */
    static class C0675a {

        /* renamed from: a */
        long f2580a = 0;

        /* renamed from: b */
        C0675a f2581b;

        C0675a() {
        }

        /* renamed from: b */
        private void m3247b() {
            if (this.f2581b == null) {
                this.f2581b = new C0675a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4167a(int i) {
            if (i >= 64) {
                C0675a aVar = this.f2581b;
                if (aVar != null) {
                    aVar.mo4167a(i - 64);
                    return;
                }
                return;
            }
            this.f2580a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4170c(int i) {
            if (i < 64) {
                return (this.f2580a & (1 << i)) != 0;
            }
            m3247b();
            return this.f2581b.mo4170c(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4171d(int i) {
            if (i >= 64) {
                m3247b();
                return this.f2581b.mo4171d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f2580a & j) != 0;
            long j2 = this.f2580a & (j ^ -1);
            this.f2580a = j2;
            long j3 = j - 1;
            this.f2580a = (j2 & j3) | Long.rotateRight((j3 ^ -1) & j2, 1);
            C0675a aVar = this.f2581b;
            if (aVar != null) {
                if (aVar.mo4170c(0)) {
                    mo4172e(63);
                }
                this.f2581b.mo4171d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4172e(int i) {
            if (i >= 64) {
                m3247b();
                this.f2581b.mo4172e(i - 64);
                return;
            }
            this.f2580a |= 1 << i;
        }

        public String toString() {
            if (this.f2581b == null) {
                return Long.toBinaryString(this.f2580a);
            }
            return this.f2581b.toString() + "xx" + Long.toBinaryString(this.f2580a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4169b(int i) {
            C0675a aVar = this.f2581b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f2580a);
                }
                return Long.bitCount(this.f2580a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f2580a & ((1 << i) - 1));
            } else {
                return aVar.mo4169b(i - 64) + Long.bitCount(this.f2580a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4166a() {
            this.f2580a = 0;
            C0675a aVar = this.f2581b;
            if (aVar != null) {
                aVar.mo4166a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4168a(int i, boolean z) {
            if (i >= 64) {
                m3247b();
                this.f2581b.mo4168a(i - 64, z);
                return;
            }
            boolean z2 = (this.f2580a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f2580a;
            this.f2580a = ((j2 & (j ^ -1)) << 1) | (j2 & j);
            if (z) {
                mo4172e(i);
            } else {
                mo4167a(i);
            }
            if (z2 || this.f2581b != null) {
                m3247b();
                this.f2581b.mo4168a(0, z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4152a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f2577a.mo3748a();
        } else {
            i2 = m3227f(i);
        }
        this.f2578b.mo4168a(i2, z);
        if (z) {
            m3228g(view);
        }
        this.f2577a.mo3751a(view, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4158c() {
        this.f2578b.mo4166a();
        for (int size = this.f2579c.size() - 1; size >= 0; size--) {
            this.f2577a.mo3758d(this.f2579c.get(size));
            this.f2579c.remove(size);
        }
        this.f2577a.mo3754b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4164f(View view) {
        int b = this.f2577a.mo3753b(view);
        if (b < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f2578b.mo4170c(b)) {
            this.f2578b.mo4167a(b);
            m3229h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View mo4160d(int i) {
        return this.f2577a.mo3749a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo4163e(View view) {
        int b = this.f2577a.mo3753b(view);
        if (b == -1) {
            m3229h(view);
            return true;
        } else if (!this.f2578b.mo4170c(b)) {
            return false;
        } else {
            this.f2578b.mo4171d(b);
            m3229h(view);
            this.f2577a.mo3757c(b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4151a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f2577a.mo3748a();
        } else {
            i2 = m3227f(i);
        }
        this.f2578b.mo4168a(i2, z);
        if (z) {
            m3228g(view);
        }
        this.f2577a.mo3752a(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4154b() {
        return this.f2577a.mo3748a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4155b(View view) {
        int b = this.f2577a.mo3753b(view);
        if (b != -1 && !this.f2578b.mo4170c(b)) {
            return b - this.f2578b.mo4169b(b);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4159c(View view) {
        return this.f2579c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4148a() {
        return this.f2577a.mo3748a() - this.f2579c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4149a(int i) {
        int f = m3227f(i);
        this.f2578b.mo4171d(f);
        this.f2577a.mo3755b(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4150a(View view) {
        int b = this.f2577a.mo3753b(view);
        if (b >= 0) {
            this.f2578b.mo4172e(b);
            m3228g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }
}
