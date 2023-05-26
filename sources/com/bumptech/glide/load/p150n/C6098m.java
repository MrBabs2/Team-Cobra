package com.bumptech.glide.load.p150n;

import com.bumptech.glide.p166r.C6312g;
import com.bumptech.glide.p166r.C6316k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.n.m */
/* compiled from: ModelCache */
public class C6098m<A, B> {

    /* renamed from: a */
    private final C6312g<C6100b<A>, B> f11183a;

    /* renamed from: com.bumptech.glide.load.n.m$a */
    /* compiled from: ModelCache */
    class C6099a extends C6312g<C6100b<A>, B> {
        C6099a(C6098m mVar, long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo20108a(C6100b<A> bVar, B b) {
            bVar.mo20404a();
        }
    }

    public C6098m(long j) {
        this.f11183a = new C6099a(this, j);
    }

    /* renamed from: a */
    public B mo20401a(A a, int i, int i2) {
        C6100b a2 = C6100b.m12276a(a, i, i2);
        B a3 = this.f11183a.mo20756a(a2);
        a2.mo20404a();
        return a3;
    }

    /* renamed from: a */
    public void mo20402a(A a, int i, int i2, B b) {
        this.f11183a.mo20760b(C6100b.m12276a(a, i, i2), b);
    }

    /* renamed from: com.bumptech.glide.load.n.m$b */
    /* compiled from: ModelCache */
    static final class C6100b<A> {

        /* renamed from: d */
        private static final Queue<C6100b<?>> f11184d = C6316k.m12994a(0);

        /* renamed from: a */
        private int f11185a;

        /* renamed from: b */
        private int f11186b;

        /* renamed from: c */
        private A f11187c;

        private C6100b() {
        }

        /* renamed from: a */
        static <A> C6100b<A> m12276a(A a, int i, int i2) {
            C6100b<A> poll;
            synchronized (f11184d) {
                poll = f11184d.poll();
            }
            if (poll == null) {
                poll = new C6100b<>();
            }
            poll.m12277b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        private void m12277b(A a, int i, int i2) {
            this.f11187c = a;
            this.f11186b = i;
            this.f11185a = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6100b)) {
                return false;
            }
            C6100b bVar = (C6100b) obj;
            if (this.f11186b == bVar.f11186b && this.f11185a == bVar.f11185a && this.f11187c.equals(bVar.f11187c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f11185a * 31) + this.f11186b) * 31) + this.f11187c.hashCode();
        }

        /* renamed from: a */
        public void mo20404a() {
            synchronized (f11184d) {
                f11184d.offer(this);
            }
        }
    }
}
