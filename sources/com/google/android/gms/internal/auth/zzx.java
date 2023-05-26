package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public interface zzx extends IInterface {
    /* renamed from: H0 */
    void mo29969H0() throws RemoteException;

    /* renamed from: a */
    void mo29970a(DeviceMetaData deviceMetaData) throws RemoteException;

    /* renamed from: a */
    void mo29971a(Status status, zzl zzl) throws RemoteException;

    /* renamed from: a */
    void mo29972a(Status status, zzt zzt) throws RemoteException;

    /* renamed from: b */
    void mo29973b(byte[] bArr) throws RemoteException;

    /* renamed from: g */
    void mo29974g(Status status) throws RemoteException;

    /* renamed from: h */
    void mo29975h(Status status) throws RemoteException;
}
