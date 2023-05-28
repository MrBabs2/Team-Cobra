package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

public final class zzbzt {

    /* renamed from: a */
    private final Context f19810a;

    /* renamed from: b */
    private final zzcdn f19811b;

    /* renamed from: c */
    private final zzccj f19812c;

    /* renamed from: d */
    private final zzbmy f19813d;

    /* renamed from: e */
    private final zzbzb f19814e;

    public zzbzt(Context context, zzcdn zzcdn, zzccj zzccj, zzbmy zzbmy, zzbzb zzbzb) {
        this.f19810a = context;
        this.f19811b = zzcdn;
        this.f19812c = zzccj;
        this.f19813d = zzbmy;
        this.f19814e = zzbzb;
    }

    /* renamed from: a */
    public final View mo28608a() throws zzbhj {
        zzbgz a = this.f19811b.mo28655a(zzyd.m25644a(this.f19810a));
        a.getView().setVisibility(8);
        a.mo25662a("/sendMessageToSdk", (zzaho<? super zzbgz>) new C7395dg(this));
        a.mo25662a("/adMuted", (zzaho<? super zzbgz>) new C7432eg(this));
        this.f19812c.mo28647a(new WeakReference(a), "/loadHtml", new C7469fg(this));
        this.f19812c.mo28647a(new WeakReference(a), "/showOverlay", new C7505gg(this));
        this.f19812c.mo28647a(new WeakReference(a), "/hideOverlay", new C7542hg(this));
        return a.getView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28611b(zzbgz zzbgz, Map map) {
        zzbgz.getView().setVisibility(0);
        this.f19813d.mo28277f(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo28612c(zzbgz zzbgz, Map map) {
        this.f19814e.mo28487c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo28613d(zzbgz zzbgz, Map map) {
        this.f19812c.mo28646a("sendMessageToNativeJs", (Map<String, ?>) map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28609a(zzbgz zzbgz, Map map) {
        zzbgz.getView().setVisibility(8);
        this.f19813d.mo28277f(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28610a(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, (String) map.get(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID));
        this.f19812c.mo28646a("sendMessageToNativeJs", (Map<String, ?>) hashMap);
    }
}
