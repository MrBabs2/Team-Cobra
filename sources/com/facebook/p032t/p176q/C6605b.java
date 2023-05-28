package com.facebook.p032t.p176q;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p177r.p178g.C6639f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.t.q.b */
/* compiled from: MetadataMatcher */
final class C6605b {
    C6605b() {
    }

    /* renamed from: a */
    static List<String> m14032a(View view) {
        Class<C6605b> cls = C6605b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup i = C6639f.m14143i(view);
            if (i != null) {
                for (View next : C6639f.m14136b(i)) {
                    if (view != next) {
                        arrayList.addAll(m14037c(next));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|(1:6)|7|(1:9)|10|11|(2:13|(1:15))|16|17|(4:20|(2:24|33)|29|18)|30|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[Catch:{ all -> 0x007f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List<java.lang.String> m14036b(android.view.View r6) {
        /*
            java.lang.Class<com.facebook.t.q.b> r0 = com.facebook.p032t.p176q.C6605b.class
            boolean r1 = com.facebook.internal.p168a0.p170f.C6391a.m13260a((java.lang.Object) r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x007f }
            r1.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = com.facebook.p032t.p177r.p178g.C6639f.m14142h(r6)     // Catch:{ all -> 0x007f }
            r1.add(r3)     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r6.getTag()     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0023
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007f }
            r1.add(r3)     // Catch:{ all -> 0x007f }
        L_0x0023:
            java.lang.CharSequence r3 = r6.getContentDescription()     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007f }
            r1.add(r3)     // Catch:{ all -> 0x007f }
        L_0x0030:
            int r3 = r6.getId()     // Catch:{ NotFoundException -> 0x0053 }
            r4 = -1
            if (r3 == r4) goto L_0x0053
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ NotFoundException -> 0x0053 }
            int r6 = r6.getId()     // Catch:{ NotFoundException -> 0x0053 }
            java.lang.String r6 = r3.getResourceName(r6)     // Catch:{ NotFoundException -> 0x0053 }
            java.lang.String r3 = "/"
            java.lang.String[] r6 = r6.split(r3)     // Catch:{ NotFoundException -> 0x0053 }
            int r3 = r6.length     // Catch:{ NotFoundException -> 0x0053 }
            r4 = 2
            if (r3 != r4) goto L_0x0053
            r3 = 1
            r6 = r6[r3]     // Catch:{ NotFoundException -> 0x0053 }
            r1.add(r6)     // Catch:{ NotFoundException -> 0x0053 }
        L_0x0053:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x007f }
            r6.<init>()     // Catch:{ all -> 0x007f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x007f }
        L_0x005c:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x007e
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x007f }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x007f }
            if (r4 != 0) goto L_0x005c
            int r4 = r3.length()     // Catch:{ all -> 0x007f }
            r5 = 100
            if (r4 > r5) goto L_0x005c
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x007f }
            r6.add(r3)     // Catch:{ all -> 0x007f }
            goto L_0x005c
        L_0x007e:
            return r6
        L_0x007f:
            r6 = move-exception
            com.facebook.internal.p168a0.p170f.C6391a.m13259a(r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p176q.C6605b.m14036b(android.view.View):java.util.List");
    }

    /* renamed from: c */
    static List<String> m14037c(View view) {
        Class<C6605b> cls = C6605b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String charSequence = ((TextView) view).getText().toString();
                if (!charSequence.isEmpty() && charSequence.length() < 100) {
                    arrayList.add(charSequence.toLowerCase());
                }
                return arrayList;
            }
            for (View c : C6639f.m14136b(view)) {
                arrayList.addAll(m14037c(c));
            }
            return arrayList;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m14035a(List<String> list, List<String> list2) {
        Class<C6605b> cls = C6605b.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            for (String a : list) {
                if (m14034a(a, list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m14034a(String str, List<String> list) {
        Class<C6605b> cls = C6605b.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            for (String contains : list) {
                if (str.contains(contains)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m14033a(String str, String str2) {
        Class<C6605b> cls = C6605b.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return str.matches(str2);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }
}
