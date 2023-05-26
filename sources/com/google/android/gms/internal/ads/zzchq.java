package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzchq {

    /* renamed from: a */
    private final Context f20215a;

    /* renamed from: b */
    private final zzbai f20216b;

    /* renamed from: c */
    private final zzcxv f20217c;

    /* renamed from: d */
    private final Executor f20218d;

    public zzchq(Context context, zzbai zzbai, zzcxv zzcxv, Executor executor) {
        this.f20215a = context;
        this.f20216b = zzbai;
        this.f20217c = zzcxv;
        this.f20218d = executor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zzbbh<zzcxu> mo28695a() {
        zzalr b = zzk.zzlt().mo27372b(this.f20215a, this.f20216b);
        zzaln<JSONObject> zzaln = zzalo.f18180b;
        zzalj<I, O> a = b.mo27373a("google.afma.response.normalize", zzaln, zzaln);
        return zzbar.m20542a(zzbar.m20542a(zzbar.m20542a(zzbar.m20539a(""), new C7435ej(this, this.f20217c.f21167d.f22999x), this.f20218d), new C7472fj(a), this.f20218d), new C7508gj(this), this.f20218d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28696a(JSONObject jSONObject) throws Exception {
        return zzbar.m20539a(new zzcxu(new zzcxr(this.f20217c), zzcxs.m23065a(new StringReader(jSONObject.toString()))));
    }
}
