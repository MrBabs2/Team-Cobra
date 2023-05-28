package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

final class w30 implements Handler.Callback, Choreographer.FrameCallback {

    /* renamed from: k */
    private static final w30 f17060k = new w30();

    /* renamed from: f */
    public volatile long f17061f;

    /* renamed from: g */
    private final Handler f17062g;

    /* renamed from: h */
    private final HandlerThread f17063h;

    /* renamed from: i */
    private Choreographer f17064i;

    /* renamed from: j */
    private int f17065j;

    private w30() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f17063h = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f17063h.getLooper(), this);
        this.f17062g = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: c */
    public static w30 m18356c() {
        return f17060k;
    }

    /* renamed from: a */
    public final void mo26723a() {
        this.f17062g.sendEmptyMessage(1);
    }

    /* renamed from: b */
    public final void mo26724b() {
        this.f17062g.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f17061f = j;
        this.f17064i.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f17064i = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f17065j + 1;
            this.f17065j = i2;
            if (i2 == 1) {
                this.f17064i.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f17065j - 1;
            this.f17065j = i3;
            if (i3 == 0) {
                this.f17064i.removeFrameCallback(this);
                this.f17061f = 0;
            }
            return true;
        }
    }
}
