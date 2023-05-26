package com.facebook;

import android.content.Intent;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import p050l.p097m.p098a.C5133a;

/* renamed from: com.facebook.n */
/* compiled from: ProfileManager */
public final class C6536n {

    /* renamed from: d */
    private static volatile C6536n f12113d;

    /* renamed from: a */
    private final C5133a f12114a;

    /* renamed from: b */
    private final C6535m f12115b;

    /* renamed from: c */
    private Profile f12116c;

    C6536n(C5133a aVar, C6535m mVar) {
        C6481y.m13556a((Object) aVar, "localBroadcastManager");
        C6481y.m13556a((Object) mVar, "profileCache");
        this.f12114a = aVar;
        this.f12115b = mVar;
    }

    /* renamed from: c */
    static C6536n m13829c() {
        if (f12113d == null) {
            synchronized (C6536n.class) {
                if (f12113d == null) {
                    f12113d = new C6536n(C5133a.m9478a(C4716f.m7696e()), new C6535m());
                }
            }
        }
        return f12113d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Profile mo21226a() {
        return this.f12116c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo21228b() {
        Profile b = this.f12115b.mo21225b();
        if (b == null) {
            return false;
        }
        m13828a(b, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21227a(Profile profile) {
        m13828a(profile, true);
    }

    /* renamed from: a */
    private void m13828a(Profile profile, boolean z) {
        Profile profile2 = this.f12116c;
        this.f12116c = profile;
        if (z) {
            if (profile != null) {
                this.f12115b.mo21224a(profile);
            } else {
                this.f12115b.mo21223a();
            }
        }
        if (!C6476x.m13515a(profile2, profile)) {
            m13827a(profile2, profile);
        }
    }

    /* renamed from: a */
    private void m13827a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f12114a.mo17802a(intent);
    }
}
