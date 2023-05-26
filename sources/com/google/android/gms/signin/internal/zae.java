package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zae extends zab implements zad {
    public zae() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25060a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 3) {
            mo30689a((ConnectionResult) zac.m25821a(parcel, ConnectionResult.CREATOR), (zaa) zac.m25821a(parcel, zaa.CREATOR));
        } else if (i == 4) {
            mo30691e((Status) zac.m25821a(parcel, Status.CREATOR));
        } else if (i == 6) {
            mo30692f((Status) zac.m25821a(parcel, Status.CREATOR));
        } else if (i == 7) {
            mo30690a((Status) zac.m25821a(parcel, Status.CREATOR), (GoogleSignInAccount) zac.m25821a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            mo25109a((zaj) zac.m25821a(parcel, zaj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
