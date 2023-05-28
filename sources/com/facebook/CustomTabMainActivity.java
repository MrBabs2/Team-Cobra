package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.C6425e;
import com.facebook.internal.C6461s;
import com.facebook.internal.C6476x;
import p050l.p097m.p098a.C5133a;

public class CustomTabMainActivity extends Activity {

    /* renamed from: h */
    public static final String f11597h = (CustomTabMainActivity.class.getSimpleName() + ".extra_action");

    /* renamed from: i */
    public static final String f11598i = (CustomTabMainActivity.class.getSimpleName() + ".extra_params");

    /* renamed from: j */
    public static final String f11599j = (CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage");

    /* renamed from: k */
    public static final String f11600k = (CustomTabMainActivity.class.getSimpleName() + ".extra_url");

    /* renamed from: l */
    public static final String f11601l = (CustomTabMainActivity.class.getSimpleName() + ".action_refresh");

    /* renamed from: f */
    private boolean f11602f = true;

    /* renamed from: g */
    private BroadcastReceiver f11603g;

    /* renamed from: com.facebook.CustomTabMainActivity$a */
    class C6333a extends BroadcastReceiver {
        C6333a() {
        }

        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f11601l);
            String str = CustomTabMainActivity.f11600k;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    /* renamed from: a */
    private void m13055a(int i, Intent intent) {
        C5133a.m9478a((Context) this).mo17800a(this.f11603g);
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f11600k);
            Intent a = C6461s.m13424a(getIntent(), stringExtra != null ? m13054a(stringExtra) : new Bundle(), (FacebookException) null);
            if (a != null) {
                intent = a;
            }
            setResult(i, intent);
        } else {
            setResult(i, C6461s.m13424a(getIntent(), (Bundle) null, (FacebookException) null));
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.f11593g.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(f11597h);
            Bundle bundleExtra = getIntent().getBundleExtra(f11598i);
            new C6425e(stringExtra, bundleExtra).mo20974a((Activity) this, getIntent().getStringExtra(f11599j));
            this.f11602f = false;
            this.f11603g = new C6333a();
            C5133a.m9478a((Context) this).mo17801a(this.f11603g, new IntentFilter(CustomTabActivity.f11593g));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f11601l.equals(intent.getAction())) {
            C5133a.m9478a((Context) this).mo17802a(new Intent(CustomTabActivity.f11594h));
            m13055a(-1, intent);
        } else if (CustomTabActivity.f11593g.equals(intent.getAction())) {
            m13055a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f11602f) {
            m13055a(0, (Intent) null);
        }
        this.f11602f = true;
    }

    /* renamed from: a */
    private static Bundle m13054a(String str) {
        Uri parse = Uri.parse(str);
        Bundle f = C6476x.m13537f(parse.getQuery());
        f.putAll(C6476x.m13537f(parse.getFragment()));
        return f;
    }
}
