package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.i5 */
final class C7568i5 extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ zzaxi f15572a;

    private C7568i5(zzaxi zzaxi) {
        this.f15572a = zzaxi;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            boolean unused = this.f15572a.f18654c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            boolean unused2 = this.f15572a.f18654c = false;
        }
    }

    /* synthetic */ C7568i5(zzaxi zzaxi, C7421e5 e5Var) {
        this(zzaxi);
    }
}
