package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzang extends IInterface {
    /* renamed from: a */
    zzaea mo27495a() throws RemoteException;

    /* renamed from: a */
    void mo27496a(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: a */
    void mo27497a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    /* renamed from: b */
    String mo27498b() throws RemoteException;

    /* renamed from: b */
    void mo27499b(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: c */
    String mo27500c() throws RemoteException;

    /* renamed from: d */
    String mo27501d() throws RemoteException;

    /* renamed from: e */
    IObjectWrapper mo27502e() throws RemoteException;

    /* renamed from: f */
    List mo27503f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getStore() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h */
    zzaei mo27507h() throws RemoteException;

    /* renamed from: i */
    String mo27508i() throws RemoteException;

    /* renamed from: k */
    double mo27509k() throws RemoteException;

    /* renamed from: l */
    String mo27510l() throws RemoteException;

    /* renamed from: n */
    boolean mo27511n() throws RemoteException;

    /* renamed from: p */
    IObjectWrapper mo27512p() throws RemoteException;

    /* renamed from: q */
    IObjectWrapper mo27513q() throws RemoteException;

    /* renamed from: r */
    boolean mo27514r() throws RemoteException;

    void recordImpression() throws RemoteException;

    /* renamed from: v0 */
    float mo27516v0() throws RemoteException;
}
