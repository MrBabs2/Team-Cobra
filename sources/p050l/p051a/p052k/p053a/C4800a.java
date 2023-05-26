package p050l.p051a.p052k.p053a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0246g0;
import androidx.core.content.C0394a;
import androidx.core.content.p003c.C0396a;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"RestrictedAPI"})
/* renamed from: l.a.k.a.a */
/* compiled from: AppCompatResources */
public final class C4800a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f8139a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C4801a>> f8140b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f8141c = new Object();

    /* renamed from: l.a.k.a.a$a */
    /* compiled from: AppCompatResources */
    private static class C4801a {

        /* renamed from: a */
        final ColorStateList f8142a;

        /* renamed from: b */
        final Configuration f8143b;

        C4801a(ColorStateList colorStateList, Configuration configuration) {
            this.f8142a = colorStateList;
            this.f8143b = configuration;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m7932a(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f8141c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<l.a.k.a.a$a>> r1 = f8140b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            l.a.k.a.a$a r2 = (p050l.p051a.p052k.p053a.C4800a.C4801a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f8143b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f8142a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p051a.p052k.p053a.C4800a.m7932a(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: b */
    public static ColorStateList m7935b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a = m7932a(context, i);
        if (a != null) {
            return a;
        }
        ColorStateList d = m7937d(context, i);
        if (d == null) {
            return C0394a.m1914b(context, i);
        }
        m7934a(context, i, d);
        return d;
    }

    /* renamed from: c */
    public static Drawable m7936c(Context context, int i) {
        return C0246g0.m1150a().mo1553a(context, i);
    }

    /* renamed from: d */
    private static ColorStateList m7937d(Context context, int i) {
        if (m7938e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0396a.m1922a(resources, (XmlPullParser) resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m7938e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m7933a();
        resources.getValue(i, a, true);
        int i2 = a.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m7934a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f8141c) {
            SparseArray sparseArray = f8140b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f8140b.put(context, sparseArray);
            }
            sparseArray.append(i, new C4801a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: a */
    private static TypedValue m7933a() {
        TypedValue typedValue = f8139a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f8139a.set(typedValue2);
        return typedValue2;
    }
}
