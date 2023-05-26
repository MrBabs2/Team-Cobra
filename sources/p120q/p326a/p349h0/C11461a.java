package p120q.p326a.p349h0;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p120q.p326a.C11491v;
import p120q.p326a.p329d0.p342g.C11387b;
import p120q.p326a.p329d0.p342g.C11392d;
import p120q.p326a.p329d0.p342g.C11400f;
import p120q.p326a.p329d0.p342g.C11404g;
import p120q.p326a.p329d0.p342g.C11415o;
import p120q.p326a.p329d0.p342g.C11417p;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.h0.a */
/* compiled from: Schedulers */
public final class C11461a {

    /* renamed from: a */
    static final C11491v f30681a = C11459a.m37537e(new C11469h());

    /* renamed from: b */
    static final C11491v f30682b = C11459a.m37529b((Callable<C11491v>) new C11463b());

    /* renamed from: c */
    static final C11491v f30683c = C11459a.m37533c((Callable<C11491v>) new C11464c());

    /* renamed from: d */
    static final C11491v f30684d = C11417p.m37425b();

    /* renamed from: q.a.h0.a$a */
    /* compiled from: Schedulers */
    static final class C11462a {

        /* renamed from: a */
        static final C11491v f30685a = new C11387b();
    }

    /* renamed from: q.a.h0.a$b */
    /* compiled from: Schedulers */
    static final class C11463b implements Callable<C11491v> {
        C11463b() {
        }

        public C11491v call() throws Exception {
            return C11462a.f30685a;
        }
    }

    /* renamed from: q.a.h0.a$c */
    /* compiled from: Schedulers */
    static final class C11464c implements Callable<C11491v> {
        C11464c() {
        }

        public C11491v call() throws Exception {
            return C11465d.f30686a;
        }
    }

    /* renamed from: q.a.h0.a$d */
    /* compiled from: Schedulers */
    static final class C11465d {

        /* renamed from: a */
        static final C11491v f30686a = new C11400f();
    }

    /* renamed from: q.a.h0.a$e */
    /* compiled from: Schedulers */
    static final class C11466e {

        /* renamed from: a */
        static final C11491v f30687a = new C11404g();
    }

    /* renamed from: q.a.h0.a$f */
    /* compiled from: Schedulers */
    static final class C11467f implements Callable<C11491v> {
        C11467f() {
        }

        public C11491v call() throws Exception {
            return C11466e.f30687a;
        }
    }

    /* renamed from: q.a.h0.a$g */
    /* compiled from: Schedulers */
    static final class C11468g {

        /* renamed from: a */
        static final C11491v f30688a = new C11415o();
    }

    /* renamed from: q.a.h0.a$h */
    /* compiled from: Schedulers */
    static final class C11469h implements Callable<C11491v> {
        C11469h() {
        }

        public C11491v call() throws Exception {
            return C11468g.f30688a;
        }
    }

    static {
        C11459a.m37536d(new C11467f());
    }

    /* renamed from: a */
    public static C11491v m37546a() {
        return C11459a.m37523a(f30682b);
    }

    /* renamed from: b */
    public static C11491v m37548b() {
        return C11459a.m37530b(f30683c);
    }

    /* renamed from: c */
    public static C11491v m37549c() {
        return C11459a.m37534c(f30681a);
    }

    /* renamed from: d */
    public static C11491v m37550d() {
        return f30684d;
    }

    /* renamed from: a */
    public static C11491v m37547a(Executor executor) {
        return new C11392d(executor, false);
    }
}
