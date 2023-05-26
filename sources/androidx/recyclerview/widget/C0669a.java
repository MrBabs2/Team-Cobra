package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0709m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p050l.p075h.p083k.C5005e;
import p050l.p075h.p083k.C5006f;

/* renamed from: androidx.recyclerview.widget.a */
/* compiled from: AdapterHelper */
class C0669a implements C0709m.C0710a {

    /* renamed from: a */
    private C5005e<C0671b> f2559a;

    /* renamed from: b */
    final ArrayList<C0671b> f2560b;

    /* renamed from: c */
    final ArrayList<C0671b> f2561c;

    /* renamed from: d */
    final C0670a f2562d;

    /* renamed from: e */
    Runnable f2563e;

    /* renamed from: f */
    final boolean f2564f;

    /* renamed from: g */
    final C0709m f2565g;

    /* renamed from: h */
    private int f2566h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* compiled from: AdapterHelper */
    interface C0670a {
        /* renamed from: a */
        RecyclerView.C0629c0 mo3759a(int i);

        /* renamed from: a */
        void mo3760a(int i, int i2);

        /* renamed from: a */
        void mo3761a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo3762a(C0671b bVar);

        /* renamed from: b */
        void mo3763b(int i, int i2);

        /* renamed from: b */
        void mo3764b(C0671b bVar);

        /* renamed from: c */
        void mo3765c(int i, int i2);

