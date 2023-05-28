package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.internal.cache.DiskLruCache;

public final class zzdae {

    /* renamed from: a */
    private final Executor f21287a;

    /* renamed from: b */
    private final zzbah f21288b;

    /* renamed from: c */
    private final zzcmu f21289c;

    /* renamed from: d */
    private final String f21290d;

    /* renamed from: e */
    private final String f21291e;

    /* renamed from: f */
    private final String f21292f;

    /* renamed from: g */
    private final Context f21293g;

    /* renamed from: h */
    private final Clock f21294h;

    public zzdae(Executor executor, zzbah zzbah, zzcmu zzcmu, zzbai zzbai, String str, String str2, Context context, Clock clock) {
        this.f21287a = executor;
        this.f21288b = zzbah;
        this.f21289c = zzcmu;
        this.f21290d = zzbai.f18742f;
        this.f21291e = str;
        this.f21292f = str2;
        this.f21293g = context;
        this.f21294h = clock;
    }

    /* renamed from: c */
    private static String m23184c(String str) {
        return (TextUtils.isEmpty(str) || !zzazx.m20498a()) ? str : "fakeForAdDebugLog";
    }

    /* renamed from: a */
    public final void mo28870a(zzcxu zzcxu, zzcxm zzcxm, List<String> list) {
        mo28872a(zzcxu, zzcxm, false, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28875b(String str) {
        this.f21288b.mo25913a(str);
    }

    /* renamed from: a */
    public final void mo28872a(zzcxu zzcxu, zzcxm zzcxm, boolean z, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str = z ? DiskLruCache.VERSION_1 : "0";
        for (String a : list) {
            String a2 = m23183a(m23183a(m23183a(a, "@gw_adlocid@", zzcxu.f21162a.f21156a.f21169f), "@gw_adnetrefresh@", str), "@gw_sdkver@", this.f21290d);
            if (zzcxm != null) {
                a2 = zzavx.m20100a(m23183a(m23183a(m23183a(a2, "@gw_qdata@", zzcxm.f21138v), "@gw_adnetid@", zzcxm.f21137u), "@gw_allocid@", zzcxm.f21136t), this.f21293g, zzcxm.f21114M);
            }
            arrayList.add(m23183a(m23183a(m23183a(a2, "@gw_adnetstatus@", this.f21289c.mo28742a()), "@gw_seqnum@", this.f21291e), "@gw_sessid@", this.f21292f));
        }
        mo28874a((List<String>) arrayList);
    }

    /* renamed from: a */
    public final void mo28871a(zzcxu zzcxu, zzcxm zzcxm, List<String> list, zzasr zzasr) {
        long b = this.f21294h.mo25498b();
        try {
            String type = zzasr.getType();
            String num = Integer.toString(zzasr.getAmount());
            ArrayList arrayList = new ArrayList();
            String c = m23184c(zzcxu.f21162a.f21156a.f21173j);
            String c2 = m23184c(zzcxu.f21162a.f21156a.f21174k);
            for (String a : list) {
                arrayList.add(zzavx.m20100a(m23183a(m23183a(m23183a(m23183a(m23183a(m23183a(a, "@gw_rwd_userid@", Uri.encode(c)), "@gw_rwd_custom_data@", Uri.encode(c2)), "@gw_tmstmp@", Long.toString(b)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f21290d), this.f21293g, zzcxm.f21114M));
            }
            mo28874a((List<String>) arrayList);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo28874a(List<String> list) {
        for (String a : list) {
            mo28873a(a);
        }
    }

    /* renamed from: a */
    public final void mo28873a(String str) {
        this.f21287a.execute(new C7889qq(this, str));
    }

    /* renamed from: a */
    private static String m23183a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }
}
