package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzcbz extends zzaex {

    /* renamed from: f */
    private final String f19921f;

    /* renamed from: g */
    private final zzbyn f19922g;

    /* renamed from: h */
    private final zzbyt f19923h;

    public zzcbz(String str, zzbyn zzbyn, zzbyt zzbyt) {
        this.f19921f = str;
        this.f19922g = zzbyn;
        this.f19923h = zzbyt;
    }

    /* renamed from: a */
    public final void mo27215a(Bundle bundle) throws RemoteException {
        this.f19922g.mo28494a(bundle);
    }

    /* renamed from: b */
    public final String mo27216b() throws RemoteException {
        return this.f19923h.mo28540g();
    }

    /* renamed from: c */
    public final String mo27218c() throws RemoteException {
        return this.f19923h.mo28537d();
    }

    /* renamed from: d */
    public final String mo27220d() throws RemoteException {
        return this.f19923h.mo28536c();
    }

    public final void destroy() throws RemoteException {
        this.f19922g.mo28384a();
    }

    /* renamed from: e */
    public final IObjectWrapper mo27222e() throws RemoteException {
        return this.f19923h.mo28558y();
    }

    /* renamed from: f */
    public final List mo27223f() throws RemoteException {
        return this.f19923h.mo28541h();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.f19923h.mo28539f();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f19921f;
    }

    public final String getStore() throws RemoteException {
        return this.f19923h.mo28545l();
    }

    public final zzaar getVideoController() throws RemoteException {
        return this.f19923h.mo28546m();
    }

    /* renamed from: h */
    public final zzaei mo27228h() throws RemoteException {
        return this.f19923h.mo28556w();
    }

    /* renamed from: i */
    public final String mo27229i() throws RemoteException {
        return this.f19923h.mo28543j();
    }

    /* renamed from: j */
    public final IObjectWrapper mo27230j() throws RemoteException {
        return ObjectWrapper.m16391a(this.f19922g);
    }

    /* renamed from: k */
    public final double mo27231k() throws RemoteException {
        return this.f19923h.mo28544k();
    }

    /* renamed from: a */
    public final zzaea mo27214a() throws RemoteException {
        return this.f19923h.mo28557x();
    }

    /* renamed from: b */
    public final boolean mo27217b(Bundle bundle) throws RemoteException {
        return this.f19922g.mo28508c(bundle);
    }

    /* renamed from: c */
    public final void mo27219c(Bundle bundle) throws RemoteException {
        this.f19922g.mo28505b(bundle);
    }
}
