package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.GoogleApiManager;

public final class zaf extends C7191m0<Void> {

    /* renamed from: b */
    private final RegisterListenerMethod<Api.AnyClient, ?> f13963b;

    /* renamed from: c */
    private final UnregisterListenerMethod<Api.AnyClient, ?> f13964c;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25166a(zaab zaab, boolean z) {
    }

    /* renamed from: b */
    public final Feature[] mo25176b(GoogleApiManager.zaa<?> zaa) {
        return this.f13963b.mo25087c();
    }

    /* renamed from: c */
    public final boolean mo25177c(GoogleApiManager.zaa<?> zaa) {
        return this.f13963b.mo25088d();
    }

    /* renamed from: d */
    public final void mo25113d(GoogleApiManager.zaa<?> zaa) throws RemoteException {
        this.f13963b.mo25085a(zaa.mo25051f(), this.f13812a);
        if (this.f13963b.mo25086b() != null) {
            zaa.mo25054i().put(this.f13963b.mo25086b(), new zabw(this.f13963b, this.f13964c));
        }
    }
}
