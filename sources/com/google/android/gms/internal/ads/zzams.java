package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzams extends IInterface {
    /* renamed from: B0 */
    Bundle mo27402B0() throws RemoteException;

    /* renamed from: Q */
    IObjectWrapper mo27403Q() throws RemoteException;

    /* renamed from: U */
    zzang mo27404U() throws RemoteException;

    /* renamed from: a */
    void mo27405a(IObjectWrapper iObjectWrapper, zzaiq zzaiq, List<zzaiw> list) throws RemoteException;

    /* renamed from: a */
    void mo27406a(IObjectWrapper iObjectWrapper, zzatk zzatk, List<String> list) throws RemoteException;

    /* renamed from: a */
    void mo27407a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException;

    /* renamed from: a */
    void mo27408a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzatk zzatk, String str2) throws RemoteException;

    /* renamed from: a */
    void mo27409a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException;

    /* renamed from: a */
    void mo27410a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv, zzady zzady, List<String> list) throws RemoteException;

    /* renamed from: a */
    void mo27411a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, zzamv zzamv) throws RemoteException;

    /* renamed from: a */
    void mo27412a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException;

    /* renamed from: a */
    void mo27413a(zzxz zzxz, String str) throws RemoteException;

    /* renamed from: a */
    void mo27414a(zzxz zzxz, String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo27415b(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException;

    /* renamed from: c1 */
    zzand mo27416c1() throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: g0 */
    zzafe mo27418g0() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    /* renamed from: n0 */
    boolean mo27422n0() throws RemoteException;

    /* renamed from: n1 */
    zzana mo27423n1() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    /* renamed from: t */
    void mo27429t(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: w */
    void mo27430w(IObjectWrapper iObjectWrapper) throws RemoteException;

    Bundle zzsh() throws RemoteException;
}
