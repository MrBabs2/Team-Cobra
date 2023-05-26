package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

@zzard
public final class zzagy implements zzaho<zzbgz> {
    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        zzbgz zzbgz = (zzbgz) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzbad.m20523d("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzbad.m20523d("No timestamp given for CSI tick.");
            } else {
                try {
                    long c = zzk.zzln().mo25499c() + (Long.parseLong(str4) - zzk.zzln().mo25498b());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzbgz.mo25694h().mo27180a(str2, str3, c);
                } catch (NumberFormatException e) {
                    zzbad.m20522c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get(DonationsAnalytics.VALUE);
            if (TextUtils.isEmpty(str5)) {
                zzbad.m20523d("No value given for CSI experiment.");
                return;
            }
            zzadi a = zzbgz.mo25694h().mo27178a();
            if (a == null) {
                zzbad.m20523d("No ticker for WebView, dropping experiment ID.");
            } else {
                a.mo27184a("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get(DonationsAnalytics.VALUE);
            if (TextUtils.isEmpty(str7)) {
                zzbad.m20523d("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzbad.m20523d("No name given for CSI extra.");
            } else {
                zzadi a2 = zzbgz.mo25694h().mo27178a();
                if (a2 == null) {
                    zzbad.m20523d("No ticker for WebView, dropping extra parameter.");
                } else {
                    a2.mo27184a(str6, str7);
                }
            }
        }
    }
}
