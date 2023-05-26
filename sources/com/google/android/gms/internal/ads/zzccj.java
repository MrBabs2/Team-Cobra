package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzccj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7843ph f19956a = new C7843ph((C7695lh) null);

    /* renamed from: b */
    private final zza f19957b;

    /* renamed from: c */
    private final Context f19958c;

    /* renamed from: d */
    private final Executor f19959d;

    /* renamed from: e */
    private final zzdh f19960e;

    /* renamed from: f */
    private final zzbai f19961f;

    /* renamed from: g */
    private final zzahu f19962g = new zzahu();

    /* renamed from: h */
    private zzbbh<zzbgz> f19963h;

    public zzccj(Context context, Executor executor, zzdh zzdh, zzbai zzbai, zza zza, zzbhf zzbhf) {
        this.f19958c = context;
        this.f19959d = executor;
        this.f19960e = zzdh;
        this.f19961f = zzbai;
        this.f19957b = zza;
    }

    /* renamed from: a */
    public final synchronized void mo28644a() {
        if (this.f19963h != null) {
            zzbar.m20546a(this.f19963h, new C7695lh(this), this.f19959d);
            this.f19963h = null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo28648b() {
        zzbbh<zzbgz> a = zzbar.m20543a(zzbhf.m20984a(this.f19958c, this.f19961f, (String) zzyt.m25670e().mo27163a(zzacu.f17783C1), this.f19960e, this.f19957b), new C7621jh(this), this.f19959d);
        this.f19963h = a;
        zzbao.m20536a(a, "NativeJavascriptExecutor.initializeEngine");
    }

    /* renamed from: a */
    public final synchronized zzbbh<JSONObject> mo28641a(String str, JSONObject jSONObject) {
        if (this.f19963h == null) {
            return zzbar.m20539a(null);
        }
        return zzbar.m20542a(this.f19963h, new C7658kh(this, str, jSONObject), this.f19959d);
    }

    /* renamed from: a */
    public final synchronized void mo28645a(String str, zzaho<Object> zzaho) {
        if (this.f19963h != null) {
            zzbar.m20546a(this.f19963h, new C7732mh(this, str, zzaho), this.f19959d);
        }
    }

    /* renamed from: b */
    public final synchronized void mo28649b(String str, zzaho<Object> zzaho) {
        if (this.f19963h != null) {
            zzbar.m20546a(this.f19963h, new C7769nh(this, str, zzaho), this.f19959d);
        }
    }

    /* renamed from: a */
    public final synchronized void mo28646a(String str, Map<String, ?> map) {
        if (this.f19963h != null) {
            zzbar.m20546a(this.f19963h, new C7806oh(this, str, map), this.f19959d);
        }
    }

    /* renamed from: a */
    public final <T> void mo28647a(WeakReference<T> weakReference, String str, zzaho<T> zzaho) {
        mo28645a(str, (zzaho<Object>) new C7917rh(this, weakReference, str, zzaho, (C7695lh) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28642a(String str, JSONObject jSONObject, zzbgz zzbgz) throws Exception {
        return this.f19962g.mo27304a(zzbgz, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbgz mo28643a(zzbgz zzbgz) {
        zzbgz.mo25662a("/result", (zzaho<? super zzbgz>) this.f19962g);
        zzbii k = zzbgz.mo25697k();
        C7843ph phVar = this.f19956a;
        k.mo28130a((zzxr) null, phVar, phVar, phVar, phVar, false, (zzahp) null, new zzb(this.f19958c, (zzavb) null, (zzark) null), (zzaqc) null, (zzavb) null);
        return zzbgz;
    }
}
