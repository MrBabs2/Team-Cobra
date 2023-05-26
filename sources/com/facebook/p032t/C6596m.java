package com.facebook.p032t;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.p032t.C4728g;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.t.m */
/* compiled from: InternalAppEventsLogger */
public class C6596m {

    /* renamed from: a */
    private C6584h f12250a;

    public C6596m(Context context) {
        this(new C6584h(context, (String) null, (AccessToken) null));
    }

    /* renamed from: c */
    public static C4728g.C4729a m13996c() {
        return C6584h.m13973d();
    }

    /* renamed from: d */
    static String m13997d() {
        return C6584h.m13975f();
    }

    /* renamed from: a */
    public void mo21337a(String str, Bundle bundle) {
        if (C4716f.m7700i()) {
            this.f12250a.mo21325a(str, bundle);
        }
    }

    /* renamed from: b */
    public void mo21342b(String str, Bundle bundle) {
        if (C4716f.m7700i()) {
            this.f12250a.mo21326a(str, (Double) null, bundle);
        }
    }

    public C6596m(Context context, String str) {
        this(new C6584h(context, str, (AccessToken) null));
    }

    public C6596m(String str, String str2, AccessToken accessToken) {
        this(new C6584h(str, str2, accessToken));
    }

    /* renamed from: b */
    static Executor m13995b() {
        return C6584h.m13971c();
    }

    /* renamed from: a */
    public void mo21336a(String str, double d, Bundle bundle) {
        if (C4716f.m7700i()) {
            this.f12250a.mo21324a(str, d, bundle);
        }
    }

    C6596m(C6584h hVar) {
        this.f12250a = hVar;
    }

    /* renamed from: a */
    public void mo21341a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C4716f.m7700i()) {
            this.f12250a.mo21330a(bigDecimal, currency, bundle);
        }
    }

    /* renamed from: a */
    public void mo21339a(String str, String str2) {
        this.f12250a.mo21328a(str, str2);
    }

    /* renamed from: a */
    public void mo21340a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C4716f.m7700i()) {
            this.f12250a.mo21329a(str, bigDecimal, currency, bundle);
        }
    }

    /* renamed from: a */
    public void mo21335a(String str) {
        if (C4716f.m7700i()) {
            this.f12250a.mo21326a(str, (Double) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public void mo21338a(String str, Double d, Bundle bundle) {
        if (C4716f.m7700i()) {
            this.f12250a.mo21326a(str, d, bundle);
        }
    }

    /* renamed from: a */
    public void mo21334a() {
        this.f12250a.mo21322a();
    }

    /* renamed from: a */
    public static void m13994a(Map<String, String> map) {
        C6601p.m14019a(map);
    }
}
