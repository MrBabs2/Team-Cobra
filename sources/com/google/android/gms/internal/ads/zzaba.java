package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class zzaba {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet<String> f17696a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f17697b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f17698c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet<String> f17699d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f17700e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet<String> f17701f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f17702g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f17703h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f17704i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Location f17705j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f17706k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f17707l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f17708m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f17709n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f17710o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f17711p = -1;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f17712q;

    /* renamed from: a */
    public final void mo26975a(String str) {
        this.f17696a.add(str);
    }

    /* renamed from: b */
    public final void mo26980b(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f17697b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f17697b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.f17697b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    /* renamed from: c */
    public final void mo26983c(String str) {
        this.f17699d.remove(str);
    }

    /* renamed from: d */
    public final void mo26985d(String str) {
        this.f17703h = str;
    }

    /* renamed from: e */
    public final void mo26986e(String str) {
        this.f17707l = str;
    }

    /* renamed from: f */
    public final void mo26987f(String str) {
        this.f17708m = str;
    }

    /* renamed from: g */
    public final void mo26988g(String str) {
        this.f17701f.add(str);
    }

    /* renamed from: h */
    public final void mo26989h(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.f17712q = str;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo26973a(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            mo26974a((Class<? extends MediationExtrasReceiver>) AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f17698c.put(networkExtras.getClass(), networkExtras);
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void mo26984c(boolean z) {
        this.f17710o = z;
    }

    /* renamed from: b */
    public final void mo26981b(String str) {
        this.f17699d.add(str);
    }

    /* renamed from: a */
    public final void mo26974a(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.f17697b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: b */
    public final void mo26982b(boolean z) {
        this.f17709n = z ? 1 : 0;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo26977a(Date date) {
        this.f17702g = date;
    }

    /* renamed from: b */
    public final void mo26979b(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.f17711p = i;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo26971a(int i) {
        this.f17704i = i;
    }

    /* renamed from: a */
    public final void mo26972a(Location location) {
        this.f17705j = location;
    }

    /* renamed from: a */
    public final void mo26978a(boolean z) {
        this.f17706k = z;
    }

    /* renamed from: a */
    public final void mo26976a(String str, String str2) {
        this.f17700e.putString(str, str2);
    }
}
