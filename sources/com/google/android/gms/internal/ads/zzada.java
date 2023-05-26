package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@zzard
public final class zzada {
    /* renamed from: a */
    public static void m18998a(zzacy zzacy, zzacx zzacx) {
        if (zzacx.mo27167a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(zzacx.mo27168b())) {
            zzacy.mo27173a(zzacx.mo27167a(), zzacx.mo27168b(), zzacx.mo27169c(), zzacx.mo27170d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
