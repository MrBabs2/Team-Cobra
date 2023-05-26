package p123rx;

import p123rx.exceptions.MissingBackpressureException;

/* renamed from: rx.a */
/* compiled from: BackpressureOverflow */
public final class C12459a {

    /* renamed from: a */
    public static final C12463d f32212a;

    /* renamed from: b */
    public static final C12463d f32213b;

    /* renamed from: rx.a$a */
    /* compiled from: BackpressureOverflow */
    static final class C12460a implements C12463d {

        /* renamed from: a */
        static final C12460a f32214a = new C12460a();

        private C12460a() {
        }

        /* renamed from: a */
        public boolean mo40631a() {
            return false;
        }
    }

    /* renamed from: rx.a$b */
    /* compiled from: BackpressureOverflow */
    static final class C12461b implements C12463d {

        /* renamed from: a */
        static final C12461b f32215a = new C12461b();

        private C12461b() {
        }

        /* renamed from: a */
        public boolean mo40631a() {
            return true;
        }
    }

    /* renamed from: rx.a$c */
    /* compiled from: BackpressureOverflow */
    static final class C12462c implements C12463d {

        /* renamed from: a */
        static final C12462c f32216a = new C12462c();

        private C12462c() {
        }

        /* renamed from: a */
        public boolean mo40631a() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    /* renamed from: rx.a$d */
    /* compiled from: BackpressureOverflow */
    public interface C12463d {
        /* renamed from: a */
        boolean mo40631a() throws MissingBackpressureException;
    }

    static {
        C12462c cVar = C12462c.f32216a;
        f32212a = cVar;
        f32213b = cVar;
        C12461b bVar = C12461b.f32215a;
        C12460a aVar = C12460a.f32214a;
    }
}
