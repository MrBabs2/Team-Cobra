package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.sdk.C7051v3;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import p112n.p113d.p114a.C10562b;

/* renamed from: com.flurry.sdk.g0 */
public final class C6826g0 {

    /* renamed from: b */
    private static boolean f12758b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f12759c = false;

    /* renamed from: d */
    private static C6826g0 f12760d;

    /* renamed from: a */
    private int f12761a = C6971p2.m14811b("invalid.payload.count", 0);

    /* renamed from: com.flurry.sdk.g0$b */
    public enum C6828b {
        UNKNOWN(0),
        SUCCEED(1),
        IOEXCEPTION(2),
        EOF(3),
        PAYLOAD_ERROR(4),
        FRAME_MISSING(5);
        

        /* renamed from: f */
        public String f12772f;

        /* renamed from: g */
        public int f12773g;

        /* renamed from: h */
        public int f12774h;

        /* renamed from: i */
        public List<C7023s6> f12775i;

        /* renamed from: j */
        public Set<C7023s6> f12776j;

        private C6828b(int i) {
            this.f12772f = null;
            this.f12773g = 0;
            this.f12774h = 0;
            this.f12775i = null;
            this.f12776j = null;
        }
    }

    /* renamed from: com.flurry.sdk.g0$c */
    public static class C6829c {

        /* renamed from: a */
        int f12777a = 0;

        /* renamed from: a */
        public final void mo23593a(int i) {
            this.f12777a += i;
        }
    }

    private C6826g0() {
    }

    /* renamed from: b */
    public static synchronized C6826g0 m14532b() {
        C6826g0 g0Var;
        synchronized (C6826g0.class) {
            if (f12760d == null) {
                f12760d = new C6826g0();
            }
            g0Var = f12760d;
        }
        return g0Var;
    }

    /* renamed from: a */
    public final synchronized void mo23590a(C6828b bVar) {
        if (f12759c) {
            HashMap hashMap = new HashMap();
            hashMap.put("fl.length", String.valueOf(bVar.f12773g));
            hashMap.put("fl.frame.count", String.valueOf(bVar.f12774h));
            hashMap.put("fl.last.frame.type", String.valueOf((bVar.f12775i == null || bVar.f12775i.isEmpty()) ? C7023s6.UNKNOWN : bVar.f12775i.get(bVar.f12775i.size() - 1)));
            hashMap.put("fl.failure.type", String.valueOf(bVar));
            hashMap.put("fl.failure.reason", bVar.f12772f);
            hashMap.put("fl.mandatory.frames", String.valueOf(bVar.f12776j));
            bVar.f12772f = null;
            bVar.f12773g = 0;
            bVar.f12774h = 0;
            bVar.f12775i = null;
            bVar.f12776j = null;
            int i = this.f12761a + 1;
            this.f12761a = i;
            C6971p2.m14808a("invalid.payload.count", i);
            m14531a("Flurry.SDKReport.PayloadError", hashMap);
        }
    }

    /* renamed from: b */
    public static void m14533b(String str, Map<String, String> map) {
        if (f12758b && C6724a.m14356d()) {
            C6724a.m14355a().mo23527a(str, C7051v3.C7052a.SDK_LOG, map);
            C6792d1.m14476a(4, "SDKLogManager", "Log SDK internal events. " + str + "SDKLogManager");
        }
    }

    /* renamed from: com.flurry.sdk.g0$a */
    public static class C6827a {

        /* renamed from: a */
        int f12762a;

        /* renamed from: b */
        Set<C7023s6> f12763b;

        /* renamed from: c */
        int f12764c;

        public C6827a() {
            if (C6826g0.f12759c) {
                this.f12762a = C6971p2.m14811b("drop.frame.count", 0);
                this.f12763b = new TreeSet();
                String b = C6971p2.m14813b("drop.frame.types", "");
                if (!TextUtils.isEmpty(b)) {
                    for (String parseInt : b.split(",")) {
                        try {
                            this.f12763b.add(C7023s6.m14900a(Integer.parseInt(parseInt)));
                        } catch (NumberFormatException e) {
                            C6792d1.m14476a(5, "SDKLogManager", "Cannot retrieve frame type from preferences: " + e.getMessage());
                        }
                    }
                }
                this.f12764c = C6971p2.m14811b("auto.end.timed.events", 0);
            }
        }

        /* renamed from: a */
        public final synchronized void mo23592a(C7023s6 s6Var) {
            if (C6826g0.f12759c) {
                this.f12762a++;
                this.f12763b.add(s6Var);
                C6971p2.m14808a("drop.frame.count", this.f12762a);
                StringBuilder sb = new StringBuilder();
                for (C7023s6 next : this.f12763b) {
                    if (sb.length() != 0) {
                        sb.append(',');
                    }
                    sb.append(next.f13210f);
                }
                C6971p2.m14810a("drop.frame.types", sb.toString());
            }
        }

        /* renamed from: a */
        public final synchronized void mo23591a() {
            if (C6826g0.f12759c) {
                int i = this.f12764c + 1;
                this.f12764c = i;
                C6971p2.m14808a("auto.end.timed.events", i);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo23589a() {
        if (f12759c) {
            C6829c b = C6925m2.m14707a().f12988c.mo23625b();
            C6827a b2 = C6925m2.m14707a().f12986a.f13215a.mo23747b();
            HashMap hashMap = new HashMap();
            hashMap.put("fl.invalid.payload.count", String.valueOf(this.f12761a));
            hashMap.put("fl.payload.queue.size", String.valueOf(b.f12777a));
            hashMap.put("fl.drop.frame.count", String.valueOf(b2.f12762a));
            hashMap.put("fl.drop.frame.types", String.valueOf(b2.f12763b));
            hashMap.put("fl.auto.end.timed.events", String.valueOf(b2.f12764c));
            this.f12761a = 0;
            b.f12777a = 0;
            b2.f12762a = 0;
            b2.f12763b.clear();
            b2.f12764c = 0;
            C6971p2.m14808a("invalid.payload.count", 0);
            C6971p2.m14808a("drop.frame.count", 0);
            C6971p2.m14810a("drop.frame.types", "");
            C6971p2.m14808a("auto.end.timed.events", 0);
            m14531a("Flurry.SDKReport.SessionSummary", hashMap);
        }
    }

    /* renamed from: a */
    public static void m14531a(String str, Map<String, String> map) {
        if (f12759c && C6724a.m14356d()) {
            C6724a.m14355a().mo23527a(str, C7051v3.C7052a.SDK_LOG, map);
            C6792d1.m14476a(4, "SDKLogManager", "Log SDK events: " + str + " with " + map);
        }
    }

    /* renamed from: a */
    public static void m14530a(String str, String str2, Throwable th) {
        Map emptyMap = Collections.emptyMap();
        if (C6724a.m14356d()) {
            C10562b.m35856a(str, str2, th, emptyMap);
            C6792d1.m14476a(4, "SDKLogManager", "Log SDK internal errors. " + str2 + "SDKLogManager");
        }
    }
}
