package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbih;
import java.net.URISyntaxException;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;

@zzard
public final class zzahs<T extends zzbhx & zzbhy & zzbic & zzbif & zzbih> implements zzaho<T> {

    /* renamed from: a */
    private final zzb f18117a;

    /* renamed from: b */
    private final zzapr f18118b;

    public zzahs(zzb zzb, zzapr zzapr) {
        this.f18117a = zzb;
        this.f18118b = zzapr;
    }

    /* renamed from: a */
    private static boolean m19242a(Map<String, String> map) {
        return DiskLruCache.VERSION_1.equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m19243b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            zzk.zzli();
            return 7;
        } else if ("l".equalsIgnoreCase(str)) {
            zzk.zzli();
            return 6;
        } else if ("c".equalsIgnoreCase(str)) {
            return zzk.zzli().mo27809a();
        } else {
            return -1;
        }
    }

    /* renamed from: a */
    private final void m19241a(boolean z) {
        zzapr zzapr = this.f18118b;
        if (zzapr != null) {
            zzapr.mo27543a(z);
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    static String m19240a(Context context, zzdh zzdh, String str, View view, Activity activity) {
        if (zzdh == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (zzdh.mo29018b(parse)) {
                parse = zzdh.mo29014a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (zzdi unused) {
            return str;
        } catch (Exception e) {
            zzk.zzlk().mo27734a((Throwable) e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        zzbhx zzbhx = (zzbhx) obj;
        String a = zzavx.m20100a((String) map.get("u"), zzbhx.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzbad.m20523d("Action missing from an open GMSG.");
            return;
        }
        zzb zzb = this.f18117a;
        if (zzb != null && !zzb.zzkx()) {
            this.f18117a.zzbk(a);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((zzbhy) zzbhx).mo25691g()) {
                zzbad.m20523d("Cannot expand WebView that is already expanded.");
                return;
            }
            m19241a(false);
            ((zzbic) zzbhx).mo25677b(m19242a((Map<String, String>) map), m19243b(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            m19241a(false);
            if (a != null) {
                ((zzbic) zzbhx).mo25668a(m19242a((Map<String, String>) map), m19243b(map), a);
            } else {
                ((zzbic) zzbhx).mo25669a(m19242a((Map<String, String>) map), m19243b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m19241a(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e) {
                    String valueOf = String.valueOf(str2);
                    zzbad.m20520b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = m19240a(zzbhx.getContext(), ((zzbif) zzbhx).mo25682d(), uri, ((zzbih) zzbhx).getView(), zzbhx.mo25650a());
                    } catch (Exception e2) {
                        zzbad.m20520b("Error occurred while adding signals.", e2);
                        zzk.zzlk().mo27734a((Throwable) e2, "OpenGmsgHandler.onGmsg");
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Exception e3) {
                        String valueOf2 = String.valueOf(uri);
                        zzbad.m20520b(valueOf2.length() != 0 ? "Error parsing the uri: ".concat(valueOf2) : new String("Error parsing the uri: "), e3);
                        zzk.zzlk().mo27734a((Throwable) e3, "OpenGmsgHandler.onGmsg");
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((zzbic) zzbhx).mo25652a(new zzc(intent));
                return;
            }
            if (!TextUtils.isEmpty(a)) {
                a = m19240a(zzbhx.getContext(), ((zzbif) zzbhx).mo25682d(), a, ((zzbih) zzbhx).getView(), zzbhx.mo25650a());
            }
            ((zzbic) zzbhx).mo25652a(new zzc((String) map.get("i"), a, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        } else {
            m19241a(true);
            if (TextUtils.isEmpty(a)) {
                zzbad.m20523d("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzbic) zzbhx).mo25652a(new zzc(new zzaht(zzbhx.getContext(), ((zzbif) zzbhx).mo25682d(), ((zzbih) zzbhx).getView()).mo27303a((Map<String, String>) map)));
            } catch (ActivityNotFoundException e4) {
                zzbad.m20523d(e4.getMessage());
            }
        }
    }
}
