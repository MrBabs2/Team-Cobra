package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdrr;
import java.io.IOException;

public class zzdrr<M extends zzdrr<M>> extends zzdrw {

    /* renamed from: b */
    protected zzdrt f21649b;

    /* renamed from: a */
    public void mo29198a(zzdrp zzdrp) throws IOException {
        if (this.f21649b != null) {
            for (int i = 0; i < this.f21649b.mo29205b(); i++) {
                this.f21649b.mo29204a(i).mo26784a(zzdrp);
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ zzdrw mo29199b() throws CloneNotSupportedException {
        return (zzdrr) clone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo29200c() {
        if (this.f21649b != null) {
            for (int i = 0; i < this.f21649b.mo29205b(); i++) {
                this.f21649b.mo29204a(i).mo26785b();
            }
        }
        return 0;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzdrr zzdrr = (zzdrr) super.clone();
        zzdrv.m24140a(this, zzdrr);
        return zzdrr;
    }
}
