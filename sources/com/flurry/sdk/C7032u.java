package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: com.flurry.sdk.u */
public final class C7032u extends C6798d7<C7024t> {

    /* renamed from: o */
    public boolean f13230o = true;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f13231p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f13232q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Location f13233r;

    /* renamed from: s */
    private C6852h7 f13234s;

    /* renamed from: t */
    protected C6823f7<C6877i7> f13235t;

    /* renamed from: com.flurry.sdk.u$a */
    class C7033a implements C6823f7<C6877i7> {
        C7033a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            boolean unused = C7032u.this.f13232q = ((C6877i7) obj).f12863b == C6838g7.FOREGROUND;
            if (C7032u.this.f13232q) {
                C7032u.this.mo23721e();
            }
        }
    }

    /* renamed from: com.flurry.sdk.u$b */
    class C7034b extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C6823f7 f13237h;

        C7034b(C6823f7 f7Var) {
            this.f13237h = f7Var;
        }

        /* renamed from: a */
        public final void mo23531a() {
            Location b = C7032u.this.m14911a();
            if (b != null) {
                Location unused = C7032u.this.f13233r = b;
            }
            this.f13237h.mo23539a(new C7024t(C7032u.this.f13230o, C7032u.this.f13231p, C7032u.this.f13233r));
        }
    }

    public C7032u(C6852h7 h7Var) {
        super("LocationProvider");
        C7033a aVar = new C7033a();
        this.f13235t = aVar;
        this.f13234s = h7Var;
        h7Var.mo23582a(aVar);
    }

    /* renamed from: e */
    public final void mo23721e() {
        Location a = m14911a();
        if (a != null) {
            this.f13233r = a;
        }
        mo23583a(new C7024t(this.f13230o, this.f13231p, this.f13233r));
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public Location m14911a() {
        if (this.f13230o && this.f13232q) {
            if (C6954o2.m14770a("android.permission.ACCESS_FINE_LOCATION") || C6954o2.m14770a("android.permission.ACCESS_COARSE_LOCATION")) {
                String str = C6954o2.m14770a("android.permission.ACCESS_FINE_LOCATION") ? "passive" : "network";
                this.f13231p = true;
                LocationManager locationManager = (LocationManager) C6747b0.m14386a().getSystemService("location");
                if (locationManager != null) {
                    return locationManager.getLastKnownLocation(str);
                }
            } else {
                this.f13231p = false;
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo23582a(C6823f7<C7024t> f7Var) {
        super.mo23582a(f7Var);
        mo23563c(new C7034b(f7Var));
    }
}
