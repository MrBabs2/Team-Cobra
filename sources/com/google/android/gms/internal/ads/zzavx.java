package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
public final class zzavx {
    /* renamed from: a */
    public static String m20100a(String str, Context context, boolean z) {
        String c;
        if ((((Boolean) zzyt.m25670e().mo27163a(zzacu.f17954q0)).booleanValue() && !z) || !zzk.zzme().mo27700f(context) || TextUtils.isEmpty(str) || (c = zzk.zzme().mo27693c(context)) == null) {
            return str;
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17918i0)).booleanValue()) {
            String str2 = (String) zzyt.m25670e().mo27163a(zzacu.f17923j0);
            if (!str.contains(str2)) {
                return str;
            }
            if (zzk.zzlg().mo27804a(str)) {
                zzk.zzme().mo27696d(context, c);
                return str.replace(str2, c);
            } else if (!zzk.zzlg().mo27807b(str)) {
                return str;
            } else {
                zzk.zzme().mo27698e(context, c);
                return str.replace(str2, c);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (zzk.zzlg().mo27804a(str)) {
                zzk.zzme().mo27696d(context, c);
                return m20098a(str, "fbs_aeid", c).toString();
            } else if (!zzk.zzlg().mo27807b(str)) {
                return str;
            } else {
                zzk.zzme().mo27698e(context, c);
                return m20098a(str, "fbs_aeid", c).toString();
            }
        }
    }

    /* renamed from: a */
    public static String m20099a(Uri uri, Context context) {
        if (!zzk.zzme().mo27700f(context)) {
            return uri.toString();
        }
        String c = zzk.zzme().mo27693c(context);
        if (c == null) {
            return uri.toString();
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17918i0)).booleanValue()) {
            String str = (String) zzyt.m25670e().mo27163a(zzacu.f17923j0);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                zzk.zzme().mo27696d(context, c);
                return uri2.replace(str, c);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = m20098a(uri.toString(), "fbs_aeid", c);
            zzk.zzme().mo27696d(context, c);
        }
        return uri.toString();
    }

    @VisibleForTesting
    /* renamed from: a */
    private static Uri m20098a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }
}
