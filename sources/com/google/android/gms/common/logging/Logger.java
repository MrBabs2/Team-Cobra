package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

@KeepForSdk
public class Logger {

    /* renamed from: a */
    private final String f14204a;

    /* renamed from: b */
    private final String f14205b;

    /* renamed from: c */
    private final int f14206c;

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Logger(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L_0x0006
            java.lang.String r8 = ""
            goto L_0x0036
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r8.length
            r2 = 0
        L_0x0012:
            if (r2 >= r1) goto L_0x0028
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0022
            java.lang.String r4 = ","
            r0.append(r4)
        L_0x0022:
            r0.append(r3)
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0028:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L_0x0036:
            r6.<init>((java.lang.String) r7, (java.lang.String) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.logging.Logger.<init>(java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: c */
    private final String m16186c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f14205b.concat(str);
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo25434a(int i) {
        return this.f14206c <= i;
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo25435b(String str, Object... objArr) {
        Log.e(this.f14204a, m16186c(str, objArr));
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo25433a(String str, Object... objArr) {
        if (mo25434a(3)) {
            Log.d(this.f14204a, m16186c(str, objArr));
        }
    }

    private Logger(String str, String str2) {
        this.f14205b = str2;
        this.f14204a = str;
        new GmsLogger(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f14204a, i)) {
            i++;
        }
        this.f14206c = i;
    }
}
