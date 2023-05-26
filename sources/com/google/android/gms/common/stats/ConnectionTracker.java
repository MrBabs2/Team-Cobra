package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.Collections;
import java.util.List;

@KeepForSdk
public class ConnectionTracker {

    /* renamed from: a */
    private static final Object f14246a = new Object();

    /* renamed from: b */
    private static volatile ConnectionTracker f14247b;

    private ConnectionTracker() {
        List list = Collections.EMPTY_LIST;
    }

    @KeepForSdk
    /* renamed from: a */
    public static ConnectionTracker m16228a() {
        if (f14247b == null) {
            synchronized (f14246a) {
                if (f14247b == null) {
                    f14247b = new ConnectionTracker();
                }
            }
        }
        return f14247b;
    }

    /* renamed from: a */
    public final boolean mo25488a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = ClientLibraryUtils.m16253c(context, component.getPackageName());
        }
        if (!z) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo25487a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo25488a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    @KeepForSdk
    /* renamed from: a */
    public void mo25486a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
