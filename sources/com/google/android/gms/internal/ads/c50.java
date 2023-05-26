package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

final /* synthetic */ class c50 implements Runnable {

    /* renamed from: f */
    private final b50 f14706f;

    /* renamed from: g */
    private final zzvu f14707g;

    /* renamed from: h */
    private final zzvv f14708h;

    /* renamed from: i */
    private final zzbbr f14709i;

    c50(b50 b50, zzvu zzvu, zzvv zzvv, zzbbr zzbbr) {
        this.f14706f = b50;
        this.f14707g = zzvu;
        this.f14708h = zzvv;
        this.f14709i = zzbbr;
    }

    public final void run() {
        b50 b50 = this.f14706f;
        zzvu zzvu = this.f14707g;
        zzvv zzvv = this.f14708h;
        zzbbr zzbbr = this.f14709i;
        try {
            zzvs a = zzvu.mo29850c().mo29855a(zzvv);
            if (!a.mo29845d()) {
                zzbbr.mo27903a(new RuntimeException("No entry contents."));
                b50.f14554c.m25457a();
                return;
            }
            e50 e50 = new e50(b50, a.mo29846o(), 1);
            int read = e50.read();
            if (read != -1) {
                e50.unread(read);
                zzbbr.mo27904b(e50);
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            zzbad.m20520b("Unable to obtain a cache service instance.", e);
            zzbbr.mo27903a(e);
            b50.f14554c.m25457a();
        }
    }
}
