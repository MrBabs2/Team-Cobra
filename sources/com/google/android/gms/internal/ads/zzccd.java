package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;
import p050l.p066e.C4881g;

public final class zzccd extends zzaff {

    /* renamed from: f */
    private final Context f19939f;

    /* renamed from: g */
    private final zzbyt f19940g;

    /* renamed from: h */
    private final zzbzl f19941h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzbyn f19942i;

    public zzccd(Context context, zzbyt zzbyt, zzbzl zzbzl, zzbyn zzbyn) {
        this.f19939f = context;
        this.f19940g = zzbyt;
        this.f19941h = zzbzl;
        this.f19942i = zzbyn;
    }

    /* renamed from: L0 */
    public final IObjectWrapper mo27249L0() {
        return ObjectWrapper.m16391a(this.f19939f);
    }

    /* renamed from: c */
    public final String mo27250c(String str) {
        return this.f19940g.mo28555v().get(str);
    }

    public final void destroy() {
        this.f19942i.mo28384a();
    }

    /* renamed from: e */
    public final zzaei mo27252e(String str) {
        return this.f19940g.mo28554u().get(str);
    }

    public final List<String> getAvailableAssetNames() {
        C4881g<String, zzadw> u = this.f19940g.mo28554u();
        C4881g<String, String> v = this.f19940g.mo28555v();
        String[] strArr = new String[(u.size() + v.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < u.size()) {
            strArr[i3] = u.mo17022b(i2);
            i2++;
            i3++;
        }
        while (i < v.size()) {
            strArr[i3] = v.mo17022b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final String getCustomTemplateId() {
        return this.f19940g.mo28538e();
    }

    public final zzaar getVideoController() {
        return this.f19940g.mo28546m();
    }

    /* renamed from: j */
    public final IObjectWrapper mo27256j() {
        return null;
    }

    public final void performClick(String str) {
        this.f19942i.mo28503a(str);
    }

    /* renamed from: r */
    public final boolean mo27258r(IObjectWrapper iObjectWrapper) {
        Object H = ObjectWrapper.m16390H(iObjectWrapper);
        if (!(H instanceof ViewGroup) || !this.f19941h.mo28600a((ViewGroup) H)) {
            return false;
        }
        this.f19940g.mo28551r().mo25656a((zzadx) new C7580ih(this));
        return true;
    }

    public final void recordImpression() {
        this.f19942i.mo28511h();
    }
}
