package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qu */
final class C7893qu implements C7747mw {

    /* renamed from: a */
    private final zzdnd f16676a;

    /* renamed from: b */
    private int f16677b;

    /* renamed from: c */
    private int f16678c;

    /* renamed from: d */
    private int f16679d = 0;

    private C7893qu(zzdnd zzdnd) {
        zzdod.m24036a(zzdnd, "input");
        zzdnd zzdnd2 = zzdnd;
        this.f16676a = zzdnd2;
        zzdnd2.f21493c = this;
    }

    /* renamed from: a */
    public static C7893qu m18003a(zzdnd zzdnd) {
        C7893qu quVar = zzdnd.f21493c;
        if (quVar != null) {
            return quVar;
        }
        return new C7893qu(zzdnd);
    }

    /* renamed from: d */
    private final <T> T m18010d(C7784nw<T> nwVar, zzdno zzdno) throws IOException {
        int i = this.f16678c;
        this.f16678c = ((this.f16677b >>> 3) << 3) | 4;
        try {
            T a = nwVar.mo25744a();
            nwVar.mo25745a(a, this, zzdno);
            nwVar.mo25749b(a);
            if (this.f16677b == this.f16678c) {
                return a;
            }
            throw zzdok.m24053g();
        } finally {
            this.f16678c = i;
        }
    }

    /* renamed from: b */
    public final long mo26261b() throws IOException {
        m18005a(0);
        return this.f16676a.mo26421e();
    }

    /* renamed from: c */
    public final boolean mo26266c() throws IOException {
        m18005a(0);
        return this.f16676a.mo26426j();
    }

    /* renamed from: e */
    public final long mo26269e() throws IOException {
        m18005a(0);
        return this.f16676a.mo26422f();
    }

    /* renamed from: f */
    public final long mo26271f() throws IOException {
        m18005a(1);
        return this.f16676a.mo26424h();
    }

    /* renamed from: g */
    public final String mo26273g() throws IOException {
        m18005a(2);
        return this.f16676a.mo26427k();
    }

    public final int getTag() {
        return this.f16677b;
    }

