package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public interface zad extends IInterface {
    /* renamed from: a */
    void mo30689a(ConnectionResult connectionResult, zaa zaa) throws RemoteException;

    /* renamed from: a */
    void mo30690a(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;

    /* renamed from: a */
    void mo25109a(zaj zaj) throws RemoteException;

    /* renamed from: e */
    void mo30691e(Status status) throws RemoteException;

    /* renamed from: f */
    void mo30692f(Status status) throws RemoteException;
}
