package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

abstract class j60<T> {

    /* renamed from: a */
    private static final zzzv f15735a = m17325c();

    j60() {
    }

    /* renamed from: c */
    private static zzzv m17325c() {
        try {
            Object newInstance = zzyh.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi2").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzbad.m20523d("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            if (queryLocalInterface instanceof zzzv) {
                return (zzzv) queryLocalInterface;
            }
            return new zzzx(iBinder);
        } catch (Exception unused) {
            zzbad.m20523d("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    /* renamed from: d */
    private final T m17326d() {
        zzzv zzzv = f15735a;
        if (zzzv == null) {
            zzbad.m20523d("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo25571a(zzzv);
        } catch (RemoteException e) {
            zzbad.m20522c("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: e */
    private final T m17327e() {
        try {
            return mo25572b();
        } catch (RemoteException e) {
            zzbad.m20522c("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo25570a();

    /* renamed from: a */
    public final T mo26124a(Context context, boolean z) {
        T t;
        boolean z2 = true;
        if (!z) {
            zzyt.m25666a();
            if (!zzazt.m20482c(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzbad.m20516a("Google Play Services is not available.");
                z = true;
            }
        }
        if (DynamiteModule.m16417a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.m16423b(context, ModuleDescriptor.MODULE_ID)) {
            z = true;
        }
        zzacu.m18983a(context);
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17972u2)).booleanValue()) {
            z = false;
        }
        if (z) {
            t = m17326d();
            if (t == null) {
                t = m17327e();
            }
        } else {
            T e = m17327e();
            int i = e == null ? 1 : 0;
            if (i != 0) {
                if (zzyt.m25673h().nextInt(((Integer) zzyt.m25670e().mo27163a(zzacu.f17906f3)).intValue()) != 0) {
                    z2 = false;
                }
                if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    zzyt.m25666a().mo27879a(context, zzyt.m25672g().f18742f, "gmob-apps", bundle, true);
                }
            }
            t = e == null ? m17326d() : e;
        }
        return t == null ? mo25570a() : t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo25571a(zzzv zzzv) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo25572b() throws RemoteException;
}
