package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

public final class zzcqf extends zzatu {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public zzbbh<zzcdb> f20797f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzcdb f20798g;

    /* renamed from: h */
    private final zzbjm f20799h;

    /* renamed from: i */
    private final Context f20800i;

    /* renamed from: j */
    private final zzcqa f20801j = new zzcqa();

    /* renamed from: k */
    private final zzcqb f20802k = new zzcqb();

    /* renamed from: l */
    private final zzcpz f20803l = new zzcpz();

    /* renamed from: m */
    private zzbss f20804m;

    /* renamed from: n */
    private final String f20805n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f20806o = false;

    /* renamed from: p */
    private final zzcxx f20807p;

    public zzcqf(zzbjm zzbjm, Context context, String str) {
        zzcxx zzcxx = new zzcxx();
        zzcxx.f21194p.add("new_rewarded");
        this.f20807p = zzcxx;
        this.f20799h = zzbjm;
        this.f20800i = context;
        this.f20805n = str;
    }

    /* renamed from: a */
    public final synchronized void mo27115a(zzxz zzxz, zzaub zzaub) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        this.f20802k.mo28769a(zzaub);
        this.f20806o = false;
        if (this.f20797f == null) {
            if (this.f20798g == null) {
                zzcya.m23108a(this.f20800i, zzxz.f22986k);
                zzcxx zzcxx = this.f20807p;
                zzcxx.mo28825a(this.f20805n);
                zzcxx.mo28823a(zzyd.m25647d());
                zzcxx.mo28822a(zzxz);
                zzcxv c = zzcxx.mo28832c();
                zzcdg i = this.f20799h.mo28232i();
                zzbqy.zza zza = new zzbqy.zza();
                zza.mo28402a(this.f20800i);
                zza.mo28404a(c);
                zzcdg a = i.mo26133a(zza.mo28406a());
                zzbtv.zza zza2 = new zzbtv.zza();
                zza2.mo28441a((zzbrl) this.f20801j, this.f20799h.mo28224a());
                zza2.mo28445a((zzbsr) new C7476fn(this, this.f20802k), this.f20799h.mo28224a());
                zza2.mo28442a((zzbro) this.f20802k, this.f20799h.mo28224a());
                zza2.mo28443a((zzbrs) this.f20801j, this.f20799h.mo28224a());
                zza2.mo28440a((AdMetadataListener) this.f20803l, this.f20799h.mo28224a());
                zza2.mo28439a((AppEventListener) new zzcpy(), this.f20799h.mo28224a());
                zzcdf a2 = a.mo26134a(zza2.mo28448a()).mo26132a();
                this.f20804m = a2.mo26176c();
                zzbbh<zzcdb> b = a2.mo26175b();
                this.f20797f = b;
                zzbar.m20546a(b, new C7402dn(this, a2), this.f20799h.mo28224a());
            }
        }
    }

    public final Bundle getAdMetadata() throws RemoteException {
        zzbss zzbss;
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        if (!this.f20806o || (zzbss = this.f20804m) == null) {
            return new Bundle();
        }
        return zzbss.mo28420w();
    }

    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.f20798g == null) {
            return null;
        }
        return this.f20798g.mo28385b();
    }

    public final boolean isLoaded() throws RemoteException {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        return this.f20806o;
    }

    /* renamed from: k1 */
    public final zzatq mo27119k1() {
        zzcdb zzcdb;
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        if (!this.f20806o || (zzcdb = this.f20798g) == null) {
            return null;
        }
        return zzcdb.mo28654h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public final void mo28772p1() {
        this.f20806o = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public final void mo28773q1() {
        this.f20803l.onAdMetadataChanged();
    }

    /* renamed from: y */
    public final synchronized void mo27120y(IObjectWrapper iObjectWrapper) throws RemoteException {
        mo27110a(iObjectWrapper, false);
    }

    /* renamed from: a */
    public final synchronized void mo27110a(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        if (this.f20798g == null) {
            zzbad.m20523d("Rewarded can not be shown before loaded");
            this.f20801j.mo28407c(2);
            return;
        }
        this.f20798g.mo28651a(z, (Activity) ObjectWrapper.m16390H(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo27112a(zzatw zzatw) throws RemoteException {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        this.f20801j.mo28767a(zzatw);
    }

    /* renamed from: a */
    public final void mo27113a(zzaue zzaue) throws RemoteException {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        this.f20801j.mo28768a(zzaue);
    }

    /* renamed from: a */
    public final void mo27111a(zzaao zzaao) throws RemoteException {
        this.f20803l.mo28766a(new C7439en(this, zzaao));
    }

    /* renamed from: a */
    public final synchronized void mo27114a(zzaum zzaum) throws RemoteException {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        this.f20807p.mo28829b(zzaum.f18525f);
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17782C0)).booleanValue()) {
            this.f20807p.mo28833c(zzaum.f18526g);
        }
    }
}
