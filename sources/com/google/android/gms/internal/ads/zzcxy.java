package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;

public final class zzcxy {
    /* renamed from: a */
    public static zzyd m23100a(Context context, List<zzcxn> list) {
        ArrayList arrayList = new ArrayList();
        for (zzcxn next : list) {
            if (next.f21145c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(next.f21143a, next.f21144b));
            }
        }
        return new zzyd(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }
}
