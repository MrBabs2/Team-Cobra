package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzacr implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: f */
    private final Object f17765f = new Object();

    /* renamed from: g */
    private final ConditionVariable f17766g = new ConditionVariable();

    /* renamed from: h */
    private volatile boolean f17767h = false;
    @VisibleForTesting

    /* renamed from: i */
    private volatile boolean f17768i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public SharedPreferences f17769j = null;

    /* renamed from: k */
    private Bundle f17770k = new Bundle();

    /* renamed from: l */
    private Context f17771l;

    /* renamed from: m */
    private JSONObject f17772m = new JSONObject();

    /* renamed from: b */
    private final void m18978b() {
        if (this.f17769j != null) {
            try {
                this.f17772m = new JSONObject((String) zzazl.m20448a(this.f17771l, new C7862q(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo27165a(Context context) {
        if (!this.f17767h) {
            synchronized (this.f17765f) {
                if (!this.f17767h) {
                    if (!this.f17768i) {
                        this.f17768i = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.f17771l = applicationContext;
                    try {
                        this.f17770k = Wrappers.m16317a(applicationContext).mo25507a(this.f17771l.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                        if (remoteContext == null && context != null) {
                            Context applicationContext2 = context.getApplicationContext();
                            if (applicationContext2 != null) {
                                context = applicationContext2;
                            }
                            remoteContext = context;
                        }
                        if (remoteContext != null) {
                            zzyt.m25668c();
                            SharedPreferences sharedPreferences = remoteContext.getSharedPreferences("google_ads_flags", 0);
                            this.f17769j = sharedPreferences;
                            if (sharedPreferences != null) {
                                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                            }
                            m18978b();
                            this.f17767h = true;
                            this.f17768i = false;
                            this.f17766g.open();
                        }
                    } finally {
                        this.f17768i = false;
                        this.f17766g.open();
                    }
                }
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m18978b();
        }
    }

    /* renamed from: a */
    public final <T> T mo27163a(zzacj<T> zzacj) {
        if (!this.f17766g.block(5000)) {
            synchronized (this.f17765f) {
                if (!this.f17768i) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f17767h || this.f17769j == null) {
            synchronized (this.f17765f) {
                if (this.f17767h) {
                    if (this.f17769j == null) {
                    }
                }
                T c = zzacj.mo27156c();
                return c;
            }
        }
        if (zzacj.mo27155b() == 2) {
            Bundle bundle = this.f17770k;
            if (bundle == null) {
                return zzacj.mo27156c();
            }
            return zzacj.mo26194a(bundle);
        } else if (zzacj.mo27155b() != 1 || !this.f17772m.has(zzacj.mo27154a())) {
            return zzazl.m20448a(this.f17771l, new C7899r(this, zzacj));
        } else {
            return zzacj.mo26195a(this.f17772m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ String mo27164a() throws Exception {
        return this.f17769j.getString("flag_configuration", "{}");
    }
}
