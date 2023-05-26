package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;

@VisibleForTesting
@zzard
public interface zzbgz extends zzj, zzaji, zzakg, zzbdf, zzbhx, zzbhy, zzbic, zzbif, zzbig, zzbih, zzue {
    /* renamed from: A */
    void mo25639A();

    /* renamed from: B */
    Context mo25640B();

    /* renamed from: C */
    void mo25641C();

    /* renamed from: F */
    zzd mo25644F();

    /* renamed from: G */
    void mo25645G();

    /* renamed from: H */
    void mo25646H();

    /* renamed from: I */
    boolean mo25647I();

    /* renamed from: K */
    zzd mo25648K();

    /* renamed from: L */
    boolean mo25649L();

    /* renamed from: a */
    Activity mo25650a();

    /* renamed from: a */
    void mo25651a(int i);

    /* renamed from: a */
    void mo25653a(zzd zzd);

    /* renamed from: a */
    void mo25654a(IObjectWrapper iObjectWrapper);

    /* renamed from: a */
    void mo25655a(zzadv zzadv);

    /* renamed from: a */
    void mo25656a(zzadx zzadx);

    /* renamed from: a */
    void mo25657a(zzbhq zzbhq);

    /* renamed from: a */
    void mo25658a(zzbin zzbin);

    /* renamed from: a */
    void mo25661a(String str, Predicate<zzaho<? super zzbgz>> predicate);

    /* renamed from: a */
    void mo25662a(String str, zzaho<? super zzbgz> zzaho);

    /* renamed from: a */
    void mo25663a(String str, zzbft zzbft);

    /* renamed from: a */
    void mo25664a(String str, String str2, String str3);

    /* renamed from: a */
    void mo25667a(boolean z);

    /* renamed from: a */
    boolean mo25671a(boolean z, int i);

    /* renamed from: b */
    zzbai mo25672b();

    /* renamed from: b */
    void mo25673b(zzd zzd);

    /* renamed from: b */
    void mo25674b(String str, zzaho<? super zzbgz> zzaho);

    /* renamed from: b */
    void mo25676b(boolean z);

    /* renamed from: c */
    zza mo25678c();

    /* renamed from: c */
    void mo25679c(Context context);

    /* renamed from: c */
    void mo25680c(boolean z);

    /* renamed from: d */
    zzdh mo25682d();

    /* renamed from: d */
    void mo25683d(boolean z);

    void destroy();

    /* renamed from: e */
    zzbhq mo25685e();

    /* renamed from: e */
    void mo25686e(boolean z);

    /* renamed from: f */
    boolean mo25689f();

    /* renamed from: g */
    boolean mo25691g();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    View getView();

    WebView getWebView();

    int getWidth();

    /* renamed from: h */
    zzadh mo25694h();

    /* renamed from: i */
    zzbin mo25695i();

    /* renamed from: k */
    zzbii mo25697k();

    /* renamed from: l */
    boolean mo25698l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    String mo25702m();

    void measure(int i, int i2);

    void onPause();

    void onResume();

    /* renamed from: p */
    WebViewClient mo25714p();

    /* renamed from: q */
    void mo25715q();

    /* renamed from: r */
    boolean mo25716r();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* renamed from: t */
    void mo25722t();

    /* renamed from: u */
    void mo25723u();

    /* renamed from: v */
    void mo25724v();

    /* renamed from: x */
    zzadx mo25726x();

    /* renamed from: z */
    IObjectWrapper mo25728z();
}
