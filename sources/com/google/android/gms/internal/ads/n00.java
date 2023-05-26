package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
final class n00 extends Handler implements Runnable {

    /* renamed from: f */
    private final zzkc f16264f;

    /* renamed from: g */
    private final zzka f16265g;

    /* renamed from: h */
    private final int f16266h = 0;

    /* renamed from: i */
    private volatile Thread f16267i;

    /* renamed from: j */
    private final /* synthetic */ zzjz f16268j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n00(zzjz zzjz, Looper looper, zzkc zzkc, zzka zzka, int i) {
        super(looper);
        this.f16268j = zzjz;
        this.f16264f = zzkc;
        this.f16265g = zzka;
    }

    /* renamed from: a */
    public final void mo26299a() {
        this.f16264f.mo26528b();
        if (this.f16267i != null) {
            this.f16267i.interrupt();
        }
    }

    public final void handleMessage(Message message) {
        if (message.what != 2) {
            boolean unused = this.f16268j.f22142c = false;
            n00 unused2 = this.f16268j.f22141b = null;
            if (this.f16264f.mo26527a()) {
                this.f16265g.mo29392b(this.f16264f);
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f16265g.mo29390a(this.f16264f);
            } else if (i == 1) {
                this.f16265g.mo29391a(this.f16264f, (IOException) message.obj);
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    public final void run() {
        try {
            this.f16267i = Thread.currentThread();
            if (this.f16266h > 0) {
                Thread.sleep((long) this.f16266h);
            }
            if (!this.f16264f.mo26527a()) {
                this.f16264f.mo26529c();
            }
            sendEmptyMessage(0);
        } catch (IOException e) {
            obtainMessage(1, e).sendToTarget();
        } catch (InterruptedException unused) {
            zzkh.m24659b(this.f16264f.mo26527a());
            sendEmptyMessage(0);
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(1, new zzkd(e2)).sendToTarget();
        } catch (Error e3) {
            Log.e("LoadTask", "Unexpected error loading stream", e3);
            obtainMessage(2, e3).sendToTarget();
            throw e3;
        }
    }
}
