package com.facebook.p032t.p184x;

import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.GraphRequest;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C6596m;
import com.facebook.p032t.p177r.p178g.C6639f;
import com.facebook.p032t.p182v.C6673c;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.x.f */
/* compiled from: ViewOnClickListener */
public final class C6692f implements View.OnClickListener {

    /* renamed from: j */
    private static final Set<Integer> f12485j = new HashSet();

    /* renamed from: f */
    private View.OnClickListener f12486f;

    /* renamed from: g */
    private WeakReference<View> f12487g;

    /* renamed from: h */
    private WeakReference<View> f12488h;

    /* renamed from: i */
    private String f12489i;

    /* renamed from: com.facebook.t.x.f$a */
    /* compiled from: ViewOnClickListener */
    static class C6693a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f12490f;

        /* renamed from: g */
        final /* synthetic */ String f12491g;

        C6693a(String str, String str2) {
            this.f12490f = str;
            this.f12491g = str2;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6692f.m14341a(this.f12490f, this.f12491g, new float[0]);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.x.f$b */
    /* compiled from: ViewOnClickListener */
    class C6694b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ JSONObject f12492f;

        /* renamed from: g */
        final /* synthetic */ String f12493g;

        /* renamed from: h */
        final /* synthetic */ String f12494h;

        C6694b(JSONObject jSONObject, String str, String str2) {
            this.f12492f = jSONObject;
            this.f12493g = str;
            this.f12494h = str2;
        }

        public void run() {
            String[] a;
            if (!C6391a.m13260a((Object) this)) {
                try {
                    String lowerCase = C6476x.m13526c(C4716f.m7696e()).toLowerCase();
                    float[] a2 = C6686a.m14313a(this.f12492f, lowerCase);
                    String a3 = C6686a.m14303a(this.f12493g, C6692f.m14337a(C6692f.this), lowerCase);
                    if (a2 != null && (a = C6673c.m14260a(C6673c.C6678e.MTML_APP_EVENT_PREDICTION, new float[][]{a2}, new String[]{a3})) != null) {
                        String str = a[0];
                        C6687b.m14320a(this.f12494h, str);
                        if (!str.equals("other")) {
                            C6692f.m14341a(str, this.f12493g, a2);
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    static {
        Class<C6692f> cls = C6692f.class;
    }

    private C6692f(View view, View view2, String str) {
        this.f12486f = C6639f.m14140f(view);
        this.f12488h = new WeakReference<>(view);
        this.f12487g = new WeakReference<>(view2);
        this.f12489i = str.toLowerCase().replace("activity", "");
    }

    /* renamed from: a */
    static /* synthetic */ void m14341a(String str, String str2, float[] fArr) {
        if (!C6391a.m13260a((Object) C6692f.class)) {
            try {
                m14343b(str, str2, fArr);
            } catch (Throwable th) {
                C6391a.m13259a(th, C6692f.class);
            }
        }
    }

    /* renamed from: b */
    private static void m14343b(String str, String str2, float[] fArr) {
        if (!C6391a.m13260a((Object) C6692f.class)) {
            try {
                if (C6689d.m14330b(str)) {
                    new C6596m(C4716f.m7696e()).mo21339a(str, str2);
                } else if (C6689d.m14328a(str)) {
                    m14344c(str, str2, fArr);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, C6692f.class);
            }
        }
    }

    /* renamed from: c */
    private static void m14344c(String str, String str2, float[] fArr) {
        if (!C6391a.m13260a((Object) C6692f.class)) {
            try {
                Bundle bundle = new Bundle();
                try {
                    bundle.putString("event_name", str);
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb = new StringBuilder();
                    for (float append : fArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    jSONObject.put("dense", sb.toString());
                    jSONObject.put("button_text", str2);
                    bundle.putString("metadata", jSONObject.toString());
                    GraphRequest a = GraphRequest.m13074a((AccessToken) null, String.format(Locale.US, "%s/suggested_events", new Object[]{C4716f.m7697f()}), (JSONObject) null, (GraphRequest.C6344f) null);
                    a.mo20826a(bundle);
                    a.mo20825a();
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, C6692f.class);
            }
        }
    }

    public void onClick(View view) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (this.f12486f != null) {
                    this.f12486f.onClick(view);
                }
                m14338a();
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m14337a(C6692f fVar) {
        if (C6391a.m13260a((Object) C6692f.class)) {
            return null;
        }
        try {
            return fVar.f12489i;
        } catch (Throwable th) {
            C6391a.m13259a(th, C6692f.class);
            return null;
        }
    }

    /* renamed from: a */
    static void m14339a(View view, View view2, String str) {
        if (!C6391a.m13260a((Object) C6692f.class)) {
            try {
                int hashCode = view.hashCode();
                if (!f12485j.contains(Integer.valueOf(hashCode))) {
                    C6639f.m14133a(view, (View.OnClickListener) new C6692f(view, view2, str));
                    f12485j.add(Integer.valueOf(hashCode));
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, C6692f.class);
            }
        }
    }

    /* renamed from: a */
    private void m14338a() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                View view = (View) this.f12487g.get();
                View view2 = (View) this.f12488h.get();
                if (view != null && view2 != null) {
                    try {
                        String c = C6688c.m14325c(view2);
                        String a = C6687b.m14317a(view2, c);
                        if (a != null && !m14342a(a, c)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", C6688c.m14322a(view, view2));
                            jSONObject.put("screenname", this.f12489i);
                            m14340a(a, c, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    private static boolean m14342a(String str, String str2) {
        if (C6391a.m13260a((Object) C6692f.class)) {
            return false;
        }
        try {
            String a = C6687b.m14318a(str);
            if (a == null) {
                return false;
            }
            if (a.equals("other")) {
                return true;
            }
            C6476x.m13505a((Runnable) new C6693a(a, str2));
            return true;
        } catch (Throwable th) {
            C6391a.m13259a(th, C6692f.class);
            return false;
        }
    }

    /* renamed from: a */
    private void m14340a(String str, String str2, JSONObject jSONObject) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                C6476x.m13505a((Runnable) new C6694b(jSONObject, str2, str));
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }
}
