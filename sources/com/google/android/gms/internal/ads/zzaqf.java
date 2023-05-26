package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
public final class zzaqf extends RemoteCreator<zzaqj> {
    public zzaqf() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final zzaqg mo27567a(Activity activity) {
        try {
            IBinder A = ((zzaqj) mo25545a((Context) activity)).mo27568A(ObjectWrapper.m16391a(activity));
            if (A == null) {
                return null;
            }
            IInterface queryLocalInterface = A.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzaqg) {
                return (zzaqg) queryLocalInterface;
            }
            return new zzaqi(A);
        } catch (RemoteException e) {
            zzbad.m20522c("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzbad.m20522c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25389a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzaqj) {
            return (zzaqj) queryLocalInterface;
        }
        return new zzaqk(iBinder);
    }
}
