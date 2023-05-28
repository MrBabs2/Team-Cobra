package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

public interface zzamv extends IInterface {
    /* renamed from: J */
    void mo27432J() throws RemoteException;

    /* renamed from: a */
    void mo27433a(zzafe zzafe, String str) throws RemoteException;

    /* renamed from: a */
    void mo27434a(zzamy zzamy) throws RemoteException;

    /* renamed from: a */
    void mo27435a(zzato zzato) throws RemoteException;

    /* renamed from: a */
    void mo27436a(zzatq zzatq) throws RemoteException;

    /* renamed from: c */
    void mo27437c(int i) throws RemoteException;

    /* renamed from: i */
    void mo27438i(String str) throws RemoteException;

    /* renamed from: j1 */
    void mo27439j1() throws RemoteException;

    void onAdClicked() throws RemoteException;

    void onAdClosed() throws RemoteException;

    void onAdFailedToLoad(int i) throws RemoteException;

    void onAdImpression() throws RemoteException;

    void onAdLeftApplication() throws RemoteException;

    void onAdLoaded() throws RemoteException;

    void onAdOpened() throws RemoteException;

    void onAppEvent(String str, String str2) throws RemoteException;

    void onVideoPause() throws RemoteException;

    void onVideoPlay() throws RemoteException;

    /* renamed from: x */
    void mo27450x() throws RemoteException;

    void zzb(Bundle bundle) throws RemoteException;
}
