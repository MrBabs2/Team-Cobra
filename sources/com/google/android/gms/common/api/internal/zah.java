package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zah extends C7191m0<Boolean> {

    /* renamed from: b */
    private final ListenerHolder.ListenerKey<?> f13968b;

    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f13968b = listenerKey;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25166a(zaab zaab, boolean z) {
    }

    /* renamed from: b */
    public final Feature[] mo25176b(GoogleApiManager.zaa<?> zaa) {
        zabw zabw = zaa.mo25054i().get(this.f13968b);
        if (zabw == null) {
            return null;
        }
        return zabw.f13939a.mo25087c();
    }

    /* renamed from: c */
    public final boolean mo25177c(GoogleApiManager.zaa<?> zaa) {
        zabw zabw = zaa.mo25054i().get(this.f13968b);
        return zabw != null && zabw.f13939a.mo25088d();
    }

    /* renamed from: d */
    public final void mo25113d(GoogleApiManager.zaa<?> zaa) throws RemoteException {
        zabw remove = zaa.mo25054i().remove(this.f13968b);
        if (remove != null) {
            remove.f13940b.mo25092a(zaa.mo25051f(), this.f13812a);
            remove.f13939a.mo25084a();
            return;
        }
        this.f13812a.mo30714b(false);
    }
}
