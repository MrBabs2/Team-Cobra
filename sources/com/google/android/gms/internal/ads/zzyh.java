package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

@zzard
public class zzyh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzxx f23029a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzxw f23030b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzabk f23031c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzagk f23032d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzatf f23033e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzaqf f23034f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzagl f23035g;

    public zzyh(zzxx zzxx, zzxw zzxw, zzabk zzabk, zzagk zzagk, zzatf zzatf, zzauj zzauj, zzaqf zzaqf, zzagl zzagl) {
        this.f23029a = zzxx;
        this.f23030b = zzxw;
        this.f23031c = zzabk;
        this.f23032d = zzagk;
        this.f23033e = zzatf;
        this.f23034f = zzaqf;
        this.f23035g = zzagl;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m25653a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzyt.m25666a().mo27879a(context, zzyt.m25672g().f18742f, "gmob-apps", bundle, true);
    }

    /* renamed from: b */
    public final zzatt mo29920b(Context context, String str, zzamp zzamp) {
        return (zzatt) new i60(this, context, str, zzamp).mo26124a(context, false);
    }

    /* renamed from: a */
    public final zzzf mo29919a(Context context, String str, zzamp zzamp) {
        return (zzzf) new d60(this, context, str, zzamp).mo26124a(context, false);
    }

    /* renamed from: a */
    public final zzaem mo29916a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzaem) new f60(this, frameLayout, frameLayout2, context).mo26124a(context, false);
    }

    /* renamed from: a */
    public final zzaer mo29917a(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (zzaer) new g60(this, view, hashMap, hashMap2).mo26124a(view.getContext(), false);
    }

    /* renamed from: a */
    public final zzaqg mo29918a(Activity activity) {
        a60 a60 = new a60(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzbad.m20519b("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzaqg) a60.mo26124a(activity, z);
    }
}
