package com.flurry.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.v3 */
public final class C7051v3 extends C6993q6 {

    /* renamed from: b */
    public final String f13267b;

    /* renamed from: c */
    public int f13268c;

    /* renamed from: d */
    public final C7052a f13269d;

    /* renamed from: e */
    public final Map<String, String> f13270e;

    /* renamed from: f */
    public final Map<String, String> f13271f;

    /* renamed from: g */
    public final boolean f13272g;

    /* renamed from: h */
    public final boolean f13273h;

    /* renamed from: i */
    public final long f13274i;

    /* renamed from: j */
    public final long f13275j;

    /* renamed from: k */
    public long f13276k;

    /* renamed from: com.flurry.sdk.v3$a */
    public enum C7052a {
        UNKNOWN(0),
        CUSTOM(1),
        PURCHASE(8),
        MESSAGE(9),
        USER_STANDARD(10),
        PERFORMANCE(1),
        SDK_LOG(1);
        

        /* renamed from: f */
        final int f13285f;

        private C7052a(int i) {
            this.f13285f = i;
        }
    }

    public C7051v3(String str, int i, C7052a aVar, Map<String, String> map, Map<String, String> map2, boolean z, boolean z2, long j, long j2, long j3) {
        this.f13138a = 2;
        this.f13267b = str;
        this.f13268c = i;
        this.f13269d = aVar;
        this.f13270e = map;
        this.f13271f = map2;
        this.f13272g = z;
        this.f13273h = z2;
        this.f13274i = j;
        this.f13275j = j2;
        this.f13276k = j3;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        JSONObject a = super.mo23540a();
        a.put("fl.event.name", this.f13267b);
        a.put("fl.event.id", this.f13268c);
        a.put("fl.event.type", this.f13269d.f13285f);
        a.put("fl.event.timed", this.f13272g);
        a.put("fl.timed.event.starting", this.f13273h);
        long j = this.f13276k;
        if (j > 0) {
            a.put("fl.timed.event.duration", j);
        }
        a.put("fl.event.timestamp", this.f13274i);
        a.put("fl.event.uptime", this.f13275j);
        a.put("fl.event.user.parameters", C6807e2.m14505a(this.f13270e));
        a.put("fl.event.flurry.parameters", C6807e2.m14505a(this.f13271f));
        return a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7051v3(java.lang.String r17, int r18, com.flurry.sdk.C7051v3.C7052a r19, java.util.Map<java.lang.String, java.lang.String> r20, java.util.Map<java.lang.String, java.lang.String> r21, java.util.List<java.lang.String> r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            r16 = this;
            r0 = r20
            java.lang.String r1 = com.flurry.sdk.C6766c2.m14416a((java.lang.String) r17)
            java.lang.String r3 = com.flurry.sdk.C6766c2.m14422b(r1)
            if (r0 == 0) goto L_0x0013
            r1 = r22
            java.util.Map r0 = m14955a(r0, r1)
            goto L_0x001a
        L_0x0013:
            r1 = r22
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x001a:
            r6 = r0
            if (r21 == 0) goto L_0x0022
            java.util.Map r0 = m14955a(r21, r22)
            goto L_0x0027
        L_0x0022:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x0027:
            r7 = r0
            r14 = 0
            r2 = r16
            r4 = r18
            r5 = r19
            r8 = r23
            r9 = r24
            r10 = r25
            r12 = r27
            r2.<init>((java.lang.String) r3, (int) r4, (com.flurry.sdk.C7051v3.C7052a) r5, (java.util.Map<java.lang.String, java.lang.String>) r6, (java.util.Map<java.lang.String, java.lang.String>) r7, (boolean) r8, (boolean) r9, (long) r10, (long) r12, (long) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C7051v3.<init>(java.lang.String, int, com.flurry.sdk.v3$a, java.util.Map, java.util.Map, java.util.List, boolean, boolean, long, long):void");
    }

    /* renamed from: a */
    private static Map<String, String> m14955a(Map<String, String> map, List<String> list) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            if (!list.contains(next.getKey())) {
                str = C6766c2.m14422b((String) next.getKey());
                str2 = C6766c2.m14422b((String) next.getValue());
            } else {
                str = C6766c2.m14422b((String) next.getKey());
                str2 = (String) next.getValue();
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }
}
