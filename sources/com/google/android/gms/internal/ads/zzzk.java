package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzzk extends IInterface {
    /* renamed from: I */
    IObjectWrapper mo27066I() throws RemoteException;

    /* renamed from: I0 */
    zzzs mo27067I0() throws RemoteException;

    /* renamed from: S0 */
    zzyz mo27068S0() throws RemoteException;

    /* renamed from: V0 */
    zzyd mo27069V0() throws RemoteException;

    /* renamed from: a */
    void mo27070a(zzaax zzaax) throws RemoteException;

    /* renamed from: a */
    void mo27071a(zzacd zzacd) throws RemoteException;

    /* renamed from: a */
    void mo27072a(zzado zzado) throws RemoteException;

    /* renamed from: a */
    void mo27073a(zzaqn zzaqn) throws RemoteException;

    /* renamed from: a */
    void mo27074a(zzaqt zzaqt, String str) throws RemoteException;

    /* renamed from: a */
    void mo27075a(zzatb zzatb) throws RemoteException;

    /* renamed from: a */
    void mo27076a(zzyd zzyd) throws RemoteException;

    /* renamed from: a */
    void mo27077a(zzyw zzyw) throws RemoteException;

    /* renamed from: a */
    void mo27078a(zzyz zzyz) throws RemoteException;

    /* renamed from: a */
    void mo27079a(zzzp zzzp) throws RemoteException;

    /* renamed from: a */
    void mo27080a(zzzs zzzs) throws RemoteException;

    /* renamed from: a */
    void mo27081a(zzzy zzzy) throws RemoteException;

    /* renamed from: b */
    boolean mo27082b(zzxz zzxz) throws RemoteException;

    /* renamed from: d1 */
    String mo27083d1() throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: f */
    void mo27085f(boolean z) throws RemoteException;

    /* renamed from: g1 */
    void mo27086g1() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: k */
    void mo27090k(String str) throws RemoteException;

    /* renamed from: m */
    boolean mo27091m() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    /* renamed from: v */
    String mo27097v() throws RemoteException;

    /* renamed from: w0 */
    void mo27098w0() throws RemoteException;

    /* renamed from: y */
    boolean mo27099y() throws RemoteException;
}
