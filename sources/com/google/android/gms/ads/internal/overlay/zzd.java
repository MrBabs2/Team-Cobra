package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacu;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzaqc;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzdh;
import com.google.android.gms.internal.ads.zzwj;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzyt;
import java.util.Collections;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;

@zzard
public class zzd extends zzaqh implements zzx {
    @VisibleForTesting
    private static final int zzdjk = Color.argb(0, 0, 0, 0);
    protected final Activity mActivity;
    @VisibleForTesting
    AdOverlayInfoParcel zzdjl;
    @VisibleForTesting
    zzbgz zzdjm;
    @VisibleForTesting
    private zzj zzdjn;
    @VisibleForTesting
    private zzp zzdjo;
    @VisibleForTesting
    private boolean zzdjp = false;
    @VisibleForTesting
    private FrameLayout zzdjq;
    @VisibleForTesting
    private WebChromeClient.CustomViewCallback zzdjr;
    @VisibleForTesting
    private boolean zzdjs = false;
    @VisibleForTesting
    private boolean zzdjt = false;
    @VisibleForTesting
    private zzi zzdju;
    @VisibleForTesting
    private boolean zzdjv = false;
    @VisibleForTesting
    int zzdjw = 0;
    private final Object zzdjx = new Object();
    private Runnable zzdjy;
    private boolean zzdjz;
    private boolean zzdka;
    private boolean zzdkb = false;
    private boolean zzdkc = false;
    private boolean zzdkd = true;

    public zzd(Activity activity) {
        this.mActivity = activity;
    }

    private final void zzad(boolean z) throws zzh {
        if (!this.zzdka) {
            this.mActivity.requestWindowFeature(1);
        }
        Window window = this.mActivity.getWindow();
        if (window != null) {
            zzbgz zzbgz = this.zzdjl.zzdbs;
            zzb zzb = null;
            zzbii k = zzbgz != null ? zzbgz.mo25697k() : null;
            boolean z2 = false;
            boolean z3 = k != null && k.mo28144f();
            this.zzdjv = false;
            if (z3) {
                int i = this.zzdjl.orientation;
                zzk.zzli();
                if (i == 6) {
                    if (this.mActivity.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.zzdjv = z2;
                } else {
                    int i2 = this.zzdjl.orientation;
                    zzk.zzli();
                    if (i2 == 7) {
                        if (this.mActivity.getResources().getConfiguration().orientation == 2) {
                            z2 = true;
                        }
                        this.zzdjv = z2;
                    }
                }
            }
            boolean z4 = this.zzdjv;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z4);
            zzbad.m20516a(sb.toString());
            setRequestedOrientation(this.zzdjl.orientation);
            zzk.zzli();
            window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            zzbad.m20516a("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzdjt) {
                this.zzdju.setBackgroundColor(-16777216);
            } else {
                this.zzdju.setBackgroundColor(zzdjk);
            }
            this.mActivity.setContentView(this.zzdju);
            this.zzdka = true;
            if (z) {
                try {
                    zzk.zzlh();
                    zzbgz a = zzbhf.m20985a(this.mActivity, this.zzdjl.zzdbs != null ? this.zzdjl.zzdbs.mo25695i() : null, this.zzdjl.zzdbs != null ? this.zzdjl.zzdbs.mo25702m() : null, true, z3, (zzdh) null, this.zzdjl.zzbtc, (zzadi) null, (zzj) null, this.zzdjl.zzdbs != null ? this.zzdjl.zzdbs.mo25678c() : null, zzwj.m25465a());
                    this.zzdjm = a;
                    zzbii k2 = a.mo25697k();
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
                    zzagv zzagv = adOverlayInfoParcel.zzczo;
                    zzagx zzagx = adOverlayInfoParcel.zzczp;
                    zzu zzu = adOverlayInfoParcel.zzdkq;
                    zzbgz zzbgz2 = adOverlayInfoParcel.zzdbs;
                    if (zzbgz2 != null) {
                        zzb = zzbgz2.mo25697k().mo28146h();
                    }
                    k2.mo28130a((zzxr) null, zzagv, (zzo) null, zzagx, zzu, true, (zzahp) null, zzb, (zzaqc) null, (zzavb) null);
                    this.zzdjm.mo25697k().mo28128a((zzbij) new zze(this));
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjl;
                    String str = adOverlayInfoParcel2.url;
                    if (str != null) {
                        this.zzdjm.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel2.zzdkp;
                        if (str2 != null) {
                            this.zzdjm.loadDataWithBaseURL(adOverlayInfoParcel2.zzdkn, str2, "text/html", "UTF-8", (String) null);
                        } else {
                            throw new zzh("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zzbgz zzbgz3 = this.zzdjl.zzdbs;
                    if (zzbgz3 != null) {
                        zzbgz3.mo25653a(this);
                    }
                } catch (Exception e) {
                    zzbad.m20520b("Error obtaining webview.", e);
                    throw new zzh("Could not obtain webview for the overlay.");
                }
            } else {
                zzbgz zzbgz4 = this.zzdjl.zzdbs;
                this.zzdjm = zzbgz4;
                zzbgz4.mo25679c((Context) this.mActivity);
            }
            this.zzdjm.mo25673b(this);
            zzbgz zzbgz5 = this.zzdjl.zzdbs;
            if (zzbgz5 != null) {
                zzb(zzbgz5.mo25728z(), this.zzdju);
            }
            ViewParent parent = this.zzdjm.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzdjm.getView());
            }
            if (this.zzdjt) {
                this.zzdjm.mo25641C();
            }
            this.zzdju.addView(this.zzdjm.getView(), -1, -1);
            if (!z && !this.zzdjv) {
                zztl();
            }
            zzac(z3);
            if (this.zzdjm.mo25716r()) {
                zza(z3, true);
                return;
            }
            return;
        }
        throw new zzh("Invalid activity, no window available.");
    }

    private static void zzb(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper != null && view != null) {
            zzk.zzlv().mo27564a(iObjectWrapper, view);
        }
    }

