package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;

@TargetApi(11)
@zzard
public final class zzbgr extends WebChromeClient {

    /* renamed from: a */
    private final zzbgz f18971a;

    public zzbgr(zzbgz zzbgz) {
        this.f18971a = zzbgz;
    }

    /* renamed from: a */
    private final boolean m20896a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzb h;
        try {
            if (this.f18971a == null || this.f18971a.mo25697k() == null || this.f18971a.mo25697k().mo28146h() == null || (h = this.f18971a.mo25697k().mo28146h()) == null || h.zzkx()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new C7910ra(jsPromptResult, editText)).setNegativeButton(17039360, new C7873qa(jsPromptResult)).setOnCancelListener(new C7836pa(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(17039370, new C7799oa(jsResult)).setNegativeButton(17039360, new C7762na(jsResult)).setOnCancelListener(new C7725ma(jsResult)).create().show();
                }
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            h.zzbk(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            zzbad.m20522c("Fail to display Dialog.", e);
        }
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzbgz)) {
            zzbad.m20523d("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzd F = ((zzbgz) webView).mo25644F();
        if (F == null) {
            zzbad.m20523d("Tried to close an AdWebView not associated with an overlay.");
        } else {
            F.close();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = C7947sa.f16841a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzbad.m20519b(sb2);
        } else if (i == 2) {
            zzbad.m20523d(sb2);
        } else if (i == 3 || i == 4) {
            zzbad.m20521c(sb2);
        } else if (i != 5) {
            zzbad.m20521c(sb2);
        } else {
            zzbad.m20516a(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f18971a.mo25714p() != null) {
            webView2.setWebViewClient(this.f18971a.mo25714p());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzk.zzlg();
            if (!zzaxi.m20286b(this.f18971a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzk.zzlg();
                if (!zzaxi.m20286b(this.f18971a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        zzd F = this.f18971a.mo25644F();
        if (F == null) {
            zzbad.m20523d("Could not get ad overlay when hiding custom view.");
        } else {
            F.zzte();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m20896a(m20895a(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m20896a(m20895a(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m20896a(m20895a(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m20896a(m20895a(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (PlatformVersion.m16292h()) {
            if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17978w0)).booleanValue()) {
                zzbgz zzbgz = this.f18971a;
                if (zzbgz == null || zzbgz.mo25697k() == null || this.f18971a.mo25697k().mo28145g() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] a = this.f18971a.mo25697k().mo28145g().mo27673a(permissionRequest.getResources());
                if (a.length > 0) {
                    permissionRequest.grant(a);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzd F = this.f18971a.mo25644F();
        if (F == null) {
            zzbad.m20523d("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        F.zza(view, customViewCallback);
        F.setRequestedOrientation(i);
    }

    /* renamed from: a */
    private static Context m20895a(WebView webView) {
        if (!(webView instanceof zzbgz)) {
            return webView.getContext();
        }
        zzbgz zzbgz = (zzbgz) webView;
        Activity a = zzbgz.mo25650a();
        if (a != null) {
            return a;
        }
        return zzbgz.getContext();
    }
}
