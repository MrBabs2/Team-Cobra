package com.bumptech.glide.p159m;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0394a;
import com.bumptech.glide.p159m.C6232c;

/* renamed from: com.bumptech.glide.m.f */
/* compiled from: DefaultConnectivityMonitorFactory */
public class C6237f implements C6234d {
    /* renamed from: a */
    public C6232c mo20562a(Context context, C6232c.C6233a aVar) {
        boolean z = C0394a.m1910a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new C6235e(context, aVar) : new C6241j();
    }
}
