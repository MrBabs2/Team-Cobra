package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzaew extends IInterface {
    /* renamed from: a */
    zzaea mo27214a() throws RemoteException;

    /* renamed from: a */
    void mo27215a(Bundle bundle) throws RemoteException;

    /* renamed from: b */
    String mo27216b() throws RemoteException;

    /* renamed from: b */
    boolean mo27217b(Bundle bundle) throws RemoteException;

    /* renamed from: c */
    String mo27218c() throws RemoteException;

    /* renamed from: c */
    void mo27219c(Bundle bundle) throws RemoteException;

    /* renamed from: d */
    String mo27220d() throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: e */
    IObjectWrapper mo27222e() throws RemoteException;

    /* renamed from: f */
    List mo27223f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    String getStore() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h */
    zzaei mo27228h() throws RemoteException;

    /* renamed from: i */
    String mo27229i() throws RemoteException;

    /* renamed from: j */
    IObjectWrapper mo27230j() throws RemoteException;

    /* renamed from: k */
    double mo27231k() throws RemoteException;
}
