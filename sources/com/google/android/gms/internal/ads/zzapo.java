package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C7125R;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
public final class zzapo extends zzaqb {

    /* renamed from: c */
    private final Map<String, String> f18251c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f18252d;

    /* renamed from: e */
    private String f18253e = m19804d("description");

    /* renamed from: f */
    private long f18254f = m19805e("start_ticks");

    /* renamed from: g */
    private long f18255g = m19805e("end_ticks");

    /* renamed from: h */
    private String f18256h = m19804d("summary");

    /* renamed from: i */
    private String f18257i = m19804d("location");

    public zzapo(zzbgz zzbgz, Map<String, String> map) {
        super(zzbgz, "createCalendarEvent");
        this.f18251c = map;
        this.f18252d = zzbgz.mo25650a();
    }

    /* renamed from: d */
    private final String m19804d(String str) {
        return TextUtils.isEmpty(this.f18251c.get(str)) ? "" : this.f18251c.get(str);
    }

    /* renamed from: e */
    private final long m19805e(String str) {
        String str2 = this.f18251c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: a */
    public final Intent mo27538a() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f18253e);
        data.putExtra("eventLocation", this.f18257i);
        data.putExtra("description", this.f18256h);
        long j = this.f18254f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f18255g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: b */
    public final void mo27539b() {
        if (this.f18252d == null) {
            mo27556a("Activity context is not available.");
            return;
        }
        zzk.zzlg();
        if (!zzaxi.m20298e(this.f18252d).mo27152d()) {
            mo27556a("This feature is not available on the device.");
            return;
        }
        zzk.zzlg();
        AlertDialog.Builder d = zzaxi.m20294d(this.f18252d);
        Resources b = zzk.zzlk().mo27735b();
        d.setTitle(b != null ? b.getString(C7125R.string.f13403s5) : "Create calendar event");
        d.setMessage(b != null ? b.getString(C7125R.string.f13404s6) : "Allow Ad to create a calendar event?");
        d.setPositiveButton(b != null ? b.getString(C7125R.string.f13401s3) : "Accept", new C7529h3(this));
        d.setNegativeButton(b != null ? b.getString(C7125R.string.f13402s4) : "Decline", new C7566i3(this));
        d.create().show();
    }
}
