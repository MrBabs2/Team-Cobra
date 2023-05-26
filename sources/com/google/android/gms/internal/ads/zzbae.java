package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@zzard
public final class zzbae {
    /* renamed from: a */
    public static <T> T m20528a(Context context, String str, zzbaf<IBinder, T> zzbaf) throws zzbag {
        try {
            return zzbaf.apply(m20529b(context).mo25547a(str));
        } catch (Exception e) {
            throw new zzbag(e);
        }
    }

    /* renamed from: b */
    private static DynamiteModule m20529b(Context context) throws zzbag {
        try {
            return DynamiteModule.m16419a(context, DynamiteModule.f14300i, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzbag(e);
        }
    }

    /* renamed from: a */
    public static Context m20527a(Context context) throws zzbag {
        return m20529b(context).mo25546a();
    }
}
