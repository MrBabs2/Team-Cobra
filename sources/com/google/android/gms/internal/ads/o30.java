package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzsh;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
final class o30<T extends zzsh> extends Handler implements Runnable {

    /* renamed from: f */
    private final T f16420f;

    /* renamed from: g */
    private final zzsf<T> f16421g;

    /* renamed from: h */
    public final int f16422h;

    /* renamed from: i */
    private final long f16423i;

    /* renamed from: j */
    private IOException f16424j;

    /* renamed from: k */
    private int f16425k;

    /* renamed from: l */
    private volatile Thread f16426l;

    /* renamed from: m */
    private volatile boolean f16427m;

    /* renamed from: n */
    private final /* synthetic */ zzse f16428n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o30(zzse zzse, Looper looper, T t, zzsf<T> zzsf, int i, long j) {
        super(looper);
        this.f16428n = zzse;
        this.f16420f = t;
        this.f16421g = zzsf;
        this.f16422h = i;
        this.f16423i = j;
    }

    /* renamed from: b */
    private final void m17722b() {
        o30 unused = this.f16428n.f22643b = null;
    }

    /* renamed from: a */
    public final void mo26337a(int i) throws IOException {
        IOException iOException = this.f16424j;
        if (iOException != null && this.f16425k > i) {
            throw iOException;
        }
    }

    public final void handleMessage(Message message) {
        int i;
        if (!this.f16427m) {
            int i2 = message.what;
            if (i2 == 0) {
                m17721a();
            } else if (i2 != 4) {
                m17722b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f16423i;
                if (this.f16420f.mo25856a()) {
                    this.f16421g.mo26868a(this.f16420f, elapsedRealtime, j, false);
                    return;
                }
                int i3 = message.what;
                if (i3 == 1) {
                    this.f16421g.mo26868a(this.f16420f, elapsedRealtime, j, false);
                } else if (i3 == 2) {
                    this.f16421g.mo26867a(this.f16420f, elapsedRealtime, j);
                } else if (i3 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f16424j = iOException;
                    int a = this.f16421g.mo26863a(this.f16420f, elapsedRealtime, j, iOException);
                    if (a == 3) {
                        IOException unused = this.f16428n.f22644c = this.f16424j;
                    } else if (a != 2) {
                        if (a == 1) {
                            i = 1;
                        } else {
                            i = this.f16425k + 1;
                        }
                        this.f16425k = i;
                        mo26338a((long) Math.min((i - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.f16426l = Thread.currentThread();
            if (!this.f16420f.mo25856a()) {
                String valueOf = String.valueOf(this.f16420f.getClass().getSimpleName());
                zzsx.m25278a(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                this.f16420f.mo25858c();
                zzsx.m25277a();
            }
            if (!this.f16427m) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f16427m) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            zzsk.m25218b(this.f16420f.mo25856a());
            if (!this.f16427m) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.f16427m) {
                obtainMessage(3, new zzsi(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.f16427m) {
                obtainMessage(3, new zzsi(e3)).sendToTarget();
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.f16427m) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            zzsx.m25277a();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo26338a(long j) {
        zzsk.m25218b(this.f16428n.f22643b == null);
        o30 unused = this.f16428n.f22643b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m17721a();
        }
    }

    /* renamed from: a */
    public final void mo26339a(boolean z) {
        this.f16427m = z;
        this.f16424j = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f16420f.mo25857b();
            if (this.f16426l != null) {
                this.f16426l.interrupt();
            }
        }
        if (z) {
            m17722b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f16421g.mo26868a(this.f16420f, elapsedRealtime, elapsedRealtime - this.f16423i, true);
        }
    }

    /* renamed from: a */
    private final void m17721a() {
        this.f16424j = null;
        this.f16428n.f22642a.execute(this.f16428n.f22643b);
    }
}
