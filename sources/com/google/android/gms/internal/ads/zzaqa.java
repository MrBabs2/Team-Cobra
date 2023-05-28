package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
public final class zzaqa extends zzaqb implements zzaho<zzbgz> {

    /* renamed from: c */
    private final zzbgz f18291c;

    /* renamed from: d */
    private final Context f18292d;

    /* renamed from: e */
    private final WindowManager f18293e;

    /* renamed from: f */
    private final zzacf f18294f;

    /* renamed from: g */
    private DisplayMetrics f18295g;

    /* renamed from: h */
    private float f18296h;

    /* renamed from: i */
    private int f18297i = -1;

    /* renamed from: j */
    private int f18298j = -1;

    /* renamed from: k */
    private int f18299k;

    /* renamed from: l */
    private int f18300l = -1;

    /* renamed from: m */
    private int f18301m = -1;

    /* renamed from: n */
    private int f18302n = -1;

    /* renamed from: o */
    private int f18303o = -1;

    public zzaqa(zzbgz zzbgz, Context context, zzacf zzacf) {
        super(zzbgz);
        this.f18291c = zzbgz;
        this.f18292d = context;
        this.f18294f = zzacf;
        this.f18293e = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final void mo27553a(int i, int i2) {
        int i3 = 0;
        if (this.f18292d instanceof Activity) {
            i3 = zzk.zzlg().mo27808b((Activity) this.f18292d)[0];
        }
        if (this.f18291c.mo25695i() == null || !this.f18291c.mo25695i().mo28181b()) {
            this.f18302n = zzyt.m25666a().mo27878a(this.f18292d, this.f18291c.getWidth());
            this.f18303o = zzyt.m25666a().mo27878a(this.f18292d, this.f18291c.getHeight());
        }
        mo27557b(i, i2 - i3, this.f18302n, this.f18303o);
        this.f18291c.mo25697k().mo28124a(i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        this.f18295g = new DisplayMetrics();
        Display defaultDisplay = this.f18293e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f18295g);
        this.f18296h = this.f18295g.density;
        this.f18299k = defaultDisplay.getRotation();
        zzyt.m25666a();
        DisplayMetrics displayMetrics = this.f18295g;
        this.f18297i = zzazt.m20476b(displayMetrics, displayMetrics.widthPixels);
        zzyt.m25666a();
        DisplayMetrics displayMetrics2 = this.f18295g;
        this.f18298j = zzazt.m20476b(displayMetrics2, displayMetrics2.heightPixels);
        Activity a = this.f18291c.mo25650a();
        if (a == null || a.getWindow() == null) {
            this.f18300l = this.f18297i;
            this.f18301m = this.f18298j;
        } else {
            zzk.zzlg();
            int[] c = zzaxi.m20293c(a);
            zzyt.m25666a();
            this.f18300l = zzazt.m20476b(this.f18295g, c[0]);
            zzyt.m25666a();
            this.f18301m = zzazt.m20476b(this.f18295g, c[1]);
        }
        if (this.f18291c.mo25695i().mo28181b()) {
            this.f18302n = this.f18297i;
            this.f18303o = this.f18298j;
        } else {
            this.f18291c.measure(0, 0);
        }
        mo27555a(this.f18297i, this.f18298j, this.f18300l, this.f18301m, this.f18296h, this.f18299k);
        zzapz zzapz = new zzapz();
        zzapz.mo27551d(this.f18294f.mo27149a());
        zzapz.mo27550c(this.f18294f.mo27150b());
        zzapz.mo27552e(this.f18294f.mo27152d());
        zzapz.mo27548a(this.f18294f.mo27151c());
        zzapz.mo27549b(true);
        this.f18291c.mo25666a("onDeviceFeaturesReceived", new zzapx(zzapz).mo27547a());
        int[] iArr = new int[2];
        this.f18291c.getLocationOnScreen(iArr);
        mo27553a(zzyt.m25666a().mo27878a(this.f18292d, iArr[0]), zzyt.m25666a().mo27878a(this.f18292d, iArr[1]));
        if (zzbad.m20518a(2)) {
            zzbad.m20521c("Dispatching Ready Event.");
        }
        mo27558b(this.f18291c.mo25672b().f18742f);
    }
}
