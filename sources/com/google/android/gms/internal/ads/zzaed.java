package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

@zzard
public final class zzaed extends NativeAd.AdChoicesInfo {

    /* renamed from: a */
    private final zzaea f18050a;

    /* renamed from: b */
    private final List<NativeAd.Image> f18051b = new ArrayList();

    /* renamed from: c */
    private String f18052c;

    public zzaed(zzaea zzaea) {
        zzaei zzaei;
        IBinder iBinder;
        this.f18050a = zzaea;
        try {
            this.f18052c = zzaea.mo27194M();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            this.f18052c = "";
        }
        try {
            for (zzaei next : zzaea.mo27193H()) {
                if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                    zzaei = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzaei = queryLocalInterface instanceof zzaei ? (zzaei) queryLocalInterface : new zzaek(iBinder);
                }
                if (zzaei != null) {
                    this.f18051b.add(new zzael(zzaei));
                }
            }
        } catch (RemoteException e2) {
            zzbad.m20520b("", e2);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.f18051b;
    }

    public final CharSequence getText() {
        return this.f18052c;
    }
}
