package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.sdk.C6784d0;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.d */
public final class C6778d extends C6798d7<C6804e> {

    /* renamed from: o */
    public String f12618o;

    /* renamed from: p */
    public boolean f12619p = false;

    /* renamed from: q */
    public boolean f12620q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C6933n f12621r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6823f7<C6933n> f12622s = new C6779a();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C6946o f12623t;

    /* renamed from: u */
    private C6852h7 f12624u;

    /* renamed from: v */
    private C6823f7<C6877i7> f12625v = new C6781b();

    /* renamed from: com.flurry.sdk.d$a */
    class C6779a implements C6823f7<C6933n> {

        /* renamed from: com.flurry.sdk.d$a$a */
        class C6780a extends C6816f2 {

            /* renamed from: h */
            final /* synthetic */ C6933n f12627h;

            C6780a(C6933n nVar) {
                this.f12627h = nVar;
            }

            /* renamed from: a */
            public final void mo23531a() throws Exception {
                C6792d1.m14476a(3, "FlurryProvider", "isInstantApp: " + this.f12627h.f13003a);
                C6933n unused = C6778d.this.f12621r = this.f12627h;
                C6778d.m14453a(C6778d.this);
                C6778d.this.f12623t.mo23584b(C6778d.this.f12622s);
            }
        }

        C6779a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            Future unused = C6778d.this.mo23563c(new C6780a((C6933n) obj));
        }
    }

    /* renamed from: com.flurry.sdk.d$b */
    class C6781b implements C6823f7<C6877i7> {
        C6781b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo23539a(Object obj) {
            C6778d.m14453a(C6778d.this);
        }
    }

    /* renamed from: com.flurry.sdk.d$c */
    public class C6782c extends C6816f2 {
        public C6782c() {
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6778d.m14456d(C6778d.this);
            C6778d.m14453a(C6778d.this);
        }
    }

    /* renamed from: com.flurry.sdk.d$d */
    public enum C6783d {
        UNAVAILABLE(-2),
        UNKNOWN(-1),
        SUCCESS(0),
        SERVICE_MISSING(1),
        SERVICE_UPDATING(2),
        SERVICE_VERSION_UPDATE_REQUIRED(3),
        SERVICE_DISABLED(4),
        SERVICE_INVALID(5);
        

        /* renamed from: f */
        public int f12640f;

        private C6783d(int i) {
            this.f12640f = i;
        }
    }

    public C6778d(C6946o oVar, C6852h7 h7Var) {
        super("FlurryProvider");
        this.f12623t = oVar;
        oVar.mo23582a(this.f12622s);
        this.f12624u = h7Var;
        h7Var.mo23582a(this.f12625v);
    }

    /* renamed from: d */
    static /* synthetic */ void m14456d(C6778d dVar) {
        if (TextUtils.isEmpty(dVar.f12618o)) {
            C6792d1.m14476a(6, "FlurryProvider", "Streaming API Key is invalid");
            return;
        }
        int b = C6971p2.m14811b("prev_streaming_api_key", 0);
        int hashCode = C6971p2.m14813b("api_key", "").hashCode();
        int hashCode2 = dVar.f12618o.hashCode();
        if (b != hashCode2 && hashCode != hashCode2) {
            C6792d1.m14476a(3, "FlurryProvider", "Streaming API key is refreshed");
            C6971p2.m14808a("prev_streaming_api_key", hashCode2);
            C6784d0 d0Var = C6812e7.m14513a().f12706k;
            C6792d1.m14476a(3, "ReportingProvider", "Reset initial timestamp.");
            d0Var.mo23563c(new C6784d0.C6787c());
        }
    }

    /* renamed from: a */
    private static C6783d m14450a() {
        try {
            int c = GoogleApiAvailability.m15256a().mo24869c(C6747b0.m14386a());
            if (c == 0) {
                return C6783d.SUCCESS;
            }
            if (c == 1) {
                return C6783d.SERVICE_MISSING;
            }
            if (c == 2) {
                return C6783d.SERVICE_VERSION_UPDATE_REQUIRED;
            }
            if (c == 3) {
                return C6783d.SERVICE_DISABLED;
            }
            if (c == 9) {
                return C6783d.SERVICE_INVALID;
            }
            if (c != 18) {
                return C6783d.UNAVAILABLE;
            }
            return C6783d.SERVICE_UPDATING;
        } catch (Exception | NoClassDefFoundError unused) {
            C6792d1.m14476a(3, "FlurryProvider", "Error retrieving Google Play Services Availability. This probably means google play services is unavailable.");
            return C6783d.UNAVAILABLE;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14453a(C6778d dVar) {
        if (!TextUtils.isEmpty(dVar.f12618o) && dVar.f12621r != null) {
            dVar.mo23583a(new C6804e(C6896k0.m14646c().mo23630a(), dVar.f12619p, m14450a(), dVar.f12621r));
        }
    }
}
