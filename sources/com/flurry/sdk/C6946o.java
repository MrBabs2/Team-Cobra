package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.flurry.sdk.C6960p;
import com.google.android.instantapps.InstantApps;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.o */
public final class C6946o extends C6798d7<C6933n> {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C6979q f13043o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f13044p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f13045q;

    /* renamed from: r */
    public String f13046r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6823f7<C6960p> f13047s;

    /* renamed from: com.flurry.sdk.o$a */
    class C6947a implements C6823f7<C6960p> {

        /* renamed from: com.flurry.sdk.o$a$a */
        class C6948a extends C6816f2 {

            /* renamed from: h */
            final /* synthetic */ C6960p f13049h;

            C6948a(C6960p pVar) {
                this.f13049h = pVar;
            }

            /* renamed from: a */
            public final void mo23531a() throws Exception {
                if (C6946o.this.f13045q == null && this.f13049h.f13059a.equals(C6960p.C6961a.CREATED)) {
                    String unused = C6946o.this.f13045q = this.f13049h.f13060b.getString("activity_name");
                    C6946o.this.mo23667b();
                    C6946o.this.f13043o.mo23584b(C6946o.this.f13047s);
                }
            }
        }

        C6947a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            Future unused = C6946o.this.mo23563c(new C6948a((C6960p) obj));
        }
    }

    /* renamed from: com.flurry.sdk.o$b */
    class C6949b extends C6816f2 {
        C6949b() {
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            Context a = C6747b0.m14386a();
            if (a == null) {
                C6792d1.m14476a(6, "InstantAppProvider", "Context is null");
                return;
            }
            try {
                Class.forName("com.google.android.instantapps.InstantApps");
                boolean unused = C6946o.this.f13044p = InstantApps.isInstantApp(a);
                C6792d1.m14476a(3, "InstantAppProvider", "isInstantApp: " + String.valueOf(C6946o.this.f13044p));
            } catch (ClassNotFoundException unused2) {
                C6792d1.m14476a(3, "InstantAppProvider", "isInstantApps dependency is not added");
            }
            C6946o.this.mo23667b();
        }
    }

    public C6946o(C6979q qVar) {
        super("InstantAppProvider");
        C6947a aVar = new C6947a();
        this.f13047s = aVar;
        this.f13043o = qVar;
        qVar.mo23582a(aVar);
    }

    /* renamed from: b */
    public final void mo23667b() {
        if (!this.f13044p || mo23570a() != null) {
            boolean z = this.f13044p;
            mo23583a(new C6933n(z, z ? mo23570a() : null));
            return;
        }
        C6792d1.m14476a(3, "InstantAppProvider", "Fetching instant app name");
    }

    /* renamed from: d */
    public final void mo23585d() {
        mo23563c(new C6949b());
    }

    /* renamed from: a */
    public final String mo23570a() {
        if (!this.f13044p) {
            return null;
        }
        return !TextUtils.isEmpty(this.f13046r) ? this.f13046r : this.f13045q;
    }
}
