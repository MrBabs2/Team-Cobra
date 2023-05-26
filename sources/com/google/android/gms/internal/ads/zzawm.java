package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@zzard
public final class zzawm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f18592a = new Object();

    /* renamed from: b */
    private final zzaxc f18593b = new zzaxc();

    /* renamed from: c */
    private final zzawu f18594c = new zzawu(zzyt.m25671f(), this.f18593b);

    /* renamed from: d */
    private boolean f18595d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f18596e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public zzbai f18597f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzacy f18598g = null;

    /* renamed from: h */
    private Boolean f18599h = null;

    /* renamed from: i */
    private final AtomicInteger f18600i = new AtomicInteger(0);

    /* renamed from: j */
    private final C8126x4 f18601j = new C8126x4((C8089w4) null);

    /* renamed from: k */
    private final Object f18602k = new Object();

    /* renamed from: l */
    private zzbbh<ArrayList<String>> f18603l;

    /* renamed from: a */
    public final void mo27733a(Boolean bool) {
        synchronized (this.f18592a) {
            this.f18599h = bool;
        }
    }

    /* renamed from: b */
    public final Resources mo27735b() {
        if (this.f18597f.f18745i) {
            return this.f18596e.getResources();
        }
        try {
            zzbae.m20527a(this.f18596e).getResources();
            return null;
        } catch (zzbag e) {
            zzbad.m20522c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: c */
    public final zzacy mo27737c() {
        zzacy zzacy;
        synchronized (this.f18592a) {
            zzacy = this.f18598g;
        }
        return zzacy;
    }

    /* renamed from: d */
    public final Boolean mo27738d() {
        Boolean bool;
        synchronized (this.f18592a) {
            bool = this.f18599h;
        }
        return bool;
    }

    /* renamed from: e */
    public final void mo27739e() {
        this.f18601j.mo26759a();
    }

    /* renamed from: f */
    public final void mo27740f() {
        this.f18600i.incrementAndGet();
    }

    /* renamed from: g */
    public final void mo27741g() {
        this.f18600i.decrementAndGet();
    }

    /* renamed from: h */
    public final int mo27742h() {
        return this.f18600i.get();
    }

    /* renamed from: i */
    public final zzaxb mo27743i() {
        zzaxc zzaxc;
        synchronized (this.f18592a) {
            zzaxc = this.f18593b;
        }
        return zzaxc;
    }

    /* renamed from: j */
    public final zzbbh<ArrayList<String>> mo27744j() {
        if (PlatformVersion.m16287c() && this.f18596e != null) {
            if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17951p1)).booleanValue()) {
                synchronized (this.f18602k) {
                    if (this.f18603l != null) {
                        zzbbh<ArrayList<String>> zzbbh = this.f18603l;
                        return zzbbh;
                    }
                    zzbbh<ArrayList<String>> a = zzaxg.m20260a(new C8052v4(this));
                    this.f18603l = a;
                    return a;
                }
            }
        }
        return zzbar.m20539a(new ArrayList());
    }

    /* renamed from: k */
    public final zzawu mo27745k() {
        return this.f18594c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ ArrayList mo27746l() throws Exception {
        return m20129a(zzasq.m19919c(this.f18596e));
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void mo27732a(Context context, zzbai zzbai) {
        synchronized (this.f18592a) {
            if (!this.f18595d) {
                this.f18596e = context.getApplicationContext();
                this.f18597f = zzbai;
                zzk.zzlj().mo29814a((zzut) this.f18594c);
                zzacy zzacy = null;
                this.f18593b.mo27793a(this.f18596e, (String) null, true);
                zzaqx.m19861a(this.f18596e, this.f18597f);
                new zztz(context.getApplicationContext(), this.f18597f);
                zzk.zzlp();
                if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17825N)).booleanValue()) {
                    zzawz.m20167e("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    zzacy = new zzacy();
                }
                this.f18598g = zzacy;
                if (zzacy != null) {
                    zzbao.m20536a(new C8089w4(this).zzvi(), "AppState.registerCsiReporter");
                }
                this.f18595d = true;
                mo27744j();
            }
        }
        zzk.zzlg().mo27794a(context, zzbai.f18742f);
    }

    /* renamed from: b */
    public final void mo27736b(Throwable th, String str) {
        zzaqx.m19861a(this.f18596e, this.f18597f).mo27572a(th, str, ((Float) zzyt.m25670e().mo27163a(zzacu.f17917i)).floatValue());
    }

    /* renamed from: a */
    public final void mo27734a(Throwable th, String str) {
        zzaqx.m19861a(this.f18596e, this.f18597f).mo27571a(th, str);
    }

    /* renamed from: a */
    public final Context mo27731a() {
        return this.f18596e;
    }

    @TargetApi(16)
    /* renamed from: a */
    private static ArrayList<String> m20129a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b = Wrappers.m16317a(context).mo25510b(context.getApplicationInfo().packageName, RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (b.requestedPermissions != null && b.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = b.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((b.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }
}
