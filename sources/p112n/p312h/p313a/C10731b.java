package p112n.p312h.p313a;

import android.os.SystemClock;

/* renamed from: n.h.a.b */
/* compiled from: DownloadSpeedMonitor */
public class C10731b implements C10796r {

    /* renamed from: a */
    private long f28760a;

    /* renamed from: b */
    private long f28761b;

    /* renamed from: c */
    private long f28762c;

    /* renamed from: d */
    private long f28763d;

    /* renamed from: e */
    private int f28764e;

    /* renamed from: f */
    private long f28765f;

    /* renamed from: g */
    private int f28766g = 5;

    /* renamed from: a */
    public void mo36449a(long j) {
        if (this.f28763d > 0) {
            long j2 = this.f28762c;
            if (j2 > 0) {
                long j3 = j - j2;
                this.f28760a = 0;
                long uptimeMillis = SystemClock.uptimeMillis() - this.f28763d;
                if (uptimeMillis < 0) {
                    this.f28764e = (int) j3;
                } else {
                    this.f28764e = (int) (j3 / uptimeMillis);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo36450b(long j) {
        if (this.f28766g > 0) {
            boolean z = true;
            if (this.f28760a != 0) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f28760a;
                if (uptimeMillis >= ((long) this.f28766g) || (this.f28764e == 0 && uptimeMillis > 0)) {
                    int i = (int) ((j - this.f28761b) / uptimeMillis);
                    this.f28764e = i;
                    this.f28764e = Math.max(0, i);
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f28761b = j;
                this.f28760a = SystemClock.uptimeMillis();
            }
        }
    }

    public void start() {
        this.f28763d = SystemClock.uptimeMillis();
        this.f28762c = this.f28765f;
    }

    /* renamed from: a */
    public void mo36448a() {
        this.f28764e = 0;
        this.f28760a = 0;
    }
}
