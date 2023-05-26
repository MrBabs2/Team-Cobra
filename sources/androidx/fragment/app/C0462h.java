package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: androidx.fragment.app.h */
/* compiled from: FragmentManager */
public abstract class C0462h {

    /* renamed from: g */
    static final C0460f f1976g = new C0460f();

    /* renamed from: f */
    private C0460f f1977f = null;

    /* renamed from: androidx.fragment.app.h$a */
    /* compiled from: FragmentManager */
    public interface C0463a {
        String getName();
    }

    /* renamed from: androidx.fragment.app.h$b */
    /* compiled from: FragmentManager */
    public static abstract class C0464b {
        /* renamed from: a */
        public abstract void mo2806a(C0462h hVar, Fragment fragment);

        /* renamed from: a */
        public abstract void mo2807a(C0462h hVar, Fragment fragment, Context context);

        /* renamed from: a */
        public abstract void mo2808a(C0462h hVar, Fragment fragment, Bundle bundle);

        /* renamed from: a */
        public abstract void mo2809a(C0462h hVar, Fragment fragment, View view, Bundle bundle);

        /* renamed from: b */
        public abstract void mo2810b(C0462h hVar, Fragment fragment);

        /* renamed from: b */
        public abstract void mo2811b(C0462h hVar, Fragment fragment, Context context);

        /* renamed from: b */
        public abstract void mo2812b(C0462h hVar, Fragment fragment, Bundle bundle);

        /* renamed from: c */
        public abstract void mo2813c(C0462h hVar, Fragment fragment);

        /* renamed from: c */
        public abstract void mo2814c(C0462h hVar, Fragment fragment, Bundle bundle);

        /* renamed from: d */
        public abstract void mo2815d(C0462h hVar, Fragment fragment);

        /* renamed from: d */
        public abstract void mo2816d(C0462h hVar, Fragment fragment, Bundle bundle);

        /* renamed from: e */
        public abstract void mo2817e(C0462h hVar, Fragment fragment);

        /* renamed from: f */
        public abstract void mo2818f(C0462h hVar, Fragment fragment);

        /* renamed from: g */
        public abstract void mo2819g(C0462h hVar, Fragment fragment);
    }

    /* renamed from: androidx.fragment.app.h$c */
    /* compiled from: FragmentManager */
    public interface C0465c {
        /* renamed from: a */
        void mo2820a();
    }

    /* renamed from: a */
    public abstract Fragment.SavedState mo2789a(Fragment fragment);

    /* renamed from: a */
    public abstract Fragment mo2790a(int i);

    /* renamed from: a */
    public abstract Fragment mo2791a(Bundle bundle, String str);

    /* renamed from: a */
    public abstract Fragment mo2792a(String str);

    /* renamed from: a */
    public abstract C0485m mo2793a();

    /* renamed from: a */
    public abstract void mo2794a(int i, int i2);

    /* renamed from: a */
    public abstract void mo2795a(Bundle bundle, String str, Fragment fragment);

    /* renamed from: a */
    public void mo2796a(C0460f fVar) {
        this.f1977f = fVar;
    }

    /* renamed from: a */
    public abstract void mo2797a(String str, int i);

    /* renamed from: a */
    public abstract void mo2798a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract C0463a mo2799b(int i);

    /* renamed from: b */
    public abstract boolean mo2800b();

    /* renamed from: c */
    public abstract int mo2801c();

    /* renamed from: d */
    public C0460f mo2802d() {
        if (this.f1977f == null) {
            this.f1977f = f1976g;
        }
        return this.f1977f;
    }

    /* renamed from: e */
    public abstract List<Fragment> mo2803e();

    /* renamed from: f */
    public abstract void mo2804f();

    /* renamed from: g */
    public abstract boolean mo2805g();
}
