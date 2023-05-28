package p050l.p075h.p076e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p003c.C0398c;
import androidx.core.content.p003c.C0406f;
import p050l.p066e.C4874e;
import p050l.p075h.p081i.C4971b;

@SuppressLint({"NewApi"})
/* renamed from: l.h.e.d */
/* compiled from: TypefaceCompat */
public class C4954d {

    /* renamed from: a */
    private static final C4960j f8754a;

    /* renamed from: b */
    private static final C4874e<String, Typeface> f8755b = new C4874e<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f8754a = new C4959i();
        } else if (i >= 28) {
            f8754a = new C4958h();
        } else if (i >= 26) {
            f8754a = new C4957g();
        } else if (i >= 24 && C4956f.m8742a()) {
            f8754a = new C4956f();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f8754a = new C4955e();
        } else {
            f8754a = new C4960j();
        }
    }

    /* renamed from: a */
    private static String m8731a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: b */
    public static Typeface m8733b(Resources resources, int i, int i2) {
        return f8755b.mo16953b(m8731a(resources, i, i2));
    }

    /* renamed from: a */
    public static Typeface m8730a(Context context, C0398c.C0399a aVar, Resources resources, int i, int i2, C0406f.C0407a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C0398c.C0402d) {
            C0398c.C0402d dVar = (C0398c.C0402d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo2312a() == 0) {
                z2 = true;
            }
            typeface = C4971b.m8810a(context, dVar.mo2313b(), aVar2, handler, z2, z ? dVar.mo2314c() : -1, i2);
        } else {
            typeface = f8754a.mo17365a(context, (C0398c.C0400b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo2316a(typeface, handler);
                } else {
                    aVar2.mo2315a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f8755b.mo16949a(m8731a(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: b */
    private static Typeface m8732b(Context context, Typeface typeface, int i) {
        C0398c.C0400b a = f8754a.mo17377a(typeface);
        if (a == null) {
            return null;
        }
        return f8754a.mo17365a(context, a, context.getResources(), i);
    }

    /* renamed from: a */
    public static Typeface m8727a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f8754a.mo17366a(context, resources, i, str, i2);
        if (a != null) {
            f8755b.mo16949a(m8731a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m8729a(Context context, CancellationSignal cancellationSignal, C4971b.C4977f[] fVarArr, int i) {
        return f8754a.mo17364a(context, cancellationSignal, fVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m8728a(Context context, Typeface typeface, int i) {
        Typeface b;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (b = m8732b(context, typeface, i)) == null) {
            return Typeface.create(typeface, i);
        } else {
            return b;
        }
    }
}
