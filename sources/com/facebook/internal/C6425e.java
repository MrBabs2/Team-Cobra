package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C4716f;
import com.facebook.login.C6519a;
import p050l.p063c.p064b.C4858c;

/* renamed from: com.facebook.internal.e */
/* compiled from: CustomTab */
public class C6425e {

    /* renamed from: a */
    private Uri f11796a;

    public C6425e(String str, Bundle bundle) {
        this.f11796a = m13314a(str, bundle == null ? new Bundle() : bundle);
    }

    /* renamed from: a */
    public static Uri m13314a(String str, Bundle bundle) {
        String b = C6474v.m13473b();
        return C6476x.m13481a(b, C4716f.m7706o() + "/" + "dialog/" + str, bundle);
    }

    /* renamed from: a */
    public void mo20974a(Activity activity, String str) {
        C4858c b = new C4858c.C4859a(C6519a.m13766a()).mo16896b();
        b.f8326a.setPackage(str);
        b.f8326a.addFlags(1073741824);
        b.mo16888a(activity, this.f11796a);
    }
}
