package p112n.p277e.p279b.p282b.p297z;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C8567k;

/* renamed from: n.e.b.b.z.h */
/* compiled from: MaterialShapeUtils */
public class C10642h {
    /* renamed from: a */
    static C10635d m36065a(int i) {
        if (i == 0) {
            return new C10644j();
        }
        if (i != 1) {
            return m36064a();
        }
        return new C10636e();
    }

    /* renamed from: b */
    static C10637f m36069b() {
        return new C10637f();
    }

    /* renamed from: a */
    static C10635d m36064a() {
        return new C10644j();
    }

    /* renamed from: a */
    public static void m36067a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C10638g) {
            ((C10638g) background).mo36245b(f);
        }
    }

    /* renamed from: a */
    public static void m36066a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C10638g) {
            m36068a(view, (C10638g) background);
        }
    }

    /* renamed from: a */
    public static void m36068a(View view, C10638g gVar) {
        if (gVar.mo36272r()) {
            gVar.mo36251d(C8567k.m28000a(view));
        }
    }
}
