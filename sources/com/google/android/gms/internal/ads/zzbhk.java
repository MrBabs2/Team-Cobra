package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.C7125R;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@zzard
public final class zzbhk extends FrameLayout implements zzbgz {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzbgz f18996f;

    /* renamed from: g */
    private final zzbcw f18997g;

    /* renamed from: h */
    private final AtomicBoolean f18998h = new AtomicBoolean();

    public zzbhk(zzbgz zzbgz) {
        super(zzbgz.getContext());
        this.f18996f = zzbgz;
        this.f18997g = new zzbcw(zzbgz.mo25640B(), this, this);
        addView(this.f18996f.getView());
    }

    /* renamed from: A */
    public final void mo25639A() {
        this.f18996f.mo25639A();
    }

    /* renamed from: B */
    public final Context mo25640B() {
        return this.f18996f.mo25640B();
    }

    /* renamed from: C */
    public final void mo25641C() {
        setBackgroundColor(0);
        this.f18996f.setBackgroundColor(0);
    }

    /* renamed from: D */
    public final int mo25642D() {
        return getMeasuredHeight();
    }

    /* renamed from: E */
    public final zzbcw mo25643E() {
        return this.f18997g;
    }

    /* renamed from: F */
    public final zzd mo25644F() {
        return this.f18996f.mo25644F();
    }

