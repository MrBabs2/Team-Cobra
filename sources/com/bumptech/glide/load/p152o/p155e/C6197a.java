package com.bumptech.glide.load.p152o.p155e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0394a;
import androidx.core.content.p003c.C0406f;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p051a.p058o.C4824d;

/* renamed from: com.bumptech.glide.load.o.e.a */
/* compiled from: DrawableDecoderCompat */
public final class C6197a {

    /* renamed from: a */
    private static volatile boolean f11322a = true;

    /* renamed from: a */
    public static Drawable m12552a(Context context, Context context2, int i) {
        return m12553a(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: b */
    private static Drawable m12554b(Context context, int i, Resources.Theme theme) {
        return C0406f.m1967a(context.getResources(), i, theme);
    }

    /* renamed from: c */
    private static Drawable m12555c(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new C4824d(context, theme);
        }
        return C4800a.m7936c(context, i);
    }

    /* renamed from: a */
    public static Drawable m12551a(Context context, int i, Resources.Theme theme) {
        return m12553a(context, context, i, theme);
    }

    /* renamed from: a */
    private static Drawable m12553a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f11322a) {
                return m12555c(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f11322a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0394a.m1917c(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m12554b(context2, i, theme);
    }
}
