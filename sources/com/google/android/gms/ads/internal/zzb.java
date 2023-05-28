package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzaxi;
import java.util.List;
import java.util.Map;

@zzard
public final class zzb {
    private boolean zzbqv;
    private zzavb zzbqw;
    private zzark zzbqx = null;
    private final Context zzlj;

    public zzb(Context context, zzavb zzavb, zzark zzark) {
        this.zzlj = context;
        this.zzbqw = zzavb;
        if (0 == 0) {
            this.zzbqx = new zzark();
        }
    }

    private final boolean zzkw() {
        zzavb zzavb = this.zzbqw;
        return (zzavb != null && zzavb.mo27678d().f18550k) || this.zzbqx.f18433f;
    }

    public final void recordClick() {
        this.zzbqv = true;
    }

    public final void zzbk(String str) {
        List<String> list;
        if (zzkw()) {
            if (str == null) {
                str = "";
            }
            zzavb zzavb = this.zzbqw;
            if (zzavb != null) {
                zzavb.mo27672a(str, (Map<String, String>) null, 3);
                return;
            }
            zzark zzark = this.zzbqx;
            if (zzark.f18433f && (list = zzark.f18434g) != null) {
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzk.zzlg();
                        zzaxi.m20275a(this.zzlj, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzkx() {
        return !zzkw() || this.zzbqv;
    }
}
