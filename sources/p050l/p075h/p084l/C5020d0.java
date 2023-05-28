package p050l.p075h.p084l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p050l.p075h.p076e.C4950b;
import p050l.p075h.p083k.C5003c;
import p050l.p075h.p083k.C5008h;

/* renamed from: l.h.l.d0 */
/* compiled from: WindowInsetsCompat */
public class C5020d0 {

    /* renamed from: b */
    public static final C5020d0 f8875b = new C5021a().mo17488a().mo17473a().mo17475b().mo17477c();

    /* renamed from: a */
    private final C5029i f8876a;

    /* renamed from: l.h.l.d0$a */
    /* compiled from: WindowInsetsCompat */
    public static final class C5021a {

        /* renamed from: a */
        private final C5024d f8877a;

        public C5021a() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                this.f8877a = new C5023c();
            } else if (i >= 20) {
                this.f8877a = new C5022b();
            } else {
                this.f8877a = new C5024d();
            }
        }

        /* renamed from: a */
        public C5021a mo17487a(C4950b bVar) {
            this.f8877a.mo17492a(bVar);
            return this;
        }

        /* renamed from: b */
        public C5021a mo17489b(C4950b bVar) {
            this.f8877a.mo17491b(bVar);
            return this;
        }

        /* renamed from: a */
        public C5020d0 mo17488a() {
            return this.f8877a.mo17490a();
        }

        public C5021a(C5020d0 d0Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                this.f8877a = new C5023c(d0Var);
            } else if (i >= 20) {
                this.f8877a = new C5022b(d0Var);
            } else {
                this.f8877a = new C5024d(d0Var);
            }
        }
    }

    /* renamed from: l.h.l.d0$c */
    /* compiled from: WindowInsetsCompat */
    private static class C5023c extends C5024d {

        /* renamed from: b */
        final WindowInsets.Builder f8883b;

        C5023c() {
            this.f8883b = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17492a(C4950b bVar) {
            this.f8883b.setStableInsets(bVar.mo17359a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17491b(C4950b bVar) {
            this.f8883b.setSystemWindowInsets(bVar.mo17359a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5020d0 mo17490a() {
            return C5020d0.m8936a(this.f8883b.build());
        }

        C5023c(C5020d0 d0Var) {
            WindowInsets.Builder builder;
            WindowInsets j = d0Var.mo17486j();
            if (j != null) {
                builder = new WindowInsets.Builder(j);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f8883b = builder;
        }
    }

    /* renamed from: l.h.l.d0$d */
    /* compiled from: WindowInsetsCompat */
    private static class C5024d {

        /* renamed from: a */
        private final C5020d0 f8884a;

        C5024d() {
            this(new C5020d0((C5020d0) null));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5020d0 mo17490a() {
            return this.f8884a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17492a(C4950b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17491b(C4950b bVar) {
        }

        C5024d(C5020d0 d0Var) {
            this.f8884a = d0Var;
        }
    }

    /* renamed from: l.h.l.d0$g */
    /* compiled from: WindowInsetsCompat */
    private static class C5027g extends C5026f {
        C5027g(C5020d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5020d0 mo17500a() {
            return C5020d0.m8936a(this.f8885b.consumeDisplayCutout());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C5017c mo17501d() {
            return C5017c.m8931a(this.f8885b.getDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5027g)) {
                return false;
            }
            return C4757h.m7801a(this.f8885b, ((C5027g) obj).f8885b);
        }

        public int hashCode() {
            return this.f8885b.hashCode();
        }

        C5027g(C5020d0 d0Var, C5027g gVar) {
            super(d0Var, (C5026f) gVar);
        }
    }

    /* renamed from: l.h.l.d0$h */
    /* compiled from: WindowInsetsCompat */
    private static class C5028h extends C5027g {
        C5028h(C5020d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5020d0 mo17493a(int i, int i2, int i3, int i4) {
            return C5020d0.m8936a(this.f8885b.inset(i, i2, i3, i4));
        }

        C5028h(C5020d0 d0Var, C5028h hVar) {
            super(d0Var, (C5027g) hVar);
        }
    }

    /* renamed from: l.h.l.d0$i */
    /* compiled from: WindowInsetsCompat */
    private static class C5029i {

        /* renamed from: a */
        final C5020d0 f8888a;

        C5029i(C5020d0 d0Var) {
            this.f8888a = d0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5020d0 mo17500a() {
            return this.f8888a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5020d0 mo17496b() {
            return this.f8888a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5020d0 mo17497c() {
            return this.f8888a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C5017c mo17501d() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C4950b mo17498e() {
            return C4950b.f8745e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5029i)) {
                return false;
            }
            C5029i iVar = (C5029i) obj;
            if (mo17495h() != iVar.mo17495h() || mo17499g() != iVar.mo17499g() || !C5003c.m8889a(mo17494f(), iVar.mo17494f()) || !C5003c.m8889a(mo17498e(), iVar.mo17498e()) || !C5003c.m8889a(mo17501d(), iVar.mo17501d())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C4950b mo17494f() {
            return C4950b.f8745e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo17499g() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo17495h() {
            return false;
        }

        public int hashCode() {
            return C5003c.m8888a(Boolean.valueOf(mo17495h()), Boolean.valueOf(mo17499g()), mo17494f(), mo17498e(), mo17501d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5020d0 mo17493a(int i, int i2, int i3, int i4) {
            return C5020d0.f8875b;
        }
    }

    private C5020d0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f8876a = new C5028h(this, windowInsets);
        } else if (i >= 28) {
            this.f8876a = new C5027g(this, windowInsets);
        } else if (i >= 21) {
            this.f8876a = new C5026f(this, windowInsets);
        } else if (i >= 20) {
            this.f8876a = new C5025e(this, windowInsets);
        } else {
            this.f8876a = new C5029i(this);
        }
    }

    /* renamed from: a */
    public static C5020d0 m8936a(WindowInsets windowInsets) {
        C5008h.m8899a(windowInsets);
        return new C5020d0(windowInsets);
    }

    @Deprecated
    /* renamed from: b */
    public C5020d0 mo17476b(int i, int i2, int i3, int i4) {
        C5021a aVar = new C5021a(this);
        aVar.mo17489b(C4950b.m8710a(i, i2, i3, i4));
        return aVar.mo17488a();
    }

    /* renamed from: c */
    public C5020d0 mo17477c() {
        return this.f8876a.mo17497c();
    }

    /* renamed from: d */
    public int mo17478d() {
        return mo17483h().f8749d;
    }

    /* renamed from: e */
    public int mo17479e() {
        return mo17483h().f8746a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5020d0)) {
            return false;
        }
        return C5003c.m8889a(this.f8876a, ((C5020d0) obj).f8876a);
    }

    /* renamed from: f */
    public int mo17481f() {
        return mo17483h().f8748c;
    }

    /* renamed from: g */
    public int mo17482g() {
        return mo17483h().f8747b;
    }

    /* renamed from: h */
    public C4950b mo17483h() {
        return this.f8876a.mo17494f();
    }

    public int hashCode() {
        C5029i iVar = this.f8876a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    /* renamed from: i */
    public boolean mo17485i() {
        return this.f8876a.mo17499g();
    }

    /* renamed from: j */
    public WindowInsets mo17486j() {
        C5029i iVar = this.f8876a;
        if (iVar instanceof C5025e) {
            return ((C5025e) iVar).f8885b;
        }
        return null;
    }

    /* renamed from: l.h.l.d0$b */
    /* compiled from: WindowInsetsCompat */
    private static class C5022b extends C5024d {

        /* renamed from: c */
        private static Field f8878c = null;

        /* renamed from: d */
        private static boolean f8879d = false;

        /* renamed from: e */
        private static Constructor<WindowInsets> f8880e = null;

        /* renamed from: f */
        private static boolean f8881f = false;

        /* renamed from: b */
        private WindowInsets f8882b;

        C5022b() {
            this.f8882b = m8952b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5020d0 mo17490a() {
            return C5020d0.m8936a(this.f8882b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17491b(C4950b bVar) {
            WindowInsets windowInsets = this.f8882b;
            if (windowInsets != null) {
                this.f8882b = windowInsets.replaceSystemWindowInsets(bVar.f8746a, bVar.f8747b, bVar.f8748c, bVar.f8749d);
            }
        }

        C5022b(C5020d0 d0Var) {
            this.f8882b = d0Var.mo17486j();
        }

        /* renamed from: b */
        private static WindowInsets m8952b() {
            if (!f8879d) {
                try {
                    f8878c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f8879d = true;
            }
            Field field = f8878c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f8881f) {
                try {
                    f8880e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f8881f = true;
            }
            Constructor<WindowInsets> constructor = f8880e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }
    }

    /* renamed from: l.h.l.d0$f */
    /* compiled from: WindowInsetsCompat */
    private static class C5026f extends C5025e {

        /* renamed from: d */
        private C4950b f8887d = null;

        C5026f(C5020d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5020d0 mo17496b() {
            return C5020d0.m8936a(this.f8885b.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5020d0 mo17497c() {
            return C5020d0.m8936a(this.f8885b.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final C4950b mo17498e() {
            if (this.f8887d == null) {
                this.f8887d = C4950b.m8710a(this.f8885b.getStableInsetLeft(), this.f8885b.getStableInsetTop(), this.f8885b.getStableInsetRight(), this.f8885b.getStableInsetBottom());
            }
            return this.f8887d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo17499g() {
            return this.f8885b.isConsumed();
        }

        C5026f(C5020d0 d0Var, C5026f fVar) {
            super(d0Var, (C5025e) fVar);
        }
    }

    /* renamed from: a */
    public C5020d0 mo17473a() {
        return this.f8876a.mo17500a();
    }

    /* renamed from: l.h.l.d0$e */
    /* compiled from: WindowInsetsCompat */
    private static class C5025e extends C5029i {

        /* renamed from: b */
        final WindowInsets f8885b;

        /* renamed from: c */
        private C4950b f8886c;

        C5025e(C5020d0 d0Var, WindowInsets windowInsets) {
            super(d0Var);
            this.f8886c = null;
            this.f8885b = windowInsets;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5020d0 mo17493a(int i, int i2, int i3, int i4) {
            C5021a aVar = new C5021a(C5020d0.m8936a(this.f8885b));
            aVar.mo17489b(C5020d0.m8935a(mo17494f(), i, i2, i3, i4));
            aVar.mo17487a(C5020d0.m8935a(mo17498e(), i, i2, i3, i4));
            return aVar.mo17488a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final C4950b mo17494f() {
            if (this.f8886c == null) {
                this.f8886c = C4950b.m8710a(this.f8885b.getSystemWindowInsetLeft(), this.f8885b.getSystemWindowInsetTop(), this.f8885b.getSystemWindowInsetRight(), this.f8885b.getSystemWindowInsetBottom());
            }
            return this.f8886c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo17495h() {
            return this.f8885b.isRound();
        }

        C5025e(C5020d0 d0Var, C5025e eVar) {
            this(d0Var, new WindowInsets(eVar.f8885b));
        }
    }

    /* renamed from: a */
    public C5020d0 mo17474a(int i, int i2, int i3, int i4) {
        return this.f8876a.mo17493a(i, i2, i3, i4);
    }

    /* renamed from: a */
    static C4950b m8935a(C4950b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f8746a - i);
        int max2 = Math.max(0, bVar.f8747b - i2);
        int max3 = Math.max(0, bVar.f8748c - i3);
        int max4 = Math.max(0, bVar.f8749d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return bVar;
        }
        return C4950b.m8710a(max, max2, max3, max4);
    }

    /* renamed from: b */
    public C5020d0 mo17475b() {
        return this.f8876a.mo17496b();
    }

    public C5020d0(C5020d0 d0Var) {
        if (d0Var != null) {
            C5029i iVar = d0Var.f8876a;
            if (Build.VERSION.SDK_INT >= 29 && (iVar instanceof C5028h)) {
                this.f8876a = new C5028h(this, (C5028h) iVar);
            } else if (Build.VERSION.SDK_INT >= 28 && (iVar instanceof C5027g)) {
                this.f8876a = new C5027g(this, (C5027g) iVar);
            } else if (Build.VERSION.SDK_INT >= 21 && (iVar instanceof C5026f)) {
                this.f8876a = new C5026f(this, (C5026f) iVar);
            } else if (Build.VERSION.SDK_INT < 20 || !(iVar instanceof C5025e)) {
                this.f8876a = new C5029i(this);
            } else {
                this.f8876a = new C5025e(this, (C5025e) iVar);
            }
        } else {
            this.f8876a = new C5029i(this);
        }
    }
}
