package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Locale;

/* renamed from: com.flurry.sdk.s */
public final class C7009s extends C6798d7<C6996r> {

    /* renamed from: o */
    protected BroadcastReceiver f13152o = new C7010a();

    /* renamed from: com.flurry.sdk.s$a */
    class C7010a extends BroadcastReceiver {
        C7010a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C7009s.this.mo23583a(C7009s.m14886b());
        }
    }

    /* renamed from: com.flurry.sdk.s$b */
    class C7011b extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C6823f7 f13154h;

        C7011b(C7009s sVar, C6823f7 f7Var) {
            this.f13154h = f7Var;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            this.f13154h.mo23539a(C7009s.m14886b());
        }
    }

    public C7009s() {
        super("LocaleProvider");
        Context a = C6747b0.m14386a();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        if (a != null) {
            a.registerReceiver(this.f13152o, intentFilter);
        } else {
            C6792d1.m14476a(6, "LocaleProvider", "Context is null when initializing.");
        }
    }

    /* renamed from: b */
    public static C6996r m14886b() {
        return new C6996r(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
    }

    /* renamed from: a */
    public final void mo23582a(C6823f7<C6996r> f7Var) {
        super.mo23582a(f7Var);
        mo23563c(new C7011b(this, f7Var));
    }
}
