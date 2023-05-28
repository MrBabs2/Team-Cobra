package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.google.android.gms.common.internal.service.b */
final class C7242b extends C7245e {
    C7242b(zad zad, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo24798a(Api.AnyClient anyClient) throws RemoteException {
        ((zal) ((zai) anyClient).getService()).mo25411a(new C7243c(this));
    }
}
