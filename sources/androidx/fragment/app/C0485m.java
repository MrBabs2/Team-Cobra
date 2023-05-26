package androidx.fragment.app;

import androidx.lifecycle.C0514f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.m */
/* compiled from: FragmentTransaction */
public abstract class C0485m {

    /* renamed from: a */
    ArrayList<C0486a> f2050a = new ArrayList<>();

    /* renamed from: b */
    int f2051b;

    /* renamed from: c */
    int f2052c;

    /* renamed from: d */
    int f2053d;

    /* renamed from: e */
    int f2054e;

    /* renamed from: f */
    int f2055f;

    /* renamed from: g */
    int f2056g;

    /* renamed from: h */
    boolean f2057h;

    /* renamed from: i */
    boolean f2058i = true;

    /* renamed from: j */
    String f2059j;

    /* renamed from: k */
    int f2060k;

    /* renamed from: l */
    CharSequence f2061l;

    /* renamed from: m */
    int f2062m;

    /* renamed from: n */
    CharSequence f2063n;

    /* renamed from: o */
    ArrayList<String> f2064o;

    /* renamed from: p */
    ArrayList<String> f2065p;

    /* renamed from: q */
    boolean f2066q = false;

    /* renamed from: r */
    ArrayList<Runnable> f2067r;

    /* renamed from: androidx.fragment.app.m$a */
    /* compiled from: FragmentTransaction */
    static final class C0486a {

        /* renamed from: a */
        int f2068a;

        /* renamed from: b */
        Fragment f2069b;

        /* renamed from: c */
        int f2070c;

        /* renamed from: d */
        int f2071d;

        /* renamed from: e */
        int f2072e;

        /* renamed from: f */
        int f2073f;

        /* renamed from: g */
        C0514f.C0516b f2074g;

        /* renamed from: h */
        C0514f.C0516b f2075h;

        C0486a() {
        }

        C0486a(int i, Fragment fragment) {
            this.f2068a = i;
            this.f2069b = fragment;
            C0514f.C0516b bVar = C0514f.C0516b.RESUMED;
            this.f2074g = bVar;
            this.f2075h = bVar;
        }

        C0486a(int i, Fragment fragment, C0514f.C0516b bVar) {
            this.f2068a = i;
            this.f2069b = fragment;
            this.f2074g = fragment.mMaxState;
            this.f2075h = bVar;
        }
    }

    /* renamed from: a */
    public abstract int mo2675a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2949a(C0486a aVar) {
        this.f2050a.add(aVar);
        aVar.f2070c = this.f2051b;
        aVar.f2071d = this.f2052c;
        aVar.f2072e = this.f2053d;
        aVar.f2073f = this.f2054e;
    }

    /* renamed from: b */
    public abstract int mo2686b();

    /* renamed from: b */
    public C0485m mo2950b(int i, Fragment fragment) {
        mo2951b(i, fragment, (String) null);
        return this;
    }

    /* renamed from: c */
    public C0485m mo2691c(Fragment fragment) {
        mo2949a(new C0486a(3, fragment));
        return this;
    }

    /* renamed from: c */
    public abstract void mo2692c();

    /* renamed from: d */
    public abstract void mo2693d();

    /* renamed from: e */
    public C0485m mo2952e() {
        if (!this.f2057h) {
            this.f2058i = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: b */
    public C0485m mo2951b(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo2680a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: b */
    public C0485m mo2688b(Fragment fragment) {
        mo2949a(new C0486a(6, fragment));
        return this;
    }

    /* renamed from: a */
    public C0485m mo2947a(Fragment fragment, String str) {
        mo2680a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0485m mo2944a(int i, Fragment fragment) {
        mo2680a(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: a */
    public C0485m mo2945a(int i, Fragment fragment, String str) {
        mo2680a(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2680a(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo2949a(new C0486a(i2, fragment));
    }

    /* renamed from: a */
    public C0485m mo2946a(Fragment fragment) {
        mo2949a(new C0486a(7, fragment));
        return this;
    }

    /* renamed from: a */
    public C0485m mo2678a(Fragment fragment, C0514f.C0516b bVar) {
        mo2949a(new C0486a(10, fragment, bVar));
        return this;
    }

    /* renamed from: a */
    public C0485m mo2943a(int i, int i2, int i3, int i4) {
        this.f2051b = i;
        this.f2052c = i2;
        this.f2053d = i3;
        this.f2054e = i4;
        return this;
    }

    /* renamed from: a */
    public C0485m mo2948a(String str) {
        if (this.f2058i) {
            this.f2057h = true;
            this.f2059j = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }
}
