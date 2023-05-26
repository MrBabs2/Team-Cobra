package androidx.work;

import android.os.Build;

/* renamed from: androidx.work.c */
/* compiled from: Constraints */
public final class C0825c {

    /* renamed from: i */
    public static final C0825c f2961i = new C0826a().mo4704a();

    /* renamed from: a */
    private C0961j f2962a = C0961j.NOT_REQUIRED;

    /* renamed from: b */
    private boolean f2963b;

    /* renamed from: c */
    private boolean f2964c;

    /* renamed from: d */
    private boolean f2965d;

    /* renamed from: e */
    private boolean f2966e;

    /* renamed from: f */
    private long f2967f = -1;

    /* renamed from: g */
    private long f2968g = -1;

    /* renamed from: h */
    private C0827d f2969h = new C0827d();

    /* renamed from: androidx.work.c$a */
    /* compiled from: Constraints */
    public static final class C0826a {

        /* renamed from: a */
        boolean f2970a = false;

        /* renamed from: b */
        boolean f2971b = false;

        /* renamed from: c */
        C0961j f2972c = C0961j.NOT_REQUIRED;

        /* renamed from: d */
        boolean f2973d = false;

        /* renamed from: e */
        boolean f2974e = false;

        /* renamed from: f */
        long f2975f = -1;

        /* renamed from: g */
        long f2976g = -1;

        /* renamed from: h */
        C0827d f2977h = new C0827d();

        /* renamed from: a */
        public C0826a mo4703a(C0961j jVar) {
            this.f2972c = jVar;
            return this;
        }

        /* renamed from: a */
        public C0825c mo4704a() {
            return new C0825c(this);
        }
    }

    public C0825c() {
    }

    /* renamed from: a */
    public void mo4687a(C0961j jVar) {
        this.f2962a = jVar;
    }

    /* renamed from: b */
    public C0961j mo4689b() {
        return this.f2962a;
    }

    /* renamed from: c */
    public void mo4693c(boolean z) {
        this.f2964c = z;
    }

    /* renamed from: d */
    public void mo4695d(boolean z) {
        this.f2966e = z;
    }

    /* renamed from: e */
    public boolean mo4696e() {
        return this.f2969h.mo4707b() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0825c.class != obj.getClass()) {
            return false;
        }
        C0825c cVar = (C0825c) obj;
        if (this.f2963b == cVar.f2963b && this.f2964c == cVar.f2964c && this.f2965d == cVar.f2965d && this.f2966e == cVar.f2966e && this.f2967f == cVar.f2967f && this.f2968g == cVar.f2968g && this.f2962a == cVar.f2962a) {
            return this.f2969h.equals(cVar.f2969h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo4698f() {
        return this.f2965d;
    }

    /* renamed from: g */
    public boolean mo4699g() {
        return this.f2963b;
    }

    /* renamed from: h */
    public boolean mo4700h() {
        return this.f2964c;
    }

    public int hashCode() {
        long j = this.f2967f;
        long j2 = this.f2968g;
        return (((((((((((((this.f2962a.hashCode() * 31) + (this.f2963b ? 1 : 0)) * 31) + (this.f2964c ? 1 : 0)) * 31) + (this.f2965d ? 1 : 0)) * 31) + (this.f2966e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f2969h.hashCode();
    }

    /* renamed from: i */
    public boolean mo4702i() {
        return this.f2966e;
    }

    /* renamed from: a */
    public void mo4688a(boolean z) {
        this.f2965d = z;
    }

    /* renamed from: b */
    public void mo4691b(boolean z) {
        this.f2963b = z;
    }

    /* renamed from: c */
    public long mo4692c() {
        return this.f2967f;
    }

    /* renamed from: d */
    public long mo4694d() {
        return this.f2968g;
    }

    /* renamed from: a */
    public void mo4685a(long j) {
        this.f2967f = j;
    }

    /* renamed from: b */
    public void mo4690b(long j) {
        this.f2968g = j;
    }

    /* renamed from: a */
    public void mo4686a(C0827d dVar) {
        this.f2969h = dVar;
    }

    /* renamed from: a */
    public C0827d mo4684a() {
        return this.f2969h;
    }

    C0825c(C0826a aVar) {
        this.f2963b = aVar.f2970a;
        this.f2964c = Build.VERSION.SDK_INT >= 23 && aVar.f2971b;
        this.f2962a = aVar.f2972c;
        this.f2965d = aVar.f2973d;
        this.f2966e = aVar.f2974e;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2969h = aVar.f2977h;
            this.f2967f = aVar.f2975f;
            this.f2968g = aVar.f2976g;
        }
    }

    public C0825c(C0825c cVar) {
        this.f2963b = cVar.f2963b;
        this.f2964c = cVar.f2964c;
        this.f2962a = cVar.f2962a;
        this.f2965d = cVar.f2965d;
        this.f2966e = cVar.f2966e;
        this.f2969h = cVar.f2969h;
    }
}
