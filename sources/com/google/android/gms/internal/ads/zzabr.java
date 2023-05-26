package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzabr extends zzaac {

    /* renamed from: f */
    private zzait f17750f;

    /* renamed from: B */
    public final void mo26908B() throws RemoteException {
        zzbad.m20519b("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzazt.f18727b.post(new C7525h(this));
    }

    /* renamed from: G0 */
    public final float mo26909G0() throws RemoteException {
        return 1.0f;
    }

    /* renamed from: a */
    public final void mo26910a(float f) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo26911a(zzait zzait) throws RemoteException {
        this.f17750f = zzait;
    }

    /* renamed from: a */
    public final void mo26912a(zzamp zzamp) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo26913a(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    /* renamed from: b */
    public final void mo26914b(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    /* renamed from: f */
    public final void mo26915f(String str) throws RemoteException {
    }

    /* renamed from: g */
    public final void mo26916g(boolean z) throws RemoteException {
    }

    /* renamed from: k0 */
    public final List<zzaio> mo26917k0() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    /* renamed from: n */
    public final void mo26918n(String str) throws RemoteException {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public final /* synthetic */ void mo27100p1() {
        zzait zzait = this.f17750f;
        if (zzait != null) {
            try {
                zzait.mo27321b(Collections.EMPTY_LIST);
            } catch (RemoteException e) {
                zzbad.m20522c("Could not notify onComplete event.", e);
            }
        }
    }

    /* renamed from: r0 */
    public final String mo26919r0() {
        return "";
    }

    /* renamed from: s0 */
    public final boolean mo26920s0() throws RemoteException {
        return false;
    }
}
