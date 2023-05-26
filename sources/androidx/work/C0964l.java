package androidx.work;

import android.annotation.SuppressLint;

/* renamed from: androidx.work.l */
/* compiled from: Operation */
public interface C0964l {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final C0966b.C0969c f3320a = new C0966b.C0969c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final C0966b.C0968b f3321b = new C0966b.C0968b();

    /* renamed from: androidx.work.l$b */
    /* compiled from: Operation */
    public static abstract class C0966b {

        /* renamed from: androidx.work.l$b$a */
        /* compiled from: Operation */
        public static final class C0967a extends C0966b {

            /* renamed from: a */
            private final Throwable f3322a;

            public C0967a(Throwable th) {
                this.f3322a = th;
            }

            /* renamed from: a */
            public Throwable mo4973a() {
                return this.f3322a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f3322a.getMessage()});
            }
        }

        /* renamed from: androidx.work.l$b$b */
        /* compiled from: Operation */
        public static final class C0968b extends C0966b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0968b() {
            }
        }

        /* renamed from: androidx.work.l$b$c */
        /* compiled from: Operation */
        public static final class C0969c extends C0966b {
            public String toString() {
                return "SUCCESS";
            }

            private C0969c() {
            }
        }

        C0966b() {
        }
    }
}
