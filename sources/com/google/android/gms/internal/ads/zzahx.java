package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

@zzard
public final class zzahx implements zzaho<Object> {

    /* renamed from: a */
    private final zzahy f18124a;

    private zzahx(zzahy zzahy) {
        this.f18124a = zzahy;
    }

    /* renamed from: a */
    public static void m19254a(zzbgz zzbgz, zzahy zzahy) {
        zzbgz.mo25662a("/reward", (zzaho<? super zzbgz>) new zzahx(zzahy));
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzato zzato = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzato = new zzato(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                zzbad.m20522c("Unable to parse reward amount.", e);
            }
            this.f18124a.mo27306a(zzato);
        } else if ("video_start".equals(str)) {
            this.f18124a.mo27308n();
        } else if ("video_complete".equals(str)) {
            this.f18124a.mo27307j();
        }
    }
}
