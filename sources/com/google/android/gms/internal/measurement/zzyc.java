package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyc;
import java.io.IOException;

public abstract class zzyc<M extends zzyc<M>> extends zzyi {

    /* renamed from: b */
    protected zzye f23568b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo30484a() {
        if (this.f23568b == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f23568b.mo30493b(); i2++) {
            i += this.f23568b.mo30492a(i2).mo30195b();
        }
        return i;
    }

    /* renamed from: c */
    public final /* synthetic */ zzyi mo30486c() throws CloneNotSupportedException {
        return (zzyc) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzyc zzyc = (zzyc) super.clone();
        zzyg.m26754a(this, zzyc);
        return zzyc;
    }

    /* renamed from: a */
    public void mo30485a(zzya zzya) throws IOException {
        if (this.f23568b != null) {
            for (int i = 0; i < this.f23568b.mo30493b(); i++) {
                this.f23568b.mo30492a(i).mo30194a(zzya);
            }
        }
    }
}
