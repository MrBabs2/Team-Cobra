package com.flurry.sdk;

import com.flurry.sdk.C6817f3;
import com.flurry.sdk.C6826g0;
import com.flurry.sdk.C6888j3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.v2 */
final class C7049v2 extends C6767c3 {

    /* renamed from: r */
    protected List<C6817f3> f13262r;

    /* renamed from: s */
    protected final Map<String, List<C7044u6>> f13263s = new HashMap();

    /* renamed from: t */
    protected C6826g0.C6827a f13264t;

    /* renamed from: com.flurry.sdk.v2$a */
    class C7050a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C7044u6 f13265h;

        C7050a(C7044u6 u6Var) {
            this.f13265h = u6Var;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C7049v2.m14948a(C7049v2.this, C7049v2.m14945a(C7049v2.this, this.f13265h));
            C7049v2.m14949b(C7049v2.this, this.f13265h);
        }
    }

    C7049v2(C7079x2 x2Var) {
        super("DropModule", x2Var);
        ArrayList arrayList = new ArrayList();
        this.f13262r = arrayList;
        arrayList.add(new C6808e3());
        this.f13262r.add(new C6794d3());
        this.f13262r.add(new C6832g3());
        this.f13262r.add(new C6848h3());
        this.f13264t = new C6826g0.C6827a();
    }

    /* renamed from: b */
    static /* synthetic */ void m14949b(C7049v2 v2Var, C7044u6 u6Var) {
        if (m14951f(u6Var)) {
            C6792d1.m14476a(4, "DropModule", "Resetting drop rules");
            for (C6817f3 a : v2Var.f13262r) {
                a.mo23576a();
            }
            C6792d1.m14476a(4, "DropModule", "Reset start timed event record");
            v2Var.f13263s.clear();
        }
    }

    /* renamed from: e */
    private List<C7044u6> m14950e(C7044u6 u6Var) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<C7044u6>> value : this.f13263s.entrySet()) {
            for (C7044u6 f : (List) value.getValue()) {
                C7051v3 v3Var = (C7051v3) f.mo23714f();
                String str = v3Var.f13267b;
                int i = v3Var.f13268c;
                long currentTimeMillis = System.currentTimeMillis();
                arrayList.add(C7041u3.m14929a(str, i, v3Var.f13270e, v3Var.f13271f, currentTimeMillis, currentTimeMillis - v3Var.f13274i));
                this.f13264t.mo23591a();
            }
        }
        arrayList.add(u6Var);
        return arrayList;
    }

    /* renamed from: f */
    private static boolean m14951f(C7044u6 u6Var) {
        return u6Var.mo23538a().equals(C7023s6.FLUSH_FRAME) && ((C7022s5) u6Var.mo23714f()).f13169c.equals(C6888j3.C6889a.REASON_SESSION_FINALIZE.f12890f);
    }

    /* renamed from: a */
    public final void mo23533a(C7044u6 u6Var) {
        mo23563c(new C7050a(u6Var));
    }

    /* renamed from: a */
    private static void m14947a(C7044u6 u6Var, C7044u6 u6Var2) {
        C7051v3 v3Var = (C7051v3) u6Var.mo23714f();
        C7051v3 v3Var2 = (C7051v3) u6Var2.mo23714f();
        v3Var2.f13268c = v3Var.f13268c;
        v3Var2.f13276k = v3Var2.f13274i - v3Var.f13274i;
        Map<String, String> map = v3Var.f13270e;
        Map<String, String> map2 = v3Var2.f13270e;
        if (map != null && map2 != null) {
            Map<String, String> map3 = v3Var.f13271f;
            Map<String, String> map4 = v3Var2.f13271f;
            if (map3.get(C6766c2.m14422b("fl.parameter.limit.exceeded")) != null) {
                map4.putAll(map3);
                map2.clear();
                return;
            }
            if (!map.isEmpty()) {
                for (Map.Entry next : map.entrySet()) {
                    if (!map2.containsKey(next.getKey())) {
                        map2.put(next.getKey(), next.getValue());
                    }
                }
            }
            if (map2.size() > 10) {
                map4.put(C6766c2.m14422b("fl.parameter.limit.exceeded.on.endevent"), C6766c2.m14422b(String.valueOf(map2.size())));
                map2.clear();
                map2.putAll(map);
            }
        }
    }

    /* renamed from: a */
    private void m14946a(C6817f3.C6818a aVar, C7044u6 u6Var) {
        this.f13264t.mo23592a(u6Var.mo23538a());
        if (!aVar.f12734a.equals(C6817f3.C6819b.DROP_STANDARD_EVENTS_COUNT_EXCEEDED)) {
            HashMap hashMap = new HashMap();
            hashMap.put("fl.drop.reason", aVar.f12734a.f12747f);
            hashMap.put("fl.drop.frame.type", String.valueOf(u6Var.mo23538a()));
            C6826g0.m14532b();
            C6826g0.m14531a("Flurry.SDKReport.DropFrame", hashMap);
        }
    }

    /* renamed from: a */
    public final C6826g0.C6827a mo23570a() {
        return this.f13264t;
    }

    /* renamed from: a */
    static /* synthetic */ List m14945a(C7049v2 v2Var, C7044u6 u6Var) {
        if (u6Var.mo23538a().equals(C7023s6.ANALYTICS_EVENT) && ((C7051v3) u6Var.mo23714f()).f13272g) {
            ArrayList arrayList = new ArrayList();
            String str = ((C7051v3) u6Var.mo23714f()).f13267b;
            List list = v2Var.f13263s.get(str);
            if (((C7051v3) u6Var.mo23714f()).f13273h) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(u6Var);
                v2Var.f13263s.put(str, list);
                arrayList.add(u6Var);
                return arrayList;
            } else if (list == null || list.isEmpty()) {
                v2Var.m14946a(C6817f3.f12730f, u6Var);
                return arrayList;
            } else {
                m14947a((C7044u6) list.remove(0), u6Var);
                arrayList.add(u6Var);
                return arrayList;
            }
        } else if (m14951f(u6Var)) {
            return v2Var.m14950e(u6Var);
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(u6Var);
            return arrayList2;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14948a(C7049v2 v2Var, List list) {
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7044u6 u6Var = (C7044u6) it.next();
            Iterator<C6817f3> it2 = v2Var.f13262r.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                C6817f3.C6818a a = it2.next().mo23575a(u6Var);
                if (!a.f12734a.equals(C6817f3.C6819b.DO_NOT_DROP)) {
                    v2Var.m14946a(a, u6Var);
                    z = true;
                    break;
                }
                C7044u6 u6Var2 = a.f12735b;
                if (u6Var2 != null) {
                    v2Var.mo23558d(u6Var2);
                }
            }
            if (!z) {
                C6792d1.m14476a(4, "DropModule", "Adding Frame:" + u6Var.mo23712d());
                v2Var.mo23558d(u6Var);
            } else {
                C6792d1.m14476a(4, "DropModule", "Dropping Frame: " + u6Var.mo23538a() + ": " + u6Var.mo23712d());
            }
        }
    }
}
