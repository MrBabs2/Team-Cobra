package com.flurry.sdk;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.flurry.sdk.C6951o1;
import com.flurry.sdk.C7051v3;
import java.util.HashMap;
import java.util.Map;
import p112n.p113d.p114a.C10565d;

/* renamed from: com.flurry.sdk.q1 */
public final class C6985q1 {

    /* renamed from: i */
    private static C6985q1 f13123i;

    /* renamed from: a */
    private C6951o1.C6953b f13124a;

    /* renamed from: b */
    C6924m1 f13125b;

    /* renamed from: c */
    Map<String, C6924m1> f13126c = new HashMap();

    /* renamed from: d */
    public boolean f13127d = false;

    /* renamed from: e */
    long f13128e = 0;

    /* renamed from: f */
    long f13129f = 0;

    /* renamed from: g */
    int f13130g = 0;

    /* renamed from: h */
    boolean f13131h = false;

    private C6985q1() {
    }

    /* renamed from: b */
    public static synchronized C6985q1 m14834b() {
        C6985q1 q1Var;
        synchronized (C6985q1.class) {
            if (f13123i == null) {
                f13123i = new C6985q1();
            }
            q1Var = f13123i;
        }
        return q1Var;
    }

    /* renamed from: a */
    public final void mo23698a() {
        if (this.f13124a == null) {
            C6792d1.m14476a(3, "ScreenTimeMonitor", "Register Screen Time metrics.");
            long nanoTime = System.nanoTime();
            this.f13129f = nanoTime;
            this.f13128e = nanoTime;
            this.f13124a = new C6986a();
            C6951o1.m14763a().mo23669a(this.f13124a);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14833a(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("fl.current.screen", str2);
        hashMap.put(str, Long.toString(j));
        C6724a.m14355a().mo23527a("Flurry.ForegroundTime", C7051v3.C7052a.PERFORMANCE, hashMap);
    }

    /* renamed from: com.flurry.sdk.q1$a */
    class C6986a implements C6951o1.C6953b {

        /* renamed from: com.flurry.sdk.q1$a$a */
        class C6987a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: f */
            final /* synthetic */ Activity f13133f;

            C6987a(Activity activity) {
                this.f13133f = activity;
            }

            public final void onGlobalLayout() {
                C6924m1 m1Var;
                this.f13133f.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C6985q1 q1Var = C6985q1.this;
                if (q1Var.f13127d && (m1Var = q1Var.f13125b) != null) {
                    double nanoTime = (double) (System.nanoTime() - C6985q1.this.f13128e);
                    Double.isNaN(nanoTime);
                    m1Var.f12984h = (long) (nanoTime / 1000000.0d);
                    C6792d1.m14476a(3, "ScreenTimeMonitor", "Start timed event for activity: " + C6985q1.this.f13125b.f12978b);
                    C6924m1 m1Var2 = C6985q1.this.f13125b;
                    if (!m1Var2.f12982f) {
                        C6792d1.m14476a(4, "ActivityScreenData", "Start timed activity event: " + m1Var2.f12978b);
                        C6724a a = C6724a.m14355a();
                        String str = m1Var2.f12977a;
                        C7051v3.C7052a aVar = C7051v3.C7052a.PERFORMANCE;
                        String str2 = m1Var2.f12979c;
                        if (str2 != null) {
                            m1Var2.f12981e.put("fl.previous.screen", str2);
                        }
                        m1Var2.f12981e.put("fl.current.screen", m1Var2.f12978b);
                        m1Var2.f12981e.put("fl.resume.time", Long.toString(m1Var2.f12983g));
                        m1Var2.f12981e.put("fl.layout.time", Long.toString(m1Var2.f12984h));
                        Map<String, String> map = m1Var2.f12981e;
                        if (!C6766c2.m14421a(16)) {
                            C10565d dVar = C10565d.kFlurryEventFailed;
                        } else {
                            a.mo23528a(str, aVar, map, true, true);
                        }
                        m1Var2.f12982f = true;
                    }
                }
            }
        }

        C6986a() {
        }

        /* renamed from: a */
        public final void mo23661a(Activity activity) {
            String str;
            C6792d1.m14476a(3, "ScreenTimeMonitor", "onActivityStarted for activity: " + activity.toString());
            C6985q1 q1Var = C6985q1.this;
            C6924m1 m1Var = q1Var.f13125b;
            if (m1Var == null) {
                str = null;
            } else {
                str = m1Var.f12978b;
            }
            q1Var.f13125b = new C6924m1(activity.getClass().getSimpleName(), str);
            C6985q1.this.f13126c.put(activity.toString(), C6985q1.this.f13125b);
            C6985q1 q1Var2 = C6985q1.this;
            int i = q1Var2.f13130g + 1;
            q1Var2.f13130g = i;
            if (i == 1 && !q1Var2.f13131h) {
                C6792d1.m14476a(3, "ScreenTimeMonitor", "onForeground for activity: " + activity.toString());
                long nanoTime = System.nanoTime();
                C6985q1 q1Var3 = C6985q1.this;
                double d = (double) (nanoTime - q1Var3.f13129f);
                Double.isNaN(d);
                long j = (long) (d / 1000000.0d);
                q1Var3.f13129f = nanoTime;
                q1Var3.f13128e = nanoTime;
                if (q1Var3.f13127d) {
                    C6985q1.m14833a("fl.background.time", activity.getClass().getSimpleName(), j);
                }
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new C6987a(activity));
        }

        /* renamed from: b */
        public final void mo23662b(Activity activity) {
            C6924m1 remove = C6985q1.this.f13126c.remove(activity.toString());
            C6985q1.this.f13131h = activity.isChangingConfigurations();
            C6985q1 q1Var = C6985q1.this;
            int i = q1Var.f13130g - 1;
            q1Var.f13130g = i;
            if (i == 0 && !q1Var.f13131h) {
                C6792d1.m14476a(3, "ScreenTimeMonitor", "onBackground for activity: " + activity.toString());
                long nanoTime = System.nanoTime();
                C6985q1 q1Var2 = C6985q1.this;
                double d = (double) (nanoTime - q1Var2.f13129f);
                Double.isNaN(d);
                long j = (long) (d / 1000000.0d);
                q1Var2.f13129f = nanoTime;
                if (q1Var2.f13127d) {
                    C6985q1.m14833a("fl.foreground.time", activity.getClass().getSimpleName(), j);
                }
            }
            if (C6985q1.this.f13127d && remove != null) {
                C6792d1.m14476a(3, "ScreenTimeMonitor", "End timed event: " + remove.f12978b);
                if (remove.f12982f) {
                    C6792d1.m14476a(4, "ActivityScreenData", "End timed activity event: " + remove.f12978b);
                    C6724a a = C6724a.m14355a();
                    String str = remove.f12977a;
                    C7051v3.C7052a aVar = C7051v3.C7052a.PERFORMANCE;
                    double nanoTime2 = (double) (System.nanoTime() - remove.f12980d);
                    Double.isNaN(nanoTime2);
                    remove.f12981e.put("fl.duration", Long.toString((long) (nanoTime2 / 1000000.0d)));
                    Map<String, String> map = remove.f12981e;
                    if (!C6766c2.m14421a(16)) {
                        C10565d dVar = C10565d.kFlurryEventFailed;
                    } else {
                        a.mo23528a(str, aVar, map, true, false);
                    }
                    remove.f12982f = false;
                }
            }
        }

        /* renamed from: c */
        public final void mo23663c(Activity activity) {
            C6924m1 m1Var;
            C6985q1 q1Var = C6985q1.this;
            if (q1Var.f13127d && (m1Var = q1Var.f13125b) != null) {
                double nanoTime = (double) (System.nanoTime() - C6985q1.this.f13128e);
                Double.isNaN(nanoTime);
                m1Var.f12983g = (long) (nanoTime / 1000000.0d);
            }
        }

        /* renamed from: a */
        public final void mo23660a() {
            C6985q1.this.f13128e = System.nanoTime();
        }
    }
}
