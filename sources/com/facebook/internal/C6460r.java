package com.facebook.internal;

import android.util.Log;
import com.facebook.C4716f;
import com.facebook.C6494l;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;

/* renamed from: com.facebook.internal.r */
/* compiled from: Logger */
public class C6460r {

    /* renamed from: e */
    private static final HashMap<String, String> f11890e = new HashMap<>();

    /* renamed from: a */
    private final C6494l f11891a;

    /* renamed from: b */
    private final String f11892b;

    /* renamed from: c */
    private StringBuilder f11893c;

    /* renamed from: d */
    private int f11894d = 3;

    public C6460r(C6494l lVar, String str) {
        C6481y.m13557a(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
        this.f11891a = lVar;
        this.f11892b = "FacebookSDK." + str;
        this.f11893c = new StringBuilder();
    }

    /* renamed from: a */
    public static synchronized void m13409a(String str, String str2) {
        synchronized (C6460r.class) {
            f11890e.put(str, str2);
        }
    }

    /* renamed from: c */
    public static synchronized void m13411c(String str) {
        synchronized (C6460r.class) {
            if (!C4716f.m7689a(C6494l.INCLUDE_ACCESS_TOKENS)) {
                m13409a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* renamed from: d */
    private static synchronized String m13412d(String str) {
        synchronized (C6460r.class) {
            for (Map.Entry next : f11890e.entrySet()) {
                str = str.replace((CharSequence) next.getKey(), (CharSequence) next.getValue());
            }
        }
        return str;
    }

    /* renamed from: b */
    public void mo21014b(String str) {
        m13405a(this.f11891a, this.f11894d, this.f11892b, str);
    }

    /* renamed from: b */
    private boolean m13410b() {
        return C4716f.m7689a(this.f11891a);
    }

    /* renamed from: a */
    public static void m13407a(C6494l lVar, String str, String str2) {
        m13405a(lVar, 3, str, str2);
    }

    /* renamed from: a */
    public static void m13408a(C6494l lVar, String str, String str2, Object... objArr) {
        if (C4716f.m7689a(lVar)) {
            m13405a(lVar, 3, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m13406a(C6494l lVar, int i, String str, String str2, Object... objArr) {
        if (C4716f.m7689a(lVar)) {
            m13405a(lVar, i, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m13405a(C6494l lVar, int i, String str, String str2) {
        if (C4716f.m7689a(lVar)) {
            String d = m13412d(str2);
            if (!str.startsWith("FacebookSDK.")) {
                str = "FacebookSDK." + str;
            }
            Log.println(i, str, d);
            if (lVar == C6494l.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo21010a() {
        mo21014b(this.f11893c.toString());
        this.f11893c = new StringBuilder();
    }

    /* renamed from: a */
    public void mo21011a(String str) {
        if (m13410b()) {
            this.f11893c.append(str);
        }
    }

    /* renamed from: a */
    public void mo21013a(String str, Object... objArr) {
        if (m13410b()) {
            this.f11893c.append(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public void mo21012a(String str, Object obj) {
        mo21013a("  %s:\t%s\n", str, obj);
    }
}
