package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p189authapi.zzd;

public abstract class zzr extends zzd implements zzq {
    public zzr() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24817a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo24815X0();
        } else if (i != 2) {
            return false;
        } else {
            mo24816i1();
        }
        return true;
    }
}
