package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

@zzard
public final class zzasp extends zzass {

    /* renamed from: f */
    private final String f18502f;

    /* renamed from: g */
    private final int f18503g;

    public zzasp(String str, int i) {
        this.f18502f = str;
        this.f18503g = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzasp)) {
            zzasp zzasp = (zzasp) obj;
            if (!Objects.m16031a(this.f18502f, zzasp.f18502f) || !Objects.m16031a(Integer.valueOf(this.f18503g), Integer.valueOf(zzasp.f18503g))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int getAmount() {
        return this.f18503g;
    }

    public final String getType() {
        return this.f18502f;
    }
}
