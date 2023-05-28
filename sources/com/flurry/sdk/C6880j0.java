package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.TimeZone;

/* renamed from: com.flurry.sdk.j0 */
public final class C6880j0 extends C6798d7<String> {

    /* renamed from: o */
    protected BroadcastReceiver f12868o = new C6881a();

    /* renamed from: com.flurry.sdk.j0$a */
    class C6881a extends BroadcastReceiver {
        C6881a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C6880j0.this.mo23583a(TimeZone.getDefault().getID());
        }
    }

    /* renamed from: com.flurry.sdk.j0$b */
    class C6882b extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C6823f7 f12870h;

        C6882b(C6880j0 j0Var, C6823f7 f7Var) {
            this.f12870h = f7Var;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            this.f12870h.mo23539a(TimeZone.getDefault().getID());
        }
    }

    public C6880j0() {
        super("TimeZoneProvider");
        Context a = C6747b0.m14386a();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
        if (a != null) {
            a.registerReceiver(this.f12868o, intentFilter);
        } else {
            C6792d1.m14476a(6, "TimeZoneProvider", "Context is null when initializing.");
        }
    }

    /* renamed from: a */
    public final void mo23582a(C6823f7<String> f7Var) {
        super.mo23582a(f7Var);
        mo23563c(new C6882b(this, f7Var));
    }
}
