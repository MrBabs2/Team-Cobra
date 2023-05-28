package com.flurry.sdk;

import android.os.SystemClock;
import com.flurry.sdk.C7051v3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p112n.p113d.p114a.C10565d;

/* renamed from: com.flurry.sdk.u3 */
public final class C7041u3 extends C7008r6 {

    /* renamed from: e */
    private static final AtomicInteger f13242e = new AtomicInteger(0);

    private C7041u3(C7031t6 t6Var) {
        super(t6Var);
    }

    /* renamed from: a */
    public static C10565d m14930a(String str, C7051v3.C7052a aVar, Map<String, String> map, boolean z, boolean z2, long j, long j2) {
        HashMap hashMap;
        if (map.size() > 10) {
            hashMap = new HashMap();
            hashMap.put("fl.parameter.limit.exceeded", String.valueOf(map.size()));
            map.clear();
        } else {
            hashMap = null;
        }
        C7051v3.C7052a aVar2 = aVar;
        Map<String, String> map2 = map;
        C6925m2.m14707a().mo23649a(new C7041u3(new C7051v3(C6766c2.m14416a(str), f13242e.incrementAndGet(), aVar2, map2, (Map<String, String>) hashMap, (List<String>) new ArrayList(), z, z2, j, j2)));
        return C10565d.kFlurryEventRecorded;
    }

    /* renamed from: a */
    public final C7023s6 mo23538a() {
        return C7023s6.ANALYTICS_EVENT;
    }

    /* renamed from: a */
    public static C7041u3 m14929a(String str, int i, Map<String, String> map, Map<String, String> map2, long j, long j2) {
        return new C7041u3(new C7051v3(str, i, C7051v3.C7052a.CUSTOM, map, map2, true, false, j, SystemClock.elapsedRealtime(), j2));
    }
}
