package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzbmg {

    /* renamed from: a */
    private final String f19167a;

    /* renamed from: b */
    private final zzaly f19168b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f19169c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzbmn f19170d;

    /* renamed from: e */
    private final zzaho<Object> f19171e = new C7912rc(this);

    /* renamed from: f */
    private final zzaho<Object> f19172f = new C7986tc(this);

    public zzbmg(String str, zzaly zzaly, Executor executor) {
        this.f19167a = str;
        this.f19168b = zzaly;
        this.f19169c = executor;
    }

    /* renamed from: a */
    public final void mo28268a(zzbmn zzbmn) {
        this.f19168b.mo27376a("/updateActiveView", this.f19171e);
        this.f19168b.mo27376a("/untrackActiveViewUnit", this.f19172f);
        this.f19170d = zzbmn;
    }

    /* renamed from: b */
    public final void mo28269b(zzbgz zzbgz) {
        zzbgz.mo25674b("/updateActiveView", this.f19171e);
        zzbgz.mo25674b("/untrackActiveViewUnit", this.f19172f);
    }

    /* renamed from: a */
    public final void mo28267a(zzbgz zzbgz) {
        zzbgz.mo25662a("/updateActiveView", (zzaho<? super zzbgz>) this.f19171e);
        zzbgz.mo25662a("/untrackActiveViewUnit", (zzaho<? super zzbgz>) this.f19172f);
    }

    /* renamed from: a */
    public final void mo28266a() {
        this.f19168b.mo27377b("/updateActiveView", this.f19171e);
        this.f19168b.mo27377b("/untrackActiveViewUnit", this.f19172f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m21354a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(this.f19167a)) {
            return false;
        }
        return true;
    }
}