        /* renamed from: d */
        void mo3767d(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* compiled from: AdapterHelper */
    static class C0671b {

        /* renamed from: a */
        int f2567a;

        /* renamed from: b */
        int f2568b;

        /* renamed from: c */
        Object f2569c;

        /* renamed from: d */
        int f2570d;

        C0671b(int i, int i2, int i3, Object obj) {
            this.f2567a = i;
            this.f2568b = i2;
            this.f2570d = i3;
            this.f2569c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo4139a() {
            int i = this.f2567a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0671b.class != obj.getClass()) {
                return false;
            }
            C0671b bVar = (C0671b) obj;
            int i = this.f2567a;
            if (i != bVar.f2567a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2570d - this.f2568b) == 1 && this.f2570d == bVar.f2568b && this.f2568b == bVar.f2570d) {
                return true;
            }
            if (this.f2570d != bVar.f2570d || this.f2568b != bVar.f2568b) {
                return false;
            }
            Object obj2 = this.f2569c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f2569c)) {
                    return false;
                }
            } else if (bVar.f2569c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2567a * 31) + this.f2568b) * 31) + this.f2570d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo4139a() + ",s:" + this.f2568b + "c:" + this.f2570d + ",p:" + this.f2569c + "]";
        }
    }

    C0669a(C0670a aVar) {
        this(aVar, false);
    }

    /* renamed from: b */
    private void m3183b(C0671b bVar) {
        m3190g(bVar);
    }

    /* renamed from: c */
    private void m3184c(C0671b bVar) {
        m3190g(bVar);
    }

    /* renamed from: d */
    private void m3186d(C0671b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f2568b;
        int i2 = bVar.f2570d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f2562d.mo3759a(i3) != null || m3187d(i3)) {
                if (c2 == 0) {
                    m3189f(mo4123a(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m3190g(mo4123a(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f2570d) {
            mo4125a(bVar);
            bVar = mo4123a(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m3189f(bVar);
        } else {
            m3190g(bVar);
        }
    }

    /* renamed from: g */
    private void m3190g(C0671b bVar) {
        this.f2561c.add(bVar);
        int i = bVar.f2567a;
        if (i == 1) {
            this.f2562d.mo3765c(bVar.f2568b, bVar.f2570d);
        } else if (i == 2) {
            this.f2562d.mo3763b(bVar.f2568b, bVar.f2570d);
        } else if (i == 4) {
            this.f2562d.mo3761a(bVar.f2568b, bVar.f2570d, bVar.f2569c);
        } else if (i == 8) {
            this.f2562d.mo3760a(bVar.f2568b, bVar.f2570d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4124a() {
        int size = this.f2561c.size();
        for (int i = 0; i < size; i++) {
            this.f2562d.mo3764b(this.f2561c.get(i));
        }
        mo4127a((List<C0671b>) this.f2561c);
        this.f2566h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4137e() {
        this.f2565g.mo4246a(this.f2560b);
        int size = this.f2560b.size();
        for (int i = 0; i < size; i++) {
            C0671b bVar = this.f2560b.get(i);
            int i2 = bVar.f2567a;
            if (i2 == 1) {
                m3183b(bVar);
            } else if (i2 == 2) {
                m3186d(bVar);
            } else if (i2 == 4) {
                m3188e(bVar);
            } else if (i2 == 8) {
                m3184c(bVar);
            }
            Runnable runnable = this.f2563e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2560b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4138f() {
        mo4127a((List<C0671b>) this.f2560b);
        mo4127a((List<C0671b>) this.f2561c);
        this.f2566h = 0;
    }

    C0669a(C0670a aVar, boolean z) {
        this.f2559a = new C5006f(30);
        this.f2560b = new ArrayList<>();
        this.f2561c = new ArrayList<>();
        this.f2566h = 0;
        this.f2562d = aVar;
        this.f2564f = z;
        this.f2565g = new C0709m(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4130b(int i) {
        return mo4122a(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4133c() {
        return this.f2560b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4132b(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f2560b.add(mo4123a(1, i, i2, (Object) null));
        this.f2566h |= 1;
        if (this.f2560b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4134c(int i) {
        return (i & this.f2566h) != 0;
    }

    /* renamed from: f */
    private void m3189f(C0671b bVar) {
        int i;
        int i2 = bVar.f2567a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m3185d(bVar.f2568b, i2);
        int i3 = bVar.f2568b;
        int i4 = bVar.f2567a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f2570d; i6++) {
            int d2 = m3185d(bVar.f2568b + (i * i6), bVar.f2567a);
            int i7 = bVar.f2567a;
            if (i7 == 2 ? d2 == d : i7 == 4 && d2 == d + 1) {
                i5++;
            } else {
                C0671b a = mo4123a(bVar.f2567a, d, i5, bVar.f2569c);
                mo4126a(a, i3);
                mo4125a(a);
                if (bVar.f2567a == 4) {
                    i3 += i5;
                }
                d = d2;
                i5 = 1;
            }
        }
        Object obj = bVar.f2569c;
        mo4125a(bVar);
        if (i5 > 0) {
            C0671b a2 = mo4123a(bVar.f2567a, d, i5, obj);
            mo4126a(a2, i3);
            mo4125a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4135c(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f2560b.add(mo4123a(2, i, i2, (Object) null));
        this.f2566h |= 2;
        if (this.f2560b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4126a(C0671b bVar, int i) {
        this.f2562d.mo3762a(bVar);
        int i2 = bVar.f2567a;
        if (i2 == 2) {
            this.f2562d.mo3767d(i, bVar.f2570d);
        } else if (i2 == 4) {
            this.f2562d.mo3761a(i, bVar.f2570d, bVar.f2569c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4131b() {
        mo4124a();
        int size = this.f2560b.size();
        for (int i = 0; i < size; i++) {
            C0671b bVar = this.f2560b.get(i);
            int i2 = bVar.f2567a;
            if (i2 == 1) {
                this.f2562d.mo3764b(bVar);
                this.f2562d.mo3765c(bVar.f2568b, bVar.f2570d);
            } else if (i2 == 2) {
                this.f2562d.mo3764b(bVar);
                this.f2562d.mo3767d(bVar.f2568b, bVar.f2570d);
            } else if (i2 == 4) {
                this.f2562d.mo3764b(bVar);
                this.f2562d.mo3761a(bVar.f2568b, bVar.f2570d, bVar.f2569c);
            } else if (i2 == 8) {
                this.f2562d.mo3764b(bVar);
                this.f2562d.mo3760a(bVar.f2568b, bVar.f2570d);
            }
            Runnable runnable = this.f2563e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo4127a((List<C0671b>) this.f2560b);
        this.f2566h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4122a(int i, int i2) {
        int size = this.f2561c.size();
        while (i2 < size) {
            C0671b bVar = this.f2561c.get(i2);
            int i3 = bVar.f2567a;
            if (i3 == 8) {
                int i4 = bVar.f2568b;
                if (i4 == i) {
                    i = bVar.f2570d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2570d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2568b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f2570d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f2570d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: e */
    private void m3188e(C0671b bVar) {
        int i = bVar.f2568b;
        int i2 = bVar.f2570d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f2562d.mo3759a(i) != null || m3187d(i)) {
                if (c == 0) {
                    m3189f(mo4123a(4, i3, i4, bVar.f2569c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m3190g(mo4123a(4, i3, i4, bVar.f2569c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f2570d) {
            Object obj = bVar.f2569c;
            mo4125a(bVar);
            bVar = mo4123a(4, i3, i4, obj);
        }
        if (c == 0) {
            m3189f(bVar);
        } else {
            m3190g(bVar);
        }
    }

    /* renamed from: d */
    private int m3185d(int i, int i2) {
        for (int size = this.f2561c.size() - 1; size >= 0; size--) {
            C0671b bVar = this.f2561c.get(size);
            int i3 = bVar.f2567a;
            if (i3 == 8) {
                int i4 = bVar.f2568b;
                int i5 = bVar.f2570d;
                if (i4 >= i5) {
                    int i6 = i5;
                    i5 = i4;
                    i4 = i6;
                }
                if (i < i4 || i > i5) {
                    int i7 = bVar.f2568b;
                    if (i < i7) {
                        if (i2 == 1) {
                            bVar.f2568b = i7 + 1;
                            bVar.f2570d++;
                        } else if (i2 == 2) {
                            bVar.f2568b = i7 - 1;
                            bVar.f2570d--;
                        }
                    }
                } else {
                    int i8 = bVar.f2568b;
                    if (i4 == i8) {
                        if (i2 == 1) {
                            bVar.f2570d++;
                        } else if (i2 == 2) {
                            bVar.f2570d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.f2568b = i8 + 1;
                        } else if (i2 == 2) {
                            bVar.f2568b = i8 - 1;
                        }
                        i--;
                    }
                }
            } else {
                int i9 = bVar.f2568b;
                if (i9 <= i) {
                    if (i3 == 1) {
                        i -= bVar.f2570d;
                    } else if (i3 == 2) {
                        i += bVar.f2570d;
                    }
                } else if (i2 == 1) {
                    bVar.f2568b = i9 + 1;
                } else if (i2 == 2) {
                    bVar.f2568b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f2561c.size() - 1; size2 >= 0; size2--) {
            C0671b bVar2 = this.f2561c.get(size2);
            if (bVar2.f2567a == 8) {
                int i10 = bVar2.f2570d;
                if (i10 == bVar2.f2568b || i10 < 0) {
                    this.f2561c.remove(size2);
                    mo4125a(bVar2);
                }
            } else if (bVar2.f2570d <= 0) {
                this.f2561c.remove(size2);
                mo4125a(bVar2);
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4129a(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f2560b.add(mo4123a(4, i, i2, obj));
        this.f2566h |= 4;
        if (this.f2560b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4128a(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f2560b.add(mo4123a(8, i, i2, (Object) null));
            this.f2566h |= 8;
            if (this.f2560b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: a */
    public int mo4121a(int i) {
        int size = this.f2560b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0671b bVar = this.f2560b.get(i2);
            int i3 = bVar.f2567a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2568b;
                    if (i4 <= i) {
                        int i5 = bVar.f2570d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2568b;
                    if (i6 == i) {
                        i = bVar.f2570d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f2570d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2568b <= i) {
                i += bVar.f2570d;
            }
        }
        return i;
    }

    /* renamed from: a */
    public C0671b mo4123a(int i, int i2, int i3, Object obj) {
        C0671b a = this.f2559a.mo17456a();
        if (a == null) {
            return new C0671b(i, i2, i3, obj);
        }
        a.f2567a = i;
        a.f2568b = i2;
        a.f2570d = i3;
        a.f2569c = obj;
        return a;
    }

    /* renamed from: d */
    private boolean m3187d(int i) {
        int size = this.f2561c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0671b bVar = this.f2561c.get(i2);
            int i3 = bVar.f2567a;
            if (i3 == 8) {
                if (mo4122a(bVar.f2570d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2568b;
                int i5 = bVar.f2570d + i4;
                while (i4 < i5) {
                    if (mo4122a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo4125a(C0671b bVar) {
        if (!this.f2564f) {
            bVar.f2569c = null;
            this.f2559a.mo17457a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4127a(List<C0671b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4125a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4136d() {
        return !this.f2561c.isEmpty() && !this.f2560b.isEmpty();
    }
}
