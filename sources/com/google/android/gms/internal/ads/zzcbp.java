package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

public final class zzcbp {

    /* renamed from: a */
    private final Executor f19904a;

    /* renamed from: b */
    private final zzbmy f19905b;

    /* renamed from: c */
    private final zzbva f19906c;

    zzcbp(Executor executor, zzbmy zzbmy, zzbva zzbva) {
        this.f19904a = executor;
        this.f19906c = zzbva;
        this.f19905b = zzbmy;
    }

    /* renamed from: a */
    public final void mo28634a(zzbgz zzbgz) {
        if (zzbgz != null) {
            this.f19906c.mo28454a(zzbgz.getView());
            this.f19906c.mo28428a(new C7396dh(zzbgz), this.f19904a);
            this.f19906c.mo28428a(new C7433eh(zzbgz), this.f19904a);
            this.f19906c.mo28428a(this.f19905b, this.f19904a);
            this.f19905b.mo28275a(zzbgz);
            zzbgz.mo25662a("/trackActiveViewUnit", (zzaho<? super zzbgz>) new C7470fh(this));
            zzbgz.mo25662a("/untrackActiveViewUnit", (zzaho<? super zzbgz>) new C7506gh(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28636b(zzbgz zzbgz, Map map) {
        this.f19905b.mo28279n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28635a(zzbgz zzbgz, Map map) {
        this.f19905b.mo28278j();
    }
}
