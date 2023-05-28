package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzadl extends IInterface {
    /* renamed from: Y0 */
    String mo27187Y0() throws RemoteException;

    String getContent() throws RemoteException;

    /* renamed from: h */
    void mo27189h(IObjectWrapper iObjectWrapper) throws RemoteException;

    void recordClick() throws RemoteException;

    void recordImpression() throws RemoteException;
}
