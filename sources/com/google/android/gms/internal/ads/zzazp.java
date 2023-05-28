package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;

@zzard
public final class zzazp {

    /* renamed from: a */
    private final BroadcastReceiver f18713a = new C7422e6(this);

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f18714b = new WeakHashMap();

    /* renamed from: c */
    private boolean f18715c = false;

    /* renamed from: d */
    private boolean f18716d;

    /* renamed from: e */
    private Context f18717e;

    /* renamed from: a */
    public final synchronized void mo27870a(Context context) {
        if (!this.f18715c) {
            Context applicationContext = context.getApplicationContext();
            this.f18717e = applicationContext;
            if (applicationContext == null) {
                this.f18717e = context;
            }
            zzacu.m18983a(this.f18717e);
            this.f18716d = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17803H1)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f18717e.registerReceiver(this.f18713a, intentFilter);
            this.f18715c = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo27872a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f18716d) {
            this.f18714b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* renamed from: a */
    public final synchronized void mo27871a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f18716d) {
            this.f18714b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m20451a(Context context, Intent intent) {
        for (Map.Entry next : this.f18714b.entrySet()) {
            if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) next.getKey()).onReceive(context, intent);
            }
        }
    }
}
