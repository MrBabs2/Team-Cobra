package com.bumptech.glide.p166r.p167l;

/* renamed from: com.bumptech.glide.r.l.c */
/* compiled from: StateVerifier */
public abstract class C6327c {
    /* renamed from: b */
    public static C6327c m13024b() {
        return new C6329b();
    }

    /* renamed from: a */
    public abstract void mo20774a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo20775a(boolean z);

    /* renamed from: com.bumptech.glide.r.l.c$b */
    /* compiled from: StateVerifier */
    private static class C6329b extends C6327c {

        /* renamed from: a */
        private volatile boolean f11577a;

        C6329b() {
            super();
        }

        /* renamed from: a */
        public void mo20774a() {
            if (this.f11577a) {
                throw new IllegalStateException("Already released");
            }
        }

        /* renamed from: a */
        public void mo20775a(boolean z) {
            this.f11577a = z;
        }
    }

    private C6327c() {
    }
}
