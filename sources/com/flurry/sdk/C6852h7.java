package com.flurry.sdk;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: com.flurry.sdk.h7 */
public final class C6852h7 extends C6798d7<C6877i7> {

    /* renamed from: o */
    private C6979q f12820o;

    /* renamed from: p */
    private C6877i7 f12821p = null;

    /* renamed from: q */
    protected C6823f7<C6960p> f12822q = new C6854b();

    /* renamed from: com.flurry.sdk.h7$a */
    class C6853a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C6823f7 f12823h;

        /* renamed from: i */
        final /* synthetic */ C6877i7 f12824i;

        C6853a(C6852h7 h7Var, C6823f7 f7Var, C6877i7 i7Var) {
            this.f12823h = f7Var;
            this.f12824i = i7Var;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            this.f12823h.mo23539a(this.f12824i);
        }
    }

    /* renamed from: com.flurry.sdk.h7$b */
    class C6854b implements C6823f7<C6960p> {
        C6854b() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            Bundle bundle;
            C6960p pVar = (C6960p) obj;
            int i = C6855c.f12826a[pVar.f13059a.ordinal()];
            if (i == 1) {
                C6852h7.m14576a(C6852h7.this, true);
            } else if (i == 2) {
                C6852h7.m14576a(C6852h7.this, false);
            } else if (i == 3 && (bundle = pVar.f13060b) != null && bundle.containsKey("trim_memory_level") && bundle.getInt("trim_memory_level") == 20) {
                C6852h7.m14576a(C6852h7.this, false);
            }
        }
    }

    /* renamed from: com.flurry.sdk.h7$c */
    static /* synthetic */ class C6855c {

        /* renamed from: a */
        static final /* synthetic */ int[] f12826a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.flurry.sdk.p$a[] r0 = com.flurry.sdk.C6960p.C6961a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12826a = r0
                com.flurry.sdk.p$a r1 = com.flurry.sdk.C6960p.C6961a.STARTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12826a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.flurry.sdk.p$a r1 = com.flurry.sdk.C6960p.C6961a.APP_BACKGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12826a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.flurry.sdk.p$a r1 = com.flurry.sdk.C6960p.C6961a.TRIM_MEMORY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6852h7.C6855c.<clinit>():void");
        }
    }

    public C6852h7(C6979q qVar) {
        super("AppStateChangeProvider");
        this.f12820o = qVar;
        C6838g7 g7Var = C6838g7.UNKNOWN;
        this.f12821p = new C6877i7(g7Var, g7Var);
        this.f12820o.mo23582a(this.f12822q);
    }

    /* renamed from: c */
    private void m14577c() {
        HashMap hashMap = new HashMap();
        hashMap.put("previous_state", this.f12821p.f12862a.name());
        hashMap.put("current_state", this.f12821p.f12863b.name());
        C6826g0.m14532b();
        C6826g0.m14533b("AppStateChangeProvider: app state change", hashMap);
    }

    /* renamed from: a */
    public final void mo23582a(C6823f7<C6877i7> f7Var) {
        super.mo23582a(f7Var);
        mo23563c(new C6853a(this, f7Var, this.f12821p));
    }

    /* renamed from: b */
    public final C6838g7 mo23603b() {
        C6877i7 i7Var = this.f12821p;
        if (i7Var == null) {
            return C6838g7.UNKNOWN;
        }
        return i7Var.f12863b;
    }

    /* renamed from: a */
    public final void mo23570a() {
        C6792d1.m14476a(2, "AppStateChangeProvider", "AppStateChangeRule: prev " + this.f12821p.f12862a + " stateData.currentState:" + this.f12821p.f12863b);
        m14577c();
        C6877i7 i7Var = this.f12821p;
        mo23583a(new C6877i7(i7Var.f12862a, i7Var.f12863b));
    }

    /* renamed from: a */
    static /* synthetic */ void m14576a(C6852h7 h7Var, boolean z) {
        C6838g7 g7Var = z ? C6838g7.FOREGROUND : C6838g7.BACKGROUND;
        C6838g7 g7Var2 = h7Var.f12821p.f12863b;
        if (g7Var2 != g7Var) {
            h7Var.f12821p = new C6877i7(g7Var2, g7Var);
            h7Var.mo23570a();
        }
    }
}
