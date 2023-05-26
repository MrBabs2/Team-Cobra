package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzu;

/* renamed from: com.google.android.gms.internal.ads.ph */
final class C7843ph implements zzo, zzu, zzagv, zzagx, zzxr {

    /* renamed from: f */
    private zzxr f16578f;

    /* renamed from: g */
    private zzagv f16579g;

    /* renamed from: h */
    private zzo f16580h;

    /* renamed from: i */
    private zzagx f16581i;

    /* renamed from: j */
    private zzu f16582j;

    private C7843ph() {
    }

    /* renamed from: a */
    public final synchronized void mo26408a(String str, Bundle bundle) {
        if (this.f16579g != null) {
            this.f16579g.mo26408a(str, bundle);
        }
    }

    public final synchronized void onAdClicked() {
        if (this.f16578f != null) {
            this.f16578f.onAdClicked();
        }
    }

    public final synchronized void onAppEvent(String str, String str2) {
        if (this.f16581i != null) {
            this.f16581i.onAppEvent(str, str2);
        }
    }

    public final synchronized void onPause() {
        if (this.f16580h != null) {
            this.f16580h.onPause();
        }
    }

    public final synchronized void onResume() {
        if (this.f16580h != null) {
            this.f16580h.onResume();
        }
    }

    public final synchronized void zzsz() {
        if (this.f16580h != null) {
            this.f16580h.zzsz();
        }
    }

    public final synchronized void zzta() {
        if (this.f16580h != null) {
            this.f16580h.zzta();
        }
    }

    public final synchronized void zztq() {
        if (this.f16582j != null) {
            this.f16582j.zztq();
        }
    }

    /* synthetic */ C7843ph(C7695lh lhVar) {
        this();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m17870a(zzxr zzxr, zzagv zzagv, zzo zzo, zzagx zzagx, zzu zzu) {
        this.f16578f = zzxr;
        this.f16579g = zzagv;
        this.f16580h = zzo;
        this.f16581i = zzagx;
        this.f16582j = zzu;
    }
}
