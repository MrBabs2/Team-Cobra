package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzclc {

    /* renamed from: a */
    private final AtomicReference<zzamp> f20547a = new AtomicReference<>();

    zzclc() {
    }

    /* renamed from: b */
    private final zzams m22670b(String str, JSONObject jSONObject) throws RemoteException {
        zzamp b = m22669b();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                if (b.mo27401r(jSONObject.getString("class_name"))) {
                    return b.mo27400q("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                }
                return b.mo27400q("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                zzbad.m20520b("Invalid custom event.", e);
            }
        }
        return b.mo27400q(str);
    }

    /* renamed from: a */
    public final void mo28733a(zzamp zzamp) {
        this.f20547a.compareAndSet((Object) null, zzamp);
    }

    /* renamed from: a */
    public final zzams mo28731a(String str, JSONObject jSONObject) throws RemoteException {
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
            return new zzanl((MediationAdapter) new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
            return new zzanl((MediationAdapter) new AdUrlAdapter());
        }
        if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
            return new zzanl((MediationAdapter) new zzapl());
        }
        return m22670b(str, jSONObject);
    }

    /* renamed from: a */
    public final zzaov mo28732a(String str) throws RemoteException {
        return m22669b().mo27399g(str);
    }

    /* renamed from: b */
    private final zzamp m22669b() throws RemoteException {
        zzamp zzamp = this.f20547a.get();
        if (zzamp != null) {
            return zzamp;
        }
        zzbad.m20523d("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    /* renamed from: a */
    public final boolean mo28734a() {
        return this.f20547a.get() != null;
    }
}
