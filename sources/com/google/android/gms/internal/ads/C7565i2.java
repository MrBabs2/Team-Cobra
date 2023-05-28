package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.i2 */
final class C7565i2 implements zzahw {

    /* renamed from: a */
    private final zzakw f15559a;

    /* renamed from: b */
    private final zzbbr f15560b;

    /* renamed from: c */
    private final /* synthetic */ zzalu f15561c;

    public C7565i2(zzalu zzalu, zzakw zzakw, zzbbr zzbbr) {
        this.f15561c = zzalu;
        this.f15559a = zzakw;
        this.f15560b = zzbbr;
    }

    /* renamed from: a */
    public final void mo26069a(JSONObject jSONObject) {
        try {
            this.f15560b.mo27904b(this.f15561c.f18185a.mo25760a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f15560b.mo27904b(e);
        } finally {
            this.f15559a.mo27363c();
        }
    }

    public final void onFailure(String str) {
        if (str == null) {
            try {
                this.f15560b.mo27903a(new zzali());
            } catch (IllegalStateException unused) {
                this.f15559a.mo27363c();
                return;
            } catch (Throwable th) {
                this.f15559a.mo27363c();
                throw th;
            }
        } else {
            this.f15560b.mo27903a(new zzali(str));
        }
        this.f15559a.mo27363c();
    }
}
