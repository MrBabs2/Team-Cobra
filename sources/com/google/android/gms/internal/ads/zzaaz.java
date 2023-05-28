package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@zzard
public final class zzaaz {

    /* renamed from: a */
    private final Date f17678a;

    /* renamed from: b */
    private final String f17679b;

    /* renamed from: c */
    private final int f17680c;

    /* renamed from: d */
    private final Set<String> f17681d;

    /* renamed from: e */
    private final Location f17682e;

    /* renamed from: f */
    private final boolean f17683f;

    /* renamed from: g */
    private final Bundle f17684g;

    /* renamed from: h */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f17685h;

    /* renamed from: i */
    private final String f17686i;

    /* renamed from: j */
    private final String f17687j;

    /* renamed from: k */
    private final SearchAdRequest f17688k;

    /* renamed from: l */
    private final int f17689l;

    /* renamed from: m */
    private final Set<String> f17690m;

    /* renamed from: n */
    private final Bundle f17691n;

    /* renamed from: o */
    private final Set<String> f17692o;

    /* renamed from: p */
    private final boolean f17693p;

    /* renamed from: q */
    private final int f17694q;

    /* renamed from: r */
    private final String f17695r;

    public zzaaz(zzaba zzaba) {
        this(zzaba, (SearchAdRequest) null);
    }

    @Deprecated
    /* renamed from: a */
    public final Date mo26948a() {
        return this.f17678a;
    }

    /* renamed from: b */
    public final String mo26951b() {
        return this.f17679b;
    }

    /* renamed from: c */
    public final Bundle mo26953c(Class<? extends MediationExtrasReceiver> cls) {
        return this.f17684g.getBundle(cls.getName());
    }

    @Deprecated
    /* renamed from: d */
    public final int mo26954d() {
        return this.f17680c;
    }

    /* renamed from: e */
    public final Set<String> mo26955e() {
        return this.f17681d;
    }

    /* renamed from: f */
    public final Location mo26956f() {
        return this.f17682e;
    }

    /* renamed from: g */
    public final boolean mo26957g() {
        return this.f17683f;
    }

    /* renamed from: h */
    public final String mo26958h() {
        return this.f17695r;
    }

    /* renamed from: i */
    public final String mo26959i() {
        return this.f17686i;
    }

    @Deprecated
    /* renamed from: j */
    public final boolean mo26960j() {
        return this.f17693p;
    }

    /* renamed from: k */
    public final String mo26961k() {
        return this.f17687j;
    }

    /* renamed from: l */
    public final SearchAdRequest mo26962l() {
        return this.f17688k;
    }

    /* renamed from: m */
    public final Map<Class<? extends NetworkExtras>, NetworkExtras> mo26963m() {
        return this.f17685h;
    }

    /* renamed from: n */
    public final Bundle mo26964n() {
        return this.f17684g;
    }

    /* renamed from: o */
    public final int mo26965o() {
        return this.f17689l;
    }

    /* renamed from: p */
    public final Set<String> mo26966p() {
        return this.f17692o;
    }

    /* renamed from: q */
    public final int mo26967q() {
        return this.f17694q;
    }

    public zzaaz(zzaba zzaba, SearchAdRequest searchAdRequest) {
        this.f17678a = zzaba.f17702g;
        this.f17679b = zzaba.f17703h;
        this.f17680c = zzaba.f17704i;
        this.f17681d = Collections.unmodifiableSet(zzaba.f17696a);
        this.f17682e = zzaba.f17705j;
        this.f17683f = zzaba.f17706k;
        this.f17684g = zzaba.f17697b;
        this.f17685h = Collections.unmodifiableMap(zzaba.f17698c);
        this.f17686i = zzaba.f17707l;
        this.f17687j = zzaba.f17708m;
        this.f17688k = searchAdRequest;
        this.f17689l = zzaba.f17709n;
        this.f17690m = Collections.unmodifiableSet(zzaba.f17699d);
        this.f17691n = zzaba.f17700e;
        this.f17692o = Collections.unmodifiableSet(zzaba.f17701f);
        this.f17693p = zzaba.f17710o;
        this.f17694q = zzaba.f17711p;
        this.f17695r = zzaba.f17712q;
    }

    /* renamed from: a */
    public final Bundle mo26947a(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f17684g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    @Deprecated
    /* renamed from: b */
    public final <T extends NetworkExtras> T mo26950b(Class<T> cls) {
        return (NetworkExtras) this.f17685h.get(cls);
    }

    /* renamed from: c */
    public final Bundle mo26952c() {
        return this.f17691n;
    }

    /* renamed from: a */
    public final boolean mo26949a(Context context) {
        Set<String> set = this.f17690m;
        zzyt.m25666a();
        return set.contains(zzazt.m20467a(context));
    }
}
