package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.TimeUnit;

@zzard
public final class zzbdg {

    /* renamed from: a */
    private final Context f18837a;

    /* renamed from: b */
    private final String f18838b;

    /* renamed from: c */
    private final zzbai f18839c;

    /* renamed from: d */
    private final zzadg f18840d;

    /* renamed from: e */
    private final zzadi f18841e;

    /* renamed from: f */
    private final zzayq f18842f;

    /* renamed from: g */
    private final long[] f18843g;

    /* renamed from: h */
    private final String[] f18844h;

    /* renamed from: i */
    private boolean f18845i = false;

    /* renamed from: j */
    private boolean f18846j = false;

    /* renamed from: k */
    private boolean f18847k = false;

    /* renamed from: l */
    private boolean f18848l = false;

    /* renamed from: m */
    private boolean f18849m;

    /* renamed from: n */
    private zzbco f18850n;

    /* renamed from: o */
    private boolean f18851o;

    /* renamed from: p */
    private boolean f18852p;

    /* renamed from: q */
    private long f18853q = -1;

    public zzbdg(Context context, zzbai zzbai, String str, zzadi zzadi, zzadg zzadg) {
        zzayt zzayt = new zzayt();
        zzayt zzayt2 = zzayt;
        zzayt2.mo27859a("min_1", Double.MIN_VALUE, 1.0d);
        zzayt2.mo27859a("1_5", 1.0d, 5.0d);
        zzayt2.mo27859a("5_10", 5.0d, 10.0d);
        zzayt2.mo27859a("10_20", 10.0d, 20.0d);
        zzayt2.mo27859a("20_30", 20.0d, 30.0d);
        zzayt2.mo27859a("30_max", 30.0d, Double.MAX_VALUE);
        this.f18842f = zzayt.mo27858a();
        this.f18837a = context;
        this.f18839c = zzbai;
        this.f18838b = str;
        this.f18841e = zzadi;
        this.f18840d = zzadg;
        String str2 = (String) zzyt.m25670e().mo27163a(zzacu.f17981x);
        if (str2 == null) {
            this.f18844h = new String[0];
            this.f18843g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f18844h = new String[split.length];
        this.f18843g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f18843g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzbad.m20522c("Unable to parse frame hash target time number.", e);
                this.f18843g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo27980a(zzbco zzbco) {
        zzadb.m19000a(this.f18841e, this.f18840d, "vpc2");
        this.f18845i = true;
        zzadi zzadi = this.f18841e;
        if (zzadi != null) {
            zzadi.mo27184a("vpn", zzbco.mo16514e());
        }
        this.f18850n = zzbco;
    }

    /* renamed from: b */
    public final void mo27981b() {
        if (this.f18845i && !this.f18846j) {
            zzadb.m19000a(this.f18841e, this.f18840d, "vfr2");
            this.f18846j = true;
        }
    }

    /* renamed from: c */
    public final void mo27983c() {
        this.f18849m = true;
        if (this.f18846j && !this.f18847k) {
            zzadb.m19000a(this.f18841e, this.f18840d, "vfp2");
            this.f18847k = true;
        }
    }

    /* renamed from: d */
    public final void mo27984d() {
        this.f18849m = false;
    }

    /* renamed from: b */
    public final void mo27982b(zzbco zzbco) {
        if (this.f18847k && !this.f18848l) {
            if (zzawz.m20166a() && !this.f18848l) {
                zzawz.m20167e("VideoMetricsMixin first frame");
            }
            zzadb.m19000a(this.f18841e, this.f18840d, "vff2");
            this.f18848l = true;
        }
        long a = zzk.zzln().mo25497a();
        if (this.f18849m && this.f18852p && this.f18853q != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d = (double) (a - this.f18853q);
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.f18842f.mo27854a(nanos / d);
        }
        this.f18852p = this.f18849m;
        this.f18853q = a;
        long longValue = ((Long) zzyt.m25670e().mo27163a(zzacu.f17985y)).longValue();
        long currentPosition = (long) zzbco.getCurrentPosition();
        int i = 0;
        while (true) {
            String[] strArr = this.f18844h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] != null || longValue <= Math.abs(currentPosition - this.f18843g[i])) {
                zzbco zzbco2 = zzbco;
                i++;
            } else {
                String[] strArr2 = this.f18844h;
                int i2 = 8;
                Bitmap bitmap = zzbco.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo27979a() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17977w)).booleanValue() && !this.f18851o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f18838b);
            bundle.putString("player", this.f18850n.mo16514e());
            for (zzays next : this.f18842f.mo27853a()) {
                String valueOf = String.valueOf(next.f18688a);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(next.f18692e));
                String valueOf2 = String.valueOf(next.f18688a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(next.f18691d));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.f18843g;
                if (i < jArr.length) {
                    String str = this.f18844h[i];
                    if (str != null) {
                        String valueOf3 = String.valueOf(Long.valueOf(jArr[i]));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                        sb.append("fh_");
                        sb.append(valueOf3);
                        bundle.putString(sb.toString(), str);
                    }
                    i++;
                } else {
                    zzk.zzlg().mo27799a(this.f18837a, this.f18839c.f18742f, "gmob-apps", bundle, true);
                    this.f18851o = true;
                    return;
                }
            }
        }
    }
}
