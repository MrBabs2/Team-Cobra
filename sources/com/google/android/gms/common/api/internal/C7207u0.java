package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
final class C7207u0 implements zabt {

    /* renamed from: a */
    private final /* synthetic */ C7201r0 f13849a;

    private C7207u0(C7201r0 r0Var) {
        this.f13849a = r0Var;
    }

    /* renamed from: a */
    public final void mo25135a(Bundle bundle) {
        this.f13849a.f13839r.lock();
        try {
            ConnectionResult unused = this.f13849a.f13837p = ConnectionResult.f13608j;
            this.f13849a.m15589g();
        } finally {
            this.f13849a.f13839r.unlock();
        }
    }

    /* synthetic */ C7207u0(C7201r0 r0Var, C7203s0 s0Var) {
        this(r0Var);
    }

    /* renamed from: a */
    public final void mo25136a(ConnectionResult connectionResult) {
        this.f13849a.f13839r.lock();
        try {
            ConnectionResult unused = this.f13849a.f13837p = connectionResult;
            this.f13849a.m15589g();
        } finally {
            this.f13849a.f13839r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25134a(int i, boolean z) {
        this.f13849a.f13839r.lock();
        try {
            if (this.f13849a.f13838q) {
                boolean unused = this.f13849a.f13838q = false;
                this.f13849a.m15574a(i, z);
                return;
            }
            boolean unused2 = this.f13849a.f13838q = true;
            this.f13849a.f13830i.mo24960a(i);
            this.f13849a.f13839r.unlock();
        } finally {
            this.f13849a.f13839r.unlock();
        }
    }
}
