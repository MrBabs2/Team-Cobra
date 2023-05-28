package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
final class C7195o0 implements Runnable {

    /* renamed from: f */
    private final C7193n0 f13818f;

    /* renamed from: g */
    final /* synthetic */ zal f13819g;

    C7195o0(zal zal, C7193n0 n0Var) {
        this.f13819g = zal;
        this.f13818f = n0Var;
    }

    public final void run() {
        if (this.f13819g.f13983g) {
            ConnectionResult a = this.f13818f.mo25114a();
            if (a.mo24845q()) {
                zal zal = this.f13819g;
                zal.f13761f.startActivityForResult(GoogleApiActivity.m15327a(zal.mo25065a(), a.mo24844p(), this.f13818f.mo25115b(), false), 1);
            } else if (this.f13819g.f13986j.mo24871c(a.mo24840d())) {
                zal zal2 = this.f13819g;
                zal2.f13986j.mo24865a(zal2.mo25065a(), this.f13819g.f13761f, a.mo24840d(), 2, this.f13819g);
            } else if (a.mo24840d() == 18) {
                Dialog a2 = GoogleApiAvailability.m15254a(this.f13819g.mo25065a(), (DialogInterface.OnCancelListener) this.f13819g);
                zal zal3 = this.f13819g;
                zal3.f13986j.mo24864a(zal3.mo25065a().getApplicationContext(), (zabr) new C7197p0(this, a2));
            } else {
                this.f13819g.mo25148a(a, this.f13818f.mo25115b());
            }
        }
    }
}
