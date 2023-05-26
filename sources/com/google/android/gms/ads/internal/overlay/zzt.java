package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzxr;

@zzard
public final class zzt extends zzaqh {
    private AdOverlayInfoParcel zzdkw;
    private boolean zzdkx = false;
    private boolean zzdky = false;
    private Activity zzzd;

    public zzt(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdkw = adOverlayInfoParcel;
        this.zzzd = activity;
    }

    private final synchronized void zztp() {
        if (!this.zzdky) {
            if (this.zzdkw.zzdkm != null) {
                this.zzdkw.zzdkm.zzsz();
            }
            this.zzdky = true;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    public final void onBackPressed() throws RemoteException {
    }

    public final void onCreate(Bundle bundle) {
        zzo zzo;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdkw;
        if (adOverlayInfoParcel == null) {
            this.zzzd.finish();
        } else if (z) {
            this.zzzd.finish();
        } else {
            if (bundle == null) {
                zzxr zzxr = adOverlayInfoParcel.zzcgi;
                if (zzxr != null) {
                    zzxr.onAdClicked();
                }
                if (!(this.zzzd.getIntent() == null || !this.zzzd.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (zzo = this.zzdkw.zzdkm) == null)) {
                    zzo.zzta();
                }
            }
            zzk.zzle();
            Activity activity = this.zzzd;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdkw;
            if (!zza.zza((Context) activity, adOverlayInfoParcel2.zzdkl, adOverlayInfoParcel2.zzdkq)) {
                this.zzzd.finish();
            }
        }
    }

    public final void onDestroy() throws RemoteException {
        if (this.zzzd.isFinishing()) {
            zztp();
        }
    }

    public final void onPause() throws RemoteException {
        zzo zzo = this.zzdkw.zzdkm;
        if (zzo != null) {
            zzo.onPause();
        }
        if (this.zzzd.isFinishing()) {
            zztp();
        }
    }

    public final void onRestart() throws RemoteException {
    }

    public final void onResume() throws RemoteException {
        if (this.zzdkx) {
            this.zzzd.finish();
            return;
        }
        this.zzdkx = true;
        zzo zzo = this.zzdkw.zzdkm;
        if (zzo != null) {
            zzo.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdkx);
    }

    public final void onStart() throws RemoteException {
    }

    public final void onStop() throws RemoteException {
        if (this.zzzd.isFinishing()) {
            zztp();
        }
    }

    public final void zzac(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzdd() throws RemoteException {
    }

    public final boolean zztg() throws RemoteException {
        return false;
    }
}
