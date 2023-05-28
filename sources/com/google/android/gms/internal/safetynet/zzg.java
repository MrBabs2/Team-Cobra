package com.google.android.gms.internal.safetynet;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import com.google.android.gms.safetynet.zzh;

public interface zzg extends IInterface {
    /* renamed from: a */
    void mo30507a(Status status) throws RemoteException;

    /* renamed from: a */
    void mo30508a(Status status, SafeBrowsingData safeBrowsingData) throws RemoteException;

    /* renamed from: a */
    void mo30509a(Status status, zza zza) throws RemoteException;

    /* renamed from: a */
    void mo30500a(Status status, zzd zzd) throws RemoteException;

    /* renamed from: a */
    void mo30510a(Status status, zzf zzf) throws RemoteException;

    /* renamed from: a */
    void mo30511a(Status status, zzh zzh) throws RemoteException;

    /* renamed from: a */
    void mo30512a(Status status, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo30513b(Status status, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo30514b(String str) throws RemoteException;
}
