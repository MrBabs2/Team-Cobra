package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzand extends IInterface {
    /* renamed from: C */
    zzaei mo27476C() throws RemoteException;

    /* renamed from: a */
    zzaea mo27477a() throws RemoteException;

    /* renamed from: a */
    void mo27478a(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: a */
    void mo27479a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    /* renamed from: b */
    String mo27480b() throws RemoteException;

    /* renamed from: b */
    void mo27481b(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: c */
    String mo27482c() throws RemoteException;

    /* renamed from: d */
    String mo27483d() throws RemoteException;

    /* renamed from: e */
    IObjectWrapper mo27484e() throws RemoteException;

    /* renamed from: e */
    void mo27485e(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: f */
    List mo27486f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: l */
    String mo27489l() throws RemoteException;

    /* renamed from: n */
    boolean mo27490n() throws RemoteException;

    /* renamed from: p */
    IObjectWrapper mo27491p() throws RemoteException;

    /* renamed from: q */
    IObjectWrapper mo27492q() throws RemoteException;

    /* renamed from: r */
    boolean mo27493r() throws RemoteException;

    void recordImpression() throws RemoteException;
}
