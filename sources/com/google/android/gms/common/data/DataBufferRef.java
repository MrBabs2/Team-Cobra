package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class DataBufferRef {
    @KeepForSdk

    /* renamed from: a */
    protected final DataHolder f14032a;
    @KeepForSdk

    /* renamed from: b */
    protected int f14033b;

    /* renamed from: c */
    private int f14034c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25224a(int i) {
        Preconditions.m16047b(i >= 0 && i < this.f14032a.getCount());
        this.f14033b = i;
        this.f14034c = this.f14032a.mo25227a(i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (!Objects.m16031a(Integer.valueOf(dataBufferRef.f14033b), Integer.valueOf(this.f14033b)) || !Objects.m16031a(Integer.valueOf(dataBufferRef.f14034c), Integer.valueOf(this.f14034c)) || dataBufferRef.f14032a != this.f14032a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f14033b), Integer.valueOf(this.f14034c), this.f14032a);
    }
}
