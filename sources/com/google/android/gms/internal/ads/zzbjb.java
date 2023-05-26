package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
public class zzbjb extends C7911rb implements zzbje {

    /* renamed from: f */
    private final zzbiz f19050f;

    /* renamed from: g */
    private boolean f19051g;

    /* renamed from: h */
    private boolean f19052h;

    public zzbjb(Context context, zzbiz zzbiz) {
        super(context);
        zzk.zzlk().mo27740f();
        this.f19050f = zzbiz;
        super.setWebViewClient(zzbiz);
    }

    /* renamed from: N */
    private final synchronized void m21178N() {
        if (!this.f19052h) {
            this.f19052h = true;
            zzk.zzlk().mo27741g();
        }
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: H */
    public synchronized void mo25646H() {
        zzawz.m20167e("Destroying WebView!");
        m21178N();
        zzbbm.f18748a.execute(new C7985tb(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo28211M() {
        super.destroy();
    }

    /* renamed from: a */
    public final synchronized void mo28212a(zzbja zzbja) {
        zzawz.m20167e("Blank page loaded, 1...");
        mo25646H();
    }

    public synchronized void destroy() {
        if (!this.f19051g) {
            this.f19051g = true;
            this.f19050f.mo28201a((zzbje) this);
            mo26360g(false);
            zzawz.m20167e("Initiating WebView self destruct sequence in 3...");
            zzawz.m20167e("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                zzk.zzlk().mo27734a((Throwable) e, "AdWebViewImpl.loadUrlUnsafe");
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo28215f()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.zzbad.m20523d(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjb.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: f */
    public final synchronized boolean mo28215f() {
        return this.f19051g;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!mo28215f()) {
                    mo26360g(true);
                }
                m21178N();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26360g(boolean z) {
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!mo28215f()) {
            super.loadData(str, str2, str3);
        } else {
            zzbad.m20523d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo28215f()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzbad.m20523d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadUrl(String str) {
        if (!mo28215f()) {
            super.loadUrl(str);
        } else {
            zzbad.m20523d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!mo28215f()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!mo28215f()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!mo28215f()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !mo28215f() && super.onTouchEvent(motionEvent);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public void stopLoading() {
        if (!mo28215f()) {
            super.stopLoading();
        }
    }
}
