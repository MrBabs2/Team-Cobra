package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6371i;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.C6360a;
import com.facebook.common.C6363d;
import com.facebook.common.C6364e;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;

/* renamed from: com.facebook.internal.z */
/* compiled from: WebDialog */
public class C6482z extends Dialog {

    /* renamed from: r */
    private static final int f11934r = C6364e.com_facebook_activity_theme;

    /* renamed from: s */
    private static volatile int f11935s;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f11936f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f11937g;

    /* renamed from: h */
    private C6489g f11938h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public WebView f11939i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ProgressDialog f11940j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ImageView f11941k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public FrameLayout f11942l;

    /* renamed from: m */
    private C6490h f11943m;

    /* renamed from: n */
    private boolean f11944n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f11945o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f11946p;

    /* renamed from: q */
    private WindowManager.LayoutParams f11947q;

    /* renamed from: com.facebook.internal.z$a */
    /* compiled from: WebDialog */
    class C6483a implements DialogInterface.OnCancelListener {
        C6483a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C6482z.this.cancel();
        }
    }

    /* renamed from: com.facebook.internal.z$b */
    /* compiled from: WebDialog */
    class C6484b implements View.OnClickListener {
        C6484b() {
        }

        public void onClick(View view) {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6482z.this.cancel();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.z$c */
    /* compiled from: WebDialog */
    class C6485c extends WebView {
        C6485c(Context context) {
            super(context);
        }

        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: com.facebook.internal.z$d */
    /* compiled from: WebDialog */
    class C6486d implements View.OnTouchListener {
        C6486d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: com.facebook.internal.z$e */
    /* compiled from: WebDialog */
    public static class C6487e {

        /* renamed from: a */
        private Context f11952a;

        /* renamed from: b */
        private String f11953b;

        /* renamed from: c */
        private String f11954c;

        /* renamed from: d */
        private int f11955d;

        /* renamed from: e */
        private C6489g f11956e;

        /* renamed from: f */
        private Bundle f11957f;

        /* renamed from: g */
        private AccessToken f11958g;

        public C6487e(Context context, String str, Bundle bundle) {
            this.f11958g = AccessToken.m13036r();
            if (!AccessToken.m13037s()) {
                String d = C6476x.m13530d(context);
                if (d != null) {
                    this.f11953b = d;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m13590a(context, str, bundle);
        }

        /* renamed from: a */
        public C6487e mo21054a(C6489g gVar) {
            this.f11956e = gVar;
            return this;
        }

        /* renamed from: b */
        public String mo21056b() {
            return this.f11953b;
        }

        /* renamed from: c */
        public Context mo21057c() {
            return this.f11952a;
        }

        /* renamed from: d */
        public C6489g mo21058d() {
            return this.f11956e;
        }

        /* renamed from: e */
        public Bundle mo21059e() {
            return this.f11957f;
        }

        /* renamed from: f */
        public int mo21060f() {
            return this.f11955d;
        }

        /* renamed from: a */
        public C6482z mo21055a() {
            AccessToken accessToken = this.f11958g;
            if (accessToken != null) {
                this.f11957f.putString(RateAndReviewsFragment.BundleCons.APP_ID, accessToken.mo20776a());
                this.f11957f.putString("access_token", this.f11958g.mo20788k());
            } else {
                this.f11957f.putString(RateAndReviewsFragment.BundleCons.APP_ID, this.f11953b);
            }
            return C6482z.m13566a(this.f11952a, this.f11954c, this.f11957f, this.f11955d, this.f11956e);
        }

        /* renamed from: a */
        private void m13590a(Context context, String str, Bundle bundle) {
            this.f11952a = context;
            this.f11954c = str;
            if (bundle != null) {
                this.f11957f = bundle;
            } else {
                this.f11957f = new Bundle();
            }
        }

        public C6487e(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? C6476x.m13530d(context) : str;
            C6481y.m13557a(str, "applicationId");
            this.f11953b = str;
            m13590a(context, str2, bundle);
        }
    }

    /* renamed from: com.facebook.internal.z$f */
    /* compiled from: WebDialog */
    private class C6488f extends WebViewClient {
        private C6488f() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C6482z.this.f11945o) {
                C6482z.this.f11940j.dismiss();
            }
            C6482z.this.f11942l.setBackgroundColor(0);
            C6482z.this.f11939i.setVisibility(0);
            C6482z.this.f11941k.setVisibility(0);
            boolean unused = C6482z.this.f11946p = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C6476x.m13528c("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (!C6482z.this.f11945o) {
                C6482z.this.f11940j.show();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C6482z.this.mo21037a((Throwable) new FacebookDialogException(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C6482z.this.mo21037a((Throwable) new FacebookDialogException((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Redirect URL: "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                com.facebook.internal.C6476x.m13528c(r0, r6)
                com.facebook.internal.z r6 = com.facebook.internal.C6482z.this
                java.lang.String r6 = r6.f11937g
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto L_0x00a6
                com.facebook.internal.z r6 = com.facebook.internal.C6482z.this
                android.os.Bundle r6 = r6.mo20979a((java.lang.String) r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0037
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0037:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L_0x0045
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L_0x0045:
                if (r1 != 0) goto L_0x004d
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L_0x004d:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = com.facebook.internal.C6476x.m13533d((java.lang.String) r2)
                r4 = -1
                if (r3 != 0) goto L_0x005f
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x005f }
                goto L_0x0060
            L_0x005f:
                r2 = -1
            L_0x0060:
                boolean r3 = com.facebook.internal.C6476x.m13533d((java.lang.String) r7)
                if (r3 == 0) goto L_0x0074
                boolean r3 = com.facebook.internal.C6476x.m13533d((java.lang.String) r1)
                if (r3 == 0) goto L_0x0074
                if (r2 != r4) goto L_0x0074
                com.facebook.internal.z r7 = com.facebook.internal.C6482z.this
                r7.mo21035a((android.os.Bundle) r6)
                goto L_0x00a5
            L_0x0074:
                if (r7 == 0) goto L_0x008c
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0086
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x008c
            L_0x0086:
                com.facebook.internal.z r6 = com.facebook.internal.C6482z.this
                r6.cancel()
                goto L_0x00a5
            L_0x008c:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x0096
                com.facebook.internal.z r6 = com.facebook.internal.C6482z.this
                r6.cancel()
                goto L_0x00a5
            L_0x0096:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                com.facebook.internal.z r7 = com.facebook.internal.C6482z.this
                com.facebook.FacebookServiceException r2 = new com.facebook.FacebookServiceException
                r2.<init>(r6, r1)
                r7.mo21037a((java.lang.Throwable) r2)
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L_0x00b4
                com.facebook.internal.z r6 = com.facebook.internal.C6482z.this
                r6.cancel()
                return r0
            L_0x00b4:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto L_0x00be
                return r1
            L_0x00be:
                com.facebook.internal.z r6 = com.facebook.internal.C6482z.this     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                r2.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                return r0
            L_0x00d3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6482z.C6488f.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        /* synthetic */ C6488f(C6482z zVar, C6483a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.z$g */
    /* compiled from: WebDialog */
    public interface C6489g {
        /* renamed from: a */
        void mo20976a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: com.facebook.internal.z$h */
    /* compiled from: WebDialog */
    private class C6490h extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        private String f11960a;

        /* renamed from: b */
        private Bundle f11961b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Exception[] f11962c;

        /* renamed from: com.facebook.internal.z$h$a */
        /* compiled from: WebDialog */
        class C6491a implements GraphRequest.C6344f {

            /* renamed from: a */
            final /* synthetic */ String[] f11964a;

            /* renamed from: b */
            final /* synthetic */ int f11965b;

            /* renamed from: c */
            final /* synthetic */ CountDownLatch f11966c;

            C6491a(String[] strArr, int i, CountDownLatch countDownLatch) {
                this.f11964a = strArr;
                this.f11965b = i;
                this.f11966c = countDownLatch;
            }

            public void onCompleted(C6371i iVar) {
                try {
                    FacebookRequestError a = iVar.mo20918a();
                    String str = "Error staging photo.";
                    if (a != null) {
                        String b = a.mo20813b();
                        if (b != null) {
                            str = b;
                        }
                        throw new FacebookGraphResponseException(iVar, str);
                    }
                    JSONObject b2 = iVar.mo20919b();
                    if (b2 != null) {
                        String optString = b2.optString(DeepLinkIntentReceiver.DeepLinksKeys.URI);
                        if (optString != null) {
                            this.f11964a[this.f11965b] = optString;
                            this.f11966c.countDown();
                            return;
                        }
                        throw new FacebookException(str);
                    }
                    throw new FacebookException(str);
                } catch (Exception e) {
                    C6490h.this.f11962c[this.f11965b] = e;
                }
            }
        }

        C6490h(String str, Bundle bundle) {
            this.f11960a = str;
            this.f11961b = bundle;
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (C6391a.m13260a((Object) this)) {
                return null;
            }
            try {
                return mo21067a((Void[]) objArr);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    mo21066a((String[]) obj);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|(2:28|26)|38|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r10 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
            if (r10.hasNext() != false) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
            ((android.os.AsyncTask) r10.next()).cancel(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String[] mo21067a(java.lang.Void... r10) {
            /*
                r9 = this;
                boolean r10 = com.facebook.internal.p168a0.p170f.C6391a.m13260a((java.lang.Object) r9)
                r0 = 0
                if (r10 == 0) goto L_0x0008
                return r0
            L_0x0008:
                android.os.Bundle r10 = r9.f11961b     // Catch:{ all -> 0x0089 }
                java.lang.String r1 = "media"
                java.lang.String[] r10 = r10.getStringArray(r1)     // Catch:{ all -> 0x0089 }
                int r1 = r10.length     // Catch:{ all -> 0x0089 }
                java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0089 }
                int r2 = r10.length     // Catch:{ all -> 0x0089 }
                java.lang.Exception[] r2 = new java.lang.Exception[r2]     // Catch:{ all -> 0x0089 }
                r9.f11962c = r2     // Catch:{ all -> 0x0089 }
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0089 }
                int r3 = r10.length     // Catch:{ all -> 0x0089 }
                r2.<init>(r3)     // Catch:{ all -> 0x0089 }
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x0089 }
                r3.<init>()     // Catch:{ all -> 0x0089 }
                com.facebook.AccessToken r4 = com.facebook.AccessToken.m13036r()     // Catch:{ all -> 0x0089 }
                r5 = 0
            L_0x0028:
                r6 = 1
                int r7 = r10.length     // Catch:{ Exception -> 0x0074 }
                if (r5 >= r7) goto L_0x0070
                boolean r7 = r9.isCancelled()     // Catch:{ Exception -> 0x0074 }
                if (r7 == 0) goto L_0x0047
                java.util.Iterator r10 = r3.iterator()     // Catch:{ Exception -> 0x0074 }
            L_0x0036:
                boolean r1 = r10.hasNext()     // Catch:{ Exception -> 0x0074 }
                if (r1 == 0) goto L_0x0046
                java.lang.Object r1 = r10.next()     // Catch:{ Exception -> 0x0074 }
                android.os.AsyncTask r1 = (android.os.AsyncTask) r1     // Catch:{ Exception -> 0x0074 }
                r1.cancel(r6)     // Catch:{ Exception -> 0x0074 }
                goto L_0x0036
            L_0x0046:
                return r0
            L_0x0047:
                r7 = r10[r5]     // Catch:{ Exception -> 0x0074 }
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0074 }
                boolean r8 = com.facebook.internal.C6476x.m13532d((android.net.Uri) r7)     // Catch:{ Exception -> 0x0074 }
                if (r8 == 0) goto L_0x005d
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0074 }
                r1[r5] = r7     // Catch:{ Exception -> 0x0074 }
                r2.countDown()     // Catch:{ Exception -> 0x0074 }
                goto L_0x006d
            L_0x005d:
                com.facebook.internal.z$h$a r8 = new com.facebook.internal.z$h$a     // Catch:{ Exception -> 0x0074 }
                r8.<init>(r1, r5, r2)     // Catch:{ Exception -> 0x0074 }
                com.facebook.GraphRequest r7 = com.facebook.share.internal.C6552b.m13888a((com.facebook.AccessToken) r4, (android.net.Uri) r7, (com.facebook.GraphRequest.C6344f) r8)     // Catch:{ Exception -> 0x0074 }
                com.facebook.g r7 = r7.mo20832b()     // Catch:{ Exception -> 0x0074 }
                r3.add(r7)     // Catch:{ Exception -> 0x0074 }
            L_0x006d:
                int r5 = r5 + 1
                goto L_0x0028
            L_0x0070:
                r2.await()     // Catch:{ Exception -> 0x0074 }
                return r1
            L_0x0074:
                java.util.Iterator r10 = r3.iterator()     // Catch:{ all -> 0x0089 }
            L_0x0078:
                boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0089 }
                if (r1 == 0) goto L_0x0088
                java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x0089 }
                android.os.AsyncTask r1 = (android.os.AsyncTask) r1     // Catch:{ all -> 0x0089 }
                r1.cancel(r6)     // Catch:{ all -> 0x0089 }
                goto L_0x0078
            L_0x0088:
                return r0
            L_0x0089:
                r10 = move-exception
                com.facebook.internal.p168a0.p170f.C6391a.m13259a(r10, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6482z.C6490h.mo21067a(java.lang.Void[]):java.lang.String[]");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo21066a(String[] strArr) {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6482z.this.f11940j.dismiss();
                    for (Exception exc : this.f11962c) {
                        if (exc != null) {
                            C6482z.this.mo21037a((Throwable) exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        C6482z.this.mo21037a((Throwable) new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List asList = Arrays.asList(strArr);
                    if (asList.contains((Object) null)) {
                        C6482z.this.mo21037a((Throwable) new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    C6476x.m13513a(this.f11961b, "media", (Object) new JSONArray(asList));
                    String unused = C6482z.this.f11936f = C6476x.m13481a(C6474v.m13473b(), C4716f.m7706o() + "/" + "dialog/" + this.f11960a, this.f11961b).toString();
                    C6482z.this.m13569a((C6482z.this.f11941k.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    protected C6482z(Context context, String str) {
        this(context, str, m13579f());
    }

    public void cancel() {
        if (this.f11938h != null && !this.f11944n) {
            mo21037a((Throwable) new FacebookOperationCanceledException());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f11939i;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f11945o && (progressDialog = this.f11940j) != null && progressDialog.isShowing()) {
            this.f11940j.dismiss();
        }
        super.dismiss();
    }

    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        this.f11945o = false;
        if (C6476x.m13542g(getContext()) && (layoutParams = this.f11947q) != null && layoutParams.token == null) {
            layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
            C6476x.m13528c("FacebookSDK.WebDialog", "Set token on onAttachedToWindow(): " + this.f11947q.token);
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f11940j = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f11940j.setMessage(getContext().getString(C6363d.com_facebook_loading));
        this.f11940j.setCanceledOnTouchOutside(false);
        this.f11940j.setOnCancelListener(new C6483a());
        requestWindowFeature(1);
        this.f11942l = new FrameLayout(getContext());
        mo21041d();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m13578e();
        if (this.f11936f != null) {
            m13569a((this.f11941k.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f11942l.addView(this.f11941k, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f11942l);
    }

    public void onDetachedFromWindow() {
        this.f11945o = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C6490h hVar = this.f11943m;
        if (hVar == null || hVar.getStatus() != AsyncTask.Status.PENDING) {
            mo21041d();
            return;
        }
        this.f11943m.execute(new Void[0]);
        this.f11940j.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C6490h hVar = this.f11943m;
        if (hVar != null) {
            hVar.cancel(true);
            this.f11940j.dismiss();
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f11947q = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C6482z(Context context, String str, int i) {
        super(context, i == 0 ? m13579f() : i);
        this.f11937g = "fbconnect://success";
        this.f11944n = false;
        this.f11945o = false;
        this.f11946p = false;
        this.f11936f = str;
    }

    /* renamed from: b */
    public static void m13573b(int i) {
        if (i == 0) {
            i = f11934r;
        }
        f11935s = i;
    }

    /* renamed from: e */
    private void m13578e() {
        ImageView imageView = new ImageView(getContext());
        this.f11941k = imageView;
        imageView.setOnClickListener(new C6484b());
        this.f11941k.setImageDrawable(getContext().getResources().getDrawable(C6360a.com_facebook_close));
        this.f11941k.setVisibility(4);
    }

    /* renamed from: f */
    public static int m13579f() {
        C6481y.m13563c();
        return f11935s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo21040c() {
        return this.f11946p;
    }

    /* renamed from: d */
    public void mo21041d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i >= i2) {
            i = i2;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        if (i3 < i4) {
            i3 = i4;
        }
        getWindow().setLayout(Math.min(m13565a(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m13565a(i3, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21038b(String str) {
        this.f11937g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo21039b() {
        return this.f11944n;
    }

    /* renamed from: a */
    protected static void m13570a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null && f11935s == 0) {
                    m13573b(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C6482z(Context context, String str, Bundle bundle, int i, C6489g gVar) {
        super(context, i == 0 ? m13579f() : i);
        String str2 = "fbconnect://success";
        this.f11937g = str2;
        this.f11944n = false;
        this.f11945o = false;
        this.f11946p = false;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = C6476x.m13539f(context) ? "fbconnect://chrome_os_success" : str2;
        this.f11937g = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C4716f.m7697f());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C4716f.m7710s()}));
        this.f11938h = gVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String b = C6474v.m13473b();
            this.f11936f = C6476x.m13481a(b, C4716f.m7706o() + "/" + "dialog/" + str, bundle).toString();
            return;
        }
        this.f11943m = new C6490h(str, bundle);
    }

    /* renamed from: a */
    public static C6482z m13566a(Context context, String str, Bundle bundle, int i, C6489g gVar) {
        m13570a(context);
        return new C6482z(context, str, bundle, i, gVar);
    }

    /* renamed from: a */
    public void mo21036a(C6489g gVar) {
        this.f11938h = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo20979a(String str) {
        Uri parse = Uri.parse(str);
        Bundle f = C6476x.m13537f(parse.getQuery());
        f.putAll(C6476x.m13537f(parse.getFragment()));
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebView mo21034a() {
        return this.f11939i;
    }

    /* renamed from: a */
    private int m13565a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            double d2 = (double) (i3 - i4);
            double d3 = (double) (i3 - i2);
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = 0.5d + ((d2 / d3) * 0.5d);
        }
        double d4 = (double) i;
        Double.isNaN(d4);
        return (int) (d4 * d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21035a(Bundle bundle) {
        C6489g gVar = this.f11938h;
        if (gVar != null && !this.f11944n) {
            this.f11944n = true;
            gVar.mo20976a(bundle, (FacebookException) null);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21037a(Throwable th) {
        FacebookException facebookException;
        if (this.f11938h != null && !this.f11944n) {
            this.f11944n = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            this.f11938h.mo20976a((Bundle) null, facebookException);
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public void m13569a(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        C6485c cVar = new C6485c(getContext());
        this.f11939i = cVar;
        cVar.setVerticalScrollBarEnabled(false);
        this.f11939i.setHorizontalScrollBarEnabled(false);
        this.f11939i.setWebViewClient(new C6488f(this, (C6483a) null));
        this.f11939i.getSettings().setJavaScriptEnabled(true);
        this.f11939i.loadUrl(this.f11936f);
        this.f11939i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f11939i.setVisibility(4);
        this.f11939i.getSettings().setSavePassword(false);
        this.f11939i.getSettings().setSaveFormData(false);
        this.f11939i.setFocusable(true);
        this.f11939i.setFocusableInTouchMode(true);
        this.f11939i.setOnTouchListener(new C6486d());
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f11939i);
        linearLayout.setBackgroundColor(-872415232);
        this.f11942l.addView(linearLayout);
    }
}
