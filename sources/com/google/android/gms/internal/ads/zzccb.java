package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzccb extends zzafb {

    /* renamed from: f */
    private final String f19933f;

    /* renamed from: g */
    private final zzbyn f19934g;

    /* renamed from: h */
    private final zzbyt f19935h;

    public zzccb(String str, zzbyn zzbyn, zzbyt zzbyt) {
        this.f19933f = str;
        this.f19934g = zzbyn;
        this.f19935h = zzbyt;
    }

    /* renamed from: C */
    public final zzaei mo27233C() throws RemoteException {
        return this.f19935h.mo28559z();
    }

    /* renamed from: a */
    public final void mo27235a(Bundle bundle) throws RemoteException {
        this.f19934g.mo28494a(bundle);
    }

    /* renamed from: b */
    public final String mo27236b() throws RemoteException {
        return this.f19935h.mo28540g();
    }

    /* renamed from: c */
    public final String mo27238c() throws RemoteException {
        return this.f19935h.mo28537d();
    }

    /* renamed from: d */
    public final String mo27240d() throws RemoteException {
        return this.f19935h.mo28536c();
    }

    public final void destroy() throws RemoteException {
        this.f19934g.mo28384a();
    }

    /* renamed from: e */
    public final IObjectWrapper mo27242e() throws RemoteException {
        return this.f19935h.mo28558y();
    }

    /* renamed from: f */
    public final List mo27243f() throws RemoteException {
        return this.f19935h.mo28541h();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.f19935h.mo28539f();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f19933f;
    }

    public final zzaar getVideoController() throws RemoteException {
        return this.f19935h.mo28546m();
    }

    /* renamed from: j */
    public final IObjectWrapper mo27247j() throws RemoteException {
        return ObjectWrapper.m16391a(this.f19934g);
    }

    /* renamed from: l */
    public final String mo27248l() throws RemoteException {
        return this.f19935h.mo28532b();
    }

    /* renamed from: a */
    public final zzaea mo27234a() throws RemoteException {
        return this.f19935h.mo28557x();
    }

    /* renamed from: b */
    public final boolean mo27237b(Bundle bundle) throws RemoteException {
        return this.f19934g.mo28508c(bundle);
    }

    /* renamed from: c */
    public final void mo27239c(Bundle bundle) throws RemoteException {
        this.f19934g.mo28505b(bundle);
    }
}
