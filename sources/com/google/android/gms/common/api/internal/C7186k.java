package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.api.internal.k */
final class C7186k extends C7210w {

    /* renamed from: b */
    private final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f13805b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7186k(C7182i iVar, zabd zabd, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabd);
        this.f13805b = connectionProgressReportCallbacks;
    }

    /* renamed from: a */
    public final void mo25100a() {
        this.f13805b.mo25038a(new ConnectionResult(16, (PendingIntent) null));
    }
}
