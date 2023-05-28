package com.trello.rxlifecycle;

import java.util.concurrent.CancellationException;
import p123rx.C5368e;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;

/* renamed from: com.trello.rxlifecycle.a */
/* compiled from: Functions */
final class C8998a {

    /* renamed from: a */
    static final C5379n<Throwable, Boolean> f25490a = new C8999a();

    /* renamed from: b */
    static final C5379n<Boolean, Boolean> f25491b = new C9000b();

    /* renamed from: com.trello.rxlifecycle.a$a */
    /* compiled from: Functions */
    static class C8999a implements C5379n<Throwable, Boolean> {
        C8999a() {
        }

        /* renamed from: a */
        public Boolean call(Throwable th) {
            if (th instanceof OutsideLifecycleException) {
                return true;
            }
            C12472a.m40944b(th);
            throw null;
        }
    }

    /* renamed from: com.trello.rxlifecycle.a$b */
    /* compiled from: Functions */
    static class C9000b implements C5379n<Boolean, Boolean> {
        C9000b() {
        }

        /* renamed from: a */
        public Boolean mo33290a(Boolean bool) {
            return bool;
        }

        public /* bridge */ /* synthetic */ Object call(Object obj) {
            Boolean bool = (Boolean) obj;
            mo33290a(bool);
            return bool;
        }
    }

    /* renamed from: com.trello.rxlifecycle.a$c */
    /* compiled from: Functions */
    static class C9001c implements C5379n<Object, C5368e<Object>> {
        C9001c() {
        }

        public C5368e<Object> call(Object obj) {
            return C5368e.m10238a((Throwable) new CancellationException());
        }
    }

    static {
        new C9001c();
    }
}
