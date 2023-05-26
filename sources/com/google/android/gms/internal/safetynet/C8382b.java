package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.safetynet.zzk;

/* renamed from: com.google.android.gms.internal.safetynet.b */
final class C8382b extends zzk.C8384a {
    C8382b(zzk zzk, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo24798a(Api.AnyClient anyClient) throws RemoteException {
        ((zzi) ((zzx) anyClient).getService()).mo30515a(this.f23580s);
    }
}
