package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

/* renamed from: com.google.android.gms.common.api.internal.u */
final class C7206u extends zap {

    /* renamed from: a */
    private final /* synthetic */ zaaw f13848a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7206u(zaaw zaaw, Looper looper) {
        super(looper);
        this.f13848a = zaaw;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f13848a.m15698q();
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            this.f13848a.m15696o();
        }
    }
}
