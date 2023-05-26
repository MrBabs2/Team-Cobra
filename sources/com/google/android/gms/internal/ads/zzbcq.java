package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.internal.cache.DiskLruCache;

@zzard
public final class zzbcq extends FrameLayout implements zzbcn {

    /* renamed from: f */
    private final zzbdf f18775f;

    /* renamed from: g */
    private final FrameLayout f18776g;

    /* renamed from: h */
    private final zzadi f18777h;

    /* renamed from: i */
    private final C7461f8 f18778i;

    /* renamed from: j */
    private final long f18779j;

    /* renamed from: k */
    private zzbco f18780k;

    /* renamed from: l */
    private boolean f18781l;

    /* renamed from: m */
    private boolean f18782m;

    /* renamed from: n */
    private boolean f18783n;

    /* renamed from: o */
    private boolean f18784o;

    /* renamed from: p */
    private long f18785p;

    /* renamed from: q */
    private long f18786q;

    /* renamed from: r */
    private String f18787r;

    /* renamed from: s */
    private String[] f18788s;

    /* renamed from: t */
    private Bitmap f18789t;

    /* renamed from: u */
    private ImageView f18790u;

    /* renamed from: v */
    private boolean f18791v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbcq(Context context, zzbdf zzbdf, int i, boolean z, zzadi zzadi, zzbde zzbde) {
        super(context);
        Context context2 = context;
        zzbdf zzbdf2 = zzbdf;
        this.f18775f = zzbdf2;
        zzadi zzadi2 = zzadi;
        this.f18777h = zzadi2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18776g = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.m16037a(zzbdf.mo25678c());
        zzbco a = zzbdf.mo25678c().zzbqs.mo27937a(context, zzbdf2, i, z, zzadi2, zzbde);
        this.f18780k = a;
        if (a != null) {
            this.f18776g.addView(a, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17989z)).booleanValue()) {
                mo27956n();
            }
        }
        this.f18790u = new ImageView(context);
        this.f18779j = ((Long) zzyt.m25670e().mo27163a(zzacu.f17785D)).longValue();
        boolean booleanValue = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17777B)).booleanValue();
        this.f18784o = booleanValue;
        zzadi zzadi3 = this.f18777h;
        if (zzadi3 != null) {
            zzadi3.mo27184a("spinner_used", booleanValue ? DiskLruCache.VERSION_1 : "0");
        }
        this.f18778i = new C7461f8(this);
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.mo16506a(this);
        }
        if (this.f18780k == null) {
            mo27929a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public static void m20608a(zzbdf zzbdf) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        zzbdf.mo25665a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: p */
    private final boolean m20612p() {
        return this.f18790u.getParent() != null;
    }

    /* renamed from: q */
    private final void m20613q() {
        if (this.f18775f.mo25650a() != null && this.f18782m && !this.f18783n) {
            this.f18775f.mo25650a().getWindow().clearFlags(128);
            this.f18782m = false;
        }
    }

    /* renamed from: b */
    public final void mo27945b(int i) {
        this.f18780k.mo16511c(i);
    }

    /* renamed from: c */
    public final void mo27946c() {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.mo16508b();
        }
    }

    /* renamed from: d */
    public final void mo27948d(int i) {
        this.f18780k.mo16515e(i);
    }

    /* renamed from: e */
    public final void mo27949e(int i) {
        this.f18780k.mo16516f(i);
    }

    /* renamed from: f */
    public final void mo27950f(int i) {
        this.f18780k.mo16517g(i);
    }

    public final void finalize() throws Throwable {
        try {
            this.f18778i.mo25915a();
            if (this.f18780k != null) {
                zzbco zzbco = this.f18780k;
                Executor executor = zzbbm.f18748a;
                zzbco.getClass();
                executor.execute(C8092w7.m18361a(zzbco));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo27933g() {
        if (this.f18775f.mo25650a() != null && !this.f18782m) {
            boolean z = (this.f18775f.mo25650a().getWindow().getAttributes().flags & 128) != 0;
            this.f18783n = z;
            if (!z) {
                this.f18775f.mo25650a().getWindow().addFlags(128);
                this.f18782m = true;
            }
        }
        this.f18781l = true;
    }

    /* renamed from: h */
    public final void mo27934h() {
        this.f18778i.mo25916b();
        zzaxi.f18651h.post(new C8166y7(this));
    }

    /* renamed from: i */
    public final void mo27935i() {
        m20611b("pause", new String[0]);
        m20613q();
        this.f18781l = false;
    }

    /* renamed from: j */
    public final void mo27952j() {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.mo16510c();
        }
    }

    /* renamed from: k */
    public final void mo27953k() {
        if (this.f18780k != null) {
            if (!TextUtils.isEmpty(this.f18787r)) {
                this.f18780k.mo16507a(this.f18787r, this.f18788s);
            } else {
                m20611b("no_src", new String[0]);
            }
        }
    }

    /* renamed from: l */
    public final void mo27954l() {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.f8025g.mo27987a(true);
            zzbco.mo16504a();
        }
    }

    /* renamed from: m */
    public final void mo27955m() {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.f8025g.mo27987a(false);
            zzbco.mo16504a();
        }
    }

    @TargetApi(14)
    /* renamed from: n */
    public final void mo27956n() {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            TextView textView = new TextView(zzbco.getContext());
            String valueOf = String.valueOf(this.f18780k.mo16514e());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f18776g.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f18776g.bringChildToFront(textView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo27957o() {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            long currentPosition = (long) zzbco.getCurrentPosition();
            if (this.f18785p != currentPosition && currentPosition > 0) {
                m20611b("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.f18785p = currentPosition;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f18778i.mo25916b();
        } else {
            this.f18778i.mo25915a();
            this.f18786q = this.f18785p;
        }
        zzaxi.f18651h.post(new C8129x7(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f18778i.mo25916b();
            z = true;
        } else {
            this.f18778i.mo25915a();
            this.f18786q = this.f18785p;
            z = false;
        }
        zzaxi.f18651h.post(new C7276a8(this, z));
    }

    public final void setVolume(float f) {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.f8025g.mo27986a(f);
            zzbco.mo16504a();
        }
    }

    /* renamed from: b */
    public final void mo27944b() {
        this.f18778i.mo25915a();
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.mo16512d();
        }
        m20613q();
    }

    /* renamed from: d */
    public final void mo27930d() {
        if (this.f18781l && m20612p()) {
            this.f18776g.removeView(this.f18790u);
        }
        if (this.f18789t != null) {
            long c = zzk.zzln().mo25499c();
            if (this.f18780k.getBitmap(this.f18789t) != null) {
                this.f18791v = true;
            }
            long c2 = zzk.zzln().mo25499c() - c;
            if (zzawz.m20166a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(c2);
                sb.append("ms");
                zzawz.m20167e(sb.toString());
            }
            if (c2 > this.f18779j) {
                zzbad.m20523d("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f18784o = false;
                this.f18789t = null;
                zzadi zzadi = this.f18777h;
                if (zzadi != null) {
                    zzadi.mo27184a("spinner_jank", Long.toString(c2));
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo27931e() {
        if (this.f18791v && this.f18789t != null && !m20612p()) {
            this.f18790u.setImageBitmap(this.f18789t);
            this.f18790u.invalidate();
            this.f18776g.addView(this.f18790u, new FrameLayout.LayoutParams(-1, -1));
            this.f18776g.bringChildToFront(this.f18790u);
        }
        this.f18778i.mo25915a();
        this.f18786q = this.f18785p;
        zzaxi.f18651h.post(new C8203z7(this));
    }

    /* renamed from: f */
    public final void mo27932f() {
        m20611b("ended", new String[0]);
        m20613q();
    }

    /* renamed from: c */
    public final void mo27947c(int i) {
        this.f18780k.mo16513d(i);
    }

    /* renamed from: a */
    public static void m20610a(zzbdf zzbdf, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        zzbdf.mo25665a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20611b(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f18775f.mo25665a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public static void m20609a(zzbdf zzbdf, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        zzbdf.mo25665a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo27940a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f18776g.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo27942a(String str, String[] strArr) {
        this.f18787r = str;
        this.f18788s = strArr;
    }

    /* renamed from: a */
    public final void mo27938a(float f, float f2) {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.mo16505a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo27939a(int i) {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.mo16509b(i);
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void mo27941a(MotionEvent motionEvent) {
        zzbco zzbco = this.f18780k;
        if (zzbco != null) {
            zzbco.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo27927a() {
        zzbco zzbco = this.f18780k;
        if (zzbco != null && this.f18786q == 0) {
            m20611b("canplaythrough", "duration", String.valueOf(((float) zzbco.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f18780k.getVideoWidth()), "videoHeight", String.valueOf(this.f18780k.getVideoHeight()));
        }
    }

    /* renamed from: a */
    public final void mo27929a(String str, String str2) {
        m20611b("error", "what", str, "extra", str2);
    }

    /* renamed from: a */
    public final void mo27928a(int i, int i2) {
        if (this.f18784o) {
            int max = Math.max(i / ((Integer) zzyt.m25670e().mo27163a(zzacu.f17781C)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzyt.m25670e().mo27163a(zzacu.f17781C)).intValue(), 1);
            Bitmap bitmap = this.f18789t;
            if (bitmap == null || bitmap.getWidth() != max || this.f18789t.getHeight() != max2) {
                this.f18789t = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.f18791v = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo27943a(boolean z) {
        m20611b("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
