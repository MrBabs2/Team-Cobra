package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

@zzard
public final class zzagl extends RemoteCreator<zzaeu> {
    @VisibleForTesting
    public zzagl() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final zzaer mo27302a(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder b = ((zzaeu) mo25545a(view.getContext())).mo27213b(ObjectWrapper.m16391a(view), ObjectWrapper.m16391a(hashMap), ObjectWrapper.m16391a(hashMap2));
            if (b == null) {
                return null;
            }
            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzaer) {
                return (zzaer) queryLocalInterface;
            }
            return new zzaet(b);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbad.m20522c("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25389a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzaeu) {
            return (zzaeu) queryLocalInterface;
        }
        return new zzaev(iBinder);
    }
}
