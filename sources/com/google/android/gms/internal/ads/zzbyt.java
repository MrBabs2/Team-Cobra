package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p050l.p066e.C4881g;

public final class zzbyt {

    /* renamed from: a */
    private int f19715a;

    /* renamed from: b */
    private zzaar f19716b;

    /* renamed from: c */
    private zzaea f19717c;

    /* renamed from: d */
    private View f19718d;

    /* renamed from: e */
    private List<zzadw> f19719e;

    /* renamed from: f */
    private List<zzabj> f19720f = Collections.emptyList();

    /* renamed from: g */
    private zzabj f19721g;

    /* renamed from: h */
    private Bundle f19722h;

    /* renamed from: i */
    private zzbgz f19723i;

    /* renamed from: j */
    private zzbgz f19724j;

    /* renamed from: k */
    private IObjectWrapper f19725k;

    /* renamed from: l */
    private View f19726l;

    /* renamed from: m */
    private IObjectWrapper f19727m;

    /* renamed from: n */
    private double f19728n;

    /* renamed from: o */
    private zzaei f19729o;

    /* renamed from: p */
    private zzaei f19730p;

    /* renamed from: q */
    private String f19731q;

    /* renamed from: r */
    private C4881g<String, zzadw> f19732r = new C4881g<>();

    /* renamed from: s */
    private C4881g<String, String> f19733s = new C4881g<>();

    /* renamed from: t */
    private float f19734t;

    /* renamed from: A */
    public final synchronized float mo28517A() {
        return this.f19734t;
    }

    /* renamed from: a */
    public final synchronized void mo28520a(int i) {
        this.f19715a = i;
    }

    /* renamed from: b */
    public final synchronized void mo28535b(List<zzabj> list) {
        this.f19720f = list;
    }

    /* renamed from: c */
    public final synchronized String mo28536c() {
        return m22099b("body");
    }

    /* renamed from: d */
    public final synchronized String mo28537d() {
        return m22099b("call_to_action");
    }

    /* renamed from: e */
    public final synchronized String mo28538e() {
        return this.f19731q;
    }

    /* renamed from: f */
    public final synchronized Bundle mo28539f() {
        if (this.f19722h == null) {
            this.f19722h = new Bundle();
        }
        return this.f19722h;
    }

    /* renamed from: g */
    public final synchronized String mo28540g() {
        return m22099b("headline");
    }

    /* renamed from: h */
    public final synchronized List<zzadw> mo28541h() {
        return this.f19719e;
    }

    /* renamed from: i */
    public final synchronized List<zzabj> mo28542i() {
        return this.f19720f;
    }

    /* renamed from: j */
    public final synchronized String mo28543j() {
        return m22099b("price");
    }

    /* renamed from: k */
    public final synchronized double mo28544k() {
        return this.f19728n;
    }

    /* renamed from: l */
    public final synchronized String mo28545l() {
        return m22099b(AccountAnalytics.STORE);
    }

    /* renamed from: m */
    public final synchronized zzaar mo28546m() {
        return this.f19716b;
    }

    /* renamed from: n */
    public final synchronized int mo28547n() {
        return this.f19715a;
    }

    /* renamed from: o */
    public final synchronized View mo28548o() {
        return this.f19718d;
    }

    /* renamed from: p */
    public final synchronized zzabj mo28549p() {
        return this.f19721g;
    }

    /* renamed from: q */
    public final synchronized View mo28550q() {
        return this.f19726l;
    }

    /* renamed from: r */
    public final synchronized zzbgz mo28551r() {
        return this.f19723i;
    }

    /* renamed from: s */
    public final synchronized zzbgz mo28552s() {
        return this.f19724j;
    }

    /* renamed from: t */
    public final synchronized IObjectWrapper mo28553t() {
        return this.f19725k;
    }

    /* renamed from: u */
    public final synchronized C4881g<String, zzadw> mo28554u() {
        return this.f19732r;
    }

    /* renamed from: v */
    public final synchronized C4881g<String, String> mo28555v() {
        return this.f19733s;
    }

    /* renamed from: w */
    public final synchronized zzaei mo28556w() {
        return this.f19729o;
    }

    /* renamed from: x */
    public final synchronized zzaea mo28557x() {
        return this.f19717c;
    }

    /* renamed from: y */
    public final synchronized IObjectWrapper mo28558y() {
        return this.f19727m;
    }

    /* renamed from: z */
    public final synchronized zzaei mo28559z() {
        return this.f19730p;
    }

