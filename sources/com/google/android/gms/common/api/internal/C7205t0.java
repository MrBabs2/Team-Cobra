package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
final class C7205t0 implements zabt {

    /* renamed from: a */
    private final /* synthetic */ C7201r0 f13847a;

    private C7205t0(C7201r0 r0Var) {
        this.f13847a = r0Var;
    }

    /* renamed from: a */
    public final void mo25135a(Bundle bundle) {
        this.f13847a.f13839r.lock();
        try {
            this.f13847a.m15575a(bundle);
            ConnectionResult unused = this.f13847a.f13836o = ConnectionResult.f13608j;
            this.f13847a.m15589g();
        } finally {
            this.f13847a.f13839r.unlock();
        }
    }

    /* synthetic */ C7205t0(C7201r0 r0Var, C7203s0 s0Var) {
        this(r0Var);
    }

    /* renamed from: a */
    public final void mo25136a(ConnectionResult connectionResult) {
        this.f13847a.f13839r.lock();
        try {
            ConnectionResult unused = this.f13847a.f13836o = connectionResult;
            this.f13847a.m15589g();
        } finally {
            this.f13847a.f13839r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25134a(int i, boolean z) {
        this.f13847a.f13839r.lock();
        try {
            if (!this.f13847a.f13838q && this.f13847a.f13837p != null) {
                if (this.f13847a.f13837p.mo24846t()) {
                    boolean unused = this.f13847a.f13838q = true;
                    this.f13847a.f13831j.mo24960a(i);
                    this.f13847a.f13839r.unlock();
                    return;
                }
            }
            boolean unused2 = this.f13847a.f13838q = false;
            this.f13847a.m15574a(i, z);
        } finally {
            this.f13847a.f13839r.unlock();
        }
    }
}
