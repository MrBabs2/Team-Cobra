package p050l.p108s;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l.s.i0 */
/* compiled from: ViewUtilsBase */
class C5237i0 {

    /* renamed from: a */
    private static Method f9280a;

    /* renamed from: b */
    private static boolean f9281b;

    /* renamed from: c */
    private static Field f9282c;

    /* renamed from: d */
    private static boolean f9283d;

    C5237i0() {
    }

    /* renamed from: a */
    public void mo18044a(View view, float f) {
        Float f2 = (Float) view.getTag(C5238j.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public float mo18045b(View view) {
        Float f = (Float) view.getTag(C5238j.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo18046c(View view) {
        if (view.getTag(C5238j.save_non_transition_alpha) == null) {
            view.setTag(C5238j.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: a */
    public void mo18043a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C5238j.save_non_transition_alpha, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo18049b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo18049b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: a */
    public void mo18048a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo18048a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: a */
    public void mo18050a(View view, int i, int i2, int i3, int i4) {
        m9767a();
        Method method = f9280a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo18052a(View view, int i) {
        if (!f9283d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f9282c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f9283d = true;
        }
        Field field = f9282c;
        if (field != null) {
            try {
                f9282c.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m9767a() {
        if (!f9281b) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f9280a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f9281b = true;
        }
    }
}
