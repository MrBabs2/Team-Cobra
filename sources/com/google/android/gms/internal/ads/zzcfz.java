package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzk;
import java.util.Collections;
import java.util.List;

public final class zzcfz implements AppEventListener, zzbrl, zzbro, zzbrw, zzbrx, zzbsr, zzbtk, zzczz, zzxr {

    /* renamed from: f */
    private final List<Object> f20138f;

    /* renamed from: g */
    private final zzcfn f20139g;

    /* renamed from: h */
    private long f20140h;

    public zzcfz(zzcfn zzcfn, zzbjm zzbjm) {
        this.f20139g = zzcfn;
        this.f20138f = Collections.singletonList(zzbjm);
    }

    /* renamed from: a */
    public final void mo26819a(Context context) {
        m22498a(zzbrx.class, "onDestroy", context);
    }

    /* renamed from: a */
    public final void mo26179a(zzcxu zzcxu) {
    }

    /* renamed from: b */
    public final void mo26820b(Context context) {
        m22498a(zzbrx.class, "onResume", context);
    }

    /* renamed from: c */
    public final void mo28670c(zzczs zzczs, String str) {
        m22498a(zzczr.class, "onTaskCreated", str);
    }

    /* renamed from: d */
    public final void mo26821d(Context context) {
        m22498a(zzbrx.class, "onPause", context);
    }

    public final void onAdClicked() {
        m22498a(zzxr.class, "onAdClicked", new Object[0]);
    }

    public final void onAdClosed() {
        m22498a(zzbrl.class, "onAdClosed", new Object[0]);
    }

    public final void onAdFailedToLoad(int i) {
        m22498a(zzbro.class, "onAdFailedToLoad", Integer.valueOf(i));
    }

    public final void onAdImpression() {
        m22498a(zzbrw.class, "onAdImpression", new Object[0]);
    }

    public final void onAdLeftApplication() {
        m22498a(zzbrl.class, "onAdLeftApplication", new Object[0]);
    }

    public final void onAdLoaded() {
        long c = zzk.zzln().mo25499c() - this.f20140h;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(c);
        zzawz.m20167e(sb.toString());
        m22498a(zzbsr.class, "onAdLoaded", new Object[0]);
    }

    public final void onAdOpened() {
        m22498a(zzbrl.class, "onAdOpened", new Object[0]);
    }

    public final void onAppEvent(String str, String str2) {
        m22498a(AppEventListener.class, "onAppEvent", str, str2);
    }

    public final void onRewardedVideoCompleted() {
        m22498a(zzbrl.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void onRewardedVideoStarted() {
        m22498a(zzbrl.class, "onRewardedVideoStarted", new Object[0]);
    }

    /* renamed from: a */
    public final void mo28260a(zzasr zzasr, String str, String str2) {
        m22498a(zzbrl.class, "onRewarded", zzasr, str, str2);
    }

    /* renamed from: b */
    public final void mo28669b(zzczs zzczs, String str) {
        m22498a(zzczr.class, "onTaskStarted", str);
    }

    /* renamed from: a */
    public final void mo28668a(zzczs zzczs, String str, Throwable th) {
        m22498a(zzczr.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    /* renamed from: a */
    public final void mo28667a(zzczs zzczs, String str) {
        m22498a(zzczr.class, "onTaskSucceeded", str);
    }

    /* renamed from: a */
    private final void m22498a(Class cls, String str, Object... objArr) {
        zzcfn zzcfn = this.f20139g;
        List<Object> list = this.f20138f;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzcfn.mo28676a(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    /* renamed from: a */
    public final void mo26178a(zzarx zzarx) {
        this.f20140h = zzk.zzln().mo25499c();
        m22498a(zzbtk.class, "onAdRequest", new Object[0]);
    }
}
