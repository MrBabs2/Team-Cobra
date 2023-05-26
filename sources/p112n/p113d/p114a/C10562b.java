package p112n.p113d.p114a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.flurry.sdk.C6724a;
import com.flurry.sdk.C6747b0;
import com.flurry.sdk.C6766c2;
import com.flurry.sdk.C6792d1;
import com.flurry.sdk.C6812e7;
import com.flurry.sdk.C6823f7;
import com.flurry.sdk.C6896k0;
import com.flurry.sdk.C6913l;
import com.flurry.sdk.C6925m2;
import com.flurry.sdk.C7024t;
import com.flurry.sdk.C7045v;
import com.flurry.sdk.C7071w4;
import com.flurry.sdk.C7074x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: n.d.a.b */
public final class C10562b {

    /* renamed from: n.d.a.b$a */
    public static class C5297a {

        /* renamed from: a */
        private C10564c f9483a = null;

        /* renamed from: b */
        private boolean f9484b = false;

        /* renamed from: c */
        private int f9485c = 5;

        /* renamed from: d */
        private long f9486d = 10000;

        /* renamed from: e */
        private boolean f9487e = true;

        /* renamed from: f */
        private boolean f9488f = true;

        /* renamed from: g */
        private boolean f9489g = false;

        /* renamed from: h */
        private int f9490h = C5298f.f9495a;

        /* renamed from: i */
        private List<C10566e> f9491i = new ArrayList();

        /* renamed from: j */
        private C10561a f9492j;

        /* renamed from: k */
        private boolean f9493k = false;

        /* renamed from: l */
        private boolean f9494l = false;

        /* renamed from: a */
        public C5297a mo18289a(boolean z) {
            this.f9487e = z;
            return this;
        }

        /* renamed from: b */
        public C5297a mo18291b(boolean z) {
            this.f9488f = z;
            return this;
        }

        /* renamed from: c */
        public C5297a mo18292c(boolean z) {
            this.f9484b = z;
            return this;
        }

        /* renamed from: a */
        public C5297a mo18288a(int i) {
            this.f9490h = i;
            return this;
        }

