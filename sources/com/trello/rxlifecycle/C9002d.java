package com.trello.rxlifecycle;

import p123rx.C5368e;
import p123rx.p126m.C12496o;
import p123rx.p126m.C5379n;

/* renamed from: com.trello.rxlifecycle.d */
/* compiled from: TakeUntilGenerator */
final class C9002d {

    /* renamed from: com.trello.rxlifecycle.d$a */
    /* compiled from: TakeUntilGenerator */
    static class C9003a implements C5379n<T, Boolean> {

        /* renamed from: f */
        final /* synthetic */ Object f25492f;

        C9003a(Object obj) {
            this.f25492f = obj;
        }

        public Boolean call(T t) {
            return Boolean.valueOf(t.equals(this.f25492f));
        }
    }

    /* renamed from: com.trello.rxlifecycle.d$b */
    /* compiled from: TakeUntilGenerator */
    static class C9004b implements C12496o<T, T, Boolean> {
        C9004b() {
        }

        public Boolean call(T t, T t2) {
            return Boolean.valueOf(t2.equals(t));
        }
    }

    /* renamed from: a */
    static <T> C5368e<T> m29566a(C5368e<T> eVar, T t) {
        return eVar.mo18704p(new C9003a(t));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rx.m.n<T, T>, rx.m.n] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> p123rx.C5368e<java.lang.Boolean> m29567a(p123rx.C5368e<T> r2, p123rx.p126m.C5379n<T, T> r3) {
        /*
            r0 = 1
            rx.e r1 = r2.mo18657b((int) r0)
            rx.e r3 = r1.mo18694j(r3)
            rx.e r2 = r2.mo18633a((int) r0)
            com.trello.rxlifecycle.d$b r0 = new com.trello.rxlifecycle.d$b
            r0.<init>()
            rx.e r2 = p123rx.C5368e.m10247a(r3, r2, r0)
            rx.m.n<java.lang.Throwable, java.lang.Boolean> r3 = com.trello.rxlifecycle.C8998a.f25490a
            rx.e r2 = r2.mo18699l(r3)
            rx.m.n<java.lang.Boolean, java.lang.Boolean> r3 = com.trello.rxlifecycle.C8998a.f25491b
            rx.e r2 = r2.mo18704p(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trello.rxlifecycle.C9002d.m29567a(rx.e, rx.m.n):rx.e");
    }
}
