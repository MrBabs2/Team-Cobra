package com.flurry.sdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.view.ViewTreeObserver;
import com.flurry.sdk.C6951o1;
import com.flurry.sdk.C7051v3;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.n1 */
public final class C6935n1 {

    /* renamed from: h */
    private static C6935n1 f13008h;

    /* renamed from: i */
    private static final long f13009i = System.nanoTime();

    /* renamed from: a */
    private long f13010a;

    /* renamed from: b */
    private long f13011b;

    /* renamed from: c */
    private long f13012c;

    /* renamed from: d */
    private Map<String, String> f13013d = new HashMap();

    /* renamed from: e */
    private C6951o1.C6953b f13014e;

    /* renamed from: f */
    public boolean f13015f = false;

    /* renamed from: g */
    public boolean f13016g = false;

    /* renamed from: com.flurry.sdk.n1$a */
    class C6936a implements C6951o1.C6953b {

        /* renamed from: com.flurry.sdk.n1$a$a */
        class C6937a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: f */
            final /* synthetic */ Activity f13018f;

            C6937a(Activity activity) {
                this.f13018f = activity;
            }

            public final void onGlobalLayout() {
                this.f13018f.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C6935n1 n1Var = C6935n1.this;
                this.f13018f.getApplication();
                C6935n1.m14725a(n1Var);
                C6935n1.this.mo23659a(this.f13018f, "onGlobalLayout", "fl.layout.time", "fl.layout.runtime.memory", "fl.layout.system.memory");
                boolean unused = C6935n1.this.f13016g = true;
                if (C6935n1.this.f13015f) {
                    C6935n1.this.mo23657a();
                }
            }
        }

        C6936a() {
        }

        /* renamed from: a */
        public final void mo23660a() {
        }

        /* renamed from: a */
        public final void mo23661a(Activity activity) {
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new C6937a(activity));
        }

        /* renamed from: b */
        public final void mo23662b(Activity activity) {
        }

        /* renamed from: c */
        public final void mo23663c(Activity activity) {
            C6935n1.this.mo23659a(activity, "onActivityResumed", "fl.resume.time", "fl.resume.runtime.memory", "fl.resume.system.memory");
        }
    }

    private C6935n1() {
    }

    /* renamed from: b */
    public static synchronized C6935n1 m14727b() {
        C6935n1 n1Var;
        synchronized (C6935n1.class) {
            if (f13008h == null) {
                f13008h = new C6935n1();
            }
            n1Var = f13008h;
        }
        return n1Var;
    }

    /* renamed from: a */
    public final void mo23658a(Context context, Cursor cursor) {
        if (this.f13014e == null) {
            boolean z = true;
            if (cursor != null) {
                cursor.moveToFirst();
                this.f13010a = cursor.getLong(0);
                this.f13011b = cursor.getLong(1);
                this.f13012c = cursor.getLong(2);
                cursor.close();
            } else {
                Runtime runtime = Runtime.getRuntime();
                ActivityManager.MemoryInfo a = C6970p1.m14806a(context);
                this.f13010a = f13009i;
                this.f13011b = runtime.totalMemory() - runtime.freeMemory();
                this.f13012c = a.totalMem - a.availMem;
            }
            StringBuilder sb = new StringBuilder("Registered with Content Provider: ");
            if (cursor == null) {
                z = false;
            }
            sb.append(z);
            sb.append(", start time: ");
            sb.append(this.f13010a);
            sb.append(", runtime memory: ");
            sb.append(this.f13011b);
            sb.append(", system memory: ");
            sb.append(this.f13012c);
            C6792d1.m14476a(3, "ColdStartMonitor", sb.toString());
            this.f13014e = new C6936a();
            C6951o1.m14763a().mo23669a(this.f13014e);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23657a() {
        if (!this.f13013d.isEmpty()) {
            C6792d1.m14476a(4, "ColdStartMonitor", "Log Cold Start time event: " + this.f13013d);
            C6724a.m14355a().mo23527a("Flurry.ColdStartTime", C7051v3.C7052a.PERFORMANCE, this.f13013d);
            this.f13013d.clear();
        }
    }

    /* renamed from: a */
    public final void mo23659a(Context context, String str, String str2, String str3, String str4) {
        double nanoTime = (double) (System.nanoTime() - this.f13010a);
        Double.isNaN(nanoTime);
        long j = (long) (nanoTime / 1000000.0d);
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.totalMemory() - runtime.freeMemory();
        long j2 = freeMemory - this.f13011b;
        long j3 = 0;
        if (j2 < 0) {
            j2 = 0;
        }
        ActivityManager.MemoryInfo a = C6970p1.m14806a(context);
        long j4 = a.totalMem - a.availMem;
        long j5 = j4 - this.f13012c;
        if (j5 >= 0) {
            j3 = j5;
        }
        C6792d1.m14476a(3, "ColdStartMonitor", str + " time: " + j + ", runtime memory usage: " + freeMemory + ", system memory usage: " + j4);
        this.f13013d.put(str2, Long.toString(j));
        this.f13013d.put(str3, Long.toString(j2));
        this.f13013d.put(str4, Long.toString(j3));
    }

    /* renamed from: a */
    static /* synthetic */ void m14725a(C6935n1 n1Var) {
        if (n1Var.f13014e != null) {
            C6951o1 a = C6951o1.m14763a();
            C6951o1.C6953b bVar = n1Var.f13014e;
            synchronized (a.f13054b) {
                a.f13054b.remove(bVar);
            }
            n1Var.f13014e = null;
        }
    }
}
