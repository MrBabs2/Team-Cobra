package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzccg extends zzagh {

    /* renamed from: f */
    private final String f19947f;

    /* renamed from: g */
    private final zzbyn f19948g;

    /* renamed from: h */
    private final zzbyt f19949h;

    public zzccg(String str, zzbyn zzbyn, zzbyt zzbyt) {
        this.f19947f = str;
        this.f19948g = zzbyn;
        this.f19949h = zzbyt;
    }

    /* renamed from: E0 */
    public final List mo27273E0() throws RemoteException {
        if (mo27287e0()) {
            return this.f19949h.mo28542i();
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public final void mo27275a(Bundle bundle) throws RemoteException {
        this.f19948g.mo28494a(bundle);
    }

    /* renamed from: b */
    public final String mo27279b() throws RemoteException {
        return this.f19949h.mo28540g();
    }

    /* renamed from: c */
    public final String mo27281c() throws RemoteException {
        return this.f19949h.mo28537d();
    }

    /* renamed from: d */
    public final String mo27283d() throws RemoteException {
        return this.f19949h.mo28536c();
    }

    /* renamed from: d0 */
    public final zzaee mo27284d0() throws RemoteException {
        return this.f19948g.mo28516m();
    }

    public final void destroy() throws RemoteException {
        this.f19948g.mo28384a();
    }

    /* renamed from: e */
    public final IObjectWrapper mo27286e() throws RemoteException {
        return this.f19949h.mo28558y();
    }

    /* renamed from: e0 */
    public final boolean mo27287e0() throws RemoteException {
        return !this.f19949h.mo28542i().isEmpty() && this.f19949h.mo28549p() != null;
    }

    /* renamed from: f */
    public final List mo27288f() throws RemoteException {
        return this.f19949h.mo28541h();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.f19949h.mo28539f();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f19947f;
    }

    public final String getStore() throws RemoteException {
        return this.f19949h.mo28545l();
    }

    public final zzaar getVideoController() throws RemoteException {
        return this.f19949h.mo28546m();
    }

    /* renamed from: h */
    public final zzaei mo27293h() throws RemoteException {
        return this.f19949h.mo28556w();
    }

    /* renamed from: h1 */
    public final void mo27294h1() {
        this.f19948g.mo28510g();
    }

    /* renamed from: i */
    public final String mo27295i() throws RemoteException {
        return this.f19949h.mo28543j();
    }

    /* renamed from: j */
    public final IObjectWrapper mo27296j() throws RemoteException {
        return ObjectWrapper.m16391a(this.f19948g);
    }

    /* renamed from: k */
    public final double mo27297k() throws RemoteException {
        return this.f19949h.mo28544k();
    }

    /* renamed from: l */
    public final String mo27298l() throws RemoteException {
        return this.f19949h.mo28532b();
    }

    /* renamed from: u */
    public final void mo27299u() throws RemoteException {
        this.f19948g.mo28509f();
    }

    /* renamed from: w */
    public final void mo27300w() {
        this.f19948g.mo28515l();
    }

    /* renamed from: a */
    public final zzaea mo27274a() throws RemoteException {
        return this.f19949h.mo28557x();
    }

    /* renamed from: b */
    public final boolean mo27280b(Bundle bundle) throws RemoteException {
        return this.f19948g.mo28508c(bundle);
    }

    /* renamed from: c */
    public final void mo27282c(Bundle bundle) throws RemoteException {
        this.f19948g.mo28505b(bundle);
    }

    /* renamed from: a */
    public final void mo27278a(zzagd zzagd) throws RemoteException {
        this.f19948g.mo28501a(zzagd);
    }

    /* renamed from: a */
    public final void mo27277a(zzaak zzaak) throws RemoteException {
        this.f19948g.mo28500a(zzaak);
    }

    /* renamed from: a */
    public final void mo27276a(zzaag zzaag) throws RemoteException {
        this.f19948g.mo28499a(zzaag);
    }
}
