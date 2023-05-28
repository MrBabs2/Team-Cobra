package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p189authapi.zzd;
import com.google.android.gms.internal.p189authapi.zze;

public abstract class zzt extends zzd implements zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24817a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                mo24803a((GoogleSignInAccount) zze.m25782a(parcel, GoogleSignInAccount.CREATOR), (Status) zze.m25782a(parcel, Status.CREATOR));
                break;
            case 102:
                mo24799b((Status) zze.m25782a(parcel, Status.CREATOR));
                break;
            case 103:
                mo24800c((Status) zze.m25782a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
