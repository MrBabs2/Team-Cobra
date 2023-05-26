package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;
import p050l.p066e.C4868a;

public final class zak {

    /* renamed from: a */
    private final C4868a<zai<?>, ConnectionResult> f13978a = new C4868a<>();

    /* renamed from: b */
    private final C4868a<zai<?>, String> f13979b = new C4868a<>();

    /* renamed from: c */
    private final TaskCompletionSource<Map<zai<?>, String>> f13980c = new TaskCompletionSource<>();

    /* renamed from: d */
    private int f13981d;

    /* renamed from: e */
    private boolean f13982e = false;

    public zak(Iterable<? extends GoogleApi<?>> iterable) {
        for (GoogleApi g : iterable) {
            this.f13978a.put(g.mo24931g(), null);
        }
        this.f13981d = this.f13978a.keySet().size();
    }

    /* renamed from: a */
    public final Task<Map<zai<?>, String>> mo25190a() {
        return this.f13980c.mo30710a();
    }

    /* renamed from: b */
    public final Set<zai<?>> mo25192b() {
        return this.f13978a.keySet();
    }

    /* renamed from: a */
    public final void mo25191a(zai<?> zai, ConnectionResult connectionResult, String str) {
        this.f13978a.put(zai, connectionResult);
        this.f13979b.put(zai, str);
        this.f13981d--;
        if (!connectionResult.mo24846t()) {
            this.f13982e = true;
        }
        if (this.f13981d != 0) {
            return;
        }
        if (this.f13982e) {
            this.f13980c.mo30711a((Exception) new AvailabilityException(this.f13978a));
            return;
        }
        this.f13980c.mo30712a(this.f13979b);
    }
}
