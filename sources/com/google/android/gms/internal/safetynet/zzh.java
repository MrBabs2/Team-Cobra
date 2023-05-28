package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;

public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30504a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo30509a((Status) zzc.m26768a(parcel, Status.CREATOR), (zza) zzc.m26768a(parcel, zza.CREATOR));
        } else if (i == 2) {
            mo30514b(parcel.readString());
        } else if (i == 3) {
            mo30508a((Status) zzc.m26768a(parcel, Status.CREATOR), (SafeBrowsingData) zzc.m26768a(parcel, SafeBrowsingData.CREATOR));
        } else if (i == 4) {
            mo30513b((Status) zzc.m26768a(parcel, Status.CREATOR), zzc.m26770a(parcel));
        } else if (i == 6) {
            mo30510a((Status) zzc.m26768a(parcel, Status.CREATOR), (zzf) zzc.m26768a(parcel, zzf.CREATOR));
        } else if (i == 8) {
            mo30500a((Status) zzc.m26768a(parcel, Status.CREATOR), (zzd) zzc.m26768a(parcel, zzd.CREATOR));
        } else if (i == 15) {
            mo30511a((Status) zzc.m26768a(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zzh) zzc.m26768a(parcel, com.google.android.gms.safetynet.zzh.CREATOR));
        } else if (i == 10) {
            mo30512a((Status) zzc.m26768a(parcel, Status.CREATOR), zzc.m26770a(parcel));
        } else if (i != 11) {
            return false;
        } else {
            mo30507a((Status) zzc.m26768a(parcel, Status.CREATOR));
        }
        return true;
    }
}
