package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yc */
final class C8171yc extends zzbnf {

    /* renamed from: f */
    private final Context f17456f;

    /* renamed from: g */
    private final View f17457g;

    /* renamed from: h */
    private final zzbgz f17458h;

    /* renamed from: i */
    private final zzbpb f17459i;

    /* renamed from: j */
    private final zzbzc f17460j;

    /* renamed from: k */
    private final zzbvd f17461k;

    /* renamed from: l */
    private final zzdte<zzcpm> f17462l;

    /* renamed from: m */
    private final Executor f17463m;

    C8171yc(Context context, zzcxn zzcxn, View view, zzbgz zzbgz, zzbpb zzbpb, zzbzc zzbzc, zzbvd zzbvd, zzdte<zzcpm> zzdte, Executor executor) {
        this.f17456f = context;
        this.f17457g = view;
        this.f17458h = zzbgz;
        this.f17459i = zzbpb;
        this.f17460j = zzbzc;
        this.f17461k = zzbvd;
        this.f17462l = zzdte;
        this.f17463m = executor;
    }

    /* renamed from: a */
    public final void mo26811a(ViewGroup viewGroup, zzyd zzyd) {
        zzbgz zzbgz;
        if (viewGroup != null && (zzbgz = this.f17458h) != null) {
            zzbgz.mo25658a(zzbin.m21123a(zzyd));
            viewGroup.setMinimumHeight(zzyd.f23018h);
            viewGroup.setMinimumWidth(zzyd.f23021k);
        }
    }

    /* renamed from: c */
    public final void mo26812c() {
        this.f17463m.execute(new C8208zc(this));
        super.mo26812c();
    }

    /* renamed from: f */
    public final zzaar mo26813f() {
        try {
            return this.f17459i.getVideoController();
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final View mo26814g() {
        return this.f17457g;
    }

    /* renamed from: h */
    public final zzcxn mo26815h() {
        return this.f19368b.f21131o.get(0);
    }

    /* renamed from: i */
    public final int mo26816i() {
        return this.f19367a.f21163b.f21158b.f21148c;
    }

    /* renamed from: j */
    public final void mo26817j() {
        this.f17461k.mo28456w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo26818k() {
        if (this.f17460j.mo28569d() != null) {
            try {
                this.f17460j.mo28569d().mo27265a(this.f17462l.get(), ObjectWrapper.m16391a(this.f17456f));
            } catch (RemoteException e) {
                zzbad.m20520b("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