    private final void zzti() {
        if (this.mActivity.isFinishing() && !this.zzdkb) {
            this.zzdkb = true;
            zzbgz zzbgz = this.zzdjm;
            if (zzbgz != null) {
                zzbgz.mo25651a(this.zzdjw);
                synchronized (this.zzdjx) {
                    if (!this.zzdjz && this.zzdjm.mo25698l()) {
                        zzf zzf = new zzf(this);
                        this.zzdjy = zzf;
                        zzaxi.f18651h.postDelayed(zzf, ((Long) zzyt.m25670e().mo27163a(zzacu.f17806I0)).longValue());
                        return;
                    }
                }
            }
            zztj();
        }
    }

    private final void zztl() {
        this.zzdjm.mo25639A();
    }

    public final void close() {
        this.zzdjw = 2;
        this.mActivity.finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
        this.zzdjw = 0;
    }

    public void onCreate(Bundle bundle) {
        this.mActivity.requestWindowFeature(1);
        this.zzdjs = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(this.mActivity.getIntent());
            this.zzdjl = zzc;
            if (zzc != null) {
                if (zzc.zzbtc.f18744h > 7500000) {
                    this.zzdjw = 3;
                }
                if (this.mActivity.getIntent() != null) {
                    this.zzdkd = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.zzdjl.zzdkt != null) {
                    this.zzdjt = this.zzdjl.zzdkt.zzbre;
                } else {
                    this.zzdjt = false;
                }
                if (this.zzdjt && this.zzdjl.zzdkt.zzbrj != -1) {
                    new zzk(this).zzvi();
                }
                if (bundle == null) {
                    if (this.zzdjl.zzdkm != null && this.zzdkd) {
                        this.zzdjl.zzdkm.zzta();
                    }
                    if (!(this.zzdjl.zzdkr == 1 || this.zzdjl.zzcgi == null)) {
                        this.zzdjl.zzcgi.onAdClicked();
                    }
                }
                zzi zzi = new zzi(this.mActivity, this.zzdjl.zzdks, this.zzdjl.zzbtc.f18742f);
                this.zzdju = zzi;
                zzi.setId(1000);
                zzk.zzli().mo27816a(this.mActivity);
                int i = this.zzdjl.zzdkr;
                if (i == 1) {
                    zzad(false);
                } else if (i == 2) {
                    this.zzdjn = new zzj(this.zzdjl.zzdbs);
                    zzad(false);
                } else if (i == 3) {
                    zzad(true);
                } else {
                    throw new zzh("Could not determine ad overlay type.");
                }
            } else {
                throw new zzh("Could not get info for ad overlay.");
            }
        } catch (zzh e) {
            zzbad.m20523d(e.getMessage());
            this.zzdjw = 3;
            this.mActivity.finish();
        }
    }

    public final void onDestroy() {
        zzbgz zzbgz = this.zzdjm;
        if (zzbgz != null) {
            this.zzdju.removeView(zzbgz.getView());
        }
        zzti();
    }

    public final void onPause() {
        zzte();
        zzo zzo = this.zzdjl.zzdkm;
        if (zzo != null) {
            zzo.onPause();
        }
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17940m2)).booleanValue() && this.zzdjm != null && (!this.mActivity.isFinishing() || this.zzdjn == null)) {
            zzk.zzli();
            zzaxo.m20328a(this.zzdjm);
        }
        zzti();
    }

    public final void onRestart() {
    }

    public final void onResume() {
        zzo zzo = this.zzdjl.zzdkm;
        if (zzo != null) {
            zzo.onResume();
        }
        zza(this.mActivity.getResources().getConfiguration());
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17940m2)).booleanValue()) {
            zzbgz zzbgz = this.zzdjm;
            if (zzbgz == null || zzbgz.mo25689f()) {
                zzbad.m20523d("The webview does not exist. Ignoring action.");
                return;
            }
            zzk.zzli();
            zzaxo.m20329b(this.zzdjm);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdjs);
    }

    public final void onStart() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17940m2)).booleanValue()) {
            zzbgz zzbgz = this.zzdjm;
            if (zzbgz == null || zzbgz.mo25689f()) {
                zzbad.m20523d("The webview does not exist. Ignoring action.");
                return;
            }
            zzk.zzli();
            zzaxo.m20329b(this.zzdjm);
        }
    }

    public final void onStop() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17940m2)).booleanValue() && this.zzdjm != null && (!this.mActivity.isFinishing() || this.zzdjn == null)) {
            zzk.zzli();
            zzaxo.m20328a(this.zzdjm);
        }
        zzti();
    }

    public final void setRequestedOrientation(int i) {
        if (this.mActivity.getApplicationInfo().targetSdkVersion >= ((Integer) zzyt.m25670e().mo27163a(zzacu.f17864W2)).intValue()) {
            if (this.mActivity.getApplicationInfo().targetSdkVersion <= ((Integer) zzyt.m25670e().mo27163a(zzacu.f17868X2)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzyt.m25670e().mo27163a(zzacu.f17872Y2)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzyt.m25670e().mo27163a(zzacu.f17876Z2)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.mActivity.setRequestedOrientation(i);
        } catch (Throwable th) {
            zzk.zzlk().mo27736b(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.zzdjl).zzdkt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17810J0
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r0 = r1.mo27163a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzdjl
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.zzh r0 = r0.zzdkt
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.zzbrl
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzacu.f17814K0
            com.google.android.gms.internal.ads.zzacr r4 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r3 = r4.mo27163a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzdjl
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.zzh r3 = r3.zzdkt
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.zzbrm
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzaqb r7 = new com.google.android.gms.internal.ads.zzaqb
            com.google.android.gms.internal.ads.zzbgz r4 = r6.zzdjm
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.mo27556a(r4)
        L_0x005a:
            com.google.android.gms.ads.internal.overlay.zzp r7 = r6.zzdjo
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            r7.zzaf(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzd.zza(boolean, boolean):void");
    }

    public final void zzac(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.m16390H(iObjectWrapper));
    }

    public final void zzdd() {
        this.zzdka = true;
    }

    public final void zzte() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
        if (adOverlayInfoParcel != null && this.zzdjp) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdjq != null) {
            this.mActivity.setContentView(this.zzdju);
            this.zzdka = true;
            this.zzdjq.removeAllViews();
            this.zzdjq = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdjr;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdjr = null;
        }
        this.zzdjp = false;
    }

    public final void zztf() {
        this.zzdjw = 1;
        this.mActivity.finish();
    }

    public final boolean zztg() {
        this.zzdjw = 0;
        zzbgz zzbgz = this.zzdjm;
        if (zzbgz == null) {
            return true;
        }
        boolean L = zzbgz.mo25649L();
        if (!L) {
            this.zzdjm.mo25665a("onbackblocked", (Map<String, ?>) Collections.emptyMap());
        }
        return L;
    }

    public final void zzth() {
        this.zzdju.removeView(this.zzdjo);
        zzac(true);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zztj() {
        zzbgz zzbgz;
        zzo zzo;
        if (!this.zzdkc) {
            this.zzdkc = true;
            zzbgz zzbgz2 = this.zzdjm;
            if (zzbgz2 != null) {
                this.zzdju.removeView(zzbgz2.getView());
                zzj zzj = this.zzdjn;
                if (zzj != null) {
                    this.zzdjm.mo25679c(zzj.zzlj);
                    this.zzdjm.mo25683d(false);
                    ViewGroup viewGroup = this.zzdjn.parent;
                    View view = this.zzdjm.getView();
                    zzj zzj2 = this.zzdjn;
                    viewGroup.addView(view, zzj2.index, zzj2.zzdkh);
                    this.zzdjn = null;
                } else if (this.mActivity.getApplicationContext() != null) {
                    this.zzdjm.mo25679c(this.mActivity.getApplicationContext());
                }
                this.zzdjm = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
            if (!(adOverlayInfoParcel == null || (zzo = adOverlayInfoParcel.zzdkm) == null)) {
                zzo.zzsz();
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjl;
            if (adOverlayInfoParcel2 != null && (zzbgz = adOverlayInfoParcel2.zzdbs) != null) {
                zzb(zzbgz.mo25728z(), this.zzdjl.zzdbs.getView());
            }
        }
    }

    public final void zztk() {
        if (this.zzdjv) {
            this.zzdjv = false;
            zztl();
        }
    }

    public final void zztm() {
        this.zzdju.zzdkg = true;
    }

    public final void zztn() {
        synchronized (this.zzdjx) {
            this.zzdjz = true;
            if (this.zzdjy != null) {
                zzaxi.f18651h.removeCallbacks(this.zzdjy);
                zzaxi.f18651h.post(this.zzdjy);
            }
        }
    }

    private final void zzac(boolean z) {
        int intValue = ((Integer) zzyt.m25670e().mo27163a(zzacu.f17948o2)).intValue();
        zzq zzq = new zzq();
        zzq.size = 50;
        zzq.paddingLeft = z ? intValue : 0;
        zzq.paddingRight = z ? 0 : intValue;
        zzq.paddingTop = 0;
        zzq.paddingBottom = intValue;
        this.zzdjo = new zzp(this.mActivity, zzq, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdjl.zzdko);
        this.zzdju.addView(this.zzdjo, layoutParams);
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.mActivity);
        this.zzdjq = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzdjq.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzdjq);
        this.zzdka = true;
        this.zzdjr = customViewCallback;
        this.zzdjp = true;
    }

    private final void zza(Configuration configuration) {
        zzh zzh;
        zzh zzh2 = this.zzdjl.zzdkt;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = zzh2 != null && zzh2.zzbrf;
        boolean a = zzk.zzli().mo27819a(this.mActivity, configuration);
        if ((this.zzdjt && !z3) || a) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (zzh = this.zzdjl.zzdkt) != null && zzh.zzbrk) {
            z2 = true;
        }
        Window window = this.mActivity.getWindow();
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17818L0)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i = 256;
            if (z) {
                i = 5380;
                if (z2) {
                    i = 5894;
                }
            }
            decorView.setSystemUiVisibility(i);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(RecyclerView.C0638l.FLAG_MOVED);
            if (Build.VERSION.SDK_INT >= 19 && z2) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        } else {
            window.addFlags(RecyclerView.C0638l.FLAG_MOVED);
            window.clearFlags(1024);
        }
    }
}
