package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p050l.p051a.p058o.C4821b;
import p050l.p066e.C4870b;

/* renamed from: androidx.appcompat.app.f */
/* compiled from: AppCompatDelegate */
public abstract class C0078f {

    /* renamed from: f */
    private static int f219f = -100;

    /* renamed from: g */
    private static final C4870b<WeakReference<C0078f>> f220g = new C4870b<>();

    /* renamed from: h */
    private static final Object f221h = new Object();

    C0078f() {
    }

    /* renamed from: a */
    public static C0078f m241a(Activity activity, C0077e eVar) {
        return new C0079g(activity, eVar);
    }

    /* renamed from: c */
    private static void m245c(C0078f fVar) {
        synchronized (f221h) {
            Iterator<WeakReference<C0078f>> it = f220g.iterator();
            while (it.hasNext()) {
                C0078f fVar2 = (C0078f) it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: e */
    public static void m246e(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f219f != i) {
            f219f = i;
            mo329l();
        }
    }

    /* renamed from: l */
    private static void mo329l() {
        synchronized (f221h) {
            Iterator<WeakReference<C0078f>> it = f220g.iterator();
            while (it.hasNext()) {
                C0078f fVar = (C0078f) it.next().get();
                if (fVar != null) {
                    fVar.mo291a();
                }
            }
        }
    }

    /* renamed from: m */
    public static int m248m() {
        return f219f;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo282a(int i);

    /* renamed from: a */
    public abstract C4821b mo283a(C4821b.C4822a aVar);

    @Deprecated
    /* renamed from: a */
    public void mo284a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo285a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo286a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo287a(View view);

    /* renamed from: a */
    public abstract void mo288a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo289a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo290a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo291a();

    /* renamed from: b */
    public Context mo292b(Context context) {
        mo284a(context);
        return context;
    }

    /* renamed from: b */
    public abstract C0073b mo293b();

    /* renamed from: b */
    public abstract void mo294b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo295b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo296b(int i);

    /* renamed from: c */
    public int mo297c() {
        return -100;
    }

    /* renamed from: c */
    public abstract void mo298c(int i);

    /* renamed from: c */
    public abstract void mo299c(Bundle bundle);

    /* renamed from: d */
    public abstract MenuInflater mo300d();

    /* renamed from: d */
    public void mo301d(int i) {
    }

    /* renamed from: e */
    public abstract C0069a mo302e();

    /* renamed from: f */
    public abstract void mo303f();

    /* renamed from: g */
    public abstract void mo304g();

    /* renamed from: h */
    public abstract void mo305h();

    /* renamed from: i */
    public abstract void mo306i();

    /* renamed from: j */
    public abstract void mo307j();

    /* renamed from: k */
    public abstract void mo308k();

    /* renamed from: a */
    public static C0078f m242a(Dialog dialog, C0077e eVar) {
        return new C0079g(dialog, eVar);
    }

    /* renamed from: b */
    static void m244b(C0078f fVar) {
        synchronized (f221h) {
            m245c(fVar);
        }
    }

    /* renamed from: a */
    static void m243a(C0078f fVar) {
        synchronized (f221h) {
            m245c(fVar);
            f220g.add(new WeakReference(fVar));
        }
    }
}
