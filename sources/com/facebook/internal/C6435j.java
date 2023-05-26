package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.internal.p168a0.p170f.C6391a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.j */
/* compiled from: FacebookWebFallbackDialog */
public class C6435j extends C6482z {

    /* renamed from: u */
    private static final String f11810u = C6435j.class.getName();

    /* renamed from: t */
    private boolean f11811t;

    /* renamed from: com.facebook.internal.j$a */
    /* compiled from: FacebookWebFallbackDialog */
    class C6436a implements Runnable {
        C6436a() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6435j.super.cancel();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    private C6435j(Context context, String str, String str2) {
        super(context, str);
        mo21038b(str2);
    }

    public void cancel() {
        WebView a = mo21034a();
        if (!mo21040c() || mo21039b() || a == null || !a.isShown()) {
            super.cancel();
        } else if (!this.f11811t) {
            this.f11811t = true;
            a.loadUrl("javascript:" + "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new C6436a(), 1500);
        }
    }

    /* renamed from: a */
    public static C6435j m13333a(Context context, String str, String str2) {
        C6482z.m13570a(context);
        return new C6435j(context, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo20979a(String str) {
        Bundle f = C6476x.m13537f(Uri.parse(str).getQuery());
        String string = f.getString("bridge_args");
        f.remove("bridge_args");
        if (!C6476x.m13533d(string)) {
            try {
                f.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C6412c.m13298a(new JSONObject(string)));
            } catch (JSONException e) {
                C6476x.m13508a(f11810u, "Unable to parse bridge_args JSON", (Throwable) e);
            }
        }
        String string2 = f.getString("method_results");
        f.remove("method_results");
        if (!C6476x.m13533d(string2)) {
            if (C6476x.m13533d(string2)) {
                string2 = "{}";
            }
            try {
                f.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C6412c.m13298a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C6476x.m13508a(f11810u, "Unable to parse bridge_args JSON", (Throwable) e2);
            }
        }
        f.remove("version");
        f.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C6461s.m13442f());
        return f;
    }
}
