package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zal extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: g */
    protected volatile boolean f13983g;

    /* renamed from: h */
    protected final AtomicReference<C7193n0> f13984h;

    /* renamed from: i */
    private final Handler f13985i;

    /* renamed from: j */
    protected final GoogleApiAvailability f13986j;

    protected zal(LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, GoogleApiAvailability.m15256a());
    }

    /* renamed from: a */
    public void mo25067a(Bundle bundle) {
        super.mo25067a(bundle);
        if (bundle != null) {
            this.f13984h.set(bundle.getBoolean("resolving_error", false) ? new C7193n0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25148a(ConnectionResult connectionResult, int i);

    /* renamed from: b */
    public void mo25070b(Bundle bundle) {
        super.mo25070b(bundle);
        C7193n0 n0Var = this.f13984h.get();
        if (n0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", n0Var.mo25115b());
            bundle.putInt("failed_status", n0Var.mo25114a().mo24840d());
            bundle.putParcelable("failed_resolution", n0Var.mo25114a().mo24844p());
        }
    }

    /* renamed from: d */
    public void mo25072d() {
        super.mo25072d();
        this.f13983g = true;
    }

    /* renamed from: e */
    public void mo25073e() {
        super.mo25073e();
        this.f13983g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo25149f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25194g() {
        this.f13984h.set((Object) null);
        mo25149f();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo25148a(new ConnectionResult(13, (PendingIntent) null), m15842a(this.f13984h.get()));
        mo25194g();
    }

    @VisibleForTesting
    private zal(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.f13984h = new AtomicReference<>((Object) null);
        this.f13985i = new zap(Looper.getMainLooper());
        this.f13986j = googleApiAvailability;
    }

    /* renamed from: b */
    public final void mo25193b(ConnectionResult connectionResult, int i) {
        C7193n0 n0Var = new C7193n0(connectionResult, i);
        if (this.f13984h.compareAndSet((Object) null, n0Var)) {
            this.f13985i.post(new C7195o0(this, n0Var));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25066a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.n0> r0 = r3.f13984h
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.n0 r0 = (com.google.android.gms.common.api.internal.C7193n0) r0
            r1 = 1
            r2 = 0
            if (r4 == r1) goto L_0x0030
            r5 = 2
            if (r4 == r5) goto L_0x0010
            goto L_0x0055
        L_0x0010:
            com.google.android.gms.common.GoogleApiAvailability r4 = r3.f13986j
            android.app.Activity r5 = r3.mo25065a()
            int r4 = r4.mo24869c((android.content.Context) r5)
            if (r4 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.common.ConnectionResult r5 = r0.mo25114a()
            int r5 = r5.mo24840d()
            r6 = 18
            if (r5 != r6) goto L_0x0056
            if (r4 != r6) goto L_0x0056
            return
        L_0x0030:
            r4 = -1
            if (r5 != r4) goto L_0x0034
            goto L_0x0056
        L_0x0034:
            if (r5 != 0) goto L_0x0055
            r4 = 13
            if (r6 == 0) goto L_0x0040
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x0040:
            com.google.android.gms.common.api.internal.n0 r5 = new com.google.android.gms.common.api.internal.n0
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = m15842a((com.google.android.gms.common.api.internal.C7193n0) r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.n0> r4 = r3.f13984h
            r4.set(r5)
            r0 = r5
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x005c
            r3.mo25194g()
            return
        L_0x005c:
            if (r0 == 0) goto L_0x0069
            com.google.android.gms.common.ConnectionResult r4 = r0.mo25114a()
            int r5 = r0.mo25115b()
            r3.mo25148a(r4, r5)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zal.mo25066a(int, int, android.content.Intent):void");
    }

    /* renamed from: a */
    private static int m15842a(C7193n0 n0Var) {
        if (n0Var == null) {
            return -1;
        }
        return n0Var.mo25115b();
    }
}