    /* renamed from: a */
    public final synchronized void mo28523a(zzaar zzaar) {
        this.f19716b = zzaar;
    }

    /* renamed from: b */
    public final synchronized void mo28533b(zzaei zzaei) {
        this.f19730p = zzaei;
    }

    /* renamed from: a */
    public final synchronized void mo28525a(zzaea zzaea) {
        this.f19717c = zzaea;
    }

    /* renamed from: b */
    public final synchronized void mo28534b(zzbgz zzbgz) {
        this.f19724j = zzbgz;
    }

    /* renamed from: b */
    private final synchronized String m22099b(String str) {
        return this.f19733s.get(str);
    }

    /* renamed from: a */
    public final synchronized void mo28531a(List<zzadw> list) {
        this.f19719e = list;
    }

    /* renamed from: b */
    public final synchronized String mo28532b() {
        return m22099b("advertiser");
    }

    /* renamed from: b */
    public static zzbyt m22096b(zzana zzana) {
        try {
            return m22091a(zzana.getVideoController(), zzana.mo27455a(), (View) m22098b(zzana.mo27473q()), zzana.mo27458b(), zzana.mo27464f(), zzana.mo27461d(), zzana.getExtras(), zzana.mo27460c(), (View) m22098b(zzana.mo27472p()), zzana.mo27462e(), zzana.getStore(), zzana.mo27469i(), zzana.mo27470k(), zzana.mo27468h(), (String) null, 0.0f);
        } catch (RemoteException e) {
            zzbad.m20522c("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo28524a(zzabj zzabj) {
        this.f19721g = zzabj;
    }

    /* renamed from: a */
    public final synchronized void mo28521a(View view) {
        this.f19726l = view;
    }

    /* renamed from: a */
    public final synchronized void mo28519a(double d) {
        this.f19728n = d;
    }

    /* renamed from: a */
    public final synchronized void mo28526a(zzaei zzaei) {
        this.f19729o = zzaei;
    }

    /* renamed from: a */
    public final synchronized void mo28528a(String str) {
        this.f19731q = str;
    }

    /* renamed from: a */
    public final synchronized void mo28527a(zzbgz zzbgz) {
        this.f19723i = zzbgz;
    }

    /* renamed from: a */
    public final synchronized void mo28522a(IObjectWrapper iObjectWrapper) {
        this.f19725k = iObjectWrapper;
    }

    /* renamed from: a */
    public final synchronized void mo28530a(String str, String str2) {
        if (str2 == null) {
            this.f19733s.remove(str);
        } else {
            this.f19733s.put(str, str2);
        }
    }

    /* renamed from: b */
    public static zzbyt m22097b(zzand zzand) {
        try {
            return m22091a(zzand.getVideoController(), zzand.mo27477a(), (View) m22098b(zzand.mo27492q()), zzand.mo27480b(), zzand.mo27486f(), zzand.mo27483d(), zzand.getExtras(), zzand.mo27482c(), (View) m22098b(zzand.mo27491p()), zzand.mo27484e(), (String) null, (String) null, -1.0d, zzand.mo27476C(), zzand.mo27489l(), 0.0f);
        } catch (RemoteException e) {
            zzbad.m20522c("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo28529a(String str, zzadw zzadw) {
        if (zzadw == null) {
            this.f19732r.remove(str);
        } else {
            this.f19732r.put(str, zzadw);
        }
    }

    /* renamed from: a */
    private final synchronized void m22095a(float f) {
        this.f19734t = f;
    }

    /* renamed from: a */
    public final synchronized void mo28518a() {
        if (this.f19723i != null) {
            this.f19723i.destroy();
            this.f19723i = null;
        }
        if (this.f19724j != null) {
            this.f19724j.destroy();
            this.f19724j = null;
        }
        this.f19725k = null;
        this.f19732r.clear();
        this.f19733s.clear();
        this.f19716b = null;
        this.f19717c = null;
        this.f19718d = null;
        this.f19719e = null;
        this.f19722h = null;
        this.f19726l = null;
        this.f19727m = null;
        this.f19729o = null;
        this.f19730p = null;
        this.f19731q = null;
    }

    /* renamed from: b */
    private static <T> T m22098b(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.m16390H(iObjectWrapper);
    }

    /* renamed from: a */
    public static zzbyt m22093a(zzand zzand) {
        try {
            zzaar videoController = zzand.getVideoController();
            zzaea a = zzand.mo27477a();
            String b = zzand.mo27480b();
            List<zzadw> f = zzand.mo27486f();
            String d = zzand.mo27483d();
            Bundle extras = zzand.getExtras();
            String c = zzand.mo27482c();
            IObjectWrapper e = zzand.mo27484e();
            String l = zzand.mo27489l();
            zzaei C = zzand.mo27476C();
            zzbyt zzbyt = new zzbyt();
            zzbyt.f19715a = 1;
            zzbyt.f19716b = videoController;
            zzbyt.f19717c = a;
            zzbyt.f19718d = (View) m22098b(zzand.mo27492q());
            zzbyt.mo28530a("headline", b);
            zzbyt.f19719e = f;
            zzbyt.mo28530a("body", d);
            zzbyt.f19722h = extras;
            zzbyt.mo28530a("call_to_action", c);
            zzbyt.f19726l = (View) m22098b(zzand.mo27491p());
            zzbyt.f19727m = e;
            zzbyt.mo28530a("advertiser", l);
            zzbyt.f19730p = C;
            return zzbyt;
        } catch (RemoteException e2) {
            zzbad.m20522c("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    /* renamed from: a */
    public static zzbyt m22092a(zzana zzana) {
        try {
            zzaar videoController = zzana.getVideoController();
            zzaea a = zzana.mo27455a();
            String b = zzana.mo27458b();
            List<zzadw> f = zzana.mo27464f();
            String d = zzana.mo27461d();
            Bundle extras = zzana.getExtras();
            String c = zzana.mo27460c();
            IObjectWrapper e = zzana.mo27462e();
            String store = zzana.getStore();
            String i = zzana.mo27469i();
            double k = zzana.mo27470k();
            zzaei h = zzana.mo27468h();
            zzbyt zzbyt = new zzbyt();
            zzbyt.f19715a = 2;
            zzbyt.f19716b = videoController;
            zzbyt.f19717c = a;
            zzbyt.f19718d = (View) m22098b(zzana.mo27473q());
            zzbyt.mo28530a("headline", b);
            zzbyt.f19719e = f;
            zzbyt.mo28530a("body", d);
            zzbyt.f19722h = extras;
            zzbyt.mo28530a("call_to_action", c);
            zzbyt.f19726l = (View) m22098b(zzana.mo27472p());
            zzbyt.f19727m = e;
            zzbyt.mo28530a(AccountAnalytics.STORE, store);
            zzbyt.mo28530a("price", i);
            zzbyt.f19728n = k;
            zzbyt.f19729o = h;
            return zzbyt;
        } catch (RemoteException e2) {
            zzbad.m20522c("Failed to get native ad from app install ad mapper", e2);
            return null;
        }
    }

    /* renamed from: a */
    public static zzbyt m22094a(zzang zzang) {
        try {
            return m22091a(zzang.getVideoController(), zzang.mo27495a(), (View) m22098b(zzang.mo27513q()), zzang.mo27498b(), zzang.mo27503f(), zzang.mo27501d(), zzang.getExtras(), zzang.mo27500c(), (View) m22098b(zzang.mo27512p()), zzang.mo27502e(), zzang.getStore(), zzang.mo27508i(), zzang.mo27509k(), zzang.mo27507h(), zzang.mo27510l(), zzang.mo27516v0());
        } catch (RemoteException e) {
            zzbad.m20522c("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* renamed from: a */
    private static zzbyt m22091a(zzaar zzaar, zzaea zzaea, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzaei zzaei, String str6, float f) {
        zzbyt zzbyt = new zzbyt();
        zzbyt.f19715a = 6;
        zzbyt.f19716b = zzaar;
        zzbyt.f19717c = zzaea;
        zzbyt.f19718d = view;
        String str7 = str;
        zzbyt.mo28530a("headline", str);
        zzbyt.f19719e = list;
        String str8 = str2;
        zzbyt.mo28530a("body", str2);
        zzbyt.f19722h = bundle;
        String str9 = str3;
        zzbyt.mo28530a("call_to_action", str3);
        zzbyt.f19726l = view2;
        zzbyt.f19727m = iObjectWrapper;
        String str10 = str4;
        zzbyt.mo28530a(AccountAnalytics.STORE, str4);
        String str11 = str5;
        zzbyt.mo28530a("price", str5);
        zzbyt.f19728n = d;
        zzbyt.f19729o = zzaei;
        zzbyt.mo28530a("advertiser", str6);
        zzbyt.m22095a(f);
        return zzbyt;
    }
}
