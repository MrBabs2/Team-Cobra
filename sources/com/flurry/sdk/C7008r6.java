package com.flurry.sdk;

import android.os.SystemClock;
import org.json.JSONException;

/* renamed from: com.flurry.sdk.r6 */
public abstract class C7008r6 implements C7044u6 {

    /* renamed from: a */
    private long f13148a = System.currentTimeMillis();

    /* renamed from: b */
    private long f13149b = SystemClock.elapsedRealtime();

    /* renamed from: c */
    private C7031t6 f13150c;

    /* renamed from: d */
    private boolean f13151d;

    public C7008r6(C7031t6 t6Var) {
        this.f13150c = t6Var;
        this.f13151d = true;
    }

    /* renamed from: b */
    public final long mo23710b() {
        return this.f13149b;
    }

    /* renamed from: c */
    public final long mo23711c() {
        return this.f13148a;
    }

    /* renamed from: d */
    public final String mo23712d() {
        try {
            return this.f13150c.mo23540a().toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public final byte mo23713e() {
        return (this.f13151d ^ true) | true ? (byte) 1 : 0;
    }

    /* renamed from: f */
    public final C7031t6 mo23714f() {
        return this.f13150c;
    }

    /* renamed from: g */
    public final boolean mo23715g() {
        return this.f13151d;
    }
}
