package com.bumptech.glide.p159m;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p159m.C6232c;
import com.bumptech.glide.p166r.C6315j;

/* renamed from: com.bumptech.glide.m.e */
/* compiled from: DefaultConnectivityMonitor */
final class C6235e implements C6232c {

    /* renamed from: f */
    private final Context f11388f;

    /* renamed from: g */
    final C6232c.C6233a f11389g;

    /* renamed from: h */
    boolean f11390h;

    /* renamed from: i */
    private boolean f11391i;

    /* renamed from: j */
    private final BroadcastReceiver f11392j = new C6236a();

    /* renamed from: com.bumptech.glide.m.e$a */
    /* compiled from: DefaultConnectivityMonitor */
    class C6236a extends BroadcastReceiver {
        C6236a() {
        }

        public void onReceive(Context context, Intent intent) {
            C6235e eVar = C6235e.this;
            boolean z = eVar.f11390h;
            eVar.f11390h = eVar.mo20563a(context);
            if (z != C6235e.this.f11390h) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C6235e.this.f11390h);
                }
                C6235e eVar2 = C6235e.this;
                eVar2.f11389g.mo20016a(eVar2.f11390h);
            }
        }
    }

    C6235e(Context context, C6232c.C6233a aVar) {
        this.f11388f = context.getApplicationContext();
        this.f11389g = aVar;
    }

    /* renamed from: a */
    private void m12672a() {
        if (!this.f11391i) {
            this.f11390h = mo20563a(this.f11388f);
            try {
                this.f11388f.registerReceiver(this.f11392j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f11391i = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: b */
    private void m12673b() {
        if (this.f11391i) {
            this.f11388f.unregisterReceiver(this.f11392j);
            this.f11391i = false;
        }
    }

    public void onDestroy() {
    }

    public void onStart() {
        m12672a();
    }

    public void onStop() {
        m12673b();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public boolean mo20563a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C6315j.m12978a(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
