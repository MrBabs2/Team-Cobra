package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzana extends IInterface {
    /* renamed from: a */
    zzaea mo27455a() throws RemoteException;

    /* renamed from: a */
    void mo27456a(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: a */
    void mo27457a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    /* renamed from: b */
    String mo27458b() throws RemoteException;

    /* renamed from: b */
    void mo27459b(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: c */
    String mo27460c() throws RemoteException;

    /* renamed from: d */
    String mo27461d() throws RemoteException;

    /* renamed from: e */
    IObjectWrapper mo27462e() throws RemoteException;

    /* renamed from: e */
    void mo27463e(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: f */
    List mo27464f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getStore() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h */
    zzaei mo27468h() throws RemoteException;

    /* renamed from: i */
    String mo27469i() throws RemoteException;

    /* renamed from: k */
    double mo27470k() throws RemoteException;

    /* renamed from: n */
    boolean mo27471n() throws RemoteException;

    /* renamed from: p */
    IObjectWrapper mo27472p() throws RemoteException;

    /* renamed from: q */
    IObjectWrapper mo27473q() throws RemoteException;

    /* renamed from: r */
    boolean mo27474r() throws RemoteException;

    void recordImpression() throws RemoteException;
}
