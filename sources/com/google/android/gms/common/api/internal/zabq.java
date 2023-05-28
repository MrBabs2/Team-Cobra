package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {

    /* renamed from: a */
    private Context f13933a;

    /* renamed from: b */
    private final zabr f13934b;

    public zabq(zabr zabr) {
        this.f13934b = zabr;
    }

    /* renamed from: a */
    public final void mo25174a(Context context) {
        this.f13933a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f13934b.mo25118a();
            mo25173a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo25173a() {
        if (this.f13933a != null) {
            this.f13933a.unregisterReceiver(this);
        }
        this.f13933a = null;
    }
}
