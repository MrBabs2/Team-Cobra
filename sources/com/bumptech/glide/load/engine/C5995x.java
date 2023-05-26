package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.engine.x */
/* compiled from: ResourceRecycler */
class C5995x {

    /* renamed from: a */
    private boolean f11043a;

    /* renamed from: b */
    private final Handler f11044b = new Handler(Looper.getMainLooper(), new C5996a());

    /* renamed from: com.bumptech.glide.load.engine.x$a */
    /* compiled from: ResourceRecycler */
    private static final class C5996a implements Handler.Callback {
        C5996a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C5992u) message.obj).mo20235a();
            return true;
        }
    }

    C5995x() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo20253a(C5992u<?> uVar) {
        if (this.f11043a) {
            this.f11044b.obtainMessage(1, uVar).sendToTarget();
        } else {
            this.f11043a = true;
            uVar.mo20235a();
            this.f11043a = false;
        }
    }
}
