package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.C7112b;
import com.google.ads.mediation.C7121e;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

@zzard
public final class zzamo extends zzamq {

    /* renamed from: f */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f18201f;

    static {
        new zzapb();
    }

    /* renamed from: t */
    private final <NetworkExtrasT extends C7121e, ServerParametersT extends MediationServerParameters> zzams m19422t(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, zzamo.class.getClassLoader());
            if (C7112b.class.isAssignableFrom(cls)) {
                C7112b bVar = (C7112b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new zzant(bVar, (C7121e) this.f18201f.get(bVar.getAdditionalParametersType()));
            } else if (MediationAdapter.class.isAssignableFrom(cls)) {
                return new zzanl((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzanl((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                zzbad.m20523d(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return m19423u(str);
        }
    }

    /* renamed from: u */
    private final zzams m19423u(String str) throws RemoteException {
        try {
            zzbad.m20516a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzanl((MediationAdapter) new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new zzanl((MediationAdapter) new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzanl((MediationAdapter) new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new zzant(customEventAdapter, (CustomEventExtras) this.f18201f.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            zzbad.m20522c(sb.toString(), th);
        }
    }

    /* renamed from: b */
    public final void mo27398b(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f18201f = map;
    }

    /* renamed from: g */
    public final zzaov mo27399g(String str) throws RemoteException {
        return zzapb.m19782a(str);
    }

    /* renamed from: q */
    public final zzams mo27400q(String str) throws RemoteException {
        return m19422t(str);
    }

    /* renamed from: r */
    public final boolean mo27401r(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzamo.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            zzbad.m20523d(sb.toString());
            return false;
        }
    }
}
