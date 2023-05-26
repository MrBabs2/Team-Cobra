package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzatt extends IInterface {
    /* renamed from: a */
    void mo27110a(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo27111a(zzaao zzaao) throws RemoteException;

    /* renamed from: a */
    void mo27112a(zzatw zzatw) throws RemoteException;

    /* renamed from: a */
    void mo27113a(zzaue zzaue) throws RemoteException;

    /* renamed from: a */
    void mo27114a(zzaum zzaum) throws RemoteException;

    /* renamed from: a */
    void mo27115a(zzxz zzxz, zzaub zzaub) throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    /* renamed from: k1 */
    zzatq mo27119k1() throws RemoteException;

    /* renamed from: y */
    void mo27120y(IObjectWrapper iObjectWrapper) throws RemoteException;
}
