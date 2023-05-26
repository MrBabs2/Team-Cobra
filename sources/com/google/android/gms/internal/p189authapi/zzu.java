package com.google.android.gms.internal.p189authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzu */
public interface zzu extends IInterface {
    /* renamed from: a */
    void mo29943a(Status status, Credential credential) throws RemoteException;

    /* renamed from: a */
    void mo29944a(Status status, String str) throws RemoteException;

    /* renamed from: i */
    void mo29945i(Status status) throws RemoteException;
}
