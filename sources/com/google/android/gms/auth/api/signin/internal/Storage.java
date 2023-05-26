package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class Storage {

    /* renamed from: c */
    private static final Lock f13588c = new ReentrantLock();

    /* renamed from: d */
    private static Storage f13589d;

    /* renamed from: a */
    private final Lock f13590a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f13591b;

    @VisibleForTesting
    private Storage(Context context) {
        this.f13591b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    /* renamed from: a */
    public static Storage m15189a(Context context) {
        Preconditions.m16037a(context);
        f13588c.lock();
        try {
            if (f13589d == null) {
                f13589d = new Storage(context.getApplicationContext());
            }
            return f13589d;
        } finally {
            f13588c.unlock();
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public GoogleSignInAccount mo24793b() {
        return m15188a(m15193c("defaultGoogleSignInAccount"));
    }

    @KeepForSdk
    /* renamed from: c */
    public GoogleSignInOptions mo24794c() {
        return m15191b(m15193c("defaultGoogleSignInAccount"));
    }

    @KeepForSdk
    /* renamed from: d */
    public String mo24795d() {
        return m15193c("refreshToken");
    }

    /* renamed from: e */
    public final void mo24796e() {
        String c = m15193c("defaultGoogleSignInAccount");
        m15194d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c)) {
            m15194d(m15192b("googleSignInAccount", c));
            m15194d(m15192b("googleSignInOptions", c));
        }
    }

    /* renamed from: d */
    private final void m15194d(String str) {
        this.f13590a.lock();
        try {
            this.f13591b.edit().remove(str).apply();
        } finally {
            this.f13590a.unlock();
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    private final GoogleSignInOptions m15191b(String str) {
        String c;
        if (!TextUtils.isEmpty(str) && (c = m15193c(m15192b("googleSignInOptions", str))) != null) {
            try {
                return GoogleSignInOptions.m15145a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private final String m15193c(String str) {
        this.f13590a.lock();
        try {
            return this.f13591b.getString(str, (String) null);
        } finally {
            this.f13590a.unlock();
        }
    }

    /* renamed from: b */
    private static String m15192b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo24792a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.m16037a(googleSignInAccount);
        Preconditions.m16037a(googleSignInOptions);
        m15190a("defaultGoogleSignInAccount", googleSignInAccount.mo24748y());
        Preconditions.m16037a(googleSignInAccount);
        Preconditions.m16037a(googleSignInOptions);
        String y = googleSignInAccount.mo24748y();
        m15190a(m15192b("googleSignInAccount", y), googleSignInAccount.mo24749z());
        m15190a(m15192b("googleSignInOptions", y), googleSignInOptions.mo24764v());
    }

    /* renamed from: a */
    private final void m15190a(String str, String str2) {
        this.f13590a.lock();
        try {
            this.f13591b.edit().putString(str, str2).apply();
        } finally {
            this.f13590a.unlock();
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private final GoogleSignInAccount m15188a(String str) {
        String c;
        if (!TextUtils.isEmpty(str) && (c = m15193c(m15192b("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m15126a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo24791a() {
        this.f13590a.lock();
        try {
            this.f13591b.edit().clear().apply();
        } finally {
            this.f13590a.unlock();
        }
    }
}
