package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzbtv {

    /* renamed from: a */
    private final Set<zzbuz<zzxr>> f19470a;

    /* renamed from: b */
    private final Set<zzbuz<zzbrl>> f19471b;

    /* renamed from: c */
    private final Set<zzbuz<zzbrw>> f19472c;

    /* renamed from: d */
    private final Set<zzbuz<zzbsr>> f19473d;

    /* renamed from: e */
    private final Set<zzbuz<zzbro>> f19474e;

    /* renamed from: f */
    private final Set<zzbuz<zzbrs>> f19475f;

    /* renamed from: g */
    private final Set<zzbuz<AdMetadataListener>> f19476g;

    /* renamed from: h */
    private final Set<zzbuz<AppEventListener>> f19477h;

    /* renamed from: i */
    private zzbrm f19478i;

    /* renamed from: j */
    private zzcmu f19479j;

    public static class zza {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Set<zzbuz<zzxr>> f19480a = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Set<zzbuz<zzbrl>> f19481b = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Set<zzbuz<zzbrw>> f19482c = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Set<zzbuz<zzbsr>> f19483d = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Set<zzbuz<zzbro>> f19484e = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Set<zzbuz<AdMetadataListener>> f19485f = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Set<zzbuz<AppEventListener>> f19486g = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Set<zzbuz<zzbrs>> f19487h = new HashSet();

        /* renamed from: a */
        public final zza mo28441a(zzbrl zzbrl, Executor executor) {
            this.f19481b.add(new zzbuz(zzbrl, executor));
            return this;
        }

        /* renamed from: a */
        public final zza mo28445a(zzbsr zzbsr, Executor executor) {
            this.f19483d.add(new zzbuz(zzbsr, executor));
            return this;
        }

        /* renamed from: a */
        public final zza mo28442a(zzbro zzbro, Executor executor) {
            this.f19484e.add(new zzbuz(zzbro, executor));
            return this;
        }

        /* renamed from: a */
        public final zza mo28443a(zzbrs zzbrs, Executor executor) {
            this.f19487h.add(new zzbuz(zzbrs, executor));
            return this;
        }

        /* renamed from: a */
        public final zza mo28440a(AdMetadataListener adMetadataListener, Executor executor) {
            this.f19485f.add(new zzbuz(adMetadataListener, executor));
            return this;
        }

        /* renamed from: a */
        public final zza mo28439a(AppEventListener appEventListener, Executor executor) {
            this.f19486g.add(new zzbuz(appEventListener, executor));
            return this;
        }

        /* renamed from: a */
        public final zza mo28447a(zzzs zzzs, Executor executor) {
            if (this.f19486g != null) {
                zzcpy zzcpy = new zzcpy();
                zzcpy.mo28765a(zzzs);
                this.f19486g.add(new zzbuz(zzcpy, executor));
            }
            return this;
        }

        /* renamed from: a */
        public final zza mo28446a(zzxr zzxr, Executor executor) {
            this.f19480a.add(new zzbuz(zzxr, executor));
            return this;
        }

        /* renamed from: a */
        public final zza mo28444a(zzbrw zzbrw, Executor executor) {
            this.f19482c.add(new zzbuz(zzbrw, executor));
            return this;
        }

        /* renamed from: a */
        public final zzbtv mo28448a() {
            return new zzbtv(this);
        }
    }

    private zzbtv(zza zza2) {
        this.f19470a = zza2.f19480a;
        this.f19472c = zza2.f19482c;
        this.f19471b = zza2.f19481b;
        this.f19473d = zza2.f19483d;
        this.f19474e = zza2.f19484e;
        this.f19475f = zza2.f19487h;
        this.f19476g = zza2.f19485f;
        this.f19477h = zza2.f19486g;
    }

    /* renamed from: a */
    public final Set<zzbuz<zzbrl>> mo28431a() {
        return this.f19471b;
    }

    /* renamed from: b */
    public final Set<zzbuz<zzbsr>> mo28432b() {
        return this.f19473d;
    }

    /* renamed from: c */
    public final Set<zzbuz<zzbro>> mo28433c() {
        return this.f19474e;
    }

    /* renamed from: d */
    public final Set<zzbuz<zzbrs>> mo28434d() {
        return this.f19475f;
    }

    /* renamed from: e */
    public final Set<zzbuz<AdMetadataListener>> mo28435e() {
        return this.f19476g;
    }

    /* renamed from: f */
    public final Set<zzbuz<AppEventListener>> mo28436f() {
        return this.f19477h;
    }

    /* renamed from: g */
    public final Set<zzbuz<zzxr>> mo28437g() {
        return this.f19470a;
    }

    /* renamed from: h */
    public final Set<zzbuz<zzbrw>> mo28438h() {
        return this.f19472c;
    }

    /* renamed from: a */
    public final zzbrm mo28429a(Set<zzbuz<zzbro>> set) {
        if (this.f19478i == null) {
            this.f19478i = new zzbrm(set);
        }
        return this.f19478i;
    }

    /* renamed from: a */
    public final zzcmu mo28430a(Clock clock) {
        if (this.f19479j == null) {
            this.f19479j = new zzcmu(clock);
        }
        return this.f19479j;
    }
}
