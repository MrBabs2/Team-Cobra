package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

/* renamed from: com.google.android.gms.common.api.internal.x */
final class C7212x extends zap {

    /* renamed from: a */
    private final /* synthetic */ zabe f13853a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7212x(zabe zabe, Looper looper) {
        super(looper);
        this.f13853a = zabe;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C7210w) message.obj).mo25138a(this.f13853a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
