package com.bumptech.glide.p162p.p164m;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5901a;

/* renamed from: com.bumptech.glide.p.m.a */
/* compiled from: DrawableCrossFadeFactory */
public class C6291a implements C6298e<Drawable> {

    /* renamed from: a */
    private final int f11536a;

    /* renamed from: b */
    private final boolean f11537b;

    /* renamed from: c */
    private C6293b f11538c;

    /* renamed from: com.bumptech.glide.p.m.a$a */
    /* compiled from: DrawableCrossFadeFactory */
    public static class C6292a {

        /* renamed from: a */
        private final int f11539a;

        /* renamed from: b */
        private boolean f11540b;

        public C6292a() {
            this(300);
        }

        /* renamed from: a */
        public C6291a mo20726a() {
            return new C6291a(this.f11539a, this.f11540b);
        }

        public C6292a(int i) {
            this.f11539a = i;
        }
    }

    protected C6291a(int i, boolean z) {
        this.f11536a = i;
        this.f11537b = z;
    }

    /* renamed from: a */
    public C6296d<Drawable> mo20725a(C5901a aVar, boolean z) {
        return aVar == C5901a.MEMORY_CACHE ? C6294c.m12935a() : m12930a();
    }

    /* renamed from: a */
    private C6296d<Drawable> m12930a() {
        if (this.f11538c == null) {
            this.f11538c = new C6293b(this.f11536a, this.f11537b);
        }
        return this.f11538c;
    }
}
