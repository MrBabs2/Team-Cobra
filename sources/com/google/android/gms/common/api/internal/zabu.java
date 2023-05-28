package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public class zabu extends zal {

    /* renamed from: k */
    private TaskCompletionSource<Void> f13935k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25148a(ConnectionResult connectionResult, int i) {
        this.f13935k.mo30711a((Exception) ApiExceptionUtil.m15937a(new Status(connectionResult.mo24840d(), connectionResult.mo24843o(), connectionResult.mo24844p())));
    }

    /* renamed from: b */
    public void mo25069b() {
        super.mo25069b();
        this.f13935k.mo30713b((Exception) new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo25149f() {
        int c = this.f13986j.mo24869c((Context) this.f13761f.mo25074a());
        if (c == 0) {
            this.f13935k.mo30712a(null);
        } else if (!this.f13935k.mo30710a().mo30708c()) {
            mo25193b(new ConnectionResult(c, (PendingIntent) null), 0);
        }
    }
}
