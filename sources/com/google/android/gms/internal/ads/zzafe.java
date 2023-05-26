package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzafe extends IInterface {
    /* renamed from: L0 */
    IObjectWrapper mo27249L0() throws RemoteException;

    /* renamed from: c */
    String mo27250c(String str) throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: e */
    zzaei mo27252e(String str) throws RemoteException;

    List<String> getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: j */
    IObjectWrapper mo27256j() throws RemoteException;

    void performClick(String str) throws RemoteException;

    /* renamed from: r */
    boolean mo27258r(IObjectWrapper iObjectWrapper) throws RemoteException;

    void recordImpression() throws RemoteException;
}
