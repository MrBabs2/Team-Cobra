package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

@zzard
public final class zzabz extends zzaap {

    /* renamed from: f */
    private final OnAdMetadataChangedListener f17752f;

    public zzabz(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f17752f = onAdMetadataChangedListener;
    }

    public final void onAdMetadataChanged() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f17752f;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
