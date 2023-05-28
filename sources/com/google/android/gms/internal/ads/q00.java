package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class q00 extends Handler {

    /* renamed from: a */
    private final /* synthetic */ p00 f16625a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q00(p00 p00, Looper looper) {
        super(looper);
        this.f16625a = p00;
    }

    public final void handleMessage(Message message) {
        this.f16625a.mo26383a(message);
    }
}