        /* renamed from: a */
        public void mo18290a(Context context, String str) {
            boolean z;
            Context context2 = context;
            if (C10562b.m35859b()) {
                if (!TextUtils.isEmpty(str)) {
                    C6747b0.m14387a(context);
                    C6896k0.m14646c().f12902b = str;
                    C6724a a = C6724a.m14355a();
                    C10564c cVar = this.f9483a;
                    boolean z2 = this.f9484b;
                    int i = this.f9485c;
                    long j = this.f9486d;
                    boolean z3 = this.f9487e;
                    boolean z4 = this.f9488f;
                    boolean z5 = this.f9489g;
                    int i2 = this.f9490h;
                    List<C10566e> list = this.f9491i;
                    C10561a aVar = this.f9492j;
                    boolean z6 = this.f9493k;
                    boolean z7 = this.f9494l;
                    if (C6724a.f12515o.get()) {
                        C6792d1.m14487d("FlurryAgentImpl", "Invalid call to Init. Flurry is already initialized");
                        return;
                    }
                    boolean z8 = z7;
                    C6792d1.m14487d("FlurryAgentImpl", "Initializing Flurry SDK");
                    if (C6724a.f12515o.get()) {
                        C6792d1.m14487d("FlurryAgentImpl", "Invalid call to register. Flurry is already initialized");
                    } else {
                        a.f12517n = list;
                    }
                    C6925m2.m14707a();
                    a.mo23563c(new C6724a.C6726b(a, context2, list));
                    C7071w4 a2 = C7071w4.m15014a();
                    C6812e7 a3 = C6812e7.m14513a();
                    String str2 = "FlurryAgentImpl";
                    if (a3 != null) {
                        z = z6;
                        a3.f12696a.mo23582a((C6823f7<C7024t>) a2.f13325g);
                        a3.f12697b.mo23582a((C6823f7<C7045v>) a2.f13326h);
                        a3.f12698c.mo23582a(a2.f13323e);
                        a3.f12699d.mo23582a(a2.f13324f);
                        a3.f12700e.mo23582a(a2.f13329k);
                        a3.f12701f.mo23582a(a2.f13321c);
                        a3.f12702g.mo23582a((C6823f7<C6913l>) a2.f13322d);
                        a3.f12703h.mo23582a(a2.f13328j);
                        a3.f12704i.mo23582a(a2.f13319a);
                        a3.f12705j.mo23582a((C6823f7<C7074x>) a2.f13327i);
                        a3.f12706k.mo23582a(a2.f13320b);
                        a3.f12707l.mo23582a(a2.f13330l);
                        a3.f12709n.mo23582a(a2.f13331m);
                        a3.f12710o.mo23582a(a2.f13332n);
                        a3.f12711p.mo23582a(a2.f13333o);
                    } else {
                        z = z6;
                    }
                    C6896k0.m14646c().mo23631b();
                    C6812e7.m14513a().f12704i.mo23570a();
                    C6812e7.m14513a().f12701f.f12585p = z3;
                    if (aVar != null) {
                        C6812e7.m14513a().f12707l.mo23648a(aVar);
                    }
                    if (z2) {
                        C6792d1.m14480b();
                    } else {
                        C6792d1.m14474a();
                    }
                    C6792d1.m14475a(i);
                    a.mo23563c(new C6724a.C6725a(a, j, cVar));
                    a.mo23563c(new C6724a.C6731g(a, z4, z5));
                    a.mo23563c(new C6724a.C6728d(a, i2, context2));
                    a.mo23563c(new C6724a.C6729e(a, z));
                    C6724a.f12515o.set(true);
                    if (z8) {
                        C6792d1.m14487d(str2, "Force start session");
                        a.mo23530a(context.getApplicationContext());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("API key not specified");
            }
        }
    }

    /* renamed from: n.d.a.b$b */
    public static class C10563b {
        /* renamed from: a */
        public static void m35860a(String str, String str2) {
            if (C10562b.m35859b()) {
                C6724a a = C6724a.m14355a();
                if (!C6724a.f12515o.get()) {
                    C6792d1.m14487d("FlurryAgentImpl", "Invalid call to UserProperties.add. Flurry is not initialized");
                } else {
                    a.mo23563c(new C6724a.C6727c(a, str, str2));
                }
            }
        }
    }

    /* renamed from: b */
    public static void m35858b(Context context) {
        if (m35859b()) {
            C6724a.m14355a().mo23530a(context);
        }
    }

    /* renamed from: a */
    public static void m35855a(Context context) {
        if (m35859b()) {
            C6724a a = C6724a.m14355a();
            if (context instanceof Activity) {
                C6792d1.m14478a("FlurryAgentImpl", "Activity's session is controlled by Flurry SDK");
            } else if (!C6724a.f12515o.get()) {
                C6792d1.m14487d("FlurryAgentImpl", "Invalid call to onStartSession. Flurry is not initialized");
            } else {
                a.mo23563c(new C6724a.C6732h(a));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m35859b() {
        if (C6766c2.m14421a(16)) {
            return true;
        }
        C6792d1.m14483b("FlurryAgent", String.format(Locale.getDefault(), "Device SDK Version older than %d", new Object[]{16}));
        return false;
    }

    /* renamed from: a */
    public static C10565d m35853a(String str) {
        C10565d dVar = C10565d.kFlurryEventFailed;
        if (!m35859b()) {
            return dVar;
        }
        return C6724a.m14355a().mo23529a(str, Collections.emptyMap(), false, false);
    }

    /* renamed from: a */
    public static C10565d m35854a(String str, Map<String, String> map) {
        C10565d dVar = C10565d.kFlurryEventFailed;
        if (!m35859b()) {
            return dVar;
        }
        if (str == null) {
            C6792d1.m14483b("FlurryAgent", "String eventId passed to logEvent was null.");
            return dVar;
        }
        if (map == null) {
            C6792d1.m14485c("FlurryAgent", "String parameters passed to logEvent was null.");
        }
        return C6724a.m14355a().mo23529a(str, map, false, false);
    }

    /* renamed from: a */
    public static void m35856a(String str, String str2, Throwable th, Map<String, String> map) {
        if (m35859b()) {
            C6724a a = C6724a.m14355a();
            if (!C6724a.f12515o.get()) {
                C6792d1.m14487d("FlurryAgentImpl", "Invalid call to onError. Flurry is not initialized");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            a.mo23563c(new C6724a.C6734j(a, str, currentTimeMillis, str2, th, hashMap));
        }
    }
}
