package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public interface Types {
    }

    /* renamed from: d */
    public abstract int mo25489d();

    /* renamed from: o */
    public abstract long mo25490o();

    /* renamed from: p */
    public abstract long mo25491p();

    /* renamed from: q */
    public abstract String mo25492q();

    public String toString() {
        long o = mo25490o();
        int d = mo25489d();
        long p = mo25491p();
        String q = mo25492q();
        StringBuilder sb = new StringBuilder(String.valueOf(q).length() + 53);
        sb.append(o);
        sb.append("\t");
        sb.append(d);
        sb.append("\t");
        sb.append(p);
        sb.append(q);
        return sb.toString();
    }
}