    /* renamed from: h */
    public final int mo26276h() throws IOException {
        int i = this.f16679d;
        if (i != 0) {
            this.f16677b = i;
            this.f16679d = 0;
        } else {
            this.f16677b = this.f16676a.mo26419d();
        }
        int i2 = this.f16677b;
        if (i2 == 0 || i2 == this.f16678c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: i */
    public final int mo26278i() throws IOException {
        m18005a(0);
        return this.f16676a.mo26423g();
    }

    /* renamed from: j */
    public final int mo26280j() throws IOException {
        m18005a(5);
        return this.f16676a.mo26425i();
    }

    /* renamed from: k */
    public final boolean mo26283k() throws IOException {
        int i;
        if (this.f16676a.mo26435s() || (i = this.f16677b) == this.f16678c) {
            return false;
        }
        return this.f16676a.mo26416b(i);
    }

    /* renamed from: l */
    public final zzdmr mo26284l() throws IOException {
        m18005a(2);
        return this.f16676a.mo26428l();
    }

    /* renamed from: m */
    public final int mo26286m() throws IOException {
        m18005a(0);
        return this.f16676a.mo26429m();
    }

    /* renamed from: n */
    public final String mo26288n() throws IOException {
        m18005a(2);
        return this.f16676a.mo26418c();
    }

    /* renamed from: o */
    public final int mo26290o() throws IOException {
        m18005a(0);
        return this.f16676a.mo26430n();
    }

    /* renamed from: p */
    public final int mo26292p() throws IOException {
        m18005a(5);
        return this.f16676a.mo26431o();
    }

    /* renamed from: q */
    public final long mo26294q() throws IOException {
        m18005a(1);
        return this.f16676a.mo26432p();
    }

    public final double readDouble() throws IOException {
        m18005a(1);
        return this.f16676a.mo26413a();
    }

    public final float readFloat() throws IOException {
        m18005a(5);
        return this.f16676a.mo26415b();
    }

    /* renamed from: a */
    private final void m18005a(int i) throws IOException {
        if ((this.f16677b & 7) != i) {
            throw zzdok.m24052f();
        }
    }

    /* renamed from: c */
    private final <T> T m18008c(C7784nw<T> nwVar, zzdno zzdno) throws IOException {
        int m = this.f16676a.mo26429m();
        zzdnd zzdnd = this.f16676a;
        if (zzdnd.f21491a < zzdnd.f21492b) {
            int c = zzdnd.mo26417c(m);
            T a = nwVar.mo25744a();
            this.f16676a.f21491a++;
            nwVar.mo25745a(a, this, zzdno);
            nwVar.mo25749b(a);
            this.f16676a.mo26414a(0);
            zzdnd zzdnd2 = this.f16676a;
            zzdnd2.f21491a--;
            zzdnd2.mo26420d(c);
            return a;
        }
        throw new zzdok("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: b */
    public final <T> T mo26262b(C7784nw<T> nwVar, zzdno zzdno) throws IOException {
        m18005a(3);
        return m18010d(nwVar, zzdno);
    }

    /* renamed from: e */
    public final void mo26270e(List<Float> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7410dv) {
            C7410dv dvVar = (C7410dv) list;
            int i = this.f16677b & 7;
            if (i == 2) {
                int m = this.f16676a.mo26429m();
                m18009c(m);
                int t = this.f16676a.mo26436t() + m;
                do {
                    dvVar.mo25839a(this.f16676a.mo26415b());
                } while (this.f16676a.mo26436t() < t);
            } else if (i == 5) {
                do {
                    dvVar.mo25839a(this.f16676a.mo26415b());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 2) {
                int m2 = this.f16676a.mo26429m();
                m18009c(m2);
                int t2 = this.f16676a.mo26436t() + m2;
                do {
                    list.add(Float.valueOf(this.f16676a.mo26415b()));
                } while (this.f16676a.mo26436t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f16676a.mo26415b()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: f */
    public final void mo26272f(List<zzdmr> list) throws IOException {
        int d;
        if ((this.f16677b & 7) == 2) {
            do {
                list.add(mo26284l());
                if (!this.f16676a.mo26435s()) {
                    d = this.f16676a.mo26419d();
                } else {
                    return;
                }
            } while (d == this.f16677b);
            this.f16679d = d;
            return;
        }
        throw zzdok.m24052f();
    }

    /* renamed from: g */
    public final void mo26274g(List<Double> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C8041uu) {
            C8041uu uuVar = (C8041uu) list;
            int i = this.f16677b & 7;
            if (i == 1) {
                do {
                    uuVar.mo26665a(this.f16676a.mo26413a());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int m = this.f16676a.mo26429m();
                m18007b(m);
                int t = this.f16676a.mo26436t() + m;
                do {
                    uuVar.mo26665a(this.f16676a.mo26413a());
                } while (this.f16676a.mo26436t() < t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f16676a.mo26413a()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int m2 = this.f16676a.mo26429m();
                m18007b(m2);
                int t2 = this.f16676a.mo26436t() + m2;
                do {
                    list.add(Double.valueOf(this.f16676a.mo26413a()));
                } while (this.f16676a.mo26436t() < t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: i */
    public final void mo26279i(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7857pv) {
            C7857pv pvVar = (C7857pv) list;
            int i = this.f16677b & 7;
            if (i == 0) {
                do {
                    pvVar.mo26438a(this.f16676a.mo26422f());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int t = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    pvVar.mo26438a(this.f16676a.mo26422f());
                } while (this.f16676a.mo26436t() < t);
                m18011d(t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f16676a.mo26422f()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int t2 = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    list.add(Long.valueOf(this.f16676a.mo26422f()));
                } while (this.f16676a.mo26436t() < t2);
                m18011d(t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: j */
    public final void mo26281j(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            int i = this.f16677b & 7;
            if (i == 0) {
                do {
                    hvVar.mo26051f(this.f16676a.mo26430n());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int t = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    hvVar.mo26051f(this.f16676a.mo26430n());
                } while (this.f16676a.mo26436t() < t);
                m18011d(t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26430n()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int t2 = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26430n()));
                } while (this.f16676a.mo26436t() < t2);
                m18011d(t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: k */
    public final void mo26282k(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7857pv) {
            C7857pv pvVar = (C7857pv) list;
            int i = this.f16677b & 7;
            if (i == 0) {
                do {
                    pvVar.mo26438a(this.f16676a.mo26421e());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int t = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    pvVar.mo26438a(this.f16676a.mo26421e());
                } while (this.f16676a.mo26436t() < t);
                m18011d(t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f16676a.mo26421e()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int t2 = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    list.add(Long.valueOf(this.f16676a.mo26421e()));
                } while (this.f16676a.mo26436t() < t2);
                m18011d(t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: l */
    public final void mo26285l(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            int i = this.f16677b & 7;
            if (i == 0) {
                do {
                    hvVar.mo26051f(this.f16676a.mo26429m());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int t = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    hvVar.mo26051f(this.f16676a.mo26429m());
                } while (this.f16676a.mo26436t() < t);
                m18011d(t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26429m()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int t2 = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26429m()));
                } while (this.f16676a.mo26436t() < t2);
                m18011d(t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: m */
    public final void mo26287m(List<String> list) throws IOException {
        m18006a(list, false);
    }

    /* renamed from: n */
    public final void mo26289n(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7857pv) {
            C7857pv pvVar = (C7857pv) list;
            int i = this.f16677b & 7;
            if (i == 1) {
                do {
                    pvVar.mo26438a(this.f16676a.mo26424h());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int m = this.f16676a.mo26429m();
                m18007b(m);
                int t = this.f16676a.mo26436t() + m;
                do {
                    pvVar.mo26438a(this.f16676a.mo26424h());
                } while (this.f16676a.mo26436t() < t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f16676a.mo26424h()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int m2 = this.f16676a.mo26429m();
                m18007b(m2);
                int t2 = this.f16676a.mo26436t() + m2;
                do {
                    list.add(Long.valueOf(this.f16676a.mo26424h()));
                } while (this.f16676a.mo26436t() < t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: o */
    public final void mo26291o(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7857pv) {
            C7857pv pvVar = (C7857pv) list;
            int i = this.f16677b & 7;
            if (i == 1) {
                do {
                    pvVar.mo26438a(this.f16676a.mo26432p());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int m = this.f16676a.mo26429m();
                m18007b(m);
                int t = this.f16676a.mo26436t() + m;
                do {
                    pvVar.mo26438a(this.f16676a.mo26432p());
                } while (this.f16676a.mo26436t() < t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f16676a.mo26432p()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int m2 = this.f16676a.mo26429m();
                m18007b(m2);
                int t2 = this.f16676a.mo26436t() + m2;
                do {
                    list.add(Long.valueOf(this.f16676a.mo26432p()));
                } while (this.f16676a.mo26436t() < t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: p */
    public final void mo26293p(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            int i = this.f16677b & 7;
            if (i == 0) {
                do {
                    hvVar.mo26051f(this.f16676a.mo26423g());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int t = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    hvVar.mo26051f(this.f16676a.mo26423g());
                } while (this.f16676a.mo26436t() < t);
                m18011d(t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26423g()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int t2 = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26423g()));
                } while (this.f16676a.mo26436t() < t2);
                m18011d(t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: q */
    public final void mo26295q(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            int i = this.f16677b & 7;
            if (i == 2) {
                int m = this.f16676a.mo26429m();
                m18009c(m);
                int t = this.f16676a.mo26436t() + m;
                do {
                    hvVar.mo26051f(this.f16676a.mo26431o());
                } while (this.f16676a.mo26436t() < t);
            } else if (i == 5) {
                do {
                    hvVar.mo26051f(this.f16676a.mo26431o());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 2) {
                int m2 = this.f16676a.mo26429m();
                m18009c(m2);
                int t2 = this.f16676a.mo26436t() + m2;
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26431o()));
                } while (this.f16676a.mo26436t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26431o()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo26257a(C7784nw<T> nwVar, zzdno zzdno) throws IOException {
        m18005a(2);
        return m18008c(nwVar, zzdno);
    }

    /* renamed from: b */
    public final void mo26263b(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            int i = this.f16677b & 7;
            if (i == 2) {
                int m = this.f16676a.mo26429m();
                m18009c(m);
                int t = this.f16676a.mo26436t() + m;
                do {
                    hvVar.mo26051f(this.f16676a.mo26425i());
                } while (this.f16676a.mo26436t() < t);
            } else if (i == 5) {
                do {
                    hvVar.mo26051f(this.f16676a.mo26425i());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 2) {
                int m2 = this.f16676a.mo26429m();
                m18009c(m2);
                int t2 = this.f16676a.mo26436t() + m2;
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26425i()));
                } while (this.f16676a.mo26436t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26425i()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: h */
    public final void mo26277h(List<String> list) throws IOException {
        m18006a(list, true);
    }

    /* renamed from: a */
    public final int mo26256a() throws IOException {
        m18005a(0);
        return this.f16676a.mo26433q();
    }

    /* renamed from: a */
    public final void mo26258a(List<Boolean> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7372cu) {
            C7372cu cuVar = (C7372cu) list;
            int i = this.f16677b & 7;
            if (i == 0) {
                do {
                    cuVar.mo25787a(this.f16676a.mo26426j());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int t = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    cuVar.mo25787a(this.f16676a.mo26426j());
                } while (this.f16676a.mo26436t() < t);
                m18011d(t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f16676a.mo26426j()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int t2 = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    list.add(Boolean.valueOf(this.f16676a.mo26426j()));
                } while (this.f16676a.mo26436t() < t2);
                m18011d(t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: d */
    public final long mo26267d() throws IOException {
        m18005a(0);
        return this.f16676a.mo26434r();
    }

    /* renamed from: d */
    public final void mo26268d(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7557hv) {
            C7557hv hvVar = (C7557hv) list;
            int i = this.f16677b & 7;
            if (i == 0) {
                do {
                    hvVar.mo26051f(this.f16676a.mo26433q());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int t = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    hvVar.mo26051f(this.f16676a.mo26433q());
                } while (this.f16676a.mo26436t() < t);
                m18011d(t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26433q()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int t2 = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    list.add(Integer.valueOf(this.f16676a.mo26433q()));
                } while (this.f16676a.mo26436t() < t2);
                m18011d(t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: c */
    public final void mo26265c(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C7857pv) {
            C7857pv pvVar = (C7857pv) list;
            int i = this.f16677b & 7;
            if (i == 0) {
                do {
                    pvVar.mo26438a(this.f16676a.mo26434r());
                    if (!this.f16676a.mo26435s()) {
                        d2 = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d2 == this.f16677b);
                this.f16679d = d2;
            } else if (i == 2) {
                int t = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    pvVar.mo26438a(this.f16676a.mo26434r());
                } while (this.f16676a.mo26436t() < t);
                m18011d(t);
            } else {
                throw zzdok.m24052f();
            }
        } else {
            int i2 = this.f16677b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f16676a.mo26434r()));
                    if (!this.f16676a.mo26435s()) {
                        d = this.f16676a.mo26419d();
                    } else {
                        return;
                    }
                } while (d == this.f16677b);
                this.f16679d = d;
            } else if (i2 == 2) {
                int t2 = this.f16676a.mo26436t() + this.f16676a.mo26429m();
                do {
                    list.add(Long.valueOf(this.f16676a.mo26434r()));
                } while (this.f16676a.mo26436t() < t2);
                m18011d(t2);
            } else {
                throw zzdok.m24052f();
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo26264b(List<T> list, C7784nw<T> nwVar, zzdno zzdno) throws IOException {
        int d;
        int i = this.f16677b;
        if ((i & 7) == 2) {
            do {
                list.add(m18008c(nwVar, zzdno));
                if (!this.f16676a.mo26435s() && this.f16679d == 0) {
                    d = this.f16676a.mo26419d();
                } else {
                    return;
                }
            } while (d == i);
            this.f16679d = d;
            return;
        }
        throw zzdok.m24052f();
    }

    /* renamed from: a */
    private final void m18006a(List<String> list, boolean z) throws IOException {
        int d;
        int d2;
        if ((this.f16677b & 7) != 2) {
            throw zzdok.m24052f();
        } else if (!(list instanceof zzdot) || z) {
            do {
                list.add(z ? mo26273g() : mo26288n());
                if (!this.f16676a.mo26435s()) {
                    d = this.f16676a.mo26419d();
                } else {
                    return;
                }
            } while (d == this.f16677b);
            this.f16679d = d;
        } else {
            zzdot zzdot = (zzdot) list;
            do {
                zzdot.mo29152a(mo26284l());
                if (!this.f16676a.mo26435s()) {
                    d2 = this.f16676a.mo26419d();
                } else {
                    return;
                }
            } while (d2 == this.f16677b);
            this.f16679d = d2;
        }
    }

    /* renamed from: b */
    private static void m18007b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzdok.m24053g();
        }
    }

    /* renamed from: d */
    private final void m18011d(int i) throws IOException {
        if (this.f16676a.mo26436t() != i) {
            throw zzdok.m24047a();
        }
    }

    /* renamed from: c */
    private static void m18009c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzdok.m24053g();
        }
    }

    /* renamed from: a */
    public final <T> void mo26259a(List<T> list, C7784nw<T> nwVar, zzdno zzdno) throws IOException {
        int d;
        int i = this.f16677b;
        if ((i & 7) == 3) {
            do {
                list.add(m18010d(nwVar, zzdno));
                if (!this.f16676a.mo26435s() && this.f16679d == 0) {
                    d = this.f16676a.mo26419d();
                } else {
                    return;
                }
            } while (d == i);
            this.f16679d = d;
            return;
        }
        throw zzdok.m24052f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (mo26283k() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        throw new com.google.android.gms.internal.ads.zzdok("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo26260a(java.util.Map<K, V> r8, com.google.android.gms.internal.ads.C8042uv<K, V> r9, com.google.android.gms.internal.ads.zzdno r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.m18005a((int) r0)
            com.google.android.gms.internal.ads.zzdnd r1 = r7.f16676a
            int r1 = r1.mo26429m()
            com.google.android.gms.internal.ads.zzdnd r2 = r7.f16676a
            int r1 = r2.mo26417c(r1)
            K r2 = r9.f16984b
            V r3 = r9.f16986d
        L_0x0014:
            int r4 = r7.mo26276h()     // Catch:{ all -> 0x0064 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005b
            com.google.android.gms.internal.ads.zzdnd r5 = r7.f16676a     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.mo26435s()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.mo26283k()     // Catch:{ zzdol -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.ads.zzdok r4 = new com.google.android.gms.internal.ads.zzdok     // Catch:{ zzdol -> 0x004e }
            r4.<init>(r6)     // Catch:{ zzdol -> 0x004e }
            throw r4     // Catch:{ zzdol -> 0x004e }
        L_0x0039:
            com.google.android.gms.internal.ads.zzdri r4 = r9.f16985c     // Catch:{ zzdol -> 0x004e }
            V r5 = r9.f16986d     // Catch:{ zzdol -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzdol -> 0x004e }
            java.lang.Object r3 = r7.m18004a((com.google.android.gms.internal.ads.zzdri) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.zzdno) r10)     // Catch:{ zzdol -> 0x004e }
            goto L_0x0014
        L_0x0046:
            com.google.android.gms.internal.ads.zzdri r4 = r9.f16983a     // Catch:{ zzdol -> 0x004e }
            r5 = 0
            java.lang.Object r2 = r7.m18004a((com.google.android.gms.internal.ads.zzdri) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.zzdno) r5)     // Catch:{ zzdol -> 0x004e }
            goto L_0x0014
        L_0x004e:
            boolean r4 = r7.mo26283k()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            goto L_0x0014
        L_0x0055:
            com.google.android.gms.internal.ads.zzdok r8 = new com.google.android.gms.internal.ads.zzdok     // Catch:{ all -> 0x0064 }
            r8.<init>(r6)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x005b:
            r8.put(r2, r3)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.ads.zzdnd r8 = r7.f16676a
            r8.mo26420d(r1)
            return
        L_0x0064:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzdnd r9 = r7.f16676a
            r9.mo26420d(r1)
            goto L_0x006c
        L_0x006b:
            throw r8
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7893qu.mo26260a(java.util.Map, com.google.android.gms.internal.ads.uv, com.google.android.gms.internal.ads.zzdno):void");
    }

    /* renamed from: a */
    private final Object m18004a(zzdri zzdri, Class<?> cls, zzdno zzdno) throws IOException {
        switch (C7930ru.f16781a[zzdri.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo26266c());
            case 2:
                return mo26284l();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo26290o());
            case 5:
                return Integer.valueOf(mo26280j());
            case 6:
                return Long.valueOf(mo26271f());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo26278i());
            case 9:
                return Long.valueOf(mo26269e());
            case 10:
                m18005a(2);
                return m18008c(C7595iw.m17197a().mo26088a(cls), zzdno);
            case 11:
                return Integer.valueOf(mo26292p());
            case 12:
                return Long.valueOf(mo26294q());
            case 13:
                return Integer.valueOf(mo26256a());
            case 14:
                return Long.valueOf(mo26267d());
            case 15:
                return mo26273g();
            case 16:
                return Integer.valueOf(mo26286m());
            case 17:
                return Long.valueOf(mo26261b());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }
}
