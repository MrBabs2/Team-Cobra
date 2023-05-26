package androidx.work.impl.p009k.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.C0834i;
import androidx.work.impl.p009k.C0875b;
import androidx.work.impl.utils.p014k.C0956a;
import p050l.p075h.p080h.C4969a;

/* renamed from: androidx.work.impl.k.f.e */
/* compiled from: NetworkStateTracker */
public class C0893e extends C0891d<C0875b> {

    /* renamed from: j */
    static final String f3178j = C0834i.m3721a("NetworkStateTracker");

    /* renamed from: g */
    private final ConnectivityManager f3179g = ((ConnectivityManager) this.f3172b.getSystemService("connectivity"));

    /* renamed from: h */
    private C0895b f3180h;

    /* renamed from: i */
    private C0894a f3181i;

    /* renamed from: androidx.work.impl.k.f.e$a */
    /* compiled from: NetworkStateTracker */
    private class C0894a extends BroadcastReceiver {
        C0894a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C0834i.m3720a().mo4726a(C0893e.f3178j, "Network broadcast received", new Throwable[0]);
                C0893e eVar = C0893e.this;
                eVar.mo4855a(eVar.mo4858d());
            }
        }
    }

    /* renamed from: androidx.work.impl.k.f.e$b */
    /* compiled from: NetworkStateTracker */
    private class C0895b extends ConnectivityManager.NetworkCallback {
        C0895b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C0834i.m3720a().mo4726a(C0893e.f3178j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            C0893e eVar = C0893e.this;
            eVar.mo4855a(eVar.mo4858d());
        }

        public void onLost(Network network) {
            C0834i.m3720a().mo4726a(C0893e.f3178j, "Network connection lost", new Throwable[0]);
            C0893e eVar = C0893e.this;
            eVar.mo4855a(eVar.mo4858d());
        }
    }

    public C0893e(Context context, C0956a aVar) {
        super(context, aVar);
        if (m3956f()) {
            this.f3180h = new C0895b();
        } else {
            this.f3181i = new C0894a();
        }
    }

    /* renamed from: e */
    private boolean m3955e() {
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT >= 23 && (networkCapabilities = this.f3179g.getNetworkCapabilities(this.f3179g.getActiveNetwork())) != null && networkCapabilities.hasCapability(16)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m3956f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: b */
    public void mo4851b() {
        if (m3956f()) {
            C0834i.m3720a().mo4726a(f3178j, "Registering network callback", new Throwable[0]);
            this.f3179g.registerDefaultNetworkCallback(this.f3180h);
            return;
        }
        C0834i.m3720a().mo4726a(f3178j, "Registering broadcast receiver", new Throwable[0]);
        this.f3172b.registerReceiver(this.f3181i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: c */
    public void mo4852c() {
        if (m3956f()) {
            try {
                C0834i.m3720a().mo4726a(f3178j, "Unregistering network callback", new Throwable[0]);
                this.f3179g.unregisterNetworkCallback(this.f3180h);
            } catch (IllegalArgumentException e) {
                C0834i.m3720a().mo4727b(f3178j, "Received exception while unregistering network callback", e);
            }
        } else {
            C0834i.m3720a().mo4726a(f3178j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f3172b.unregisterReceiver(this.f3181i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0875b mo4858d() {
        NetworkInfo activeNetworkInfo = this.f3179g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean e = m3955e();
        boolean a = C4969a.m8802a(this.f3179g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new C0875b(z2, e, a, z);
    }

    /* renamed from: a */
    public C0875b m3958a() {
        return mo4858d();
    }
}
