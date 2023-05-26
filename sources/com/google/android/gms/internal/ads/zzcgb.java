package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcgb {

    /* renamed from: a */
    private boolean f20143a = false;

    /* renamed from: b */
    private boolean f20144b = false;

    /* renamed from: c */
    private final long f20145c;

    /* renamed from: d */
    private final zzbbr<Boolean> f20146d = new zzbbr<>();

    /* renamed from: e */
    private final Context f20147e;

    /* renamed from: f */
    private final zzclc f20148f;

    /* renamed from: g */
    private final Executor f20149g;

    /* renamed from: h */
    private final Executor f20150h;

    /* renamed from: i */
    private final ScheduledExecutorService f20151i;

    /* renamed from: j */
    private Map<String, zzaio> f20152j = new ConcurrentHashMap();

    public zzcgb(Executor executor, Context context, Executor executor2, zzclc zzclc, ScheduledExecutorService scheduledExecutorService) {
        this.f20148f = zzclc;
        this.f20147e = context;
        this.f20149g = executor2;
        this.f20151i = scheduledExecutorService;
        this.f20150h = executor;
        this.f20145c = zzk.zzln().mo25499c();
        m22513a("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* renamed from: g */
    private final synchronized void m22514g() {
        if (!this.f20144b) {
            zzk.zzlk().mo27743i().mo27768a((Runnable) new C7696li(this));
            this.f20144b = true;
            this.f20151i.schedule(new C7733mi(this), ((Long) zzyt.m25670e().mo27163a(zzacu.f17914h1)).longValue(), TimeUnit.SECONDS);
        }
    }

    /* renamed from: a */
    public final void mo28678a(zzait zzait) {
        this.f20146d.mo25573b(new C7622ji(this, zzait), this.f20150h);
    }

    /* renamed from: b */
    public final List<zzaio> mo28682b() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f20152j.keySet()) {
            zzaio zzaio = this.f20152j.get(next);
            arrayList.add(new zzaio(next, zzaio.f18139g, zzaio.f18140h, zzaio.f18141i));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo28684c() throws Exception {
        this.f20146d.mo27904b(true);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo28685d() {
        synchronized (this) {
            if (!this.f20143a) {
                m22513a("com.google.android.gms.ads.MobileAds", false, "timeout", (int) (zzk.zzln().mo25499c() - this.f20145c));
                this.f20146d.mo27904b(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo28686e() {
        this.f20149g.execute(new C7881qi(this));
    }

    /* renamed from: a */
    public final void mo28687f() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17904f1)).booleanValue() && !this.f20143a) {
            synchronized (this) {
                if (!this.f20143a) {
                    String c = zzk.zzlk().mo27743i().mo27787j().mo27727c();
                    if (TextUtils.isEmpty(c)) {
                        m22514g();
                        return;
                    }
                    this.f20143a = true;
                    m22513a("com.google.android.gms.ads.MobileAds", true, "", (int) (zzk.zzln().mo25499c() - this.f20145c));
                    this.f20149g.execute(new C7659ki(this, c));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28683b(zzait zzait) {
        try {
            zzait.mo27321b(mo28682b());
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22513a(String str, boolean z, String str2, int i) {
        this.f20152j.put(str, new zzaio(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28679a(zzams zzams, zzaiq zzaiq, List list) {
        try {
            zzams.mo27405a(ObjectWrapper.m16391a(this.f20147e), zzaiq, (List<zzaiw>) list);
        } catch (RemoteException unused) {
            try {
                zzaiq.onInitializationFailed("Failed to create Adapter.");
            } catch (RemoteException e) {
                zzbad.m20520b("", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28680a(Object obj, zzbbr zzbbr, String str, long j) {
        synchronized (obj) {
            if (!zzbbr.isDone()) {
                m22513a(str, false, "timeout", (int) (zzk.zzln().mo25499c() - j));
                zzbbr.mo27904b(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28681a(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = new Object();
                zzbbr zzbbr = new zzbbr();
                zzbbh a = zzbar.m20541a(zzbbr, ((Long) zzyt.m25670e().mo27163a(zzacu.f17909g1)).longValue(), TimeUnit.SECONDS, this.f20151i);
                long c = zzk.zzln().mo25499c();
                Iterator<String> it = keys;
                C7770ni niVar = r1;
                C7770ni niVar2 = new C7770ni(this, obj, zzbbr, next, c);
                a.mo25573b(niVar, this.f20149g);
                arrayList.add(a);
                C7918ri riVar = new C7918ri(this, obj, next, c, zzbbr);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzaiw(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                m22513a(next, false, "", 0);
                try {
                    this.f20150h.execute(new C7844pi(this, this.f20148f.mo28731a(next, new JSONObject()), riVar, arrayList2));
                } catch (RemoteException unused2) {
                    try {
                        riVar.onInitializationFailed("Failed to create Adapter.");
                    } catch (RemoteException e) {
                        zzbad.m20520b("", e);
                    }
                }
                keys = it;
            }
            zzbar.m20551b(arrayList).mo27900a(new C7807oi(this), this.f20149g);
        } catch (JSONException e2) {
            zzawz.m20168e("Malformed CLD response", e2);
        }
    }
}
