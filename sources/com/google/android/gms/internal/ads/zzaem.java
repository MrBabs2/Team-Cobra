package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzaem extends IInterface {
    /* renamed from: a */
    void mo27101a(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    /* renamed from: b */
    void mo27102b(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: c */
    void mo27103c(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: d */
    void mo27104d(IObjectWrapper iObjectWrapper) throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: l */
    IObjectWrapper mo27106l(String str) throws RemoteException;
}
