package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

public final class zzcyi implements zzaws, zzbro {

    /* renamed from: f */
    private final HashSet<zzawj> f21199f = new HashSet<>();

    /* renamed from: g */
    private final Context f21200g;

    /* renamed from: h */
    private final zzawu f21201h;

    public zzcyi(Context context, zzawu zzawu) {
        this.f21200g = context;
        this.f21201h = zzawu;
    }

    /* renamed from: a */
    public final synchronized void mo27751a(HashSet<zzawj> hashSet) {
        this.f21199f.clear();
        this.f21199f.addAll(hashSet);
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (i != 3) {
            this.f21201h.mo27759a(this.f21199f);
        }
    }

    /* renamed from: a */
    public final Bundle mo28838a() {
        return this.f21201h.mo27754a(this.f21200g, (zzaws) this);
    }
}
