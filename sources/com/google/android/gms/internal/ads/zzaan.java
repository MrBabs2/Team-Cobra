package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

@zzard
public final class zzaan implements MuteThisAdReason {

    /* renamed from: a */
    private final String f17675a;

    /* renamed from: b */
    private zzaak f17676b;

    public zzaan(zzaak zzaak) {
        String str;
        this.f17676b = zzaak;
        try {
            str = zzaak.getDescription();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            str = null;
        }
        this.f17675a = str;
    }

    /* renamed from: a */
    public final zzaak mo26926a() {
        return this.f17676b;
    }

    public final String getDescription() {
        return this.f17675a;
    }
}
