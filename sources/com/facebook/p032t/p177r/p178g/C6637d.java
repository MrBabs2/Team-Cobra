package com.facebook.p032t.p177r.p178g;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.facebook.internal.p168a0.p170f.C6391a;

/* renamed from: com.facebook.t.r.g.d */
/* compiled from: SensitiveUserDataUtils */
public class C6637d {
    /* renamed from: a */
    public static boolean m14119a(View view) {
        Class<C6637d> cls = C6637d.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            if (m14122c(textView) || m14120a(textView) || m14123d(textView) || m14125f(textView) || m14124e(textView) || m14121b(textView)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m14121b(TextView textView) {
        Class<C6637d> cls = C6637d.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String j = C6639f.m14144j(textView);
            if (j != null) {
                if (j.length() != 0) {
                    return Patterns.EMAIL_ADDRESS.matcher(j).matches();
                }
            }
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m14122c(TextView textView) {
        Class<C6637d> cls = C6637d.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m14123d(TextView textView) {
        Class<C6637d> cls = C6637d.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m14124e(TextView textView) {
        Class<C6637d> cls = C6637d.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m14125f(TextView textView) {
        Class<C6637d> cls = C6637d.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m14120a(TextView textView) {
        Class<C6637d> cls = C6637d.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            String replaceAll = C6639f.m14144j(textView).replaceAll("\\s", "");
            int length = replaceAll.length();
            if (length < 12) {
                return false;
            }
            if (length > 19) {
                return false;
            }
            int i = length - 1;
            int i2 = 0;
            boolean z = false;
            while (i >= 0) {
                char charAt = replaceAll.charAt(i);
                if (charAt >= '0') {
                    if (charAt <= '9') {
                        int i3 = charAt - '0';
                        if (z && (i3 = i3 * 2) > 9) {
                            i3 = (i3 % 10) + 1;
                        }
                        i2 += i3;
                        z = !z;
                        i--;
                    }
                }
                return false;
            }
            if (i2 % 10 == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }
}
