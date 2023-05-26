package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;

public class zzbvz {

    /* renamed from: a */
    private final zzbwz f19527a;

    /* renamed from: b */
    private final zzbgz f19528b;

    public zzbvz(zzbwz zzbwz) {
        this(zzbwz, (zzbgz) null);
    }

    /* renamed from: a */
    public final zzbgz mo28466a() {
        return this.f19528b;
    }

    /* renamed from: b */
    public final zzbwz mo28467b() {
        return this.f19527a;
    }

    /* renamed from: c */
    public final View mo28468c() {
        zzbgz zzbgz = this.f19528b;
        if (zzbgz == null) {
            return null;
        }
        return zzbgz.getWebView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo28469d() {
        if (this.f19528b.mo25644F() != null) {
            this.f19528b.mo25644F().close();
        }
    }

    public zzbvz(zzbwz zzbwz, zzbgz zzbgz) {
        this.f19527a = zzbwz;
        this.f19528b = zzbgz;
    }

    /* renamed from: a */
    public Set<zzbuz<zzbrl>> mo26551a(zzbxc zzbxc) {
        return Collections.singleton(zzbuz.m21935a(zzbxc, zzbbm.f18749b));
    }
}
