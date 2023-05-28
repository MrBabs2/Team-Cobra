package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;

public final class zzw extends zzr {

    /* renamed from: f */
    private final Context f13605f;

    public zzw(Context context) {
        this.f13605f = context;
    }

    /* renamed from: Z */
    private final void m15240Z() {
        if (!GooglePlayServicesUtilLight.isGooglePlayServicesUid(this.f13605f, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: X0 */
    public final void mo24815X0() {
        m15240Z();
        Storage a = Storage.m15189a(this.f13605f);
        GoogleSignInAccount b = a.mo24793b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f13547t;
        if (b != null) {
            googleSignInOptions = a.mo24794c();
        }
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.f13605f);
        builder.mo24955a(Auth.f13431e, googleSignInOptions);
        GoogleApiClient a2 = builder.mo24958a();
        try {
            if (a2.mo24938a().mo24846t()) {
                if (b != null) {
                    Auth.f13432f.mo24752b(a2);
                } else {
                    a2.mo24945b();
                }
            }
        } finally {
            a2.mo24949d();
        }
    }

    /* renamed from: i1 */
    public final void mo24816i1() {
        m15240Z();
        zzp.m15225a(this.f13605f).mo24813a();
    }
}
