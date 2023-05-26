package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.util.Map;

@zzard
public final class zzayu {

    /* renamed from: a */
    private static zzv f18696a;

    /* renamed from: b */
    private static final Object f18697b = new Object();

    static {
        new C8053v5();
    }

    public zzayu(Context context) {
        m20420a(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    /* renamed from: a */
    public static zzbbh<zzp> m20419a(String str) {
        zzbbr zzbbr = new zzbbr();
        f18696a.mo29828a(new zzaza(str, zzbbr));
        return zzbbr;
    }

    /* renamed from: a */
    public final zzbbh<String> mo27860a(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        C8164y5 y5Var = new C8164y5((C8053v5) null);
        C8090w5 w5Var = new C8090w5(this, str2, y5Var);
        zzazx zzazx = new zzazx((String) null);
        C8127x5 x5Var = new C8127x5(this, i, str, y5Var, w5Var, bArr, map, zzazx);
        if (zzazx.m20498a()) {
            try {
                zzazx.mo27883a(str2, "GET", x5Var.mo26761a(), x5Var.mo26764p());
            } catch (zza e) {
                zzbad.m20523d(e.getMessage());
            }
        }
        f18696a.mo29828a(x5Var);
        return y5Var;
    }

    /* renamed from: a */
    public final zzbbh<String> mo27861a(String str, Map<String, String> map) {
        return mo27860a(0, str, map, (byte[]) null);
    }

    @VisibleForTesting
    /* renamed from: a */
    private static zzv m20420a(Context context) {
        zzv zzv;
        zzv zzv2;
        synchronized (f18697b) {
            if (f18696a == null) {
                zzacu.m18983a(context);
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17875Z1)).booleanValue()) {
                    zzv2 = zzayl.m20406a(context);
                } else {
                    zzv2 = new zzv(new zzan(new File(context.getCacheDir(), "volley")), new zzak((zzaj) new zzat()));
                    zzv2.mo29829a();
                }
                f18696a = zzv2;
            }
            zzv = f18696a;
        }
        return zzv;
    }
}