    /* renamed from: G */
    public final void mo25645G() {
        TextView textView = new TextView(getContext());
        Resources b = zzk.zzlk().mo27735b();
        textView.setText(b != null ? b.getString(C7125R.string.f13405s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: H */
    public final void mo25646H() {
        this.f18997g.mo27960a();
        this.f18996f.mo25646H();
    }

    /* renamed from: I */
    public final boolean mo25647I() {
        return this.f18998h.get();
    }

    /* renamed from: K */
    public final zzd mo25648K() {
        return this.f18996f.mo25648K();
    }

    /* renamed from: L */
    public final boolean mo25649L() {
        return this.f18996f.mo25649L();
    }

    /* renamed from: a */
    public final void mo25665a(String str, Map<String, ?> map) {
        this.f18996f.mo25665a(str, map);
    }

    /* renamed from: b */
    public final void mo25674b(String str, zzaho<? super zzbgz> zzaho) {
        this.f18996f.mo25674b(str, zzaho);
    }

    /* renamed from: c */
    public final zza mo25678c() {
        return this.f18996f.mo25678c();
    }

    /* renamed from: d */
    public final zzdh mo25682d() {
        return this.f18996f.mo25682d();
    }

    public final void destroy() {
        IObjectWrapper z = mo25728z();
        if (z != null) {
            zzk.zzlv().mo27565b(z);
            zzaxi.f18651h.postDelayed(new C7279ab(this), (long) ((Integer) zzyt.m25670e().mo27163a(zzacu.f17984x2)).intValue());
            return;
        }
        this.f18996f.destroy();
    }

    /* renamed from: e */
    public final zzbhq mo25685e() {
        return this.f18996f.mo25685e();
    }

    /* renamed from: f */
    public final boolean mo25689f() {
        return this.f18996f.mo25689f();
    }

    /* renamed from: g */
    public final boolean mo25691g() {
        return this.f18996f.mo25691g();
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this.f18996f.getWebView();
    }

    /* renamed from: h */
    public final zzadh mo25694h() {
        return this.f18996f.mo25694h();
    }

    /* renamed from: i */
    public final zzbin mo25695i() {
        return this.f18996f.mo25695i();
    }

    /* renamed from: j */
    public final String mo25696j() {
        return this.f18996f.mo25696j();
    }

    /* renamed from: k */
    public final zzbii mo25697k() {
        return this.f18996f.mo25697k();
    }

    /* renamed from: l */
    public final boolean mo25698l() {
        return this.f18996f.mo25698l();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f18996f.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f18996f.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f18996f.loadUrl(str);
    }

    /* renamed from: m */
    public final String mo25702m() {
        return this.f18996f.mo25702m();
    }

    /* renamed from: o */
    public final void mo25703o() {
        this.f18996f.mo25703o();
    }

    public final void onPause() {
        this.f18997g.mo27963b();
        this.f18996f.onPause();
    }

    public final void onResume() {
        this.f18996f.onResume();
    }

    /* renamed from: p */
    public final WebViewClient mo25714p() {
        return this.f18996f.mo25714p();
    }

    /* renamed from: q */
    public final void mo25715q() {
        this.f18996f.mo25715q();
    }

    /* renamed from: r */
    public final boolean mo25716r() {
        return this.f18996f.mo25716r();
    }

    /* renamed from: s */
    public final void mo25717s() {
        this.f18996f.mo25717s();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18996f.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f18996f.setOnTouchListener(onTouchListener);
    }

    public final void setRequestedOrientation(int i) {
        this.f18996f.setRequestedOrientation(i);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f18996f.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f18996f.setWebViewClient(webViewClient);
    }

    /* renamed from: t */
    public final void mo25722t() {
        this.f18996f.mo25722t();
    }

    /* renamed from: u */
    public final void mo25723u() {
        this.f18996f.mo25723u();
    }

    /* renamed from: v */
    public final void mo25724v() {
        this.f18996f.mo25724v();
    }

    /* renamed from: w */
    public final zzadg mo25725w() {
        return this.f18996f.mo25725w();
    }

    /* renamed from: x */
    public final zzadx mo25726x() {
        return this.f18996f.mo25726x();
    }

    /* renamed from: y */
    public final int mo25727y() {
        return getMeasuredWidth();
    }

    /* renamed from: z */
    public final IObjectWrapper mo25728z() {
        return this.f18996f.mo25728z();
    }

    public final void zzlc() {
        this.f18996f.zzlc();
    }

    public final void zzld() {
        this.f18996f.zzld();
    }

    /* renamed from: a */
    public final void mo25666a(String str, JSONObject jSONObject) {
        this.f18996f.mo25666a(str, jSONObject);
    }

    /* renamed from: b */
    public final void mo25675b(String str, JSONObject jSONObject) {
        this.f18996f.mo25675b(str, jSONObject);
    }

    /* renamed from: c */
    public final void mo25679c(Context context) {
        this.f18996f.mo25679c(context);
    }

    /* renamed from: d */
    public final void mo25683d(boolean z) {
        this.f18996f.mo25683d(z);
    }

    /* renamed from: e */
    public final void mo25686e(boolean z) {
        this.f18996f.mo25686e(z);
    }

    /* renamed from: f */
    public final void mo25688f(boolean z) {
        this.f18996f.mo25688f(z);
    }

    /* renamed from: a */
    public final void mo25662a(String str, zzaho<? super zzbgz> zzaho) {
        this.f18996f.mo25662a(str, zzaho);
    }

    /* renamed from: b */
    public final zzbai mo25672b() {
        return this.f18996f.mo25672b();
    }

    /* renamed from: c */
    public final void mo25680c(boolean z) {
        this.f18996f.mo25680c(z);
    }

    /* renamed from: d */
    public final zzbft mo25681d(String str) {
        return this.f18996f.mo25681d(str);
    }

    /* renamed from: a */
    public final void mo25661a(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        this.f18996f.mo25661a(str, predicate);
    }

    /* renamed from: b */
    public final void mo25673b(zzd zzd) {
        this.f18996f.mo25673b(zzd);
    }

    /* renamed from: a */
    public final void mo25651a(int i) {
        this.f18996f.mo25651a(i);
    }

    /* renamed from: b */
    public final void mo25676b(boolean z) {
        this.f18996f.mo25676b(z);
    }

    /* renamed from: a */
    public final void mo25670a(boolean z, long j) {
        this.f18996f.mo25670a(z, j);
    }

    /* renamed from: b */
    public final void mo25677b(boolean z, int i) {
        this.f18996f.mo25677b(z, i);
    }

    /* renamed from: a */
    public final void mo25660a(String str) {
        this.f18996f.mo25660a(str);
    }

    /* renamed from: a */
    public final Activity mo25650a() {
        return this.f18996f.mo25650a();
    }

    /* renamed from: a */
    public final void mo25654a(IObjectWrapper iObjectWrapper) {
        this.f18996f.mo25654a(iObjectWrapper);
    }

    /* renamed from: a */
    public final void mo25658a(zzbin zzbin) {
        this.f18996f.mo25658a(zzbin);
    }

    /* renamed from: a */
    public final void mo25653a(zzd zzd) {
        this.f18996f.mo25653a(zzd);
    }

    /* renamed from: a */
    public final void mo25663a(String str, zzbft zzbft) {
        this.f18996f.mo25663a(str, zzbft);
    }

    /* renamed from: a */
    public final void mo25664a(String str, String str2, String str3) {
        this.f18996f.mo25664a(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo25667a(boolean z) {
        this.f18996f.mo25667a(z);
    }

    /* renamed from: a */
    public final void mo25655a(zzadv zzadv) {
        this.f18996f.mo25655a(zzadv);
    }

    /* renamed from: a */
    public final void mo25659a(zzud zzud) {
        this.f18996f.mo25659a(zzud);
    }

    /* renamed from: a */
    public final void mo25656a(zzadx zzadx) {
        this.f18996f.mo25656a(zzadx);
    }

    /* renamed from: a */
    public final void mo25657a(zzbhq zzbhq) {
        this.f18996f.mo25657a(zzbhq);
    }

    /* renamed from: a */
    public final void mo25652a(zzc zzc) {
        this.f18996f.mo25652a(zzc);
    }

    /* renamed from: a */
    public final void mo25668a(boolean z, int i, String str) {
        this.f18996f.mo25668a(z, i, str);
    }

    /* renamed from: a */
    public final void mo25669a(boolean z, int i, String str, String str2) {
        this.f18996f.mo25669a(z, i, str, str2);
    }

    /* renamed from: a */
    public final boolean mo25671a(boolean z, int i) {
        if (!this.f18998h.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17986y0)).booleanValue()) {
            return false;
        }
        removeView(this.f18996f.getView());
        return this.f18996f.mo25671a(z, i);
    }
}
