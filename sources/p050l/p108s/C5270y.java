package p050l.p108s;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l.s.y */
/* compiled from: ViewGroupUtilsApi14 */
class C5270y {

    /* renamed from: a */
    private static LayoutTransition f9376a;

    /* renamed from: b */
    private static Field f9377b;

    /* renamed from: c */
    private static boolean f9378c;

    /* renamed from: d */
    private static Method f9379d;

    /* renamed from: e */
    private static boolean f9380e;

    /* renamed from: l.s.y$a */
    /* compiled from: ViewGroupUtilsApi14 */
    static class C5271a extends LayoutTransition {
        C5271a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m9923a(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = f9376a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0028
            l.s.y$a r0 = new l.s.y$a
            r0.<init>()
            f9376a = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f9376a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = f9376a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = f9376a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f9376a
            r4 = 4
            r0.setAnimator(r4, r3)
        L_0x0028:
            if (r6 == 0) goto L_0x0048
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L_0x0042
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L_0x0039
            m9922a(r6)
        L_0x0039:
            android.animation.LayoutTransition r0 = f9376a
            if (r6 == r0) goto L_0x0042
            int r0 = p050l.p108s.C5238j.transition_layout_save
            r5.setTag(r0, r6)
        L_0x0042:
            android.animation.LayoutTransition r6 = f9376a
            r5.setLayoutTransition(r6)
            goto L_0x0096
        L_0x0048:
            r5.setLayoutTransition(r3)
            boolean r6 = f9378c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L_0x0066
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x005f }
            f9377b = r6     // Catch:{ NoSuchFieldException -> 0x005f }
            r6.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x005f }
            goto L_0x0064
        L_0x005f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x0064:
            f9378c = r1
        L_0x0066:
            java.lang.reflect.Field r6 = f9377b
            if (r6 == 0) goto L_0x007f
            boolean r6 = r6.getBoolean(r5)     // Catch:{ IllegalAccessException -> 0x007a }
            if (r6 == 0) goto L_0x0078
            java.lang.reflect.Field r1 = f9377b     // Catch:{ IllegalAccessException -> 0x0076 }
            r1.setBoolean(r5, r2)     // Catch:{ IllegalAccessException -> 0x0076 }
            goto L_0x0078
        L_0x0076:
            r2 = r6
            goto L_0x007a
        L_0x0078:
            r2 = r6
            goto L_0x007f
        L_0x007a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x007f:
            if (r2 == 0) goto L_0x0084
            r5.requestLayout()
        L_0x0084:
            int r6 = p050l.p108s.C5238j.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L_0x0096
            int r0 = p050l.p108s.C5238j.transition_layout_save
            r5.setTag(r0, r3)
            r5.setLayoutTransition(r6)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p108s.C5270y.m9923a(android.view.ViewGroup, boolean):void");
    }

    /* renamed from: a */
    private static void m9922a(LayoutTransition layoutTransition) {
        if (!f9380e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f9379d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f9380e = true;
        }
        Method method = f9379d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }
}
