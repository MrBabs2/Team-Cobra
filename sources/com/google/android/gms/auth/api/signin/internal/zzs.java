package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface zzs extends IInterface {
    /* renamed from: a */
    void mo24803a(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;

    /* renamed from: b */
    void mo24799b(Status status) throws RemoteException;

    /* renamed from: c */
    void mo24800c(Status status) throws RemoteException;
}
