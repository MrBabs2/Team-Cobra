package com.facebook.p032t.p182v;

import android.text.TextUtils;
import com.facebook.C4716f;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.io.File;
import java.nio.charset.Charset;

/* renamed from: com.facebook.t.v.e */
/* compiled from: Utils */
public class C6683e {
    /* renamed from: a */
    static int[] m14296a(String str, int i) {
        Class<C6683e> cls = C6683e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int[] iArr = new int[i];
            byte[] bytes = m14295a(str).getBytes(Charset.forName("UTF-8"));
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < bytes.length) {
                    iArr[i2] = bytes[i2] & 255;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static String m14295a(String str) {
        Class<C6683e> cls = C6683e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return TextUtils.join(" ", str.trim().split("\\s+"));
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    public static File m14294a() {
        Class<C6683e> cls = C6683e.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            File file = new File(C4716f.m7696e().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
