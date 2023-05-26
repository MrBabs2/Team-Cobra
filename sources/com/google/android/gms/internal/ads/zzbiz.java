package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import okhttp3.internal.p398ws.WebSocketProtocol;

@zzard
public class zzbiz extends WebViewClient {

    /* renamed from: b */
    private static final String[] f19044b = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: c */
    private static final String[] f19045c = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: a */
    private zzbje f19046a;

    /* renamed from: a */
    public void mo26855a(zzbja zzbja) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo28201a(zzbje zzbje) {
        this.f19046a = zzbje;
    }

    /* renamed from: b */
    public void mo26856b(zzbja zzbja) {
    }

    /* renamed from: c */
    public boolean mo26857c(zzbja zzbja) {
        return false;
    }

    /* renamed from: d */
    public WebResourceResponse mo28195d(zzbja zzbja) {
        return null;
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String valueOf = String.valueOf(str);
            zzawz.m20167e(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
            mo26856b(new zzbja(str));
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            zzbja zzbja = new zzbja(str);
            zzbje zzbje = this.f19046a;
            if (zzbje != null) {
                zzbje.mo28212a(zzbja);
            } else {
                mo26855a(zzbja);
            }
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (i >= 0 || (-i) - 1 >= f19044b.length) {
            String.valueOf(i);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= f19045c.length) {
                String.valueOf(primaryError);
            }
            sslError.getUrl();
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return mo28195d(new zzbja(str));
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /*126*/:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return mo26857c(new zzbja(str));
    }

    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return mo28195d(new zzbja(webResourceRequest));
    }

    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return mo26857c(new zzbja(webResourceRequest));
    }
}
