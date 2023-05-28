package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzwo {
    @VisibleForTesting

    /* renamed from: a */
    zzfx f22909a;
    @VisibleForTesting

    /* renamed from: b */
    boolean f22910b;

    public zzwo(Context context, String str, String str2) {
        zzacu.m18983a(context);
        try {
            this.f22909a = (zzfx) zzbae.m20528a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", i50.f15573a);
            ObjectWrapper.m16391a(context);
            this.f22909a.mo29285a(ObjectWrapper.m16391a(context), str, (String) null);
            this.f22910b = true;
        } catch (RemoteException | zzbag | NullPointerException unused) {
            zzbad.m20516a("Cannot dynamite load clearcut");
        }
    }

    /* renamed from: a */
    public final zzws mo29860a(byte[] bArr) {
        return new zzws(this, bArr);
    }

    public zzwo(Context context) {
        zzacu.m18983a(context);
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17952p2)).booleanValue()) {
            try {
                this.f22909a = (zzfx) zzbae.m20528a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", j50.f15733a);
                ObjectWrapper.m16391a(context);
                this.f22909a.mo29284a(ObjectWrapper.m16391a(context), "GMA_SDK");
                this.f22910b = true;
            } catch (RemoteException | zzbag | NullPointerException unused) {
                zzbad.m20516a("Cannot dynamite load clearcut");
            }
        }
    }

    public zzwo() {
    }
}
