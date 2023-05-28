package p112n.p277e.p279b.p282b.p288q;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p050l.p075h.p076e.C4949a;
import p112n.p277e.p279b.p282b.p294w.C10619b;

/* renamed from: n.e.b.b.q.a */
/* compiled from: MaterialColors */
public class C10609a {
    /* renamed from: a */
    public static int m35926a(View view, int i) {
        return C10619b.m35952a(view, i);
    }

    /* renamed from: a */
    public static int m35925a(Context context, int i, String str) {
        return C10619b.m35951a(context, i, str);
    }

    /* renamed from: a */
    public static int m35927a(View view, int i, int i2) {
        return m35924a(view.getContext(), i, i2);
    }

    /* renamed from: a */
    public static int m35924a(Context context, int i, int i2) {
        TypedValue a = C10619b.m35953a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: a */
    public static int m35928a(View view, int i, int i2, float f) {
        return m35923a(m35926a(view, i), m35926a(view, i2), f);
    }

    /* renamed from: a */
    public static int m35923a(int i, int i2, float f) {
        return m35922a(i, C4949a.m8709d(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: a */
    public static int m35922a(int i, int i2) {
        return C4949a.m8708c(i2, i);
    }
}
