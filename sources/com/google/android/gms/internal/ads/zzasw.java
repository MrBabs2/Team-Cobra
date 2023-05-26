package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzasw extends IInterface {
    /* renamed from: B */
    void mo27121B(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: F */
    void mo27122F(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: a */
    void mo27123a(zzasu zzasu) throws RemoteException;

    /* renamed from: a */
    void mo27124a(zzatb zzatb) throws RemoteException;

    /* renamed from: a */
    void mo27125a(zzath zzath) throws RemoteException;

    /* renamed from: a */
    void mo27126a(zzzp zzzp) throws RemoteException;

    void destroy() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    /* renamed from: k */
    void mo27131k(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: o */
    void mo27132o(String str) throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setCustomData(String str) throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void show() throws RemoteException;

    /* renamed from: v */
    void mo27139v(IObjectWrapper iObjectWrapper) throws RemoteException;
}
