package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzcae implements zzbzb {

    /* renamed from: a */
    private final zzana f19832a;

    /* renamed from: b */
    private final zzand f19833b;

    /* renamed from: c */
    private final zzang f19834c;

    /* renamed from: d */
    private final zzbrt f19835d;

    /* renamed from: e */
    private final zzbri f19836e;

    /* renamed from: f */
    private final Context f19837f;

    /* renamed from: g */
    private final zzcxm f19838g;

    /* renamed from: h */
    private final zzbai f19839h;

    /* renamed from: i */
    private final zzcxv f19840i;

    /* renamed from: j */
    private boolean f19841j = false;

    /* renamed from: k */
    private boolean f19842k = false;

    public zzcae(zzana zzana, zzand zzand, zzang zzang, zzbrt zzbrt, zzbri zzbri, Context context, zzcxm zzcxm, zzbai zzbai, zzcxv zzcxv) {
        this.f19832a = zzana;
        this.f19833b = zzand;
        this.f19834c = zzang;
        this.f19835d = zzbrt;
        this.f19836e = zzbri;
        this.f19837f = context;
        this.f19838g = zzcxm;
        this.f19839h = zzbai;
        this.f19840i = zzcxv;
    }

    /* renamed from: b */
    private final void m22255b(View view) {
        try {
            if (this.f19834c != null && !this.f19834c.mo27514r()) {
                this.f19834c.mo27499b(ObjectWrapper.m16391a(view));
                this.f19836e.onAdClicked();
            } else if (this.f19832a != null && !this.f19832a.mo27474r()) {
                this.f19832a.mo27459b(ObjectWrapper.m16391a(view));
                this.f19836e.onAdClicked();
            } else if (this.f19833b != null && !this.f19833b.mo27493r()) {
                this.f19833b.mo27481b(ObjectWrapper.m16391a(view));
                this.f19836e.onAdClicked();
            }
        } catch (RemoteException e) {
            zzbad.m20522c("Failed to call handleClick", e);
        }
    }

    /* renamed from: a */
    public final void mo28472a() {
    }

    /* renamed from: a */
    public final void mo28473a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo28474a(View view) {
    }

    /* renamed from: a */
    public final void mo28475a(View view, MotionEvent motionEvent, View view2) {
    }

    /* renamed from: a */
    public final void mo28479a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper a = ObjectWrapper.m16391a(view);
            HashMap<String, View> a2 = m22254a(map);
            HashMap<String, View> a3 = m22254a(map2);
            if (this.f19834c != null) {
                this.f19834c.mo27497a(a, ObjectWrapper.m16391a(a2), ObjectWrapper.m16391a(a3));
            } else if (this.f19832a != null) {
                this.f19832a.mo27457a(a, ObjectWrapper.m16391a(a2), ObjectWrapper.m16391a(a3));
                this.f19832a.mo27463e(a);
            } else if (this.f19833b != null) {
                this.f19833b.mo27479a(a, ObjectWrapper.m16391a(a2), ObjectWrapper.m16391a(a3));
                this.f19833b.mo27485e(a);
            }
        } catch (RemoteException e) {
            zzbad.m20522c("Failed to call trackView", e);
        }
    }

    /* renamed from: a */
    public final void mo28483a(zzagd zzagd) {
    }

    /* renamed from: a */
    public final void mo28484a(String str) {
    }

    /* renamed from: b */
    public final void mo28485b() {
    }

    /* renamed from: b */
    public final void mo28486b(Bundle bundle) {
    }

    /* renamed from: c */
    public final void mo28487c() {
        zzbad.m20523d("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: c */
    public final boolean mo28488c(Bundle bundle) {
        return false;
    }

    public final void destroy() {
    }

    /* renamed from: u */
    public final void mo28490u() {
    }

    /* renamed from: w */
    public final void mo28491w() {
        this.f19842k = true;
    }

    /* renamed from: a */
    private static HashMap<String, View> m22254a(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo28477a(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper a = ObjectWrapper.m16391a(view);
            if (this.f19834c != null) {
                this.f19834c.mo27496a(a);
            } else if (this.f19832a != null) {
                this.f19832a.mo27456a(a);
            } else if (this.f19833b != null) {
                this.f19833b.mo27478a(a);
            }
        } catch (RemoteException e) {
            zzbad.m20522c("Failed to call untrackView", e);
        }
    }

    /* renamed from: a */
    public final void mo28476a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f19842k || !this.f19838g.f21105D) {
            m22255b(view);
        }
    }

    /* renamed from: a */
    public final void mo28480a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f19842k) {
            zzbad.m20523d("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f19838g.f21105D) {
            zzbad.m20523d("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
        } else {
            m22255b(view);
        }
    }

    /* renamed from: a */
    public final void mo28478a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.f19841j && this.f19838g.f21142z != null) {
                this.f19841j |= zzk.zzlq().mo27848b(this.f19837f, this.f19839h.f18742f, this.f19838g.f21142z.toString(), this.f19840i.f21169f);
            }
            if (this.f19834c != null && !this.f19834c.mo27511n()) {
                this.f19834c.recordImpression();
                this.f19835d.mo28408w();
            } else if (this.f19832a != null && !this.f19832a.mo27471n()) {
                this.f19832a.recordImpression();
                this.f19835d.mo28408w();
            } else if (this.f19833b != null && !this.f19833b.mo27490n()) {
                this.f19833b.recordImpression();
                this.f19835d.mo28408w();
            }
        } catch (RemoteException e) {
            zzbad.m20522c("Failed to call recordImpression", e);
        }
    }

    /* renamed from: a */
    public final void mo28482a(zzaak zzaak) {
        zzbad.m20523d("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: a */
    public final void mo28481a(zzaag zzaag) {
        zzbad.m20523d("Mute This Ad is not supported for 3rd party ads");
    }
}
