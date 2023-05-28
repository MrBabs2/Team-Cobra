package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@zzard
public final class zzyc {

    /* renamed from: a */
    public static final zzyc f23015a = new zzyc();

    @VisibleForTesting
    protected zzyc() {
    }

    /* renamed from: a */
    public static zzxz m25642a(Context context, zzaaz zzaaz) {
        List list;
        Context context2;
        String str;
        zzaaz zzaaz2 = zzaaz;
        Date a = zzaaz.mo26948a();
        long time = a != null ? a.getTime() : -1;
        String b = zzaaz.mo26951b();
        int d = zzaaz.mo26954d();
        Set<String> e = zzaaz.mo26955e();
        if (!e.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(e));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a2 = zzaaz2.mo26949a(context2);
        int o = zzaaz.mo26965o();
        Location f = zzaaz.mo26956f();
        Bundle c = zzaaz2.mo26953c(AdMobAdapter.class);
        boolean g = zzaaz.mo26957g();
        String i = zzaaz.mo26959i();
        SearchAdRequest l = zzaaz.mo26962l();
        zzaca zzaca = l != null ? new zzaca(l) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzyt.m25666a();
            str = zzazt.m20469a(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        return new zzxz(8, time, c, d, list, a2, o, g, i, zzaca, f, b, zzaaz.mo26964n(), zzaaz.mo26952c(), Collections.unmodifiableList(new ArrayList(zzaaz.mo26966p())), zzaaz.mo26961k(), str, zzaaz.mo26960j(), (zzxt) null, zzaaz.mo26967q(), zzaaz.mo26958h());
    }
}
