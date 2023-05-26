package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

@zzard
public final class zzahr implements zzaho<zzbgz> {

    /* renamed from: d */
    private static final Map<String, Integer> f18113d = CollectionUtils.m16258a((K[]) new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, (V[]) new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a */
    private final zzb f18114a;

    /* renamed from: b */
    private final zzapr f18115b;

    /* renamed from: c */
    private final zzaqc f18116c;

    public zzahr(zzb zzb, zzapr zzapr, zzaqc zzaqc) {
        this.f18114a = zzb;
        this.f18115b = zzapr;
        this.f18116c = zzaqc;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        zzb zzb;
        zzbgz zzbgz = (zzbgz) obj;
        int intValue = f18113d.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (zzb = this.f18114a) != null && !zzb.zzkx()) {
            this.f18114a.zzbk((String) null);
        } else if (intValue == 1) {
            this.f18115b.mo27542a((Map<String, String>) map);
        } else if (intValue == 3) {
            new zzapu(zzbgz, map).mo27546a();
        } else if (intValue == 4) {
            new zzapo(zzbgz, map).mo27539b();
        } else if (intValue == 5) {
            new zzapt(zzbgz, map).mo27545a();
        } else if (intValue == 6) {
            this.f18115b.mo27543a(true);
        } else if (intValue != 7) {
            zzbad.m20521c("Unknown MRAID command called.");
        } else {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17821M)).booleanValue()) {
                this.f18116c.mo25830a();
            }
        }
    }
}
