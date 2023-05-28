package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zacp {

    /* renamed from: d */
    public static final Status f13957d = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: e */
    private static final BasePendingResult<?>[] f13958e = new BasePendingResult[0];
    @VisibleForTesting

    /* renamed from: a */
    final Set<BasePendingResult<?>> f13959a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final C7189l0 f13960b = new C7185j0(this);

    /* renamed from: c */
    private final Map<Api.AnyClientKey<?>, Api.Client> f13961c;

    public zacp(Map<Api.AnyClientKey<?>, Api.Client> map) {
        this.f13961c = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25183a(BasePendingResult<? extends Result> basePendingResult) {
        this.f13959a.add(basePendingResult);
        basePendingResult.mo25013a(this.f13960b);
    }

    /* renamed from: b */
    public final void mo25184b() {
        for (BasePendingResult b : (BasePendingResult[]) this.f13959a.toArray(f13958e)) {
            b.mo25014b(f13957d);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.ResultCallback, com.google.android.gms.common.api.internal.l0, com.google.android.gms.common.api.zac, com.google.android.gms.common.api.internal.j0] */
    /* renamed from: a */
    public final void mo25182a() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f13959a.toArray(f13958e)) {
            ? r5 = 0;
            basePendingResult.mo25013a((C7189l0) r5);
            if (basePendingResult.mo25017d() != null) {
                basePendingResult.mo24965a(r5);
                IBinder serviceBrokerBinder = this.f13961c.get(((BaseImplementation.ApiMethodImpl) basePendingResult).mo25011h()).getServiceBrokerBinder();
                if (basePendingResult.mo25016c()) {
                    basePendingResult.mo25013a((C7189l0) new C7187k0(basePendingResult, r5, serviceBrokerBinder, r5));
                } else if (serviceBrokerBinder == null || !serviceBrokerBinder.isBinderAlive()) {
                    basePendingResult.mo25013a((C7189l0) r5);
                    basePendingResult.mo24914a();
                    r5.mo25208a(basePendingResult.mo25017d().intValue());
                } else {
                    C7187k0 k0Var = new C7187k0(basePendingResult, r5, serviceBrokerBinder, r5);
                    basePendingResult.mo25013a((C7189l0) k0Var);
                    try {
                        serviceBrokerBinder.linkToDeath(k0Var, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.mo24914a();
                        r5.mo25208a(basePendingResult.mo25017d().intValue());
                    }
                }
                this.f13959a.remove(basePendingResult);
            } else if (basePendingResult.mo25018e()) {
                this.f13959a.remove(basePendingResult);
            }
        }
    }
}
