package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p050l.p097m.p098a.C5133a;

public class CustomTabActivity extends Activity {

    /* renamed from: g */
    public static final String f11593g = (CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect");

    /* renamed from: h */
    public static final String f11594h = (CustomTabActivity.class.getSimpleName() + ".action_destroy");

    /* renamed from: f */
    private BroadcastReceiver f11595f;

    /* renamed from: com.facebook.CustomTabActivity$a */
    class C6332a extends BroadcastReceiver {
        C6332a() {
        }

        public void onReceive(Context context, Intent intent) {
            CustomTabActivity.this.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f11593g);
            intent2.putExtra(CustomTabMainActivity.f11600k, getIntent().getDataString());
            C5133a.m9478a((Context) this).mo17802a(intent2);
            this.f11595f = new C6332a();
            C5133a.m9478a((Context) this).mo17801a(this.f11595f, new IntentFilter(f11594h));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f11593g);
        intent.putExtra(CustomTabMainActivity.f11600k, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C5133a.m9478a((Context) this).mo17800a(this.f11595f);
        super.onDestroy();
    }
}
