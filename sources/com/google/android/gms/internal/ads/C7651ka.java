package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@zzard
/* renamed from: com.google.android.gms.internal.ads.ka */
final class C7651ka {

    /* renamed from: a */
    private final ArrayList<zzsa> f15824a = new ArrayList<>();

    /* renamed from: b */
    private long f15825b;

    C7651ka() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo26170a() {
        Iterator<zzsa> it = this.f15824a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> a = it.next().mo29708a();
            if (a != null) {
                for (Map.Entry next : a.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.f15825b = Math.max(this.f15825b, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f15825b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26171a(zzsa zzsa) {
        this.f15824a.add(zzsa);
    }
}
