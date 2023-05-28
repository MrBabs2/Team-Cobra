package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzk;

@zzard
public final class zzaxa extends zzdbh {
    public zzaxa(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27763a(Message message) {
        try {
            super.mo27763a(message);
        } catch (Throwable th) {
            zzk.zzlg();
            zzaxi.m20276a(zzk.zzlk().mo27731a(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            zzk.zzlk().mo27734a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }
}
