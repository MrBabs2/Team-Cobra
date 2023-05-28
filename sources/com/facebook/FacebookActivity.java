package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.C0462h;
import androidx.fragment.app.C0485m;
import androidx.fragment.app.Fragment;
import com.facebook.common.C6361b;
import com.facebook.common.C6362c;
import com.facebook.internal.C6427g;
import com.facebook.internal.C6461s;
import com.facebook.internal.C6476x;
import com.facebook.login.C6523e;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

public class FacebookActivity extends C0456c {

    /* renamed from: g */
    public static String f11605g = "PassThrough";

    /* renamed from: h */
    private static String f11606h = "SingleFragment";

    /* renamed from: i */
    private static final String f11607i = FacebookActivity.class.getName();

    /* renamed from: f */
    private Fragment f11608f;

    /* renamed from: c */
    private void m13056c() {
        setResult(0, C6461s.m13424a(getIntent(), (Bundle) null, C6461s.m13427a(C6461s.m13434b(getIntent()))));
        finish();
    }

    /* renamed from: a */
    public Fragment mo20807a() {
        return this.f11608f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Fragment mo20808b() {
        Intent intent = getIntent();
        C0462h supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2792a(f11606h);
        if (a != null) {
            return a;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            C6427g gVar = new C6427g();
            gVar.setRetainInstance(true);
            gVar.show(supportFragmentManager, f11606h);
            return gVar;
        } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.setRetainInstance(true);
            deviceShareDialogFragment.mo21247a((ShareContent) intent.getParcelableExtra("content"));
            deviceShareDialogFragment.show(supportFragmentManager, f11606h);
            return deviceShareDialogFragment;
        } else {
            C6523e eVar = new C6523e();
            eVar.setRetainInstance(true);
            C0485m a2 = supportFragmentManager.mo2793a();
            a2.mo2945a(C6361b.com_facebook_fragment_container, eVar, f11606h);
            a2.mo2675a();
            return eVar;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f11608f;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C4716f.m7713v()) {
            C6476x.m13528c(f11607i, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            C4716f.m7694c(getApplicationContext());
        }
        setContentView(C6362c.com_facebook_activity_layout);
        if (f11605g.equals(intent.getAction())) {
            m13056c();
        } else {
            this.f11608f = mo20808b();
        }
    }
}
