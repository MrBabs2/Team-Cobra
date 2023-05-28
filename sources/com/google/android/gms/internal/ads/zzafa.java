package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzafa extends IInterface {
    /* renamed from: C */
    zzaei mo27233C() throws RemoteException;

    /* renamed from: a */
    zzaea mo27234a() throws RemoteException;

    /* renamed from: a */
    void mo27235a(Bundle bundle) throws RemoteException;

    /* renamed from: b */
    String mo27236b() throws RemoteException;

    /* renamed from: b */
    boolean mo27237b(Bundle bundle) throws RemoteException;

    /* renamed from: c */
    String mo27238c() throws RemoteException;

    /* renamed from: c */
    void mo27239c(Bundle bundle) throws RemoteException;

    /* renamed from: d */
    String mo27240d() throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: e */
    IObjectWrapper mo27242e() throws RemoteException;

    /* renamed from: f */
    List mo27243f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: j */
    IObjectWrapper mo27247j() throws RemoteException;

    /* renamed from: l */
    String mo27248l() throws RemoteException;
}
