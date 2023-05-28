package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzcmu {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Clock f20623a;

    /* renamed from: b */
    private final List<String> f20624b = Collections.synchronizedList(new ArrayList());

    public zzcmu(Clock clock) {
        this.f20623a = clock;
    }

    /* renamed from: a */
    public final <T> zzbbh<T> mo28741a(zzcxm zzcxm, zzbbh<T> zzbbh) {
        long c = this.f20623a.mo25499c();
        String str = zzcxm.f21136t;
        if (str != null) {
            zzbar.m20546a(zzbbh, new C7773nl(this, str, c), zzbbm.f18749b);
        }
        return zzbbh;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22707a(String str, int i, long j) {
        List<String> list = this.f20624b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        list.add(sb.toString());
    }

    /* renamed from: a */
    public final String mo28742a() {
        return TextUtils.join("_", this.f20624b);
    }
}
