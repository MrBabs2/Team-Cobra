package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class zzcxx {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzxz f21179a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzyd f21180b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzzy f21181c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f21182d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public zzacd f21183e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f21184f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<String> f21185g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayList<String> f21186h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public zzady f21187i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public PublisherAdViewOptions f21188j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public zzzs f21189k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f21190l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f21191m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f21192n = 1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public zzaiy f21193o;

    /* renamed from: p */
    public final Set<String> f21194p = new HashSet();

    /* renamed from: a */
    public final zzcxx mo28822a(zzxz zzxz) {
        this.f21179a = zzxz;
        return this;
    }

    /* renamed from: b */
    public final String mo28831b() {
        return this.f21182d;
    }

    /* renamed from: c */
    public final zzcxx mo28833c(String str) {
        this.f21191m = str;
        return this;
    }

    /* renamed from: d */
    public final zzyd mo28834d() {
        return this.f21180b;
    }

    /* renamed from: a */
    public final zzxz mo28828a() {
        return this.f21179a;
    }

    /* renamed from: b */
    public final zzcxx mo28830b(ArrayList<String> arrayList) {
        this.f21186h = arrayList;
        return this;
    }

    /* renamed from: c */
    public final zzcxv mo28832c() {
        Preconditions.m16038a(this.f21182d, (Object) "ad unit must not be null");
        Preconditions.m16038a(this.f21180b, (Object) "ad size must not be null");
        Preconditions.m16038a(this.f21179a, (Object) "ad request must not be null");
        return new zzcxv(this);
    }

    /* renamed from: a */
    public final zzcxx mo28823a(zzyd zzyd) {
        this.f21180b = zzyd;
        return this;
    }

    /* renamed from: b */
    public final zzcxx mo28829b(String str) {
        this.f21190l = str;
        return this;
    }

    /* renamed from: a */
    public final zzcxx mo28824a(zzzy zzzy) {
        this.f21181c = zzzy;
        return this;
    }

    /* renamed from: a */
    public final zzcxx mo28825a(String str) {
        this.f21182d = str;
        return this;
    }

    /* renamed from: a */
    public final zzcxx mo28819a(zzacd zzacd) {
        this.f21183e = zzacd;
        return this;
    }

    /* renamed from: a */
    public final zzcxx mo28827a(boolean z) {
        this.f21184f = z;
        return this;
    }

    /* renamed from: a */
    public final zzcxx mo28817a(int i) {
        this.f21192n = i;
        return this;
    }

    /* renamed from: a */
    public final zzcxx mo28826a(ArrayList<String> arrayList) {
        this.f21185g = arrayList;
        return this;
    }

    /* renamed from: a */
    public final zzcxx mo28820a(zzady zzady) {
        this.f21187i = zzady;
        return this;
    }

    /* renamed from: a */
    public final zzcxx mo28821a(zzaiy zzaiy) {
        this.f21193o = zzaiy;
        this.f21183e = new zzacd(false, true, false);
        return this;
    }

    /* renamed from: a */
    public final zzcxx mo28818a(PublisherAdViewOptions publisherAdViewOptions) {
        this.f21188j = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f21184f = publisherAdViewOptions.getManualImpressionsEnabled();
            this.f21189k = publisherAdViewOptions.zzkt();
        }
        return this;
    }
}
