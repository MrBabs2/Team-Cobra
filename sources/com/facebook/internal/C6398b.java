package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C6596m;
import p050l.p097m.p098a.C5133a;

/* renamed from: com.facebook.internal.b */
/* compiled from: BoltsMeasurementEventListener */
public class C6398b extends BroadcastReceiver {

    /* renamed from: b */
    private static C6398b f11762b;

    /* renamed from: a */
    private Context f11763a;

    private C6398b(Context context) {
        this.f11763a = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m13273a() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                C5133a.m9478a(this.f11763a).mo17800a((BroadcastReceiver) this);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: b */
    private void m13274b() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                C5133a.m9478a(this.f11763a).mo17801a(this, new IntentFilter("com.parse.bolts.measurement_event"));
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!C6391a.m13260a((Object) this)) {
            try {
                m13273a();
                super.finalize();
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                C6596m mVar = new C6596m(context);
                String str = "bf_" + intent.getStringExtra("event_name");
                Bundle bundleExtra = intent.getBundleExtra("event_args");
                Bundle bundle = new Bundle();
                for (String str2 : bundleExtra.keySet()) {
                    bundle.putString(str2.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str2));
                }
                mVar.mo21337a(str, bundle);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    public static C6398b m13272a(Context context) {
        if (C6391a.m13260a((Object) C6398b.class)) {
            return null;
        }
        try {
            if (f11762b != null) {
                return f11762b;
            }
            C6398b bVar = new C6398b(context);
            f11762b = bVar;
            bVar.m13274b();
            return f11762b;
        } catch (Throwable th) {
            C6391a.m13259a(th, C6398b.class);
            return null;
        }
    }
}
