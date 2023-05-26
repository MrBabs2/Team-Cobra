package p050l.p075h.p082j;

import java.util.Locale;

/* renamed from: l.h.j.e */
/* compiled from: TextDirectionHeuristicsCompat */
public final class C4993e {

    /* renamed from: a */
    public static final C4992d f8849a = new C4998e((C4996c) null, false);

    /* renamed from: b */
    public static final C4992d f8850b = new C4998e((C4996c) null, true);

    /* renamed from: c */
    public static final C4992d f8851c = new C4998e(C4995b.f8855a, false);

    /* renamed from: d */
    public static final C4992d f8852d = new C4998e(C4995b.f8855a, true);

    /* renamed from: l.h.j.e$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C4994a implements C4996c {

        /* renamed from: b */
        static final C4994a f8853b = new C4994a(true);

        /* renamed from: a */
        private final boolean f8854a;

        private C4994a(boolean z) {
            this.f8854a = z;
        }

        /* renamed from: a */
        public int mo17448a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C4993e.m8874a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f8854a) {
                        return 1;
                    }
                } else if (this.f8854a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f8854a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: l.h.j.e$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C4995b implements C4996c {

        /* renamed from: a */
        static final C4995b f8855a = new C4995b();

        private C4995b() {
        }

        /* renamed from: a */
        public int mo17448a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C4993e.m8875b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: l.h.j.e$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    private interface C4996c {
        /* renamed from: a */
        int mo17448a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: l.h.j.e$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class C4997d implements C4992d {

        /* renamed from: a */
        private final C4996c f8856a;

        C4997d(C4996c cVar) {
            this.f8856a = cVar;
        }

        /* renamed from: b */
        private boolean m8879b(CharSequence charSequence, int i, int i2) {
            int a = this.f8856a.mo17448a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo17449a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo17449a();

        /* renamed from: a */
        public boolean mo17447a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f8856a == null) {
                return mo17449a();
            } else {
                return m8879b(charSequence, i, i2);
            }
        }
    }

    /* renamed from: l.h.j.e$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C4998e extends C4997d {

        /* renamed from: b */
        private final boolean f8857b;

        C4998e(C4996c cVar, boolean z) {
            super(cVar);
            this.f8857b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo17449a() {
            return this.f8857b;
        }
    }

    /* renamed from: l.h.j.e$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C4999f extends C4997d {

        /* renamed from: b */
        static final C4999f f8858b = new C4999f();

        C4999f() {
            super((C4996c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo17449a() {
            return C5000f.m8885b(Locale.getDefault()) == 1;
        }
    }

    static {
        new C4998e(C4994a.f8853b, false);
        C4999f fVar = C4999f.f8858b;
    }

    /* renamed from: a */
    static int m8874a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m8875b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
