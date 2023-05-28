package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
final class C7148a extends C7152e<Status> {
    C7148a(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Result mo24797a(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo24798a(Api.AnyClient anyClient) throws RemoteException {
        zzg zzg = (zzg) anyClient;
        ((zzu) zzg.getService()).mo24818a(new C7149b(this), zzg.mo24807d());
    }
}
